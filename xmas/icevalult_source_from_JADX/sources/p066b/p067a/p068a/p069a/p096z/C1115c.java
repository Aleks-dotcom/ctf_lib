package p066b.p067a.p068a.p069a.p096z;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p066b.p067a.p068a.p069a.p074e0.C0942b;
import p066b.p067a.p068a.p069a.p075f0.C0945b;

/* renamed from: b.a.a.a.z.c */
public class C1115c extends C1102b {
    public C1115c(FloatingActionButton view, C0945b shadowViewDelegate) {
        super(view, shadowViewDelegate);
    }

    /* renamed from: R */
    public void mo6306R(ColorStateList rippleColor) {
        Drawable drawable = this.f4569c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C0942b.m5099a(rippleColor));
        } else {
            super.mo6306R(rippleColor);
        }
    }

    /* renamed from: D */
    public void mo6292D(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f4591y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C1102b.f4556G, mo6358e0(elevation, pressedTranslationZ));
            stateListAnimator.addState(C1102b.f4557H, mo6358e0(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(C1102b.f4558I, mo6358e0(elevation, hoveredFocusedTranslationZ));
            stateListAnimator.addState(C1102b.f4559J, mo6358e0(elevation, hoveredFocusedTranslationZ));
            AnimatorSet set = new AnimatorSet();
            List<Animator> animators = new ArrayList<>();
            animators.add(ObjectAnimator.ofFloat(this.f4591y, "elevation", new float[]{elevation}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f4591y;
                animators.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            animators.add(ObjectAnimator.ofFloat(this.f4591y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            set.playSequentially((Animator[]) animators.toArray(new Animator[0]));
            set.setInterpolator(C1102b.f4555F);
            stateListAnimator.addState(C1102b.f4560K, set);
            stateListAnimator.addState(C1102b.f4561L, mo6358e0(0.0f, 0.0f));
            this.f4591y.setStateListAnimator(stateListAnimator);
        }
        if (mo6310V()) {
            mo6316b0();
        }
    }

    /* renamed from: e0 */
    public final Animator mo6358e0(float elevation, float translationZ) {
        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(this.f4591y, "elevation", new float[]{elevation}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f4591y, View.TRANSLATION_Z, new float[]{translationZ}).setDuration(100));
        set.setInterpolator(C1102b.f4555F);
        return set;
    }

    /* renamed from: m */
    public float mo6328m() {
        return this.f4591y.getElevation();
    }

    /* renamed from: A */
    public void mo6289A() {
        mo6316b0();
    }

    /* renamed from: V */
    public boolean mo6310V() {
        return this.f4592z.mo5561c() || !mo6312X();
    }

    /* renamed from: C */
    public void mo6291C(int[] state) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f4591y.isEnabled()) {
            this.f4591y.setElevation(this.f4574h);
            if (this.f4591y.isPressed()) {
                this.f4591y.setTranslationZ(this.f4576j);
            } else if (this.f4591y.isFocused() || this.f4591y.isHovered()) {
                this.f4591y.setTranslationZ(this.f4575i);
            } else {
                this.f4591y.setTranslationZ(0.0f);
            }
        } else {
            this.f4591y.setElevation(0.0f);
            this.f4591y.setTranslationZ(0.0f);
        }
    }

    /* renamed from: y */
    public void mo6340y() {
    }

    /* renamed from: Z */
    public void mo6314Z() {
    }

    /* renamed from: I */
    public boolean mo6297I() {
        return false;
    }

    /* renamed from: r */
    public void mo6333r(Rect rect) {
        if (this.f4592z.mo5561c()) {
            super.mo6333r(rect);
        } else if (!mo6312X()) {
            int minPadding = (this.f4577k - this.f4591y.getSizeDimension()) / 2;
            rect.set(minPadding, minPadding, minPadding, minPadding);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
