package p066b.p067a.p068a.p069a.p073d0;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: b.a.a.a.d0.b */
public class C0931b {
    /* renamed from: a */
    public static TypedValue m5069a(Context context, int attributeResId) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(attributeResId, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: c */
    public static int m5071c(Context context, int attributeResId, String errorMessageComponent) {
        TypedValue typedValue = m5069a(context, attributeResId);
        if (typedValue != null) {
            return typedValue.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{errorMessageComponent, context.getResources().getResourceName(attributeResId)}));
    }

    /* renamed from: d */
    public static int m5072d(View componentView, int attributeResId) {
        return m5071c(componentView.getContext(), attributeResId, componentView.getClass().getCanonicalName());
    }

    /* renamed from: b */
    public static boolean m5070b(Context context, int attributeResId, boolean defaultValue) {
        TypedValue typedValue = m5069a(context, attributeResId);
        if (typedValue == null || typedValue.type != 18) {
            return defaultValue;
        }
        return typedValue.data != 0;
    }
}
