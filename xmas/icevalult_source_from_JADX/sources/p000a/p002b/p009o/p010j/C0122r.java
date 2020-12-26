package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p002b.p009o.p010j.C0098g;

/* renamed from: a.b.o.j.r */
public class C0122r extends C0098g implements SubMenu {

    /* renamed from: B */
    public C0098g f757B;

    /* renamed from: C */
    public C0102i f758C;

    public C0122r(Context context, C0098g parentMenu, C0102i item) {
        super(context);
        this.f757B = parentMenu;
        this.f758C = item;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f757B.setQwertyMode(isQwerty);
    }

    /* renamed from: G */
    public boolean mo620G() {
        return this.f757B.mo620G();
    }

    /* renamed from: H */
    public boolean mo621H() {
        return this.f757B.mo621H();
    }

    /* renamed from: e0 */
    public Menu mo881e0() {
        return this.f757B;
    }

    public MenuItem getItem() {
        return this.f758C;
    }

    /* renamed from: R */
    public void mo631R(C0098g.C0099a callback) {
        this.f757B.mo631R(callback);
    }

    /* renamed from: D */
    public C0098g mo617D() {
        return this.f757B.mo617D();
    }

    /* renamed from: h */
    public boolean mo665h(C0098g menu, MenuItem item) {
        return super.mo665h(menu, item) || this.f757B.mo665h(menu, item);
    }

    public SubMenu setIcon(Drawable icon) {
        this.f758C.setIcon(icon);
        return this;
    }

    public SubMenu setIcon(int iconRes) {
        this.f758C.setIcon(iconRes);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable icon) {
        super.mo635V(icon);
        return this;
    }

    public SubMenu setHeaderIcon(int iconRes) {
        super.mo634U(iconRes);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence title) {
        super.mo638Y(title);
        return this;
    }

    public SubMenu setHeaderTitle(int titleRes) {
        super.mo637X(titleRes);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo639Z(view);
        return this;
    }

    /* renamed from: k */
    public boolean mo670k(C0102i item) {
        return this.f757B.mo670k(item);
    }

    /* renamed from: f */
    public boolean mo661f(C0102i item) {
        return this.f757B.mo661f(item);
    }

    /* renamed from: t */
    public String mo688t() {
        C0102i iVar = this.f758C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo688t() + ":" + itemId;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.f757B.setGroupDividerEnabled(groupDividerEnabled);
    }

    /* renamed from: F */
    public boolean mo619F() {
        return this.f757B.mo619F();
    }
}
