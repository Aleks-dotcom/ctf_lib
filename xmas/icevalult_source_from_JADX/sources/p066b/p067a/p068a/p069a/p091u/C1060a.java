package p066b.p067a.p068a.p069a.p091u;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p000a.p025h.p029f.C0356a;
import p066b.p067a.p068a.p069a.p073d0.C0931b;

/* renamed from: b.a.a.a.u.a */
public class C1060a {
    /* renamed from: c */
    public static int m5721c(View view, int colorAttributeResId) {
        return C0931b.m5072d(view, colorAttributeResId);
    }

    /* renamed from: b */
    public static int m5720b(Context context, int colorAttributeResId, String errorMessageComponent) {
        return C0931b.m5071c(context, colorAttributeResId, errorMessageComponent);
    }

    /* renamed from: d */
    public static int m5722d(View view, int colorAttributeResId, int defaultValue) {
        return m5719a(view.getContext(), colorAttributeResId, defaultValue);
    }

    /* renamed from: a */
    public static int m5719a(Context context, int colorAttributeResId, int defaultValue) {
        TypedValue typedValue = C0931b.m5069a(context, colorAttributeResId);
        if (typedValue != null) {
            return typedValue.data;
        }
        return defaultValue;
    }

    /* renamed from: f */
    public static int m5724f(int backgroundColor, int overlayColor, float overlayAlpha) {
        return m5723e(backgroundColor, C0356a.m1849d(overlayColor, Math.round(((float) Color.alpha(overlayColor)) * overlayAlpha)));
    }

    /* renamed from: e */
    public static int m5723e(int backgroundColor, int overlayColor) {
        return C0356a.m1847b(overlayColor, backgroundColor);
    }
}
