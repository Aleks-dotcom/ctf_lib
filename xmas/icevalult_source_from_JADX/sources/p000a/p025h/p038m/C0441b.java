package p000a.p025h.p038m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.h.m.b */
public abstract class C0441b {

    /* renamed from: a */
    public C0443b f2011a;

    /* renamed from: a.h.m.b$a */
    public interface C0442a {
    }

    /* renamed from: a.h.m.b$b */
    public interface C0443b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    /* renamed from: c */
    public abstract View mo817c();

    public C0441b(Context context) {
    }

    /* renamed from: d */
    public View mo821d(MenuItem forItem) {
        return mo817c();
    }

    /* renamed from: g */
    public boolean mo822g() {
        return false;
    }

    /* renamed from: b */
    public boolean mo820b() {
        return true;
    }

    /* renamed from: e */
    public boolean mo818e() {
        return false;
    }

    /* renamed from: a */
    public boolean mo816a() {
        return false;
    }

    /* renamed from: f */
    public void mo819f(SubMenu subMenu) {
    }

    /* renamed from: i */
    public void mo2524i(C0442a listener) {
    }

    /* renamed from: j */
    public void mo823j(C0443b listener) {
        if (!(this.f2011a == null || listener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2011a = listener;
    }

    /* renamed from: h */
    public void mo2523h() {
        this.f2011a = null;
    }
}
