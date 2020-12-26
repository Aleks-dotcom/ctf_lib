package p066b.p067a.p068a.p069a.p079j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p000a.p002b.p011p.C0227z;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p040n.C0490i;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p081l.C1024b;

/* renamed from: b.a.a.a.j0.f */
public final class C1012f {

    /* renamed from: a */
    public final Context f4066a;

    /* renamed from: b */
    public final TextInputLayout f4067b;

    /* renamed from: c */
    public LinearLayout f4068c;

    /* renamed from: d */
    public int f4069d;

    /* renamed from: e */
    public FrameLayout f4070e;

    /* renamed from: f */
    public int f4071f;

    /* renamed from: g */
    public Animator f4072g;

    /* renamed from: h */
    public final float f4073h;

    /* renamed from: i */
    public int f4074i;

    /* renamed from: j */
    public int f4075j;

    /* renamed from: k */
    public CharSequence f4076k;

    /* renamed from: l */
    public boolean f4077l;

    /* renamed from: m */
    public TextView f4078m;

    /* renamed from: n */
    public int f4079n;

    /* renamed from: o */
    public ColorStateList f4080o;

    /* renamed from: p */
    public CharSequence f4081p;

    /* renamed from: q */
    public boolean f4082q;

    /* renamed from: r */
    public TextView f4083r;

    /* renamed from: s */
    public int f4084s;

    /* renamed from: t */
    public ColorStateList f4085t;

    /* renamed from: u */
    public Typeface f4086u;

    public C1012f(TextInputLayout textInputView) {
        Context context = textInputView.getContext();
        this.f4066a = context;
        this.f4067b = textInputView;
        this.f4073h = (float) context.getResources().getDimensionPixelSize(C0928d.design_textinput_caption_translate_y);
    }

    /* renamed from: K */
    public void mo5811K(CharSequence helperText) {
        mo5816g();
        this.f4081p = helperText;
        this.f4083r.setText(helperText);
        int i = this.f4074i;
        if (i != 2) {
            this.f4075j = 2;
        }
        mo5812L(i, this.f4075j, mo5809I(this.f4083r, helperText));
    }

    /* renamed from: s */
    public void mo5828s() {
        mo5816g();
        int i = this.f4074i;
        if (i == 2) {
            this.f4075j = 0;
        }
        mo5812L(i, this.f4075j, mo5809I(this.f4083r, (CharSequence) null));
    }

    /* renamed from: J */
    public void mo5810J(CharSequence errorText) {
        mo5816g();
        this.f4076k = errorText;
        this.f4078m.setText(errorText);
        int i = this.f4074i;
        if (i != 1) {
            this.f4075j = 1;
        }
        mo5812L(i, this.f4075j, mo5809I(this.f4078m, errorText));
    }

    /* renamed from: r */
    public void mo5827r() {
        this.f4076k = null;
        mo5816g();
        if (this.f4074i == 1) {
            if (!this.f4082q || TextUtils.isEmpty(this.f4081p)) {
                this.f4075j = 0;
            } else {
                this.f4075j = 2;
            }
        }
        mo5812L(this.f4074i, this.f4075j, mo5809I(this.f4078m, (CharSequence) null));
    }

    /* renamed from: I */
    public final boolean mo5809I(TextView captionView, CharSequence captionText) {
        return C0460r.m2235J(this.f4067b) && this.f4067b.isEnabled() && (this.f4075j != this.f4074i || captionView == null || !TextUtils.equals(captionView.getText(), captionText));
    }

    /* renamed from: L */
    public final void mo5812L(int captionToHide, int captionToShow, boolean animate) {
        boolean z = animate;
        if (z) {
            AnimatorSet captionAnimator = new AnimatorSet();
            this.f4072g = captionAnimator;
            List<Animator> captionAnimatorList = new ArrayList<>();
            List<Animator> list = captionAnimatorList;
            int i = captionToHide;
            int i2 = captionToShow;
            mo5817h(list, this.f4082q, this.f4083r, 2, i, i2);
            mo5817h(list, this.f4077l, this.f4078m, 1, i, i2);
            C1024b.m5421a(captionAnimator, captionAnimatorList);
            captionAnimator.addListener(new C1013a(captionToShow, mo5821l(captionToHide), captionToHide, mo5821l(captionToShow)));
            captionAnimator.start();
        } else {
            int i3 = captionToShow;
            mo5834y(captionToHide, captionToShow);
        }
        this.f4067b.mo7005Y();
        this.f4067b.mo7011c0(z);
        this.f4067b.mo7019e0();
    }

    /* renamed from: b.a.a.a.j0.f$a */
    public class C1013a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f4087a;

