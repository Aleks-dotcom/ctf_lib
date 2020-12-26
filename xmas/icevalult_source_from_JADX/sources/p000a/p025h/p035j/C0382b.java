package p000a.p025h.p035j;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.FontsContractCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p000a.p018e.C0262e;
import p000a.p018e.C0269g;
import p000a.p025h.p027e.p028c.C0343c;
import p000a.p025h.p027e.p028c.C0351f;
import p000a.p025h.p029f.C0360c;
import p000a.p025h.p029f.C0369i;
import p000a.p025h.p035j.C0390c;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.h.j.b */
public class C0382b {

    /* renamed from: a */
    public static final C0262e<String, Typeface> f1900a = new C0262e<>(16);

    /* renamed from: b */
    public static final C0390c f1901b = new C0390c("fonts", 10, 10000);

    /* renamed from: c */
    public static final Object f1902c = new Object();

    /* renamed from: d */
    public static final C0269g<String, ArrayList<C0390c.C0395d<C0389g>>> f1903d = new C0269g<>();

    /* renamed from: e */
    public static final Comparator<byte[]> f1904e = new C0386d();

    /* renamed from: f */
    public static C0389g m1977f(Context context, C0381a request, int style) {
        try {
            C0387e result = m1974c(context, (CancellationSignal) null, request);
            int resultCode = -3;
            if (result.mo2351b() == 0) {
                Typeface typeface = C0360c.m1866b(context, (CancellationSignal) null, result.mo2350a(), style);
                if (typeface != null) {
                    resultCode = 0;
                }
                return new C0389g(typeface, resultCode);
            }
            if (result.mo2351b() == 1) {
                resultCode = -2;
            }
            return new C0389g((Typeface) null, resultCode);
        } catch (PackageManager.NameNotFoundException e) {
            return new C0389g((Typeface) null, -1);
        }
    }

    /* renamed from: a.h.j.b$g */
    public static final class C0389g {

        /* renamed from: a */
        public final Typeface f1919a;

        /* renamed from: b */
        public final int f1920b;

