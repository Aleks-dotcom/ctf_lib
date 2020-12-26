package p000a.p002b.p009o.p010j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import p000a.p002b.p009o.p010j.C0115n;

/* renamed from: a.b.o.j.f */
public class C0097f extends BaseAdapter {

    /* renamed from: b */
    public C0098g f640b;

    /* renamed from: c */
    public int f641c = -1;

    /* renamed from: d */
    public boolean f642d;

    /* renamed from: e */
    public final boolean f643e;

    /* renamed from: f */
    public final LayoutInflater f644f;

    /* renamed from: g */
    public final int f645g;

    public C0097f(C0098g menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f643e = overflowOnly;
        this.f644f = inflater;
        this.f640b = menu;
        this.f645g = itemLayoutRes;
        mo606a();
    }

    /* renamed from: d */
    public void mo609d(boolean forceShow) {
        this.f642d = forceShow;
    }

    public int getCount() {
        ArrayList<C0102i> z = this.f643e ? this.f640b.mo694z() : this.f640b.mo618E();
        if (this.f641c < 0) {
            return z.size();
        }
        return z.size() - 1;
    }

    /* renamed from: b */
    public C0098g mo607b() {
        return this.f640b;
    }

    /* renamed from: c */
    public C0102i getItem(int position) {
        ArrayList<C0102i> z = this.f643e ? this.f640b.mo694z() : this.f640b.mo618E();
        int i = this.f641c;
        if (i >= 0 && position >= i) {
            position++;
        }
        return z.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f644f.inflate(this.f645g, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f640b.mo619F() && currGroupId != (position + -1 >= 0 ? getItem(position + -1).getGroupId() : currGroupId));
        C0115n.C0116a itemView = (C0115n.C0116a) convertView;
        if (this.f642d) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.mo849e(getItem(position), 0);
        return convertView;
    }

    /* renamed from: a */
    public void mo606a() {
        C0102i expandedItem = this.f640b.mo690v();
        if (expandedItem != null) {
            ArrayList<C0102i> z = this.f640b.mo694z();
            int count = z.size();
            for (int i = 0; i < count; i++) {
                if (z.get(i) == expandedItem) {
                    this.f641c = i;
                    return;
                }
            }
        }
        this.f641c = -1;
    }

    public void notifyDataSetChanged() {
        mo606a();
        super.notifyDataSetChanged();
    }
}
