package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000a.p025h.p027e.p028c.C0343c;
import p000a.p025h.p035j.C0382b;

/* renamed from: a.h.f.f */
public class C0363f extends C0361d {

    /* renamed from: g */
    public final Class f1870g;

    /* renamed from: h */
    public final Constructor f1871h;

    /* renamed from: i */
    public final Method f1872i;

    /* renamed from: j */
    public final Method f1873j;

    /* renamed from: k */
    public final Method f1874k;

    /* renamed from: l */
    public final Method f1875l;

    /* renamed from: m */
    public final Method f1876m;

    public C0363f() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor fontFamilyCtor;
        Class fontFamily;
        try {
            fontFamily = mo2275y();
            fontFamilyCtor = mo2276z(fontFamily);
            addFontFromAssetManager2 = mo2272v(fontFamily);
            addFontFromAssetManager = mo2273w(fontFamily);
            addFontFromBuffer = mo2263A(fontFamily);
            freeze = mo2271u(fontFamily);
            abortCreation = mo2274x(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
            abortCreation = null;
        }
        this.f1870g = fontFamily;
        this.f1871h = fontFamilyCtor;
        this.f1872i = addFontFromAssetManager2;
        this.f1873j = addFontFromAssetManager;
        this.f1874k = addFontFromBuffer;
        this.f1875l = freeze;
        this.f1876m = abortCreation;
    }

    /* renamed from: t */
    public final boolean mo2270t() {
        if (this.f1872i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1872i != null;
    }

    /* renamed from: o */
    private Object m1885o() {
        try {
            return this.f1871h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: q */
    public final boolean mo2267q(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.f1872i.invoke(family, new Object[]{context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean mo2268r(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.f1873j.invoke(family, new Object[]{buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: l */
    public Typeface mo2265l(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f1870g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f1876m.invoke((Object) null, new Object[]{familyArray, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: s */
    public final boolean mo2269s(Object family) {
        try {
            return ((Boolean) this.f1874k.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: p */
    public final void mo2266p(Object family) {
        try {
            this.f1875l.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }

    /* renamed from: b */
    public Typeface mo2260b(Context context, C0343c.C0345b entry, Resources resources, int style) {
        if (!mo2270t()) {
            return super.mo2260b(context, entry, resources, style);
        }
        Object fontFamily = m1885o();
        if (fontFamily == null) {
            return null;
        }
        for (C0343c.C0346c fontFile : entry.mo2245a()) {
            if (!mo2267q(context, fontFamily, fontFile.mo2246a(), fontFile.mo2248c(), fontFile.mo2250e(), fontFile.mo2251f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.mo2249d()))) {
                mo2266p(fontFamily);
                return null;
            }
        }
        if (!mo2269s(fontFamily)) {
            return null;
        }
        return mo2265l(fontFamily);
    }

    /* renamed from: c */
    public Typeface mo2261c(Context context, CancellationSignal cancellationSignal, C0382b.C0388f[] fonts, int style) {
        Typeface typeface;
        int i;
        Throwable th;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        C0382b.C0388f[] fVarArr = fonts;
        int i2 = style;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!mo2270t()) {
            C0382b.C0388f bestFont = mo2280h(fVarArr, i2);
            try {
                ParcelFileDescriptor pfd = context.getContentResolver().openFileDescriptor(bestFont.mo2354c(), "r", cancellationSignal2);
                if (pfd == null) {
                    if (pfd != null) {
                        pfd.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(pfd.getFileDescriptor()).setWeight(bestFont.mo2355d()).setItalic(bestFont.mo2356e()).build();
                    if (pfd != null) {
                        pfd.close();
                    }
                    return build;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    if (pfd != null) {
                        pfd.close();
                    }
                    throw th3;
                }
            } catch (IOException e) {
                return null;
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        } else {
            Map<Uri, ByteBuffer> uriBuffer = C0382b.m1980i(context, fVarArr, cancellationSignal2);
            Object fontFamily = m1885o();
            if (fontFamily == null) {
                return null;
            }
            int length = fVarArr.length;
            boolean atLeastOneFont = false;
            int i3 = 0;
            while (i3 < length) {
                C0382b.C0388f font = fVarArr[i3];
                ByteBuffer fontBuffer = uriBuffer.get(font.mo2354c());
                if (fontBuffer == null) {
                    i = i3;
                } else {
                    i = i3;
                    if (!mo2268r(fontFamily, fontBuffer, font.mo2353b(), font.mo2355d(), font.mo2356e() ? 1 : 0)) {
                        mo2266p(fontFamily);
                        return null;
                    }
                    atLeastOneFont = true;
                }
                i3 = i + 1;
            }
            if (!atLeastOneFont) {
                mo2266p(fontFamily);
                return null;
            } else if (mo2269s(fontFamily) && (typeface = mo2265l(fontFamily)) != null) {
                return Typeface.create(typeface, i2);
            } else {
                return null;
            }
        }
    }

    /* renamed from: e */
    public Typeface mo2264e(Context context, Resources resources, int id, String path, int style) {
        if (!mo2270t()) {
            return super.mo2264e(context, resources, id, path, style);
        }
        Object fontFamily = m1885o();
        if (fontFamily == null) {
            return null;
        }
        if (!mo2267q(context, fontFamily, path, 0, -1, -1, (FontVariationAxis[]) null)) {
            mo2266p(fontFamily);
            return null;
        } else if (!mo2269s(fontFamily)) {
            return null;
        } else {
            return mo2265l(fontFamily);
        }
    }

    /* renamed from: y */
    public Class mo2275y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    public Constructor mo2276z(Class fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    /* renamed from: v */
    public Method mo2272v(Class fontFamily) {
        Class cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class});
    }

    /* renamed from: w */
    public Method mo2273w(Class fontFamily) {
        Class cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls});
    }

    /* renamed from: A */
    public Method mo2263A(Class fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    /* renamed from: u */
    public Method mo2271u(Class fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: x */
    public Method mo2274x(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(fontFamily, 1).getClass(), cls, cls});
        m.setAccessible(true);
        return m;
    }
}
