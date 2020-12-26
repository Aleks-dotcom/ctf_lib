package p066b.p067a.p068a.p069a.p092v;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: b.a.a.a.v.e */
public class C1067e {
    /* renamed from: a */
    public static String m5742a(long timeInMillis) {
        return m5743b(timeInMillis, Locale.getDefault());
    }

    /* renamed from: b */
    public static String m5743b(long timeInMillis, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1093o.m5814b(locale).format(new Date(timeInMillis));
        }
        return C1093o.m5818f(locale).format(new Date(timeInMillis));
    }

    /* renamed from: c */
    public static String m5744c(long timeInMillis) {
        return m5745d(timeInMillis, Locale.getDefault());
    }

    /* renamed from: d */
    public static String m5745d(long timeInMillis, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1093o.m5825m(locale).format(new Date(timeInMillis));
        }
        return C1093o.m5818f(locale).format(new Date(timeInMillis));
    }
}
