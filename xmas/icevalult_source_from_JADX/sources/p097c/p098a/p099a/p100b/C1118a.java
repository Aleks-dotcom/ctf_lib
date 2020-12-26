package p097c.p098a.p099a.p100b;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p097c.p098a.p099a.p102d.C1121a;
import p104io.the.santasicevault.App;

/* renamed from: c.a.a.b.a */
public class C1118a {
    /* renamed from: a */
    public String mo6370a(Context context, String s) {
        C1121a rot = ((App) context).mo7192a();
        try {
            Class<?> cls = Class.forName(rot.mo6371a("b2RzZCtpZGtiK1Zxd2xrYkdwbGlhYHc=", 5));
            int i = 1;
            Class cls2 = Integer.TYPE;
            Constructor<?> con = cls.getConstructor(new Class[]{cls2});
            Object obj = con.newInstance(new Object[]{Integer.valueOf(s.length())});
            Method ap = obj.getClass().getDeclaredMethod(rot.mo6371a("bXx8aWJo", 12), new Class[]{Character.TYPE});
            Method at = Class.forName(rot.mo6371a("g4ifiMeFiIeOx7qdm4CHjg==", -23)).getDeclaredMethod(rot.mo6371a("aGNqeUp/", 11), new Class[]{cls2});
            Method carr = Class.forName(rot.mo6371a("o6i/qOelqKeu55q9u6Cnrg==", -55)).getDeclaredMethod(rot.mo6371a("a3Bcd35tXm1tfmY=", 31), new Class[0]);
            Method cval = Class.forName(rot.mo6371a("aWJ1Yi1vYm1kLUBrYnFiYHdmcQ==", 3)).getDeclaredMethod(rot.mo6371a("kJuSgaWSn4aW", -13), new Class[0]);
            try {
                char[] cArr = (char[]) carr.invoke(s, new Object[0]);
                int length = cArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object[] objArr = new Object[i];
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(((Character) cval.invoke(Character.valueOf(cArr[i2]), new Object[0])).charValue() - App.f4964c);
                    objArr[0] = at.invoke("]kYV}(!7P$n5_0i R:?jOWtF/=-pe'AD&@r6%ZXs\"v*N[#wSl9zq2^+g;LoB`aGh{3.HIu4fbK)mU8|dMET><,Qc\\C1yxJ", objArr2);
                    ap.invoke(obj, objArr);
                    i2++;
                    con = con;
                    i = 1;
                }
                return (String) obj.getClass().getDeclaredMethod(rot.mo6371a("WEN/WF5FQks=", 44), new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable th) {
                return "";
            }
        } catch (Throwable th2) {
            String str = s;
            return "";
        }
    }
}
