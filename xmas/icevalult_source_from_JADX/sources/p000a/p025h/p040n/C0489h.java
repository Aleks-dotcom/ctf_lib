package p000a.p025h.p040n;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.h.n.h */
public final class C0489h {

    /* renamed from: a */
    public static Method f2092a;

    /* renamed from: b */
    public static boolean f2093b;

    /* renamed from: c */
    public static Field f2094c;

    /* renamed from: d */
    public static boolean f2095d;

    /* renamed from: c */
    public static void m2425c(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        if (Build.VERSION.SDK_INT >= 19) {
            popup.showAsDropDown(anchor, xoff, yoff, gravity);
            return;
        }
        int xoff1 = xoff;
        if ((C0444c.m2174b(gravity, C0460r.m2292v(anchor)) & 7) == 5) {
            xoff1 -= popup.getWidth() - anchor.getWidth();
        }
        popup.showAsDropDown(anchor, xoff1, yoff);
    }

    /* renamed from: a */
    public static void m2423a(PopupWindow popupWindow, boolean overlapAnchor) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(overlapAnchor);
        } else if (i >= 21) {
            if (!f2095d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2094c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2095d = true;
            }
            Field field = f2094c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(overlapAnchor));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m2424b(PopupWindow popupWindow, int layoutType) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(layoutType);
            return;
        }
        if (!f2093b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2092a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
            }
            f2093b = true;
        }
        Method method = f2092a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(layoutType)});
            } catch (Exception e2) {
            }
        }
    }
}
