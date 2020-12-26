package p000a.p012c.p013a.p014a;

import java.util.concurrent.Executor;

/* renamed from: a.c.a.a.a */
public class C0231a extends C0236c {

    /* renamed from: c */
    public static volatile C0231a f1141c;

    /* renamed from: a */
    public C0236c f1142a;

    /* renamed from: b */
    public C0236c f1143b;

    static {
        new C0232a();
        new C0233b();
    }

    /* renamed from: a.c.a.a.a$a */
    public static class C0232a implements Executor {
        public void execute(Runnable command) {
            C0231a.m1194d().mo1618c(command);
        }
    }

    /* renamed from: a.c.a.a.a$b */
    public static class C0233b implements Executor {
        public void execute(Runnable command) {
            C0231a.m1194d().mo1616a(command);
        }
    }

    public C0231a() {
        C0234b bVar = new C0234b();
        this.f1143b = bVar;
        this.f1142a = bVar;
    }

    /* renamed from: d */
    public static C0231a m1194d() {
        if (f1141c != null) {
            return f1141c;
        }
        synchronized (C0231a.class) {
            if (f1141c == null) {
                f1141c = new C0231a();
            }
        }
        return f1141c;
    }

    /* renamed from: a */
    public void mo1616a(Runnable runnable) {
        this.f1142a.mo1616a(runnable);
    }

    /* renamed from: c */
    public void mo1618c(Runnable runnable) {
        this.f1142a.mo1618c(runnable);
    }

    /* renamed from: b */
    public boolean mo1617b() {
        return this.f1142a.mo1617b();
    }
}
