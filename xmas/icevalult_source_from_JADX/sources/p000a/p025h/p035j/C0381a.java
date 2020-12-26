package p000a.p025h.p035j;

import android.util.Base64;
import java.util.List;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.h.j.a */
public final class C0381a {

    /* renamed from: a */
    public final String f1894a;

    /* renamed from: b */
    public final String f1895b;

    /* renamed from: c */
    public final String f1896c;

    /* renamed from: d */
    public final List<List<byte[]>> f1897d;

    /* renamed from: e */
    public final int f1898e = 0;

    /* renamed from: f */
    public final String f1899f;

    public C0381a(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        C0419h.m2060c(providerAuthority);
        String str = providerAuthority;
        this.f1894a = str;
        C0419h.m2060c(providerPackage);
        String str2 = providerPackage;
        this.f1895b = str2;
        C0419h.m2060c(query);
        String str3 = query;
        this.f1896c = str3;
        C0419h.m2060c(certificates);
        this.f1897d = certificates;
        this.f1899f = str + "-" + str2 + "-" + str3;
    }

    /* renamed from: d */
    public String mo2339d() {
        return this.f1894a;
    }

    /* renamed from: e */
    public String mo2340e() {
        return this.f1895b;
    }

    /* renamed from: f */
    public String mo2341f() {
        return this.f1896c;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo2336a() {
        return this.f1897d;
    }

    /* renamed from: b */
    public int mo2337b() {
        return this.f1898e;
    }

    /* renamed from: c */
    public String mo2338c() {
        return this.f1899f;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f1894a + ", mProviderPackage: " + this.f1895b + ", mQuery: " + this.f1896c + ", mCertificates:");
        for (int i = 0; i < this.f1897d.size(); i++) {
            builder.append(" [");
            List<byte[]> set = this.f1897d.get(i);
            for (int j = 0; j < set.size(); j++) {
                builder.append(" \"");
                builder.append(Base64.encodeToString(set.get(j), 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.f1898e);
        return builder.toString();
    }
}
