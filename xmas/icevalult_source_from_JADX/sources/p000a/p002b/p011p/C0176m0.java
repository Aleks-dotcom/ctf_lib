package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p000a.p002b.p006m.p007a.C0055a;
import p000a.p002b.p008n.C0070a;
import p000a.p018e.C0256a;
import p000a.p018e.C0261d;
import p000a.p018e.C0262e;
import p000a.p018e.C0270h;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p059r.p060a.p061a.C0734b;
import p000a.p059r.p060a.p061a.C0744h;

/* renamed from: a.b.p.m0 */
public final class C0176m0 {

    /* renamed from: h */
    public static final PorterDuff.Mode f953h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static C0176m0 f954i;

    /* renamed from: j */
    public static final C0179c f955j = new C0179c(6);

    /* renamed from: a */
    public WeakHashMap<Context, C0270h<ColorStateList>> f956a;

    /* renamed from: b */
    public C0256a<String, C0180d> f957b;

    /* renamed from: c */
    public C0270h<String> f958c;

    /* renamed from: d */
    public final WeakHashMap<Context, C0261d<WeakReference<Drawable.ConstantState>>> f959d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f960e;

    /* renamed from: f */
    public boolean f961f;

    /* renamed from: g */
    public C0181e f962g;

    /* renamed from: a.b.p.m0$d */
    public interface C0180d {
        /* renamed from: a */
        Drawable mo1265a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a.b.p.m0$e */
    public interface C0181e {
        /* renamed from: a */
        Drawable mo1169a(C0176m0 m0Var, Context context, int i);

        /* renamed from: b */
        ColorStateList mo1170b(Context context, int i);

        /* renamed from: c */
        boolean mo1171c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        boolean mo1172d(Context context, int i, Drawable drawable);

        /* renamed from: e */
        PorterDuff.Mode mo1173e(int i);
    }

    /* renamed from: h */
    public static synchronized C0176m0 m948h() {
        C0176m0 m0Var;
        synchronized (C0176m0.class) {
            if (f954i == null) {
                C0176m0 m0Var2 = new C0176m0();
                f954i = m0Var2;
                m950p(m0Var2);
            }
            m0Var = f954i;
        }
        return m0Var;
    }

    /* renamed from: p */
    public static void m950p(C0176m0 manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.mo1248a("vector", new C0182f());
            manager.mo1248a("animated-vector", new C0178b());
            manager.mo1248a("animated-selector", new C0177a());
        }
    }

    /* renamed from: u */
    public synchronized void mo1262u(C0181e hooks) {
        this.f962g = hooks;
    }

    /* renamed from: j */
    public synchronized Drawable mo1254j(Context context, int resId) {
        return mo1255k(context, resId, false);
    }

