package p000a.p058q;

import android.view.View;
import android.view.WindowId;

/* renamed from: a.q.l0 */
public class C0705l0 implements C0713m0 {

    /* renamed from: a */
    public final WindowId f2680a;

    public C0705l0(View view) {
        this.f2680a = view.getWindowId();
    }

    public boolean equals(Object o) {
        return (o instanceof C0705l0) && ((C0705l0) o).f2680a.equals(this.f2680a);
    }

    public int hashCode() {
        return this.f2680a.hashCode();
    }
}
