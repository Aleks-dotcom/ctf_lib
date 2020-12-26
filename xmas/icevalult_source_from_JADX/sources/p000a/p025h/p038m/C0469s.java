package p000a.p025h.p038m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: a.h.m.s */
public final class C0469s {

    /* renamed from: a */
    public static Method f2046a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2046a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: b */
    public static float m2334b(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledHorizontalScrollFactor();
        }
        return m2333a(config, context);
    }

    /* renamed from: d */
    public static float m2336d(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return config.getScaledVerticalScrollFactor();
        }
        return m2333a(config, context);
    }

    /* renamed from: a */
    public static float m2333a(ViewConfiguration config, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2046a) != null) {
            try {
                return (float) ((Integer) method.invoke(config, new Object[0])).intValue();
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue outValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
            return outValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m2335c(ViewConfiguration config) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.getScaledHoverSlop();
        }
        return config.getScaledTouchSlop() / 2;
    }

    /* renamed from: e */
    public static boolean m2337e(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources res = context.getResources();
        int platformResId = res.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return platformResId != 0 && res.getBoolean(platformResId);
    }
}
