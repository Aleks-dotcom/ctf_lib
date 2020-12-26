package p000a.p058q;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.q.y */
public class C0729y {

    /* renamed from: a */
    public static LayoutTransition f2750a;

    /* renamed from: b */
    public static Field f2751b;

    /* renamed from: c */
    public static boolean f2752c;

    /* renamed from: d */
    public static Method f2753d;

    /* renamed from: e */
    public static boolean f2754e;

    /* renamed from: b */
    public static void m3562b(ViewGroup group, boolean suppress) {
        if (f2750a == null) {
            C0730a aVar = new C0730a();
            f2750a = aVar;
            aVar.setAnimator(2, (Animator) null);
            f2750a.setAnimator(0, (Animator) null);
            f2750a.setAnimator(1, (Animator) null);
            f2750a.setAnimator(3, (Animator) null);
            f2750a.setAnimator(4, (Animator) null);
        }
        if (suppress) {
            LayoutTransition layoutTransition = group.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m3561a(layoutTransition);
                }
                if (layoutTransition != f2750a) {
                    group.setTag(C0697j.transition_layout_save, layoutTransition);
                }
            }
            group.setLayoutTransition(f2750a);
            return;
        }
        group.setLayoutTransition((LayoutTransition) null);
        if (!f2752c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f2751b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
            }
            f2752c = true;
        }
        boolean layoutSuppressed = false;
        Field field = f2751b;
        if (field != null) {
            try {
                layoutSuppressed = field.getBoolean(group);
                if (layoutSuppressed) {
                    f2751b.setBoolean(group, false);
                }
            } catch (IllegalAccessException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
            }
        }
        if (layoutSuppressed) {
            group.requestLayout();
        }
        int i = C0697j.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) group.getTag(i);
        if (layoutTransition2 != null) {
            group.setTag(i, (Object) null);
            group.setLayoutTransition(layoutTransition2);
        }
    }

    /* renamed from: a.q.y$a */
    public static class C0730a extends LayoutTransition {
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    public static void m3561a(LayoutTransition t) {
        if (!f2754e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f2753d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f2754e = true;
        }
        Method method = f2753d;
        if (method != null) {
            try {
                method.invoke(t, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException e3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }
}
