package p000a.p058q;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.q.h0 */
public class C0694h0 extends C0692g0 {
    /* renamed from: f */
    public void mo3495f(View view, float alpha) {
        view.setTransitionAlpha(alpha);
    }

    /* renamed from: c */
    public float mo3493c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: g */
    public void mo3501g(View view, int visibility) {
        view.setTransitionVisibility(visibility);
    }

    /* renamed from: e */
    public void mo3499e(View v, int left, int top, int right, int bottom) {
        v.setLeftTopRightBottom(left, top, right, bottom);
    }

    /* renamed from: h */
    public void mo3497h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo3498i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
