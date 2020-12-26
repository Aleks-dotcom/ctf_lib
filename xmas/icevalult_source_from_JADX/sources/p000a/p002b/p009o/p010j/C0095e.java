package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;
import p000a.p002b.C0009g;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0115n;

/* renamed from: a.b.o.j.e */
public class C0095e implements C0113m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f629b;

    /* renamed from: c */
    public LayoutInflater f630c;

    /* renamed from: d */
    public C0098g f631d;

    /* renamed from: e */
    public ExpandedMenuView f632e;

    /* renamed from: f */
    public int f633f;

    /* renamed from: g */
    public int f634g;

    /* renamed from: h */
    public int f635h;

    /* renamed from: i */
    public C0113m.C0114a f636i;

    /* renamed from: j */
    public C0096a f637j;

    public C0095e(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f629b = context;
        this.f630c = LayoutInflater.from(context);
    }

    public C0095e(int itemLayoutRes, int themeRes) {
        this.f635h = itemLayoutRes;
        this.f634g = themeRes;
    }

    /* renamed from: i */
    public void mo552i(Context context, C0098g menu) {
        if (this.f634g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f634g);
            this.f629b = contextThemeWrapper;
            this.f630c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f629b != null) {
            this.f629b = context;
            if (this.f630c == null) {
                this.f630c = LayoutInflater.from(context);
            }
        }
        this.f631d = menu;
        C0096a aVar = this.f637j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: f */
    public C0115n mo597f(ViewGroup root) {
        if (this.f632e == null) {
            this.f632e = (ExpandedMenuView) this.f630c.inflate(C0009g.abc_expanded_menu_layout, root, false);
            if (this.f637j == null) {
                this.f637j = new C0096a();
            }
            this.f632e.setAdapter(this.f637j);
            this.f632e.setOnItemClickListener(this);
        }
        return this.f632e;
    }

    /* renamed from: a */
    public ListAdapter mo596a() {
        if (this.f637j == null) {
            this.f637j = new C0096a();
        }
        return this.f637j;
    }

    /* renamed from: h */
    public void mo551h(boolean cleared) {
        C0096a aVar = this.f637j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public void mo548d(C0113m.C0114a cb) {
        this.f636i = cb;
    }

    /* renamed from: e */
    public boolean mo549e(C0122r subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new C0101h(subMenu).mo697d((IBinder) null);
        C0113m.C0114a aVar = this.f636i;
        if (aVar == null) {
            return true;
        }
        aVar.mo179c(subMenu);
        return true;
    }

    /* renamed from: b */
    public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        C0113m.C0114a aVar = this.f636i;
        if (aVar != null) {
            aVar.mo178b(menu, allMenusAreClosing);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f631d.mo626M(this.f637j.getItem(position), this, 0);
    }

    /* renamed from: g */
    public boolean mo575g() {
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

    /* renamed from: a.b.o.j.e$a */
    public class C0096a extends BaseAdapter {

        /* renamed from: b */
        public int f638b = -1;

        public C0096a() {
            mo599a();
        }

        public int getCount() {
            int count = C0095e.this.f631d.mo694z().size() - C0095e.this.f633f;
            if (this.f638b < 0) {
                return count;
            }
            return count - 1;
        }

        /* renamed from: b */
        public C0102i getItem(int position) {
            ArrayList<C0102i> z = C0095e.this.f631d.mo694z();
            int position2 = position + C0095e.this.f633f;
            int i = this.f638b;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return z.get(position2);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                C0095e eVar = C0095e.this;
                convertView = eVar.f630c.inflate(eVar.f635h, parent, false);
            }
            ((C0115n.C0116a) convertView).mo849e(getItem(position), 0);
            return convertView;
        }

        /* renamed from: a */
        public void mo599a() {
            C0102i expandedItem = C0095e.this.f631d.mo690v();
            if (expandedItem != null) {
                ArrayList<C0102i> z = C0095e.this.f631d.mo694z();
                int count = z.size();
                for (int i = 0; i < count; i++) {
                    if (z.get(i) == expandedItem) {
                        this.f638b = i;
                        return;
                    }
                }
            }
            this.f638b = -1;
        }

        public void notifyDataSetChanged() {
            mo599a();
            super.notifyDataSetChanged();
        }
    }
}
