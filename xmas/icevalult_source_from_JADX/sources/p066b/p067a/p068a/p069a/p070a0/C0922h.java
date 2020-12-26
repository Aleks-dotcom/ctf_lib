package p066b.p067a.p068a.p069a.p070a0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p000a.p025h.p038m.C0460r;

/* renamed from: b.a.a.a.a0.h */
public class C0922h {
    /* renamed from: c */
    public static PorterDuff.Mode m5058c(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    /* renamed from: a */
    public static float m5056a(Context context, int dp) {
        return TypedValue.applyDimension(1, (float) dp, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static float m5057b(View view) {
        float absoluteElevation = 0.0f;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            absoluteElevation += C0460r.m2284q((View) viewParent);
        }
        return absoluteElevation;
    }
}
