package p000a.p025h.p029f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p025h.p027e.p028c.C0343c;
import p000a.p025h.p035j.C0382b;

/* renamed from: a.h.f.h */
public class C0365h {

    /* renamed from: a */
    public ConcurrentHashMap<Long, C0343c.C0345b> f1877a = new ConcurrentHashMap<>();

    /* renamed from: a.h.f.h$c */
    public interface C0368c<T> {
        /* renamed from: a */
        int mo2282a(T t);

        /* renamed from: b */
        boolean mo2283b(T t);
    }

    /* renamed from: g */
    public static <T> T m1904g(T[] fonts, int style, C0368c<T> extractor) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        T best = null;
        int bestScore = Integer.MAX_VALUE;
        for (T font : fonts) {
            int score = (Math.abs(extractor.mo2282a(font) - targetWeight) * 2) + (extractor.mo2283b(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    /* renamed from: j */
    public static long m1905j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field field = Typeface.class.getDeclaredField("native_instance");
            field.setAccessible(true);
            return ((Number) field.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: a.h.f.h$a */
    public class C0366a implements C0368c<C0382b.C0388f> {
        public C0366a(C0365h this$0) {
        }

        /* renamed from: c */
        public int mo2282a(C0382b.C0388f info) {
            return info.mo2355d();
        }

        /* renamed from: d */
        public boolean mo2283b(C0382b.C0388f info) {
            return info.mo2356e();
        }
    }

    /* renamed from: h */
    public C0382b.C0388f mo2280h(C0382b.C0388f[] fonts, int style) {
        return (C0382b.C0388f) m1904g(fonts, style, new C0366a(this));
    }

    /* renamed from: d */
    public Typeface mo2278d(Context context, InputStream is) {
        File tmpFile = C0369i.m1928e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!C0369i.m1927d(tmpFile, is)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: c */
    public Typeface mo2261c(Context context, CancellationSignal cancellationSignal, C0382b.C0388f[] fonts, int style) {
        if (fonts.length < 1) {
            return null;
        }
        InputStream is = null;
        try {
            is = context.getContentResolver().openInputStream(mo2280h(fonts, style).mo2354c());
            return mo2278d(context, is);
        } catch (IOException e) {
            return null;
        } finally {
            C0369i.m1924a(is);
        }
    }

    /* renamed from: a.h.f.h$b */
    public class C0367b implements C0368c<C0343c.C0346c> {
        public C0367b(C0365h this$0) {
        }

        /* renamed from: c */
        public int mo2282a(C0343c.C0346c entry) {
            return entry.mo2250e();
        }

        /* renamed from: d */
        public boolean mo2283b(C0343c.C0346c entry) {
            return entry.mo2251f();
        }
    }

    /* renamed from: f */
    public final C0343c.C0346c mo2279f(C0343c.C0345b entry, int style) {
        return (C0343c.C0346c) m1904g(entry.mo2245a(), style, new C0367b(this));
    }

    /* renamed from: b */
    public Typeface mo2260b(Context context, C0343c.C0345b entry, Resources resources, int style) {
        C0343c.C0346c best = mo2279f(entry, style);
        if (best == null) {
            return null;
        }
        Typeface typeface = C0360c.m1868d(context, resources, best.mo2247b(), best.mo2246a(), style);
        mo2277a(typeface, entry);
        return typeface;
    }

    /* renamed from: e */
    public Typeface mo2264e(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = C0369i.m1928e(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!C0369i.m1926c(tmpFile, resources, id)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: i */
    public C0343c.C0345b mo2281i(Typeface typeface) {
        long key = m1905j(typeface);
        if (key == 0) {
            return null;
        }
        return this.f1877a.get(Long.valueOf(key));
    }

    /* renamed from: a */
    public final void mo2277a(Typeface typeface, C0343c.C0345b entry) {
        long key = m1905j(typeface);
        if (key != 0) {
            this.f1877a.put(Long.valueOf(key), entry);
        }
    }
}
