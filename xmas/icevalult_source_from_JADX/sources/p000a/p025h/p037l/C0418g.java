package p000a.p025h.p037l;

/* renamed from: a.h.l.g */
public class C0418g<T> extends C0417f<T> {

    /* renamed from: c */
    public final Object f1987c = new Object();

    public C0418g(int maxPoolSize) {
        super(maxPoolSize);
    }

    /* renamed from: b */
    public T mo2417b() {
        T b;
        synchronized (this.f1987c) {
            b = super.mo2417b();
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo2416a(T element) {
        boolean a;
        synchronized (this.f1987c) {
            a = super.mo2416a(element);
        }
        return a;
    }
}
