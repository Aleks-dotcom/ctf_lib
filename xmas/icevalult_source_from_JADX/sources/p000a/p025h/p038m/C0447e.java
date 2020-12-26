package p000a.p025h.p038m;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: a.h.m.e */
public final class C0447e {

    /* renamed from: a */
    public static Field f2016a;

    /* renamed from: b */
    public static boolean f2017b;

    /* renamed from: a */
    public static void m2182a(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        if (!f2017b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2016a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f2017b = true;
        }
        Field field = f2016a;
        if (field != null) {
            try {
                field.set(inflater, factory);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + inflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m2183b(LayoutInflater inflater, LayoutInflater.Factory2 factory) {
        inflater.setFactory2(factory);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory f = inflater.getFactory();
            if (f instanceof LayoutInflater.Factory2) {
                m2182a(inflater, (LayoutInflater.Factory2) f);
            } else {
                m2182a(inflater, factory);
            }
        }
    }
}
