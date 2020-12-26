package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: a.b.o.j.k */
public abstract class C0110k implements C0118p, C0113m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f719b;

    /* renamed from: l */
    public abstract void mo577l(C0098g gVar);

    /* renamed from: p */
    public abstract void mo581p(View view);

    /* renamed from: r */
    public abstract void mo582r(boolean z);

    /* renamed from: s */
    public abstract void mo583s(int i);

    /* renamed from: t */
    public abstract void mo584t(int i);

    /* renamed from: u */
    public abstract void mo585u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo586v(boolean z);

    /* renamed from: w */
    public abstract void mo587w(int i);

    /* renamed from: q */
    public void mo831q(Rect bounds) {
        this.f719b = bounds;
    }

    /* renamed from: n */
    public Rect mo829n() {
        return this.f719b;
    }

    /* renamed from: i */
    public void mo552i(Context context, C0098g menu) {
    }

    /* renamed from: c */
    public boolean mo547c(C0098g menu, C0102i item) {
        return false;
    }

    /* renamed from: k */
    public boolean mo554k(C0098g menu, C0102i item) {
        return false;
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        m618y(outerAdapter).f640b.mo626M((MenuItem) outerAdapter.getItem(position), this, mo578m() ? 0 : 4);
    }

    /* renamed from: o */
    public static int m616o(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = new FrameLayout(context);
            }
            itemView = adapter.getView(i, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }

    /* renamed from: y */
    public static C0097f m618y(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (C0097f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (C0097f) adapter;
    }

    /* renamed from: x */
    public static boolean m617x(C0098g menu) {
        int count = menu.size();
        for (int i = 0; i < count; i++) {
            MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo578m() {
        return true;
    }
}