        /* renamed from: b */
        public final /* synthetic */ TextView f4088b;

        /* renamed from: c */
        public final /* synthetic */ int f4089c;

        /* renamed from: d */
        public final /* synthetic */ TextView f4090d;

        public C1013a(int i, TextView textView, int i2, TextView textView2) {
            this.f4087a = i;
            this.f4088b = textView;
            this.f4089c = i2;
            this.f4090d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C1012f.this.f4074i = this.f4087a;
            Animator unused2 = C1012f.this.f4072g = null;
            TextView textView = this.f4088b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f4089c == 1 && C1012f.this.f4078m != null) {
                    C1012f.this.f4078m.setText((CharSequence) null);
                }
                TextView textView2 = this.f4090d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.f4090d.setAlpha(1.0f);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4090d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: y */
    public final void mo5834y(int captionToHide, int captionToShow) {
        TextView captionViewDisplayed;
        TextView captionViewToShow;
        if (captionToHide != captionToShow) {
            if (!(captionToShow == 0 || (captionViewToShow = mo5821l(captionToShow)) == null)) {
                captionViewToShow.setVisibility(0);
                captionViewToShow.setAlpha(1.0f);
            }
            if (!(captionToHide == 0 || (captionViewDisplayed = mo5821l(captionToHide)) == null)) {
                captionViewDisplayed.setVisibility(4);
                if (captionToHide == 1) {
                    captionViewDisplayed.setText((CharSequence) null);
                }
            }
            this.f4074i = captionToShow;
        }
    }

    /* renamed from: h */
    public final void mo5817h(List<Animator> captionAnimatorList, boolean captionEnabled, TextView captionView, int captionState, int captionToHide, int captionToShow) {
        if (captionView != null && captionEnabled) {
            if (captionState == captionToShow || captionState == captionToHide) {
                captionAnimatorList.add(mo5818i(captionView, captionToShow == captionState));
                if (captionToShow == captionState) {
                    captionAnimatorList.add(mo5819j(captionView));
                }
            }
        }
    }

    /* renamed from: i */
    public final ObjectAnimator mo5818i(TextView captionView, boolean display) {
        ObjectAnimator opacityAnimator = ObjectAnimator.ofFloat(captionView, View.ALPHA, new float[]{display ? 1.0f : 0.0f});
        opacityAnimator.setDuration(167);
        opacityAnimator.setInterpolator(C1023a.f4312a);
        return opacityAnimator;
    }

    /* renamed from: j */
    public final ObjectAnimator mo5819j(TextView captionView) {
        ObjectAnimator translationYAnimator = ObjectAnimator.ofFloat(captionView, View.TRANSLATION_Y, new float[]{-this.f4073h, 0.0f});
        translationYAnimator.setDuration(217);
        translationYAnimator.setInterpolator(C1023a.f4315d);
        return translationYAnimator;
    }

