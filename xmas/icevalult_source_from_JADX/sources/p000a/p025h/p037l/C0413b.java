package p000a.p025h.p037l;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.h.l.b */
public class C0413b extends Writer {

    /* renamed from: b */
    public final String f1981b;

    /* renamed from: c */
    public StringBuilder f1982c = new StringBuilder(128);

    public C0413b(String tag) {
        this.f1981b = tag;
    }

    public void close() {
        mo2409a();
    }

    public void flush() {
        mo2409a();
    }

    public void write(char[] buf, int offset, int count) {
        for (int i = 0; i < count; i++) {
            char c = buf[offset + i];
            if (c == 10) {
                mo2409a();
            } else {
                this.f1982c.append(c);
            }
        }
    }

    /* renamed from: a */
    public final void mo2409a() {
        if (this.f1982c.length() > 0) {
            Log.d(this.f1981b, this.f1982c.toString());
            StringBuilder sb = this.f1982c;
            sb.delete(0, sb.length());
        }
    }
}
