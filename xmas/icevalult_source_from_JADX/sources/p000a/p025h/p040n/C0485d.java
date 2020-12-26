package p000a.p025h.p040n;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: a.h.n.d */
public final class C0485d {
    /* renamed from: a */
    public static void m2414a(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(deltaDistance, displacement);
        } else {
            edgeEffect.onPull(deltaDistance);
        }
    }
}
