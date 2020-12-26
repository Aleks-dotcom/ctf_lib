package p000a.p025h.p027e.p028c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p025h.C0325c;

/* renamed from: a.h.e.c.d */
public final class C0348d {
    /* renamed from: b */
    public static Shader m1818b(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        XmlPullParser xmlPullParser = parser;
        String name = parser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray a = C0355g.m1844k(resources, theme2, attrs, C0325c.f1808w);
            float startX = C0355g.m1839f(a, xmlPullParser, "startX", C0325c.f1779F, 0.0f);
            float startY = C0355g.m1839f(a, xmlPullParser, "startY", C0325c.f1780G, 0.0f);
            float endX = C0355g.m1839f(a, xmlPullParser, "endX", C0325c.f1781H, 0.0f);
            float endY = C0355g.m1839f(a, xmlPullParser, "endY", C0325c.f1782I, 0.0f);
            float centerX = C0355g.m1839f(a, xmlPullParser, "centerX", C0325c.f1774A, 0.0f);
            float centerY = C0355g.m1839f(a, xmlPullParser, "centerY", C0325c.f1775B, 0.0f);
            int type = C0355g.m1840g(a, xmlPullParser, "type", C0325c.f1811z, 0);
            int startColor = C0355g.m1835b(a, xmlPullParser, "startColor", C0325c.f1809x, 0);
            boolean hasCenterColor = C0355g.m1843j(xmlPullParser, "centerColor");
            int centerColor = C0355g.m1835b(a, xmlPullParser, "centerColor", C0325c.f1778E, 0);
            int endColor = C0355g.m1835b(a, xmlPullParser, "endColor", C0325c.f1810y, 0);
            int tileMode = C0355g.m1840g(a, xmlPullParser, "tileMode", C0325c.f1777D, 0);
            float gradientRadius = C0355g.m1839f(a, xmlPullParser, "gradientRadius", C0325c.f1776C, 0.0f);
            a.recycle();
            C0349a colorStops = m1817a(m1819c(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
            if (type == 1) {
                boolean z = hasCenterColor;
                int i = startColor;
                int i2 = type;
                float centerY2 = centerY;
                float centerX2 = centerX;
                if (gradientRadius > 0.0f) {
                    int[] iArr = colorStops.f1849a;
                    return new RadialGradient(centerX2, centerY2, gradientRadius, iArr, colorStops.f1850b, m1820d(tileMode));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (type != 2) {
                int[] iArr2 = colorStops.f1849a;
                boolean z2 = hasCenterColor;
                int[] iArr3 = iArr2;
                int i3 = startColor;
                int i4 = type;
                float f = centerY;
                TypedArray typedArray = a;
                float f2 = centerX;
                return new LinearGradient(startX, startY, endX, endY, iArr3, colorStops.f1850b, m1820d(tileMode));
            } else {
                boolean z3 = hasCenterColor;
                return new SweepGradient(centerX, centerY, colorStops.f1849a, colorStops.f1850b);
            }
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000a.p025h.p027e.p028c.C0348d.C0349a m1819c(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r3 = r4
        L_0x0013:
            int r4 = r13.next()
            r5 = r4
            if (r4 == r1) goto L_0x0084
            int r4 = r13.getDepth()
            r6 = r4
            if (r4 >= r0) goto L_0x0024
            r4 = 3
            if (r5 == r4) goto L_0x0084
        L_0x0024:
            r4 = 2
            if (r5 == r4) goto L_0x0028
            goto L_0x0013
        L_0x0028:
            if (r6 > r0) goto L_0x0013
            java.lang.String r4 = r13.getName()
            java.lang.String r7 = "item"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0037
            goto L_0x0013
        L_0x0037:
            int[] r4 = p000a.p025h.C0325c.f1783J
            android.content.res.TypedArray r4 = p000a.p025h.p027e.p028c.C0355g.m1844k(r12, r15, r14, r4)
            int r7 = p000a.p025h.C0325c.f1784K
            boolean r8 = r4.hasValue(r7)
            int r9 = p000a.p025h.C0325c.f1785L
            boolean r10 = r4.hasValue(r9)
            if (r8 == 0) goto L_0x0069
            if (r10 == 0) goto L_0x0069
            r11 = 0
            int r7 = r4.getColor(r7, r11)
            r11 = 0
            float r9 = r4.getFloat(r9, r11)
            r4.recycle()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r3.add(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r9)
            r2.add(r11)
            goto L_0x0013
        L_0x0069:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r13.getPositionDescription()
            r7.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            throw r1
        L_0x0084:
            int r1 = r3.size()
            if (r1 <= 0) goto L_0x0090
            a.h.e.c.d$a r1 = new a.h.e.c.d$a
            r1.<init>((java.util.List<java.lang.Integer>) r3, (java.util.List<java.lang.Float>) r2)
            return r1
        L_0x0090:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p027e.p028c.C0348d.m1819c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.h.e.c.d$a");
    }

    /* renamed from: a */
    public static C0349a m1817a(C0349a colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new C0349a(startColor, centerColor, endColor);
        }
        return new C0349a(startColor, endColor);
    }

    /* renamed from: d */
    public static Shader.TileMode m1820d(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: a.h.e.c.d$a */
    public static final class C0349a {

        /* renamed from: a */
        public final int[] f1849a;

        /* renamed from: b */
        public final float[] f1850b;

        public C0349a(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f1849a = new int[size];
            this.f1850b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1849a[i] = colorsList.get(i).intValue();
                this.f1850b[i] = offsetsList.get(i).floatValue();
            }
        }

        public C0349a(int startColor, int endColor) {
            this.f1849a = new int[]{startColor, endColor};
            this.f1850b = new float[]{0.0f, 1.0f};
        }

        public C0349a(int startColor, int centerColor, int endColor) {
            this.f1849a = new int[]{startColor, centerColor, endColor};
            this.f1850b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
