package p066b.p067a.p068a.p069a.p077h0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: b.a.a.a.h0.e */
public class C0982e {

    /* renamed from: e */
    public static C0982e f4015e;

    /* renamed from: a */
    public final Object f4016a = new Object();

    /* renamed from: b */
    public final Handler f4017b = new Handler(Looper.getMainLooper(), new C0983a());

    /* renamed from: c */
    public C0985c f4018c;

    /* renamed from: d */
    public C0985c f4019d;

    /* renamed from: b.a.a.a.h0.e$b */
    public interface C0984b {
        /* renamed from: a */
        void mo5746a(int i);
    }

    /* renamed from: b */
    public static C0982e m5308b() {
        if (f4015e == null) {
            f4015e = new C0982e();
        }
        return f4015e;
    }

    /* renamed from: b.a.a.a.h0.e$a */
    public class C0983a implements Handler.Callback {
        public C0983a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0982e.this.mo5740c((C0985c) message.obj);
            return true;
        }
    }

    /* renamed from: e */
    public void mo5742e(C0984b callback) {
        synchronized (this.f4016a) {
            if (mo5741d(callback)) {
                C0985c cVar = this.f4018c;
                if (!cVar.f4023c) {
                    cVar.f4023c = true;
                    this.f4017b.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo5743f(C0984b callback) {
        synchronized (this.f4016a) {
            if (mo5741d(callback)) {
                C0985c cVar = this.f4018c;
                if (cVar.f4023c) {
                    cVar.f4023c = false;
                    mo5744g(cVar);
                }
            }
        }
    }

    /* renamed from: b.a.a.a.h0.e$c */
    public static class C0985c {

        /* renamed from: a */
        public final WeakReference<C0984b> f4021a;

        /* renamed from: b */
        public int f4022b;

        /* renamed from: c */
        public boolean f4023c;

        /* renamed from: a */
        public boolean mo5747a(C0984b callback) {
            return callback != null && this.f4021a.get() == callback;
        }
    }

    /* renamed from: a */
    public final boolean mo5739a(C0985c record, int event) {
        C0984b callback = (C0984b) record.f4021a.get();
        if (callback == null) {
            return false;
        }
        this.f4017b.removeCallbacksAndMessages(record);
        callback.mo5746a(event);
        return true;
    }

    /* renamed from: d */
    public final boolean mo5741d(C0984b callback) {
        C0985c cVar = this.f4018c;
        return cVar != null && cVar.mo5747a(callback);
    }

    /* renamed from: g */
    public final void mo5744g(C0985c r) {
        int i = r.f4022b;
        if (i != -2) {
            int durationMs = 2750;
            if (i > 0) {
                durationMs = r.f4022b;
            } else if (i == -1) {
                durationMs = 1500;
            }
            this.f4017b.removeCallbacksAndMessages(r);
            Handler handler = this.f4017b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, r), (long) durationMs);
        }
    }

    /* renamed from: c */
    public void mo5740c(C0985c record) {
        synchronized (this.f4016a) {
            if (this.f4018c == record || this.f4019d == record) {
                mo5739a(record, 2);
            }
        }
    }
}
