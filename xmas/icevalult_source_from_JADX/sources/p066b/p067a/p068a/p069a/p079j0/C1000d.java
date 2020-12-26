package p066b.p067a.p068a.p069a.p079j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0938e;
import p066b.p067a.p068a.p069a.C0986i;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p091u.C1060a;

/* renamed from: b.a.a.a.j0.d */
public class C1000d extends C1011e {

    /* renamed from: o */
    public static final boolean f4039o = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: d */
    public final TextWatcher f4040d = new C1001a();

    /* renamed from: e */
    public final TextInputLayout.C1179e f4041e = new C1003b(this.f4063a);

    /* renamed from: f */
    public final TextInputLayout.C1180f f4042f = new C1004c();

    /* renamed from: g */
    public boolean f4043g = false;

    /* renamed from: h */
    public boolean f4044h = false;

    /* renamed from: i */
    public long f4045i = RecyclerView.FOREVER_NS;

    /* renamed from: j */
    public StateListDrawable f4046j;

    /* renamed from: k */
    public C0953g f4047k;

    /* renamed from: l */
    public AccessibilityManager f4048l;

    /* renamed from: m */
    public ValueAnimator f4049m;

    /* renamed from: n */
    public ValueAnimator f4050n;

    /* renamed from: b.a.a.a.j0.d$a */
    public class C1001a implements TextWatcher {
        public C1001a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public void afterTextChanged(Editable s) {
            C1000d dVar = C1000d.this;
            AutoCompleteTextView editText = dVar.mo5785u(dVar.f4063a.getEditText());
            editText.post(new C1002a(editText));
        }

        /* renamed from: b.a.a.a.j0.d$a$a */
        public class C1002a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f4052b;

