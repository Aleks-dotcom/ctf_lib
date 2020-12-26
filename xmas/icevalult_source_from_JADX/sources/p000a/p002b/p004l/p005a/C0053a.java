package p000a.p002b.p004l.p005a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import java.util.WeakHashMap;
import p000a.p002b.p011p.C0176m0;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p027e.p028c.C0341a;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.l.a.a */
public final class C0053a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f404a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<C0054a>> f405b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f406c = new Object();

    /* renamed from: c */
    public static ColorStateList m276c(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = m275b(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = m279f(context, resId);
        if (csl2 == null) {
            return C0339a.m1776b(context, resId);
        }
        m274a(context, resId, csl2);
        return csl2;
    }

    /* renamed from: d */
    public static Drawable m277d(Context context, int resId) {
        return C0176m0.m948h().mo1254j(context, resId);
    }

    /* renamed from: f */
    public static ColorStateList m279f(Context context, int resId) {
        if (m280g(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        try {
            return C0341a.m1781a(r, r.getXml(resId), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m275b(android.content.Context r5, int r6) {
        /*
            java.lang.Object r0 = f406c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<a.b.l.a.a$a>> r1 = f405b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0035 }
            a.b.l.a.a$a r2 = (p000a.p002b.p004l.p005a.C0053a.C0054a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f408b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r5.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            android.content.res.ColorStateList r3 = r2.f407a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r3
        L_0x002f:
            r1.remove(r6)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r0 = 0
            return r0
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p004l.p005a.C0053a.m275b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public static void m274a(Context context, int resId, ColorStateList value) {
        synchronized (f406c) {
            WeakHashMap<Context, SparseArray<C0054a>> weakHashMap = f405b;
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = weakHashMap.get(context);
            if (entries == null) {
                entries = new SparseArray<>();
                weakHashMap.put(context, entries);
            }
            entries.append(resId, new C0054a(value, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: g */
    public static boolean m280g(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = m278e();
        r.getValue(resId, value, true);
        int i = value.type;
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static TypedValue m278e() {
        ThreadLocal<TypedValue> threadLocal = f404a;
        TypedValue tv = threadLocal.get();
        if (tv != null) {
            return tv;
        }
        TypedValue tv2 = new TypedValue();
        threadLocal.set(tv2);
        return tv2;
    }

    /* renamed from: a.b.l.a.a$a */
    public static class C0054a {

        /* renamed from: a */
        public final ColorStateList f407a;

        /* renamed from: b */
        public final Configuration f408b;

        public C0054a(ColorStateList value, Configuration configuration) {
            this.f407a = value;
            this.f408b = configuration;
        }
    }
}
