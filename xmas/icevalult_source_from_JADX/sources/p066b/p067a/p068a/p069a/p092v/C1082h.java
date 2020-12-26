package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.content.res.TypedArray;
import p000a.p046k.p047a.C0519c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.p073d0.C0931b;

/* renamed from: b.a.a.a.v.h */
public final class C1082h<S> extends C0519c {
    /* renamed from: l1 */
    public static boolean m5778l1(Context context) {
        TypedArray a = context.obtainStyledAttributes(C0931b.m5071c(context, C0924b.materialCalendarStyle, C1069g.class.getCanonicalName()), new int[]{16843277});
        boolean fullscreen = a.getBoolean(0, false);
        a.recycle();
        return fullscreen;
    }
}
