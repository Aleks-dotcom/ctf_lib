package p000a.p025h.p038m;

import android.os.Build;
import android.view.ViewGroup;
import p000a.p025h.C0324b;

/* renamed from: a.h.m.t */
public final class C0470t {
    /* renamed from: a */
    public static boolean m2338a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.isTransitionGroup();
        }
        Boolean explicit = (Boolean) group.getTag(C0324b.tag_transition_group);
        return ((explicit == null || !explicit.booleanValue()) && group.getBackground() == null && C0460r.m2227B(group) == null) ? false : true;
    }
}
