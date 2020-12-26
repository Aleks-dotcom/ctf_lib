package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p002b.C0012j;
import p000a.p025h.p027e.p028c.C0351f;
import p000a.p025h.p040n.C0483b;

/* renamed from: a.b.p.y */
public class C0223y {

    /* renamed from: a */
    public final TextView f1106a;

    /* renamed from: b */
    public C0203u0 f1107b;

    /* renamed from: c */
    public C0203u0 f1108c;

    /* renamed from: d */
    public C0203u0 f1109d;

    /* renamed from: e */
    public C0203u0 f1110e;

    /* renamed from: f */
    public C0203u0 f1111f;

    /* renamed from: g */
    public C0203u0 f1112g;

    /* renamed from: h */
    public C0203u0 f1113h;

    /* renamed from: i */
    public final C0126a0 f1114i;

    /* renamed from: j */
    public int f1115j = 0;

    /* renamed from: k */
    public int f1116k = -1;

    /* renamed from: l */
    public Typeface f1117l;

    /* renamed from: m */
    public boolean f1118m;

    public C0223y(TextView view) {
        this.f1106a = view;
        this.f1114i = new C0126a0(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01de  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1545m(android.util.AttributeSet r37, int r38) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            r9 = r38
            android.widget.TextView r0 = r7.f1106a
            android.content.Context r10 = r0.getContext()
            a.b.p.j r11 = p000a.p002b.p011p.C0160j.m883b()
            int[] r0 = p000a.p002b.C0012j.f92V
            r1 = 0
            a.b.p.w0 r0 = p000a.p002b.p011p.C0218w0.m1093u(r10, r8, r0, r9, r1)
            int r2 = p000a.p002b.C0012j.f96W
            r12 = -1
            int r13 = r0.mo1509n(r2, r12)
            int r2 = p000a.p002b.C0012j.f108Z
            boolean r3 = r0.mo1513r(r2)
            if (r3 == 0) goto L_0x0031
            int r2 = r0.mo1509n(r2, r1)
            a.b.p.u0 r2 = m1153d(r10, r11, r2)
            r7.f1107b = r2
        L_0x0031:
            int r2 = p000a.p002b.C0012j.f100X
            boolean r3 = r0.mo1513r(r2)
            if (r3 == 0) goto L_0x0044
            int r2 = r0.mo1509n(r2, r1)
            a.b.p.u0 r2 = m1153d(r10, r11, r2)
            r7.f1108c = r2
        L_0x0044:
            int r2 = p000a.p002b.C0012j.f113a0
            boolean r3 = r0.mo1513r(r2)
            if (r3 == 0) goto L_0x0057
            int r2 = r0.mo1509n(r2, r1)
            a.b.p.u0 r2 = m1153d(r10, r11, r2)
            r7.f1109d = r2
        L_0x0057:
            int r2 = p000a.p002b.C0012j.f104Y
            boolean r3 = r0.mo1513r(r2)
            if (r3 == 0) goto L_0x006a
            int r2 = r0.mo1509n(r2, r1)
            a.b.p.u0 r2 = m1153d(r10, r11, r2)
            r7.f1110e = r2
        L_0x006a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0096
            int r3 = p000a.p002b.C0012j.f118b0
            boolean r4 = r0.mo1513r(r3)
            if (r4 == 0) goto L_0x0083
            int r3 = r0.mo1509n(r3, r1)
            a.b.p.u0 r3 = m1153d(r10, r11, r3)
            r7.f1111f = r3
        L_0x0083:
            int r3 = p000a.p002b.C0012j.f123c0
            boolean r4 = r0.mo1513r(r3)
            if (r4 == 0) goto L_0x0096
            int r3 = r0.mo1509n(r3, r1)
            a.b.p.u0 r3 = m1153d(r10, r11, r3)
            r7.f1112g = r3
        L_0x0096:
            r0.mo1514v()
            android.widget.TextView r3 = r7.f1106a
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()
            boolean r14 = r3 instanceof android.text.method.PasswordTransformationMethod
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            if (r13 == r12) goto L_0x0111
            int[] r12 = p000a.p002b.C0012j.f215u2
            a.b.p.w0 r0 = p000a.p002b.p011p.C0218w0.m1091s(r10, r13, r12)
            if (r14 != 0) goto L_0x00c2
            int r12 = p000a.p002b.C0012j.f31F2
            boolean r21 = r0.mo1513r(r12)
            if (r21 == 0) goto L_0x00c2
            r4 = 1
            r1 = 0
            boolean r3 = r0.mo1496a(r12, r1)
        L_0x00c2:
            r7.mo1533C(r10, r0)
            r1 = 23
            if (r2 >= r1) goto L_0x00ee
            int r1 = p000a.p002b.C0012j.f233y2
            boolean r12 = r0.mo1513r(r1)
            if (r12 == 0) goto L_0x00d5
            android.content.res.ColorStateList r5 = r0.mo1498c(r1)
        L_0x00d5:
            int r1 = p000a.p002b.C0012j.f237z2
            boolean r12 = r0.mo1513r(r1)
            if (r12 == 0) goto L_0x00e1
            android.content.res.ColorStateList r6 = r0.mo1498c(r1)
        L_0x00e1:
            int r1 = p000a.p002b.C0012j.f11A2
            boolean r12 = r0.mo1513r(r1)
            if (r12 == 0) goto L_0x00ee
            android.content.res.ColorStateList r1 = r0.mo1498c(r1)
            r15 = r1
        L_0x00ee:
            int r1 = p000a.p002b.C0012j.f35G2
            boolean r12 = r0.mo1513r(r1)
            if (r12 == 0) goto L_0x00fc
            java.lang.String r1 = r0.mo1510o(r1)
            r17 = r1
        L_0x00fc:
            r1 = 26
            if (r2 < r1) goto L_0x010e
            int r1 = p000a.p002b.C0012j.f27E2
            boolean r12 = r0.mo1513r(r1)
            if (r12 == 0) goto L_0x010e
            java.lang.String r1 = r0.mo1510o(r1)
            r16 = r1
        L_0x010e:
            r0.mo1514v()
        L_0x0111:
            int[] r1 = p000a.p002b.C0012j.f215u2
            r12 = 0
            a.b.p.w0 r0 = p000a.p002b.p011p.C0218w0.m1093u(r10, r8, r1, r9, r12)
            if (r14 != 0) goto L_0x012b
            int r1 = p000a.p002b.C0012j.f31F2
            boolean r18 = r0.mo1513r(r1)
            if (r18 == 0) goto L_0x012b
            r4 = 1
            boolean r3 = r0.mo1496a(r1, r12)
            r12 = r3
            r22 = r4
            goto L_0x012e
        L_0x012b:
            r12 = r3
            r22 = r4
        L_0x012e:
            r1 = 23
            if (r2 >= r1) goto L_0x0162
            int r1 = p000a.p002b.C0012j.f233y2
            boolean r3 = r0.mo1513r(r1)
            if (r3 == 0) goto L_0x013e
            android.content.res.ColorStateList r5 = r0.mo1498c(r1)
        L_0x013e:
            int r1 = p000a.p002b.C0012j.f237z2
            boolean r3 = r0.mo1513r(r1)
            if (r3 == 0) goto L_0x014a
            android.content.res.ColorStateList r6 = r0.mo1498c(r1)
        L_0x014a:
            int r1 = p000a.p002b.C0012j.f11A2
            boolean r3 = r0.mo1513r(r1)
            if (r3 == 0) goto L_0x015c
            android.content.res.ColorStateList r15 = r0.mo1498c(r1)
            r35 = r15
            r15 = r5
            r5 = r35
            goto L_0x0167
        L_0x015c:
            r35 = r15
            r15 = r5
            r5 = r35
            goto L_0x0167
        L_0x0162:
            r35 = r15
            r15 = r5
            r5 = r35
        L_0x0167:
            int r1 = p000a.p002b.C0012j.f35G2
            boolean r3 = r0.mo1513r(r1)
            if (r3 == 0) goto L_0x0176
            java.lang.String r17 = r0.mo1510o(r1)
            r4 = r17
            goto L_0x0178
        L_0x0176:
            r4 = r17
        L_0x0178:
            r1 = 26
            if (r2 < r1) goto L_0x018b
            int r1 = p000a.p002b.C0012j.f27E2
            boolean r3 = r0.mo1513r(r1)
            if (r3 == 0) goto L_0x018b
            java.lang.String r16 = r0.mo1510o(r1)
            r3 = r16
            goto L_0x018d
        L_0x018b:
            r3 = r16
        L_0x018d:
            r1 = 28
            if (r2 < r1) goto L_0x01b4
            int r1 = p000a.p002b.C0012j.f220v2
            boolean r16 = r0.mo1513r(r1)
            if (r16 == 0) goto L_0x01af
            r16 = r13
            r13 = -1
            int r1 = r0.mo1501f(r1, r13)
            if (r1 != 0) goto L_0x01ac
            android.widget.TextView r1 = r7.f1106a
            r13 = 0
            r17 = r11
            r11 = 0
            r1.setTextSize(r11, r13)
            goto L_0x01b8
        L_0x01ac:
            r17 = r11
            goto L_0x01b8
        L_0x01af:
            r17 = r11
            r16 = r13
            goto L_0x01b8
        L_0x01b4:
            r17 = r11
            r16 = r13
        L_0x01b8:
            r7.mo1533C(r10, r0)
            r0.mo1514v()
            if (r15 == 0) goto L_0x01c5
            android.widget.TextView r1 = r7.f1106a
            r1.setTextColor(r15)
        L_0x01c5:
            if (r6 == 0) goto L_0x01cc
            android.widget.TextView r1 = r7.f1106a
            r1.setHintTextColor(r6)
        L_0x01cc:
            if (r5 == 0) goto L_0x01d3
            android.widget.TextView r1 = r7.f1106a
            r1.setLinkTextColor(r5)
        L_0x01d3:
            if (r14 != 0) goto L_0x01da
            if (r22 == 0) goto L_0x01da
            r7.mo1550r(r12)
        L_0x01da:
            android.graphics.Typeface r1 = r7.f1117l
            if (r1 == 0) goto L_0x01f0
            int r11 = r7.f1116k
            r13 = -1
            if (r11 != r13) goto L_0x01eb
            android.widget.TextView r11 = r7.f1106a
            int r13 = r7.f1115j
            r11.setTypeface(r1, r13)
            goto L_0x01f0
        L_0x01eb:
            android.widget.TextView r11 = r7.f1106a
            r11.setTypeface(r1)
        L_0x01f0:
            if (r3 == 0) goto L_0x01f7
            android.widget.TextView r1 = r7.f1106a
            r1.setFontVariationSettings(r3)
        L_0x01f7:
            if (r4 == 0) goto L_0x021f
            r1 = 24
            if (r2 < r1) goto L_0x0207
            android.widget.TextView r1 = r7.f1106a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r4)
            r1.setTextLocales(r2)
            goto L_0x021f
        L_0x0207:
            r1 = 21
            if (r2 < r1) goto L_0x021f
            r1 = 44
            int r1 = r4.indexOf(r1)
            r2 = 0
            java.lang.String r1 = r4.substring(r2, r1)
            android.widget.TextView r2 = r7.f1106a
            java.util.Locale r11 = java.util.Locale.forLanguageTag(r1)
            r2.setTextLocale(r11)
        L_0x021f:
            a.b.p.a0 r1 = r7.f1114i
            r1.mo931t(r8, r9)
            boolean r1 = p000a.p025h.p040n.C0483b.f2088a
            if (r1 == 0) goto L_0x0278
            a.b.p.a0 r1 = r7.f1114i
            int r1 = r1.mo928n()
            if (r1 == 0) goto L_0x0273
            a.b.p.a0 r1 = r7.f1114i
            int[] r1 = r1.mo927m()
            int r2 = r1.length
            if (r2 <= 0) goto L_0x026e
            android.widget.TextView r2 = r7.f1106a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0263
            android.widget.TextView r2 = r7.f1106a
            a.b.p.a0 r11 = r7.f1114i
            int r11 = r11.mo925k()
            a.b.p.a0 r13 = r7.f1114i
            int r13 = r13.mo924j()
            r19 = r0
            a.b.p.a0 r0 = r7.f1114i
            int r0 = r0.mo926l()
            r21 = r3
            r3 = 0
            r2.setAutoSizeTextTypeUniformWithConfiguration(r11, r13, r0, r3)
            goto L_0x027c
        L_0x0263:
            r19 = r0
            r21 = r3
            r3 = 0
            android.widget.TextView r0 = r7.f1106a
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r3)
            goto L_0x027c
        L_0x026e:
            r19 = r0
            r21 = r3
            goto L_0x027c
        L_0x0273:
            r19 = r0
            r21 = r3
            goto L_0x027c
        L_0x0278:
            r19 = r0
            r21 = r3
        L_0x027c:
            int[] r0 = p000a.p002b.C0012j.f128d0
            a.b.p.w0 r11 = p000a.p002b.p011p.C0218w0.m1092t(r10, r8, r0)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r13 = 0
            r18 = 0
            r19 = r0
            int r0 = p000a.p002b.C0012j.f168l0
            r23 = r1
            r1 = -1
            int r0 = r11.mo1509n(r0, r1)
            if (r0 == r1) goto L_0x029d
            r1 = r17
            android.graphics.drawable.Drawable r17 = r1.mo1165c(r10, r0)
            goto L_0x02a1
        L_0x029d:
            r1 = r17
            r17 = r19
        L_0x02a1:
            r19 = r0
            int r0 = p000a.p002b.C0012j.f193q0
            r24 = r2
            r2 = -1
            int r0 = r11.mo1509n(r0, r2)
            if (r0 == r2) goto L_0x02b4
            android.graphics.drawable.Drawable r20 = r1.mo1165c(r10, r0)
            r23 = r20
        L_0x02b4:
            r25 = r0
            int r0 = p000a.p002b.C0012j.f173m0
            int r0 = r11.mo1509n(r0, r2)
            if (r0 == r2) goto L_0x02c4
            android.graphics.drawable.Drawable r20 = r1.mo1165c(r10, r0)
            r24 = r20
        L_0x02c4:
            r26 = r0
            int r0 = p000a.p002b.C0012j.f158j0
            int r0 = r11.mo1509n(r0, r2)
            if (r0 == r2) goto L_0x02d5
            android.graphics.drawable.Drawable r3 = r1.mo1165c(r10, r0)
            r27 = r3
            goto L_0x02d7
        L_0x02d5:
            r27 = r3
        L_0x02d7:
            int r3 = p000a.p002b.C0012j.f178n0
            int r3 = r11.mo1509n(r3, r2)
            if (r3 == r2) goto L_0x02e3
            android.graphics.drawable.Drawable r13 = r1.mo1165c(r10, r3)
        L_0x02e3:
            r28 = r0
            int r0 = p000a.p002b.C0012j.f163k0
            int r0 = r11.mo1509n(r0, r2)
            if (r0 == r2) goto L_0x02f1
            android.graphics.drawable.Drawable r18 = r1.mo1165c(r10, r0)
        L_0x02f1:
            r29 = r0
            r0 = r36
            r30 = r1
            r1 = r17
            r2 = r23
            r31 = r3
            r3 = r24
            r32 = r4
            r4 = r27
            r33 = r5
            r5 = r13
            r34 = r6
            r6 = r18
            r0.mo1556x(r1, r2, r3, r4, r5, r6)
            int r0 = p000a.p002b.C0012j.f183o0
            boolean r1 = r11.mo1513r(r0)
            if (r1 == 0) goto L_0x031e
            android.content.res.ColorStateList r0 = r11.mo1498c(r0)
            android.widget.TextView r1 = r7.f1106a
            p000a.p025h.p040n.C0490i.m2432g(r1, r0)
        L_0x031e:
            int r0 = p000a.p002b.C0012j.f188p0
            boolean r1 = r11.mo1513r(r0)
            if (r1 == 0) goto L_0x0336
            r1 = -1
            int r0 = r11.mo1506k(r0, r1)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = p000a.p002b.p011p.C0145e0.m827d(r0, r1)
            android.widget.TextView r1 = r7.f1106a
            p000a.p025h.p040n.C0490i.m2433h(r1, r0)
        L_0x0336:
            int r0 = p000a.p002b.C0012j.f198r0
            r1 = -1
            int r0 = r11.mo1501f(r0, r1)
            int r2 = p000a.p002b.C0012j.f203s0
            int r2 = r11.mo1501f(r2, r1)
            int r3 = p000a.p002b.C0012j.f208t0
            int r3 = r11.mo1501f(r3, r1)
            r11.mo1514v()
            if (r0 == r1) goto L_0x0353
            android.widget.TextView r4 = r7.f1106a
            p000a.p025h.p040n.C0490i.m2435j(r4, r0)
        L_0x0353:
            if (r2 == r1) goto L_0x035a
            android.widget.TextView r4 = r7.f1106a
            p000a.p025h.p040n.C0490i.m2436k(r4, r2)
        L_0x035a:
            if (r3 == r1) goto L_0x0361
            android.widget.TextView r1 = r7.f1106a
            p000a.p025h.p040n.C0490i.m2437l(r1, r3)
        L_0x0361:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0223y.mo1545m(android.util.AttributeSet, int):void");
    }

    /* renamed from: B */
    public void mo1532B(Typeface typeface) {
        if (this.f1118m) {
            this.f1106a.setTypeface(typeface);
            this.f1117l = typeface;
        }
    }

    /* renamed from: q */
    public void mo1549q(Runnable runnable) {
        this.f1106a.post(runnable);
    }

    /* renamed from: a.b.p.y$a */
    public static class C0224a extends C0351f.C0352a {

        /* renamed from: a */
        public final WeakReference<C0223y> f1119a;

        /* renamed from: b */
        public final int f1120b;

        /* renamed from: c */
        public final int f1121c;

        /* renamed from: a.b.p.y$a$a */
        public class C0225a implements Runnable {

            /* renamed from: b */
            public final WeakReference<C0223y> f1122b;

            /* renamed from: c */
            public final Typeface f1123c;

            public C0225a(C0224a aVar, WeakReference<C0223y> parent, Typeface tf) {
                this.f1122b = parent;
                this.f1123c = tf;
            }

            public void run() {
                C0223y parent = (C0223y) this.f1122b.get();
                if (parent != null) {
                    parent.mo1532B(this.f1123c);
                }
            }
        }

        public C0224a(C0223y parent, int fontWeight, int style) {
            this.f1119a = new WeakReference<>(parent);
            this.f1120b = fontWeight;
            this.f1121c = style;
        }

        /* renamed from: d */
        public void mo1560d(Typeface typeface) {
            int i;
            C0223y parent = (C0223y) this.f1119a.get();
            if (parent != null) {
                if (Build.VERSION.SDK_INT >= 28 && (i = this.f1120b) != -1) {
                    typeface = Typeface.create(typeface, i, (this.f1121c & 2) != 0);
                }
                parent.mo1549q(new C0225a(this, this.f1119a, typeface));
            }
        }

        /* renamed from: c */
        public void mo1559c(int reason) {
        }
    }

    /* renamed from: C */
    public final void mo1533C(Context context, C0218w0 a) {
        String fontFamilyName;
        C0218w0 w0Var = a;
        int i = Build.VERSION.SDK_INT;
        this.f1115j = w0Var.mo1506k(C0012j.f229x2, this.f1115j);
        boolean z = false;
        if (i >= 28) {
            int k = w0Var.mo1506k(C0012j.f19C2, -1);
            this.f1116k = k;
            if (k != -1) {
                this.f1115j = (this.f1115j & 2) | 0;
            }
        }
        int i2 = C0012j.f15B2;
        if (w0Var.mo1513r(i2) || w0Var.mo1513r(C0012j.f23D2)) {
            this.f1117l = null;
            int i3 = C0012j.f23D2;
            if (w0Var.mo1513r(i3)) {
                i2 = i3;
            }
            int fontFamilyId = i2;
            int fontWeight = this.f1116k;
            int style = this.f1115j;
            if (!context.isRestricted()) {
                try {
                    Typeface typeface = w0Var.mo1505j(fontFamilyId, this.f1115j, new C0224a(this, fontWeight, style));
                    if (typeface != null) {
                        if (i < 28 || this.f1116k == -1) {
                            this.f1117l = typeface;
                        } else {
                            this.f1117l = Typeface.create(Typeface.create(typeface, 0), this.f1116k, (this.f1115j & 2) != 0);
                        }
                    }
                    this.f1118m = this.f1117l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f1117l == null && (fontFamilyName = w0Var.mo1510o(fontFamilyId)) != null) {
                if (i < 28 || this.f1116k == -1) {
                    this.f1117l = Typeface.create(fontFamilyName, this.f1115j);
                    return;
                }
                Typeface create = Typeface.create(fontFamilyName, 0);
                int i4 = this.f1116k;
                if ((2 & this.f1115j) != 0) {
                    z = true;
                }
                this.f1117l = Typeface.create(create, i4, z);
                return;
            }
            return;
        }
        int i5 = C0012j.f225w2;
        if (w0Var.mo1513r(i5)) {
            this.f1118m = false;
            int typefaceIndex = w0Var.mo1506k(i5, 1);
            if (typefaceIndex == 1) {
                this.f1117l = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.f1117l = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.f1117l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: p */
    public void mo1548p(Context context, int resId) {
        String fontVariation;
        ColorStateList textColor;
        C0218w0 a = C0218w0.m1091s(context, resId, C0012j.f215u2);
        int i = C0012j.f31F2;
        if (a.mo1513r(i)) {
            mo1550r(a.mo1496a(i, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            int i3 = C0012j.f233y2;
            if (a.mo1513r(i3) && (textColor = a.mo1498c(i3)) != null) {
                this.f1106a.setTextColor(textColor);
            }
        }
        int i4 = C0012j.f220v2;
        if (a.mo1513r(i4) && a.mo1501f(i4, -1) == 0) {
            this.f1106a.setTextSize(0, 0.0f);
        }
        mo1533C(context, a);
        if (i2 >= 26) {
            int i5 = C0012j.f27E2;
            if (a.mo1513r(i5) && (fontVariation = a.mo1510o(i5)) != null) {
                this.f1106a.setFontVariationSettings(fontVariation);
            }
        }
        a.mo1514v();
        Typeface typeface = this.f1117l;
        if (typeface != null) {
            this.f1106a.setTypeface(typeface, this.f1115j);
        }
    }

    /* renamed from: r */
    public void mo1550r(boolean allCaps) {
        this.f1106a.setAllCaps(allCaps);
    }

    /* renamed from: o */
    public void mo1547o() {
        mo1535b();
    }

    /* renamed from: b */
    public void mo1535b() {
        if (!(this.f1107b == null && this.f1108c == null && this.f1109d == null && this.f1110e == null)) {
            Drawable[] compoundDrawables = this.f1106a.getCompoundDrawables();
            mo1534a(compoundDrawables[0], this.f1107b);
            mo1534a(compoundDrawables[1], this.f1108c);
            mo1534a(compoundDrawables[2], this.f1109d);
            mo1534a(compoundDrawables[3], this.f1110e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1111f != null || this.f1112g != null) {
            Drawable[] compoundDrawables2 = this.f1106a.getCompoundDrawablesRelative();
            mo1534a(compoundDrawables2[0], this.f1111f);
            mo1534a(compoundDrawables2[2], this.f1112g);
        }
    }

    /* renamed from: a */
    public final void mo1534a(Drawable drawable, C0203u0 info) {
        if (drawable != null && info != null) {
            C0160j.m886i(drawable, info, this.f1106a.getDrawableState());
        }
    }

    /* renamed from: d */
    public static C0203u0 m1153d(Context context, C0160j drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.mo1167f(context, drawableId);
        if (tintList == null) {
            return null;
        }
        C0203u0 tintInfo = new C0203u0();
        tintInfo.f1043d = true;
        tintInfo.f1040a = tintList;
        return tintInfo;
    }

    /* renamed from: n */
    public void mo1546n(boolean changed, int left, int top, int right, int bottom) {
        if (!C0483b.f2088a) {
            mo1536c();
        }
    }

    /* renamed from: z */
    public void mo1558z(int unit, float size) {
        if (!C0483b.f2088a && !mo1544l()) {
            mo1531A(unit, size);
        }
    }

    /* renamed from: c */
    public void mo1536c() {
        this.f1114i.mo916b();
    }

    /* renamed from: l */
    public boolean mo1544l() {
        return this.f1114i.mo930s();
    }

    /* renamed from: A */
    public final void mo1531A(int unit, float size) {
        this.f1114i.mo936y(unit, size);
    }

    /* renamed from: u */
    public void mo1553u(int autoSizeTextType) {
        this.f1114i.mo934w(autoSizeTextType);
    }

    /* renamed from: s */
    public void mo1551s(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f1114i.mo932u(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    /* renamed from: t */
    public void mo1552t(int[] presetSizes, int unit) {
        this.f1114i.mo933v(presetSizes, unit);
    }

    /* renamed from: i */
    public int mo1541i() {
        return this.f1114i.mo928n();
    }

    /* renamed from: g */
    public int mo1539g() {
        return this.f1114i.mo926l();
    }

    /* renamed from: f */
    public int mo1538f() {
        return this.f1114i.mo925k();
    }

    /* renamed from: e */
    public int mo1537e() {
        return this.f1114i.mo924j();
    }

    /* renamed from: h */
    public int[] mo1540h() {
        return this.f1114i.mo927m();
    }

    /* renamed from: j */
    public ColorStateList mo1542j() {
        C0203u0 u0Var = this.f1113h;
        if (u0Var != null) {
            return u0Var.f1040a;
        }
        return null;
    }

    /* renamed from: v */
    public void mo1554v(ColorStateList tintList) {
        if (this.f1113h == null) {
            this.f1113h = new C0203u0();
        }
        C0203u0 u0Var = this.f1113h;
        u0Var.f1040a = tintList;
        u0Var.f1043d = tintList != null;
        mo1557y();
    }

    /* renamed from: k */
    public PorterDuff.Mode mo1543k() {
        C0203u0 u0Var = this.f1113h;
        if (u0Var != null) {
            return u0Var.f1041b;
        }
        return null;
    }

    /* renamed from: w */
    public void mo1555w(PorterDuff.Mode tintMode) {
        if (this.f1113h == null) {
            this.f1113h = new C0203u0();
        }
        C0203u0 u0Var = this.f1113h;
        u0Var.f1041b = tintMode;
        u0Var.f1042c = tintMode != null;
        mo1557y();
    }

    /* renamed from: y */
    public final void mo1557y() {
        C0203u0 u0Var = this.f1113h;
        this.f1107b = u0Var;
        this.f1108c = u0Var;
        this.f1109d = u0Var;
        this.f1110e = u0Var;
        this.f1111f = u0Var;
        this.f1112g = u0Var;
    }

    /* renamed from: x */
    public final void mo1556x(Drawable drawableLeft, Drawable drawableTop, Drawable drawableRight, Drawable drawableBottom, Drawable drawableStart, Drawable drawableEnd) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawableStart != null || drawableEnd != null)) {
            Drawable[] existingRel = this.f1106a.getCompoundDrawablesRelative();
            this.f1106a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableStart != null ? drawableStart : existingRel[0], drawableTop != null ? drawableTop : existingRel[1], drawableEnd != null ? drawableEnd : existingRel[2], drawableBottom != null ? drawableBottom : existingRel[3]);
        } else if (drawableLeft != null || drawableTop != null || drawableRight != null || drawableBottom != null) {
            if (i >= 17) {
                Drawable[] existingRel2 = this.f1106a.getCompoundDrawablesRelative();
                if (!(existingRel2[0] == null && existingRel2[2] == null)) {
                    this.f1106a.setCompoundDrawablesRelativeWithIntrinsicBounds(existingRel2[0], drawableTop != null ? drawableTop : existingRel2[1], existingRel2[2], drawableBottom != null ? drawableBottom : existingRel2[3]);
                    return;
                }
            }
            Drawable[] existingAbs = this.f1106a.getCompoundDrawables();
            this.f1106a.setCompoundDrawablesWithIntrinsicBounds(drawableLeft != null ? drawableLeft : existingAbs[0], drawableTop != null ? drawableTop : existingAbs[1], drawableRight != null ? drawableRight : existingAbs[2], drawableBottom != null ? drawableBottom : existingAbs[3]);
        }
    }
}
