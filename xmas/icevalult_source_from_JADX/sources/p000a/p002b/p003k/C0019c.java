package p000a.p002b.p003k;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p011p.C0130b1;
import p000a.p025h.p026d.C0326a;
import p000a.p025h.p026d.C0335e;
import p000a.p025h.p026d.C0337g;
import p000a.p046k.p047a.C0520d;

/* renamed from: a.b.k.c */
public class C0019c extends C0520d implements C0020d, C0337g.C0338a {

    /* renamed from: q */
    public C0021e f242q;

    /* renamed from: r */
    public Resources f243r;

    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        mo79u().mo90d(newBase);
    }

    public void onCreate(Bundle savedInstanceState) {
        C0021e delegate = mo79u();
        delegate.mo95l();
        delegate.mo98q(savedInstanceState);
        super.onCreate(savedInstanceState);
    }

    public void setTheme(int resId) {
        super.setTheme(resId);
        mo79u().mo87C(resId);
    }

    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mo79u().mo100s(savedInstanceState);
    }

    /* renamed from: v */
    public C0013a mo80v() {
        return mo79u().mo94k();
    }

    public MenuInflater getMenuInflater() {
        return mo79u().mo93j();
    }

    public void setContentView(int layoutResID) {
        mo79u().mo106z(layoutResID);
    }

    public void setContentView(View view) {
        mo79u().mo85A(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        mo79u().mo86B(view, params);
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        mo79u().mo89c(view, params);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.f243r != null) {
            this.f243r.updateConfiguration(newConfig, super.getResources().getDisplayMetrics());
        }
        mo79u().mo97p(newConfig);
    }

    public void onPostResume() {
        super.onPostResume();
        mo79u().mo101t();
    }

    public void onStart() {
        super.onStart();
        mo79u().mo103v();
    }

    public void onStop() {
        super.onStop();
        mo79u().mo104w();
    }

    public <T extends View> T findViewById(int id) {
        return mo79u().mo91g(id);
    }

    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        C0013a ab = mo80v();
        if (item.getItemId() != 16908332 || ab == null || (ab.mo12j() & 4) == 0) {
            return false;
        }
        return mo43A();
    }

    public void onDestroy() {
        super.onDestroy();
        mo79u().mo99r();
    }

    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        mo79u().mo88D(title);
    }

    /* renamed from: t */
    public void mo78t() {
        mo79u().mo96m();
    }

    public void invalidateOptionsMenu() {
        mo79u().mo96m();
    }

    /* renamed from: b */
    public void mo49b(C0073b mode) {
    }

    /* renamed from: f */
    public void mo52f(C0073b mode) {
    }

    /* renamed from: g */
    public C0073b mo54g(C0073b.C0074a callback) {
        return null;
    }

    /* renamed from: w */
    public void mo81w(C0337g builder) {
        builder.mo2233b(this);
    }

    /* renamed from: y */
    public void mo83y(C0337g builder) {
    }

    /* renamed from: A */
    public boolean mo43A() {
        Intent upIntent = mo57i();
        if (upIntent == null) {
            return false;
        }
        if (mo46D(upIntent)) {
            C0337g b = C0337g.m1768d(this);
            mo81w(b);
            mo83y(b);
            b.mo2235e();
            try {
                C0326a.m1743e(this);
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        } else {
            mo45C(upIntent);
            return true;
        }
    }

    /* renamed from: i */
    public Intent mo57i() {
        return C0335e.m1759a(this);
    }

    /* renamed from: D */
    public boolean mo46D(Intent targetIntent) {
        return C0335e.m1764f(this, targetIntent);
    }

    /* renamed from: C */
    public void mo45C(Intent upIntent) {
        C0335e.m1763e(this, upIntent);
    }

    public void onContentChanged() {
        mo84z();
    }

    @Deprecated
    /* renamed from: z */
    public void mo84z() {
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mo79u().mo102u(outState);
    }

    /* renamed from: u */
    public C0021e mo79u() {
        if (this.f242q == null) {
            this.f242q = C0021e.m56e(this, this);
        }
        return this.f242q;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        C0013a actionBar = mo80v();
        if (keyCode != 82 || actionBar == null || !actionBar.mo18p(event)) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    public Resources getResources() {
        if (this.f243r == null && C0130b1.m737b()) {
            this.f243r = new C0130b1(this, super.getResources());
        }
        Resources resources = this.f243r;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: B */
    public final boolean mo44B(int keycode, KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null || !currentWindow.getDecorView().dispatchKeyShortcutEvent(event)) {
            return false;
        }
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (mo44B(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void openOptionsMenu() {
        C0013a actionBar = mo80v();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.mo19q()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        C0013a actionBar = mo80v();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (actionBar == null || !actionBar.mo9g()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: x */
    public void mo82x(int mode) {
    }
}
