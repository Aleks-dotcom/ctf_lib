package p000a.p025h.p035j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.h.j.c */
public class C0390c {

    /* renamed from: a */
    public final Object f1921a = new Object();

    /* renamed from: b */
    public HandlerThread f1922b;

    /* renamed from: c */
    public Handler f1923c;

    /* renamed from: d */
    public int f1924d;

    /* renamed from: e */
    public Handler.Callback f1925e = new C0391a();

    /* renamed from: f */
    public final int f1926f;

    /* renamed from: g */
    public final int f1927g;

    /* renamed from: h */
    public final String f1928h;

    /* renamed from: a.h.j.c$d */
    public interface C0395d<T> {
        /* renamed from: a */
        void mo2345a(T t);
    }

    /* renamed from: a.h.j.c$a */
    public class C0391a implements Handler.Callback {
        public C0391a() {
        }

        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                C0390c.this.mo2357a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0390c.this.mo2358b((Runnable) msg.obj);
                return true;
            }
        }
    }

    public C0390c(String threadName, int priority, int destructAfterMillisec) {
        this.f1928h = threadName;
        this.f1927g = priority;
        this.f1926f = destructAfterMillisec;
        this.f1924d = 0;
    }

    /* renamed from: c */
    public final void mo2359c(Runnable runnable) {
        synchronized (this.f1921a) {
            if (this.f1922b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f1928h, this.f1927g);
                this.f1922b = handlerThread;
                handlerThread.start();
                this.f1923c = new Handler(this.f1922b.getLooper(), this.f1925e);
                this.f1924d++;
            }
            this.f1923c.removeMessages(0);
            Handler handler = this.f1923c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a.h.j.c$b */
    public class C0392b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Callable f1930b;

        /* renamed from: c */
        public final /* synthetic */ Handler f1931c;

        /* renamed from: d */
        public final /* synthetic */ C0395d f1932d;

        public C0392b(C0390c this$0, Callable callable, Handler handler, C0395d dVar) {
            this.f1930b = callable;
            this.f1931c = handler;
            this.f1932d = dVar;
        }

        public void run() {
            T t;
            try {
                t = this.f1930b.call();
            } catch (Exception e) {
                t = null;
            }
            this.f1931c.post(new C0393a(t));
        }

        /* renamed from: a.h.j.c$b$a */
        public class C0393a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Object f1933b;

            public C0393a(Object obj) {
                this.f1933b = obj;
            }

            public void run() {
                C0392b.this.f1932d.mo2345a(this.f1933b);
            }
        }
    }

    /* renamed from: d */
    public <T> void mo2360d(Callable<T> callable, C0395d<T> reply) {
        mo2359c(new C0392b(this, callable, new Handler(), reply));
    }

    /* renamed from: e */
    public <T> T mo2361e(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        mo2359c(new C0394c(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos((long) timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e) {
                }
                if (!running.get()) {
                    T t = holder.get();
                    lock.unlock();
                    return t;
                }
            } while (remaining > 0);
            throw new InterruptedException("timeout");
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: a.h.j.c$c */
    public class C0394c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f1935b;

        /* renamed from: c */
        public final /* synthetic */ Callable f1936c;

        /* renamed from: d */
        public final /* synthetic */ ReentrantLock f1937d;

        /* renamed from: e */
        public final /* synthetic */ AtomicBoolean f1938e;

        /* renamed from: f */
        public final /* synthetic */ Condition f1939f;

        public C0394c(C0390c this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f1935b = atomicReference;
            this.f1936c = callable;
            this.f1937d = reentrantLock;
            this.f1938e = atomicBoolean;
            this.f1939f = condition;
        }

        public void run() {
            try {
                this.f1935b.set(this.f1936c.call());
            } catch (Exception e) {
            }
            this.f1937d.lock();
            try {
                this.f1938e.set(false);
                this.f1939f.signal();
            } finally {
                this.f1937d.unlock();
            }
        }
    }

    /* renamed from: b */
    public void mo2358b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1921a) {
            this.f1923c.removeMessages(0);
            Handler handler = this.f1923c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long) this.f1926f);
        }
    }

    /* renamed from: a */
    public void mo2357a() {
        synchronized (this.f1921a) {
            if (!this.f1923c.hasMessages(1)) {
                this.f1922b.quit();
                this.f1922b = null;
                this.f1923c = null;
            }
        }
    }
}
