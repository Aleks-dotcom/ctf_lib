package p066b.p067a.p068a.p069a.p081l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: b.a.a.a.l.i */
public class C1031i {

    /* renamed from: a */
    public long f4327a = 0;

    /* renamed from: b */
    public long f4328b = 300;

    /* renamed from: c */
    public TimeInterpolator f4329c = null;

    /* renamed from: d */
    public int f4330d = 0;

    /* renamed from: e */
    public int f4331e = 1;

    public C1031i(long delay, long duration) {
        this.f4327a = delay;
        this.f4328b = duration;
    }

    public C1031i(long delay, long duration, TimeInterpolator interpolator) {
        this.f4327a = delay;
        this.f4328b = duration;
        this.f4329c = interpolator;
    }

    /* renamed from: a */
    public void mo5867a(Animator animator) {
        animator.setStartDelay(mo5868c());
        animator.setDuration(mo5869d());
        animator.setInterpolator(mo5870e());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(mo5872g());
            ((ValueAnimator) animator).setRepeatMode(mo5873h());
        }
    }

    /* renamed from: c */
    public long mo5868c() {
        return this.f4327a;
    }

    /* renamed from: d */
    public long mo5869d() {
        return this.f4328b;
    }

    /* renamed from: e */
    public TimeInterpolator mo5870e() {
        TimeInterpolator timeInterpolator = this.f4329c;
        return timeInterpolator != null ? timeInterpolator : C1023a.f4313b;
    }

    /* renamed from: g */
    public int mo5872g() {
        return this.f4330d;
    }

    /* renamed from: h */
    public int mo5873h() {
        return this.f4331e;
    }

    /* renamed from: b */
    public static C1031i m5440b(ValueAnimator animator) {
        C1031i timing = new C1031i(animator.getStartDelay(), animator.getDuration(), m5441f(animator));
        timing.f4330d = animator.getRepeatCount();
        timing.f4331e = animator.getRepeatMode();
        return timing;
    }

    /* renamed from: f */
    public static TimeInterpolator m5441f(ValueAnimator animator) {
        TimeInterpolator interpolator = animator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C1023a.f4313b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C1023a.f4314c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C1023a.f4315d;
        }
        return interpolator;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C1031i)) {
            return false;
        }
        C1031i that = (C1031i) o;
        if (mo5868c() == that.mo5868c() && mo5869d() == that.mo5869d() && mo5872g() == that.mo5872g() && mo5873h() == that.mo5873h()) {
            return mo5870e().getClass().equals(that.mo5870e().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (mo5868c() ^ (mo5868c() >>> 32))) * 31) + ((int) (mo5869d() ^ (mo5869d() >>> 32)))) * 31) + mo5870e().getClass().hashCode()) * 31) + mo5872g()) * 31) + mo5873h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo5868c() + " duration: " + mo5869d() + " interpolator: " + mo5870e().getClass() + " repeatCount: " + mo5872g() + " repeatMode: " + mo5873h() + "}\n";
    }
}
