package p066b.p067a.p068a.p069a.p089t;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p066b.p067a.p068a.p069a.p071b0.C0925a;

/* renamed from: b.a.a.a.t.d */
public interface C1053d {
    /* renamed from: a */
    void mo6154a();

    /* renamed from: b */
    void mo6155b();

    int getCircularRevealScrimColor();

    C1058e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C1058e eVar);

    /* renamed from: b.a.a.a.t.d$e */
    public static class C1058e {

        /* renamed from: a */
        public float f4465a;

        /* renamed from: b */
        public float f4466b;

        /* renamed from: c */
        public float f4467c;

        public C1058e() {
        }

        public C1058e(float centerX, float centerY, float radius) {
            this.f4465a = centerX;
            this.f4466b = centerY;
            this.f4467c = radius;
        }

        /* renamed from: a */
        public void mo6184a(float centerX, float centerY, float radius) {
            this.f4465a = centerX;
            this.f4466b = centerY;
            this.f4467c = radius;
        }
    }

    /* renamed from: b.a.a.a.t.d$c */
    public static class C1056c extends Property<C1053d, C1058e> {

        /* renamed from: a */
        public static final Property<C1053d, C1058e> f4463a = new C1056c("circularReveal");

        public C1056c(String name) {
            super(C1058e.class, name);
        }

        /* renamed from: a */
        public C1058e get(C1053d object) {
            return object.getRevealInfo();
        }

        /* renamed from: b */
        public void set(C1053d object, C1058e value) {
            object.setRevealInfo(value);
        }
    }

    /* renamed from: b.a.a.a.t.d$b */
    public static class C1055b implements TypeEvaluator<C1058e> {

        /* renamed from: b */
        public static final TypeEvaluator<C1058e> f4461b = new C1055b();

        /* renamed from: a */
        public final C1058e f4462a = new C1058e();

        /* renamed from: a */
        public C1058e evaluate(float fraction, C1058e startValue, C1058e endValue) {
            this.f4462a.mo6184a(C0925a.m5062c(startValue.f4465a, endValue.f4465a, fraction), C0925a.m5062c(startValue.f4466b, endValue.f4466b, fraction), C0925a.m5062c(startValue.f4467c, endValue.f4467c, fraction));
            return this.f4462a;
        }
    }

    /* renamed from: b.a.a.a.t.d$d */
    public static class C1057d extends Property<C1053d, Integer> {

        /* renamed from: a */
        public static final Property<C1053d, Integer> f4464a = new C1057d("circularRevealScrimColor");

        public C1057d(String name) {
            super(Integer.class, name);
        }

        /* renamed from: a */
        public Integer get(C1053d object) {
            return Integer.valueOf(object.getCircularRevealScrimColor());
        }

        /* renamed from: b */
        public void set(C1053d object, Integer value) {
            object.setCircularRevealScrimColor(value.intValue());
        }
    }
}
