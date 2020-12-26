package p000a.p002b.p011p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.appcompat.widget.TintContextWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: a.b.p.t0 */
public class C0201t0 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f1035c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<C0201t0>> f1036d;

    /* renamed from: a */
    public final Resources f1037a;

    /* renamed from: b */
    public final Resources.Theme f1038b;

    /* renamed from: b */
    public static Context m1044b(Context context) {
        if (!m1043a(context)) {
            return context;
        }
        synchronized (f1035c) {
            ArrayList<WeakReference<C0201t0>> arrayList = f1036d;
            if (arrayList == null) {
                f1036d = new ArrayList<>();
            } else {
                for (int i = arrayList.size() - 1; i >= 0; i--) {
                    WeakReference<TintContextWrapper> ref = f1036d.get(i);
                    if (ref == null || ref.get() == null) {
                        f1036d.remove(i);
                    }
                }
                for (int i2 = f1036d.size() - 1; i2 >= 0; i2--) {
                    WeakReference<TintContextWrapper> ref2 = f1036d.get(i2);
                    C0201t0 wrapper = ref2 != null ? (C0201t0) ref2.get() : null;
                    if (wrapper != null && wrapper.getBaseContext() == context) {
                        return wrapper;
                    }
                }
            }
            C0201t0 wrapper2 = new C0201t0(context);
            f1036d.add(new WeakReference(wrapper2));
            return wrapper2;
        }
    }

    /* renamed from: a */
    public static boolean m1043a(Context context) {
        if ((context instanceof C0201t0) || (context.getResources() instanceof C0205v0) || (context.getResources() instanceof C0130b1)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0130b1.m737b()) {
            return true;
        }
        return false;
    }

    public C0201t0(Context base) {
        super(base);
        if (C0130b1.m737b()) {
            C0130b1 b1Var = new C0130b1(this, base.getResources());
            this.f1037a = b1Var;
            Resources.Theme newTheme = b1Var.newTheme();
            this.f1038b = newTheme;
            newTheme.setTo(base.getTheme());
            return;
        }
        this.f1037a = new C0205v0(this, base.getResources());
        this.f1038b = null;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1038b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int resid) {
        Resources.Theme theme = this.f1038b;
        if (theme == null) {
            super.setTheme(resid);
        } else {
            theme.applyStyle(resid, true);
        }
    }

    public Resources getResources() {
        return this.f1037a;
    }

    public AssetManager getAssets() {
        return this.f1037a.getAssets();
    }
}
