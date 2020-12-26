package p066b.p067a.p068a.p069a.p085p;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: b.a.a.a.p.a */
public class C1042a {
    /* renamed from: a */
    public static int m5523a(Canvas canvas, float left, float top, float right, float bottom, int alpha) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(left, top, right, bottom, alpha);
        }
        return canvas.saveLayerAlpha(left, top, right, bottom, alpha, 31);
    }
}
