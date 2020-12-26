package p000a.p002b.p011p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import p000a.p002b.C0003a;
import p000a.p002b.C0007e;
import p000a.p002b.C0008f;
import p000a.p002b.C0010h;
import p000a.p002b.C0012j;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p009o.p010j.C0086a;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p038m.C0477x;

/* renamed from: a.b.p.x0 */
public class C0220x0 implements C0142d0 {

    /* renamed from: a */
    public Toolbar f1084a;

    /* renamed from: b */
    public int f1085b;

    /* renamed from: c */
    public View f1086c;

    /* renamed from: d */
    public View f1087d;

    /* renamed from: e */
    public Drawable f1088e;

    /* renamed from: f */
    public Drawable f1089f;

    /* renamed from: g */
    public Drawable f1090g;

    /* renamed from: h */
    public boolean f1091h;

    /* renamed from: i */
    public CharSequence f1092i;

    /* renamed from: j */
    public CharSequence f1093j;

    /* renamed from: k */
    public CharSequence f1094k;

    /* renamed from: l */
    public Window.Callback f1095l;

    /* renamed from: m */
    public boolean f1096m;

    /* renamed from: n */
    public C0131c f1097n;

    /* renamed from: o */
    public int f1098o;

    /* renamed from: p */
    public int f1099p;

    /* renamed from: q */
    public Drawable f1100q;

    public C0220x0(Toolbar toolbar, boolean style) {
        this(toolbar, style, C0010h.abc_action_bar_up_description, C0007e.abc_ic_ab_back_material);
    }

