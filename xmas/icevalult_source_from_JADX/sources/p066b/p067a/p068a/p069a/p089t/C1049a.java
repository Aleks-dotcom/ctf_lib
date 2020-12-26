package p066b.p067a.p068a.p069a.p089t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p066b.p067a.p068a.p069a.p089t.C1053d;

/* renamed from: b.a.a.a.t.a */
public final class C1049a {
    /* renamed from: a */
    public static Animator m5695a(C1053d view, float centerX, float centerY, float endRadius) {
        Animator revealInfoAnimator = ObjectAnimator.ofObject(view, C1053d.C1056c.f4463a, C1053d.C1055b.f4461b, new C1053d.C1058e[]{new C1053d.C1058e(centerX, centerY, endRadius)});
        if (Build.VERSION.SDK_INT < 21) {
            return revealInfoAnimator;
        }
        C1053d.C1058e revealInfo = view.getRevealInfo();
        if (revealInfo != null) {
            Animator circularRevealAnimator = ViewAnimationUtils.createCircularReveal((View) view, (int) centerX, (int) centerY, revealInfo.f4467c, endRadius);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(new Animator[]{revealInfoAnimator, circularRevealAnimator});
            return set;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b.a.a.a.t.a$a */
    public static class C1050a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1053d f4458a;

        public C1050a(C1053d dVar) {
            this.f4458a = dVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f4458a.mo6155b();
        }

        public void onAnimationEnd(Animator animation) {
            this.f4458a.mo6154a();
        }
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m5696b(C1053d view) {
        return new C1050a(view);
    }
}
