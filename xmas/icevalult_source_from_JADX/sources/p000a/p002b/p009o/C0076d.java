package p000a.p002b.p009o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p000a.p002b.C0011i;

/* renamed from: a.b.o.d */
public class C0076d extends ContextWrapper {

    /* renamed from: a */
    public int f494a;

    /* renamed from: b */
    public Resources.Theme f495b;

    /* renamed from: c */
    public LayoutInflater f496c;

    /* renamed from: d */
    public Configuration f497d;

    /* renamed from: e */
    public Resources f498e;

    public C0076d() {
        super((Context) null);
    }

    public C0076d(Context base, int themeResId) {
        super(base);
        this.f494a = themeResId;
    }

    public C0076d(Context base, Resources.Theme theme) {
        super(base);
        this.f495b = theme;
    }

    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public Resources getResources() {
        return mo417a();
    }

    /* renamed from: a */
    public final Resources mo417a() {
        if (this.f498e == null) {
            Configuration configuration = this.f497d;
            if (configuration == null) {
                this.f498e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f498e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f498e;
    }

    public void setTheme(int resid) {
        if (this.f494a != resid) {
            this.f494a = resid;
            mo420c();
        }
    }

    /* renamed from: b */
    public int mo419b() {
        return this.f494a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f495b;
        if (theme != null) {
            return theme;
        }
        if (this.f494a == 0) {
            this.f494a = C0011i.Theme_AppCompat_Light;
        }
        mo420c();
        return this.f495b;
    }

    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f496c == null) {
            this.f496c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f496c;
    }

    /* renamed from: d */
    public void mo421d(Resources.Theme theme, int resid, boolean first) {
        theme.applyStyle(resid, true);
    }

    /* renamed from: c */
    public final void mo420c() {
        boolean first = this.f495b == null;
        if (first) {
            this.f495b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f495b.setTo(theme);
            }
        }
        mo421d(this.f495b, this.f494a, first);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
