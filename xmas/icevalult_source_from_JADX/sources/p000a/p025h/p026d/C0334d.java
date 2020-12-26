package p000a.p025h.p026d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p000a.p018e.C0269g;
import p000a.p025h.p038m.C0445d;
import p000a.p051m.C0577d;
import p000a.p051m.C0582g;
import p000a.p051m.C0583h;
import p000a.p051m.C0592o;

/* renamed from: a.h.d.d */
public class C0334d extends Activity implements C0582g, C0445d.C0446a {

    /* renamed from: b */
    public C0583h f1831b = new C0583h(this);

    public C0334d() {
        new C0269g();
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C0592o.m2952e(this);
    }

    public void onSaveInstanceState(Bundle outState) {
        this.f1831b.mo3109k(C0577d.C0579b.CREATED);
        super.onSaveInstanceState(outState);
    }

    /* renamed from: h */
    public boolean mo221h(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !C0445d.m2178d(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !C0445d.m2178d(decor, event)) {
            return C0445d.m2179e(this, decor, this, event);
        }
        return true;
    }
}
