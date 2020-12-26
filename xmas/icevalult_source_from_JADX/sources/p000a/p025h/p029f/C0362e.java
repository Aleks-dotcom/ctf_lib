package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p000a.p018e.C0269g;
import p000a.p025h.p027e.p028c.C0343c;
import p000a.p025h.p035j.C0382b;

/* renamed from: a.h.f.e */
public class C0362e extends C0365h {

    /* renamed from: b */
    public static final Class f1866b;

    /* renamed from: c */
    public static final Constructor f1867c;

    /* renamed from: d */
    public static final Method f1868d;

    /* renamed from: e */
    public static final Method f1869e;

    static {
        Method addFontMethod;
        Constructor fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class fontFamilyClass;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
            Class cls = Integer.TYPE;
            addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls, List.class, cls, Boolean.TYPE});
            createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(fontFamilyClass, 1).getClass()});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyCtor = null;
            addFontMethod = null;
            fontFamilyClass = null;
            createFromFamiliesWithDefaultMethod = null;
        }
        f1867c = fontFamilyCtor;
        f1866b = fontFamilyClass;
        f1868d = addFontMethod;
        f1869e = createFromFamiliesWithDefaultMethod;
    }

    /* renamed from: m */
    public static boolean m1881m() {
        Method method = f1868d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    public static Object m1882n() {
        try {
            return f1867c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m1879k(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            return ((Boolean) f1868d.invoke(family, new Object[]{buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return false;
        }
    }

    /* renamed from: l */
    public static Typeface m1880l(Object family) {
        try {
            Object familyArray = Array.newInstance(f1866b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f1869e.invoke((Object) null, new Object[]{familyArray});
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: c */
    public Typeface mo2261c(Context context, CancellationSignal cancellationSignal, C0382b.C0388f[] fonts, int style) {
        Object family = m1882n();
        if (family == null) {
            return null;
        }
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new C0269g<>();
        for (C0382b.C0388f font : fonts) {
            Uri uri = font.mo2354c();
            ByteBuffer buffer = (ByteBuffer) bufferCache.get(uri);
            if (buffer == null) {
                buffer = C0369i.m1929f(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (buffer == null || !m1879k(family, buffer, font.mo2353b(), font.mo2355d(), font.mo2356e())) {
                return null;
            }
        }
        Typeface typeface = m1880l(family);
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, style);
    }

    /* renamed from: b */
    public Typeface mo2260b(Context context, C0343c.C0345b entry, Resources resources, int style) {
        Object family = m1882n();
        if (family == null) {
            return null;
        }
        for (C0343c.C0346c e : entry.mo2245a()) {
            ByteBuffer buffer = C0369i.m1925b(context, resources, e.mo2247b());
            if (buffer == null || !m1879k(family, buffer, e.mo2248c(), e.mo2250e(), e.mo2251f())) {
                return null;
            }
        }
        return m1880l(family);
    }
}
