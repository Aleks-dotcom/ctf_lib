package p000a.p025h.p036k;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: a.h.k.f */
public final class C0411f {

    /* renamed from: a */
    public static final Locale f1980a = new Locale("", "");

    /* renamed from: b */
    public static int m2046b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f1980a)) {
            return 0;
        }
        String scriptSubtag = C0399b.m2023c(locale);
        if (scriptSubtag == null) {
            return m2045a(locale);
        }
        if (scriptSubtag.equalsIgnoreCase("Arab") || scriptSubtag.equalsIgnoreCase("Hebr")) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m2045a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
