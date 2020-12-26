package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: a.b.p.b1 */
public class C0130b1 extends Resources {

    /* renamed from: b */
    public static boolean f793b = false;

    /* renamed from: a */
    public final WeakReference<Context> f794a;

    /* renamed from: b */
    public static boolean m737b() {
        return m736a() && Build.VERSION.SDK_INT <= 20;
    }

    public C0130b1(Context context, Resources res) {
        super(res.getAssets(), res.getDisplayMetrics(), res.getConfiguration());
        this.f794a = new WeakReference<>(context);
    }

    public Drawable getDrawable(int id) {
        Context context = (Context) this.f794a.get();
        if (context != null) {
            return C0176m0.m948h().mo1261t(context, this, id);
        }
        return super.getDrawable(id);
    }

    /* renamed from: c */
    public final Drawable mo947c(int id) {
        return super.getDrawable(id);
    }

    /* renamed from: a */
    public static boolean m736a() {
        return f793b;
    }
}
