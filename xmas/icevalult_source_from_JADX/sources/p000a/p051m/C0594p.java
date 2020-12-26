package p000a.p051m;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.m.p */
public abstract class C0594p {

    /* renamed from: a */
    public final Map<String, Object> f2399a = new HashMap();

    /* renamed from: c */
    public void mo3015c() {
    }

    /* renamed from: a */
    public final void mo3132a() {
        Map<String, Object> map = this.f2399a;
        if (map != null) {
            synchronized (map) {
                for (Object value : this.f2399a.values()) {
                    m2960b(value);
                }
            }
        }
        mo3015c();
    }

    /* renamed from: b */
    public static void m2960b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
