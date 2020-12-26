package p000a.p058q;

import android.os.IBinder;

/* renamed from: a.q.k0 */
public class C0703k0 implements C0713m0 {

    /* renamed from: a */
    public final IBinder f2677a;

    public C0703k0(IBinder token) {
        this.f2677a = token;
    }

    public boolean equals(Object o) {
        return (o instanceof C0703k0) && ((C0703k0) o).f2677a.equals(this.f2677a);
    }

    public int hashCode() {
        return this.f2677a.hashCode();
    }
}
