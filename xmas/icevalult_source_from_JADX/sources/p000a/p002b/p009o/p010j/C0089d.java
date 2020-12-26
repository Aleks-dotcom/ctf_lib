package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.p002b.C0006d;
import p000a.p002b.C0009g;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p011p.C0171k0;
import p000a.p002b.p011p.C0173l0;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.o.j.d */
public final class C0089d extends C0110k implements C0113m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    public static final int f592C = C0009g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f593A;

    /* renamed from: B */
    public boolean f594B;

    /* renamed from: c */
    public final Context f595c;

    /* renamed from: d */
    public final int f596d;

    /* renamed from: e */
    public final int f597e;

    /* renamed from: f */
    public final int f598f;

    /* renamed from: g */
    public final boolean f599g;

    /* renamed from: h */
    public final Handler f600h;

    /* renamed from: i */
    public final List<C0098g> f601i = new ArrayList();

    /* renamed from: j */
    public final List<C0094d> f602j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f603k = new C0090a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f604l = new C0091b();

    /* renamed from: m */
    public final C0171k0 f605m = new C0092c();

    /* renamed from: n */
    public int f606n = 0;

    /* renamed from: o */
    public int f607o = 0;

    /* renamed from: p */
    public View f608p;

    /* renamed from: q */
    public View f609q;

    /* renamed from: r */
    public int f610r;

    /* renamed from: s */
    public boolean f611s;

    /* renamed from: t */
    public boolean f612t;

    /* renamed from: u */
    public int f613u;

    /* renamed from: v */
    public int f614v;

    /* renamed from: w */
    public boolean f615w;

    /* renamed from: x */
    public boolean f616x;

    /* renamed from: y */
    public C0113m.C0114a f617y;

    /* renamed from: z */
    public ViewTreeObserver f618z;

    /* renamed from: a.b.o.j.d$a */
    public class C0090a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0090a() {
        }

        public void onGlobalLayout() {
            if (C0089d.this.mo572a() && C0089d.this.f602j.size() > 0 && !C0089d.this.f602j.get(0).f626a.mo1208x()) {
                View anchor = C0089d.this.f609q;
                if (anchor == null || !anchor.isShown()) {
                    C0089d.this.dismiss();
                    return;
                }
                for (C0094d info : C0089d.this.f602j) {
                    info.f626a.mo576j();
                }
            }
        }
    }

    /* renamed from: a.b.o.j.d$b */
    public class C0091b implements View.OnAttachStateChangeListener {
        public C0091b() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = C0089d.this.f618z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0089d.this.f618z = v.getViewTreeObserver();
                }
                C0089d dVar = C0089d.this;
                dVar.f618z.removeGlobalOnLayoutListener(dVar.f603k);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a.b.o.j.d$c */
    public class C0092c implements C0171k0 {
        public C0092c() {
        }

        /* renamed from: l */
        public void mo593l(C0098g menu, MenuItem item) {
            C0089d.this.f600h.removeCallbacksAndMessages(menu);
        }

        /* renamed from: h */
        public void mo592h(C0098g menu, MenuItem item) {
            C0094d nextInfo;
            C0089d.this.f600h.removeCallbacksAndMessages((Object) null);
            int menuIndex = -1;
            int i = 0;
            int count = C0089d.this.f602j.size();
            while (true) {
                if (i >= count) {
                    break;
                } else if (menu == C0089d.this.f602j.get(i).f627b) {
                    menuIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (menuIndex != -1) {
                int nextIndex = menuIndex + 1;
                if (nextIndex < C0089d.this.f602j.size()) {
                    nextInfo = C0089d.this.f602j.get(nextIndex);
                } else {
                    nextInfo = null;
                }
                C0089d.this.f600h.postAtTime(new C0093a(nextInfo, item, menu), menu, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: a.b.o.j.d$c$a */
        public class C0093a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C0094d f622b;

            /* renamed from: c */
            public final /* synthetic */ MenuItem f623c;

            /* renamed from: d */
            public final /* synthetic */ C0098g f624d;

            public C0093a(C0094d dVar, MenuItem menuItem, C0098g gVar) {
                this.f622b = dVar;
                this.f623c = menuItem;
                this.f624d = gVar;
            }

            public void run() {
                C0094d dVar = this.f622b;
                if (dVar != null) {
                    C0089d.this.f594B = true;
                    dVar.f627b.mo660e(false);
                    C0089d.this.f594B = false;
                }
                if (this.f623c.isEnabled() && this.f623c.hasSubMenu()) {
                    this.f624d.mo625L(this.f623c, 4);
                }
            }
        }
    }

    public C0089d(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f595c = context;
        this.f608p = anchor;
        this.f597e = popupStyleAttr;
        this.f598f = popupStyleRes;
        this.f599g = overflowOnly;
        this.f615w = false;
        this.f610r = mo569D();
        Resources res = context.getResources();
        this.f596d = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(C0006d.abc_config_prefDialogWidth));
        this.f600h = new Handler();
    }

    /* renamed from: r */
    public void mo582r(boolean forceShow) {
        this.f615w = forceShow;
    }

    /* renamed from: z */
    public final C0173l0 mo588z() {
        C0173l0 popupWindow = new C0173l0(this.f595c, (AttributeSet) null, this.f597e, this.f598f);
        popupWindow.mo1232P(this.f605m);
        popupWindow.mo1188H(this);
        popupWindow.mo1187G(this);
        popupWindow.mo1210z(this.f608p);
        popupWindow.mo1183C(this.f607o);
        popupWindow.mo1186F(true);
        popupWindow.mo1185E(2);
        return popupWindow;
    }

    /* renamed from: j */
    public void mo576j() {
        if (!mo572a()) {
            for (C0098g menu : this.f601i) {
                mo571F(menu);
            }
            this.f601i.clear();
            View view = this.f608p;
            this.f609q = view;
            if (view != null) {
                boolean addGlobalListener = this.f618z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f618z = viewTreeObserver;
                if (addGlobalListener) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f603k);
                }
                this.f609q.addOnAttachStateChangeListener(this.f604l);
            }
        }
    }

    public void dismiss() {
        int length = this.f602j.size();
        if (length > 0) {
            C0094d[] addedMenus = (C0094d[]) this.f602j.toArray(new C0094d[length]);
            for (int i = length - 1; i >= 0; i--) {
                C0094d info = addedMenus[i];
                if (info.f626a.mo572a()) {
                    info.f626a.dismiss();
                }
            }
        }
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: D */
    public final int mo569D() {
        return C0460r.m2292v(this.f608p) == 1 ? 0 : 1;
    }

    /* renamed from: E */
    public final int mo570E(int nextMenuWidth) {
        List<C0094d> list = this.f602j;
        ListView lastListView = list.get(list.size() - 1).mo595a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.f609q.getWindowVisibleDisplayFrame(displayFrame);
        if (this.f610r == 1) {
            if (screenLocation[0] + lastListView.getWidth() + nextMenuWidth > displayFrame.right) {
                return 0;
            }
            return 1;
        } else if (screenLocation[0] - nextMenuWidth < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: l */
    public void mo577l(C0098g menu) {
        menu.mo653c(this, this.f595c);
        if (mo572a()) {
            mo571F(menu);
        } else {
            this.f601i.add(menu);
        }
    }

    /* renamed from: F */
    public final void mo571F(C0098g menu) {
        View parentView;
        C0094d parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x;
        C0098g gVar = menu;
        LayoutInflater inflater = LayoutInflater.from(this.f595c);
        C0097f adapter = new C0097f(gVar, inflater, this.f599g, f592C);
        if (!mo572a() && this.f615w) {
            adapter.mo609d(true);
        } else if (mo572a()) {
            adapter.mo609d(C0110k.m617x(menu));
        }
        int menuWidth = C0110k.m616o(adapter, (ViewGroup) null, this.f595c, this.f596d);
        C0173l0 popupWindow = mo588z();
        popupWindow.mo1200o(adapter);
        popupWindow.mo1182B(menuWidth);
        popupWindow.mo1183C(this.f607o);
        if (this.f602j.size() > 0) {
            List<C0094d> list = this.f602j;
            parentInfo = list.get(list.size() - 1);
            parentView = mo568C(parentInfo, gVar);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.mo1233Q(false);
            popupWindow.mo1230N((Object) null);
            int nextMenuPosition = mo570E(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.f610r = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.mo1210z(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.f608p.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.f607o & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.f608p.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.f607o & 5) == 5) {
                if (showOnRight) {
                    x = parentOffsetX + menuWidth;
                } else {
                    x = parentOffsetX - parentView.getWidth();
                }
            } else if (showOnRight) {
                x = parentView.getWidth() + parentOffsetX;
            } else {
                x = parentOffsetX - menuWidth;
            }
            popupWindow.mo1195d(x);
            popupWindow.mo1189I(true);
            popupWindow.mo1198m(parentOffsetY);
        } else {
            if (this.f611s) {
                popupWindow.mo1195d(this.f613u);
            }
            if (this.f612t) {
                popupWindow.mo1198m(this.f614v);
            }
            popupWindow.mo1184D(mo829n());
        }
        this.f602j.add(new C0094d(popupWindow, gVar, this.f610r));
        popupWindow.mo576j();
        ListView listView = popupWindow.mo574f();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.f616x && menu.mo692x() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(C0009g.abc_popup_menu_header_item_layout, listView, false);
            titleItemView.setEnabled(false);
            ((TextView) titleItemView.findViewById(16908310)).setText(menu.mo692x());
            listView.addHeaderView(titleItemView, (Object) null, false);
            popupWindow.mo576j();
        }
    }

    /* renamed from: B */
    public final MenuItem mo567B(C0098g parent, C0098g submenu) {
        int count = parent.size();
        for (int i = 0; i < count; i++) {
            MenuItem item = parent.getItem(i);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.widget.ListAdapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo568C(p000a.p002b.p009o.p010j.C0089d.C0094d r11, p000a.p002b.p009o.p010j.C0098g r12) {
        /*
            r10 = this;
            a.b.o.j.g r0 = r11.f627b
            android.view.MenuItem r0 = r10.mo567B(r0, r12)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.widget.ListView r2 = r11.mo595a()
            android.widget.ListAdapter r3 = r2.getAdapter()
            boolean r4 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r4 == 0) goto L_0x0025
            r4 = r3
            android.widget.HeaderViewListAdapter r4 = (android.widget.HeaderViewListAdapter) r4
            int r5 = r4.getHeadersCount()
            android.widget.ListAdapter r6 = r4.getWrappedAdapter()
            r4 = r6
            a.b.o.j.f r4 = (p000a.p002b.p009o.p010j.C0097f) r4
            goto L_0x0029
        L_0x0025:
            r5 = 0
            r4 = r3
            a.b.o.j.f r4 = (p000a.p002b.p009o.p010j.C0097f) r4
        L_0x0029:
            r6 = -1
            r7 = 0
            int r8 = r4.getCount()
        L_0x002f:
            if (r7 >= r8) goto L_0x003c
            a.b.o.j.i r9 = r4.getItem(r7)
            if (r0 != r9) goto L_0x0039
            r6 = r7
            goto L_0x003c
        L_0x0039:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x003c:
            r7 = -1
            if (r6 != r7) goto L_0x0040
            return r1
        L_0x0040:
            int r6 = r6 + r5
            int r7 = r2.getFirstVisiblePosition()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0055
            int r8 = r2.getChildCount()
            if (r7 < r8) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            android.view.View r1 = r2.getChildAt(r7)
            return r1
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p009o.p010j.C0089d.mo568C(a.b.o.j.d$d, a.b.o.j.g):android.view.View");
    }

    /* renamed from: a */
    public boolean mo572a() {
        return this.f602j.size() > 0 && this.f602j.get(0).f626a.mo572a();
    }

    public void onDismiss() {
        C0094d dismissedInfo = null;
        int i = 0;
        int count = this.f602j.size();
        while (true) {
            if (i >= count) {
                break;
            }
            C0094d info = this.f602j.get(i);
            if (!info.f626a.mo572a()) {
                dismissedInfo = info;
                break;
            }
            i++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f627b.mo660e(false);
        }
    }

    /* renamed from: h */
    public void mo551h(boolean cleared) {
        for (C0094d info : this.f602j) {
            C0110k.m618y(info.mo595a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public void mo548d(C0113m.C0114a cb) {
        this.f617y = cb;
    }

    /* renamed from: e */
    public boolean mo549e(C0122r subMenu) {
        for (C0094d info : this.f602j) {
            if (subMenu == info.f627b) {
                info.mo595a().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        mo577l(subMenu);
        C0113m.C0114a aVar = this.f617y;
        if (aVar != null) {
            aVar.mo179c(subMenu);
        }
        return true;
    }

    /* renamed from: A */
    public final int mo566A(C0098g menu) {
        int count = this.f602j.size();
        for (int i = 0; i < count; i++) {
            if (menu == this.f602j.get(i).f627b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        int menuIndex = mo566A(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.f602j.size()) {
                this.f602j.get(nextMenuIndex).f627b.mo660e(false);
            }
            C0094d info = this.f602j.remove(menuIndex);
            info.f627b.mo628O(this);
            if (this.f594B) {
                info.f626a.mo1231O((Object) null);
                info.f626a.mo1181A(0);
            }
            info.f626a.dismiss();
            int count = this.f602j.size();
            if (count > 0) {
                this.f610r = this.f602j.get(count - 1).f628c;
            } else {
                this.f610r = mo569D();
            }
            if (count == 0) {
                dismiss();
                C0113m.C0114a aVar = this.f617y;
                if (aVar != null) {
                    aVar.mo178b(menu, true);
                }
                ViewTreeObserver viewTreeObserver = this.f618z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f618z.removeGlobalOnLayoutListener(this.f603k);
                    }
                    this.f618z = null;
                }
                this.f609q.removeOnAttachStateChangeListener(this.f604l);
                this.f593A.onDismiss();
            } else if (allMenusAreClosing) {
                this.f602j.get(0).f627b.mo660e(false);
            }
        }
    }

    /* renamed from: g */
    public boolean mo575g() {
        return false;
    }

    /* renamed from: s */
    public void mo583s(int dropDownGravity) {
        if (this.f606n != dropDownGravity) {
            this.f606n = dropDownGravity;
            this.f607o = C0444c.m2174b(dropDownGravity, C0460r.m2292v(this.f608p));
        }
    }

    /* renamed from: p */
    public void mo581p(View anchor) {
        if (this.f608p != anchor) {
            this.f608p = anchor;
            this.f607o = C0444c.m2174b(this.f606n, C0460r.m2292v(anchor));
        }
    }

    /* renamed from: u */
    public void mo585u(PopupWindow.OnDismissListener listener) {
        this.f593A = listener;
    }

    /* renamed from: f */
    public ListView mo574f() {
        if (this.f602j.isEmpty()) {
            return null;
        }
        List<C0094d> list = this.f602j;
        return list.get(list.size() - 1).mo595a();
    }

    /* renamed from: t */
    public void mo584t(int x) {
        this.f611s = true;
        this.f613u = x;
    }

    /* renamed from: w */
    public void mo587w(int y) {
        this.f612t = true;
        this.f614v = y;
    }

    /* renamed from: v */
    public void mo586v(boolean showTitle) {
        this.f616x = showTitle;
    }

    /* renamed from: m */
    public boolean mo578m() {
        return false;
    }

    /* renamed from: a.b.o.j.d$d */
    public static class C0094d {

        /* renamed from: a */
        public final C0173l0 f626a;

        /* renamed from: b */
        public final C0098g f627b;

        /* renamed from: c */
        public final int f628c;

        public C0094d(C0173l0 window, C0098g menu, int position) {
            this.f626a = window;
            this.f627b = menu;
            this.f628c = position;
        }

        /* renamed from: a */
        public ListView mo595a() {
            return this.f626a.mo574f();
        }
    }
}
