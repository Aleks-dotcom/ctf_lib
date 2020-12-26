package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p000a.p002b.C0006d;
import p000a.p002b.C0009g;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p011p.C0173l0;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.o.j.q */
public final class C0119q extends C0110k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0113m, View.OnKeyListener {

    /* renamed from: w */
    public static final int f734w = C0009g.abc_popup_menu_item_layout;

    /* renamed from: c */
    public final Context f735c;

    /* renamed from: d */
    public final C0098g f736d;

    /* renamed from: e */
    public final C0097f f737e;

    /* renamed from: f */
    public final boolean f738f;

    /* renamed from: g */
    public final int f739g;

    /* renamed from: h */
    public final int f740h;

    /* renamed from: i */
    public final int f741i;

    /* renamed from: j */
    public final C0173l0 f742j;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f743k = new C0120a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f744l = new C0121b();

    /* renamed from: m */
    public PopupWindow.OnDismissListener f745m;

    /* renamed from: n */
    public View f746n;

    /* renamed from: o */
    public View f747o;

    /* renamed from: p */
    public C0113m.C0114a f748p;

    /* renamed from: q */
    public ViewTreeObserver f749q;

    /* renamed from: r */
    public boolean f750r;

    /* renamed from: s */
    public boolean f751s;

    /* renamed from: t */
    public int f752t;

    /* renamed from: u */
    public int f753u = 0;

    /* renamed from: v */
    public boolean f754v;

    /* renamed from: a.b.o.j.q$a */
    public class C0120a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0120a() {
        }

        public void onGlobalLayout() {
            if (C0119q.this.mo572a() && !C0119q.this.f742j.mo1208x()) {
                View anchor = C0119q.this.f747o;
                if (anchor == null || !anchor.isShown()) {
                    C0119q.this.dismiss();
                } else {
                    C0119q.this.f742j.mo576j();
                }
            }
        }
    }

    /* renamed from: a.b.o.j.q$b */
    public class C0121b implements View.OnAttachStateChangeListener {
        public C0121b() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = C0119q.this.f749q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0119q.this.f749q = v.getViewTreeObserver();
                }
                C0119q qVar = C0119q.this;
                qVar.f749q.removeGlobalOnLayoutListener(qVar.f743k);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public C0119q(Context context, C0098g menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f735c = context;
        this.f736d = menu;
        this.f738f = overflowOnly;
        this.f737e = new C0097f(menu, LayoutInflater.from(context), overflowOnly, f734w);
        this.f740h = popupStyleAttr;
        this.f741i = popupStyleRes;
        Resources res = context.getResources();
        this.f739g = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(C0006d.abc_config_prefDialogWidth));
        this.f746n = anchorView;
        this.f742j = new C0173l0(context, (AttributeSet) null, popupStyleAttr, popupStyleRes);
        menu.mo653c(this, context);
    }

    /* renamed from: r */
    public void mo582r(boolean forceShow) {
        this.f737e.mo609d(forceShow);
    }

    /* renamed from: s */
    public void mo583s(int gravity) {
        this.f753u = gravity;
    }

    /* renamed from: z */
    public final boolean mo877z() {
        View view;
        if (mo572a()) {
            return true;
        }
        if (this.f750r || (view = this.f746n) == null) {
            return false;
        }
        this.f747o = view;
        this.f742j.mo1187G(this);
        this.f742j.mo1188H(this);
        this.f742j.mo1186F(true);
        View anchor = this.f747o;
        boolean addGlobalListener = this.f749q == null;
        ViewTreeObserver viewTreeObserver = anchor.getViewTreeObserver();
        this.f749q = viewTreeObserver;
        if (addGlobalListener) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f743k);
        }
        anchor.addOnAttachStateChangeListener(this.f744l);
        this.f742j.mo1210z(anchor);
        this.f742j.mo1183C(this.f753u);
        if (!this.f751s) {
            this.f752t = C0110k.m616o(this.f737e, (ViewGroup) null, this.f735c, this.f739g);
            this.f751s = true;
        }
        this.f742j.mo1182B(this.f752t);
        this.f742j.mo1185E(2);
        this.f742j.mo1184D(mo829n());
        this.f742j.mo576j();
        ListView listView = this.f742j.mo574f();
        listView.setOnKeyListener(this);
        if (this.f754v && this.f736d.mo692x() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f735c).inflate(C0009g.abc_popup_menu_header_item_layout, listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f736d.mo692x());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, (Object) null, false);
        }
        this.f742j.mo1200o(this.f737e);
        this.f742j.mo576j();
        return true;
    }

    /* renamed from: j */
    public void mo576j() {
        if (!mo877z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void dismiss() {
        if (mo572a()) {
            this.f742j.dismiss();
        }
    }

    /* renamed from: l */
    public void mo577l(C0098g menu) {
    }

    /* renamed from: a */
    public boolean mo572a() {
        return !this.f750r && this.f742j.mo572a();
    }

    public void onDismiss() {
        this.f750r = true;
        this.f736d.close();
        ViewTreeObserver viewTreeObserver = this.f749q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f749q = this.f747o.getViewTreeObserver();
            }
            this.f749q.removeGlobalOnLayoutListener(this.f743k);
            this.f749q = null;
        }
        this.f747o.removeOnAttachStateChangeListener(this.f744l);
        PopupWindow.OnDismissListener onDismissListener = this.f745m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: h */
    public void mo551h(boolean cleared) {
        this.f751s = false;
        C0097f fVar = this.f737e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public void mo548d(C0113m.C0114a cb) {
        this.f748p = cb;
    }

    /* renamed from: e */
    public boolean mo549e(C0122r subMenu) {
        if (subMenu.hasVisibleItems()) {
            C0111l lVar = new C0111l(this.f735c, subMenu, this.f747o, this.f738f, this.f740h, this.f741i);
            lVar.mo841j(this.f748p);
            lVar.mo838g(C0110k.m617x(subMenu));
            lVar.mo840i(this.f745m);
            this.f745m = null;
            this.f736d.mo660e(false);
            int horizontalOffset = this.f742j.mo1196e();
            int verticalOffset = this.f742j.mo1197k();
            if ((Gravity.getAbsoluteGravity(this.f753u, C0460r.m2292v(this.f746n)) & 7) == 5) {
                horizontalOffset += this.f746n.getWidth();
            }
            if (lVar.mo845n(horizontalOffset, verticalOffset)) {
                C0113m.C0114a aVar = this.f748p;
                if (aVar == null) {
                    return true;
                }
                aVar.mo179c(subMenu);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        if (menu == this.f736d) {
            dismiss();
            C0113m.C0114a aVar = this.f748p;
            if (aVar != null) {
                aVar.mo178b(menu, allMenusAreClosing);
            }
        }
    }

    /* renamed from: g */
    public boolean mo575g() {
        return false;
    }

    /* renamed from: p */
    public void mo581p(View anchor) {
        this.f746n = anchor;
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: u */
    public void mo585u(PopupWindow.OnDismissListener listener) {
        this.f745m = listener;
    }

    /* renamed from: f */
    public ListView mo574f() {
        return this.f742j.mo574f();
    }

    /* renamed from: t */
    public void mo584t(int x) {
        this.f742j.mo1195d(x);
    }

    /* renamed from: w */
    public void mo587w(int y) {
        this.f742j.mo1198m(y);
    }

    /* renamed from: v */
    public void mo586v(boolean showTitle) {
        this.f754v = showTitle;
    }
}
