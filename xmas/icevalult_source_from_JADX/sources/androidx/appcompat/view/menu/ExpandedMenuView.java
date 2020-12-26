package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p011p.C0218w0;

public final class ExpandedMenuView extends ListView implements C0098g.C0100b, C0115n, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public static final int[] f3019d = {16842964, 16843049};

    /* renamed from: b */
    public C0098g f3020b;

    /* renamed from: c */
    public int f3021c;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        C0218w0 a = C0218w0.m1093u(context, attrs, f3019d, defStyleAttr, 0);
        if (a.mo1513r(0)) {
            setBackgroundDrawable(a.mo1502g(0));
        }
        if (a.mo1513r(1)) {
            setDivider(a.mo1502g(1));
        }
        a.mo1514v();
    }

    /* renamed from: d */
    public void mo847d(C0098g menu) {
        this.f3020b = menu;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: b */
    public boolean mo695b(C0102i item) {
        return this.f3020b.mo625L(item, 0);
    }

    public void onItemClick(AdapterView parent, View v, int position, long id) {
        mo695b((C0102i) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return this.f3021c;
    }
}
