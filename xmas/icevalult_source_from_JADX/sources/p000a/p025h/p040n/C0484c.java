package p000a.p025h.p040n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: a.h.n.c */
public final class C0484c {

    /* renamed from: a */
    public static Field f2089a;

    /* renamed from: b */
    public static boolean f2090b;

    /* renamed from: c */
    public static void m2412c(CompoundButton button, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintList(tint);
        } else if (button instanceof C0492j) {
            ((C0492j) button).setSupportButtonTintList(tint);
        }
    }

    /* renamed from: b */
    public static ColorStateList m2411b(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 21) {
            return button.getButtonTintList();
        }
        if (button instanceof C0492j) {
            return ((C0492j) button).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: d */
    public static void m2413d(CompoundButton button, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            button.setButtonTintMode(tintMode);
        } else if (button instanceof C0492j) {
            ((C0492j) button).setSupportButtonTintMode(tintMode);
        }
    }

    /* renamed from: a */
    public static Drawable m2410a(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f2090b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2089a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2090b = true;
        }
        Field field = f2089a;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2089a = null;
            }
        }
        return null;
    }
}
