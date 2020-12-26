package p000a.p046k.p047a;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import p000a.p018e.C0269g;

/* renamed from: a.k.a.g */
public class C0524g {

    /* renamed from: a */
    public static final C0269g<String, Class<?>> f2189a = new C0269g<>();

    /* renamed from: c */
    public static Class<?> m2650c(ClassLoader classLoader, String className) {
        C0269g<String, Class<?>> gVar = f2189a;
        Class<?> clazz = gVar.get(className);
        if (clazz != null) {
            return clazz;
        }
        Class<?> clazz2 = Class.forName(className, false, classLoader);
        gVar.put(className, clazz2);
        return clazz2;
    }

    /* renamed from: b */
    public static boolean m2649b(ClassLoader classLoader, String className) {
        try {
            return Fragment.class.isAssignableFrom(m2650c(classLoader, className));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2651d(ClassLoader classLoader, String className) {
        try {
            return m2650c(classLoader, className);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2862a(ClassLoader classLoader, String className) {
        try {
            return (Fragment) m2651d(classLoader, className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.C0842e("Unable to instantiate fragment " + className + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
