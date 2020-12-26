package p000a.p002b.p003k;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p002b.C0003a;
import p000a.p002b.p009o.C0073b;
import p000a.p025h.p038m.C0445d;

/* renamed from: a.b.k.g */
public class C0042g extends Dialog implements C0020d {

    /* renamed from: b */
    public C0021e f342b;

    /* renamed from: c */
    public final C0445d.C0446a f343c = new C0043a();

    /* renamed from: a.b.k.g$a */
    public class C0043a implements C0445d.C0446a {
        public C0043a() {
        }

        /* renamed from: h */
        public boolean mo221h(KeyEvent event) {
            return C0042g.this.mo211d(event);
        }
    }

    public C0042g(Context context, int theme) {
        super(context, m199c(context, theme));
        C0021e delegate = mo209a();
        delegate.mo87C(m199c(context, theme));
        delegate.mo98q((Bundle) null);
    }

    public void onCreate(Bundle savedInstanceState) {
        mo209a().mo95l();
        super.onCreate(savedInstanceState);
        mo209a().mo98q(savedInstanceState);
    }

    public void setContentView(int layoutResID) {
        mo209a().mo106z(layoutResID);
    }

    public void setContentView(View view) {
        mo209a().mo85A(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        mo209a().mo86B(view, params);
    }

    public <T extends View> T findViewById(int id) {
        return mo209a().mo91g(id);
    }

    public void setTitle(CharSequence title) {
        super.setTitle(title);
        mo209a().mo88D(title);
    }

    public void setTitle(int titleId) {
        super.setTitle(titleId);
        mo209a().mo88D(getContext().getString(titleId));
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        mo209a().mo89c(view, params);
    }

    public void onStop() {
        super.onStop();
        mo209a().mo104w();
    }

    /* renamed from: e */
    public boolean mo213e(int featureId) {
        return mo209a().mo105y(featureId);
    }

    public void invalidateOptionsMenu() {
        mo209a().mo96m();
    }

    /* renamed from: a */
    public C0021e mo209a() {
        if (this.f342b == null) {
            this.f342b = C0021e.m57f(this, this);
        }
        return this.f342b;
    }

    /* renamed from: c */
    public static int m199c(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0003a.dialogTheme, outValue, true);
        return outValue.resourceId;
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

    /* renamed from: d */
    public boolean mo211d(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return C0445d.m2179e(this.f343c, getWindow().getDecorView(), this, event);
    }
}
