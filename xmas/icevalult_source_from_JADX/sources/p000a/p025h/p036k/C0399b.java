package p000a.p025h.p036k;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.h.k.b */
public final class C0399b {

    /* renamed from: a */
    public static Method f1957a;

    /* renamed from: b */
    public static Method f1958b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> clazz = Class.forName("libcore.icu.ICU");
                if (clazz != null) {
                    f1957a = clazz.getMethod("getScript", new Class[]{cls});
                    f1958b = clazz.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e) {
                f1957a = null;
                f1958b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f1958b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: c */
    public static String m2023c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f1958b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String localeWithSubtags = m2021a(locale);
            if (localeWithSubtags != null) {
                return m2022b(localeWithSubtags);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static String m2022b(String localeStr) {
        try {
            Method method = f1957a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{localeStr});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: a */
    public static String m2021a(Locale locale) {
        String localeStr = locale.toString();
        try {
            Method method = f1958b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{localeStr});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return localeStr;
    }
}
