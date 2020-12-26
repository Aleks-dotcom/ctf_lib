package p000a.p025h.p029f;

import android.graphics.Color;

/* renamed from: a.h.f.a */
public final class C0356a {
    static {
        new ThreadLocal();
    }

    /* renamed from: b */
    public static int m1847b(int foreground, int background) {
        int bgAlpha = Color.alpha(background);
        int fgAlpha = Color.alpha(foreground);
        int a = m1846a(fgAlpha, bgAlpha);
        return Color.argb(a, m1848c(Color.red(foreground), fgAlpha, Color.red(background), bgAlpha, a), m1848c(Color.green(foreground), fgAlpha, Color.green(background), bgAlpha, a), m1848c(Color.blue(foreground), fgAlpha, Color.blue(background), bgAlpha, a));
    }

    /* renamed from: a */
    public static int m1846a(int foregroundAlpha, int backgroundAlpha) {
        return 255 - (((255 - backgroundAlpha) * (255 - foregroundAlpha)) / 255);
    }

    /* renamed from: c */
    public static int m1848c(int fgC, int fgA, int bgC, int bgA, int a) {
        if (a == 0) {
            return 0;
        }
        return (((fgC * 255) * fgA) + ((bgC * bgA) * (255 - fgA))) / (a * 255);
    }

    /* renamed from: d */
    public static int m1849d(int color, int alpha) {
        if (alpha >= 0 && alpha <= 255) {
            return (16777215 & color) | (alpha << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
