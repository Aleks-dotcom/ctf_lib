package p000a.p059r.p060a.p061a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p018e.C0256a;
import p000a.p025h.p027e.p028c.C0342b;
import p000a.p025h.p027e.p028c.C0355g;
import p000a.p025h.p029f.C0357b;
import p000a.p025h.p029f.p030j.C0370a;

/* renamed from: a.r.a.a.h */
public class C0744h extends C0743g {

    /* renamed from: k */
    public static final PorterDuff.Mode f2789k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public C0752h f2790c;

    /* renamed from: d */
    public PorterDuffColorFilter f2791d;

    /* renamed from: e */
    public ColorFilter f2792e;

    /* renamed from: f */
    public boolean f2793f;

    /* renamed from: g */
    public boolean f2794g;

    /* renamed from: h */
    public final float[] f2795h;

    /* renamed from: i */
    public final Matrix f2796i;

    /* renamed from: j */
    public final Rect f2797j;

    public C0744h() {
        this.f2794g = true;
        this.f2795h = new float[9];
        this.f2796i = new Matrix();
        this.f2797j = new Rect();
        this.f2790c = new C0752h();
    }

    public C0744h(C0752h state) {
        this.f2794g = true;
        this.f2795h = new float[9];
        this.f2796i = new Matrix();
        this.f2797j = new Rect();
        this.f2790c = state;
        this.f2791d = mo3696j(this.f2791d, state.f2846c, state.f2847d);
    }

