package p000a.p025h.p027e.p028c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.h.e.c.f */
public final class C0351f {
    /* renamed from: a */
    public static Drawable m1824a(Resources res, int id, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id, theme);
        }
        return res.getDrawable(id);
    }

    /* renamed from: b */
    public static Typeface m1825b(Context context, int id) {
        if (context.isRestricted()) {
            return null;
        }
        return m1828e(context, id, new TypedValue(), 0, (C0352a) null, (Handler) null, false);
    }

    /* renamed from: a.h.e.c.f$a */
    public static abstract class C0352a {
        /* renamed from: c */
        public abstract void mo1559c(int i);

        /* renamed from: d */
        public abstract void mo1560d(Typeface typeface);

        /* renamed from: b */
        public final void mo2256b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0353a(typeface));
        }

        /* renamed from: a.h.e.c.f$a$a */
        public class C0353a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Typeface f1851b;

            public C0353a(Typeface typeface) {
                this.f1851b = typeface;
            }

            public void run() {
                C0352a.this.mo1560d(this.f1851b);
            }
        }

        /* renamed from: a */
        public final void mo2255a(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new C0354b(reason));
        }

        /* renamed from: a.h.e.c.f$a$b */
        public class C0354b implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ int f1853b;

            public C0354b(int i) {
                this.f1853b = i;
            }

            public void run() {
                C0352a.this.mo1559c(this.f1853b);
            }
        }
    }

    /* renamed from: d */
    public static void m1827d(Context context, int id, C0352a fontCallback, Handler handler) {
        C0419h.m2060c(fontCallback);
        if (context.isRestricted()) {
            fontCallback.mo2255a(-4, handler);
            return;
        }
        m1828e(context, id, new TypedValue(), 0, fontCallback, handler, false);
    }

    /* renamed from: c */
    public static Typeface m1826c(Context context, int id, TypedValue value, int style, C0352a fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return m1828e(context, id, value, style, fontCallback, (Handler) null, true);
    }

    /* renamed from: e */
    public static Typeface m1828e(Context context, int id, TypedValue value, int style, C0352a fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = m1829f(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1829f(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, p000a.p025h.p027e.p028c.C0351f.C0352a r24, android.os.Handler r25, boolean r26) {
        /*
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            java.lang.String r15 = "ResourcesCompat"
            java.lang.CharSequence r0 = r10.string
            if (r0 == 0) goto L_0x00f3
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r8.startsWith(r0)
            r16 = 0
            r7 = -3
            if (r0 != 0) goto L_0x0027
            if (r13 == 0) goto L_0x0026
            r13.mo2255a(r7, r14)
        L_0x0026:
            return r16
        L_0x0027:
            android.graphics.Typeface r6 = p000a.p025h.p029f.C0360c.m1870f(r9, r11, r12)
            if (r6 == 0) goto L_0x0033
            if (r13 == 0) goto L_0x0032
            r13.mo2256b(r6, r14)
        L_0x0032:
            return r6
        L_0x0033:
            java.lang.String r0 = r8.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00d1, IOException -> 0x00b6 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x00d1, IOException -> 0x00b6 }
            if (r0 == 0) goto L_0x0092
            android.content.res.XmlResourceParser r0 = r9.getXml(r11)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0084 }
            a.h.e.c.c$a r1 = p000a.p025h.p027e.p028c.C0343c.m1800b(r0, r9)     // Catch:{ XmlPullParserException -> 0x008b, IOException -> 0x0084 }
            r17 = r1
            if (r17 != 0) goto L_0x0063
            java.lang.String r1 = "Failed to find font-family tag"
            android.util.Log.e(r15, r1)     // Catch:{ XmlPullParserException -> 0x005d, IOException -> 0x0057 }
            if (r13 == 0) goto L_0x0056
            r13.mo2255a(r7, r14)     // Catch:{ XmlPullParserException -> 0x005d, IOException -> 0x0057 }
        L_0x0056:
            return r16
        L_0x0057:
            r0 = move-exception
            r1 = r19
            r10 = r8
            goto L_0x00bc
        L_0x005d:
            r0 = move-exception
            r1 = r19
            r10 = r8
            goto L_0x00d7
        L_0x0063:
            r1 = r19
            r2 = r17
            r3 = r20
            r4 = r22
            r5 = r23
            r18 = r6
            r6 = r24
            r10 = -3
            r7 = r25
            r10 = r8
            r8 = r26
            android.graphics.Typeface r1 = p000a.p025h.p029f.C0360c.m1867c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007c }
            return r1
        L_0x007c:
            r0 = move-exception
            r1 = r19
            goto L_0x00af
        L_0x0080:
            r0 = move-exception
            r1 = r19
            goto L_0x00b3
        L_0x0084:
            r0 = move-exception
            r18 = r6
            r10 = r8
            r1 = r19
            goto L_0x00bc
        L_0x008b:
            r0 = move-exception
            r18 = r6
            r10 = r8
            r1 = r19
            goto L_0x00d7
        L_0x0092:
            r18 = r6
            r10 = r8
            r1 = r19
            android.graphics.Typeface r0 = p000a.p025h.p029f.C0360c.m1868d(r1, r9, r11, r10, r12)     // Catch:{ XmlPullParserException -> 0x00b2, IOException -> 0x00ae }
            r6 = r0
            if (r13 == 0) goto L_0x00ad
            if (r6 == 0) goto L_0x00a4
            r13.mo2256b(r6, r14)     // Catch:{ XmlPullParserException -> 0x00ab, IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x00a4:
            r2 = -3
            r13.mo2255a(r2, r14)     // Catch:{ XmlPullParserException -> 0x00ab, IOException -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            goto L_0x00bc
        L_0x00ab:
            r0 = move-exception
            goto L_0x00d7
        L_0x00ad:
            return r6
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            r6 = r18
            goto L_0x00bc
        L_0x00b2:
            r0 = move-exception
        L_0x00b3:
            r6 = r18
            goto L_0x00d7
        L_0x00b6:
            r0 = move-exception
            r1 = r19
            r18 = r6
            r10 = r8
        L_0x00bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read xml resource "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2, r0)
            goto L_0x00ec
        L_0x00d1:
            r0 = move-exception
            r1 = r19
            r18 = r6
            r10 = r8
        L_0x00d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse xml resource "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2, r0)
        L_0x00ec:
            if (r13 == 0) goto L_0x00f2
            r2 = -3
            r13.mo2255a(r2, r14)
        L_0x00f2:
            return r16
        L_0x00f3:
            r1 = r19
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Resource \""
            r2.append(r3)
            java.lang.String r3 = r9.getResourceName(r11)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r22)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r3 = r21
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p027e.p028c.C0351f.m1829f(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, a.h.e.c.f$a, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
