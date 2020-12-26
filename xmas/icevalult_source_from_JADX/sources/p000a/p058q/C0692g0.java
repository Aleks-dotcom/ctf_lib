package p000a.p058q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: a.q.g0 */
public class C0692g0 extends C0690f0 {

    /* renamed from: i */
    public static boolean f2647i = true;

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo3501g(View view, int visibility) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3501g(view, visibility);
        } else if (f2647i) {
            try {
                view.setTransitionVisibility(visibility);
            } catch (NoSuchMethodError e) {
                f2647i = false;
            }
        }
    }
}
