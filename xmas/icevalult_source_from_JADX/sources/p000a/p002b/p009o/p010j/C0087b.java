package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0115n;

/* renamed from: a.b.o.j.b */
public abstract class C0087b implements C0113m {

    /* renamed from: b */
    public Context f581b;

    /* renamed from: c */
    public Context f582c;

    /* renamed from: d */
    public C0098g f583d;

    /* renamed from: e */
    public LayoutInflater f584e;

    /* renamed from: f */
    public C0113m.C0114a f585f;

    /* renamed from: g */
    public int f586g;

    /* renamed from: h */
    public int f587h;

    /* renamed from: i */
    public C0115n f588i;

    /* renamed from: f */
    public abstract void mo550f(C0102i iVar, C0115n.C0116a aVar);

    /* renamed from: q */
    public abstract boolean mo560q(int i, C0102i iVar);

    public C0087b(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f581b = context;
        this.f584e = LayoutInflater.from(context);
        this.f586g = menuLayoutRes;
        this.f587h = itemLayoutRes;
    }

    /* renamed from: i */
    public void mo552i(Context context, C0098g menu) {
        this.f582c = context;
        LayoutInflater.from(context);
        this.f583d = menu;
    }

    /* renamed from: o */
    public C0115n mo558o(ViewGroup root) {
        if (this.f588i == null) {
            C0115n nVar = (C0115n) this.f584e.inflate(this.f586g, root, false);
            this.f588i = nVar;
            nVar.mo847d(this.f583d);
            mo551h(true);
        }
        return this.f588i;
    }

    /* renamed from: h */
    public void mo551h(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.f588i;
        if (parent != null) {
            int childIndex = 0;
            C0098g gVar = this.f583d;
            if (gVar != null) {
                gVar.mo678r();
                ArrayList<C0102i> E = this.f583d.mo618E();
                int itemCount = E.size();
                for (int i = 0; i < itemCount; i++) {
                    C0102i item = E.get(i);
                    if (mo560q(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        C0102i oldItem = convertView instanceof C0115n.C0116a ? ((C0115n.C0116a) convertView).getItemData() : null;
                        View itemView = mo557n(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            mo545a(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!mo555l(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo545a(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.f588i).addView(itemView, childIndex);
    }

    /* renamed from: l */
    public boolean mo555l(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    /* renamed from: d */
    public void mo548d(C0113m.C0114a cb) {
        this.f585f = cb;
    }

    /* renamed from: m */
    public C0113m.C0114a mo556m() {
        return this.f585f;
    }

    /* renamed from: j */
    public C0115n.C0116a mo553j(ViewGroup parent) {
        return (C0115n.C0116a) this.f584e.inflate(this.f587h, parent, false);
    }

    /* renamed from: n */
    public View mo557n(C0102i item, View convertView, ViewGroup parent) {
        C0115n.C0116a itemView;
        if (convertView instanceof C0115n.C0116a) {
            itemView = (C0115n.C0116a) convertView;
        } else {
            itemView = mo553j(parent);
        }
        mo550f(item, itemView);
        return (View) itemView;
    }

    /* renamed from: b */
    public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        C0113m.C0114a aVar = this.f585f;
        if (aVar != null) {
            aVar.mo178b(menu, allMenusAreClosing);
        }
    }

    /* renamed from: e */
    public boolean mo549e(C0122r menu) {
        C0113m.C0114a aVar = this.f585f;
        if (aVar != null) {
            return aVar.mo179c(menu);
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo547c(C0098g menu, C0102i item) {
        return false;
    }

    /* renamed from: k */
    public boolean mo554k(C0098g menu, C0102i item) {
        return false;
    }

    /* renamed from: p */
    public void mo559p(int id) {
    }
}