    /* renamed from: g */
    public void mo5816g() {
        Animator animator = this.f4072g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: u */
    public boolean mo5830u(int index) {
        return index == 0 || index == 1;
    }

    /* renamed from: l */
    public final TextView mo5821l(int captionDisplayState) {
        if (captionDisplayState == 1) {
            return this.f4078m;
        }
        if (captionDisplayState != 2) {
            return null;
        }
        return this.f4083r;
    }

    /* renamed from: e */
    public void mo5814e() {
        if (mo5815f()) {
            C0460r.m2281o0(this.f4068c, C0460r.m2226A(this.f4067b.getEditText()), 0, C0460r.m2296z(this.f4067b.getEditText()), 0);
        }
    }

    /* renamed from: f */
    public final boolean mo5815f() {
        return (this.f4068c == null || this.f4067b.getEditText() == null) ? false : true;
    }

    /* renamed from: d */
    public void mo5813d(TextView indicator, int index) {
        if (this.f4068c == null && this.f4070e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4066a);
            this.f4068c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4067b.addView(this.f4068c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.f4066a);
            this.f4070e = frameLayout;
            this.f4068c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f4068c.addView(new Space(this.f4066a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f4067b.getEditText() != null) {
                mo5814e();
            }
        }
        if (mo5830u(index)) {
            this.f4070e.setVisibility(0);
            this.f4070e.addView(indicator);
            this.f4071f++;
        } else {
            this.f4068c.addView(indicator, index);
        }
        this.f4068c.setVisibility(0);
        this.f4069d++;
    }

    /* renamed from: x */
    public void mo5833x(TextView indicator, int index) {
        FrameLayout frameLayout;
        if (this.f4068c != null) {
            if (!mo5830u(index) || (frameLayout = this.f4070e) == null) {
                this.f4068c.removeView(indicator);
            } else {
                int i = this.f4071f - 1;
                this.f4071f = i;
                mo5808H(frameLayout, i);
                this.f4070e.removeView(indicator);
            }
            int i2 = this.f4069d - 1;
            this.f4069d = i2;
            mo5808H(this.f4068c, i2);
        }
    }

    /* renamed from: H */
    public final void mo5808H(ViewGroup viewGroup, int indicatorsAdded) {
        if (indicatorsAdded == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: z */
    public void mo5835z(boolean enabled) {
        if (this.f4077l != enabled) {
            mo5816g();
            if (enabled) {
                C0227z zVar = new C0227z(this.f4066a);
                this.f4078m = zVar;
                zVar.setId(C0943f.textinput_error);
                Typeface typeface = this.f4086u;
                if (typeface != null) {
                    this.f4078m.setTypeface(typeface);
                }
                mo5801A(this.f4079n);
                mo5802B(this.f4080o);
                this.f4078m.setVisibility(4);
                C0460r.m2261e0(this.f4078m, 1);
                mo5813d(this.f4078m, 0);
            } else {
                mo5827r();
                mo5833x(this.f4078m, 0);
                this.f4078m = null;
                this.f4067b.mo7005Y();
                this.f4067b.mo7019e0();
            }
            this.f4077l = enabled;
        }
    }

    /* renamed from: v */
    public boolean mo5831v() {
        return this.f4077l;
    }

    /* renamed from: w */
    public boolean mo5832w() {
        return this.f4082q;
    }

    /* renamed from: D */
    public void mo5804D(boolean enabled) {
        if (this.f4082q != enabled) {
            mo5816g();
            if (enabled) {
                C0227z zVar = new C0227z(this.f4066a);
                this.f4083r = zVar;
                zVar.setId(C0943f.textinput_helper_text);
                Typeface typeface = this.f4086u;
                if (typeface != null) {
                    this.f4083r.setTypeface(typeface);
                }
                this.f4083r.setVisibility(4);
                C0460r.m2261e0(this.f4083r, 1);
                mo5803C(this.f4084s);
                mo5805E(this.f4085t);
                mo5813d(this.f4083r, 1);
            } else {
                mo5828s();
                mo5833x(this.f4083r, 1);
                this.f4083r = null;
                this.f4067b.mo7005Y();
                this.f4067b.mo7019e0();
            }
            this.f4082q = enabled;
        }
    }

    /* renamed from: k */
    public boolean mo5820k() {
        return mo5829t(this.f4075j);
    }

    /* renamed from: t */
    public final boolean mo5829t(int captionState) {
        if (captionState != 1 || this.f4078m == null || TextUtils.isEmpty(this.f4076k)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public CharSequence mo5822m() {
        return this.f4076k;
    }

    /* renamed from: p */
    public CharSequence mo5825p() {
        return this.f4081p;
    }

    /* renamed from: G */
    public void mo5807G(Typeface typeface) {
        if (typeface != this.f4086u) {
            this.f4086u = typeface;
            mo5806F(this.f4078m, typeface);
            mo5806F(this.f4083r, typeface);
        }
    }

    /* renamed from: F */
    public final void mo5806F(TextView captionView, Typeface typeface) {
        if (captionView != null) {
            captionView.setTypeface(typeface);
        }
    }

    /* renamed from: n */
    public int mo5823n() {
        TextView textView = this.f4078m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: o */
    public ColorStateList mo5824o() {
        TextView textView = this.f4078m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: B */
    public void mo5802B(ColorStateList errorViewTextColor) {
        this.f4080o = errorViewTextColor;
        TextView textView = this.f4078m;
        if (textView != null && errorViewTextColor != null) {
            textView.setTextColor(errorViewTextColor);
        }
    }

    /* renamed from: A */
    public void mo5801A(int resId) {
        this.f4079n = resId;
        TextView textView = this.f4078m;
        if (textView != null) {
            this.f4067b.mo6998Q(textView, resId);
        }
    }

    /* renamed from: q */
    public int mo5826q() {
        TextView textView = this.f4083r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: E */
    public void mo5805E(ColorStateList helperTextViewTextColor) {
        this.f4085t = helperTextViewTextColor;
        TextView textView = this.f4083r;
        if (textView != null && helperTextViewTextColor != null) {
            textView.setTextColor(helperTextViewTextColor);
        }
    }

    /* renamed from: C */
    public void mo5803C(int resId) {
        this.f4084s = resId;
        TextView textView = this.f4083r;
        if (textView != null) {
            C0490i.m2439n(textView, resId);
        }
    }
}
