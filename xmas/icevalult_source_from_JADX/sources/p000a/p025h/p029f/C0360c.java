package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import p000a.p018e.C0262e;
import p000a.p025h.p027e.p028c.C0343c;
import p000a.p025h.p027e.p028c.C0351f;
import p000a.p025h.p035j.C0382b;

/* renamed from: a.h.f.c */
public class C0360c {

    /* renamed from: a */
    public static final C0365h f1859a;

    /* renamed from: b */
    public static final C0262e<String, Typeface> f1860b = new C0262e<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f1859a = new C0364g();
        } else if (i >= 26) {
            f1859a = new C0363f();
        } else if (i >= 24 && C0362e.m1881m()) {
            f1859a = new C0362e();
        } else if (i >= 21) {
            f1859a = new C0361d();
        } else {
            f1859a = new C0365h();
        }
    }

    /* renamed from: f */
    public static Typeface m1870f(Resources resources, int id, int style) {
        return f1860b.mo1801c(m1869e(resources, id, style));
    }

    /* renamed from: e */
    public static String m1869e(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    /* renamed from: c */
    public static Typeface m1867c(Context context, C0343c.C0344a entry, Resources resources, int id, int style, C0351f.C0352a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        C0343c.C0344a aVar = entry;
        C0351f.C0352a aVar2 = fontCallback;
        Handler handler2 = handler;
        if (aVar instanceof C0343c.C0347d) {
            C0343c.C0347d providerEntry = (C0343c.C0347d) aVar;
            typeface = C0382b.m1978g(context, providerEntry.mo2253b(), fontCallback, handler, !isRequestFromLayoutInflator ? aVar2 == null : providerEntry.mo2252a() == 0, isRequestFromLayoutInflator ? providerEntry.mo2254c() : -1, style);
            Context context2 = context;
            Resources resources2 = resources;
            int i = style;
        } else {
            Context context3 = context;
            Resources resources3 = resources;
            int i2 = style;
            typeface = f1859a.mo2260b(context, (C0343c.C0345b) aVar, resources, style);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo2256b(typeface, handler2);
                } else {
                    aVar2.mo2255a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f1860b.mo1802d(m1869e(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m1868d(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f1859a.mo2264e(context, resources, id, path, style);
        if (typeface != null) {
            f1860b.mo1802d(m1869e(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: b */
    public static Typeface m1866b(Context context, CancellationSignal cancellationSignal, C0382b.C0388f[] fonts, int style) {
        return f1859a.mo2261c(context, cancellationSignal, fonts, style);
    }

    /* renamed from: g */
    public static Typeface m1871g(Context context, Typeface typeface, int style) {
        C0365h hVar = f1859a;
        C0343c.C0345b families = hVar.mo2281i(typeface);
        if (families == null) {
            return null;
        }
        return hVar.mo2260b(context, families, context.getResources(), style);
    }

    /* renamed from: a */
    public static Typeface m1865a(Context context, Typeface family, int style) {
        Typeface typefaceFromFamily;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (typefaceFromFamily = m1871g(context, family, style)) == null) {
            return Typeface.create(family, style);
        } else {
            return typefaceFromFamily;
        }
    }
}
