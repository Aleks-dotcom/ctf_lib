package p066b.p067a.p068a.p069a.p082m;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0946g;

/* renamed from: b.a.a.a.m.e */
public class C1039e {
    static {
        new int[1][0] = 16843848;
    }

    /* renamed from: a */
    public static void m5482a(View view, float elevation) {
        int dur = view.getResources().getInteger(C0946g.app_bar_elevation_anim_duration);
        StateListAnimator sla = new StateListAnimator();
        sla.addState(new int[]{16842766, C0924b.state_liftable, -C0924b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration((long) dur));
        sla.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{elevation}).setDuration((long) dur));
        sla.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(sla);
    }
}
