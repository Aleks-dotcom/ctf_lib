package p000a.p002b.p011p;

import android.os.Build;
import android.view.View;

/* renamed from: a.b.p.y0 */
public class C0226y0 {
    /* renamed from: a */
    public static void m1184a(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            C0228z0.m1187f(view, tooltipText);
        }
    }
}
