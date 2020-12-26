package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.a.a.a.g0.a */
public final class C0947a implements C0949c {

    /* renamed from: a */
    public final float f3895a;

    public C0947a(float size) {
        this.f3895a = size;
    }

    /* renamed from: a */
    public float mo5562a(RectF bounds) {
        return this.f3895a;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o instanceof C0947a) && this.f3895a == ((C0947a) o).f3895a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3895a)});
    }
}
