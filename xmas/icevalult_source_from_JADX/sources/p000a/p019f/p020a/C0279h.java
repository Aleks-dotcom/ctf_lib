package p000a.p019f.p020a;

/* renamed from: a.f.a.h */
public class C0279h<T> implements C0278g<T> {

    /* renamed from: a */
    public final Object[] f1317a;

    /* renamed from: b */
    public int f1318b;

    public C0279h(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f1317a = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    public T mo1984b() {
        int i = this.f1318b;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        T[] tArr = this.f1317a;
        T instance = tArr[lastPooledIndex];
        tArr[lastPooledIndex] = null;
        this.f1318b = i - 1;
        return instance;
    }

    /* renamed from: a */
    public boolean mo1983a(T instance) {
        int i = this.f1318b;
        Object[] objArr = this.f1317a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.f1318b = i + 1;
        return true;
    }

    /* renamed from: c */
    public void mo1985c(T[] variables, int count) {
        if (count > variables.length) {
            count = variables.length;
        }
        for (int i = 0; i < count; i++) {
            T instance = variables[i];
            int i2 = this.f1318b;
            Object[] objArr = this.f1317a;
            if (i2 < objArr.length) {
                objArr[i2] = instance;
                this.f1318b = i2 + 1;
            }
        }
    }
}
