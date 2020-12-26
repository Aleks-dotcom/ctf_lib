package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.a.a.a.g0.i */
public final class C0958i implements C0949c {

    /* renamed from: a */
    public final float f3945a;

    public C0958i(float percent) {
        this.f3945a = percent;
    }

    /* renamed from: a */
    public float mo5562a(RectF bounds) {
        return this.f3945a * bounds.height();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o instanceof C0958i) && this.f3945a == ((C0958i) o).f3945a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3945a)});
    }
}
