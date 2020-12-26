package p000a.p058q;

import android.view.ViewGroup;

/* renamed from: a.q.l */
public class C0704l {

    /* renamed from: a */
    public ViewGroup f2678a;

    /* renamed from: b */
    public Runnable f2679b;

    /* renamed from: a */
    public void mo3523a() {
        Runnable runnable;
        if (m3435b(this.f2678a) == this && (runnable = this.f2679b) != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public static void m3436c(ViewGroup sceneRoot, C0704l scene) {
        sceneRoot.setTag(C0697j.transition_current_scene, scene);
    }

    /* renamed from: b */
    public static C0704l m3435b(ViewGroup sceneRoot) {
        return (C0704l) sceneRoot.getTag(C0697j.transition_current_scene);
    }
}
