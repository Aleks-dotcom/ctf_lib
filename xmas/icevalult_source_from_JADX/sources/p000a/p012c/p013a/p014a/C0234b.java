package p000a.p012c.p013a.p014a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.c.a.a.b */
public class C0234b extends C0236c {

    /* renamed from: a */
    public final Object f1144a = new Object();

    /* renamed from: b */
    public final ExecutorService f1145b = Executors.newFixedThreadPool(2, new C0235a(this));

    /* renamed from: c */
    public volatile Handler f1146c;

    /* renamed from: a.c.a.a.b$a */
    public class C0235a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f1147a = new AtomicInteger(0);

        public C0235a(C0234b this$0) {
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f1147a.getAndIncrement())}));
            return t;
        }
    }

    /* renamed from: a */
    public void mo1616a(Runnable runnable) {
        this.f1145b.execute(runnable);
    }

    /* renamed from: c */
    public void mo1618c(Runnable runnable) {
        if (this.f1146c == null) {
            synchronized (this.f1144a) {
                if (this.f1146c == null) {
                    this.f1146c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f1146c.post(runnable);
    }

    /* renamed from: b */
    public boolean mo1617b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
