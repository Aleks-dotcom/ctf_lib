package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.a.a.a.g0.b */
public final class C0948b implements C0949c {

    /* renamed from: a */
    public final C0949c f3896a;

    /* renamed from: b */
    public final float f3897b;

    public C0948b(float adjustment, C0949c other) {
        while (other instanceof C0948b) {
            other = ((C0948b) other).f3896a;
            adjustment += ((C0948b) other).f3897b;
        }
        this.f3896a = other;
        this.f3897b = adjustment;
    }

    /* renamed from: a */
    public float mo5562a(RectF bounds) {
        return Math.max(0.0f, this.f3896a.mo5562a(bounds) + this.f3897b);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C0948b)) {
            return false;
        }
        C0948b that = (C0948b) o;
        if (!this.f3896a.equals(that.f3896a) || this.f3897b != that.f3897b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3896a, Float.valueOf(this.f3897b)});
    }
}
