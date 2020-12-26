package p000a.p002b.p009o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p009o.p010j.C0104j;
import p000a.p002b.p009o.p010j.C0117o;
import p000a.p018e.C0269g;
import p000a.p025h.p031g.p032a.C0376a;
import p000a.p025h.p031g.p032a.C0377b;

/* renamed from: a.b.o.f */
public class C0078f extends ActionMode {

    /* renamed from: a */
    public final Context f505a;

    /* renamed from: b */
    public final C0073b f506b;

    public C0078f(Context context, C0073b supportActionMode) {
        this.f505a = context;
        this.f506b = supportActionMode;
    }

    public Object getTag() {
        return this.f506b.mo412h();
    }

    public void setTag(Object tag) {
        this.f506b.mo414p(tag);
    }

    public void setTitle(CharSequence title) {
        this.f506b.mo264r(title);
    }

    public void setSubtitle(CharSequence subtitle) {
        this.f506b.mo262o(subtitle);
    }

    public void invalidate() {
        this.f506b.mo258k();
    }

    public void finish() {
        this.f506b.mo252c();
    }

    public Menu getMenu() {
        return new C0117o(this.f505a, (C0376a) this.f506b.mo254e());
    }

    public CharSequence getTitle() {
        return this.f506b.mo257i();
    }

    public void setTitle(int resId) {
        this.f506b.mo263q(resId);
    }

    public CharSequence getSubtitle() {
        return this.f506b.mo256g();
    }

    public void setSubtitle(int resId) {
        this.f506b.mo261n(resId);
    }

    public View getCustomView() {
        return this.f506b.mo253d();
    }

    public void setCustomView(View view) {
        this.f506b.mo260m(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f506b.mo255f();
    }

    public boolean getTitleOptionalHint() {
        return this.f506b.mo413j();
    }

    public void setTitleOptionalHint(boolean titleOptional) {
        this.f506b.mo265s(titleOptional);
    }

    public boolean isTitleOptional() {
        return this.f506b.mo259l();
    }

    /* renamed from: a.b.o.f$a */
    public static class C0079a implements C0073b.C0074a {

        /* renamed from: a */
        public final ActionMode.Callback f507a;

        /* renamed from: b */
        public final Context f508b;

        /* renamed from: c */
        public final ArrayList<C0078f> f509c = new ArrayList<>();

        /* renamed from: d */
        public final C0269g<Menu, Menu> f510d = new C0269g<>();

        public C0079a(Context context, ActionMode.Callback supportCallback) {
            this.f508b = context;
            this.f507a = supportCallback;
        }

        /* renamed from: d */
        public boolean mo183d(C0073b mode, Menu menu) {
            return this.f507a.onCreateActionMode(mo444e(mode), mo445f(menu));
        }

        /* renamed from: a */
        public boolean mo180a(C0073b mode, Menu menu) {
            return this.f507a.onPrepareActionMode(mo444e(mode), mo445f(menu));
        }

        /* renamed from: c */
        public boolean mo182c(C0073b mode, MenuItem item) {
            return this.f507a.onActionItemClicked(mo444e(mode), new C0104j(this.f508b, (C0377b) item));
        }

        /* renamed from: b */
        public void mo181b(C0073b mode) {
            this.f507a.onDestroyActionMode(mo444e(mode));
        }

        /* renamed from: f */
        public final Menu mo445f(Menu menu) {
            Menu wrapper = this.f510d.get(menu);
            if (wrapper != null) {
                return wrapper;
            }
            Menu wrapper2 = new C0117o(this.f508b, (C0376a) menu);
            this.f510d.put(menu, wrapper2);
            return wrapper2;
        }

        /* renamed from: e */
        public ActionMode mo444e(C0073b mode) {
            int count = this.f509c.size();
            for (int i = 0; i < count; i++) {
                C0078f wrapper = this.f509c.get(i);
                if (wrapper != null && wrapper.f506b == mode) {
                    return wrapper;
                }
            }
            C0078f wrapper2 = new C0078f(this.f508b, mode);
            this.f509c.add(wrapper2);
            return wrapper2;
        }
    }
}
