package p000a.p058q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: a.q.d0 */
public class C0682d0 extends C0696i0 {

    /* renamed from: e */
    public static boolean f2634e = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo3495f(View view, float alpha) {
        if (f2634e) {
            try {
                view.setTransitionAlpha(alpha);
                return;
            } catch (NoSuchMethodError e) {
                f2634e = false;
            }
        }
        view.setAlpha(alpha);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo3493c(View view) {
        if (f2634e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError e) {
                f2634e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo3494d(View view) {
    }

    /* renamed from: a */
    public void mo3492a(View view) {
    }
}
