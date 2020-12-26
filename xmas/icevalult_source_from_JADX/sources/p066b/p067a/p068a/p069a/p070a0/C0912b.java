package p066b.p067a.p068a.p069a.p070a0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: b.a.a.a.a0.b */
public class C0912b {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f3817a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f3818b = new ThreadLocal<>();

    /* renamed from: c */
    public static void m5022c(ViewGroup parent, View descendant, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f3817a;
        Matrix m = threadLocal.get();
        if (m == null) {
            m = new Matrix();
            threadLocal.set(m);
        } else {
            m.reset();
        }
        m5021b(parent, descendant, m);
        ThreadLocal<RectF> threadLocal2 = f3818b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        m.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    public static void m5020a(ViewGroup parent, View descendant, Rect out) {
        out.set(0, 0, descendant.getWidth(), descendant.getHeight());
        m5022c(parent, descendant, out);
    }

    /* renamed from: b */
    public static void m5021b(ViewParent target, View view, Matrix m) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != target) {
            View vp = (View) parent;
            m5021b(target, vp, m);
            m.preTranslate((float) (-vp.getScrollX()), (float) (-vp.getScrollY()));
        }
        m.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            m.preConcat(view.getMatrix());
        }
    }
}
