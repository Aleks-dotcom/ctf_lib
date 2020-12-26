package p000a.p052n.p053a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p051m.C0582g;
import p000a.p051m.C0599s;

/* renamed from: a.n.a.a */
public abstract class C0600a {
    @Deprecated
    /* renamed from: a */
    public abstract void mo3139a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo3140c();

    /* renamed from: b */
    public static <T extends C0582g & C0599s> C0600a m2972b(T owner) {
        return new C0601b(owner, ((C0599s) owner).mo2825e());
    }
}
