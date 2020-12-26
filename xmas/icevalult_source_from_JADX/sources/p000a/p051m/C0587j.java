package p000a.p051m;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a.m.j */
public class C0587j {

    /* renamed from: a */
    public static Map<Class, Integer> f2396a = new HashMap();

    /* renamed from: b */
    public static Map<Class, List<Constructor<? extends C0576c>>> f2397b = new HashMap();

    /* renamed from: f */
    public static C0580e m2948f(Object object) {
        boolean isLifecycleEventObserver = object instanceof C0580e;
        boolean isFullLifecycleObserver = object instanceof C0575b;
        if (isLifecycleEventObserver && isFullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((C0575b) object, (C0580e) object);
        }
        if (isFullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((C0575b) object, (C0580e) null);
        }
        if (isLifecycleEventObserver) {
            return (C0580e) object;
        }
        Class<?> klass = object.getClass();
        if (m2946d(klass) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> constructors = f2397b.get(klass);
        if (constructors.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2943a(constructors.get(0), object));
        }
        C0576c[] adapters = new C0576c[constructors.size()];
        for (int i = 0; i < constructors.size(); i++) {
            adapters[i] = m2943a(constructors.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    /* renamed from: a */
    public static C0576c m2943a(Constructor<? extends C0576c> constructor, Object object) {
        try {
            return (C0576c) constructor.newInstance(new Object[]{object});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static Constructor<? extends C0576c> m2944b(Class<?> klass) {
        String str;
        String str2;
        try {
            Package aPackage = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : "";
            if (fullPackage.isEmpty()) {
                str = name;
            } else {
                str = name.substring(fullPackage.length() + 1);
            }
            String adapterName = m2945c(str);
            if (fullPackage.isEmpty()) {
                str2 = adapterName;
            } else {
                str2 = fullPackage + "." + adapterName;
            }
            Constructor<?> declaredConstructor = Class.forName(str2).getDeclaredConstructor(new Class[]{klass});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    public static int m2946d(Class<?> klass) {
        Integer callbackCache = f2396a.get(klass);
        if (callbackCache != null) {
            return callbackCache.intValue();
        }
        int type = m2949g(klass);
        f2396a.put(klass, Integer.valueOf(type));
        return type;
    }

    /* renamed from: g */
    public static int m2949g(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0576c> b = m2944b(klass);
        if (b != null) {
            f2397b.put(klass, Collections.singletonList(b));
            return 2;
        } else if (C0572a.f2372c.mo3086d(klass)) {
            return 1;
        } else {
            Class<? super Object> superclass = klass.getSuperclass();
            List<Constructor<? extends GeneratedAdapter>> adapterConstructors = null;
            if (m2947e(superclass)) {
                if (m2946d(superclass) == 1) {
                    return 1;
                }
                adapterConstructors = new ArrayList<>(f2397b.get(superclass));
            }
            for (Class<?> intrface : klass.getInterfaces()) {
                if (m2947e(intrface)) {
                    if (m2946d(intrface) == 1) {
                        return 1;
                    }
                    if (adapterConstructors == null) {
                        adapterConstructors = new ArrayList<>();
                    }
                    adapterConstructors.addAll(f2397b.get(intrface));
                }
            }
            if (adapterConstructors == null) {
                return 1;
            }
            f2397b.put(klass, adapterConstructors);
            return 2;
        }
    }

    /* renamed from: e */
    public static boolean m2947e(Class<?> klass) {
        return klass != null && C0581f.class.isAssignableFrom(klass);
    }

    /* renamed from: c */
    public static String m2945c(String className) {
        return className.replace(".", "_") + "_LifecycleAdapter";
    }
}
