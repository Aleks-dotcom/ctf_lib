package p000a.p058q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.q.e0 */
public class C0688e0 extends C0682d0 {

    /* renamed from: f */
    public static boolean f2644f = true;

    /* renamed from: g */
    public static boolean f2645g = true;

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo3497h(View view, Matrix matrix) {
        if (f2644f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError e) {
                f2644f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo3498i(View view, Matrix matrix) {
        if (f2645g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError e) {
                f2645g = false;
            }
        }
    }
}
