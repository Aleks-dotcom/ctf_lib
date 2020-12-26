package p000a.p058q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.q.i0 */
public class C0696i0 {

    /* renamed from: a */
    public static Method f2654a;

    /* renamed from: b */
    public static boolean f2655b;

    /* renamed from: c */
    public static Field f2656c;

    /* renamed from: d */
    public static boolean f2657d;

    /* renamed from: f */
    public void mo3495f(View view, float alpha) {
        Float savedAlpha = (Float) view.getTag(C0697j.save_non_transition_alpha);
        if (savedAlpha != null) {
            view.setAlpha(savedAlpha.floatValue() * alpha);
        } else {
            view.setAlpha(alpha);
        }
    }

    /* renamed from: c */
    public float mo3493c(View view) {
        Float savedAlpha = (Float) view.getTag(C0697j.save_non_transition_alpha);
        if (savedAlpha != null) {
            return view.getAlpha() / savedAlpha.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo3494d(View view) {
        int i = C0697j.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo3492a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0697j.save_non_transition_alpha, (Object) null);
        }
    }

    /* renamed from: h */
    public void mo3497h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            mo3497h(vp, matrix);
            matrix.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            matrix.preConcat(vm);
        }
    }

    /* renamed from: i */
    public void mo3498i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View vp = (View) parent;
            mo3498i(vp, matrix);
            matrix.postTranslate((float) vp.getScrollX(), (float) vp.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix vm = view.getMatrix();
        if (!vm.isIdentity()) {
            Matrix inverted = new Matrix();
            if (vm.invert(inverted)) {
                matrix.postConcat(inverted);
            }
        }
    }

    /* renamed from: e */
    public void mo3499e(View v, int left, int top, int right, int bottom) {
        mo3506b();
        Method method = f2654a;
        if (method != null) {
            try {
                method.invoke(v, new Object[]{Integer.valueOf(left), Integer.valueOf(top), Integer.valueOf(right), Integer.valueOf(bottom)});
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    /* renamed from: g */
    public void mo3501g(View view, int visibility) {
        if (!f2657d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2656c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2657d = true;
        }
        Field field = f2656c;
        if (field != null) {
            try {
                f2656c.setInt(view, (field.getInt(view) & -13) | visibility);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    public final void mo3506b() {
        if (!f2655b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f2654a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f2655b = true;
        }
    }
}