        public C0389g(Typeface typeface, int result) {
            this.f1919a = typeface;
            this.f1920b = result;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        f1901b.mo2360d(r2, new p000a.p025h.p035j.C0382b.C0385c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m1978g(android.content.Context r9, p000a.p025h.p035j.C0381a r10, p000a.p025h.p027e.p028c.C0351f.C0352a r11, android.os.Handler r12, boolean r13, int r14, int r15) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.mo2338c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            a.e.e<java.lang.String, android.graphics.Typeface> r1 = f1900a
            java.lang.Object r1 = r1.mo1801c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r11 == 0) goto L_0x0027
            r11.mo1560d(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r13 == 0) goto L_0x0043
            r2 = -1
            if (r14 != r2) goto L_0x0043
            a.h.j.b$g r2 = m1977f(r9, r10, r15)
            if (r11 == 0) goto L_0x0040
            int r3 = r2.f1920b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f1919a
            r11.mo2256b(r3, r12)
            goto L_0x0040
        L_0x003d:
            r11.mo2255a(r3, r12)
        L_0x0040:
            android.graphics.Typeface r3 = r2.f1919a
            return r3
        L_0x0043:
            a.h.j.b$a r2 = new a.h.j.b$a
            r2.<init>(r9, r10, r15, r0)
            r3 = 0
            if (r13 == 0) goto L_0x0058
            a.h.j.c r4 = f1901b     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Object r4 = r4.mo2361e(r2, r14)     // Catch:{ InterruptedException -> 0x0056 }
            a.h.j.b$g r4 = (p000a.p025h.p035j.C0382b.C0389g) r4     // Catch:{ InterruptedException -> 0x0056 }
            android.graphics.Typeface r3 = r4.f1919a     // Catch:{ InterruptedException -> 0x0056 }
            return r3
        L_0x0056:
            r4 = move-exception
            return r3
        L_0x0058:
            if (r11 != 0) goto L_0x005c
            r4 = r3
            goto L_0x0061
        L_0x005c:
            a.h.j.b$b r4 = new a.h.j.b$b
            r4.<init>(r11, r12)
        L_0x0061:
            java.lang.Object r5 = f1902c
            monitor-enter(r5)
            a.e.g<java.lang.String, java.util.ArrayList<a.h.j.c$d<a.h.j.b$g>>> r6 = f1903d     // Catch:{ all -> 0x008f }
            java.lang.Object r7 = r6.get(r0)     // Catch:{ all -> 0x008f }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0073
            r7.add(r4)     // Catch:{ all -> 0x008f }
        L_0x0073:
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            return r3
        L_0x0075:
            if (r4 == 0) goto L_0x0083
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x008f }
            r8.<init>()     // Catch:{ all -> 0x008f }
            r7 = r8
            r7.add(r4)     // Catch:{ all -> 0x008f }
            r6.put(r0, r7)     // Catch:{ all -> 0x008f }
        L_0x0083:
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            a.h.j.c r5 = f1901b
            a.h.j.b$c r6 = new a.h.j.b$c
            r6.<init>(r0)
            r5.mo2360d(r2, r6)
            return r3
        L_0x008f:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p035j.C0382b.m1978g(android.content.Context, a.h.j.a, a.h.e.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a.h.j.b$a */
    public static class C0383a implements Callable<C0389g> {

        /* renamed from: a */
        public final /* synthetic */ Context f1905a;

        /* renamed from: b */
        public final /* synthetic */ C0381a f1906b;

        /* renamed from: c */
        public final /* synthetic */ int f1907c;

        /* renamed from: d */
        public final /* synthetic */ String f1908d;

        public C0383a(Context context, C0381a aVar, int i, String str) {
            this.f1905a = context;
            this.f1906b = aVar;
            this.f1907c = i;
            this.f1908d = str;
        }

        /* renamed from: a */
        public C0389g call() {
            C0389g typeface = C0382b.m1977f(this.f1905a, this.f1906b, this.f1907c);
            Typeface typeface2 = typeface.f1919a;
            if (typeface2 != null) {
                C0382b.f1900a.mo1802d(this.f1908d, typeface2);
            }
            return typeface;
        }
    }

    /* renamed from: a.h.j.b$b */
    public static class C0384b implements C0390c.C0395d<C0389g> {

        /* renamed from: a */
        public final /* synthetic */ C0351f.C0352a f1909a;

        /* renamed from: b */
        public final /* synthetic */ Handler f1910b;

        public C0384b(C0351f.C0352a aVar, Handler handler) {
            this.f1909a = aVar;
            this.f1910b = handler;
        }

        /* renamed from: b */
        public void mo2345a(C0389g typeface) {
            if (typeface == null) {
                this.f1909a.mo2255a(1, this.f1910b);
                return;
            }
            int i = typeface.f1920b;
            if (i == 0) {
                this.f1909a.mo2256b(typeface.f1919a, this.f1910b);
            } else {
                this.f1909a.mo2255a(i, this.f1910b);
            }
        }
    }

    /* renamed from: a.h.j.b$c */
    public static class C0385c implements C0390c.C0395d<C0389g> {

        /* renamed from: a */
        public final /* synthetic */ String f1911a;

        public C0385c(String str) {
            this.f1911a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((p000a.p025h.p035j.C0390c.C0395d) r2.get(r0)).mo2345a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2345a(p000a.p025h.p035j.C0382b.C0389g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p000a.p025h.p035j.C0382b.f1902c
                monitor-enter(r0)
                a.e.g<java.lang.String, java.util.ArrayList<a.h.j.c$d<a.h.j.b$g>>> r1 = p000a.p025h.p035j.C0382b.f1903d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f1911a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f1911a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                a.h.j.c$d r1 = (p000a.p025h.p035j.C0390c.C0395d) r1
                r1.mo2345a(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p035j.C0382b.C0385c.mo2345a(a.h.j.b$g):void");
        }
    }

    /* renamed from: a.h.j.b$f */
    public static class C0388f {

        /* renamed from: a */
        public final Uri f1914a;

        /* renamed from: b */
        public final int f1915b;

        /* renamed from: c */
        public final int f1916c;

        /* renamed from: d */
        public final boolean f1917d;

        /* renamed from: e */
        public final int f1918e;

        public C0388f(Uri uri, int ttcIndex, int weight, boolean italic, int resultCode) {
            C0419h.m2060c(uri);
            this.f1914a = uri;
            this.f1915b = ttcIndex;
            this.f1916c = weight;
            this.f1917d = italic;
            this.f1918e = resultCode;
        }

        /* renamed from: c */
        public Uri mo2354c() {
            return this.f1914a;
        }

        /* renamed from: b */
        public int mo2353b() {
            return this.f1915b;
        }

        /* renamed from: d */
        public int mo2355d() {
            return this.f1916c;
        }

        /* renamed from: e */
        public boolean mo2356e() {
            return this.f1917d;
        }

        /* renamed from: a */
        public int mo2352a() {
            return this.f1918e;
        }
    }

    /* renamed from: a.h.j.b$e */
    public static class C0387e {

        /* renamed from: a */
        public final int f1912a;

        /* renamed from: b */
        public final C0388f[] f1913b;

        public C0387e(int statusCode, C0388f[] fonts) {
            this.f1912a = statusCode;
            this.f1913b = fonts;
        }

        /* renamed from: b */
        public int mo2351b() {
            return this.f1912a;
        }

        /* renamed from: a */
        public C0388f[] mo2350a() {
            return this.f1913b;
        }
    }

    /* renamed from: i */
    public static Map<Uri, ByteBuffer> m1980i(Context context, C0388f[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap<>();
        for (C0388f font : fonts) {
            if (font.mo2352a() == 0) {
                Uri uri = font.mo2354c();
                if (!out.containsKey(uri)) {
                    out.put(uri, C0369i.m1929f(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(out);
    }

    /* renamed from: c */
    public static C0387e m1974c(Context context, CancellationSignal cancellationSignal, C0381a request) {
        ProviderInfo providerInfo = m1979h(context.getPackageManager(), request, context.getResources());
        if (providerInfo == null) {
            return new C0387e(1, (C0388f[]) null);
        }
        return new C0387e(0, m1976e(context, request, providerInfo.authority, cancellationSignal));
    }

    /* renamed from: h */
    public static ProviderInfo m1979h(PackageManager packageManager, C0381a request, Resources resources) {
        String providerAuthority = request.mo2339d();
        ProviderInfo info = packageManager.resolveContentProvider(providerAuthority, 0);
        if (info == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        } else if (info.packageName.equals(request.mo2340e())) {
            List<byte[]> signatures = m1972a(packageManager.getPackageInfo(info.packageName, 64).signatures);
            Collections.sort(signatures, f1904e);
            List<List<byte[]>> requestCertificatesList = m1975d(request, resources);
            for (int i = 0; i < requestCertificatesList.size(); i++) {
                List<byte[]> requestSignatures = new ArrayList<>(requestCertificatesList.get(i));
                Collections.sort(requestSignatures, f1904e);
                if (m1973b(signatures, requestSignatures)) {
                    return info;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + request.mo2340e());
        }
    }

    /* renamed from: d */
    public static List<List<byte[]>> m1975d(C0381a request, Resources resources) {
        if (request.mo2336a() != null) {
            return request.mo2336a();
        }
        return C0343c.m1801c(resources, request.mo2337b());
    }

    /* renamed from: a.h.j.b$d */
    public static class C0386d implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] l, byte[] r) {
            if (l.length != r.length) {
                return l.length - r.length;
            }
            for (int i = 0; i < l.length; i++) {
                if (l[i] != r[i]) {
                    return l[i] - r[i];
                }
            }
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m1973b(List<byte[]> signatures, List<byte[]> requestSignatures) {
        if (signatures.size() != requestSignatures.size()) {
            return false;
        }
        for (int i = 0; i < signatures.size(); i++) {
            if (!Arrays.equals(signatures.get(i), requestSignatures.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static List<byte[]> m1972a(Signature[] signatures) {
        List<byte[]> shas = new ArrayList<>();
        for (Signature byteArray : signatures) {
            shas.add(byteArray.toByteArray());
        }
        return shas;
    }

    /* renamed from: e */
    public static C0388f[] m1976e(Context context, C0381a request, String authority, CancellationSignal cancellationSignal) {
        Uri fileUri;
        Cursor cursor;
        String str = authority;
        ArrayList<FontsContractCompat.FontInfo> result = new ArrayList<>();
        Uri uri = new Uri.Builder().scheme("content").authority(str).build();
        Uri fileBaseUri = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(uri, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.mo2341f()}, (String) null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(uri, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{request.mo2341f()}, (String) null);
            }
            if (cursor2 != null && cursor2.getCount() > 0) {
                int resultCodeColumnIndex = cursor2.getColumnIndex("result_code");
                result = new ArrayList<>();
                int idColumnIndex = cursor2.getColumnIndex("_id");
                int fileIdColumnIndex = cursor2.getColumnIndex("file_id");
                int ttcIndexColumnIndex = cursor2.getColumnIndex("font_ttc_index");
                int weightColumnIndex = cursor2.getColumnIndex("font_weight");
                int italicColumnIndex = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int resultCode = resultCodeColumnIndex != -1 ? cursor2.getInt(resultCodeColumnIndex) : 0;
                    int ttcIndex = ttcIndexColumnIndex != -1 ? cursor2.getInt(ttcIndexColumnIndex) : 0;
                    if (fileIdColumnIndex == -1) {
                        fileUri = ContentUris.withAppendedId(uri, cursor2.getLong(idColumnIndex));
                    } else {
                        fileUri = ContentUris.withAppendedId(fileBaseUri, cursor2.getLong(fileIdColumnIndex));
                    }
                    result.add(new C0388f(fileUri, ttcIndex, weightColumnIndex != -1 ? cursor2.getInt(weightColumnIndex) : 400, italicColumnIndex != -1 && cursor2.getInt(italicColumnIndex) == 1, resultCode));
                }
            }
            return (C0388f[]) result.toArray(new C0388f[0]);
        } finally {
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }
}
