package p000a.p025h.p027e.p028c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000a.p025h.C0325c;
import p000a.p025h.p035j.C0381a;

/* renamed from: a.h.e.c.c */
public class C0343c {

    /* renamed from: a.h.e.c.c$a */
    public interface C0344a {
    }

    /* renamed from: a.h.e.c.c$d */
    public static final class C0347d implements C0344a {

        /* renamed from: a */
        public final C0381a f1846a;

        /* renamed from: b */
        public final int f1847b;

        /* renamed from: c */
        public final int f1848c;

        public C0347d(C0381a request, int strategy, int timeoutMs) {
            this.f1846a = request;
            this.f1848c = strategy;
            this.f1847b = timeoutMs;
        }

        /* renamed from: b */
        public C0381a mo2253b() {
            return this.f1846a;
        }

        /* renamed from: a */
        public int mo2252a() {
            return this.f1848c;
        }

        /* renamed from: c */
        public int mo2254c() {
            return this.f1847b;
        }
    }

    /* renamed from: a.h.e.c.c$c */
    public static final class C0346c {

        /* renamed from: a */
        public final String f1840a;

        /* renamed from: b */
        public int f1841b;

        /* renamed from: c */
        public boolean f1842c;

        /* renamed from: d */
        public String f1843d;

        /* renamed from: e */
        public int f1844e;

        /* renamed from: f */
        public int f1845f;

        public C0346c(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f1840a = fileName;
            this.f1841b = weight;
            this.f1842c = italic;
            this.f1843d = variationSettings;
            this.f1844e = ttcIndex;
            this.f1845f = resourceId;
        }

        /* renamed from: a */
        public String mo2246a() {
            return this.f1840a;
        }

        /* renamed from: e */
        public int mo2250e() {
            return this.f1841b;
        }

        /* renamed from: f */
        public boolean mo2251f() {
            return this.f1842c;
        }

        /* renamed from: d */
        public String mo2249d() {
            return this.f1843d;
        }

        /* renamed from: c */
        public int mo2248c() {
            return this.f1844e;
        }

        /* renamed from: b */
        public int mo2247b() {
            return this.f1845f;
        }
    }

    /* renamed from: a.h.e.c.c$b */
    public static final class C0345b implements C0344a {

        /* renamed from: a */
        public final C0346c[] f1839a;

        public C0345b(C0346c[] entries) {
            this.f1839a = entries;
        }

        /* renamed from: a */
        public C0346c[] mo2245a() {
            return this.f1839a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000a.p025h.p027e.p028c.C0343c.C0344a m1800b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = r0
            r2 = 2
            if (r0 == r2) goto L_0x000c
            r0 = 1
            if (r1 == r0) goto L_0x000c
            goto L_0x0000
        L_0x000c:
            if (r1 != r2) goto L_0x0013
            a.h.e.c.c$a r0 = m1802d(r3, r4)
            return r0
        L_0x0013:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p027e.p028c.C0343c.m1800b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):a.h.e.c.c$a");
    }

    /* renamed from: d */
    public static C0344a m1802d(XmlPullParser parser, Resources resources) {
        parser.require(2, (String) null, "font-family");
        if (parser.getName().equals("font-family")) {
            return m1803e(parser, resources);
        }
        m1805g(parser);
        return null;
    }

    /* renamed from: e */
    public static C0344a m1803e(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), C0325c.f1790e);
        String authority = array.getString(C0325c.f1791f);
        String providerPackage = array.getString(C0325c.f1795j);
        String query = array.getString(C0325c.f1796k);
        int certsId = array.getResourceId(C0325c.f1792g, 0);
        int strategy = array.getInteger(C0325c.f1793h, 1);
        int timeoutMs = array.getInteger(C0325c.f1794i, 500);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (parser.getName().equals("font")) {
                        fonts.add(m1804f(parser, resources));
                    } else {
                        m1805g(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new C0345b((C0346c[]) fonts.toArray(new C0346c[fonts.size()]));
        }
        while (parser.next() != 3) {
            m1805g(parser);
        }
        return new C0347d(new C0381a(authority, providerPackage, query, m1801c(resources, certsId)), strategy, timeoutMs);
    }

    /* renamed from: a */
    public static int m1799a(TypedArray typedArray, int index) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(index);
        }
        TypedValue tv = new TypedValue();
        typedArray.getValue(index, tv);
        return tv.type;
    }

    /* renamed from: c */
    public static List<List<byte[]>> m1801c(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (m1799a(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(m1806h(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(m1806h(resources.getStringArray(certsId)));
            }
            typedArray.recycle();
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    /* renamed from: h */
    public static List<byte[]> m1806h(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    /* renamed from: f */
    public static C0346c m1804f(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), C0325c.f1797l);
        int weightAttr = C0325c.f1806u;
        if (!array.hasValue(weightAttr)) {
            weightAttr = C0325c.f1799n;
        }
        int weight = array.getInt(weightAttr, 400);
        int styleAttr = C0325c.f1804s;
        if (!array.hasValue(styleAttr)) {
            styleAttr = C0325c.f1800o;
        }
        boolean isItalic = 1 == array.getInt(styleAttr, 0);
        int i = C0325c.f1807v;
        if (!array.hasValue(i)) {
            i = C0325c.f1801p;
        }
        int ttcIndexAttr = i;
        int variationSettingsAttr = C0325c.f1805t;
        if (!array.hasValue(variationSettingsAttr)) {
            variationSettingsAttr = C0325c.f1802q;
        }
        String variationSettings = array.getString(variationSettingsAttr);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int i2 = C0325c.f1803r;
        if (!array.hasValue(i2)) {
            i2 = C0325c.f1798m;
        }
        int resourceAttr = i2;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            m1805g(parser);
        }
        int i3 = resourceAttr;
        return new C0346c(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    /* renamed from: g */
    public static void m1805g(XmlPullParser parser) {
        int depth = 1;
        while (depth > 0) {
            int next = parser.next();
            if (next == 2) {
                depth++;
            } else if (next == 3) {
                depth--;
            }
        }
    }
}
