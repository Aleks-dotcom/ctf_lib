package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p025h.p031g.p032a.C0378c;

/* renamed from: a.b.o.j.s */
public class C0123s extends C0117o implements SubMenu {

    /* renamed from: e */
    public final C0378c f759e;

    public C0123s(Context context, C0378c subMenu) {
        super(context, subMenu);
        this.f759e = subMenu;
    }

    public SubMenu setHeaderTitle(int titleRes) {
        this.f759e.setHeaderTitle(titleRes);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence title) {
        this.f759e.setHeaderTitle(title);
        return this;
    }

    public SubMenu setHeaderIcon(int iconRes) {
        this.f759e.setHeaderIcon(iconRes);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable icon) {
        this.f759e.setHeaderIcon(icon);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f759e.setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        this.f759e.clearHeader();
    }

    public SubMenu setIcon(int iconRes) {
        this.f759e.setIcon(iconRes);
        return this;
    }

    public SubMenu setIcon(Drawable icon) {
        this.f759e.setIcon(icon);
        return this;
    }

    public MenuItem getItem() {
        return mo561c(this.f759e.getItem());
    }
}
