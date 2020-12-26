package p000a.p002b.p003k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p002b.C0012j;
import p000a.p002b.p003k.C0013a;
import p000a.p002b.p009o.C0072a;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p009o.C0080g;
import p000a.p002b.p009o.C0083h;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p011p.C0142d0;
import p000a.p002b.p011p.C0188p0;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p038m.C0476w;
import p000a.p025h.p038m.C0477x;
import p000a.p025h.p038m.C0478y;

/* renamed from: a.b.k.k */
public class C0048k extends C0013a implements ActionBarOverlayLayout.C0785d {

    /* renamed from: B */
    public static final Interpolator f367B = new AccelerateInterpolator();

    /* renamed from: C */
    public static final Interpolator f368C = new DecelerateInterpolator();

    /* renamed from: A */
    public final C0478y f369A = new C0051c();

    /* renamed from: a */
    public Context f370a;

    /* renamed from: b */
    public Context f371b;

    /* renamed from: c */
    public ActionBarOverlayLayout f372c;

    /* renamed from: d */
    public ActionBarContainer f373d;

    /* renamed from: e */
    public C0142d0 f374e;

    /* renamed from: f */
    public ActionBarContextView f375f;

    /* renamed from: g */
    public View f376g;

    /* renamed from: h */
    public C0188p0 f377h;

    /* renamed from: i */
    public boolean f378i;

    /* renamed from: j */
    public C0052d f379j;

    /* renamed from: k */
    public C0073b f380k;

    /* renamed from: l */
    public C0073b.C0074a f381l;

    /* renamed from: m */
    public boolean f382m;

    /* renamed from: n */
    public ArrayList<C0013a.C0015b> f383n = new ArrayList<>();

    /* renamed from: o */
    public boolean f384o;

    /* renamed from: p */
    public int f385p = 0;

    /* renamed from: q */
    public boolean f386q = true;

    /* renamed from: r */
    public boolean f387r;

    /* renamed from: s */
    public boolean f388s;

    /* renamed from: t */
    public boolean f389t;

    /* renamed from: u */
    public boolean f390u = true;

    /* renamed from: v */
    public C0083h f391v;

    /* renamed from: w */
    public boolean f392w;

    /* renamed from: x */
    public boolean f393x;

    /* renamed from: y */
    public final C0476w f394y = new C0049a();

    /* renamed from: z */
    public final C0476w f395z = new C0050b();

    /* renamed from: a.b.k.k$a */
    public class C0049a extends C0477x {
        public C0049a() {
        }

