package p066b.p067a.p068a.p069a.p081l;

import android.animation.TypeEvaluator;

/* renamed from: b.a.a.a.l.c */
public class C1025c implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final C1025c f4317a = new C1025c();

    /* renamed from: b */
    public static C1025c m5422b() {
        return f4317a;
    }

    /* renamed from: a */
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int startInt = startValue.intValue();
        float startA = ((float) ((startInt >> 24) & 255)) / 255.0f;
        int endInt = endValue.intValue();
        float startR = (float) Math.pow((double) (((float) ((startInt >> 16) & 255)) / 255.0f), 2.2d);
        float startG = (float) Math.pow((double) (((float) ((startInt >> 8) & 255)) / 255.0f), 2.2d);
        float startB = (float) Math.pow((double) (((float) (startInt & 255)) / 255.0f), 2.2d);
        float f = startR;
        int i = startInt;
        float f2 = startA;
        float r = startG;
        float g = startB;
        return Integer.valueOf((Math.round(((((((float) ((endInt >> 24) & 255)) / 255.0f) - startA) * fraction) + startA) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 16) & 255)) / 255.0f), 2.2d)) - startR) * fraction) + startR), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 8) & 255)) / 255.0f), 2.2d)) - startG) * fraction) + startG), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) (endInt & 255)) / 255.0f), 2.2d)) - startB) * fraction) + startB), 0.45454545454545453d)) * 255.0f));
    }
}
