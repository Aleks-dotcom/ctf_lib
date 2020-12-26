package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p011p.C0145e0;
import p000a.p002b.p011p.C0160j;
import p000a.p002b.p011p.C0227z;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0448f;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p040n.C0490i;
import p000a.p043j.p044a.C0501a;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0926c;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.C0986i;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.p070a0.C0910a;
import p066b.p067a.p068a.p069a.p070a0.C0912b;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p079j0.C0999c;
import p066b.p067a.p068a.p069a.p079j0.C1011e;
import p066b.p067a.p068a.p069a.p079j0.C1012f;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p091u.C1060a;

public class TextInputLayout extends LinearLayout {

    /* renamed from: s0 */
    public static final int f4863s0 = C0989j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public int f4864A;

    /* renamed from: B */
    public int f4865B;

    /* renamed from: C */
    public final Rect f4866C;

    /* renamed from: D */
    public final Rect f4867D;

    /* renamed from: E */
    public final RectF f4868E;

    /* renamed from: F */
    public Typeface f4869F;

    /* renamed from: G */
    public final CheckableImageButton f4870G;

    /* renamed from: H */
    public ColorStateList f4871H;

    /* renamed from: I */
    public boolean f4872I;

    /* renamed from: J */
    public PorterDuff.Mode f4873J;

    /* renamed from: K */
    public boolean f4874K;

    /* renamed from: L */
    public Drawable f4875L;

    /* renamed from: M */
    public View.OnLongClickListener f4876M;

    /* renamed from: N */
    public final LinkedHashSet<C1180f> f4877N;

    /* renamed from: O */
    public int f4878O;

    /* renamed from: P */
    public final SparseArray<C1011e> f4879P;

    /* renamed from: Q */
    public final CheckableImageButton f4880Q;

    /* renamed from: R */
    public final LinkedHashSet<C1181g> f4881R;

    /* renamed from: S */
    public ColorStateList f4882S;

    /* renamed from: T */
    public boolean f4883T;

    /* renamed from: U */
    public PorterDuff.Mode f4884U;

    /* renamed from: V */
    public boolean f4885V;

    /* renamed from: W */
    public Drawable f4886W;

    /* renamed from: a0 */
    public Drawable f4887a0;

    /* renamed from: b */
    public final FrameLayout f4888b;

    /* renamed from: b0 */
    public final CheckableImageButton f4889b0;

    /* renamed from: c */
    public final FrameLayout f4890c;

    /* renamed from: c0 */
    public View.OnLongClickListener f4891c0;

    /* renamed from: d */
    public EditText f4892d;

    /* renamed from: d0 */
    public ColorStateList f4893d0;

    /* renamed from: e */
    public CharSequence f4894e;

    /* renamed from: e0 */
    public ColorStateList f4895e0;

    /* renamed from: f */
    public final C1012f f4896f;

    /* renamed from: f0 */
    public final int f4897f0;

    /* renamed from: g */
    public boolean f4898g;

    /* renamed from: g0 */
    public final int f4899g0;

    /* renamed from: h */
    public int f4900h;

    /* renamed from: h0 */
    public int f4901h0;

    /* renamed from: i */
    public boolean f4902i;

    /* renamed from: i0 */
    public int f4903i0;

    /* renamed from: j */
    public TextView f4904j;

    /* renamed from: j0 */
    public final int f4905j0;

    /* renamed from: k */
    public int f4906k;

    /* renamed from: k0 */
    public final int f4907k0;

    /* renamed from: l */
    public int f4908l;

    /* renamed from: l0 */
    public final int f4909l0;

    /* renamed from: m */
    public ColorStateList f4910m;

    /* renamed from: m0 */
    public boolean f4911m0;

    /* renamed from: n */
    public ColorStateList f4912n;

    /* renamed from: n0 */
    public final C0910a f4913n0;

    /* renamed from: o */
    public boolean f4914o;

    /* renamed from: o0 */
    public boolean f4915o0;

    /* renamed from: p */
    public CharSequence f4916p;

    /* renamed from: p0 */
    public ValueAnimator f4917p0;

    /* renamed from: q */
    public boolean f4918q;

    /* renamed from: q0 */
    public boolean f4919q0;

    /* renamed from: r */
    public C0953g f4920r;

    /* renamed from: r0 */
    public boolean f4921r0;

    /* renamed from: s */
    public C0953g f4922s;

    /* renamed from: t */
    public C0960k f4923t;

    /* renamed from: u */
    public final int f4924u;

    /* renamed from: v */
    public int f4925v;

    /* renamed from: w */
    public final int f4926w;

    /* renamed from: x */
    public int f4927x;

    /* renamed from: y */
    public final int f4928y;

