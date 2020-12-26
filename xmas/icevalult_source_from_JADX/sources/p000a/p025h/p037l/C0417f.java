package p000a.p025h.p037l;

/* renamed from: a.h.l.f */
public class C0417f<T> implements C0416e<T> {

    /* renamed from: a */
    public final Object[] f1985a;

    /* renamed from: b */
    public int f1986b;

    public C0417f(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f1985a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    public T mo2417b() {
        int i = this.f1986b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        T[] tArr = this.f1985a;
        T instance = tArr[lastPooledIndex];
        tArr[lastPooledIndex] = null;
        this.f1986b = i - 1;
        return instance;
    }

    /* renamed from: a */
    public boolean mo2416a(T instance) {
        if (!mo2418c(instance)) {
            int i = this.f1986b;
            Object[] objArr = this.f1985a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = instance;
            this.f1986b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: c */
    public final boolean mo2418c(T instance) {
        for (int i = 0; i < this.f1986b; i++) {
            if (this.f1985a[i] == instance) {
                return true;
            }
        }
        return false;
    }
}
