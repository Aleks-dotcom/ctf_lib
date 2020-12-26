package p000a.p002b.p009o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p009o.p010j.C0098g;

/* renamed from: a.b.o.e */
public class C0077e extends C0073b implements C0098g.C0099a {

    /* renamed from: d */
    public Context f499d;

    /* renamed from: e */
    public ActionBarContextView f500e;

    /* renamed from: f */
    public C0073b.C0074a f501f;

    /* renamed from: g */
    public WeakReference<View> f502g;

    /* renamed from: h */
    public boolean f503h;

    /* renamed from: i */
    public C0098g f504i;

    public C0077e(Context context, ActionBarContextView view, C0073b.C0074a callback, boolean isFocusable) {
        this.f499d = context;
        this.f500e = view;
        this.f501f = callback;
        C0098g gVar = new C0098g(view.getContext());
        gVar.mo632S(1);
        this.f504i = gVar;
        gVar.mo631R(this);
    }

    /* renamed from: r */
    public void mo264r(CharSequence title) {
        this.f500e.setTitle(title);
    }

    /* renamed from: o */
    public void mo262o(CharSequence subtitle) {
        this.f500e.setSubtitle(subtitle);
    }

    /* renamed from: q */
    public void mo263q(int resId) {
        mo264r(this.f499d.getString(resId));
    }

    /* renamed from: n */
    public void mo261n(int resId) {
        mo262o(this.f499d.getString(resId));
    }

    /* renamed from: s */
    public void mo265s(boolean titleOptional) {
        super.mo265s(titleOptional);
        this.f500e.setTitleOptional(titleOptional);
    }

    /* renamed from: l */
    public boolean mo259l() {
        return this.f500e.mo3951j();
    }

    /* renamed from: m */
    public void mo260m(View view) {
        this.f500e.setCustomView(view);
        this.f502g = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: k */
    public void mo258k() {
        this.f501f.mo180a(this, this.f504i);
    }

    /* renamed from: c */
    public void mo252c() {
        if (!this.f503h) {
            this.f503h = true;
            this.f500e.sendAccessibilityEvent(32);
            this.f501f.mo181b(this);
        }
    }

    /* renamed from: e */
    public Menu mo254e() {
        return this.f504i;
    }

    /* renamed from: i */
    public CharSequence mo257i() {
        return this.f500e.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo256g() {
        return this.f500e.getSubtitle();
    }

    /* renamed from: d */
    public View mo253d() {
        WeakReference<View> weakReference = this.f502g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: f */
    public MenuInflater mo255f() {
        return new C0080g(this.f500e.getContext());
    }

    /* renamed from: b */
    public boolean mo140b(C0098g menu, MenuItem item) {
        return this.f501f.mo182c(this, item);
    }

    /* renamed from: a */
    public void mo138a(C0098g menu) {
        mo258k();
        this.f500e.mo3953l();
    }
}