    /* renamed from: k */
    public synchronized Drawable mo1255k(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        mo1251d(context);
        drawable = mo1259r(context, resId);
        if (drawable == null) {
            drawable = mo1252f(context, resId);
        }
        if (drawable == null) {
            drawable = C0339a.m1777c(context, resId);
        }
        if (drawable != null) {
            drawable = mo1263v(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            C0145e0.m825b(drawable);
        }
        return drawable;
    }

    /* renamed from: s */
    public synchronized void mo1260s(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (C0261d) this.f959d.get(context);
        if (cache != null) {
            cache.mo1784b();
        }
    }

    /* renamed from: e */
    public static long m946e(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    /* renamed from: f */
    public final Drawable mo1252f(Context context, int resId) {
        Drawable drawable;
        if (this.f960e == null) {
            this.f960e = new TypedValue();
        }
        TypedValue tv = this.f960e;
        context.getResources().getValue(resId, tv, true);
        long key = m946e(tv);
        Drawable dr = mo1253i(context, key);
        if (dr != null) {
            return dr;
        }
        C0181e eVar = this.f962g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo1169a(this, context, resId);
        }
        Drawable dr2 = drawable;
        if (dr2 != null) {
            dr2.setChangingConfigurations(tv.changingConfigurations);
            mo1249b(context, key, dr2);
        }
        return dr2;
    }

    /* renamed from: v */
    public final Drawable mo1263v(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = mo1256m(context, resId);
        if (tintList != null) {
            if (C0145e0.m824a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = C0370a.m1948r(drawable);
            C0370a.m1945o(drawable2, tintList);
            PorterDuff.Mode tintMode = mo1258o(resId);
            if (tintMode == null) {
                return drawable2;
            }
            C0370a.m1946p(drawable2, tintMode);
            return drawable2;
        }
        C0181e eVar = this.f962g;
        if ((eVar == null || !eVar.mo1172d(context, resId, drawable)) && !mo1264x(context, resId, drawable) && failIfNotKnown) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a6 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo1259r(android.content.Context r13, int r14) {
        /*
            r12 = this;
            a.e.a<java.lang.String, a.b.p.m0$d> r0 = r12.f957b
            r1 = 0
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b6
            a.e.h<java.lang.String> r0 = r12.f958c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.mo1901e(r14)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0029
            if (r0 == 0) goto L_0x0028
            a.e.a<java.lang.String, a.b.p.m0$d> r3 = r12.f957b
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            goto L_0x0031
        L_0x0029:
            return r1
        L_0x002a:
            a.e.h r0 = new a.e.h
            r0.<init>()
            r12.f958c = r0
        L_0x0031:
            android.util.TypedValue r0 = r12.f960e
            if (r0 != 0) goto L_0x003c
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r12.f960e = r0
        L_0x003c:
            android.util.TypedValue r0 = r12.f960e
            android.content.res.Resources r1 = r13.getResources()
            r3 = 1
            r1.getValue(r14, r0, r3)
            long r4 = m946e(r0)
            android.graphics.drawable.Drawable r6 = r12.mo1253i(r13, r4)
            if (r6 == 0) goto L_0x0051
            return r6
        L_0x0051:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ae
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ae
            android.content.res.XmlResourceParser r7 = r1.getXml(r14)     // Catch:{ Exception -> 0x00a6 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r7)     // Catch:{ Exception -> 0x00a6 }
        L_0x0069:
            int r9 = r7.next()     // Catch:{ Exception -> 0x00a6 }
            r10 = r9
            r11 = 2
            if (r9 == r11) goto L_0x0074
            if (r10 == r3) goto L_0x0074
            goto L_0x0069
        L_0x0074:
            if (r10 != r11) goto L_0x009e
            java.lang.String r3 = r7.getName()     // Catch:{ Exception -> 0x00a6 }
            a.e.h<java.lang.String> r9 = r12.f958c     // Catch:{ Exception -> 0x00a6 }
            r9.mo1896a(r14, r3)     // Catch:{ Exception -> 0x00a6 }
            a.e.a<java.lang.String, a.b.p.m0$d> r9 = r12.f957b     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r9 = r9.get(r3)     // Catch:{ Exception -> 0x00a6 }
            a.b.p.m0$d r9 = (p000a.p002b.p011p.C0176m0.C0180d) r9     // Catch:{ Exception -> 0x00a6 }
            if (r9 == 0) goto L_0x0093
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch:{ Exception -> 0x00a6 }
            android.graphics.drawable.Drawable r11 = r9.mo1265a(r13, r7, r8, r11)     // Catch:{ Exception -> 0x00a6 }
            r6 = r11
        L_0x0093:
            if (r6 == 0) goto L_0x009d
            int r11 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a6 }
            r6.setChangingConfigurations(r11)     // Catch:{ Exception -> 0x00a6 }
            r12.mo1249b(r13, r4, r6)     // Catch:{ Exception -> 0x00a6 }
        L_0x009d:
            goto L_0x00ae
        L_0x009e:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r9 = "No start tag found"
            r3.<init>(r9)     // Catch:{ Exception -> 0x00a6 }
            throw r3     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            r3 = move-exception
            java.lang.String r7 = "ResourceManagerInternal"
            java.lang.String r8 = "Exception while inflating drawable"
            android.util.Log.e(r7, r8, r3)
        L_0x00ae:
            if (r6 != 0) goto L_0x00b5
            a.e.h<java.lang.String> r3 = r12.f958c
            r3.mo1896a(r14, r2)
        L_0x00b5:
            return r6
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0176m0.mo1259r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo1253i(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap<android.content.Context, a.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r4.f959d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x002d }
            a.e.d r0 = (p000a.p018e.C0261d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r4)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo1789f(r6)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0028
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r1 = r3.newDrawable(r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r4)
            return r1
        L_0x0028:
            r0.mo1787d(r6)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0176m0.mo1253i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    public final synchronized boolean mo1249b(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (C0261d) this.f959d.get(context);
        if (cache == null) {
            cache = new C0261d<>();
            this.f959d.put(context, cache);
        }
        cache.mo1793j(key, new WeakReference(cs));
        return true;
    }

    /* renamed from: t */
    public synchronized Drawable mo1261t(Context context, C0130b1 resources, int resId) {
        Drawable drawable = mo1259r(context, resId);
        if (drawable == null) {
            drawable = resources.mo947c(resId);
        }
        if (drawable == null) {
            return null;
        }
        return mo1263v(context, resId, false, drawable);
    }

    /* renamed from: x */
    public boolean mo1264x(Context context, int resId, Drawable drawable) {
        C0181e eVar = this.f962g;
        return eVar != null && eVar.mo1171c(context, resId, drawable);
    }

    /* renamed from: a */
    public final void mo1248a(String tagName, C0180d delegate) {
        if (this.f957b == null) {
            this.f957b = new C0256a<>();
        }
        this.f957b.put(tagName, delegate);
    }

    /* renamed from: o */
    public PorterDuff.Mode mo1258o(int resId) {
        C0181e eVar = this.f962g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1173e(resId);
    }

    /* renamed from: m */
    public synchronized ColorStateList mo1256m(Context context, int resId) {
        ColorStateList tint;
        tint = mo1257n(context, resId);
        if (tint == null) {
            C0181e eVar = this.f962g;
            tint = eVar == null ? null : eVar.mo1170b(context, resId);
            if (tint != null) {
                mo1250c(context, resId, tint);
            }
        }
        return tint;
    }

    /* renamed from: n */
    public final ColorStateList mo1257n(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        WeakHashMap<Context, C0270h<ColorStateList>> weakHashMap = this.f956a;
        if (weakHashMap == null || (tints = (C0270h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) tints.mo1901e(resId);
    }

    /* renamed from: c */
    public final void mo1250c(Context context, int resId, ColorStateList tintList) {
        if (this.f956a == null) {
            this.f956a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = (C0270h) this.f956a.get(context);
        if (themeTints == null) {
            themeTints = new C0270h<>();
            this.f956a.put(context, themeTints);
        }
        themeTints.mo1896a(resId, tintList);
    }

    /* renamed from: a.b.p.m0$c */
    public static class C0179c extends C0262e<Integer, PorterDuffColorFilter> {
        public C0179c(int maxSize) {
            super(maxSize);
        }

        /* renamed from: i */
        public PorterDuffColorFilter mo1266i(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo1801c(Integer.valueOf(m972h(color, mode)));
        }

        /* renamed from: j */
        public PorterDuffColorFilter mo1267j(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) mo1802d(Integer.valueOf(m972h(color, mode)), filter);
        }

        /* renamed from: h */
        public static int m972h(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    /* renamed from: w */
    public static void m952w(Drawable drawable, C0203u0 tint, int[] state) {
        if (!C0145e0.m824a(drawable) || drawable.mutate() == drawable) {
            boolean z = tint.f1043d;
            if (z || tint.f1042c) {
                drawable.setColorFilter(m947g(z ? tint.f1040a : null, tint.f1042c ? tint.f1041b : f953h, state));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: g */
    public static PorterDuffColorFilter m947g(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return m949l(tint.getColorForState(state, 0), tintMode);
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m949l(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (C0176m0.class) {
            C0179c cVar = f955j;
            filter = cVar.mo1266i(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                cVar.mo1267j(color, mode, filter);
            }
        }
        return filter;
    }

    /* renamed from: d */
    public final void mo1251d(Context context) {
        if (!this.f961f) {
            this.f961f = true;
            Drawable d = mo1254j(context, C0070a.abc_vector_test);
            if (d == null || !m951q(d)) {
                this.f961f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: q */
    public static boolean m951q(Drawable d) {
        return (d instanceof C0744h) || "android.graphics.drawable.VectorDrawable".equals(d.getClass().getName());
    }

    /* renamed from: a.b.p.m0$f */
    public static class C0182f implements C0180d {
        /* renamed from: a */
        public Drawable mo1265a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0744h.m3607c(context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a.b.p.m0$b */
    public static class C0178b implements C0180d {
        /* renamed from: a */
        public Drawable mo1265a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0734b.m3574a(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a.b.p.m0$a */
    public static class C0177a implements C0180d {
        /* renamed from: a */
        public Drawable mo1265a(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0055a.m281m(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }
}
