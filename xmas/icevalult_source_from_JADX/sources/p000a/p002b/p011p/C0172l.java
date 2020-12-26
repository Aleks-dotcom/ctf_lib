package p000a.p002b.p011p;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: a.b.p.l */
public class C0172l {
    /* renamed from: a */
    public static InputConnection m938a(InputConnection ic, EditorInfo outAttrs, View view) {
        if (ic != null && outAttrs.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C0143d1) {
                    outAttrs.hintText = ((C0143d1) parent).mo1021a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return ic;
    }
}
