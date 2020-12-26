package p000a.p002b.p009o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.b.o.b */
public abstract class C0073b {

    /* renamed from: b */
    public Object f492b;

    /* renamed from: c */
    public boolean f493c;

    /* renamed from: a.b.o.b$a */
    public interface C0074a {
        /* renamed from: a */
        boolean mo180a(C0073b bVar, Menu menu);

        /* renamed from: b */
        void mo181b(C0073b bVar);

        /* renamed from: c */
        boolean mo182c(C0073b bVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo183d(C0073b bVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo252c();

    /* renamed from: d */
    public abstract View mo253d();

    /* renamed from: e */
    public abstract Menu mo254e();

    /* renamed from: f */
    public abstract MenuInflater mo255f();

    /* renamed from: g */
    public abstract CharSequence mo256g();

    /* renamed from: i */
    public abstract CharSequence mo257i();

    /* renamed from: k */
    public abstract void mo258k();

    /* renamed from: l */
    public abstract boolean mo259l();

    /* renamed from: m */
    public abstract void mo260m(View view);

    /* renamed from: n */
    public abstract void mo261n(int i);

    /* renamed from: o */
    public abstract void mo262o(CharSequence charSequence);

    /* renamed from: q */
    public abstract void mo263q(int i);

    /* renamed from: r */
    public abstract void mo264r(CharSequence charSequence);

    /* renamed from: p */
    public void mo414p(Object tag) {
        this.f492b = tag;
    }

    /* renamed from: h */
    public Object mo412h() {
        return this.f492b;
    }

    /* renamed from: s */
    public void mo265s(boolean titleOptional) {
        this.f493c = titleOptional;
    }

    /* renamed from: j */
    public boolean mo413j() {
        return this.f493c;
    }
}
