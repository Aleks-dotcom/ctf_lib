
public class Sranje {
    public String a(Context context, String s) {
        c.a.a.d.a rot = ((App) context).a();
        try {
                        Class<?> cls = Class.forName(rot.mo6371a("java.lang.StringBuilder", 5));
            int i = 1;
            Class cls2 = Integer.TYPE;
            Constructor<?> con = cls.getConstructor(new Class[]{cls2});
            Object obj = con.newInstance(new Object[]{Integer.valueOf(s.length())}); 
            Method ap = obj.getClass().getDeclaredMethod(rot.mo6371a("append", 12), new Class[]{Character.TYPE});
            Method at = Class.forName(rot.mo6371a("java.lang.String", -23)).getDeclaredMethod(rot.mo6371a("charAt", 11), new Class[]{cls2});
            Method carr = Class.forName(rot.mo6371a("java.lang.String", -55)).getDeclaredMethod(rot.mo6371a("toCharArray", 31), new Class[0]);
            Method cval = Class.forName(rot.mo6371a("java.lang.Character", 3)).getDeclaredMethod(rot.mo6371a("charValue", -13), new Class[0]);
            try {
                char[] cArr = (char[]) carr.invoke(s, new Object[0]);//input
                int length = cArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object[] objArr = new Object[i];
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf( ((Character) cval.invoke(Character.valueOf(cArr[i2]), new Object[0])).charValue() - 32 );
                    objArr[0] = at.invoke("]kYV}(!7P$n5_0i R:?jOWtF/=-pe'AD&@r6%ZXs\"v*N[#wSl9zq2^+g;LoB`aGh{3.HIu4fbK)mU8|dMET><,Qc\\C1yxJ", objArr2);
                    ap.invoke(obj, objArr);
                    i2++;
                    con = con;
                    i = 1;
                }
                return (String) obj.getClass().getDeclaredMethod(rot.mo6371a("toString", 44), new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable th) {
                return "";
            }
        } catch (Throwable th2) {
            return "";
        }
    }
}