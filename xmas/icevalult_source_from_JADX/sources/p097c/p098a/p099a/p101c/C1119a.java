package p097c.p098a.p099a.p101c;

import android.util.Base64;

/* renamed from: c.a.a.c.a */
public class C1119a extends C1120b {
    /* renamed from: a */
    public String mo6371a(String input, int key) {
        byte[] out = new byte[input.length()];
        byte[] in = Base64.decode(input, 0);
        for (int i = 0; i < in.length; i++) {
            out[i] = (byte) (in[i] ^ key);
        }
        return new String(out).trim();
    }
}