            public C1002a(AutoCompleteTextView autoCompleteTextView) {
                this.f4052b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f4052b.isPopupShowing();
                C1000d.this.mo5790z(isPopupShowing);
                boolean unused = C1000d.this.f4043g = isPopupShowing;
            }
        }
    }

    /* renamed from: b.a.a.a.j0.d$b */
    public class C1003b extends TextInputLayout.C1179e {
        public C1003b(TextInputLayout layout) {
            super(layout);
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            super.mo2424g(host, info);
            info.mo2459V(Spinner.class.getName());
            if (info.mo2449I()) {
                info.mo2478g0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo2425h(View host, AccessibilityEvent event) {
            super.mo2425h(host, event);
            C1000d dVar = C1000d.this;
            AutoCompleteTextView editText = dVar.mo5785u(dVar.f4063a.getEditText());
            if (event.getEventType() == 1 && C1000d.this.f4048l.isTouchExplorationEnabled()) {
                C1000d.this.mo5779C(editText);
            }
        }
    }

    /* renamed from: b.a.a.a.j0.d$c */
    public class C1004c implements TextInputLayout.C1180f {
        public C1004c() {
        }

        /* renamed from: a */
        public void mo5762a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextView = C1000d.this.mo5785u(textInputLayout.getEditText());
            C1000d.this.mo5777A(autoCompleteTextView);
            C1000d.this.mo5782r(autoCompleteTextView);
            C1000d.this.mo5778B(autoCompleteTextView);
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(C1000d.this.f4040d);
            autoCompleteTextView.addTextChangedListener(C1000d.this.f4040d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C1000d.this.f4041e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public C1000d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo5755a() {
        float popupCornerRadius = (float) this.f4064b.getResources().getDimensionPixelOffset(C0928d.mtrl_shape_corner_size_small_component);
        float exposedDropdownPopupElevation = (float) this.f4064b.getResources().getDimensionPixelOffset(C0928d.mtrl_exposed_dropdown_menu_popup_elevation);
        int exposedDropdownPopupVerticalPadding = this.f4064b.getResources().getDimensionPixelOffset(C0928d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0953g roundedCornersPopupBackground = mo5787w(popupCornerRadius, popupCornerRadius, exposedDropdownPopupElevation, exposedDropdownPopupVerticalPadding);
        C0953g roundedBottomCornersPopupBackground = mo5787w(0.0f, popupCornerRadius, exposedDropdownPopupElevation, exposedDropdownPopupVerticalPadding);
        this.f4047k = roundedCornersPopupBackground;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f4046j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, roundedCornersPopupBackground);
        this.f4046j.addState(new int[0], roundedBottomCornersPopupBackground);
        this.f4063a.setEndIconDrawable(C0053a.m277d(this.f4064b, f4039o ? C0938e.mtrl_dropdown_arrow : C0938e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f4063a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C0986i.exposed_dropdown_menu_content_description));
        this.f4063a.setEndIconOnClickListener(new C1005d());
        this.f4063a.mo7010c(this.f4042f);
        mo5788x();
        C0460r.m2275l0(this.f4065c, 2);
        this.f4048l = (AccessibilityManager) this.f4064b.getSystemService("accessibility");
    }

    /* renamed from: b.a.a.a.j0.d$d */
    public class C1005d implements View.OnClickListener {
        public C1005d() {
        }

        public void onClick(View v) {
            C1000d.this.mo5779C((AutoCompleteTextView) C1000d.this.f4063a.getEditText());
        }
    }

    /* renamed from: c */
    public boolean mo5781c() {
        return true;
    }

    /* renamed from: b */
    public boolean mo5780b(int boxBackgroundMode) {
        return boxBackgroundMode != 0;
    }

    /* renamed from: C */
    public final void mo5779C(AutoCompleteTextView editText) {
        if (editText != null) {
            if (mo5789y()) {
                this.f4043g = false;
            }
            if (!this.f4043g) {
                if (f4039o) {
                    mo5790z(!this.f4044h);
                } else {
                    this.f4044h = !this.f4044h;
                    this.f4065c.toggle();
                }
                if (this.f4044h) {
                    editText.requestFocus();
                    editText.showDropDown();
                    return;
                }
                editText.dismissDropDown();
                return;
            }
            this.f4043g = false;
        }
    }

    /* renamed from: A */
    public final void mo5777A(AutoCompleteTextView editText) {
        if (f4039o) {
            int boxBackgroundMode = this.f4063a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                editText.setDropDownBackgroundDrawable(this.f4047k);
            } else if (boxBackgroundMode == 1) {
                editText.setDropDownBackgroundDrawable(this.f4046j);
            }
        }
    }

    /* renamed from: r */
    public final void mo5782r(AutoCompleteTextView editText) {
        if (editText.getKeyListener() == null) {
            int boxBackgroundMode = this.f4063a.getBoxBackgroundMode();
            C0953g boxBackground = this.f4063a.getBoxBackground();
            int rippleColor = C1060a.m5721c(editText, C0924b.f3850f);
            int[][] states = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                mo5784t(editText, rippleColor, states, boxBackground);
            } else if (boxBackgroundMode == 1) {
                mo5783s(editText, rippleColor, states, boxBackground);
            }
        }
    }

    /* renamed from: t */
    public final void mo5784t(AutoCompleteTextView editText, int rippleColor, int[][] states, C0953g boxBackground) {
        LayerDrawable editTextBackground;
        int surfaceColor = C1060a.m5721c(editText, C0924b.colorSurface);
        C0953g rippleBackground = new C0953g(boxBackground.mo5571B());
        int pressedBackgroundColor = C1060a.m5724f(rippleColor, surfaceColor, 0.1f);
        rippleBackground.mo5588T(new ColorStateList(states, new int[]{pressedBackgroundColor, 0}));
        if (f4039o) {
            rippleBackground.setTint(surfaceColor);
            ColorStateList rippleColorStateList = new ColorStateList(states, new int[]{pressedBackgroundColor, surfaceColor});
            C0953g mask = new C0953g(boxBackground.mo5571B());
            mask.setTint(-1);
            editTextBackground = new LayerDrawable(new Drawable[]{new RippleDrawable(rippleColorStateList, rippleBackground, mask), boxBackground});
        } else {
            editTextBackground = new LayerDrawable(new Drawable[]{rippleBackground, boxBackground});
        }
        C0460r.m2263f0(editText, editTextBackground);
    }

    /* renamed from: s */
    public final void mo5783s(AutoCompleteTextView editText, int rippleColor, int[][] states, C0953g boxBackground) {
        int boxBackgroundColor = this.f4063a.getBoxBackgroundColor();
        int[] colors = {C1060a.m5724f(rippleColor, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f4039o) {
            C0460r.m2263f0(editText, new RippleDrawable(new ColorStateList(states, colors), boxBackground, boxBackground));
            return;
        }
        C0953g rippleBackground = new C0953g(boxBackground.mo5571B());
        rippleBackground.mo5588T(new ColorStateList(states, colors));
        LayerDrawable editTextBackground = new LayerDrawable(new Drawable[]{boxBackground, rippleBackground});
        int start = C0460r.m2226A(editText);
        int top = editText.getPaddingTop();
        int end = C0460r.m2296z(editText);
        int bottom = editText.getPaddingBottom();
        C0460r.m2263f0(editText, editTextBackground);
        C0460r.m2281o0(editText, start, top, end, bottom);
    }

    /* renamed from: b.a.a.a.j0.d$e */
    public class C1006e implements View.OnTouchListener {

        /* renamed from: b */
        public final /* synthetic */ AutoCompleteTextView f4057b;

        public C1006e(AutoCompleteTextView autoCompleteTextView) {
            this.f4057b = autoCompleteTextView;
        }

        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == 1) {
                if (C1000d.this.mo5789y()) {
                    boolean unused = C1000d.this.f4043g = false;
                }
                C1000d.this.mo5779C(this.f4057b);
                v.performClick();
            }
            return false;
        }
    }

    /* renamed from: B */
    public final void mo5778B(AutoCompleteTextView editText) {
        editText.setOnTouchListener(new C1006e(editText));
        editText.setOnFocusChangeListener(new C1007f());
        if (f4039o) {
            editText.setOnDismissListener(new C1008g());
        }
    }

    /* renamed from: b.a.a.a.j0.d$f */
    public class C1007f implements View.OnFocusChangeListener {
        public C1007f() {
        }

        public void onFocusChange(View view, boolean hasFocus) {
            C1000d.this.f4063a.setEndIconActivated(hasFocus);
            if (!hasFocus) {
                C1000d.this.mo5790z(false);
                boolean unused = C1000d.this.f4043g = false;
            }
        }
    }

    /* renamed from: b.a.a.a.j0.d$g */
    public class C1008g implements AutoCompleteTextView.OnDismissListener {
        public C1008g() {
        }

        public void onDismiss() {
            boolean unused = C1000d.this.f4043g = true;
            long unused2 = C1000d.this.f4045i = System.currentTimeMillis();
            C1000d.this.mo5790z(false);
        }
    }

    /* renamed from: w */
    public final C0953g mo5787w(float topCornerRadius, float bottomCornerRadius, float elevation, int verticalPadding) {
        C0960k.C0962b a = C0960k.m5182a();
        a.mo5674z(topCornerRadius);
        a.mo5660D(topCornerRadius);
        a.mo5666r(bottomCornerRadius);
        a.mo5670v(bottomCornerRadius);
        C0960k shapeAppearanceModel = a.mo5662m();
        C0953g popupDrawable = C0953g.m5119l(this.f4064b, elevation);
        popupDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        popupDrawable.mo5590V(0, verticalPadding, 0, verticalPadding);
        return popupDrawable;
    }

    /* renamed from: y */
    public final boolean mo5789y() {
        long activeFor = System.currentTimeMillis() - this.f4045i;
        return activeFor < 0 || activeFor > 300;
    }

    /* renamed from: u */
    public final AutoCompleteTextView mo5785u(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    public final void mo5790z(boolean checked) {
        if (this.f4044h != checked) {
            this.f4044h = checked;
            this.f4050n.cancel();
            this.f4049m.start();
        }
    }

    /* renamed from: x */
    public final void mo5788x() {
        this.f4050n = mo5786v(67, 0.0f, 1.0f);
        ValueAnimator v = mo5786v(50, 1.0f, 0.0f);
        this.f4049m = v;
        v.addListener(new C1009h());
    }

    /* renamed from: b.a.a.a.j0.d$h */
    public class C1009h extends AnimatorListenerAdapter {
        public C1009h() {
        }

        public void onAnimationEnd(Animator animation) {
            C1000d dVar = C1000d.this;
            dVar.f4065c.setChecked(dVar.f4044h);
            C1000d.this.f4050n.start();
        }
    }

    /* renamed from: v */
    public final ValueAnimator mo5786v(int duration, float... values) {
        ValueAnimator animator = ValueAnimator.ofFloat(values);
        animator.setInterpolator(C1023a.f4312a);
        animator.setDuration((long) duration);
        animator.addUpdateListener(new C1010i());
        return animator;
    }

    /* renamed from: b.a.a.a.j0.d$i */
    public class C1010i implements ValueAnimator.AnimatorUpdateListener {
        public C1010i() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            C1000d.this.f4065c.setAlpha(((Float) animation.getAnimatedValue()).floatValue());
        }
    }
}