    /* renamed from: z */
    public final int f4929z;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C1180f {
        /* renamed from: a */
        void mo5762a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C1181g {
        /* renamed from: a */
        void mo5842a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f4863s0
            r1 = r27
            android.content.Context r2 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5049f(r1, r7, r8, r9)
            r0.<init>(r2, r7, r8)
            b.a.a.a.j0.f r2 = new b.a.a.a.j0.f
            r2.<init>(r0)
            r0.f4896f = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f4866C = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f4867D = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r0.f4868E = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f4877N = r2
            r10 = 0
            r0.f4878O = r10
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f4879P = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f4881R = r2
            b.a.a.a.a0.a r2 = new b.a.a.a.a0.a
            r2.<init>(r0)
            r0.f4913n0 = r2
            android.content.Context r11 = r26.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r11)
            r0.f4888b = r13
            r13.setAddStatesFromChildren(r12)
            r0.addView(r13)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r11)
            r0.f4890c = r1
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r5 = 8388629(0x800015, float:1.1754973E-38)
            r3.<init>(r4, r4, r5)
            r1.setLayoutParams(r3)
            r13.addView(r1)
            android.animation.TimeInterpolator r1 = p066b.p067a.p068a.p069a.p081l.C1023a.f4312a
            r2.mo5462T(r1)
            r2.mo5459Q(r1)
            r1 = 8388659(0x800033, float:1.1755015E-38)
            r2.mo5448F(r1)
            int[] r3 = p066b.p067a.p068a.p069a.C1020k.f4230f2
            r1 = 5
            int[] r6 = new int[r1]
            int r14 = p066b.p067a.p068a.p069a.C1020k.f4299w2
            r6[r10] = r14
            int r15 = p066b.p067a.p068a.p069a.C1020k.f4291u2
            r6[r12] = r15
            int r5 = p066b.p067a.p068a.p069a.C1020k.f4133I2
            r4 = 2
            r6[r4] = r5
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4149M2
            r1 = 3
            r6[r1] = r2
            int r10 = p066b.p067a.p068a.p069a.C1020k.f4165Q2
            r17 = 4
            r6[r17] = r10
            r1 = r11
            r18 = r2
            r2 = r28
            r4 = r29
            r19 = r5
            r5 = r9
            a.b.p.w0 r1 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5055l(r1, r2, r3, r4, r5, r6)
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4161P2
            boolean r2 = r1.mo1496a(r2, r12)
            r0.f4914o = r2
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4239h2
            java.lang.CharSequence r2 = r1.mo1511p(r2)
            r0.setHint(r2)
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4157O2
            boolean r2 = r1.mo1496a(r2, r12)
            r0.f4915o0 = r2
            b.a.a.a.g0.k$b r2 = p066b.p067a.p068a.p069a.p076g0.C0960k.m5186e(r11, r7, r8, r9)
            b.a.a.a.g0.k r2 = r2.mo5662m()
            r0.f4923t = r2
            android.content.res.Resources r2 = r11.getResources()
            int r3 = p066b.p067a.p068a.p069a.C0928d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.f4924u = r2
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4251k2
            r3 = 0
            int r2 = r1.mo1500e(r2, r3)
            r0.f4926w = r2
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4275q2
            android.content.res.Resources r3 = r11.getResources()
            int r4 = p066b.p067a.p068a.p069a.C0928d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1501f(r2, r3)
            r0.f4928y = r2
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4279r2
            android.content.res.Resources r4 = r11.getResources()
            int r5 = p066b.p067a.p068a.p069a.C0928d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo1501f(r3, r4)
            r0.f4929z = r3
            r0.f4927x = r2
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4267o2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo1499d(r2, r3)
            int r4 = p066b.p067a.p068a.p069a.C1020k.f4263n2
            float r4 = r1.mo1499d(r4, r3)
            int r5 = p066b.p067a.p068a.p069a.C1020k.f4255l2
            float r5 = r1.mo1499d(r5, r3)
            int r6 = p066b.p067a.p068a.p069a.C1020k.f4259m2
            float r3 = r1.mo1499d(r6, r3)
            b.a.a.a.g0.k r6 = r0.f4923t
            b.a.a.a.g0.k$b r6 = r6.mo5654v()
            r9 = 0
            int r17 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r17 < 0) goto L_0x013e
            r6.mo5674z(r2)
        L_0x013e:
            int r17 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r17 < 0) goto L_0x0145
            r6.mo5660D(r4)
        L_0x0145:
            int r17 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r17 < 0) goto L_0x014c
            r6.mo5670v(r5)
        L_0x014c:
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0153
            r6.mo5666r(r3)
        L_0x0153:
            b.a.a.a.g0.k r9 = r6.mo5662m()
            r0.f4923t = r9
            int r9 = p066b.p067a.p068a.p069a.C1020k.f4243i2
            android.content.res.ColorStateList r9 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r9)
            r17 = 16843623(0x1010367, float:2.3696E-38)
            r20 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r9 == 0) goto L_0x01ba
            int r12 = r9.getDefaultColor()
            r0.f4903i0 = r12
            r0.f4865B = r12
            boolean r12 = r9.isStateful()
            if (r12 == 0) goto L_0x0194
            r21 = r2
            r12 = 1
            int[] r2 = new int[r12]
            r12 = 0
            r2[r12] = r20
            r12 = -1
            int r2 = r9.getColorForState(r2, r12)
            r0.f4905j0 = r2
            r2 = 1
            int[] r12 = new int[r2]
            r2 = 0
            r12[r2] = r17
            r2 = -1
            int r12 = r9.getColorForState(r12, r2)
            r0.f4907k0 = r12
            r22 = r3
            goto L_0x01c7
        L_0x0194:
            r21 = r2
            r2 = -1
            int r12 = p066b.p067a.p068a.p069a.C0926c.mtrl_filled_background_color
            android.content.res.ColorStateList r12 = p000a.p002b.p004l.p005a.C0053a.m276c(r11, r12)
            r22 = r3
            r2 = 1
            int[] r3 = new int[r2]
            r2 = 0
            r3[r2] = r20
            r2 = -1
            int r3 = r12.getColorForState(r3, r2)
            r0.f4905j0 = r3
            r3 = 1
            int[] r2 = new int[r3]
            r3 = 0
            r2[r3] = r17
            r3 = -1
            int r2 = r12.getColorForState(r2, r3)
            r0.f4907k0 = r2
            goto L_0x01c7
        L_0x01ba:
            r21 = r2
            r22 = r3
            r2 = 0
            r0.f4865B = r2
            r0.f4903i0 = r2
            r0.f4905j0 = r2
            r0.f4907k0 = r2
        L_0x01c7:
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4235g2
            boolean r3 = r1.mo1513r(r2)
            if (r3 == 0) goto L_0x01d8
            android.content.res.ColorStateList r2 = r1.mo1498c(r2)
            r0.f4895e0 = r2
            r0.f4893d0 = r2
        L_0x01d8:
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4271p2
            android.content.res.ColorStateList r3 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r2)
            if (r3 == 0) goto L_0x0219
            boolean r12 = r3.isStateful()
            if (r12 == 0) goto L_0x0219
            int r2 = r3.getDefaultColor()
            r0.f4897f0 = r2
            r2 = 1
            int[] r12 = new int[r2]
            r2 = 0
            r12[r2] = r20
            r2 = -1
            int r12 = r3.getColorForState(r12, r2)
            r0.f4909l0 = r12
            r12 = 1
            int[] r2 = new int[r12]
            r12 = 0
            r2[r12] = r17
            r12 = -1
            int r2 = r3.getColorForState(r2, r12)
            r0.f4899g0 = r2
            r2 = 1
            int[] r12 = new int[r2]
            r2 = 16842908(0x101009c, float:2.3693995E-38)
            r17 = r4
            r4 = 0
            r12[r4] = r2
            r2 = -1
            int r12 = r3.getColorForState(r12, r2)
            r0.f4901h0 = r12
            goto L_0x023b
        L_0x0219:
            r17 = r4
            r4 = 0
            int r2 = r1.mo1497b(r2, r4)
            r0.f4901h0 = r2
            int r2 = p066b.p067a.p068a.p069a.C0926c.mtrl_textinput_default_box_stroke_color
            int r2 = p000a.p025h.p027e.C0339a.m1775a(r11, r2)
            r0.f4897f0 = r2
            int r2 = p066b.p067a.p068a.p069a.C0926c.mtrl_textinput_disabled_color
            int r2 = p000a.p025h.p027e.C0339a.m1775a(r11, r2)
            r0.f4909l0 = r2
            int r2 = p066b.p067a.p068a.p069a.C0926c.mtrl_textinput_hovered_box_stroke_color
            int r2 = p000a.p025h.p027e.C0339a.m1775a(r11, r2)
            r0.f4899g0 = r2
        L_0x023b:
            r2 = -1
            int r4 = r1.mo1509n(r10, r2)
            if (r4 == r2) goto L_0x024b
            r2 = 0
            int r10 = r1.mo1509n(r10, r2)
            r0.setHintTextAppearance(r10)
            goto L_0x024c
        L_0x024b:
            r2 = 0
        L_0x024c:
            r10 = r19
            int r10 = r1.mo1509n(r10, r2)
            int r12 = p066b.p067a.p068a.p069a.C1020k.f4117E2
            boolean r12 = r1.mo1496a(r12, r2)
            android.content.Context r16 = r26.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r16)
            r20 = r3
            int r3 = p066b.p067a.p068a.p069a.C0976h.design_text_input_end_icon
            r23 = r4
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r13, r4)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.f4889b0 = r2
            r13.addView(r2)
            r4 = 8
            r2.setVisibility(r4)
            int r4 = p066b.p067a.p068a.p069a.C1020k.f4121F2
            boolean r24 = r1.mo1513r(r4)
            if (r24 == 0) goto L_0x0288
            android.graphics.drawable.Drawable r4 = r1.mo1502g(r4)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r4)
        L_0x0288:
            int r4 = p066b.p067a.p068a.p069a.C1020k.f4125G2
            boolean r24 = r1.mo1513r(r4)
            if (r24 == 0) goto L_0x0298
            android.content.res.ColorStateList r4 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r4)
            r0.setErrorIconTintList(r4)
        L_0x0298:
            int r4 = p066b.p067a.p068a.p069a.C1020k.f4129H2
            boolean r24 = r1.mo1513r(r4)
            r25 = r5
            if (r24 == 0) goto L_0x02b0
            r5 = -1
            int r4 = r1.mo1506k(r4, r5)
            r5 = 0
            android.graphics.PorterDuff$Mode r4 = p066b.p067a.p068a.p069a.p070a0.C0922h.m5058c(r4, r5)
            r0.setErrorIconTintMode(r4)
        L_0x02b0:
            android.content.res.Resources r4 = r26.getResources()
            int r5 = p066b.p067a.p068a.p069a.C0986i.error_icon_content_description
            java.lang.CharSequence r4 = r4.getText(r5)
            r2.setContentDescription(r4)
            r4 = 2
            p000a.p025h.p038m.C0460r.m2275l0(r2, r4)
            r5 = 0
            r2.setClickable(r5)
            r2.setPressable(r5)
            r2.setFocusable(r5)
            r2 = r18
            int r2 = r1.mo1509n(r2, r5)
            int r4 = p066b.p067a.p068a.p069a.C1020k.f4145L2
            boolean r4 = r1.mo1496a(r4, r5)
            int r5 = p066b.p067a.p068a.p069a.C1020k.f4141K2
            java.lang.CharSequence r5 = r1.mo1511p(r5)
            r18 = r6
            int r6 = p066b.p067a.p068a.p069a.C1020k.f4283s2
            r7 = 0
            boolean r6 = r1.mo1496a(r6, r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4287t2
            r8 = -1
            int r7 = r1.mo1506k(r7, r8)
            r0.setCounterMaxLength(r7)
            r7 = 0
            int r8 = r1.mo1509n(r14, r7)
            r0.f4908l = r8
            int r8 = r1.mo1509n(r15, r7)
            r0.f4906k = r8
            android.content.Context r8 = r26.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r14 = p066b.p067a.p068a.p069a.C0976h.design_text_input_start_icon
            android.view.View r8 = r8.inflate(r14, r13, r7)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r0.f4870G = r8
            r13.addView(r8)
            r7 = 8
            r8.setVisibility(r7)
            r7 = 0
            r0.setStartIconOnClickListener(r7)
            r0.setStartIconOnLongClickListener(r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4201Z2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x034b
            android.graphics.drawable.Drawable r7 = r1.mo1502g(r7)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4197Y2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x0341
            java.lang.CharSequence r7 = r1.mo1511p(r7)
            r0.setStartIconContentDescription((java.lang.CharSequence) r7)
        L_0x0341:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4193X2
            r8 = 1
            boolean r7 = r1.mo1496a(r7, r8)
            r0.setStartIconCheckable(r7)
        L_0x034b:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4206a3
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x035b
            android.content.res.ColorStateList r7 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r7)
            r0.setStartIconTintList(r7)
        L_0x035b:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4211b3
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x0371
            r8 = -1
            int r7 = r1.mo1506k(r7, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r7 = p066b.p067a.p068a.p069a.p070a0.C0922h.m5058c(r7, r8)
            r0.setStartIconTintMode(r7)
        L_0x0371:
            r0.setHelperTextEnabled(r4)
            r0.setHelperText(r5)
            r0.setHelperTextTextAppearance(r2)
            r0.setErrorEnabled(r12)
            r0.setErrorTextAppearance(r10)
            int r7 = r0.f4908l
            r0.setCounterTextAppearance(r7)
            int r7 = r0.f4906k
            r0.setCounterOverflowTextAppearance(r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4137J2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x0399
            android.content.res.ColorStateList r7 = r1.mo1498c(r7)
            r0.setErrorTextColor(r7)
        L_0x0399:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4153N2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x03a8
            android.content.res.ColorStateList r7 = r1.mo1498c(r7)
            r0.setHelperTextColor(r7)
        L_0x03a8:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4169R2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x03b7
            android.content.res.ColorStateList r7 = r1.mo1498c(r7)
            r0.setHintTextColor(r7)
        L_0x03b7:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4303x2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x03c6
            android.content.res.ColorStateList r7 = r1.mo1498c(r7)
            r0.setCounterTextColor(r7)
        L_0x03c6:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4295v2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x03d6
            android.content.res.ColorStateList r7 = r1.mo1498c(r7)
            r0.setCounterOverflowTextColor(r7)
        L_0x03d6:
            r0.setCounterEnabled(r6)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4247j2
            r8 = 0
            int r7 = r1.mo1506k(r7, r8)
            r0.setBoxBackgroundMode(r7)
            android.content.Context r7 = r26.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            android.widget.FrameLayout r13 = r0.f4890c
            android.view.View r3 = r7.inflate(r3, r13, r8)
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f4880Q = r3
            android.widget.FrameLayout r7 = r0.f4890c
            r7.addView(r3)
            r7 = 8
            r3.setVisibility(r7)
            android.util.SparseArray<b.a.a.a.j0.e> r3 = r0.f4879P
            b.a.a.a.j0.b r7 = new b.a.a.a.j0.b
            r7.<init>(r0)
            r8 = -1
            r3.append(r8, r7)
            android.util.SparseArray<b.a.a.a.j0.e> r3 = r0.f4879P
            b.a.a.a.j0.g r7 = new b.a.a.a.j0.g
            r7.<init>(r0)
            r8 = 0
            r3.append(r8, r7)
            android.util.SparseArray<b.a.a.a.j0.e> r3 = r0.f4879P
            b.a.a.a.j0.h r7 = new b.a.a.a.j0.h
            r7.<init>(r0)
            r8 = 1
            r3.append(r8, r7)
            android.util.SparseArray<b.a.a.a.j0.e> r3 = r0.f4879P
            b.a.a.a.j0.a r7 = new b.a.a.a.j0.a
            r7.<init>(r0)
            r8 = 2
            r3.append(r8, r7)
            android.util.SparseArray<b.a.a.a.j0.e> r3 = r0.f4879P
            b.a.a.a.j0.d r7 = new b.a.a.a.j0.d
            r7.<init>(r0)
            r8 = 3
            r3.append(r8, r7)
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4105B2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x0471
            r7 = 0
            int r3 = r1.mo1506k(r3, r7)
            r0.setEndIconMode(r3)
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4101A2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x0456
            android.graphics.drawable.Drawable r3 = r1.mo1502g(r3)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r3)
        L_0x0456:
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4311z2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x0466
            java.lang.CharSequence r3 = r1.mo1511p(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x0466:
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4307y2
            r7 = 1
            boolean r3 = r1.mo1496a(r3, r7)
            r0.setEndIconCheckable(r3)
            goto L_0x04ba
        L_0x0471:
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4181U2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x04ba
            r7 = 0
            boolean r3 = r1.mo1496a(r3, r7)
            r0.setEndIconMode(r3)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4177T2
            android.graphics.drawable.Drawable r7 = r1.mo1502g(r7)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4173S2
            java.lang.CharSequence r7 = r1.mo1511p(r7)
            r0.setEndIconContentDescription((java.lang.CharSequence) r7)
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4185V2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x04a4
            android.content.res.ColorStateList r7 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r7)
            r0.setEndIconTintList(r7)
        L_0x04a4:
            int r7 = p066b.p067a.p068a.p069a.C1020k.f4189W2
            boolean r8 = r1.mo1513r(r7)
            if (r8 == 0) goto L_0x04ba
            r8 = -1
            int r7 = r1.mo1506k(r7, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r7 = p066b.p067a.p068a.p069a.p070a0.C0922h.m5058c(r7, r8)
            r0.setEndIconTintMode(r7)
        L_0x04ba:
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4181U2
            boolean r3 = r1.mo1513r(r3)
            if (r3 != 0) goto L_0x04e8
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4109C2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x04d2
            android.content.res.ColorStateList r3 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5074b(r11, r1, r3)
            r0.setEndIconTintList(r3)
        L_0x04d2:
            int r3 = p066b.p067a.p068a.p069a.C1020k.f4113D2
            boolean r7 = r1.mo1513r(r3)
            if (r7 == 0) goto L_0x04e8
            r7 = -1
            int r3 = r1.mo1506k(r3, r7)
            r7 = 0
            android.graphics.PorterDuff$Mode r3 = p066b.p067a.p068a.p069a.p070a0.C0922h.m5058c(r3, r7)
            r0.setEndIconTintMode(r3)
        L_0x04e8:
            r1.mo1514v()
            r3 = 2
            p000a.p025h.p038m.C0460r.m2275l0(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (child instanceof EditText) {
            FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(params);
            flp.gravity = (flp.gravity & -113) | 16;
            this.f4888b.addView(child, flp);
            this.f4888b.setLayoutParams(params);
            mo7009b0();
            setEditText((EditText) child);
            return;
        }
        super.addView(child, index, params);
    }

    public C0953g getBoxBackground() {
        int i = this.f4925v;
        if (i == 1 || i == 2) {
            return this.f4920r;
        }
        throw new IllegalStateException();
    }

    public void setBoxBackgroundMode(int boxBackgroundMode) {
        if (boxBackgroundMode != this.f4925v) {
            this.f4925v = boxBackgroundMode;
            if (this.f4892d != null) {
                mo6995J();
            }
        }
    }

    public int getBoxBackgroundMode() {
        return this.f4925v;
    }

    /* renamed from: J */
    public final void mo6995J() {
        mo7060l();
        mo6997M();
        mo7019e0();
        if (this.f4925v != 0) {
            mo7009b0();
        }
    }

    /* renamed from: l */
    public final void mo7060l() {
        int i = this.f4925v;
        if (i == 0) {
            this.f4920r = null;
            this.f4922s = null;
        } else if (i == 1) {
            this.f4920r = new C0953g(this.f4923t);
            this.f4922s = new C0953g();
        } else if (i == 2) {
            if (!this.f4914o || (this.f4920r instanceof C0999c)) {
                this.f4920r = new C0953g(this.f4923t);
            } else {
                this.f4920r = new C0999c(this.f4923t);
            }
            this.f4922s = null;
        } else {
            throw new IllegalArgumentException(this.f4925v + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: M */
    public final void mo6997M() {
        if (mo6999R()) {
            C0460r.m2263f0(this.f4892d, this.f4920r);
        }
    }

    /* renamed from: R */
    public final boolean mo6999R() {
        EditText editText = this.f4892d;
        return (editText == null || this.f4920r == null || editText.getBackground() != null || this.f4925v == 0) ? false : true;
    }

    public void setBoxStrokeColor(int boxStrokeColor) {
        if (this.f4901h0 != boxStrokeColor) {
            this.f4901h0 = boxStrokeColor;
            mo7019e0();
        }
    }

    public int getBoxStrokeColor() {
        return this.f4901h0;
    }

    public void setBoxBackgroundColorResource(int boxBackgroundColorId) {
        setBoxBackgroundColor(C0339a.m1775a(getContext(), boxBackgroundColorId));
    }

    public void setBoxBackgroundColor(int boxBackgroundColor) {
        if (this.f4865B != boxBackgroundColor) {
            this.f4865B = boxBackgroundColor;
            this.f4903i0 = boxBackgroundColor;
            mo7020f();
        }
    }

    public int getBoxBackgroundColor() {
        return this.f4865B;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f4920r.mo5574E();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f4920r.mo5575F();
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f4920r.mo5623r();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f4920r.mo5624s();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f4869F) {
            this.f4869F = typeface;
            this.f4913n0.mo5463U(typeface);
            this.f4896f.mo5807G(typeface);
            TextView textView = this.f4904j;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public Typeface getTypeface() {
        return this.f4869F;
    }

    public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
        EditText editText;
        if (this.f4894e == null || (editText = this.f4892d) == null) {
            super.dispatchProvideAutofillStructure(structure, flags);
            return;
        }
        boolean wasProvidingHint = this.f4918q;
        this.f4918q = false;
        CharSequence hint = editText.getHint();
        this.f4892d.setHint(this.f4894e);
        try {
            super.dispatchProvideAutofillStructure(structure, flags);
        } finally {
            this.f4892d.setHint(hint);
            this.f4918q = wasProvidingHint;
        }
    }

    private void setEditText(EditText editText) {
        if (this.f4892d == null) {
            if (this.f4878O != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f4892d = editText;
            mo6995J();
            setTextInputAccessibilityDelegate(new C1179e(this));
            this.f4913n0.mo5463U(this.f4892d.getTypeface());
            this.f4913n0.mo5455M(this.f4892d.getTextSize());
            int editTextGravity = this.f4892d.getGravity();
            this.f4913n0.mo5448F((editTextGravity & -113) | 48);
            this.f4913n0.mo5454L(editTextGravity);
            this.f4892d.addTextChangedListener(new C1175a());
            if (this.f4893d0 == null) {
                this.f4893d0 = this.f4892d.getHintTextColors();
            }
            if (this.f4914o) {
                if (TextUtils.isEmpty(this.f4916p)) {
                    CharSequence hint = this.f4892d.getHint();
                    this.f4894e = hint;
                    setHint(hint);
                    this.f4892d.setHint((CharSequence) null);
                }
                this.f4918q = true;
            }
            if (this.f4904j != null) {
                mo7003V(this.f4892d.getText().length());
            }
            mo7005Y();
            this.f4896f.mo5814e();
            this.f4870G.bringToFront();
            this.f4890c.bringToFront();
            this.f4889b0.bringToFront();
            mo7136x();
            mo7013d0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C1175a implements TextWatcher {
        public C1175a() {
        }

        public void afterTextChanged(Editable s) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo7011c0(!textInputLayout.f4921r0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f4898g) {
                textInputLayout2.mo7003V(s.length());
            }
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }
    }

    /* renamed from: b0 */
    public final void mo7009b0() {
        if (this.f4925v != 1) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f4888b.getLayoutParams();
            int newTopMargin = mo7070r();
            if (newTopMargin != lp.topMargin) {
                lp.topMargin = newTopMargin;
                this.f4888b.requestLayout();
            }
        }
    }

    public int getBaseline() {
        EditText editText = this.f4892d;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + mo7070r();
        }
        return super.getBaseline();
    }

    /* renamed from: c0 */
    public void mo7011c0(boolean animate) {
        mo7013d0(animate, false);
    }

    /* renamed from: d0 */
    public final void mo7013d0(boolean animate, boolean force) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f4892d;
        boolean hasFocus = true;
        boolean hasText = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f4892d;
        if (editText2 == null || !editText2.hasFocus()) {
            hasFocus = false;
        }
        boolean errorShouldBeShown = this.f4896f.mo5820k();
        ColorStateList colorStateList2 = this.f4893d0;
        if (colorStateList2 != null) {
            this.f4913n0.mo5447E(colorStateList2);
            this.f4913n0.mo5453K(this.f4893d0);
        }
        if (!isEnabled) {
            this.f4913n0.mo5447E(ColorStateList.valueOf(this.f4909l0));
            this.f4913n0.mo5453K(ColorStateList.valueOf(this.f4909l0));
        } else if (errorShouldBeShown) {
            this.f4913n0.mo5447E(this.f4896f.mo5824o());
        } else if (this.f4902i && (textView = this.f4904j) != null) {
            this.f4913n0.mo5447E(textView.getTextColors());
        } else if (hasFocus && (colorStateList = this.f4895e0) != null) {
            this.f4913n0.mo5447E(colorStateList);
        }
        if (hasText || (isEnabled() && (hasFocus || errorShouldBeShown))) {
            if (force || this.f4911m0) {
                mo7134v(animate);
            }
        } else if (force || !this.f4911m0) {
            mo6987B(animate);
        }
    }

    public EditText getEditText() {
        return this.f4892d;
    }

    public void setHint(CharSequence hint) {
        if (this.f4914o) {
            setHintInternal(hint);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(CharSequence hint) {
        if (!TextUtils.equals(hint, this.f4916p)) {
            this.f4916p = hint;
            this.f4913n0.mo5461S(hint);
            if (!this.f4911m0) {
                mo6996K();
            }
        }
    }

    public CharSequence getHint() {
        if (this.f4914o) {
            return this.f4916p;
        }
        return null;
    }

    public void setHintEnabled(boolean enabled) {
        if (enabled != this.f4914o) {
            this.f4914o = enabled;
            if (!enabled) {
                this.f4918q = false;
                if (!TextUtils.isEmpty(this.f4916p) && TextUtils.isEmpty(this.f4892d.getHint())) {
                    this.f4892d.setHint(this.f4916p);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence editTextHint = this.f4892d.getHint();
                if (!TextUtils.isEmpty(editTextHint)) {
                    if (TextUtils.isEmpty(this.f4916p)) {
                        setHint(editTextHint);
                    }
                    this.f4892d.setHint((CharSequence) null);
                }
                this.f4918q = true;
            }
            if (this.f4892d != null) {
                mo7009b0();
            }
        }
    }

    /* renamed from: G */
    public boolean mo6992G() {
        return this.f4918q;
    }

    public void setHintTextAppearance(int resId) {
        this.f4913n0.mo5446D(resId);
        this.f4895e0 = this.f4913n0.mo5474l();
        if (this.f4892d != null) {
            mo7011c0(false);
            mo7009b0();
        }
    }

    public void setHintTextColor(ColorStateList hintTextColor) {
        if (this.f4895e0 != hintTextColor) {
            if (this.f4893d0 == null) {
                this.f4913n0.mo5447E(hintTextColor);
            }
            this.f4895e0 = hintTextColor;
            if (this.f4892d != null) {
                mo7011c0(false);
            }
        }
    }

    public ColorStateList getHintTextColor() {
        return this.f4895e0;
    }

    public void setDefaultHintTextColor(ColorStateList textColor) {
        this.f4893d0 = textColor;
        this.f4895e0 = textColor;
        if (this.f4892d != null) {
            mo7011c0(false);
        }
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f4893d0;
    }

    public void setErrorEnabled(boolean enabled) {
        this.f4896f.mo5835z(enabled);
    }

    public void setErrorTextAppearance(int errorTextAppearance) {
        this.f4896f.mo5801A(errorTextAppearance);
    }

    public void setErrorTextColor(ColorStateList errorTextColor) {
        this.f4896f.mo5802B(errorTextColor);
    }

    public int getErrorCurrentTextColors() {
        return this.f4896f.mo5823n();
    }

    public void setHelperTextTextAppearance(int helperTextTextAppearance) {
        this.f4896f.mo5803C(helperTextTextAppearance);
    }

    public void setHelperTextColor(ColorStateList helperTextColor) {
        this.f4896f.mo5805E(helperTextColor);
    }

    public void setHelperTextEnabled(boolean enabled) {
        this.f4896f.mo5804D(enabled);
    }

    public void setHelperText(CharSequence helperText) {
        if (!TextUtils.isEmpty(helperText)) {
            if (!mo6991F()) {
                setHelperTextEnabled(true);
            }
            this.f4896f.mo5811K(helperText);
        } else if (mo6991F()) {
            setHelperTextEnabled(false);
        }
    }

    /* renamed from: F */
    public boolean mo6991F() {
        return this.f4896f.mo5832w();
    }

    public int getHelperTextCurrentTextColor() {
        return this.f4896f.mo5826q();
    }

    public void setError(CharSequence errorText) {
        if (!this.f4896f.mo5831v()) {
            if (!TextUtils.isEmpty(errorText)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(errorText)) {
            this.f4896f.mo5810J(errorText);
        } else {
            this.f4896f.mo5827r();
        }
    }

    public void setErrorIconDrawable(int resId) {
        setErrorIconDrawable(resId != 0 ? C0053a.m277d(getContext(), resId) : null);
    }

    public void setErrorIconDrawable(Drawable errorIconDrawable) {
        this.f4889b0.setImageDrawable(errorIconDrawable);
        setErrorIconVisible(errorIconDrawable != null && this.f4896f.mo5831v());
    }

    public Drawable getErrorIconDrawable() {
        return this.f4889b0.getDrawable();
    }

    public void setErrorIconTintList(ColorStateList errorIconTintList) {
        Drawable icon = this.f4889b0.getDrawable();
        if (icon != null) {
            icon = C0370a.m1948r(icon).mutate();
            C0370a.m1945o(icon, errorIconTintList);
        }
        if (this.f4889b0.getDrawable() != icon) {
            this.f4889b0.setImageDrawable(icon);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode errorIconTintMode) {
        Drawable icon = this.f4889b0.getDrawable();
        if (icon != null) {
            icon = C0370a.m1948r(icon).mutate();
            C0370a.m1946p(icon, errorIconTintMode);
        }
        if (this.f4889b0.getDrawable() != icon) {
            this.f4889b0.setImageDrawable(icon);
        }
    }

    public void setCounterEnabled(boolean enabled) {
        if (this.f4898g != enabled) {
            if (enabled) {
                C0227z zVar = new C0227z(getContext());
                this.f4904j = zVar;
                zVar.setId(C0943f.textinput_counter);
                Typeface typeface = this.f4869F;
                if (typeface != null) {
                    this.f4904j.setTypeface(typeface);
                }
                this.f4904j.setMaxLines(1);
                this.f4896f.mo5813d(this.f4904j, 2);
                mo7004X();
                mo7002U();
            } else {
                this.f4896f.mo5833x(this.f4904j, 2);
                this.f4904j = null;
            }
            this.f4898g = enabled;
        }
    }

    public void setCounterTextAppearance(int counterTextAppearance) {
        if (this.f4908l != counterTextAppearance) {
            this.f4908l = counterTextAppearance;
            mo7004X();
        }
    }

    public void setCounterTextColor(ColorStateList counterTextColor) {
        if (this.f4910m != counterTextColor) {
            this.f4910m = counterTextColor;
            mo7004X();
        }
    }

    public ColorStateList getCounterTextColor() {
        return this.f4910m;
    }

    public void setCounterOverflowTextAppearance(int counterOverflowTextAppearance) {
        if (this.f4906k != counterOverflowTextAppearance) {
            this.f4906k = counterOverflowTextAppearance;
            mo7004X();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList counterOverflowTextColor) {
        if (this.f4912n != counterOverflowTextColor) {
            this.f4912n = counterOverflowTextColor;
            mo7004X();
        }
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f4910m;
    }

    public void setCounterMaxLength(int maxLength) {
        if (this.f4900h != maxLength) {
            if (maxLength > 0) {
                this.f4900h = maxLength;
            } else {
                this.f4900h = -1;
            }
            if (this.f4898g) {
                mo7002U();
            }
        }
    }

    /* renamed from: U */
    public final void mo7002U() {
        if (this.f4904j != null) {
            EditText editText = this.f4892d;
            mo7003V(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: V */
    public void mo7003V(int length) {
        boolean wasCounterOverflowed = this.f4902i;
        if (this.f4900h == -1) {
            this.f4904j.setText(String.valueOf(length));
            this.f4904j.setContentDescription((CharSequence) null);
            this.f4902i = false;
        } else {
            if (C0460r.m2270j(this.f4904j) == 1) {
                C0460r.m2261e0(this.f4904j, 0);
            }
            this.f4902i = length > this.f4900h;
            m6304W(getContext(), this.f4904j, length, this.f4900h, this.f4902i);
            if (wasCounterOverflowed != this.f4902i) {
                mo7004X();
                if (this.f4902i) {
                    C0460r.m2261e0(this.f4904j, 1);
                }
            }
            this.f4904j.setText(getContext().getString(C0986i.character_counter_pattern, new Object[]{Integer.valueOf(length), Integer.valueOf(this.f4900h)}));
        }
        if (this.f4892d != null && wasCounterOverflowed != this.f4902i) {
            mo7011c0(false);
            mo7019e0();
            mo7005Y();
        }
    }

    /* renamed from: W */
    public static void m6304W(Context context, TextView counterView, int length, int counterMaxLength, boolean counterOverflowed) {
        counterView.setContentDescription(context.getString(counterOverflowed ? C0986i.character_counter_overflowed_content_description : C0986i.character_counter_content_description, new Object[]{Integer.valueOf(length), Integer.valueOf(counterMaxLength)}));
    }

    public void setEnabled(boolean enabled) {
        m6300L(this, enabled);
        super.setEnabled(enabled);
    }

    /* renamed from: L */
    public static void m6300L(ViewGroup vg, boolean enabled) {
        int count = vg.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = vg.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                m6300L((ViewGroup) child, enabled);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f4900h;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f4898g || !this.f4902i || (textView = this.f4904j) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    /* renamed from: X */
    public final void mo7004X() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f4904j;
        if (textView != null) {
            mo6998Q(textView, this.f4902i ? this.f4906k : this.f4908l);
            if (!this.f4902i && (colorStateList2 = this.f4910m) != null) {
                this.f4904j.setTextColor(colorStateList2);
            }
            if (this.f4902i && (colorStateList = this.f4912n) != null) {
                this.f4904j.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: Q */
    public void mo6998Q(TextView textView, int textAppearance) {
        boolean useDefaultColor = false;
        try {
            C0490i.m2439n(textView, textAppearance);
            if (Build.VERSION.SDK_INT >= 23 && textView.getTextColors().getDefaultColor() == -65281) {
                useDefaultColor = true;
            }
        } catch (Exception e) {
            useDefaultColor = true;
        }
        if (useDefaultColor) {
            C0490i.m2439n(textView, C0989j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0339a.m1775a(getContext(), C0926c.design_error));
        }
    }

    /* renamed from: r */
    public final int mo7070r() {
        if (!this.f4914o) {
            return 0;
        }
        int i = this.f4925v;
        if (i == 0 || i == 1) {
            return (int) this.f4913n0.mo5475m();
        }
        if (i != 2) {
            return 0;
        }
        return (int) (this.f4913n0.mo5475m() / 2.0f);
    }

    /* renamed from: n */
    public final Rect mo7062n(Rect rect) {
        EditText editText = this.f4892d;
        if (editText != null) {
            Rect bounds = this.f4867D;
            bounds.bottom = rect.bottom;
            int i = this.f4925v;
            if (i == 1) {
                bounds.left = rect.left + editText.getCompoundPaddingLeft();
                bounds.top = rect.top + this.f4926w;
                bounds.right = rect.right - this.f4892d.getCompoundPaddingRight();
                return bounds;
            } else if (i != 2) {
                bounds.left = rect.left + editText.getCompoundPaddingLeft();
                bounds.top = getPaddingTop();
                bounds.right = rect.right - this.f4892d.getCompoundPaddingRight();
                return bounds;
            } else {
                bounds.left = rect.left + editText.getPaddingLeft();
                bounds.top = rect.top - mo7070r();
                bounds.right = rect.right - this.f4892d.getPaddingRight();
                return bounds;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: q */
    public final Rect mo7069q(Rect rect) {
        if (this.f4892d != null) {
            Rect bounds = this.f4867D;
            float labelHeight = this.f4913n0.mo5479q();
            bounds.left = rect.left + this.f4892d.getCompoundPaddingLeft();
            bounds.top = mo7068p(rect, labelHeight);
            bounds.right = rect.right - this.f4892d.getCompoundPaddingRight();
            bounds.bottom = mo7063o(rect, bounds, labelHeight);
            return bounds;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public final int mo7068p(Rect rect, float labelHeight) {
        if (mo6993H()) {
            return (int) (((float) rect.centerY()) - (labelHeight / 2.0f));
        }
        return rect.top + this.f4892d.getCompoundPaddingTop();
    }

    /* renamed from: o */
    public final int mo7063o(Rect rect, Rect bounds, float labelHeight) {
        if (this.f4925v == 1) {
            return (int) (((float) bounds.top) + labelHeight);
        }
        return rect.bottom - this.f4892d.getCompoundPaddingBottom();
    }

    /* renamed from: H */
    public final boolean mo6993H() {
        if (this.f4925v != 1 || (Build.VERSION.SDK_INT >= 16 && this.f4892d.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final int mo7061m() {
        int backgroundColor = this.f4865B;
        if (this.f4925v == 1) {
            return C1060a.m5723e(C1060a.m5722d(this, C0924b.colorSurface, 0), this.f4865B);
        }
        return backgroundColor;
    }

    /* renamed from: f */
    public final void mo7020f() {
        C0953g gVar = this.f4920r;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f4923t);
            if (mo7071s()) {
                this.f4920r.mo5593Y((float) this.f4927x, this.f4864A);
            }
            int m = mo7061m();
            this.f4865B = m;
            this.f4920r.mo5588T(ColorStateList.valueOf(m));
            if (this.f4878O == 3) {
                this.f4892d.getBackground().invalidateSelf();
            }
            mo7021g();
            invalidate();
        }
    }

    /* renamed from: g */
    public final void mo7021g() {
        if (this.f4922s != null) {
            if (mo7132t()) {
                this.f4922s.mo5588T(ColorStateList.valueOf(this.f4864A));
            }
            invalidate();
        }
    }

    /* renamed from: s */
    public final boolean mo7071s() {
        return this.f4925v == 2 && mo7132t();
    }

    /* renamed from: t */
    public final boolean mo7132t() {
        return this.f4927x > -1 && this.f4864A != 0;
    }

    /* renamed from: Y */
    public void mo7005Y() {
        Drawable editTextBackground;
        TextView textView;
        EditText editText = this.f4892d;
        if (editText != null && this.f4925v == 0 && (editTextBackground = editText.getBackground()) != null) {
            if (C0145e0.m824a(editTextBackground)) {
                editTextBackground = editTextBackground.mutate();
            }
            if (this.f4896f.mo5820k()) {
                editTextBackground.setColorFilter(C0160j.m884e(this.f4896f.mo5823n(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f4902i || (textView = this.f4904j) == null) {
                C0370a.m1933c(editTextBackground);
                this.f4892d.refreshDrawableState();
            } else {
                editTextBackground.setColorFilter(C0160j.m884e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C1182h extends C0501a {
        public static final Parcelable.Creator<C1182h> CREATOR = new C1183a();

        /* renamed from: d */
        public CharSequence f4935d;

        /* renamed from: e */
        public boolean f4936e;

        public C1182h(Parcelable superState) {
            super(superState);
        }

        public C1182h(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f4935d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(source);
            this.f4936e = source.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            TextUtils.writeToParcel(this.f4935d, dest, flags);
            dest.writeInt(this.f4936e ? 1 : 0);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f4935d + "}";
        }

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        public static class C1183a implements Parcelable.ClassLoaderCreator<C1182h> {
            /* renamed from: b */
            public C1182h createFromParcel(Parcel in, ClassLoader loader) {
                return new C1182h(in, loader);
            }

            /* renamed from: a */
            public C1182h createFromParcel(Parcel in) {
                return new C1182h(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C1182h[] newArray(int size) {
                return new C1182h[size];
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C1182h ss = new C1182h(super.onSaveInstanceState());
        if (this.f4896f.mo5820k()) {
            ss.f4935d = getError();
        }
        ss.f4936e = mo6988C() && this.f4880Q.isChecked();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C1182h)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C1182h ss = (C1182h) state;
        super.onRestoreInstanceState(ss.mo2682f());
        setError(ss.f4935d);
        if (ss.f4936e) {
            this.f4880Q.post(new C1176b());
        }
        requestLayout();
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C1176b implements Runnable {
        public C1176b() {
        }

        public void run() {
            TextInputLayout.this.f4880Q.performClick();
            TextInputLayout.this.f4880Q.jumpDrawablesToCurrentState();
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        this.f4921r0 = true;
        super.dispatchRestoreInstanceState(container);
        this.f4921r0 = false;
    }

    public CharSequence getError() {
        if (this.f4896f.mo5831v()) {
            return this.f4896f.mo5822m();
        }
        return null;
    }

    public CharSequence getHelperText() {
        if (this.f4896f.mo5832w()) {
            return this.f4896f.mo5825p();
        }
        return null;
    }

    public void setHintAnimationEnabled(boolean enabled) {
        this.f4915o0 = enabled;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        boolean updatedHeight = mo7006Z();
        boolean updatedIcon = mo7007a0();
        if (updatedHeight || updatedIcon) {
            this.f4892d.post(new C1177c());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C1177c implements Runnable {
        public C1177c() {
        }

        public void run() {
            TextInputLayout.this.f4892d.requestLayout();
        }
    }

    /* renamed from: Z */
    public final boolean mo7006Z() {
        int maxIconHeight;
        if (this.f4892d == null || this.f4892d.getMeasuredHeight() >= (maxIconHeight = Math.max(this.f4880Q.getMeasuredHeight(), this.f4870G.getMeasuredHeight()))) {
            return false;
        }
        this.f4892d.setMinimumHeight(maxIconHeight);
        return true;
    }

    public void setStartIconDrawable(int resId) {
        setStartIconDrawable(resId != 0 ? C0053a.m277d(getContext(), resId) : null);
    }

    public void setStartIconDrawable(Drawable startIconDrawable) {
        this.f4870G.setImageDrawable(startIconDrawable);
        if (startIconDrawable != null) {
            setStartIconVisible(true);
            mo7059k();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    public Drawable getStartIconDrawable() {
        return this.f4870G.getDrawable();
    }

    public void setStartIconOnClickListener(View.OnClickListener startIconOnClickListener) {
        m6302O(this.f4870G, startIconOnClickListener, this.f4876M);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener startIconOnLongClickListener) {
        this.f4876M = startIconOnLongClickListener;
        m6303P(this.f4870G, startIconOnLongClickListener);
    }

    public void setStartIconVisible(boolean visible) {
        if (mo6994I() != visible) {
            this.f4870G.setVisibility(visible ? 0 : 8);
            mo7007a0();
        }
    }

    /* renamed from: I */
    public boolean mo6994I() {
        return this.f4870G.getVisibility() == 0;
    }

    public void setStartIconCheckable(boolean startIconCheckable) {
        this.f4870G.setCheckable(startIconCheckable);
    }

    public void setStartIconContentDescription(int resId) {
        setStartIconContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setStartIconContentDescription(CharSequence startIconContentDescription) {
        if (getStartIconContentDescription() != startIconContentDescription) {
            this.f4870G.setContentDescription(startIconContentDescription);
        }
    }

    public CharSequence getStartIconContentDescription() {
        return this.f4870G.getContentDescription();
    }

    public void setStartIconTintList(ColorStateList startIconTintList) {
        if (this.f4871H != startIconTintList) {
            this.f4871H = startIconTintList;
            this.f4872I = true;
            mo7059k();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode startIconTintMode) {
        if (this.f4873J != startIconTintMode) {
            this.f4873J = startIconTintMode;
            this.f4874K = true;
            mo7059k();
        }
    }

    public void setEndIconMode(int endIconMode) {
        int previousEndIconMode = this.f4878O;
        this.f4878O = endIconMode;
        setEndIconVisible(endIconMode != 0);
        if (getEndIconDelegate().mo5780b(this.f4925v)) {
            getEndIconDelegate().mo5755a();
            mo7057i();
            mo7137y(previousEndIconMode);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f4925v + " is not supported by the end icon mode " + endIconMode);
    }

    public int getEndIconMode() {
        return this.f4878O;
    }

    public void setEndIconOnClickListener(View.OnClickListener endIconOnClickListener) {
        m6302O(this.f4880Q, endIconOnClickListener, this.f4891c0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener endIconOnLongClickListener) {
        this.f4891c0 = endIconOnLongClickListener;
        m6303P(this.f4880Q, endIconOnLongClickListener);
    }

    public void setEndIconVisible(boolean visible) {
        if (mo6990E() != visible) {
            this.f4880Q.setVisibility(visible ? 0 : 4);
            mo7007a0();
        }
    }

    /* renamed from: E */
    public boolean mo6990E() {
        return this.f4890c.getVisibility() == 0 && this.f4880Q.getVisibility() == 0;
    }

    public void setEndIconActivated(boolean endIconActivated) {
        this.f4880Q.setActivated(endIconActivated);
    }

    public void setEndIconCheckable(boolean endIconCheckable) {
        this.f4880Q.setCheckable(endIconCheckable);
    }

    public void setEndIconDrawable(int resId) {
        setEndIconDrawable(resId != 0 ? C0053a.m277d(getContext(), resId) : null);
    }

    public void setEndIconDrawable(Drawable endIconDrawable) {
        this.f4880Q.setImageDrawable(endIconDrawable);
    }

    public Drawable getEndIconDrawable() {
        return this.f4880Q.getDrawable();
    }

    public void setEndIconContentDescription(int resId) {
        setEndIconContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    public void setEndIconContentDescription(CharSequence endIconContentDescription) {
        if (getEndIconContentDescription() != endIconContentDescription) {
            this.f4880Q.setContentDescription(endIconContentDescription);
        }
    }

    public CharSequence getEndIconContentDescription() {
        return this.f4880Q.getContentDescription();
    }

    public void setEndIconTintList(ColorStateList endIconTintList) {
        if (this.f4882S != endIconTintList) {
            this.f4882S = endIconTintList;
            this.f4883T = true;
            mo7057i();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode endIconTintMode) {
        if (this.f4884U != endIconTintMode) {
            this.f4884U = endIconTintMode;
            this.f4885V = true;
            mo7057i();
        }
    }

    /* renamed from: d */
    public void mo7012d(C1181g listener) {
        this.f4881R.add(listener);
    }

    /* renamed from: c */
    public void mo7010c(C1180f listener) {
        this.f4877N.add(listener);
        if (this.f4892d != null) {
            listener.mo5762a(this);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int resId) {
        setPasswordVisibilityToggleDrawable(resId != 0 ? C0053a.m277d(getContext(), resId) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable icon) {
        this.f4880Q.setImageDrawable(icon);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int resId) {
        setPasswordVisibilityToggleContentDescription(resId != 0 ? getResources().getText(resId) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence description) {
        this.f4880Q.setContentDescription(description);
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f4880Q.getDrawable();
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f4880Q.getContentDescription();
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean enabled) {
        if (enabled && this.f4878O != 1) {
            setEndIconMode(1);
        } else if (!enabled) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList tintList) {
        this.f4882S = tintList;
        this.f4883T = true;
        mo7057i();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f4884U = mode;
        this.f4885V = true;
        mo7057i();
    }

    public void setTextInputAccessibilityDelegate(C1179e delegate) {
        EditText editText = this.f4892d;
        if (editText != null) {
            C0460r.m2257c0(editText, delegate);
        }
    }

    public CheckableImageButton getEndIconView() {
        return this.f4880Q;
    }

    private C1011e getEndIconDelegate() {
        C1011e endIconDelegate = this.f4879P.get(this.f4878O);
        return endIconDelegate != null ? endIconDelegate : this.f4879P.get(0);
    }

    /* renamed from: x */
    public final void mo7136x() {
        Iterator it = this.f4877N.iterator();
        while (it.hasNext()) {
            ((C1180f) it.next()).mo5762a(this);
        }
    }

    /* renamed from: D */
    public final boolean mo6989D() {
        return getStartIconDrawable() != null;
    }

    /* renamed from: k */
    public final void mo7059k() {
        mo7058j(this.f4870G, this.f4872I, this.f4871H, this.f4874K, this.f4873J);
    }

    /* renamed from: C */
    public final boolean mo6988C() {
        return this.f4878O != 0;
    }

    /* renamed from: y */
    public final void mo7137y(int previousIcon) {
        Iterator it = this.f4881R.iterator();
        while (it.hasNext()) {
            ((C1181g) it.next()).mo5842a(this, previousIcon);
        }
    }

    /* renamed from: S */
    public final void mo7000S(boolean tintEndIconOnError) {
        if (!tintEndIconOnError || getEndIconDrawable() == null) {
            mo7057i();
            return;
        }
        Drawable endIconDrawable = C0370a.m1948r(getEndIconDrawable()).mutate();
        C0370a.m1944n(endIconDrawable, this.f4896f.mo5823n());
        this.f4880Q.setImageDrawable(endIconDrawable);
    }

    /* renamed from: i */
    public final void mo7057i() {
        mo7058j(this.f4880Q, this.f4883T, this.f4882S, this.f4885V, this.f4884U);
    }

    /* renamed from: a0 */
    public final boolean mo7007a0() {
        if (this.f4892d == null) {
            return false;
        }
        boolean updatedIcon = false;
        if (mo6989D() && mo6994I() && this.f4870G.getMeasuredWidth() > 0) {
            if (this.f4875L == null) {
                this.f4875L = new ColorDrawable();
                this.f4875L.setBounds(0, 0, (this.f4870G.getMeasuredWidth() - this.f4892d.getPaddingLeft()) + C0448f.m2184a((ViewGroup.MarginLayoutParams) this.f4870G.getLayoutParams()), 1);
            }
            Drawable[] compounds = C0490i.m2426a(this.f4892d);
            Drawable drawable = compounds[0];
            Drawable drawable2 = this.f4875L;
            if (drawable != drawable2) {
                C0490i.m2434i(this.f4892d, drawable2, compounds[1], compounds[2], compounds[3]);
                updatedIcon = true;
            }
        } else if (this.f4875L != null) {
            Drawable[] compounds2 = C0490i.m2426a(this.f4892d);
            C0490i.m2434i(this.f4892d, (Drawable) null, compounds2[1], compounds2[2], compounds2[3]);
            this.f4875L = null;
            updatedIcon = true;
        }
        CheckableImageButton iconView = getEndIconToUpdateDummyDrawable();
        if (iconView != null && iconView.getMeasuredWidth() > 0) {
            if (this.f4886W == null) {
                this.f4886W = new ColorDrawable();
                this.f4886W.setBounds(0, 0, (iconView.getMeasuredWidth() - this.f4892d.getPaddingRight()) + C0448f.m2185b((ViewGroup.MarginLayoutParams) iconView.getLayoutParams()), 1);
            }
            Drawable[] compounds3 = C0490i.m2426a(this.f4892d);
            Drawable drawable3 = compounds3[2];
            Drawable drawable4 = this.f4886W;
            if (drawable3 == drawable4) {
                return updatedIcon;
            }
            this.f4887a0 = compounds3[2];
            C0490i.m2434i(this.f4892d, compounds3[0], compounds3[1], drawable4, compounds3[3]);
            return true;
        } else if (this.f4886W == null) {
            return updatedIcon;
        } else {
            Drawable[] compounds4 = C0490i.m2426a(this.f4892d);
            if (compounds4[2] == this.f4886W) {
                C0490i.m2434i(this.f4892d, compounds4[0], compounds4[1], this.f4887a0, compounds4[3]);
                updatedIcon = true;
            }
            this.f4886W = null;
            return updatedIcon;
        }
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f4889b0.getVisibility() == 0) {
            return this.f4889b0;
        }
        if (!mo6988C() || !mo6990E()) {
            return null;
        }
        return this.f4880Q;
    }

    /* renamed from: j */
    public final void mo7058j(CheckableImageButton iconView, boolean hasIconTintList, ColorStateList iconTintList, boolean hasIconTintMode, PorterDuff.Mode iconTintMode) {
        Drawable icon = iconView.getDrawable();
        if (icon != null && (hasIconTintList || hasIconTintMode)) {
            icon = C0370a.m1948r(icon).mutate();
            if (hasIconTintList) {
                C0370a.m1945o(icon, iconTintList);
            }
            if (hasIconTintMode) {
                C0370a.m1946p(icon, iconTintMode);
            }
        }
        if (iconView.getDrawable() != icon) {
            iconView.setImageDrawable(icon);
        }
    }

    /* renamed from: O */
    public static void m6302O(CheckableImageButton iconView, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        iconView.setOnClickListener(onClickListener);
        m6301N(iconView, onLongClickListener);
    }

    /* renamed from: P */
    public static void m6303P(CheckableImageButton iconView, View.OnLongClickListener onLongClickListener) {
        iconView.setOnLongClickListener(onLongClickListener);
        m6301N(iconView, onLongClickListener);
    }

    /* renamed from: N */
    public static void m6301N(CheckableImageButton iconView, View.OnLongClickListener onLongClickListener) {
        boolean iconClickable = C0460r.m2230E(iconView);
        boolean iconFocusable = false;
        int i = 1;
        boolean iconLongClickable = onLongClickListener != null;
        if (iconClickable || iconLongClickable) {
            iconFocusable = true;
        }
        iconView.setFocusable(iconFocusable);
        iconView.setClickable(iconClickable);
        iconView.setPressable(iconClickable);
        iconView.setLongClickable(iconLongClickable);
        if (!iconFocusable) {
            i = 2;
        }
        C0460r.m2275l0(iconView, i);
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        EditText editText = this.f4892d;
        if (editText != null) {
            Rect rect = this.f4866C;
            C0912b.m5020a(this, editText, rect);
            mo7001T(rect);
            if (this.f4914o) {
                this.f4913n0.mo5445C(mo7062n(rect));
                this.f4913n0.mo5452J(mo7069q(rect));
                this.f4913n0.mo5486z();
                if (mo7135w() && !this.f4911m0) {
                    mo6996K();
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo7001T(Rect bounds) {
        C0953g gVar = this.f4922s;
        if (gVar != null) {
            int i = bounds.bottom;
            gVar.setBounds(bounds.left, i - this.f4929z, bounds.right, i);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo6986A(canvas);
        mo7138z(canvas);
    }

    /* renamed from: A */
    public final void mo6986A(Canvas canvas) {
        if (this.f4914o) {
            this.f4913n0.mo5471i(canvas);
        }
    }

    /* renamed from: z */
    public final void mo7138z(Canvas canvas) {
        C0953g gVar = this.f4922s;
        if (gVar != null) {
            Rect underlineBounds = gVar.getBounds();
            underlineBounds.top = underlineBounds.bottom - this.f4927x;
            this.f4922s.draw(canvas);
        }
    }

    /* renamed from: v */
    public final void mo7134v(boolean animate) {
        ValueAnimator valueAnimator = this.f4917p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f4917p0.cancel();
        }
        if (!animate || !this.f4915o0) {
            this.f4913n0.mo5457O(1.0f);
        } else {
            mo7018e(1.0f);
        }
        this.f4911m0 = false;
        if (mo7135w()) {
            mo6996K();
        }
    }

    /* renamed from: w */
    public final boolean mo7135w() {
        return this.f4914o && !TextUtils.isEmpty(this.f4916p) && (this.f4920r instanceof C0999c);
    }

    /* renamed from: K */
    public final void mo6996K() {
        if (mo7135w()) {
            RectF cutoutBounds = this.f4868E;
            this.f4913n0.mo5473k(cutoutBounds);
            mo7056h(cutoutBounds);
            cutoutBounds.offset((float) (-getPaddingLeft()), 0.0f);
            ((C0999c) this.f4920r).mo5774l0(cutoutBounds);
        }
    }

    /* renamed from: u */
    public final void mo7133u() {
        if (mo7135w()) {
            ((C0999c) this.f4920r).mo5771i0();
        }
    }

    /* renamed from: h */
    public final void mo7056h(RectF cutoutBounds) {
        float f = cutoutBounds.left;
        int i = this.f4924u;
        cutoutBounds.left = f - ((float) i);
        cutoutBounds.top -= (float) i;
        cutoutBounds.right += (float) i;
        cutoutBounds.bottom += (float) i;
    }

    public void drawableStateChanged() {
        if (!this.f4919q0) {
            boolean z = true;
            this.f4919q0 = true;
            super.drawableStateChanged();
            int[] state = getDrawableState();
            boolean changed = false;
            C0910a aVar = this.f4913n0;
            if (aVar != null) {
                changed = false | aVar.mo5460R(state);
            }
            if (!C0460r.m2235J(this) || !isEnabled()) {
                z = false;
            }
            mo7011c0(z);
            mo7005Y();
            mo7019e0();
            if (changed) {
                invalidate();
            }
            this.f4919q0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f4892d;
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7019e0() {
        /*
            r5 = this;
            b.a.a.a.g0.g r0 = r5.f4920r
            if (r0 == 0) goto L_0x00d7
            int r0 = r5.f4925v
            if (r0 != 0) goto L_0x000a
            goto L_0x00d7
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f4892d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r5.f4892d
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r5.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r5.f4909l0
            r5.f4864A = r4
            goto L_0x0071
        L_0x003f:
            b.a.a.a.j0.f r4 = r5.f4896f
            boolean r4 = r4.mo5820k()
            if (r4 == 0) goto L_0x0050
            b.a.a.a.j0.f r4 = r5.f4896f
            int r4 = r4.mo5823n()
            r5.f4864A = r4
            goto L_0x0071
        L_0x0050:
            boolean r4 = r5.f4902i
            if (r4 == 0) goto L_0x005f
            android.widget.TextView r4 = r5.f4904j
            if (r4 == 0) goto L_0x005f
            int r4 = r4.getCurrentTextColor()
            r5.f4864A = r4
            goto L_0x0071
        L_0x005f:
            if (r0 == 0) goto L_0x0066
            int r4 = r5.f4901h0
            r5.f4864A = r4
            goto L_0x0071
        L_0x0066:
            if (r3 == 0) goto L_0x006d
            int r4 = r5.f4899g0
            r5.f4864A = r4
            goto L_0x0071
        L_0x006d:
            int r4 = r5.f4897f0
            r5.f4864A = r4
        L_0x0071:
            b.a.a.a.j0.f r4 = r5.f4896f
            boolean r4 = r4.mo5820k()
            if (r4 == 0) goto L_0x0085
            b.a.a.a.j0.e r4 = r5.getEndIconDelegate()
            boolean r4 = r4.mo5781c()
            if (r4 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0086
        L_0x0085:
            r4 = 0
        L_0x0086:
            r5.mo7000S(r4)
            android.graphics.drawable.Drawable r4 = r5.getErrorIconDrawable()
            if (r4 == 0) goto L_0x00a2
            b.a.a.a.j0.f r4 = r5.f4896f
            boolean r4 = r4.mo5831v()
            if (r4 == 0) goto L_0x00a2
            b.a.a.a.j0.f r4 = r5.f4896f
            boolean r4 = r4.mo5820k()
            if (r4 == 0) goto L_0x00a2
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
        L_0x00a3:
            r5.setErrorIconVisible(r1)
            if (r3 != 0) goto L_0x00aa
            if (r0 == 0) goto L_0x00b5
        L_0x00aa:
            boolean r1 = r5.isEnabled()
            if (r1 == 0) goto L_0x00b5
            int r1 = r5.f4929z
            r5.f4927x = r1
            goto L_0x00b9
        L_0x00b5:
            int r1 = r5.f4928y
            r5.f4927x = r1
        L_0x00b9:
            int r1 = r5.f4925v
            if (r1 != r2) goto L_0x00d3
            boolean r1 = r5.isEnabled()
            if (r1 != 0) goto L_0x00c8
            int r1 = r5.f4905j0
            r5.f4865B = r1
            goto L_0x00d3
        L_0x00c8:
            if (r3 == 0) goto L_0x00cf
            int r1 = r5.f4907k0
            r5.f4865B = r1
            goto L_0x00d3
        L_0x00cf:
            int r1 = r5.f4903i0
            r5.f4865B = r1
        L_0x00d3:
            r5.mo7020f()
            return
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo7019e0():void");
    }

    private void setErrorIconVisible(boolean errorIconVisible) {
        int i = 0;
        this.f4889b0.setVisibility(errorIconVisible ? 0 : 8);
        FrameLayout frameLayout = this.f4890c;
        if (errorIconVisible) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (!mo6988C()) {
            mo7007a0();
        }
    }

    /* renamed from: B */
    public final void mo6987B(boolean animate) {
        ValueAnimator valueAnimator = this.f4917p0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f4917p0.cancel();
        }
        if (!animate || !this.f4915o0) {
            this.f4913n0.mo5457O(0.0f);
        } else {
            mo7018e(0.0f);
        }
        if (mo7135w() && ((C0999c) this.f4920r).mo5768f0()) {
            mo7133u();
        }
        this.f4911m0 = true;
    }

    /* renamed from: e */
    public void mo7018e(float target) {
        if (this.f4913n0.mo5480r() != target) {
            if (this.f4917p0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f4917p0 = valueAnimator;
                valueAnimator.setInterpolator(C1023a.f4313b);
                this.f4917p0.setDuration(167);
                this.f4917p0.addUpdateListener(new C1178d());
            }
            this.f4917p0.setFloatValues(new float[]{this.f4913n0.mo5480r(), target});
            this.f4917p0.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C1178d implements ValueAnimator.AnimatorUpdateListener {
        public C1178d() {
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            TextInputLayout.this.f4913n0.mo5457O(((Float) animator.getAnimatedValue()).floatValue());
        }
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f4913n0.mo5476n();
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4913n0.mo5475m();
    }

    public final int getErrorTextCurrentColor() {
        return this.f4896f.mo5823n();
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C1179e extends C0420a {

        /* renamed from: d */
        public final TextInputLayout f4934d;

        public C1179e(TextInputLayout layout) {
            this.f4934d = layout;
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            super.mo2424g(host, info);
            EditText editText = this.f4934d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hintText = this.f4934d.getHint();
            CharSequence errorText = this.f4934d.getError();
            CharSequence counterDesc = this.f4934d.getCounterOverflowDescription();
            boolean showingText = !TextUtils.isEmpty(text);
            boolean hasHint = !TextUtils.isEmpty(hintText);
            boolean showingError = !TextUtils.isEmpty(errorText);
            boolean z = false;
            boolean contentInvalid = showingError || !TextUtils.isEmpty(counterDesc);
            if (showingText) {
                info.mo2495p0(text);
            } else if (hasHint) {
                info.mo2495p0(hintText);
            }
            if (hasHint) {
                info.mo2478g0(hintText);
                if (!showingText && hasHint) {
                    z = true;
                }
                info.mo2492n0(z);
            }
            if (contentInvalid) {
                info.mo2469c0(showingError ? errorText : counterDesc);
                info.mo2465a0(true);
            }
        }
    }
}
