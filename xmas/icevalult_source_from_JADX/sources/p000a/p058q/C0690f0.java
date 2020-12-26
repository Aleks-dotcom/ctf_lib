package p000a.p058q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: a.q.f0 */
public class C0690f0 extends C0688e0 {

    /* renamed from: h */
    public static boolean f2646h = true;

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo3499e(View v, int left, int top, int right, int bottom) {
        if (f2646h) {
            try {
                v.setLeftTopRightBottom(left, top, right, bottom);
            } catch (NoSuchMethodError e) {
                f2646h = false;
            }
        }
    }
}