    public Drawable mutate() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2793f && super.mutate() == this) {
            this.f2790c = new C0752h(this.f2790c);
            this.f2793f = true;
        }
        return this;
    }

    /* renamed from: d */
    public Object mo3678d(String name) {
        return this.f2790c.f2845b.f2843p.get(name);
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f2788b != null && Build.VERSION.SDK_INT >= 24) {
            return new C0753i(this.f2788b.getConstantState());
        }
        this.f2790c.f2844a = getChangingConfigurations();
        return this.f2790c;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2797j);
        if (this.f2797j.width() > 0 && this.f2797j.height() > 0) {
            ColorFilter colorFilter = this.f2792e;
            if (colorFilter == null) {
                colorFilter = this.f2791d;
            }
            canvas.getMatrix(this.f2796i);
            this.f2796i.getValues(this.f2795h);
            float canvasScaleX = Math.abs(this.f2795h[0]);
            float canvasScaleY = Math.abs(this.f2795h[4]);
            float canvasSkewX = Math.abs(this.f2795h[1]);
            float canvasSkewY = Math.abs(this.f2795h[3]);
            if (!(canvasSkewX == 0.0f && canvasSkewY == 0.0f)) {
                canvasScaleX = 1.0f;
                canvasScaleY = 1.0f;
            }
            int scaledWidth = Math.min(2048, (int) (((float) this.f2797j.width()) * canvasScaleX));
            int scaledHeight = Math.min(2048, (int) (((float) this.f2797j.height()) * canvasScaleY));
            if (scaledWidth > 0 && scaledHeight > 0) {
                int saveCount = canvas.save();
                Rect rect = this.f2797j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (mo3681f()) {
                    canvas.translate((float) this.f2797j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f2797j.offsetTo(0, 0);
                this.f2790c.mo3766c(scaledWidth, scaledHeight);
                if (!this.f2794g) {
                    this.f2790c.mo3774j(scaledWidth, scaledHeight);
                } else if (!this.f2790c.mo3765b()) {
                    this.f2790c.mo3774j(scaledWidth, scaledHeight);
                    this.f2790c.mo3773i();
                }
                this.f2790c.mo3767d(canvas, colorFilter, this.f2797j);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1934d(drawable);
        }
        return this.f2790c.f2845b.getRootAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f2790c.f2845b.getRootAlpha() != alpha) {
            this.f2790c.f2845b.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2792e = colorFilter;
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1935e(drawable);
        }
        return this.f2792e;
    }

    /* renamed from: j */
    public PorterDuffColorFilter mo3696j(PorterDuffColorFilter tintFilter, ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }

    public void setTint(int tint) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1944n(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1945o(drawable, tint);
            return;
        }
        C0752h state = this.f2790c;
        if (state.f2846c != tint) {
            state.f2846c = tint;
            this.f2791d = mo3696j(this.f2791d, tint, state.f2847d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1946p(drawable, tintMode);
            return;
        }
        C0752h state = this.f2790c;
        if (state.f2847d != tintMode) {
            state.f2847d = tintMode;
            this.f2791d = mo3696j(this.f2791d, state.f2846c, tintMode);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f2790c.f2846c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f2790c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f2788b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            a.r.a.a.h$h r0 = r1.f2790c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo3770g()
            if (r0 != 0) goto L_0x0028
            a.r.a.a.h$h r0 = r1.f2790c
            android.content.res.ColorStateList r0 = r0.f2846c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p059r.p060a.p061a.C0744h.isStateful():boolean");
    }

    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        C0752h state = this.f2790c;
        ColorStateList colorStateList = state.f2846c;
        if (!(colorStateList == null || (mode = state.f2847d) == null)) {
            this.f2791d = mo3696j(this.f2791d, colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (!state.mo3770g() || !state.mo3772h(stateSet)) {
            return changed;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f2790c.f2845b.f2836i;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f2790c.f2845b.f2837j;
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f2788b;
        if (drawable == null) {
            return false;
        }
        C0370a.m1932b(drawable);
        return false;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return C0370a.m1938h(drawable);
        }
        return this.f2790c.f2848e;
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1940j(drawable, mirrored);
        } else {
            this.f2790c.f2848e = mirrored;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000a.p059r.p060a.p061a.C0744h m3606b(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            a.r.a.a.h r0 = new a.r.a.a.h
            r0.<init>()
            android.graphics.drawable.Drawable r1 = p000a.p025h.p027e.p028c.C0351f.m1824a(r7, r8, r9)
            r0.f2788b = r1
            a.r.a.a.h$i r1 = new a.r.a.a.h$i
            android.graphics.drawable.Drawable r2 = r0.f2788b
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r2 = r7.getXml(r8)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0029:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            r5 = r4
            r6 = 2
            if (r4 == r6) goto L_0x0035
            r4 = 1
            if (r5 == r4) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            if (r5 != r6) goto L_0x003c
            a.r.a.a.h r0 = m3607c(r7, r2, r3, r9)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            return r0
        L_0x003c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            java.lang.String r6 = "No start tag found"
            r4.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            throw r4     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
            goto L_0x004e
        L_0x0049:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p059r.p060a.p061a.C0744h.m3606b(android.content.res.Resources, int, android.content.res.Resources$Theme):a.r.a.a.h");
    }

    /* renamed from: c */
    public static C0744h m3607c(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        C0744h drawable = new C0744h();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    /* renamed from: a */
    public static int m3605a(int color, float alpha) {
        return (color & 16777215) | (((int) (((float) Color.alpha(color)) * alpha)) << 24);
    }

    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.inflate(res, parser, attrs);
        } else {
            inflate(res, parser, attrs, (Resources.Theme) null);
        }
    }

    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1937g(drawable, res, parser, attrs, theme);
            return;
        }
        C0752h state = this.f2790c;
        state.f2845b = new C0751g();
        TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2761a);
        mo3690i(a, parser, theme);
        a.recycle();
        state.f2844a = getChangingConfigurations();
        state.f2854k = true;
        mo3680e(res, parser, attrs, theme);
        this.f2791d = mo3696j(this.f2791d, state.f2846c, state.f2847d);
    }

    /* renamed from: g */
    public static PorterDuff.Mode m3608g(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    /* renamed from: i */
    public final void mo3690i(TypedArray a, XmlPullParser parser, Resources.Theme theme) {
        C0752h state = this.f2790c;
        C0751g pathRenderer = state.f2845b;
        state.f2847d = m3608g(C0355g.m1840g(a, parser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList tint = C0355g.m1836c(a, parser, theme, "tint", 1);
        if (tint != null) {
            state.f2846c = tint;
        }
        state.f2848e = C0355g.m1834a(a, parser, "autoMirrored", 5, state.f2848e);
        pathRenderer.f2838k = C0355g.m1839f(a, parser, "viewportWidth", 7, pathRenderer.f2838k);
        float f = C0355g.m1839f(a, parser, "viewportHeight", 8, pathRenderer.f2839l);
        pathRenderer.f2839l = f;
        if (pathRenderer.f2838k <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            pathRenderer.f2836i = a.getDimension(3, pathRenderer.f2836i);
            float dimension = a.getDimension(2, pathRenderer.f2837j);
            pathRenderer.f2837j = dimension;
            if (pathRenderer.f2836i <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                pathRenderer.setAlpha(C0355g.m1839f(a, parser, "alpha", 4, pathRenderer.getAlpha()));
                String name = a.getString(0);
                if (name != null) {
                    pathRenderer.f2841n = name;
                    pathRenderer.f2843p.put(name, pathRenderer);
                }
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: e */
    public final void mo3680e(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Resources resources = res;
        XmlPullParser xmlPullParser = parser;
        AttributeSet attributeSet = attrs;
        Resources.Theme theme2 = theme;
        C0752h state = this.f2790c;
        C0751g pathRenderer = state.f2845b;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.f2835h);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i = 1; eventType != i && (parser.getDepth() >= innerDepth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                C0748d currentGroup = (C0748d) groupStack.peek();
                if ("path".equals(tagName)) {
                    C0747c path = new C0747c();
                    path.mo3713g(resources, attributeSet, theme2, xmlPullParser);
                    currentGroup.f2811b.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.f2843p.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f2844a |= path.f2826d;
                } else if ("clip-path".equals(tagName)) {
                    C0746b path2 = new C0746b();
                    path2.mo3707e(resources, attributeSet, theme2, xmlPullParser);
                    currentGroup.f2811b.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.f2843p.put(path2.getPathName(), path2);
                    }
                    state.f2844a |= path2.f2826d;
                } else if ("group".equals(tagName)) {
                    C0748d newChildGroup = new C0748d();
                    newChildGroup.mo3731c(resources, attributeSet, theme2, xmlPullParser);
                    currentGroup.f2811b.add(newChildGroup);
                    groupStack.push(newChildGroup);
                    if (newChildGroup.getGroupName() != null) {
                        pathRenderer.f2843p.put(newChildGroup.getGroupName(), newChildGroup);
                    }
                    state.f2844a |= newChildGroup.f2820k;
                }
            } else if (eventType == 3 && "group".equals(parser.getName())) {
                groupStack.pop();
            }
            eventType = parser.next();
        }
        if (noPathTag) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: h */
    public void mo3689h(boolean allowCaching) {
        this.f2794g = allowCaching;
    }

    /* renamed from: f */
    public final boolean mo3681f() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0370a.m1936f(this) != 1) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2790c.getChangingConfigurations();
    }

    public void invalidateSelf() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    public void unscheduleSelf(Runnable what) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    /* renamed from: a.r.a.a.h$i */
    public static class C0753i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f2856a;

        public C0753i(Drawable.ConstantState state) {
            this.f2856a = state;
        }

        public Drawable newDrawable() {
            C0744h drawableCompat = new C0744h();
            drawableCompat.f2788b = (VectorDrawable) this.f2856a.newDrawable();
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            C0744h drawableCompat = new C0744h();
            drawableCompat.f2788b = (VectorDrawable) this.f2856a.newDrawable(res);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            C0744h drawableCompat = new C0744h();
            drawableCompat.f2788b = (VectorDrawable) this.f2856a.newDrawable(res, theme);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f2856a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f2856a.getChangingConfigurations();
        }
    }

    /* renamed from: a.r.a.a.h$h */
    public static class C0752h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f2844a;

        /* renamed from: b */
        public C0751g f2845b;

        /* renamed from: c */
        public ColorStateList f2846c;

        /* renamed from: d */
        public PorterDuff.Mode f2847d;

        /* renamed from: e */
        public boolean f2848e;

        /* renamed from: f */
        public Bitmap f2849f;

        /* renamed from: g */
        public ColorStateList f2850g;

        /* renamed from: h */
        public PorterDuff.Mode f2851h;

        /* renamed from: i */
        public int f2852i;

        /* renamed from: j */
        public boolean f2853j;

        /* renamed from: k */
        public boolean f2854k;

        /* renamed from: l */
        public Paint f2855l;

        public C0752h(C0752h copy) {
            this.f2846c = null;
            this.f2847d = C0744h.f2789k;
            if (copy != null) {
                this.f2844a = copy.f2844a;
                C0751g gVar = new C0751g(copy.f2845b);
                this.f2845b = gVar;
                if (copy.f2845b.f2832e != null) {
                    gVar.f2832e = new Paint(copy.f2845b.f2832e);
                }
                if (copy.f2845b.f2831d != null) {
                    this.f2845b.f2831d = new Paint(copy.f2845b.f2831d);
                }
                this.f2846c = copy.f2846c;
                this.f2847d = copy.f2847d;
                this.f2848e = copy.f2848e;
            }
        }

        /* renamed from: d */
        public void mo3767d(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            canvas.drawBitmap(this.f2849f, (Rect) null, originalBounds, mo3768e(filter));
        }

        /* renamed from: f */
        public boolean mo3769f() {
            return this.f2845b.getRootAlpha() < 255;
        }

        /* renamed from: e */
        public Paint mo3768e(ColorFilter filter) {
            if (!mo3769f() && filter == null) {
                return null;
            }
            if (this.f2855l == null) {
                Paint paint = new Paint();
                this.f2855l = paint;
                paint.setFilterBitmap(true);
            }
            this.f2855l.setAlpha(this.f2845b.getRootAlpha());
            this.f2855l.setColorFilter(filter);
            return this.f2855l;
        }

        /* renamed from: j */
        public void mo3774j(int width, int height) {
            this.f2849f.eraseColor(0);
            this.f2845b.mo3754b(new Canvas(this.f2849f), width, height, (ColorFilter) null);
        }

        /* renamed from: c */
        public void mo3766c(int width, int height) {
            if (this.f2849f == null || !mo3764a(width, height)) {
                this.f2849f = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f2854k = true;
            }
        }

        /* renamed from: a */
        public boolean mo3764a(int width, int height) {
            if (width == this.f2849f.getWidth() && height == this.f2849f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo3765b() {
            if (!this.f2854k && this.f2850g == this.f2846c && this.f2851h == this.f2847d && this.f2853j == this.f2848e && this.f2852i == this.f2845b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void mo3773i() {
            this.f2850g = this.f2846c;
            this.f2851h = this.f2847d;
            this.f2852i = this.f2845b.getRootAlpha();
            this.f2853j = this.f2848e;
            this.f2854k = false;
        }

        public C0752h() {
            this.f2846c = null;
            this.f2847d = C0744h.f2789k;
            this.f2845b = new C0751g();
        }

        public Drawable newDrawable() {
            return new C0744h(this);
        }

        public Drawable newDrawable(Resources res) {
            return new C0744h(this);
        }

        public int getChangingConfigurations() {
            return this.f2844a;
        }

        /* renamed from: g */
        public boolean mo3770g() {
            return this.f2845b.mo3758f();
        }

        /* renamed from: h */
        public boolean mo3772h(int[] stateSet) {
            boolean changed = this.f2845b.mo3759g(stateSet);
            this.f2854k |= changed;
            return changed;
        }
    }

    /* renamed from: a.r.a.a.h$g */
    public static class C0751g {

        /* renamed from: q */
        public static final Matrix f2827q = new Matrix();

        /* renamed from: a */
        public final Path f2828a;

        /* renamed from: b */
        public final Path f2829b;

        /* renamed from: c */
        public final Matrix f2830c;

        /* renamed from: d */
        public Paint f2831d;

        /* renamed from: e */
        public Paint f2832e;

        /* renamed from: f */
        public PathMeasure f2833f;

        /* renamed from: g */
        public int f2834g;

        /* renamed from: h */
        public final C0748d f2835h;

        /* renamed from: i */
        public float f2836i;

        /* renamed from: j */
        public float f2837j;

        /* renamed from: k */
        public float f2838k;

        /* renamed from: l */
        public float f2839l;

        /* renamed from: m */
        public int f2840m;

        /* renamed from: n */
        public String f2841n;

        /* renamed from: o */
        public Boolean f2842o;

        /* renamed from: p */
        public final C0256a<String, Object> f2843p;

        public C0751g() {
            this.f2830c = new Matrix();
            this.f2836i = 0.0f;
            this.f2837j = 0.0f;
            this.f2838k = 0.0f;
            this.f2839l = 0.0f;
            this.f2840m = 255;
            this.f2841n = null;
            this.f2842o = null;
            this.f2843p = new C0256a<>();
            this.f2835h = new C0748d();
            this.f2828a = new Path();
            this.f2829b = new Path();
        }

        public void setRootAlpha(int alpha) {
            this.f2840m = alpha;
        }

        public int getRootAlpha() {
            return this.f2840m;
        }

        public void setAlpha(float alpha) {
            setRootAlpha((int) (255.0f * alpha));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0751g(C0751g copy) {
            this.f2830c = new Matrix();
            this.f2836i = 0.0f;
            this.f2837j = 0.0f;
            this.f2838k = 0.0f;
            this.f2839l = 0.0f;
            this.f2840m = 255;
            this.f2841n = null;
            this.f2842o = null;
            C0256a<String, Object> aVar = new C0256a<>();
            this.f2843p = aVar;
            this.f2835h = new C0748d(copy.f2835h, aVar);
            this.f2828a = new Path(copy.f2828a);
            this.f2829b = new Path(copy.f2829b);
            this.f2836i = copy.f2836i;
            this.f2837j = copy.f2837j;
            this.f2838k = copy.f2838k;
            this.f2839l = copy.f2839l;
            this.f2834g = copy.f2834g;
            this.f2840m = copy.f2840m;
            this.f2841n = copy.f2841n;
            String str = copy.f2841n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2842o = copy.f2842o;
        }

        /* renamed from: c */
        public final void mo3755c(C0748d currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h, ColorFilter filter) {
            C0748d dVar = currentGroup;
            dVar.f2810a.set(currentMatrix);
            dVar.f2810a.preConcat(dVar.f2819j);
            canvas.save();
            for (int i = 0; i < dVar.f2811b.size(); i++) {
                C0749e child = dVar.f2811b.get(i);
                if (child instanceof C0748d) {
                    mo3755c((C0748d) child, dVar.f2810a, canvas, w, h, filter);
                } else if (child instanceof C0750f) {
                    mo3756d(currentGroup, (C0750f) child, canvas, w, h, filter);
                }
            }
            canvas.restore();
        }

        /* renamed from: b */
        public void mo3754b(Canvas canvas, int w, int h, ColorFilter filter) {
            mo3755c(this.f2835h, f2827q, canvas, w, h, filter);
        }

        /* renamed from: d */
        public final void mo3756d(C0748d vGroup, C0750f vPath, Canvas canvas, int w, int h, ColorFilter filter) {
            float len;
            C0750f fVar = vPath;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter = filter;
            float scaleX = ((float) w) / this.f2838k;
            float scaleY = ((float) h) / this.f2839l;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f2810a;
            this.f2830c.set(groupStackedMatrix);
            this.f2830c.postScale(scaleX, scaleY);
            float matrixScale = mo3757e(groupStackedMatrix);
            if (matrixScale != 0.0f) {
                fVar.mo3750d(this.f2828a);
                Path path = this.f2828a;
                this.f2829b.reset();
                if (vPath.mo3706c()) {
                    this.f2829b.setFillType(fVar.f2825c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f2829b.addPath(path, this.f2830c);
                    canvas2.clipPath(this.f2829b);
                    float f = scaleX;
                    return;
                }
                C0747c fullPath = (C0747c) fVar;
                float f2 = fullPath.f2804k;
                if (f2 == 0.0f && fullPath.f2805l == 1.0f) {
                    float f3 = scaleX;
                } else {
                    float f4 = fullPath.f2806m;
                    float start = (f2 + f4) % 1.0f;
                    float end = (fullPath.f2805l + f4) % 1.0f;
                    if (this.f2833f == null) {
                        this.f2833f = new PathMeasure();
                    }
                    float f5 = scaleX;
                    this.f2833f.setPath(this.f2828a, false);
                    float len2 = this.f2833f.getLength();
                    float start2 = start * len2;
                    float end2 = end * len2;
                    path.reset();
                    if (start2 > end2) {
                        this.f2833f.getSegment(start2, len2, path, true);
                        float f6 = len2;
                        len = 0.0f;
                        this.f2833f.getSegment(0.0f, end2, path, true);
                    } else {
                        len = 0.0f;
                        this.f2833f.getSegment(start2, end2, path, true);
                    }
                    path.rLineTo(len, len);
                }
                this.f2829b.addPath(path, this.f2830c);
                if (fullPath.f2801h.mo2244l()) {
                    C0342b fill = fullPath.f2801h;
                    if (this.f2832e == null) {
                        Paint paint = new Paint(1);
                        this.f2832e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint fillPaint = this.f2832e;
                    if (fill.mo2240h()) {
                        Shader shader = fill.mo2239f();
                        shader.setLocalMatrix(this.f2830c);
                        fillPaint.setShader(shader);
                        fillPaint.setAlpha(Math.round(fullPath.f2803j * 255.0f));
                    } else {
                        fillPaint.setShader((Shader) null);
                        fillPaint.setAlpha(255);
                        fillPaint.setColor(C0744h.m3605a(fill.mo2238e(), fullPath.f2803j));
                    }
                    fillPaint.setColorFilter(colorFilter);
                    this.f2829b.setFillType(fullPath.f2825c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas2.drawPath(this.f2829b, fillPaint);
                }
                if (fullPath.f2799f.mo2244l()) {
                    C0342b strokeColor = fullPath.f2799f;
                    if (this.f2831d == null) {
                        Paint paint2 = new Paint(1);
                        this.f2831d = paint2;
                        paint2.setStyle(Paint.Style.STROKE);
                    }
                    Paint strokePaint = this.f2831d;
                    Paint.Join join = fullPath.f2808o;
                    if (join != null) {
                        strokePaint.setStrokeJoin(join);
                    }
                    Paint.Cap cap = fullPath.f2807n;
                    if (cap != null) {
                        strokePaint.setStrokeCap(cap);
                    }
                    strokePaint.setStrokeMiter(fullPath.f2809p);
                    if (strokeColor.mo2240h()) {
                        Shader shader2 = strokeColor.mo2239f();
                        shader2.setLocalMatrix(this.f2830c);
                        strokePaint.setShader(shader2);
                        strokePaint.setAlpha(Math.round(fullPath.f2802i * 255.0f));
                    } else {
                        strokePaint.setShader((Shader) null);
                        strokePaint.setAlpha(255);
                        strokePaint.setColor(C0744h.m3605a(strokeColor.mo2238e(), fullPath.f2802i));
                    }
                    strokePaint.setColorFilter(colorFilter);
                    strokePaint.setStrokeWidth(fullPath.f2800g * minScale * matrixScale);
                    canvas2.drawPath(this.f2829b, strokePaint);
                }
            }
        }

        /* renamed from: a */
        public static float m3633a(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        /* renamed from: e */
        public final float mo3757e(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float crossProduct = m3633a(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max((float) Math.hypot((double) unitVectors[0], (double) unitVectors[1]), (float) Math.hypot((double) unitVectors[2], (double) unitVectors[3]));
            if (maxScale > 0.0f) {
                return Math.abs(crossProduct) / maxScale;
            }
            return 0.0f;
        }

        /* renamed from: f */
        public boolean mo3758f() {
            if (this.f2842o == null) {
                this.f2842o = Boolean.valueOf(this.f2835h.mo3709a());
            }
            return this.f2842o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo3759g(int[] stateSet) {
            return this.f2835h.mo3710b(stateSet);
        }
    }

    /* renamed from: a.r.a.a.h$e */
    public static abstract class C0749e {
        public C0749e() {
        }

        /* renamed from: a */
        public boolean mo3709a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo3710b(int[] stateSet) {
            return false;
        }
    }

    /* renamed from: a.r.a.a.h$d */
    public static class C0748d extends C0749e {

        /* renamed from: a */
        public final Matrix f2810a;

        /* renamed from: b */
        public final ArrayList<C0749e> f2811b;

        /* renamed from: c */
        public float f2812c;

        /* renamed from: d */
        public float f2813d;

        /* renamed from: e */
        public float f2814e;

        /* renamed from: f */
        public float f2815f;

        /* renamed from: g */
        public float f2816g;

        /* renamed from: h */
        public float f2817h;

        /* renamed from: i */
        public float f2818i;

        /* renamed from: j */
        public final Matrix f2819j;

        /* renamed from: k */
        public int f2820k;

        /* renamed from: l */
        public int[] f2821l;

        /* renamed from: m */
        public String f2822m;

        public C0748d(C0748d copy, C0256a<String, Object> targetsMap) {
            super();
            C0750f newPath;
            this.f2810a = new Matrix();
            this.f2811b = new ArrayList<>();
            this.f2812c = 0.0f;
            this.f2813d = 0.0f;
            this.f2814e = 0.0f;
            this.f2815f = 1.0f;
            this.f2816g = 1.0f;
            this.f2817h = 0.0f;
            this.f2818i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2819j = matrix;
            this.f2822m = null;
            this.f2812c = copy.f2812c;
            this.f2813d = copy.f2813d;
            this.f2814e = copy.f2814e;
            this.f2815f = copy.f2815f;
            this.f2816g = copy.f2816g;
            this.f2817h = copy.f2817h;
            this.f2818i = copy.f2818i;
            this.f2821l = copy.f2821l;
            String str = copy.f2822m;
            this.f2822m = str;
            this.f2820k = copy.f2820k;
            if (str != null) {
                targetsMap.put(str, this);
            }
            matrix.set(copy.f2819j);
            ArrayList<C0749e> arrayList = copy.f2811b;
            for (int i = 0; i < arrayList.size(); i++) {
                C0749e eVar = arrayList.get(i);
                if (eVar instanceof C0748d) {
                    this.f2811b.add(new C0748d((C0748d) eVar, targetsMap));
                } else {
                    if (eVar instanceof C0747c) {
                        newPath = new C0747c((C0747c) eVar);
                    } else if (eVar instanceof C0746b) {
                        newPath = new C0746b((C0746b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f2811b.add(newPath);
                    String str2 = newPath.f2824b;
                    if (str2 != null) {
                        targetsMap.put(str2, newPath);
                    }
                }
            }
        }

        public C0748d() {
            super();
            this.f2810a = new Matrix();
            this.f2811b = new ArrayList<>();
            this.f2812c = 0.0f;
            this.f2813d = 0.0f;
            this.f2814e = 0.0f;
            this.f2815f = 1.0f;
            this.f2816g = 1.0f;
            this.f2817h = 0.0f;
            this.f2818i = 0.0f;
            this.f2819j = new Matrix();
            this.f2822m = null;
        }

        public String getGroupName() {
            return this.f2822m;
        }

        public Matrix getLocalMatrix() {
            return this.f2819j;
        }

        /* renamed from: c */
        public void mo3731c(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2762b);
            mo3733e(a, parser);
            a.recycle();
        }

        /* renamed from: e */
        public final void mo3733e(TypedArray a, XmlPullParser parser) {
            this.f2821l = null;
            this.f2812c = C0355g.m1839f(a, parser, "rotation", 5, this.f2812c);
            this.f2813d = a.getFloat(1, this.f2813d);
            this.f2814e = a.getFloat(2, this.f2814e);
            this.f2815f = C0355g.m1839f(a, parser, "scaleX", 3, this.f2815f);
            this.f2816g = C0355g.m1839f(a, parser, "scaleY", 4, this.f2816g);
            this.f2817h = C0355g.m1839f(a, parser, "translateX", 6, this.f2817h);
            this.f2818i = C0355g.m1839f(a, parser, "translateY", 7, this.f2818i);
            String groupName = a.getString(0);
            if (groupName != null) {
                this.f2822m = groupName;
            }
            mo3732d();
        }

        /* renamed from: d */
        public final void mo3732d() {
            this.f2819j.reset();
            this.f2819j.postTranslate(-this.f2813d, -this.f2814e);
            this.f2819j.postScale(this.f2815f, this.f2816g);
            this.f2819j.postRotate(this.f2812c, 0.0f, 0.0f);
            this.f2819j.postTranslate(this.f2817h + this.f2813d, this.f2818i + this.f2814e);
        }

        public float getRotation() {
            return this.f2812c;
        }

        public void setRotation(float rotation) {
            if (rotation != this.f2812c) {
                this.f2812c = rotation;
                mo3732d();
            }
        }

        public float getPivotX() {
            return this.f2813d;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f2813d) {
                this.f2813d = pivotX;
                mo3732d();
            }
        }

        public float getPivotY() {
            return this.f2814e;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f2814e) {
                this.f2814e = pivotY;
                mo3732d();
            }
        }

        public float getScaleX() {
            return this.f2815f;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f2815f) {
                this.f2815f = scaleX;
                mo3732d();
            }
        }

        public float getScaleY() {
            return this.f2816g;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f2816g) {
                this.f2816g = scaleY;
                mo3732d();
            }
        }

        public float getTranslateX() {
            return this.f2817h;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.f2817h) {
                this.f2817h = translateX;
                mo3732d();
            }
        }

        public float getTranslateY() {
            return this.f2818i;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.f2818i) {
                this.f2818i = translateY;
                mo3732d();
            }
        }

        /* renamed from: a */
        public boolean mo3709a() {
            for (int i = 0; i < this.f2811b.size(); i++) {
                if (this.f2811b.get(i).mo3709a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo3710b(int[] stateSet) {
            boolean changed = false;
            for (int i = 0; i < this.f2811b.size(); i++) {
                changed |= this.f2811b.get(i).mo3710b(stateSet);
            }
            return changed;
        }
    }

    /* renamed from: a.r.a.a.h$f */
    public static abstract class C0750f extends C0749e {

        /* renamed from: a */
        public C0357b.C0359b[] f2823a = null;

        /* renamed from: b */
        public String f2824b;

        /* renamed from: c */
        public int f2825c = 0;

        /* renamed from: d */
        public int f2826d;

        public C0750f() {
            super();
        }

        public C0750f(C0750f copy) {
            super();
            this.f2824b = copy.f2824b;
            this.f2826d = copy.f2826d;
            this.f2823a = C0357b.m1855f(copy.f2823a);
        }

        /* renamed from: d */
        public void mo3750d(Path path) {
            path.reset();
            C0357b.C0359b[] bVarArr = this.f2823a;
            if (bVarArr != null) {
                C0357b.C0359b.m1863e(bVarArr, path);
            }
        }

        public String getPathName() {
            return this.f2824b;
        }

        /* renamed from: c */
        public boolean mo3706c() {
            return false;
        }

        public C0357b.C0359b[] getPathData() {
            return this.f2823a;
        }

        public void setPathData(C0357b.C0359b[] nodes) {
            if (!C0357b.m1851b(this.f2823a, nodes)) {
                this.f2823a = C0357b.m1855f(nodes);
            } else {
                C0357b.m1859j(this.f2823a, nodes);
            }
        }
    }

    /* renamed from: a.r.a.a.h$b */
    public static class C0746b extends C0750f {
        public C0746b() {
        }

        public C0746b(C0746b copy) {
            super(copy);
        }

        /* renamed from: e */
        public void mo3707e(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            if (C0355g.m1843j(parser, "pathData")) {
                TypedArray a = C0355g.m1844k(r, theme, attrs, C0733a.f2764d);
                mo3708f(a, parser);
                a.recycle();
            }
        }

        /* renamed from: f */
        public final void mo3708f(TypedArray a, XmlPullParser parser) {
            String pathName = a.getString(0);
            if (pathName != null) {
                this.f2824b = pathName;
            }
            String pathData = a.getString(1);
            if (pathData != null) {
                this.f2823a = C0357b.m1853d(pathData);
            }
            this.f2825c = C0355g.m1840g(a, parser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo3706c() {
            return true;
        }
    }

    /* renamed from: a.r.a.a.h$c */
    public static class C0747c extends C0750f {

        /* renamed from: e */
        public int[] f2798e;

        /* renamed from: f */
        public C0342b f2799f;

        /* renamed from: g */
        public float f2800g = 0.0f;

        /* renamed from: h */
        public C0342b f2801h;

        /* renamed from: i */
        public float f2802i = 1.0f;

        /* renamed from: j */
        public float f2803j = 1.0f;

        /* renamed from: k */
        public float f2804k = 0.0f;

        /* renamed from: l */
        public float f2805l = 1.0f;

        /* renamed from: m */
        public float f2806m = 0.0f;

        /* renamed from: n */
        public Paint.Cap f2807n = Paint.Cap.BUTT;

        /* renamed from: o */
        public Paint.Join f2808o = Paint.Join.MITER;

        /* renamed from: p */
        public float f2809p = 4.0f;

        public C0747c() {
        }

        public C0747c(C0747c copy) {
            super(copy);
            this.f2798e = copy.f2798e;
            this.f2799f = copy.f2799f;
            this.f2800g = copy.f2800g;
            this.f2802i = copy.f2802i;
            this.f2801h = copy.f2801h;
            this.f2825c = copy.f2825c;
            this.f2803j = copy.f2803j;
            this.f2804k = copy.f2804k;
            this.f2805l = copy.f2805l;
            this.f2806m = copy.f2806m;
            this.f2807n = copy.f2807n;
            this.f2808o = copy.f2808o;
            this.f2809p = copy.f2809p;
        }

        /* renamed from: e */
        public final Paint.Cap mo3711e(int id, Paint.Cap defValue) {
            if (id == 0) {
                return Paint.Cap.BUTT;
            }
            if (id == 1) {
                return Paint.Cap.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: f */
        public final Paint.Join mo3712f(int id, Paint.Join defValue) {
            if (id == 0) {
                return Paint.Join.MITER;
            }
            if (id == 1) {
                return Paint.Join.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: g */
        public void mo3713g(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = C0355g.m1844k(r, theme, attrs, C0733a.f2763c);
            mo3722h(a, parser, theme);
            a.recycle();
        }

        /* renamed from: h */
        public final void mo3722h(TypedArray a, XmlPullParser parser, Resources.Theme theme) {
            this.f2798e = null;
            if (C0355g.m1843j(parser, "pathData")) {
                String pathName = a.getString(0);
                if (pathName != null) {
                    this.f2824b = pathName;
                }
                String pathData = a.getString(2);
                if (pathData != null) {
                    this.f2823a = C0357b.m1853d(pathData);
                }
                this.f2801h = C0355g.m1838e(a, parser, theme, "fillColor", 1, 0);
                this.f2803j = C0355g.m1839f(a, parser, "fillAlpha", 12, this.f2803j);
                this.f2807n = mo3711e(C0355g.m1840g(a, parser, "strokeLineCap", 8, -1), this.f2807n);
                this.f2808o = mo3712f(C0355g.m1840g(a, parser, "strokeLineJoin", 9, -1), this.f2808o);
                this.f2809p = C0355g.m1839f(a, parser, "strokeMiterLimit", 10, this.f2809p);
                this.f2799f = C0355g.m1838e(a, parser, theme, "strokeColor", 3, 0);
                this.f2802i = C0355g.m1839f(a, parser, "strokeAlpha", 11, this.f2802i);
                this.f2800g = C0355g.m1839f(a, parser, "strokeWidth", 4, this.f2800g);
                this.f2805l = C0355g.m1839f(a, parser, "trimPathEnd", 6, this.f2805l);
                this.f2806m = C0355g.m1839f(a, parser, "trimPathOffset", 7, this.f2806m);
                this.f2804k = C0355g.m1839f(a, parser, "trimPathStart", 5, this.f2804k);
                this.f2825c = C0355g.m1840g(a, parser, "fillType", 13, this.f2825c);
            }
        }

        /* renamed from: a */
        public boolean mo3709a() {
            return this.f2801h.mo2241i() || this.f2799f.mo2241i();
        }

        /* renamed from: b */
        public boolean mo3710b(int[] stateSet) {
            return this.f2801h.mo2242j(stateSet) | this.f2799f.mo2242j(stateSet);
        }

        public int getStrokeColor() {
            return this.f2799f.mo2238e();
        }

        public void setStrokeColor(int strokeColor) {
            this.f2799f.mo2243k(strokeColor);
        }

        public float getStrokeWidth() {
            return this.f2800g;
        }

        public void setStrokeWidth(float strokeWidth) {
            this.f2800g = strokeWidth;
        }

        public float getStrokeAlpha() {
            return this.f2802i;
        }

        public void setStrokeAlpha(float strokeAlpha) {
            this.f2802i = strokeAlpha;
        }

        public int getFillColor() {
            return this.f2801h.mo2238e();
        }

        public void setFillColor(int fillColor) {
            this.f2801h.mo2243k(fillColor);
        }

        public float getFillAlpha() {
            return this.f2803j;
        }

        public void setFillAlpha(float fillAlpha) {
            this.f2803j = fillAlpha;
        }

        public float getTrimPathStart() {
            return this.f2804k;
        }

        public void setTrimPathStart(float trimPathStart) {
            this.f2804k = trimPathStart;
        }

        public float getTrimPathEnd() {
            return this.f2805l;
        }

        public void setTrimPathEnd(float trimPathEnd) {
            this.f2805l = trimPathEnd;
        }

        public float getTrimPathOffset() {
            return this.f2806m;
        }

        public void setTrimPathOffset(float trimPathOffset) {
            this.f2806m = trimPathOffset;
        }
    }
}
