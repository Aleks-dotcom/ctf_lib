package p066b.p067a.p068a.p069a.p079j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p002b.p004l.p005a.C0053a;
import p066b.p067a.p068a.p069a.C0938e;
import p066b.p067a.p068a.p069a.C0986i;
import p066b.p067a.p068a.p069a.p081l.C1023a;

/* renamed from: b.a.a.a.j0.a */
public class C0990a extends C1011e {

    /* renamed from: d */
    public final TextWatcher f4025d = new C0991a();

    /* renamed from: e */
    public final TextInputLayout.C1180f f4026e = new C0992b();

    /* renamed from: f */
    public AnimatorSet f4027f;

    /* renamed from: g */
    public ValueAnimator f4028g;

    /* renamed from: b.a.a.a.j0.a$a */
    public class C0991a implements TextWatcher {
        public C0991a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public void afterTextChanged(Editable s) {
            if (!C0990a.m5324j(s)) {
                C0990a.this.f4027f.cancel();
                C0990a.this.f4028g.start();
            } else if (!C0990a.this.f4063a.mo6990E()) {
                C0990a.this.f4028g.cancel();
                C0990a.this.f4027f.start();
            }
        }
    }

    /* renamed from: b.a.a.a.j0.a$b */
    public class C0992b implements TextInputLayout.C1180f {
        public C0992b() {
        }

        /* renamed from: a */
        public void mo5762a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C0990a.m5324j(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(C0990a.this.f4025d);
            editText.addTextChangedListener(C0990a.this.f4025d);
        }
    }

    public C0990a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo5755a() {
        this.f4063a.setEndIconDrawable(C0053a.m277d(this.f4064b, C0938e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f4063a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C0986i.clear_text_end_icon_content_description));
        this.f4063a.setEndIconOnClickListener(new C0993c());
        this.f4063a.mo7010c(this.f4026e);
        mo5758k();
    }

    /* renamed from: b.a.a.a.j0.a$c */
    public class C0993c implements View.OnClickListener {
        public C0993c() {
        }

        public void onClick(View v) {
            C0990a.this.f4063a.getEditText().setText((CharSequence) null);
        }
    }

    /* renamed from: k */
    public final void mo5758k() {
        ValueAnimator scaleAnimator = mo5757i();
        ValueAnimator fadeAnimator = mo5756h(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4027f = animatorSet;
        animatorSet.playTogether(new Animator[]{scaleAnimator, fadeAnimator});
        this.f4027f.addListener(new C0994d());
        ValueAnimator h = mo5756h(1.0f, 0.0f);
        this.f4028g = h;
        h.addListener(new C0995e());
    }

    /* renamed from: b.a.a.a.j0.a$d */
    public class C0994d extends AnimatorListenerAdapter {
        public C0994d() {
        }

        public void onAnimationStart(Animator animation) {
            C0990a.this.f4063a.setEndIconVisible(true);
        }
    }

    /* renamed from: b.a.a.a.j0.a$e */
    public class C0995e extends AnimatorListenerAdapter {
        public C0995e() {
        }

        public void onAnimationEnd(Animator animation) {
            C0990a.this.f4063a.setEndIconVisible(false);
        }
    }

    /* renamed from: h */
    public final ValueAnimator mo5756h(float... values) {
        ValueAnimator animator = ValueAnimator.ofFloat(values);
        animator.setInterpolator(C1023a.f4312a);
        animator.setDuration(100);
        animator.addUpdateListener(new C0996f());
        return animator;
    }

    /* renamed from: b.a.a.a.j0.a$f */
    public class C0996f implements ValueAnimator.AnimatorUpdateListener {
        public C0996f() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            C0990a.this.f4065c.setAlpha(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: i */
    public final ValueAnimator mo5757i() {
        ValueAnimator animator = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        animator.setInterpolator(C1023a.f4315d);
        animator.setDuration(150);
        animator.addUpdateListener(new C0997g());
        return animator;
    }

    /* renamed from: b.a.a.a.j0.a$g */
    public class C0997g implements ValueAnimator.AnimatorUpdateListener {
        public C0997g() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            float scale = ((Float) animation.getAnimatedValue()).floatValue();
            C0990a.this.f4065c.setScaleX(scale);
            C0990a.this.f4065c.setScaleY(scale);
        }
    }

    /* renamed from: j */
    public static boolean m5324j(Editable editable) {
        return editable.length() > 0;
    }
}
