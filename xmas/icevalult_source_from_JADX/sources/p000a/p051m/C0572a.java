package p000a.p051m;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p051m.C0577d;

/* renamed from: a.m.a */
public class C0572a {

    /* renamed from: c */
    public static C0572a f2372c = new C0572a();

    /* renamed from: a */
    public final Map<Class, C0573a> f2373a = new HashMap();

    /* renamed from: b */
    public final Map<Class, Boolean> f2374b = new HashMap();

    /* renamed from: d */
    public boolean mo3086d(Class klass) {
        Boolean hasLifecycleMethods = this.f2374b.get(klass);
        if (hasLifecycleMethods != null) {
            return hasLifecycleMethods.booleanValue();
        }
        Method[] methods = mo3084b(klass);
        for (Method method : methods) {
            if (((C0591n) method.getAnnotation(C0591n.class)) != null) {
                mo3083a(klass, methods);
                return true;
            }
        }
        this.f2374b.put(klass, false);
        return false;
    }

    /* renamed from: b */
    public final Method[] mo3084b(Class klass) {
        try {
            return klass.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C0573a mo3085c(Class klass) {
        C0573a existing = this.f2373a.get(klass);
        if (existing != null) {
            return existing;
        }
        return mo3083a(klass, (Method[]) null);
    }

    /* renamed from: e */
    public final void mo3087e(Map<C0574b, C0577d.C0578a> handlers, C0574b newHandler, C0577d.C0578a newEvent, Class klass) {
        C0577d.C0578a event = handlers.get(newHandler);
        if (event != null && newEvent != event) {
            Method method = newHandler.f2378b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
        } else if (event == null) {
            handlers.put(newHandler, newEvent);
        }
    }

    /* renamed from: a */
    public final C0573a mo3083a(Class klass, Method[] declaredMethods) {
        C0573a superInfo;
        Class cls = klass;
        Class superclass = klass.getSuperclass();
        Map<ClassesInfoCache.MethodReference, Lifecycle.Event> handlerToEvent = new HashMap<>();
        if (!(superclass == null || (superInfo = mo3085c(superclass)) == null)) {
            handlerToEvent.putAll(superInfo.f2376b);
        }
        char c = 0;
        for (Class intrfc : klass.getInterfaces()) {
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : mo3085c(intrfc).f2376b.entrySet()) {
                mo3087e(handlerToEvent, (C0574b) entry.getKey(), (C0577d.C0578a) entry.getValue(), cls);
            }
        }
        Method[] methods = declaredMethods != null ? declaredMethods : mo3084b(klass);
        boolean hasLifecycleMethods = false;
        int length = methods.length;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            C0591n annotation = (C0591n) method.getAnnotation(C0591n.class);
            if (annotation != null) {
                hasLifecycleMethods = true;
                Class<?>[] params = method.getParameterTypes();
                int callType = 0;
                if (params.length > 0) {
                    callType = 1;
                    if (!params[c].isAssignableFrom(C0582g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                }
                C0577d.C0578a event = annotation.value();
                if (params.length > 1) {
                    callType = 2;
                    if (!params[1].isAssignableFrom(C0577d.C0578a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (event != C0577d.C0578a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (params.length <= 2) {
                    mo3087e(handlerToEvent, new C0574b(callType, method), event, cls);
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
            i++;
            c = 0;
        }
        C0573a info = new C0573a(handlerToEvent);
        this.f2373a.put(cls, info);
        this.f2374b.put(cls, Boolean.valueOf(hasLifecycleMethods));
        return info;
    }

    /* renamed from: a.m.a$a */
    public static class C0573a {

        /* renamed from: a */
        public final Map<C0577d.C0578a, List<C0574b>> f2375a = new HashMap();

        /* renamed from: b */
        public final Map<C0574b, C0577d.C0578a> f2376b;

        public C0573a(Map<C0574b, C0577d.C0578a> handlerToEvent) {
            this.f2376b = handlerToEvent;
            for (Map.Entry<ClassesInfoCache.MethodReference, Lifecycle.Event> entry : handlerToEvent.entrySet()) {
                C0577d.C0578a event = (C0577d.C0578a) entry.getValue();
                List<ClassesInfoCache.MethodReference> methodReferences = this.f2375a.get(event);
                if (methodReferences == null) {
                    methodReferences = new ArrayList<>();
                    this.f2375a.put(event, methodReferences);
                }
                methodReferences.add(entry.getKey());
            }
        }

        /* renamed from: a */
        public void mo3088a(C0582g source, C0577d.C0578a event, Object target) {
            m2907b(this.f2375a.get(event), source, event, target);
            m2907b(this.f2375a.get(C0577d.C0578a.ON_ANY), source, event, target);
        }

        /* renamed from: b */
        public static void m2907b(List<C0574b> handlers, C0582g source, C0577d.C0578a event, Object mWrapped) {
            if (handlers != null) {
                for (int i = handlers.size() - 1; i >= 0; i--) {
                    handlers.get(i).mo3089a(source, event, mWrapped);
                }
            }
        }
    }

    /* renamed from: a.m.a$b */
    public static class C0574b {

        /* renamed from: a */
        public final int f2377a;

        /* renamed from: b */
        public final Method f2378b;

        public C0574b(int callType, Method method) {
            this.f2377a = callType;
            this.f2378b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void mo3089a(C0582g source, C0577d.C0578a event, Object target) {
            try {
                int i = this.f2377a;
                if (i == 0) {
                    this.f2378b.invoke(target, new Object[0]);
                } else if (i == 1) {
                    this.f2378b.invoke(target, new Object[]{source});
                } else if (i == 2) {
                    this.f2378b.invoke(target, new Object[]{source, event});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            C0574b that = (C0574b) o;
            if (this.f2377a != that.f2377a || !this.f2378b.getName().equals(that.f2378b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f2377a * 31) + this.f2378b.getName().hashCode();
        }
    }
}