    public C0220x0(Toolbar toolbar, boolean style, int defaultNavigationContentDescription, int defaultNavigationIcon) {
        Drawable drawable;
        this.f1098o = 0;
        this.f1099p = 0;
        this.f1084a = toolbar;
        this.f1092i = toolbar.getTitle();
        this.f1093j = toolbar.getSubtitle();
        this.f1091h = this.f1092i != null;
        this.f1090g = toolbar.getNavigationIcon();
        C0218w0 a = C0218w0.m1093u(toolbar.getContext(), (AttributeSet) null, C0012j.f112a, C0003a.actionBarStyle, 0);
        this.f1100q = a.mo1502g(C0012j.f167l);
        if (style) {
            CharSequence title = a.mo1511p(C0012j.f197r);
            if (!TextUtils.isEmpty(title)) {
                mo1521E(title);
            }
            CharSequence subtitle = a.mo1511p(C0012j.f187p);
            if (!TextUtils.isEmpty(subtitle)) {
                mo1520D(subtitle);
            }
            Drawable logo = a.mo1502g(C0012j.f177n);
            if (logo != null) {
                mo1529z(logo);
            }
            Drawable icon = a.mo1502g(C0012j.f172m);
            if (icon != null) {
                setIcon(icon);
            }
            if (this.f1090g == null && (drawable = this.f1100q) != null) {
                mo1519C(drawable);
            }
            mo1019u(a.mo1506k(C0012j.f147h, 0));
            int customNavId = a.mo1509n(C0012j.f142g, 0);
            if (customNavId != 0) {
                mo1527x(LayoutInflater.from(this.f1084a.getContext()).inflate(customNavId, this.f1084a, false));
                mo1019u(this.f1085b | 16);
            }
            int height = a.mo1508m(C0012j.f157j, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f1084a.getLayoutParams();
                lp.height = height;
                this.f1084a.setLayoutParams(lp);
            }
            int contentInsetStart = a.mo1500e(C0012j.f137f, -1);
            int contentInsetEnd = a.mo1500e(C0012j.f132e, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f1084a.mo4171H(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a.mo1509n(C0012j.f202s, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f1084a;
                toolbar2.mo4174K(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a.mo1509n(C0012j.f192q, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f1084a;
                toolbar3.mo4173J(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a.mo1509n(C0012j.f182o, 0);
            if (popupTheme != 0) {
                this.f1084a.setPopupTheme(popupTheme);
            }
        } else {
            this.f1085b = mo1526w();
        }
        a.mo1514v();
        mo1528y(defaultNavigationContentDescription);
        this.f1094k = this.f1084a.getNavigationContentDescription();
        this.f1084a.setNavigationOnClickListener(new C0221a());
    }

    /* renamed from: a.b.p.x0$a */
    public class C0221a implements View.OnClickListener {

        /* renamed from: b */
        public final C0086a f1101b;

        public C0221a() {
            this.f1101b = new C0086a(C0220x0.this.f1084a.getContext(), 0, 16908332, 0, 0, C0220x0.this.f1092i);
        }

        public void onClick(View v) {
            C0220x0 x0Var = C0220x0.this;
            Window.Callback callback = x0Var.f1095l;
            if (callback != null && x0Var.f1096m) {
                callback.onMenuItemSelected(0, this.f1101b);
            }
        }
    }

    /* renamed from: y */
    public void mo1528y(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.f1099p) {
            this.f1099p = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f1084a.getNavigationContentDescription())) {
                mo1517A(this.f1099p);
            }
        }
    }

    /* renamed from: w */
    public final int mo1526w() {
        if (this.f1084a.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.f1100q = this.f1084a.getNavigationIcon();
        return opts;
    }

    /* renamed from: p */
    public ViewGroup mo1010p() {
        return this.f1084a;
    }

    /* renamed from: t */
    public Context mo1018t() {
        return this.f1084a.getContext();
    }

    /* renamed from: m */
    public boolean mo1007m() {
        return this.f1084a.mo4272v();
    }

    public void collapseActionView() {
        this.f1084a.mo4183e();
    }

    public void setWindowCallback(Window.Callback cb) {
        this.f1095l = cb;
    }

    public void setWindowTitle(CharSequence title) {
        if (!this.f1091h) {
            mo1522F(title);
        }
    }

    public CharSequence getTitle() {
        return this.f1084a.getTitle();
    }

    /* renamed from: E */
    public void mo1521E(CharSequence title) {
        this.f1091h = true;
        mo1522F(title);
    }

    /* renamed from: F */
    public final void mo1522F(CharSequence title) {
        this.f1092i = title;
        if ((this.f1085b & 8) != 0) {
            this.f1084a.setTitle(title);
        }
    }

    /* renamed from: D */
    public void mo1520D(CharSequence subtitle) {
        this.f1093j = subtitle;
        if ((this.f1085b & 8) != 0) {
            this.f1084a.setSubtitle(subtitle);
        }
    }

    /* renamed from: l */
    public void mo1006l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: r */
    public void mo1012r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int resId) {
        setIcon(resId != 0 ? C0053a.m277d(mo1018t(), resId) : null);
    }

    public void setIcon(Drawable d) {
        this.f1088e = d;
        mo1525I();
    }

    /* renamed from: n */
    public void mo1008n(int resId) {
        mo1529z(resId != 0 ? C0053a.m277d(mo1018t(), resId) : null);
    }

    /* renamed from: z */
    public void mo1529z(Drawable d) {
        this.f1089f = d;
        mo1525I();
    }

    /* renamed from: I */
    public final void mo1525I() {
        Drawable logo = null;
        int i = this.f1085b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                Drawable drawable = this.f1089f;
                if (drawable == null) {
                    drawable = this.f1088e;
                }
                logo = drawable;
            } else {
                logo = this.f1088e;
            }
        }
        this.f1084a.setLogo(logo);
    }

    /* renamed from: f */
    public boolean mo999f() {
        return this.f1084a.mo4182d();
    }

    /* renamed from: e */
    public boolean mo998e() {
        return this.f1084a.mo4164A();
    }

    /* renamed from: c */
    public boolean mo995c() {
        return this.f1084a.mo4276z();
    }

    /* renamed from: a */
    public boolean mo993a() {
        return this.f1084a.mo4177N();
    }

    /* renamed from: g */
    public boolean mo1000g() {
        return this.f1084a.mo4273w();
    }

    /* renamed from: d */
    public void mo997d() {
        this.f1096m = true;
    }

    /* renamed from: b */
    public void mo994b(Menu menu, C0113m.C0114a cb) {
        if (this.f1097n == null) {
            C0131c cVar = new C0131c(this.f1084a.getContext());
            this.f1097n = cVar;
            cVar.mo559p(C0008f.action_menu_presenter);
        }
        this.f1097n.mo548d(cb);
        this.f1084a.mo4172I((C0098g) menu, this.f1097n);
    }

    /* renamed from: h */
    public void mo1002h() {
        this.f1084a.mo4184f();
    }

    /* renamed from: j */
    public int mo1004j() {
        return this.f1085b;
    }

    /* renamed from: u */
    public void mo1019u(int newOpts) {
        View view;
        int changed = this.f1085b ^ newOpts;
        this.f1085b = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    mo1523G();
                }
                mo1524H();
            }
            if ((changed & 3) != 0) {
                mo1525I();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f1084a.setTitle(this.f1092i);
                    this.f1084a.setSubtitle(this.f1093j);
                } else {
                    this.f1084a.setTitle((CharSequence) null);
                    this.f1084a.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f1087d) != null) {
                if ((newOpts & 16) != 0) {
                    this.f1084a.addView(view);
                } else {
                    this.f1084a.removeView(view);
                }
            }
        }
    }

    /* renamed from: o */
    public void mo1009o(C0188p0 tabView) {
        Toolbar toolbar;
        View view = this.f1086c;
        if (view != null && view.getParent() == (toolbar = this.f1084a)) {
            toolbar.removeView(this.f1086c);
        }
        this.f1086c = tabView;
        if (tabView != null && this.f1098o == 2) {
            this.f1084a.addView(tabView, 0);
            Toolbar.C0815e lp = (Toolbar.C0815e) this.f1086c.getLayoutParams();
            lp.width = -2;
            lp.height = -2;
            lp.f238a = 8388691;
            tabView.setAllowCollapse(true);
        }
    }

    /* renamed from: s */
    public void mo1013s(boolean collapsible) {
        this.f1084a.setCollapsible(collapsible);
    }

    /* renamed from: q */
    public void mo1011q(boolean enable) {
    }

    /* renamed from: v */
    public int mo1020v() {
        return this.f1098o;
    }

    /* renamed from: x */
    public void mo1527x(View view) {
        View view2 = this.f1087d;
        if (!(view2 == null || (this.f1085b & 16) == 0)) {
            this.f1084a.removeView(view2);
        }
        this.f1087d = view;
        if (view != null && (this.f1085b & 16) != 0) {
            this.f1084a.addView(view);
        }
    }

    /* renamed from: i */
    public C0472v mo1003i(int visibility, long duration) {
        C0472v c = C0460r.m2256c(this.f1084a);
        c.mo2597a(visibility == 0 ? 1.0f : 0.0f);
        c.mo2600d(duration);
        c.mo2602f(new C0222b(visibility));
        return c;
    }

    /* renamed from: a.b.p.x0$b */
    public class C0222b extends C0477x {

        /* renamed from: a */
        public boolean f1103a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1104b;

        public C0222b(int i) {
            this.f1104b = i;
        }

        /* renamed from: b */
        public void mo177b(View view) {
            C0220x0.this.f1084a.setVisibility(0);
        }

        /* renamed from: a */
        public void mo176a(View view) {
            if (!this.f1103a) {
                C0220x0.this.f1084a.setVisibility(this.f1104b);
            }
        }

        /* renamed from: c */
        public void mo909c(View view) {
            this.f1103a = true;
        }
    }

    /* renamed from: C */
    public void mo1519C(Drawable icon) {
        this.f1090g = icon;
        mo1524H();
    }

    /* renamed from: H */
    public final void mo1524H() {
        if ((this.f1085b & 4) != 0) {
            Toolbar toolbar = this.f1084a;
            Drawable drawable = this.f1090g;
            if (drawable == null) {
                drawable = this.f1100q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1084a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: B */
    public void mo1518B(CharSequence description) {
        this.f1094k = description;
        mo1523G();
    }

    /* renamed from: A */
    public void mo1517A(int resId) {
        mo1518B(resId == 0 ? null : mo1018t().getString(resId));
    }

    /* renamed from: G */
    public final void mo1523G() {
        if ((this.f1085b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1094k)) {
            this.f1084a.setNavigationContentDescription(this.f1099p);
        } else {
            this.f1084a.setNavigationContentDescription(this.f1094k);
        }
    }

    /* renamed from: k */
    public void mo1005k(int visible) {
        this.f1084a.setVisibility(visible);
    }
}