        /* renamed from: a */
        public void mo176a(View view) {
            View view2;
            C0048k kVar = C0048k.this;
            if (kVar.f386q && (view2 = kVar.f376g) != null) {
                view2.setTranslationY(0.0f);
                C0048k.this.f373d.setTranslationY(0.0f);
            }
            C0048k.this.f373d.setVisibility(8);
            C0048k.this.f373d.setTransitioning(false);
            C0048k kVar2 = C0048k.this;
            kVar2.f391v = null;
            kVar2.mo248x();
            ActionBarOverlayLayout actionBarOverlayLayout = C0048k.this.f372c;
            if (actionBarOverlayLayout != null) {
                C0460r.m2253a0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: a.b.k.k$b */
    public class C0050b extends C0477x {
        public C0050b() {
        }

        /* renamed from: a */
        public void mo176a(View view) {
            C0048k kVar = C0048k.this;
            kVar.f391v = null;
            kVar.f373d.requestLayout();
        }
    }

    /* renamed from: a.b.k.k$c */
    public class C0051c implements C0478y {
        public C0051c() {
        }

        /* renamed from: a */
        public void mo251a(View view) {
            ((View) C0048k.this.f373d.getParent()).invalidate();
        }
    }

    public C0048k(Activity activity, boolean overlayMode) {
        new ArrayList();
        View decor = activity.getWindow().getDecorView();
        mo231D(decor);
        if (!overlayMode) {
            this.f376g = decor.findViewById(16908290);
        }
    }

    public C0048k(Dialog dialog) {
        new ArrayList();
        mo231D(dialog.getWindow().getDecorView());
    }

    /* renamed from: D */
    public final void mo231D(View decor) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) decor.findViewById(C0008f.decor_content_parent);
        this.f372c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f374e = mo228A(decor.findViewById(C0008f.action_bar));
        this.f375f = (ActionBarContextView) decor.findViewById(C0008f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) decor.findViewById(C0008f.action_bar_container);
        this.f373d = actionBarContainer;
        C0142d0 d0Var = this.f374e;
        if (d0Var == null || this.f375f == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f370a = d0Var.mo1018t();
        boolean homeAsUp = (this.f374e.mo1004j() & 4) != 0;
        if (homeAsUp) {
            this.f378i = true;
        }
        C0072a abp = C0072a.m362b(this.f370a);
        mo237J(abp.mo405a() || homeAsUp);
        mo235H(abp.mo410g());
        TypedArray a = this.f370a.obtainStyledAttributes((AttributeSet) null, C0012j.f112a, C0003a.actionBarStyle, 0);
        if (a.getBoolean(C0012j.f162k, false)) {
            mo236I(true);
        }
        int elevation = a.getDimensionPixelSize(C0012j.f152i, 0);
        if (elevation != 0) {
            mo234G((float) elevation);
        }
        a.recycle();
    }

    /* renamed from: A */
    public final C0142d0 mo228A(View view) {
        if (view instanceof C0142d0) {
            return (C0142d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: G */
    public void mo234G(float elevation) {
        C0460r.m2271j0(this.f373d, elevation);
    }

    /* renamed from: m */
    public void mo15m(Configuration newConfig) {
        mo235H(C0072a.m362b(this.f370a).mo410g());
    }

    /* renamed from: H */
    public final void mo235H(boolean hasEmbeddedTabs) {
        this.f384o = hasEmbeddedTabs;
        if (!hasEmbeddedTabs) {
            this.f374e.mo1009o((C0188p0) null);
            this.f373d.setTabContainer(this.f377h);
        } else {
            this.f373d.setTabContainer((C0188p0) null);
            this.f374e.mo1009o(this.f377h);
        }
        boolean z = true;
        boolean isInTabMode = mo229B() == 2;
        C0188p0 p0Var = this.f377h;
        if (p0Var != null) {
            if (isInTabMode) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f372c;
                if (actionBarOverlayLayout != null) {
                    C0460r.m2253a0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f374e.mo1013s(!this.f384o && isInTabMode);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f372c;
        if (this.f384o || !isInTabMode) {
            z = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: x */
    public void mo248x() {
        C0073b.C0074a aVar = this.f381l;
        if (aVar != null) {
            aVar.mo181b(this.f380k);
            this.f380k = null;
            this.f381l = null;
        }
    }

    /* renamed from: c */
    public void mo243c(int visibility) {
        this.f385p = visibility;
    }

    /* renamed from: s */
    public void mo21s(boolean enabled) {
        C0083h hVar;
        this.f392w = enabled;
        if (!enabled && (hVar = this.f391v) != null) {
            hVar.mo460a();
        }
    }

    /* renamed from: i */
    public void mo11i(boolean isVisible) {
        if (isVisible != this.f382m) {
            this.f382m = isVisible;
            int count = this.f383n.size();
            for (int i = 0; i < count; i++) {
                this.f383n.get(i).mo24a(isVisible);
            }
        }
    }

    /* renamed from: E */
    public void mo232E(boolean showHomeAsUp) {
        mo233F(showHomeAsUp ? 4 : 0, 4);
    }

    /* renamed from: J */
    public void mo237J(boolean enable) {
        this.f374e.mo1011q(enable);
    }

    /* renamed from: t */
    public void mo22t(CharSequence title) {
        this.f374e.setWindowTitle(title);
    }

    /* renamed from: F */
    public void mo233F(int options, int mask) {
        int current = this.f374e.mo1004j();
        if ((mask & 4) != 0) {
            this.f378i = true;
        }
        this.f374e.mo1019u((options & mask) | ((~mask) & current));
    }

    /* renamed from: B */
    public int mo229B() {
        return this.f374e.mo1020v();
    }

    /* renamed from: j */
    public int mo12j() {
        return this.f374e.mo1004j();
    }

    /* renamed from: u */
    public C0073b mo23u(C0073b.C0074a callback) {
        C0052d dVar = this.f379j;
        if (dVar != null) {
            dVar.mo252c();
        }
        this.f372c.setHideOnContentScrollEnabled(false);
        this.f375f.mo3952k();
        C0052d mode = new C0052d(this.f375f.getContext(), callback);
        if (!mode.mo266t()) {
            return null;
        }
        this.f379j = mode;
        mode.mo258k();
        this.f375f.mo3949h(mode);
        mo247v(true);
        this.f375f.sendAccessibilityEvent(32);
        return mode;
    }

    /* renamed from: b */
    public void mo242b(boolean enabled) {
        this.f386q = enabled;
    }

    /* renamed from: L */
    public final void mo239L() {
        if (!this.f389t) {
            this.f389t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f372c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            mo240M(false);
        }
    }

    /* renamed from: e */
    public void mo245e() {
        if (this.f388s) {
            this.f388s = false;
            mo240M(true);
        }
    }

    /* renamed from: C */
    public final void mo230C() {
        if (this.f389t) {
            this.f389t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f372c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            mo240M(false);
        }
    }

    /* renamed from: d */
    public void mo244d() {
        if (!this.f388s) {
            this.f388s = true;
            mo240M(true);
        }
    }

    /* renamed from: I */
    public void mo236I(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f372c.mo3999w()) {
            this.f393x = hideOnContentScroll;
            this.f372c.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: w */
    public static boolean m220w(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public final void mo240M(boolean fromSystem) {
        if (m220w(this.f387r, this.f388s, this.f389t)) {
            if (!this.f390u) {
                this.f390u = true;
                mo250z(fromSystem);
            }
        } else if (this.f390u) {
            this.f390u = false;
            mo249y(fromSystem);
        }
    }

    /* renamed from: z */
    public void mo250z(boolean fromSystem) {
        View view;
        View view2;
        C0083h hVar = this.f391v;
        if (hVar != null) {
            hVar.mo460a();
        }
        this.f373d.setVisibility(0);
        if (this.f385p != 0 || (!this.f392w && !fromSystem)) {
            this.f373d.setAlpha(1.0f);
            this.f373d.setTranslationY(0.0f);
            if (this.f386q && (view = this.f376g) != null) {
                view.setTranslationY(0.0f);
            }
            this.f395z.mo176a((View) null);
        } else {
            this.f373d.setTranslationY(0.0f);
            float startingY = (float) (-this.f373d.getHeight());
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f373d.getLocationInWindow(topLeft);
                startingY -= (float) topLeft[1];
            }
            this.f373d.setTranslationY(startingY);
            C0083h anim = new C0083h();
            C0472v a = C0460r.m2256c(this.f373d).mo2607k(0.0f);
            a.mo2605i(this.f369A);
            anim.mo462c(a);
            if (this.f386q && (view2 = this.f376g) != null) {
                view2.setTranslationY(startingY);
                C0472v c = C0460r.m2256c(this.f376g);
                c.mo2607k(0.0f);
                anim.mo462c(c);
            }
            anim.mo465f(f368C);
            anim.mo464e(250);
            anim.mo466g(this.f395z);
            this.f391v = anim;
            anim.mo467h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f372c;
        if (actionBarOverlayLayout != null) {
            C0460r.m2253a0(actionBarOverlayLayout);
        }
    }

    /* renamed from: y */
    public void mo249y(boolean fromSystem) {
        View view;
        C0083h hVar = this.f391v;
        if (hVar != null) {
            hVar.mo460a();
        }
        if (this.f385p != 0 || (!this.f392w && !fromSystem)) {
            this.f394y.mo176a((View) null);
            return;
        }
        this.f373d.setAlpha(1.0f);
        this.f373d.setTransitioning(true);
        C0083h anim = new C0083h();
        float endingY = (float) (-this.f373d.getHeight());
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f373d.getLocationInWindow(topLeft);
            endingY -= (float) topLeft[1];
        }
        C0472v a = C0460r.m2256c(this.f373d).mo2607k(endingY);
        a.mo2605i(this.f369A);
        anim.mo462c(a);
        if (this.f386q && (view = this.f376g) != null) {
            C0472v c = C0460r.m2256c(view);
            c.mo2607k(endingY);
            anim.mo462c(c);
        }
        anim.mo465f(f367B);
        anim.mo464e(250);
        anim.mo466g(this.f394y);
        this.f391v = anim;
        anim.mo467h();
    }

    /* renamed from: v */
    public void mo247v(boolean toActionMode) {
        C0472v fadeIn;
        C0472v fadeOut;
        if (toActionMode) {
            mo239L();
        } else {
            mo230C();
        }
        if (mo238K()) {
            if (toActionMode) {
                fadeOut = this.f374e.mo1003i(4, 100);
                fadeIn = this.f375f.mo901f(0, 200);
            } else {
                fadeIn = this.f374e.mo1003i(0, 200);
                fadeOut = this.f375f.mo901f(8, 100);
            }
            C0083h set = new C0083h();
            set.mo463d(fadeOut, fadeIn);
            set.mo467h();
        } else if (toActionMode) {
            this.f374e.mo1005k(4);
            this.f375f.setVisibility(0);
        } else {
            this.f374e.mo1005k(0);
            this.f375f.setVisibility(8);
        }
    }

    /* renamed from: K */
    public final boolean mo238K() {
        return C0460r.m2235J(this.f373d);
    }

    /* renamed from: k */
    public Context mo13k() {
        if (this.f371b == null) {
            TypedValue outValue = new TypedValue();
            this.f370a.getTheme().resolveAttribute(C0003a.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f371b = new ContextThemeWrapper(this.f370a, targetThemeRes);
            } else {
                this.f371b = this.f370a;
            }
        }
        return this.f371b;
    }

    /* renamed from: a */
    public void mo241a() {
        C0083h hVar = this.f391v;
        if (hVar != null) {
            hVar.mo460a();
            this.f391v = null;
        }
    }

    /* renamed from: f */
    public void mo246f() {
    }

    /* renamed from: h */
    public boolean mo10h() {
        C0142d0 d0Var = this.f374e;
        if (d0Var == null || !d0Var.mo1007m()) {
            return false;
        }
        this.f374e.collapseActionView();
        return true;
    }

    /* renamed from: a.b.k.k$d */
    public class C0052d extends C0073b implements C0098g.C0099a {

        /* renamed from: d */
        public final Context f399d;

        /* renamed from: e */
        public final C0098g f400e;

        /* renamed from: f */
        public C0073b.C0074a f401f;

        /* renamed from: g */
        public WeakReference<View> f402g;

        public C0052d(Context context, C0073b.C0074a callback) {
            this.f399d = context;
            this.f401f = callback;
            C0098g gVar = new C0098g(context);
            gVar.mo632S(1);
            this.f400e = gVar;
            gVar.mo631R(this);
        }

        /* renamed from: f */
        public MenuInflater mo255f() {
            return new C0080g(this.f399d);
        }

        /* renamed from: e */
        public Menu mo254e() {
            return this.f400e;
        }

        /* renamed from: c */
        public void mo252c() {
            C0048k kVar = C0048k.this;
            if (kVar.f379j == this) {
                if (!C0048k.m220w(kVar.f387r, kVar.f388s, false)) {
                    C0048k kVar2 = C0048k.this;
                    kVar2.f380k = this;
                    kVar2.f381l = this.f401f;
                } else {
                    this.f401f.mo181b(this);
                }
                this.f401f = null;
                C0048k.this.mo247v(false);
                C0048k.this.f375f.mo3944g();
                C0048k.this.f374e.mo1010p().sendAccessibilityEvent(32);
                C0048k kVar3 = C0048k.this;
                kVar3.f372c.setHideOnContentScrollEnabled(kVar3.f393x);
                C0048k.this.f379j = null;
            }
        }

        /* renamed from: k */
        public void mo258k() {
            if (C0048k.this.f379j == this) {
                this.f400e.mo659d0();
                try {
                    this.f401f.mo180a(this, this.f400e);
                } finally {
                    this.f400e.mo654c0();
                }
            }
        }

        /* renamed from: t */
        public boolean mo266t() {
            this.f400e.mo659d0();
            try {
                return this.f401f.mo183d(this, this.f400e);
            } finally {
                this.f400e.mo654c0();
            }
        }

        /* renamed from: m */
        public void mo260m(View view) {
            C0048k.this.f375f.setCustomView(view);
            this.f402g = new WeakReference<>(view);
        }

        /* renamed from: o */
        public void mo262o(CharSequence subtitle) {
            C0048k.this.f375f.setSubtitle(subtitle);
        }

        /* renamed from: r */
        public void mo264r(CharSequence title) {
            C0048k.this.f375f.setTitle(title);
        }

        /* renamed from: q */
        public void mo263q(int resId) {
            mo264r(C0048k.this.f370a.getResources().getString(resId));
        }

        /* renamed from: n */
        public void mo261n(int resId) {
            mo262o(C0048k.this.f370a.getResources().getString(resId));
        }

        /* renamed from: i */
        public CharSequence mo257i() {
            return C0048k.this.f375f.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo256g() {
            return C0048k.this.f375f.getSubtitle();
        }

        /* renamed from: s */
        public void mo265s(boolean titleOptional) {
            super.mo265s(titleOptional);
            C0048k.this.f375f.setTitleOptional(titleOptional);
        }

        /* renamed from: l */
        public boolean mo259l() {
            return C0048k.this.f375f.mo3951j();
        }

        /* renamed from: d */
        public View mo253d() {
            WeakReference<View> weakReference = this.f402g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo140b(C0098g menu, MenuItem item) {
            C0073b.C0074a aVar = this.f401f;
            if (aVar != null) {
                return aVar.mo182c(this, item);
            }
            return false;
        }

        /* renamed from: a */
        public void mo138a(C0098g menu) {
            if (this.f401f != null) {
                mo258k();
                C0048k.this.f375f.mo3953l();
            }
        }
    }

    /* renamed from: r */
    public void mo20r(boolean enable) {
        if (!this.f378i) {
            mo232E(enable);
        }
    }

    /* renamed from: o */
    public boolean mo17o(int keyCode, KeyEvent event) {
        Menu menu;
        C0052d dVar = this.f379j;
        if (dVar == null || (menu = dVar.mo254e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(keyCode, event, 0);
    }
}
