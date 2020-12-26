package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p025h.p027e.p028c.C0343c;

/* renamed from: a.h.f.d */
public class C0361d extends C0365h {

    /* renamed from: b */
    public static Class f1861b;

    /* renamed from: c */
    public static Constructor f1862c;

    /* renamed from: d */
    public static Method f1863d;

    /* renamed from: e */
    public static Method f1864e;

    /* renamed from: f */
    public static boolean f1865f = false;

    /* renamed from: n */
    public static void m1874n() {
        Method addFontMethod;
        Constructor fontFamilyCtor;
        Class fontFamilyClass;
        Method createFromFamiliesWithDefaultMethod;
        if (!f1865f) {
            f1865f = true;
            try {
                fontFamilyClass = Class.forName("android.graphics.FontFamily");
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(fontFamilyClass, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
            }
            f1862c = fontFamilyCtor;
            f1861b = fontFamilyClass;
            f1863d = addFontMethod;
            f1864e = createFromFamiliesWithDefaultMethod;
        }
    }

    /* renamed from: m */
    public final File mo2262m(ParcelFileDescriptor fd) {
        try {
            String path = Os.readlink("/proc/self/fd/" + fd.getFd());
            if (OsConstants.S_ISREG(Os.stat(path).st_mode)) {
                return new File(path);
            }
            return null;
        } catch (ErrnoException e) {
            return null;
        }
    }

    /* renamed from: o */
    public static Object m1875o() {
        m1874n();
        try {
            return f1862c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    public static Typeface mo2265l(Object family) {
        m1874n();
        try {
            Object familyArray = Array.newInstance(f1861b, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f1864e.invoke((Object) null, new Object[]{familyArray});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public static boolean m1872k(Object family, String name, int weight, boolean style) {
        m1874n();
        try {
            return ((Boolean) f1863d.invoke(family, new Object[]{name, Integer.valueOf(weight), Boolean.valueOf(style)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0052, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0057, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005b, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005f, code lost:
        if (r3 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0069, code lost:
        throw r5;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo2261c(android.content.Context r10, android.os.CancellationSignal r11, p000a.p025h.p035j.C0382b.C0388f[] r12, int r13) {
        /*
            r9 = this;
            int r0 = r12.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            a.h.j.b$f r0 = r9.mo2280h(r12, r13)
            android.content.ContentResolver r2 = r10.getContentResolver()
            android.net.Uri r3 = r0.mo2354c()     // Catch:{ IOException -> 0x006a }
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r3, r4, r11)     // Catch:{ IOException -> 0x006a }
            if (r3 != 0) goto L_0x0023
            if (r3 == 0) goto L_0x0022
            r3.close()     // Catch:{ IOException -> 0x006a }
        L_0x0022:
            return r1
        L_0x0023:
            java.io.File r4 = r9.mo2262m(r3)     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x003a
            boolean r5 = r4.canRead()     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r4)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ IOException -> 0x006a }
        L_0x0039:
            return r5
        L_0x003a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x005c }
            java.io.FileDescriptor r6 = r3.getFileDescriptor()     // Catch:{ all -> 0x005c }
            r5.<init>(r6)     // Catch:{ all -> 0x005c }
            android.graphics.Typeface r6 = super.mo2278d(r10, r5)     // Catch:{ all -> 0x0050 }
            r5.close()     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ IOException -> 0x006a }
        L_0x004f:
            return r6
        L_0x0050:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r7 = move-exception
            r5.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r8 = move-exception
            r6.addSuppressed(r8)     // Catch:{ all -> 0x005c }
        L_0x005b:
            throw r7     // Catch:{ all -> 0x005c }
        L_0x005c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005e:
            r5 = move-exception
            if (r3 == 0) goto L_0x0069
            r3.close()     // Catch:{ all -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ IOException -> 0x006a }
        L_0x0069:
            throw r5     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r3 = move-exception
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p029f.C0361d.mo2261c(android.content.Context, android.os.CancellationSignal, a.h.j.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public Typeface mo2260b(Context context, C0343c.C0345b entry, Resources resources, int style) {
        Object family = m1875o();
        C0343c.C0346c[] a = entry.mo2245a();
        int length = a.length;
        int i = 0;
        while (i < length) {
            C0343c.C0346c e = a[i];
            File tmpFile = C0369i.m1928e(context);
            if (tmpFile == null) {
                return null;
            }
            try {
                if (!C0369i.m1926c(tmpFile, resources, e.mo2247b())) {
                    tmpFile.delete();
                    return null;
                } else if (!m1872k(family, tmpFile.getPath(), e.mo2250e(), e.mo2251f())) {
                    return null;
                } else {
                    tmpFile.delete();
                    i++;
                }
            } catch (RuntimeException e2) {
                return null;
            } finally {
                tmpFile.delete();
            }
        }
        return mo2265l(family);
    }
}
