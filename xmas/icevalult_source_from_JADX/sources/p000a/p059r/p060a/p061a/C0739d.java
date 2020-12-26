package p000a.p059r.p060a.p061a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p025h.p027e.p028c.C0355g;
import p000a.p025h.p029f.C0357b;

/* renamed from: a.r.a.a.d */
public class C0739d {
    /* renamed from: i */
    public static Animator m3588i(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, id);
        }
        return m3589j(context, context.getResources(), context.getTheme(), id);
    }

    /* renamed from: j */
    public static Animator m3589j(Context context, Resources resources, Resources.Theme theme, int id) {
        return m3590k(context, resources, theme, id, 1.0f);
    }

    /* renamed from: k */
    public static Animator m3590k(Context context, Resources resources, Resources.Theme theme, int id, float pathErrorScale) {
        XmlResourceParser parser = null;
        try {
            XmlResourceParser parser2 = resources.getAnimation(id);
            Animator animator = m3580a(context, resources, theme, parser2, pathErrorScale);
            if (parser2 != null) {
                parser2.close();
            }
            return animator;
        } catch (XmlPullParserException ex) {
            Resources.NotFoundException rnf = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf.initCause(ex);
            throw rnf;
        } catch (IOException ex2) {
            Resources.NotFoundException rnf2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(id));
            rnf2.initCause(ex2);
            throw rnf2;
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    /* renamed from: a.r.a.a.d$a */
    public static class C0740a implements TypeEvaluator<C0357b.C0359b[]> {

        /* renamed from: a */
        public C0357b.C0359b[] f2784a;

        /* renamed from: a */
        public C0357b.C0359b[] evaluate(float fraction, C0357b.C0359b[] startPathData, C0357b.C0359b[] endPathData) {
            if (C0357b.m1851b(startPathData, endPathData)) {
                if (!C0357b.m1851b(this.f2784a, startPathData)) {
                    this.f2784a = C0357b.m1855f(startPathData);
                }
                for (int i = 0; i < startPathData.length; i++) {
                    this.f2784a[i].mo2259d(startPathData[i], endPathData[i], fraction);
                }
                return this.f2784a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder m3584e(android.content.res.TypedArray r22, int r23, int r24, int r25, java.lang.String r26) {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            android.util.TypedValue r4 = r0.peekValue(r1)
            if (r4 == 0) goto L_0x0010
            r7 = 1
            goto L_0x0011
        L_0x0010:
            r7 = 0
        L_0x0011:
            if (r7 == 0) goto L_0x0016
            int r8 = r4.type
            goto L_0x0017
        L_0x0016:
            r8 = 0
        L_0x0017:
            android.util.TypedValue r9 = r0.peekValue(r2)
            if (r9 == 0) goto L_0x001f
            r10 = 1
            goto L_0x0020
        L_0x001f:
            r10 = 0
        L_0x0020:
            if (r10 == 0) goto L_0x0025
            int r11 = r9.type
            goto L_0x0026
        L_0x0025:
            r11 = 0
        L_0x0026:
            r12 = 4
            r13 = r23
            if (r13 != r12) goto L_0x003f
            if (r7 == 0) goto L_0x0033
            boolean r12 = m3587h(r8)
            if (r12 != 0) goto L_0x003b
        L_0x0033:
            if (r10 == 0) goto L_0x003d
            boolean r12 = m3587h(r11)
            if (r12 == 0) goto L_0x003d
        L_0x003b:
            r12 = 3
            goto L_0x0040
        L_0x003d:
            r12 = 0
            goto L_0x0040
        L_0x003f:
            r12 = r13
        L_0x0040:
            if (r12 != 0) goto L_0x0044
            r13 = 1
            goto L_0x0045
        L_0x0044:
            r13 = 0
        L_0x0045:
            r14 = 0
            r15 = 2
            if (r12 != r15) goto L_0x00ef
            java.lang.String r5 = r0.getString(r1)
            java.lang.String r6 = r0.getString(r2)
            a.h.f.b$b[] r15 = p000a.p025h.p029f.C0357b.m1853d(r5)
            r18 = r4
            a.h.f.b$b[] r4 = p000a.p025h.p029f.C0357b.m1853d(r6)
            if (r15 != 0) goto L_0x006a
            if (r4 == 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            r19 = r9
            r20 = r11
            r21 = r14
            goto L_0x00e7
        L_0x006a:
            if (r15 == 0) goto L_0x00cf
            a.r.a.a.d$a r19 = new a.r.a.a.d$a
            r19.<init>()
            r20 = r19
            if (r4 == 0) goto L_0x00bb
            boolean r19 = p000a.p025h.p029f.C0357b.m1851b(r15, r4)
            if (r19 == 0) goto L_0x0094
            r19 = r9
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r17 = 0
            r9[r17] = r15
            r16 = 1
            r9[r16] = r4
            r21 = r14
            r14 = r20
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r3, r14, r9)
            r14 = r9
            r20 = r11
            goto L_0x00ce
        L_0x0094:
            r19 = r9
            r21 = r14
            r14 = r20
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r20 = r11
            java.lang.String r11 = " Can't morph from "
            r2.append(r11)
            r2.append(r5)
            java.lang.String r11 = " to "
            r2.append(r11)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r9.<init>(r2)
            throw r9
        L_0x00bb:
            r19 = r9
            r21 = r14
            r14 = r20
            r20 = r11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r9 = 0
            r2[r9] = r15
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r3, r14, r2)
            r14 = r2
        L_0x00ce:
            goto L_0x00e9
        L_0x00cf:
            r19 = r9
            r20 = r11
            r21 = r14
            if (r4 == 0) goto L_0x00e7
            a.r.a.a.d$a r2 = new a.r.a.a.d$a
            r2.<init>()
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r11 = 0
            r9[r11] = r4
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofObject(r3, r2, r9)
            goto L_0x00e9
        L_0x00e7:
            r14 = r21
        L_0x00e9:
            r11 = r25
            r9 = r20
            goto L_0x01e4
        L_0x00ef:
            r18 = r4
            r19 = r9
            r20 = r11
            r21 = r14
            r2 = 0
            r4 = 3
            if (r12 != r4) goto L_0x00ff
            a.r.a.a.e r2 = p000a.p059r.p060a.p061a.C0741e.m3600a()
        L_0x00ff:
            r4 = 5
            r5 = 0
            if (r13 == 0) goto L_0x015e
            if (r7 == 0) goto L_0x0142
            if (r8 != r4) goto L_0x010c
            float r6 = r0.getDimension(r1, r5)
            goto L_0x0110
        L_0x010c:
            float r6 = r0.getFloat(r1, r5)
        L_0x0110:
            if (r10 == 0) goto L_0x0132
            r9 = r20
            if (r9 != r4) goto L_0x011d
            r11 = r25
            float r4 = r0.getDimension(r11, r5)
            goto L_0x0123
        L_0x011d:
            r11 = r25
            float r4 = r0.getFloat(r11, r5)
        L_0x0123:
            r5 = 2
            float[] r5 = new float[r5]
            r14 = 0
            r5[r14] = r6
            r15 = 1
            r5[r15] = r4
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r5)
            r14 = r5
            goto L_0x015c
        L_0x0132:
            r11 = r25
            r9 = r20
            r14 = 0
            r15 = 1
            float[] r4 = new float[r15]
            r4[r14] = r6
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            r14 = r4
            goto L_0x015c
        L_0x0142:
            r11 = r25
            r9 = r20
            if (r9 != r4) goto L_0x014d
            float r4 = r0.getDimension(r11, r5)
            goto L_0x0151
        L_0x014d:
            float r4 = r0.getFloat(r11, r5)
        L_0x0151:
            r5 = 1
            float[] r5 = new float[r5]
            r6 = 0
            r5[r6] = r4
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofFloat(r3, r5)
            r14 = r5
        L_0x015c:
            goto L_0x01dd
        L_0x015e:
            r11 = r25
            r9 = r20
            if (r7 == 0) goto L_0x01b4
            if (r8 != r4) goto L_0x016c
            float r6 = r0.getDimension(r1, r5)
            int r6 = (int) r6
            goto L_0x017f
        L_0x016c:
            boolean r6 = m3587h(r8)
            if (r6 == 0) goto L_0x0179
            r6 = 0
            int r14 = r0.getColor(r1, r6)
            r6 = r14
            goto L_0x017f
        L_0x0179:
            r6 = 0
            int r14 = r0.getInt(r1, r6)
            r6 = r14
        L_0x017f:
            if (r10 == 0) goto L_0x01a9
            if (r9 != r4) goto L_0x018b
            float r4 = r0.getDimension(r11, r5)
            int r4 = (int) r4
            r5 = r4
            r4 = 0
            goto L_0x019c
        L_0x018b:
            boolean r4 = m3587h(r9)
            if (r4 == 0) goto L_0x0197
            r4 = 0
            int r5 = r0.getColor(r11, r4)
            goto L_0x019c
        L_0x0197:
            r4 = 0
            int r5 = r0.getInt(r11, r4)
        L_0x019c:
            r14 = 2
            int[] r14 = new int[r14]
            r14[r4] = r6
            r15 = 1
            r14[r15] = r5
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofInt(r3, r14)
            goto L_0x01dd
        L_0x01a9:
            r4 = 0
            r15 = 1
            int[] r5 = new int[r15]
            r5[r4] = r6
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofInt(r3, r5)
            goto L_0x01dd
        L_0x01b4:
            if (r10 == 0) goto L_0x01db
            if (r9 != r4) goto L_0x01c0
            float r4 = r0.getDimension(r11, r5)
            int r4 = (int) r4
            r5 = r4
            r4 = 0
            goto L_0x01d1
        L_0x01c0:
            boolean r4 = m3587h(r9)
            if (r4 == 0) goto L_0x01cc
            r4 = 0
            int r5 = r0.getColor(r11, r4)
            goto L_0x01d1
        L_0x01cc:
            r4 = 0
            int r5 = r0.getInt(r11, r4)
        L_0x01d1:
            r6 = 1
            int[] r6 = new int[r6]
            r6[r4] = r5
            android.animation.PropertyValuesHolder r14 = android.animation.PropertyValuesHolder.ofInt(r3, r6)
            goto L_0x01dd
        L_0x01db:
            r14 = r21
        L_0x01dd:
            if (r14 == 0) goto L_0x01e4
            if (r2 == 0) goto L_0x01e4
            r14.setEvaluator(r2)
        L_0x01e4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p059r.p060a.p061a.C0739d.m3584e(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: q */
    public static void m3596q(ValueAnimator anim, TypedArray arrayAnimator, TypedArray arrayObjectAnimator, float pixelSize, XmlPullParser parser) {
        long duration = (long) C0355g.m1840g(arrayAnimator, parser, "duration", 1, 300);
        long startDelay = (long) C0355g.m1840g(arrayAnimator, parser, "startOffset", 2, 0);
        int valueType = C0355g.m1840g(arrayAnimator, parser, "valueType", 7, 4);
        if (C0355g.m1843j(parser, "valueFrom") && C0355g.m1843j(parser, "valueTo")) {
            if (valueType == 4) {
                valueType = m3585f(arrayAnimator, 5, 6);
            }
            PropertyValuesHolder pvh = m3584e(arrayAnimator, valueType, 5, 6, "");
            if (pvh != null) {
                anim.setValues(new PropertyValuesHolder[]{pvh});
            }
        }
        anim.setDuration(duration);
        anim.setStartDelay(startDelay);
        anim.setRepeatCount(C0355g.m1840g(arrayAnimator, parser, "repeatCount", 3, 0));
        anim.setRepeatMode(C0355g.m1840g(arrayAnimator, parser, "repeatMode", 4, 1));
        if (arrayObjectAnimator != null) {
            m3597r(anim, arrayObjectAnimator, valueType, pixelSize, parser);
        }
    }

    /* renamed from: r */
    public static void m3597r(ValueAnimator anim, TypedArray arrayObjectAnimator, int valueType, float pixelSize, XmlPullParser parser) {
        ObjectAnimator oa = (ObjectAnimator) anim;
        String pathData = C0355g.m1842i(arrayObjectAnimator, parser, "pathData", 1);
        if (pathData != null) {
            String propertyXName = C0355g.m1842i(arrayObjectAnimator, parser, "propertyXName", 2);
            String propertyYName = C0355g.m1842i(arrayObjectAnimator, parser, "propertyYName", 3);
            if (valueType == 2 || valueType == 4) {
            }
            if (propertyXName == null && propertyYName == null) {
                throw new InflateException(arrayObjectAnimator.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m3598s(C0357b.m1854e(pathData), oa, 0.5f * pixelSize, propertyXName, propertyYName);
            return;
        }
        oa.setPropertyName(C0355g.m1842i(arrayObjectAnimator, parser, "propertyName", 0));
    }

    /* renamed from: s */
    public static void m3598s(Path path, ObjectAnimator oa, float precision, String propertyXName, String propertyYName) {
        Path path2 = path;
        ObjectAnimator objectAnimator = oa;
        String str = propertyXName;
        String str2 = propertyYName;
        boolean z = false;
        PathMeasure measureForTotalLength = new PathMeasure(path2, false);
        float totalLength = 0.0f;
        ArrayList<Float> contourLengths = new ArrayList<>();
        contourLengths.add(Float.valueOf(0.0f));
        while (true) {
            totalLength += measureForTotalLength.getLength();
            contourLengths.add(Float.valueOf(totalLength));
            if (!measureForTotalLength.nextContour()) {
                break;
            }
            z = false;
            path2 = path;
        }
        PathMeasure pathMeasure = new PathMeasure(path2, z);
        int numPoints = Math.min(100, ((int) (totalLength / precision)) + 1);
        float[] mX = new float[numPoints];
        float[] mY = new float[numPoints];
        float[] position = new float[2];
        int contourIndex = 0;
        float step = totalLength / ((float) (numPoints - 1));
        float currentDistance = 0.0f;
        int i = 0;
        while (i < numPoints) {
            pathMeasure.getPosTan(currentDistance - contourLengths.get(contourIndex).floatValue(), position, (float[]) null);
            mX[i] = position[0];
            mY[i] = position[1];
            currentDistance += step;
            if (contourIndex + 1 < contourLengths.size() && currentDistance > contourLengths.get(contourIndex + 1).floatValue()) {
                contourIndex++;
                pathMeasure.nextContour();
            }
            i++;
            Path path3 = path;
        }
        PropertyValuesHolder x = null;
        PropertyValuesHolder y = null;
        if (str != null) {
            x = PropertyValuesHolder.ofFloat(str, mX);
        }
        if (str2 != null) {
            y = PropertyValuesHolder.ofFloat(str2, mY);
        }
        if (x == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{y});
        } else if (y == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{x});
        } else {
            objectAnimator.setValues(new PropertyValuesHolder[]{x, y});
        }
    }

    /* renamed from: a */
    public static Animator m3580a(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, float pixelSize) {
        return m3581b(context, res, theme, parser, Xml.asAttributeSet(parser), (AnimatorSet) null, 0, pixelSize);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m3581b(android.content.Context r19, android.content.res.Resources r20, android.content.res.Resources.Theme r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.animation.AnimatorSet r24, int r25, float r26) {
        /*
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r24
            r0 = 0
            r1 = 0
            int r12 = r22.getDepth()
            r7 = r0
            r13 = r1
        L_0x0010:
            int r0 = r22.next()
            r14 = r0
            r1 = 3
            if (r0 != r1) goto L_0x0023
            int r0 = r22.getDepth()
            if (r0 <= r12) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            r1 = r19
            goto L_0x00f2
        L_0x0023:
            r0 = 1
            if (r14 == r0) goto L_0x00f0
            r0 = 2
            if (r14 == r0) goto L_0x002a
            goto L_0x0010
        L_0x002a:
            java.lang.String r15 = r22.getName()
            r16 = 0
            java.lang.String r0 = "objectAnimator"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x004d
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r26
            r5 = r22
            android.animation.ObjectAnimator r0 = m3593n(r0, r1, r2, r3, r4, r5)
            r1 = r19
            r7 = r0
            goto L_0x00c2
        L_0x004d:
            java.lang.String r0 = "animator"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x006a
            r4 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r5 = r26
            r6 = r22
            android.animation.ValueAnimator r0 = m3591l(r0, r1, r2, r3, r4, r5, r6)
            r1 = r19
            r7 = r0
            goto L_0x00c2
        L_0x006a:
            java.lang.String r0 = "set"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00a0
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            int[] r0 = p000a.p059r.p060a.p061a.C0733a.f2768h
            r7 = r23
            android.content.res.TypedArray r6 = p000a.p025h.p027e.p028c.C0355g.m1844k(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            r1 = 0
            int r17 = p000a.p025h.p027e.p028c.C0355g.m1840g(r6, r10, r0, r1, r1)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r18 = r6
            r6 = r17
            r7 = r26
            m3581b(r0, r1, r2, r3, r4, r5, r6, r7)
            r18.recycle()
            r1 = r19
            r7 = r5
            goto L_0x00c2
        L_0x00a0:
            java.lang.String r0 = "propertyValuesHolder"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d3
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r22)
            r1 = r19
            android.animation.PropertyValuesHolder[] r0 = m3595p(r1, r8, r9, r10, r0)
            if (r0 == 0) goto L_0x00bf
            boolean r2 = r7 instanceof android.animation.ValueAnimator
            if (r2 == 0) goto L_0x00bf
            r2 = r7
            android.animation.ValueAnimator r2 = (android.animation.ValueAnimator) r2
            r2.setValues(r0)
        L_0x00bf:
            r16 = 1
        L_0x00c2:
            if (r11 == 0) goto L_0x00d1
            if (r16 != 0) goto L_0x00d1
            if (r13 != 0) goto L_0x00ce
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13 = r0
        L_0x00ce:
            r13.add(r7)
        L_0x00d1:
            goto L_0x0010
        L_0x00d3:
            r1 = r19
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown animator name: "
            r2.append(r3)
            java.lang.String r3 = r22.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00f0:
            r1 = r19
        L_0x00f2:
            if (r11 == 0) goto L_0x011c
            if (r13 == 0) goto L_0x011c
            int r0 = r13.size()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r2 = 0
            java.util.Iterator r3 = r13.iterator()
        L_0x0101:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r2 + 1
            r0[r2] = r4
            r2 = r5
            goto L_0x0101
        L_0x0113:
            if (r25 != 0) goto L_0x0119
            r11.playTogether(r0)
            goto L_0x011c
        L_0x0119:
            r11.playSequentially(r0)
        L_0x011c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p059r.p060a.p061a.C0739d.m3581b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: p */
    public static PropertyValuesHolder[] m3595p(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, AttributeSet attrs) {
        XmlPullParser xmlPullParser = parser;
        ArrayList<PropertyValuesHolder> values = null;
        while (true) {
            int eventType = parser.getEventType();
            int type = eventType;
            if (eventType == 3 || type == 1) {
                Resources resources = res;
                Resources.Theme theme2 = theme;
                AttributeSet attributeSet = attrs;
                PropertyValuesHolder[] valuesArray = null;
            } else if (type != 2) {
                parser.next();
            } else {
                if (parser.getName().equals("propertyValuesHolder")) {
                    TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2769i);
                    String propertyName = C0355g.m1842i(a, xmlPullParser, "propertyName", 3);
                    int valueType = C0355g.m1840g(a, xmlPullParser, "valueType", 2, 4);
                    int valueType2 = valueType;
                    PropertyValuesHolder pvh = m3594o(context, res, theme, parser, propertyName, valueType);
                    if (pvh == null) {
                        pvh = m3584e(a, valueType2, 0, 1, propertyName);
                    }
                    if (pvh != null) {
                        if (values == null) {
                            values = new ArrayList<>();
                        }
                        values.add(pvh);
                    }
                    a.recycle();
                } else {
                    Resources resources2 = res;
                    Resources.Theme theme3 = theme;
                    AttributeSet attributeSet2 = attrs;
                }
                parser.next();
            }
        }
        Resources resources3 = res;
        Resources.Theme theme22 = theme;
        AttributeSet attributeSet3 = attrs;
        PropertyValuesHolder[] valuesArray2 = null;
        if (values != null) {
            int count = values.size();
            valuesArray2 = new PropertyValuesHolder[count];
            for (int i = 0; i < count; i++) {
                valuesArray2[i] = values.get(i);
            }
        }
        return valuesArray2;
    }

    /* renamed from: g */
    public static int m3586g(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        int valueType;
        TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2770j);
        boolean hasValue = false;
        TypedValue keyframeValue = C0355g.m1845l(a, parser, "value", 0);
        if (keyframeValue != null) {
            hasValue = true;
        }
        if (!hasValue || !m3587h(keyframeValue.type)) {
            valueType = 0;
        } else {
            valueType = 3;
        }
        a.recycle();
        return valueType;
    }

    /* renamed from: f */
    public static int m3585f(TypedArray styledAttributes, int valueFromId, int valueToId) {
        TypedValue tvFrom = styledAttributes.peekValue(valueFromId);
        boolean hasTo = true;
        int toType = 0;
        boolean hasFrom = tvFrom != null;
        int fromType = hasFrom ? tvFrom.type : 0;
        TypedValue tvTo = styledAttributes.peekValue(valueToId);
        if (tvTo == null) {
            hasTo = false;
        }
        if (hasTo) {
            toType = tvTo.type;
        }
        if ((!hasFrom || !m3587h(fromType)) && (!hasTo || !m3587h(toType))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: o */
    public static PropertyValuesHolder m3594o(Context context, Resources res, Resources.Theme theme, XmlPullParser parser, String propertyName, int valueType) {
        int type;
        PropertyValuesHolder value;
        PropertyValuesHolder value2;
        int type2;
        ArrayList<Keyframe> keyframes;
        PropertyValuesHolder value3 = null;
        ArrayList<Keyframe> keyframes2 = null;
        int valueType2 = valueType;
        while (true) {
            int next = parser.next();
            type = next;
            if (next == 3 || type == 1) {
                Resources resources = res;
                Resources.Theme theme2 = theme;
                XmlPullParser xmlPullParser = parser;
            } else if (parser.getName().equals("keyframe")) {
                if (valueType2 == 4) {
                    valueType2 = m3586g(res, theme, Xml.asAttributeSet(parser), parser);
                } else {
                    Resources resources2 = res;
                    Resources.Theme theme3 = theme;
                    XmlPullParser xmlPullParser2 = parser;
                }
                Keyframe keyframe = m3592m(context, res, theme, Xml.asAttributeSet(parser), valueType2, parser);
                if (keyframe != null) {
                    if (keyframes2 == null) {
                        keyframes2 = new ArrayList<>();
                    }
                    keyframes2.add(keyframe);
                }
                parser.next();
            } else {
                Resources resources3 = res;
                Resources.Theme theme4 = theme;
                XmlPullParser xmlPullParser3 = parser;
            }
        }
        Resources resources4 = res;
        Resources.Theme theme22 = theme;
        XmlPullParser xmlPullParser4 = parser;
        if (keyframes2 != null) {
            int size = keyframes2.size();
            int count = size;
            if (size > 0) {
                Keyframe firstKeyframe = keyframes2.get(0);
                Keyframe lastKeyframe = keyframes2.get(count - 1);
                float endFraction = lastKeyframe.getFraction();
                float f = 0.0f;
                if (endFraction < 1.0f) {
                    if (endFraction < 0.0f) {
                        lastKeyframe.setFraction(1.0f);
                    } else {
                        keyframes2.add(keyframes2.size(), m3582c(lastKeyframe, 1.0f));
                        count++;
                    }
                }
                float startFraction = firstKeyframe.getFraction();
                if (startFraction != 0.0f) {
                    if (startFraction < 0.0f) {
                        firstKeyframe.setFraction(0.0f);
                    } else {
                        keyframes2.add(0, m3582c(firstKeyframe, 0.0f));
                        count++;
                    }
                }
                Keyframe[] keyframeArray = new Keyframe[count];
                keyframes2.toArray(keyframeArray);
                int i = 0;
                while (i < count) {
                    Keyframe keyframe2 = keyframeArray[i];
                    if (keyframe2.getFraction() >= f) {
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == 0) {
                        keyframe2.setFraction(f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else if (i == count - 1) {
                        keyframe2.setFraction(1.0f);
                        value2 = value3;
                        keyframes = keyframes2;
                        type2 = type;
                    } else {
                        int startIndex = i;
                        value2 = value3;
                        int j = startIndex + 1;
                        keyframes = keyframes2;
                        int endIndex = i;
                        while (true) {
                            type2 = type;
                            if (j >= count - 1) {
                                break;
                            } else if (keyframeArray[j].getFraction() >= 0.0f) {
                                break;
                            } else {
                                endIndex = j;
                                j++;
                                type = type2;
                            }
                        }
                        m3583d(keyframeArray, keyframeArray[endIndex + 1].getFraction() - keyframeArray[startIndex - 1].getFraction(), startIndex, endIndex);
                    }
                    i++;
                    keyframes2 = keyframes;
                    type = type2;
                    value3 = value2;
                    f = 0.0f;
                }
                ArrayList<Keyframe> arrayList = keyframes2;
                int i2 = type;
                PropertyValuesHolder value4 = PropertyValuesHolder.ofKeyframe(propertyName, keyframeArray);
                if (valueType2 != 3) {
                    return value4;
                }
                value4.setEvaluator(C0741e.m3600a());
                return value4;
            }
            value = null;
            ArrayList<Keyframe> arrayList2 = keyframes2;
            int i3 = type;
            String str = propertyName;
        } else {
            value = null;
            ArrayList<Keyframe> arrayList3 = keyframes2;
            int i4 = type;
            String str2 = propertyName;
        }
        return value;
    }

    /* renamed from: c */
    public static Keyframe m3582c(Keyframe sampleKeyframe, float fraction) {
        if (sampleKeyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(fraction);
        }
        if (sampleKeyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(fraction);
        }
        return Keyframe.ofObject(fraction);
    }

    /* renamed from: d */
    public static void m3583d(Keyframe[] keyframes, float gap, int startIndex, int endIndex) {
        float increment = gap / ((float) ((endIndex - startIndex) + 2));
        for (int i = startIndex; i <= endIndex; i++) {
            keyframes[i].setFraction(keyframes[i - 1].getFraction() + increment);
        }
    }

    /* renamed from: m */
    public static Keyframe m3592m(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, int valueType, XmlPullParser parser) {
        Keyframe keyframe;
        TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2770j);
        Keyframe keyframe2 = null;
        float fraction = C0355g.m1839f(a, parser, "fraction", 3, -1.0f);
        TypedValue keyframeValue = C0355g.m1845l(a, parser, "value", 0);
        boolean hasValue = keyframeValue != null;
        if (valueType == 4) {
            if (!hasValue || !m3587h(keyframeValue.type)) {
                valueType = 0;
            } else {
                valueType = 3;
            }
        }
        if (!hasValue) {
            if (valueType == 0) {
                keyframe = Keyframe.ofFloat(fraction);
            } else {
                keyframe = Keyframe.ofInt(fraction);
            }
            keyframe2 = keyframe;
        } else if (valueType == 0) {
            keyframe2 = Keyframe.ofFloat(fraction, C0355g.m1839f(a, parser, "value", 0, 0.0f));
        } else if (valueType == 1 || valueType == 3) {
            keyframe2 = Keyframe.ofInt(fraction, C0355g.m1840g(a, parser, "value", 0, 0));
        }
        int resID = C0355g.m1841h(a, parser, "interpolator", 1, 0);
        if (resID > 0) {
            keyframe2.setInterpolator(C0738c.m3579b(context, resID));
        }
        a.recycle();
        return keyframe2;
    }

    /* renamed from: n */
    public static ObjectAnimator m3593n(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, float pathErrorScale, XmlPullParser parser) {
        ObjectAnimator anim = new ObjectAnimator();
        m3591l(context, res, theme, attrs, anim, pathErrorScale, parser);
        return anim;
    }

    /* renamed from: l */
    public static ValueAnimator m3591l(Context context, Resources res, Resources.Theme theme, AttributeSet attrs, ValueAnimator anim, float pathErrorScale, XmlPullParser parser) {
        TypedArray arrayAnimator = C0355g.m1844k(res, theme, attrs, C0733a.f2767g);
        TypedArray arrayObjectAnimator = C0355g.m1844k(res, theme, attrs, C0733a.f2771k);
        if (anim == null) {
            anim = new ValueAnimator();
        }
        m3596q(anim, arrayAnimator, arrayObjectAnimator, pathErrorScale, parser);
        int resID = C0355g.m1841h(arrayAnimator, parser, "interpolator", 0, 0);
        if (resID > 0) {
            anim.setInterpolator(C0738c.m3579b(context, resID));
        }
        arrayAnimator.recycle();
        if (arrayObjectAnimator != null) {
            arrayObjectAnimator.recycle();
        }
        return anim;
    }

    /* renamed from: h */
    public static boolean m3587h(int type) {
        return type >= 28 && type <= 31;
    }
}
