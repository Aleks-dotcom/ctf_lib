package p000a.p025h.p029f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.h.f.g */
public class C0364g extends C0363f {
    /* renamed from: l */
    public Typeface mo2265l(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f1870g, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f1876m.invoke((Object) null, new Object[]{familyArray, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: x */
    public Method mo2274x(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(fontFamily, 1).getClass(), String.class, cls, cls});
        m.setAccessible(true);
        return m;
    }
}
