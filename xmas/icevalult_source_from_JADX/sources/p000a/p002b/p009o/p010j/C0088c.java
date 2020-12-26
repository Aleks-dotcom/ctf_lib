package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p018e.C0256a;
import p000a.p025h.p031g.p032a.C0377b;
import p000a.p025h.p031g.p032a.C0378c;

/* renamed from: a.b.o.j.c */
public abstract class C0088c {

    /* renamed from: a */
    public final Context f589a;

    /* renamed from: b */
    public Map<C0377b, MenuItem> f590b;

    /* renamed from: c */
    public Map<C0378c, SubMenu> f591c;

    public C0088c(Context context) {
        this.f589a = context;
    }

    /* renamed from: c */
    public final MenuItem mo561c(MenuItem menuItem) {
        if (!(menuItem instanceof C0377b)) {
            return menuItem;
        }
        C0377b supportMenuItem = (C0377b) menuItem;
        if (this.f590b == null) {
            this.f590b = new C0256a();
        }
        MenuItem wrappedItem = this.f590b.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = new C0104j(this.f589a, supportMenuItem);
        this.f590b.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    /* renamed from: d */
    public final SubMenu mo562d(SubMenu subMenu) {
        if (!(subMenu instanceof C0378c)) {
            return subMenu;
        }
        C0378c supportSubMenu = (C0378c) subMenu;
        if (this.f591c == null) {
            this.f591c = new C0256a();
        }
        SubMenu wrappedMenu = this.f591c.get(supportSubMenu);
        if (wrappedMenu != null) {
            return wrappedMenu;
        }
        SubMenu wrappedMenu2 = new C0123s(this.f589a, supportSubMenu);
        this.f591c.put(supportSubMenu, wrappedMenu2);
        return wrappedMenu2;
    }

    /* renamed from: e */
    public final void mo563e() {
        Map<C0377b, MenuItem> map = this.f590b;
        if (map != null) {
            map.clear();
        }
        Map<C0378c, SubMenu> map2 = this.f591c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* renamed from: f */
    public final void mo564f(int groupId) {
        Map<C0377b, MenuItem> map = this.f590b;
        if (map != null) {
            Iterator<C0377b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (groupId == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo565g(int id) {
        Map<C0377b, MenuItem> map = this.f590b;
        if (map != null) {
            Iterator<C0377b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (id == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
