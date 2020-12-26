package p066b.p067a.p068a.p069a.p081l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p000a.p018e.C0269g;

/* renamed from: b.a.a.a.l.h */
public class C1030h {

    /* renamed from: a */
    public final C0269g<String, C1031i> f4325a = new C0269g<>();

    /* renamed from: b */
    public final C0269g<String, PropertyValuesHolder[]> f4326b = new C0269g<>();

    /* renamed from: g */
    public boolean mo5862g(String name) {
        return this.f4325a.get(name) != null;
    }

    /* renamed from: e */
    public C1031i mo5859e(String name) {
        if (mo5862g(name)) {
            return this.f4325a.get(name);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public void mo5865i(String name, C1031i timing) {
        this.f4325a.put(name, timing);
    }

    /* renamed from: h */
    public void mo5863h(String name, PropertyValuesHolder[] values) {
        this.f4326b.put(name, values);
    }

    /* renamed from: f */
    public long mo5861f() {
        long duration = 0;
        int count = this.f4325a.size();
        for (int i = 0; i < count; i++) {
            C1031i timing = this.f4325a.mo1887m(i);
            duration = Math.max(duration, timing.mo5868c() + timing.mo5869d());
        }
        return duration;
    }

    /* renamed from: b */
    public static C1030h m5432b(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return m5433c(context, resourceId);
    }

    /* renamed from: c */
    public static C1030h m5433c(Context context, int id) {
        try {
            Animator animator = AnimatorInflater.loadAnimator(context, id);
            if (animator instanceof AnimatorSet) {
                return m5434d(((AnimatorSet) animator).getChildAnimations());
            }
            if (animator == null) {
                return null;
            }
            List<Animator> animators = new ArrayList<>();
            animators.add(animator);
            return m5434d(animators);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(id), e);
            return null;
        }
    }

    /* renamed from: d */
    public static C1030h m5434d(List<Animator> animators) {
        C1030h spec = new C1030h();
        int count = animators.size();
        for (int i = 0; i < count; i++) {
            m5431a(spec, animators.get(i));
        }
        return spec;
    }

    /* renamed from: a */
    public static void m5431a(C1030h spec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator anim = (ObjectAnimator) animator;
            spec.mo5863h(anim.getPropertyName(), anim.getValues());
            spec.mo5865i(anim.getPropertyName(), C1031i.m5440b(anim));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C1030h)) {
            return false;
        }
        return this.f4325a.equals(((C1030h) o).f4325a);
    }

    public int hashCode() {
        return this.f4325a.hashCode();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4325a + "}\n";
    }
}
