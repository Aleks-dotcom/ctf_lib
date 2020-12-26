package p000a.p025h.p026d;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: a.h.d.b */
public final class C0328b {

    /* renamed from: a */
    public static final Class<?> f1813a;

    /* renamed from: b */
    public static final Field f1814b = m1748b();

    /* renamed from: c */
    public static final Field f1815c = m1752f();

    /* renamed from: d */
    public static final Method f1816d;

    /* renamed from: e */
    public static final Method f1817e;

    /* renamed from: f */
    public static final Method f1818f;

    /* renamed from: g */
    public static final Handler f1819g = new Handler(Looper.getMainLooper());

    static {
        Class<?> a = m1747a();
        f1813a = a;
        f1816d = m1750d(a);
        f1817e = m1749c(a);
        f1818f = m1751e(a);
    }

    /* renamed from: i */
    public static boolean m1755i(Activity activity) {
        Object activityThread;
        Application application;
        C0332d callbacks;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1753g() && f1818f == null) {
            return false;
        } else {
            if (f1817e == null && f1816d == null) {
                return false;
            }
            try {
                Object token = f1815c.get(activity);
                if (token == null || (activityThread = f1814b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                callbacks = new C0332d(activity);
                application.registerActivityLifecycleCallbacks(callbacks);
                Handler handler = f1819g;
                handler.post(new C0329a(callbacks, token));
                if (m1753g()) {
                    f1818f.invoke(activityThread, new Object[]{token, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                handler.post(new C0330b(application, callbacks));
                return true;
            } catch (Throwable th) {
                return false;
            }
        }
    }

    /* renamed from: a.h.d.b$a */
    public static class C0329a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C0332d f1820b;

        /* renamed from: c */
        public final /* synthetic */ Object f1821c;

        public C0329a(C0332d dVar, Object obj) {
            this.f1820b = dVar;
            this.f1821c = obj;
        }

        public void run() {
            this.f1820b.f1826a = this.f1821c;
        }
    }

    /* renamed from: a.h.d.b$b */
    public static class C0330b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Application f1822b;

        /* renamed from: c */
        public final /* synthetic */ C0332d f1823c;

        public C0330b(Application application, C0332d dVar) {
            this.f1822b = application;
            this.f1823c = dVar;
        }

        public void run() {
            this.f1822b.unregisterActivityLifecycleCallbacks(this.f1823c);
        }
    }

    /* renamed from: a.h.d.b$d */
    public static final class C0332d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f1826a;

        /* renamed from: b */
        public Activity f1827b;

        /* renamed from: c */
        public boolean f1828c = false;

        /* renamed from: d */
        public boolean f1829d = false;

        /* renamed from: e */
        public boolean f1830e = false;

        public C0332d(Activity aboutToRecreate) {
            this.f1827b = aboutToRecreate;
        }

        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1827b == activity) {
                this.f1828c = true;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1829d && !this.f1830e && !this.f1828c && C0328b.m1754h(this.f1826a, activity)) {
                this.f1830e = true;
                this.f1826a = null;
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1827b == activity) {
                this.f1827b = null;
                this.f1829d = true;
            }
        }
    }

    /* renamed from: h */
    public static boolean m1754h(Object currentlyRecreatingToken, Activity activity) {
        try {
            Object token = f1815c.get(activity);
            if (token != currentlyRecreatingToken) {
                return false;
            }
            f1819g.postAtFrontOfQueue(new C0331c(f1814b.get(activity), token));
            return true;
        } catch (Throwable t) {
            Log.e("ActivityRecreator", "Exception while fetching field values", t);
            return false;
        }
    }

    /* renamed from: a.h.d.b$c */
    public static class C0331c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Object f1824b;

        /* renamed from: c */
        public final /* synthetic */ Object f1825c;

        public C0331c(Object obj, Object obj2) {
            this.f1824b = obj;
            this.f1825c = obj2;
        }

        public void run() {
            try {
                Method method = C0328b.f1816d;
                if (method != null) {
                    method.invoke(this.f1824b, new Object[]{this.f1825c, false, "AppCompat recreation"});
                    return;
                }
                C0328b.f1817e.invoke(this.f1824b, new Object[]{this.f1825c, false});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable t) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", t);
            }
        }
    }

    /* renamed from: d */
    public static Method m1750d(Class<?> activityThreadClass) {
        if (activityThreadClass == null) {
            return null;
        }
        try {
            Method performStop = activityThreadClass.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m1749c(Class<?> activityThreadClass) {
        if (activityThreadClass == null) {
            return null;
        }
        try {
            Method performStop = activityThreadClass.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            performStop.setAccessible(true);
            return performStop;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m1753g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: e */
    public static Method m1751e(Class<?> activityThreadClass) {
        if (!m1753g() || activityThreadClass == null) {
            return null;
        }
        try {
            Class cls = Boolean.TYPE;
            Method relaunch = activityThreadClass.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls, Configuration.class, Configuration.class, cls, cls});
            relaunch.setAccessible(true);
            return relaunch;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m1748b() {
        try {
            Field mainThreadField = Activity.class.getDeclaredField("mMainThread");
            mainThreadField.setAccessible(true);
            return mainThreadField;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: f */
    public static Field m1752f() {
        try {
            Field tokenField = Activity.class.getDeclaredField("mToken");
            tokenField.setAccessible(true);
            return tokenField;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public static Class<?> m1747a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable th) {
            return null;
        }
    }
}
