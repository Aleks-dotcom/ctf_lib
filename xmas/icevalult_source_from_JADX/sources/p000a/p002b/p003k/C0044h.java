package p000a.p002b.p003k;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: a.b.k.h */
public class C0044h {

    /* renamed from: a */
    public static Field f345a;

    /* renamed from: b */
    public static boolean f346b;

    /* renamed from: c */
    public static Class<?> f347c;

    /* renamed from: d */
    public static boolean f348d;

    /* renamed from: e */
    public static Field f349e;

    /* renamed from: f */
    public static boolean f350f;

    /* renamed from: g */
    public static Field f351g;

    /* renamed from: h */
    public static boolean f352h;

    /* renamed from: a */
    public static void m207a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m210d(resources);
            } else if (i >= 23) {
                m209c(resources);
            } else if (i >= 21) {
                m208b(resources);
            }
        }
    }

    /* renamed from: b */
    public static void m208b(Resources resources) {
        if (!f346b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f345a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f346b = true;
        }
        Field field = f345a;
        if (field != null) {
            Map drawableCache = null;
            try {
                drawableCache = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (drawableCache != null) {
                drawableCache.clear();
            }
        }
    }

    /* renamed from: c */
    public static void m209c(Resources resources) {
        if (!f346b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f345a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f346b = true;
        }
        Object drawableCache = null;
        Field field = f345a;
        if (field != null) {
            try {
                drawableCache = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (drawableCache != null) {
            m211e(drawableCache);
        }
    }

    /* renamed from: d */
    public static void m210d(Resources resources) {
        if (!f352h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f351g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f352h = true;
        }
        Field field = f351g;
        if (field != null) {
            Object resourcesImpl = null;
            try {
                resourcesImpl = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            }
            if (resourcesImpl != null) {
                if (!f346b) {
                    try {
                        Field declaredField2 = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                        f345a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f346b = true;
                }
                Object drawableCache = null;
                Field field2 = f345a;
                if (field2 != null) {
                    try {
                        drawableCache = field2.get(resourcesImpl);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (drawableCache != null) {
                    m211e(drawableCache);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m211e(Object cache) {
        if (!f348d) {
            try {
                f347c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f348d = true;
        }
        Class<?> cls = f347c;
        if (cls != null) {
            if (!f350f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f349e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException ee) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
                }
                f350f = true;
            }
            Field field = f349e;
            if (field != null) {
                LongSparseArray unthemedEntries = null;
                try {
                    unthemedEntries = (LongSparseArray) field.get(cache);
                } catch (IllegalAccessException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e2);
                }
                if (unthemedEntries != null) {
                    unthemedEntries.clear();
                }
            }
        }
    }
}
