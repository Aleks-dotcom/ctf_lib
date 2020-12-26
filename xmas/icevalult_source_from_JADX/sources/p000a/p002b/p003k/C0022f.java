package p000a.p002b.p003k;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p000a.p002b.C0003a;
import p000a.p002b.C0005c;
import p000a.p002b.C0008f;
import p000a.p002b.C0009g;
import p000a.p002b.C0011i;
import p000a.p002b.C0012j;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p009o.C0076d;
import p000a.p002b.p009o.C0077e;
import p000a.p002b.p009o.C0078f;
import p000a.p002b.p009o.C0080g;
import p000a.p002b.p009o.C0085i;
import p000a.p002b.p009o.p010j.C0095e;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p011p.C0130b1;
import p000a.p002b.p011p.C0139c0;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0151g0;
import p000a.p002b.p011p.C0160j;
import p000a.p002b.p011p.C0218w0;
import p000a.p018e.C0256a;
import p000a.p025h.p026d.C0326a;
import p000a.p025h.p026d.C0335e;
import p000a.p025h.p038m.C0445d;
import p000a.p025h.p038m.C0447e;
import p000a.p025h.p038m.C0457o;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p038m.C0476w;
import p000a.p025h.p038m.C0477x;
import p000a.p025h.p038m.C0479z;
import p000a.p025h.p040n.C0489h;
import p000a.p051m.C0577d;
import p000a.p051m.C0582g;

/* renamed from: a.b.k.f */
public class C0022f extends C0021e implements C0098g.C0099a, LayoutInflater.Factory2 {

    /* renamed from: b0 */
    public static final Map<Class<?>, Integer> f247b0 = new C0256a();

    /* renamed from: c0 */
    public static final boolean f248c0;

    /* renamed from: d0 */
    public static final int[] f249d0 = {16842836};

    /* renamed from: e0 */
    public static boolean f250e0 = true;

    /* renamed from: f0 */
    public static final boolean f251f0;

    /* renamed from: A */
    public boolean f252A;

    /* renamed from: B */
    public boolean f253B;

    /* renamed from: C */
    public boolean f254C;

    /* renamed from: D */
    public boolean f255D;

    /* renamed from: E */
    public boolean f256E;

    /* renamed from: F */
    public boolean f257F;

    /* renamed from: G */
    public boolean f258G;

    /* renamed from: H */
    public C0040o[] f259H;

    /* renamed from: I */
    public C0040o f260I;

    /* renamed from: J */
    public boolean f261J;

    /* renamed from: K */
    public boolean f262K;

    /* renamed from: L */
    public boolean f263L;

    /* renamed from: M */
    public boolean f264M;

    /* renamed from: N */
    public boolean f265N;

    /* renamed from: O */
    public int f266O;

    /* renamed from: P */
    public int f267P;

    /* renamed from: Q */
    public boolean f268Q;

    /* renamed from: R */
    public boolean f269R;

    /* renamed from: S */
    public C0036l f270S;

    /* renamed from: T */
    public C0036l f271T;

    /* renamed from: U */
    public boolean f272U;

    /* renamed from: V */
    public int f273V;

    /* renamed from: W */
    public final Runnable f274W;

    /* renamed from: X */
    public boolean f275X;

    /* renamed from: Y */
    public Rect f276Y;

    /* renamed from: Z */
    public Rect f277Z;

    /* renamed from: a0 */
    public AppCompatViewInflater f278a0;

    /* renamed from: e */
    public final Object f279e;

    /* renamed from: f */
    public final Context f280f;

    /* renamed from: g */
    public Window f281g;

    /* renamed from: h */
    public C0034j f282h;

    /* renamed from: i */
    public final C0020d f283i;

    /* renamed from: j */
    public C0013a f284j;

    /* renamed from: k */
    public MenuInflater f285k;

    /* renamed from: l */
    public CharSequence f286l;

    /* renamed from: m */
    public C0139c0 f287m;

    /* renamed from: n */
    public C0031h f288n;

    /* renamed from: o */
    public C0041p f289o;

    /* renamed from: p */
    public C0073b f290p;

    /* renamed from: q */
    public ActionBarContextView f291q;

    /* renamed from: r */
    public PopupWindow f292r;

    /* renamed from: s */
    public Runnable f293s;

    /* renamed from: t */
    public C0472v f294t;

    /* renamed from: u */
    public boolean f295u;

    /* renamed from: v */
    public boolean f296v;

    /* renamed from: w */
    public ViewGroup f297w;

    /* renamed from: x */
    public TextView f298x;

    /* renamed from: y */
    public View f299y;

    /* renamed from: z */
    public boolean f300z;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f248c0 = z2;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f251f0 = z;
        if (z2 && !f250e0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0023a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* renamed from: a.b.k.f$a */
    public static class C0023a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f301a;

        public C0023a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f301a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable thowable) {
            if (mo168a(thowable)) {
                Throwable wrapped = new Resources.NotFoundException(thowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(thowable.getCause());
                wrapped.setStackTrace(thowable.getStackTrace());
                this.f301a.uncaughtException(thread, wrapped);
                return;
            }
            this.f301a.uncaughtException(thread, thowable);
        }

        /* renamed from: a */
        public final boolean mo168a(Throwable throwable) {
            String message;
            if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a.b.k.f$b */
    public class C0024b implements Runnable {
        public C0024b() {
        }

        public void run() {
            C0022f fVar = C0022f.this;
            if ((fVar.f273V & 1) != 0) {
                fVar.mo130S(0);
            }
            C0022f fVar2 = C0022f.this;
            if ((fVar2.f273V & 4096) != 0) {
                fVar2.mo130S(108);
            }
            C0022f fVar3 = C0022f.this;
            fVar3.f272U = false;
            fVar3.f273V = 0;
        }
    }

    public C0022f(Activity activity, C0020d callback) {
        this(activity, (Window) null, callback, activity);
    }

    public C0022f(Dialog dialog, C0020d callback) {
        this(dialog.getContext(), dialog.getWindow(), callback, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r0 = f247b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0022f(android.content.Context r4, android.view.Window r5, p000a.p002b.p003k.C0020d r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f294t = r0
            r0 = 1
            r3.f295u = r0
            r0 = -100
            r3.f266O = r0
            a.b.k.f$b r1 = new a.b.k.f$b
            r1.<init>()
            r3.f274W = r1
            r3.f280f = r4
            r3.f283i = r6
            r3.f279e = r7
            int r1 = r3.f266O
            if (r1 != r0) goto L_0x0032
            boolean r1 = r7 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x0032
            a.b.k.c r1 = r3.mo114F0()
            if (r1 == 0) goto L_0x0032
            a.b.k.e r2 = r1.mo79u()
            int r2 = r2.mo92i()
            r3.f266O = r2
        L_0x0032:
            int r1 = r3.f266O
            if (r1 != r0) goto L_0x0051
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = f247b0
            java.lang.Class r1 = r7.getClass()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0051
            int r2 = r1.intValue()
            r3.f266O = r2
            java.lang.Class r2 = r7.getClass()
            r0.remove(r2)
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r3.mo117H(r5)
        L_0x0056:
            p000a.p002b.p011p.C0160j.m885h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p003k.C0022f.<init>(android.content.Context, android.view.Window, a.b.k.d, java.lang.Object):void");
    }

    /* renamed from: d */
    public void mo90d(Context context) {
        mo113F(false);
        this.f262K = true;
    }

    /* renamed from: q */
    public void mo98q(Bundle savedInstanceState) {
        this.f262K = true;
        mo113F(false);
        mo133V();
        Object obj = this.f279e;
        if (obj instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = C0335e.m1761c((Activity) obj);
            } catch (IllegalArgumentException e) {
            }
            if (parentActivityName != null) {
                C0013a ab = mo163v0();
                if (ab == null) {
                    this.f275X = true;
                } else {
                    ab.mo20r(true);
                }
            }
        }
        this.f263L = true;
    }

    /* renamed from: s */
    public void mo100s(Bundle savedInstanceState) {
        mo132U();
    }

    /* renamed from: k */
    public C0013a mo94k() {
        mo143d0();
        return this.f284j;
    }

    /* renamed from: v0 */
    public final C0013a mo163v0() {
        return this.f284j;
    }

    /* renamed from: c0 */
    public final Window.Callback mo142c0() {
        return this.f281g.getCallback();
    }

    /* renamed from: d0 */
    public final void mo143d0() {
        mo132U();
        if (this.f253B && this.f284j == null) {
            Object obj = this.f279e;
            if (obj instanceof Activity) {
                this.f284j = new C0048k((Activity) this.f279e, this.f254C);
            } else if (obj instanceof Dialog) {
                this.f284j = new C0048k((Dialog) this.f279e);
            }
            C0013a aVar = this.f284j;
            if (aVar != null) {
                aVar.mo20r(this.f275X);
            }
        }
    }

    /* renamed from: X */
    public final Context mo135X() {
        Context context = null;
        C0013a ab = mo94k();
        if (ab != null) {
            context = ab.mo13k();
        }
        if (context == null) {
            return this.f280f;
        }
        return context;
    }

    /* renamed from: j */
    public MenuInflater mo93j() {
        if (this.f285k == null) {
            mo143d0();
            C0013a aVar = this.f284j;
            this.f285k = new C0080g(aVar != null ? aVar.mo13k() : this.f280f);
        }
        return this.f285k;
    }

    /* renamed from: g */
    public <T extends View> T mo91g(int id) {
        mo132U();
        return this.f281g.findViewById(id);
    }

    /* renamed from: p */
    public void mo97p(Configuration newConfig) {
        C0013a ab;
        if (this.f253B && this.f296v && (ab = mo94k()) != null) {
            ab.mo15m(newConfig);
        }
        C0160j.m883b().mo1168g(this.f280f);
        mo113F(false);
    }

    /* renamed from: v */
    public void mo103v() {
        this.f264M = true;
        mo111E();
        C0021e.m59n(this);
    }

    /* renamed from: w */
    public void mo104w() {
        this.f264M = false;
        C0021e.m60o(this);
        C0013a ab = mo94k();
        if (ab != null) {
            ab.mo21s(false);
        }
        if (this.f279e instanceof Dialog) {
            mo123L();
        }
    }

    /* renamed from: t */
    public void mo101t() {
        C0013a ab = mo94k();
        if (ab != null) {
            ab.mo21s(true);
        }
    }

    /* renamed from: A */
    public void mo85A(View v) {
        mo132U();
        ViewGroup contentParent = (ViewGroup) this.f297w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.f282h.mo469a().onContentChanged();
    }

    /* renamed from: z */
    public void mo106z(int resId) {
        mo132U();
        ViewGroup contentParent = (ViewGroup) this.f297w.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f280f).inflate(resId, contentParent);
        this.f282h.mo469a().onContentChanged();
    }

    /* renamed from: B */
    public void mo86B(View v, ViewGroup.LayoutParams lp) {
        mo132U();
        ViewGroup contentParent = (ViewGroup) this.f297w.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.f282h.mo469a().onContentChanged();
    }

    /* renamed from: c */
    public void mo89c(View v, ViewGroup.LayoutParams lp) {
        mo132U();
        ((ViewGroup) this.f297w.findViewById(16908290)).addView(v, lp);
        this.f282h.mo469a().onContentChanged();
    }

    /* renamed from: u */
    public void mo102u(Bundle outState) {
        if (this.f266O != -100) {
            f247b0.put(this.f279e.getClass(), Integer.valueOf(this.f266O));
        }
    }

    /* renamed from: r */
    public void mo99r() {
        C0021e.m60o(this);
        if (this.f272U) {
            this.f281g.getDecorView().removeCallbacks(this.f274W);
        }
        this.f264M = false;
        this.f265N = true;
        C0013a aVar = this.f284j;
        if (aVar != null) {
            aVar.mo16n();
        }
        mo123L();
    }

    /* renamed from: L */
    public final void mo123L() {
        C0036l lVar = this.f270S;
        if (lVar != null) {
            lVar.mo198a();
        }
        C0036l lVar2 = this.f271T;
        if (lVar2 != null) {
            lVar2.mo198a();
        }
    }

    /* renamed from: C */
    public void mo87C(int themeResId) {
        this.f267P = themeResId;
    }

    /* renamed from: V */
    public final void mo133V() {
        if (this.f281g == null) {
            Object obj = this.f279e;
            if (obj instanceof Activity) {
                mo117H(((Activity) obj).getWindow());
            }
        }
        if (this.f281g == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: H */
    public final void mo117H(Window window) {
        if (this.f281g == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0034j)) {
                C0034j jVar = new C0034j(callback);
                this.f282h = jVar;
                window.setCallback(jVar);
                C0218w0 a = C0218w0.m1092t(this.f280f, (AttributeSet) null, f249d0);
                Drawable winBg = a.mo1503h(0);
                if (winBg != null) {
                    window.setBackgroundDrawable(winBg);
                }
                a.mo1514v();
                this.f281g = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: U */
    public final void mo132U() {
        if (!this.f296v) {
            this.f297w = mo126O();
            CharSequence title = mo141b0();
            if (!TextUtils.isEmpty(title)) {
                C0139c0 c0Var = this.f287m;
                if (c0Var != null) {
                    c0Var.setWindowTitle(title);
                } else if (mo163v0() != null) {
                    mo163v0().mo22t(title);
                } else {
                    TextView textView = this.f298x;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            mo115G();
            mo161t0(this.f297w);
            this.f296v = true;
            C0040o st = mo139a0(0, false);
            if (this.f265N) {
                return;
            }
            if (st == null || st.f331j == null) {
                mo147h0(108);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v29, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ViewGroup mo126O() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f280f
            int[] r1 = p000a.p002b.C0012j.f213u0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = p000a.p002b.C0012j.f235z0
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L_0x01a4
            int r2 = p000a.p002b.C0012j.f41I0
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            r4 = 1
            if (r2 == 0) goto L_0x001e
            r10.mo105y(r4)
            goto L_0x0029
        L_0x001e:
            boolean r1 = r0.getBoolean(r1, r3)
            if (r1 == 0) goto L_0x0029
            r1 = 108(0x6c, float:1.51E-43)
            r10.mo105y(r1)
        L_0x0029:
            int r1 = p000a.p002b.C0012j.f9A0
            boolean r1 = r0.getBoolean(r1, r3)
            r2 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L_0x0036
            r10.mo105y(r2)
        L_0x0036:
            int r1 = p000a.p002b.C0012j.f13B0
            boolean r1 = r0.getBoolean(r1, r3)
            if (r1 == 0) goto L_0x0043
            r1 = 10
            r10.mo105y(r1)
        L_0x0043:
            int r1 = p000a.p002b.C0012j.f218v0
            boolean r1 = r0.getBoolean(r1, r3)
            r10.f256E = r1
            r0.recycle()
            r10.mo133V()
            android.view.Window r1 = r10.f281g
            r1.getDecorView()
            android.content.Context r1 = r10.f280f
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 0
            boolean r6 = r10.f257F
            r7 = 0
            if (r6 != 0) goto L_0x00d5
            boolean r6 = r10.f256E
            if (r6 == 0) goto L_0x0075
            int r2 = p000a.p002b.C0009g.abc_dialog_title_material
            android.view.View r2 = r1.inflate(r2, r7)
            r5 = r2
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r10.f254C = r3
            r10.f253B = r3
            goto L_0x0106
        L_0x0075:
            boolean r6 = r10.f253B
            if (r6 == 0) goto L_0x0106
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.Context r8 = r10.f280f
            android.content.res.Resources$Theme r8 = r8.getTheme()
            int r9 = p000a.p002b.C0003a.actionBarTheme
            r8.resolveAttribute(r9, r6, r4)
            int r4 = r6.resourceId
            if (r4 == 0) goto L_0x0097
            a.b.o.d r4 = new a.b.o.d
            android.content.Context r8 = r10.f280f
            int r9 = r6.resourceId
            r4.<init>((android.content.Context) r8, (int) r9)
            goto L_0x0099
        L_0x0097:
            android.content.Context r4 = r10.f280f
        L_0x0099:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r4)
            int r9 = p000a.p002b.C0009g.abc_screen_toolbar
            android.view.View r8 = r8.inflate(r9, r7)
            r5 = r8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = p000a.p002b.C0008f.decor_content_parent
            android.view.View r8 = r5.findViewById(r8)
            a.b.p.c0 r8 = (p000a.p002b.p011p.C0139c0) r8
            r10.f287m = r8
            android.view.Window$Callback r9 = r10.mo142c0()
            r8.setWindowCallback(r9)
            boolean r8 = r10.f254C
            if (r8 == 0) goto L_0x00c0
            a.b.p.c0 r8 = r10.f287m
            r8.mo978h(r2)
        L_0x00c0:
            boolean r2 = r10.f300z
            if (r2 == 0) goto L_0x00ca
            a.b.p.c0 r2 = r10.f287m
            r8 = 2
            r2.mo978h(r8)
        L_0x00ca:
            boolean r2 = r10.f252A
            if (r2 == 0) goto L_0x00d4
            a.b.p.c0 r2 = r10.f287m
            r8 = 5
            r2.mo978h(r8)
        L_0x00d4:
            goto L_0x0106
        L_0x00d5:
            boolean r2 = r10.f255D
            if (r2 == 0) goto L_0x00e3
            int r2 = p000a.p002b.C0009g.abc_screen_simple_overlay_action_mode
            android.view.View r2 = r1.inflate(r2, r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r5 = r2
            goto L_0x00ec
        L_0x00e3:
            int r2 = p000a.p002b.C0009g.abc_screen_simple
            android.view.View r2 = r1.inflate(r2, r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r5 = r2
        L_0x00ec:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r2 < r4) goto L_0x00fb
            a.b.k.f$c r2 = new a.b.k.f$c
            r2.<init>()
            p000a.p025h.p038m.C0460r.m2279n0(r5, r2)
            goto L_0x0106
        L_0x00fb:
            r2 = r5
            a.b.p.g0 r2 = (p000a.p002b.p011p.C0151g0) r2
            a.b.k.f$d r4 = new a.b.k.f$d
            r4.<init>()
            r2.setOnFitSystemWindowsListener(r4)
        L_0x0106:
            if (r5 == 0) goto L_0x015e
            a.b.p.c0 r2 = r10.f287m
            if (r2 != 0) goto L_0x0116
            int r2 = p000a.p002b.C0008f.title
            android.view.View r2 = r5.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.f298x = r2
        L_0x0116:
            p000a.p002b.p011p.C0140c1.m789c(r5)
            int r2 = p000a.p002b.C0008f.action_bar_activity_content
            android.view.View r2 = r5.findViewById(r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = (androidx.appcompat.widget.ContentFrameLayout) r2
            android.view.Window r4 = r10.f281g
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0150
        L_0x012e:
            int r8 = r4.getChildCount()
            if (r8 <= 0) goto L_0x013f
            android.view.View r8 = r4.getChildAt(r3)
            r4.removeViewAt(r3)
            r2.addView(r8)
            goto L_0x012e
        L_0x013f:
            r3 = -1
            r4.setId(r3)
            r2.setId(r6)
            boolean r3 = r4 instanceof android.widget.FrameLayout
            if (r3 == 0) goto L_0x0150
            r3 = r4
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.setForeground(r7)
        L_0x0150:
            android.view.Window r3 = r10.f281g
            r3.setContentView(r5)
            a.b.k.f$e r3 = new a.b.k.f$e
            r3.<init>()
            r2.setAttachListener(r3)
            return r5
        L_0x015e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppCompat does not support the current theme features: { windowActionBar: "
            r3.append(r4)
            boolean r4 = r10.f253B
            r3.append(r4)
            java.lang.String r4 = ", windowActionBarOverlay: "
            r3.append(r4)
            boolean r4 = r10.f254C
            r3.append(r4)
            java.lang.String r4 = ", android:windowIsFloating: "
            r3.append(r4)
            boolean r4 = r10.f256E
            r3.append(r4)
            java.lang.String r4 = ", windowActionModeOverlay: "
            r3.append(r4)
            boolean r4 = r10.f255D
            r3.append(r4)
            java.lang.String r4 = ", windowNoTitle: "
            r3.append(r4)
            boolean r4 = r10.f257F
            r3.append(r4)
            java.lang.String r4 = " }"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x01a4:
            r0.recycle()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p003k.C0022f.mo126O():android.view.ViewGroup");
    }

    /* renamed from: a.b.k.f$c */
    public class C0025c implements C0457o {
        public C0025c() {
        }

        /* renamed from: a */
        public C0479z mo171a(View v, C0479z insets) {
            int top = insets.mo2615d();
            int newTop = C0022f.this.mo120I0(top);
            if (top != newTop) {
                insets = insets.mo2618f(insets.mo2613b(), newTop, insets.mo2614c(), insets.mo2612a());
            }
            return C0460r.m2242Q(v, insets);
        }
    }

    /* renamed from: a.b.k.f$d */
    public class C0026d implements C0151g0.C0152a {
        public C0026d() {
        }

        /* renamed from: a */
        public void mo172a(Rect insets) {
            insets.top = C0022f.this.mo120I0(insets.top);
        }
    }

    /* renamed from: a.b.k.f$e */
    public class C0027e implements ContentFrameLayout.C0792a {
        public C0027e() {
        }

        /* renamed from: a */
        public void mo173a() {
        }

        public void onDetachedFromWindow() {
            C0022f.this.mo128Q();
        }
    }

    /* renamed from: t0 */
    public void mo161t0(ViewGroup subDecor) {
    }

    /* renamed from: G */
    public final void mo115G() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.f297w.findViewById(16908290);
        View windowDecor = this.f281g.getDecorView();
        cfl.mo4042b(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a = this.f280f.obtainStyledAttributes(C0012j.f213u0);
        a.getValue(C0012j.f33G0, cfl.getMinWidthMajor());
        a.getValue(C0012j.f37H0, cfl.getMinWidthMinor());
        int i = C0012j.f25E0;
        if (a.hasValue(i)) {
            a.getValue(i, cfl.getFixedWidthMajor());
        }
        int i2 = C0012j.f29F0;
        if (a.hasValue(i2)) {
            a.getValue(i2, cfl.getFixedWidthMinor());
        }
        int i3 = C0012j.f17C0;
        if (a.hasValue(i3)) {
            a.getValue(i3, cfl.getFixedHeightMajor());
        }
        int i4 = C0012j.f21D0;
        if (a.hasValue(i4)) {
            a.getValue(i4, cfl.getFixedHeightMinor());
        }
        a.recycle();
        cfl.requestLayout();
    }

    /* renamed from: y */
    public boolean mo105y(int featureId) {
        int featureId2 = mo167z0(featureId);
        if (this.f257F && featureId2 == 108) {
            return false;
        }
        if (this.f253B && featureId2 == 1) {
            this.f253B = false;
        }
        if (featureId2 == 1) {
            mo112E0();
            this.f257F = true;
            return true;
        } else if (featureId2 == 2) {
            mo112E0();
            this.f300z = true;
            return true;
        } else if (featureId2 == 5) {
            mo112E0();
            this.f252A = true;
            return true;
        } else if (featureId2 == 10) {
            mo112E0();
            this.f255D = true;
            return true;
        } else if (featureId2 == 108) {
            mo112E0();
            this.f253B = true;
            return true;
        } else if (featureId2 != 109) {
            return this.f281g.requestFeature(featureId2);
        } else {
            mo112E0();
            this.f254C = true;
            return true;
        }
    }

    /* renamed from: D */
    public final void mo88D(CharSequence title) {
        this.f286l = title;
        C0139c0 c0Var = this.f287m;
        if (c0Var != null) {
            c0Var.setWindowTitle(title);
        } else if (mo163v0() != null) {
            mo163v0().mo22t(title);
        } else {
            TextView textView = this.f298x;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    /* renamed from: b0 */
    public final CharSequence mo141b0() {
        Object obj = this.f279e;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f286l;
    }

    /* renamed from: s0 */
    public void mo160s0(int featureId) {
        if (featureId == 108) {
            C0013a ab = mo94k();
            if (ab != null) {
                ab.mo11i(false);
            }
        } else if (featureId == 0) {
            C0040o st = mo139a0(featureId, true);
            if (st.f336o) {
                mo125N(st, false);
            }
        }
    }

    /* renamed from: r0 */
    public void mo159r0(int featureId) {
        C0013a ab;
        if (featureId == 108 && (ab = mo94k()) != null) {
            ab.mo11i(true);
        }
    }

    /* renamed from: b */
    public boolean mo140b(C0098g menu, MenuItem item) {
        C0040o panel;
        Window.Callback cb = mo142c0();
        if (cb == null || this.f265N || (panel = mo134W(menu.mo617D())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f322a, item);
    }

    /* renamed from: a */
    public void mo138a(C0098g menu) {
        mo166y0(menu, true);
    }

    /* renamed from: C0 */
    public C0073b mo109C0(C0073b.C0074a callback) {
        C0020d dVar;
        if (callback != null) {
            C0073b bVar = this.f290p;
            if (bVar != null) {
                bVar.mo252c();
            }
            C0073b.C0074a wrappedCallback = new C0032i(callback);
            C0013a ab = mo94k();
            if (ab != null) {
                C0073b u = ab.mo23u(wrappedCallback);
                this.f290p = u;
                if (!(u == null || (dVar = this.f283i) == null)) {
                    dVar.mo49b(u);
                }
            }
            if (this.f290p == null) {
                this.f290p = mo110D0(wrappedCallback);
            }
            return this.f290p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: m */
    public void mo96m() {
        C0013a ab = mo94k();
        if (ab == null || !ab.mo14l()) {
            mo147h0(0);
        }
    }

    /* renamed from: D0 */
    public C0073b mo110D0(C0073b.C0074a callback) {
        C0020d dVar;
        Context actionBarContext;
        mo131T();
        C0073b bVar = this.f290p;
        if (bVar != null) {
            bVar.mo252c();
        }
        if (!(callback instanceof C0032i)) {
            callback = new C0032i(callback);
        }
        C0073b mode = null;
        C0020d dVar2 = this.f283i;
        if (dVar2 != null && !this.f265N) {
            try {
                mode = dVar2.mo54g(callback);
            } catch (AbstractMethodError e) {
            }
        }
        if (mode != null) {
            this.f290p = mode;
        } else {
            boolean z = true;
            if (this.f291q == null) {
                if (this.f256E) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f280f.getTheme();
                    baseTheme.resolveAttribute(C0003a.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f280f.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        actionBarContext = new C0076d(this.f280f, 0);
                        actionBarContext.getTheme().setTo(actionBarTheme);
                    } else {
                        actionBarContext = this.f280f;
                    }
                    this.f291q = new ActionBarContextView(actionBarContext);
                    PopupWindow popupWindow = new PopupWindow(actionBarContext, (AttributeSet) null, C0003a.actionModePopupWindowStyle);
                    this.f292r = popupWindow;
                    C0489h.m2424b(popupWindow, 2);
                    this.f292r.setContentView(this.f291q);
                    this.f292r.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(C0003a.actionBarSize, outValue, true);
                    this.f291q.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.f292r.setHeight(-2);
                    this.f293s = new C0028f();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.f297w.findViewById(C0008f.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(mo135X()));
                        this.f291q = (ActionBarContextView) stub.mo4287a();
                    }
                }
            }
            if (this.f291q != null) {
                mo131T();
                this.f291q.mo3952k();
                Context context = this.f291q.getContext();
                ActionBarContextView actionBarContextView = this.f291q;
                if (this.f292r != null) {
                    z = false;
                }
                C0073b mode2 = new C0077e(context, actionBarContextView, callback, z);
                if (callback.mo183d(mode2, mode2.mo254e())) {
                    mode2.mo258k();
                    this.f291q.mo3949h(mode2);
                    this.f290p = mode2;
                    if (mo107A0()) {
                        this.f291q.setAlpha(0.0f);
                        C0472v c = C0460r.m2256c(this.f291q);
                        c.mo2597a(1.0f);
                        this.f294t = c;
                        c.mo2602f(new C0030g());
                    } else {
                        this.f291q.setAlpha(1.0f);
                        this.f291q.setVisibility(0);
                        this.f291q.sendAccessibilityEvent(32);
                        if (this.f291q.getParent() instanceof View) {
                            C0460r.m2253a0((View) this.f291q.getParent());
                        }
                    }
                    if (this.f292r != null) {
                        this.f281g.getDecorView().post(this.f293s);
                    }
                } else {
                    this.f290p = null;
                }
            }
        }
        C0073b bVar2 = this.f290p;
        if (!(bVar2 == null || (dVar = this.f283i) == null)) {
            dVar.mo49b(bVar2);
        }
        return this.f290p;
    }

    /* renamed from: a.b.k.f$f */
    public class C0028f implements Runnable {
        public C0028f() {
        }

        public void run() {
            C0022f fVar = C0022f.this;
            fVar.f292r.showAtLocation(fVar.f291q, 55, 0, 0);
            C0022f.this.mo131T();
            if (C0022f.this.mo107A0()) {
                C0022f.this.f291q.setAlpha(0.0f);
                C0022f fVar2 = C0022f.this;
                C0472v c = C0460r.m2256c(fVar2.f291q);
                c.mo2597a(1.0f);
                fVar2.f294t = c;
                C0022f.this.f294t.mo2602f(new C0029a());
                return;
            }
            C0022f.this.f291q.setAlpha(1.0f);
            C0022f.this.f291q.setVisibility(0);
        }

        /* renamed from: a.b.k.f$f$a */
        public class C0029a extends C0477x {
            public C0029a() {
            }

            /* renamed from: b */
            public void mo177b(View view) {
                C0022f.this.f291q.setVisibility(0);
            }

            /* renamed from: a */
            public void mo176a(View view) {
                C0022f.this.f291q.setAlpha(1.0f);
                C0022f.this.f294t.mo2602f((C0476w) null);
                C0022f.this.f294t = null;
            }
        }
    }

    /* renamed from: a.b.k.f$g */
    public class C0030g extends C0477x {
        public C0030g() {
        }

        /* renamed from: b */
        public void mo177b(View view) {
            C0022f.this.f291q.setVisibility(0);
            C0022f.this.f291q.sendAccessibilityEvent(32);
            if (C0022f.this.f291q.getParent() instanceof View) {
                C0460r.m2253a0((View) C0022f.this.f291q.getParent());
            }
        }

        /* renamed from: a */
        public void mo176a(View view) {
            C0022f.this.f291q.setAlpha(1.0f);
            C0022f.this.f294t.mo2602f((C0476w) null);
            C0022f.this.f294t = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f297w;
     */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo107A0() {
        /*
            r1 = this;
            boolean r0 = r1.f296v
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f297w
            if (r0 == 0) goto L_0x0010
            boolean r0 = p000a.p025h.p038m.C0460r.m2235J(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p003k.C0022f.mo107A0():boolean");
    }

    /* renamed from: j0 */
    public boolean mo149j0() {
        return this.f295u;
    }

    /* renamed from: T */
    public void mo131T() {
        C0472v vVar = this.f294t;
        if (vVar != null) {
            vVar.mo2598b();
        }
    }

    /* renamed from: l0 */
    public boolean mo151l0() {
        C0073b bVar = this.f290p;
        if (bVar != null) {
            bVar.mo252c();
            return true;
        }
        C0013a ab = mo94k();
        if (ab == null || !ab.mo10h()) {
            return false;
        }
        return true;
    }

    /* renamed from: o0 */
    public boolean mo154o0(int keyCode, KeyEvent ev) {
        C0013a ab = mo94k();
        if (ab != null && ab.mo17o(keyCode, ev)) {
            return true;
        }
        C0040o oVar = this.f260I;
        if (oVar == null || !mo164w0(oVar, ev.getKeyCode(), ev, 1)) {
            if (this.f260I == null) {
                C0040o st = mo139a0(0, true);
                mo165x0(st, ev);
                boolean handled = mo164w0(st, ev.getKeyCode(), ev, 1);
                st.f334m = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        C0040o oVar2 = this.f260I;
        if (oVar2 != null) {
            oVar2.f335n = true;
        }
        return true;
    }

    /* renamed from: R */
    public boolean mo129R(KeyEvent event) {
        View root;
        Object obj = this.f279e;
        boolean isDown = true;
        if (((obj instanceof C0445d.C0446a) || (obj instanceof C0042g)) && (root = this.f281g.getDecorView()) != null && C0445d.m2178d(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f282h.mo469a().dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? mo152m0(keyCode, event) : mo157p0(keyCode, event);
    }

    /* renamed from: p0 */
    public boolean mo157p0(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.f261J;
            this.f261J = false;
            C0040o st = mo139a0(0, false);
            if (st != null && st.f336o) {
                if (!wasLongPressBackDown) {
                    mo125N(st, true);
                }
                return true;
            } else if (mo151l0()) {
                return true;
            }
        } else if (keyCode == 82) {
            mo158q0(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public boolean mo152m0(int keyCode, KeyEvent event) {
        boolean z = true;
        if (keyCode == 4) {
            if ((event.getFlags() & 128) == 0) {
                z = false;
            }
            this.f261J = z;
        } else if (keyCode == 82) {
            mo153n0(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public View mo127P(View parent, String name, Context context, AttributeSet attrs) {
        boolean z = false;
        if (this.f278a0 == null) {
            String viewInflaterClassName = this.f280f.obtainStyledAttributes(C0012j.f213u0).getString(C0012j.f231y0);
            if (viewInflaterClassName == null || AppCompatViewInflater.class.getName().equals(viewInflaterClassName)) {
                this.f278a0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f278a0 = (AppCompatViewInflater) Class.forName(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.f278a0 = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        boolean z2 = f248c0;
        if (z2) {
            if (!(attrs instanceof XmlPullParser)) {
                z = mo108B0((ViewParent) parent);
            } else if (((XmlPullParser) attrs).getDepth() > 1) {
                z = true;
            }
            inheritContext = z;
        }
        return this.f278a0.createView(parent, name, context, attrs, inheritContext, z2, true, C0130b1.m737b());
    }

    /* renamed from: B0 */
    public final boolean mo108B0(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f281g.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || C0460r.m2234I((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    /* renamed from: l */
    public void mo95l() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f280f);
        if (layoutInflater.getFactory() == null) {
            C0447e.m2183b(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof C0022f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return mo127P(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView((View) null, name, context, attrs);
    }

    /* renamed from: F0 */
    public final C0019c mo114F0() {
        for (Context context = this.f280f; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof C0019c) {
                return (C0019c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: u0 */
    public final void mo162u0(C0040o st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        C0040o oVar = st;
        if (!oVar.f336o && !this.f265N) {
            if (oVar.f322a == 0) {
                if ((this.f280f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = mo142c0();
            if (cb == null || cb.onMenuOpened(oVar.f322a, oVar.f331j)) {
                WindowManager wm = (WindowManager) this.f280f.getSystemService("window");
                if (wm != null && mo165x0(st, event)) {
                    int width = -2;
                    ViewGroup viewGroup = oVar.f328g;
                    if (viewGroup == null || oVar.f338q) {
                        if (viewGroup == null) {
                            if (!mo145f0(st) || oVar.f328g == null) {
                                return;
                            }
                        } else if (oVar.f338q && viewGroup.getChildCount() > 0) {
                            oVar.f328g.removeAllViews();
                        }
                        if (mo144e0(st) && st.mo206b()) {
                            ViewGroup.LayoutParams lp2 = oVar.f329h.getLayoutParams();
                            if (lp2 == null) {
                                lp2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.f328g.setBackgroundResource(oVar.f323b);
                            ViewParent shownPanelParent = oVar.f329h.getParent();
                            if (shownPanelParent instanceof ViewGroup) {
                                ((ViewGroup) shownPanelParent).removeView(oVar.f329h);
                            }
                            oVar.f328g.addView(oVar.f329h, lp2);
                            if (!oVar.f329h.hasFocus()) {
                                oVar.f329h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.f330i;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    oVar.f335n = false;
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(width, -2, oVar.f325d, oVar.f326e, 1002, 8519680, -3);
                    layoutParams.gravity = oVar.f324c;
                    layoutParams.windowAnimations = oVar.f327f;
                    wm.addView(oVar.f328g, layoutParams);
                    oVar.f336o = true;
                    return;
                }
                return;
            }
            mo125N(oVar, true);
        }
    }

    /* renamed from: f0 */
    public final boolean mo145f0(C0040o st) {
        st.mo208d(mo135X());
        st.f328g = new C0039n(st.f333l);
        st.f324c = 81;
        return true;
    }

    /* renamed from: y0 */
    public final void mo166y0(C0098g menu, boolean toggleMenuMode) {
        C0139c0 c0Var = this.f287m;
        if (c0Var == null || !c0Var.mo976f() || (ViewConfiguration.get(this.f280f).hasPermanentMenuKey() && !this.f287m.mo973c())) {
            C0040o st = mo139a0(0, true);
            st.f338q = true;
            mo125N(st, false);
            mo162u0(st, (KeyEvent) null);
            return;
        }
        Window.Callback cb = mo142c0();
        if (this.f287m.mo975e() && toggleMenuMode) {
            this.f287m.mo977g();
            if (!this.f265N) {
                cb.onPanelClosed(108, mo139a0(0, true).f331j);
            }
        } else if (cb != null && !this.f265N) {
            if (this.f272U && (this.f273V & 1) != 0) {
                this.f281g.getDecorView().removeCallbacks(this.f274W);
                this.f274W.run();
            }
            C0040o st2 = mo139a0(0, true);
            C0098g gVar = st2.f331j;
            if (gVar != null && !st2.f339r && cb.onPreparePanel(0, st2.f330i, gVar)) {
                cb.onMenuOpened(108, st2.f331j);
                this.f287m.mo971a();
            }
        }
    }

    /* renamed from: g0 */
    public final boolean mo146g0(C0040o st) {
        Context context = this.f280f;
        int i = st.f322a;
        if ((i == 0 || i == 108) && this.f287m != null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme baseTheme = context.getTheme();
            baseTheme.resolveAttribute(C0003a.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = context.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(C0003a.actionBarWidgetTheme, outValue, true);
            } else {
                baseTheme.resolveAttribute(C0003a.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = context.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                context = new C0076d(context, 0);
                context.getTheme().setTo(widgetTheme);
            }
        }
        C0098g menu = new C0098g(context);
        menu.mo631R(this);
        st.mo207c(menu);
        return true;
    }

    /* renamed from: e0 */
    public final boolean mo144e0(C0040o st) {
        View view = st.f330i;
        if (view != null) {
            st.f329h = view;
            return true;
        } else if (st.f331j == null) {
            return false;
        } else {
            if (this.f289o == null) {
                this.f289o = new C0041p();
            }
            View view2 = (View) st.mo205a(this.f289o);
            st.f329h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: x0 */
    public final boolean mo165x0(C0040o st, KeyEvent event) {
        C0139c0 c0Var;
        C0139c0 c0Var2;
        C0139c0 c0Var3;
        if (this.f265N) {
            return false;
        }
        if (st.f334m) {
            return true;
        }
        C0040o oVar = this.f260I;
        if (!(oVar == null || oVar == st)) {
            mo125N(oVar, false);
        }
        Window.Callback cb = mo142c0();
        if (cb != null) {
            st.f330i = cb.onCreatePanelView(st.f322a);
        }
        int i = st.f322a;
        boolean isActionBarMenu = i == 0 || i == 108;
        if (isActionBarMenu && (c0Var3 = this.f287m) != null) {
            c0Var3.mo974d();
        }
        if (st.f330i == null) {
            if (isActionBarMenu) {
                mo163v0();
            }
            C0098g gVar = st.f331j;
            if (gVar == null || st.f339r) {
                if (gVar == null && (!mo146g0(st) || st.f331j == null)) {
                    return false;
                }
                if (isActionBarMenu && this.f287m != null) {
                    if (this.f288n == null) {
                        this.f288n = new C0031h();
                    }
                    this.f287m.mo972b(st.f331j, this.f288n);
                }
                st.f331j.mo659d0();
                if (!cb.onCreatePanelMenu(st.f322a, st.f331j)) {
                    st.mo207c((C0098g) null);
                    if (isActionBarMenu && (c0Var2 = this.f287m) != null) {
                        c0Var2.mo972b((Menu) null, this.f288n);
                    }
                    return false;
                }
                st.f339r = false;
            }
            st.f331j.mo659d0();
            Bundle bundle = st.f340s;
            if (bundle != null) {
                st.f331j.mo629P(bundle);
                st.f340s = null;
            }
            if (!cb.onPreparePanel(0, st.f330i, st.f331j)) {
                if (isActionBarMenu && (c0Var = this.f287m) != null) {
                    c0Var.mo972b((Menu) null, this.f288n);
                }
                st.f331j.mo654c0();
                return false;
            }
            boolean z = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.f337p = z;
            st.f331j.setQwertyMode(z);
            st.f331j.mo654c0();
        }
        st.f334m = true;
        st.f335n = false;
        this.f260I = st;
        return true;
    }

    /* renamed from: K */
    public void mo122K(C0098g menu) {
        if (!this.f258G) {
            this.f258G = true;
            this.f287m.mo979j();
            Window.Callback cb = mo142c0();
            if (cb != null && !this.f265N) {
                cb.onPanelClosed(108, menu);
            }
            this.f258G = false;
        }
    }

    /* renamed from: M */
    public void mo124M(int featureId) {
        mo125N(mo139a0(featureId, true), true);
    }

    /* renamed from: N */
    public void mo125N(C0040o st, boolean doCallback) {
        ViewGroup viewGroup;
        C0139c0 c0Var;
        if (!doCallback || st.f322a != 0 || (c0Var = this.f287m) == null || !c0Var.mo975e()) {
            WindowManager wm = (WindowManager) this.f280f.getSystemService("window");
            if (!(wm == null || !st.f336o || (viewGroup = st.f328g) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    mo121J(st.f322a, st, (Menu) null);
                }
            }
            st.f334m = false;
            st.f335n = false;
            st.f336o = false;
            st.f329h = null;
            st.f338q = true;
            if (this.f260I == st) {
                this.f260I = null;
                return;
            }
            return;
        }
        mo122K(st.f331j);
    }

    /* renamed from: n0 */
    public final boolean mo153n0(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        C0040o st = mo139a0(featureId, true);
        if (!st.f336o) {
            return mo165x0(st, event);
        }
        return false;
    }

    /* renamed from: q0 */
    public final boolean mo158q0(int featureId, KeyEvent event) {
        C0139c0 c0Var;
        if (this.f290p != null) {
            return false;
        }
        boolean handled = false;
        C0040o st = mo139a0(featureId, true);
        if (featureId != 0 || (c0Var = this.f287m) == null || !c0Var.mo976f() || ViewConfiguration.get(this.f280f).hasPermanentMenuKey()) {
            if (st.f336o || st.f335n) {
                handled = st.f336o;
                mo125N(st, true);
            } else if (st.f334m) {
                boolean show = true;
                if (st.f339r) {
                    st.f334m = false;
                    show = mo165x0(st, event);
                }
                if (show) {
                    mo162u0(st, event);
                    handled = true;
                }
            }
        } else if (this.f287m.mo975e()) {
            handled = this.f287m.mo977g();
        } else if (!this.f265N && mo165x0(st, event)) {
            handled = this.f287m.mo971a();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f280f.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    /* renamed from: J */
    public void mo121J(int featureId, C0040o panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                C0040o[] oVarArr = this.f259H;
                if (featureId < oVarArr.length) {
                    panel = oVarArr[featureId];
                }
            }
            if (panel != null) {
                menu = panel.f331j;
            }
        }
        if ((panel == null || panel.f336o) && !this.f265N) {
            this.f282h.mo469a().onPanelClosed(featureId, menu);
        }
    }

    /* renamed from: W */
    public C0040o mo134W(Menu menu) {
        C0040o[] panels = this.f259H;
        int N = panels != null ? panels.length : 0;
        for (int i = 0; i < N; i++) {
            C0040o panel = panels[i];
            if (panel != null && panel.f331j == menu) {
                return panel;
            }
        }
        return null;
    }

    /* renamed from: a0 */
    public C0040o mo139a0(int featureId, boolean required) {
        C0040o[] oVarArr = this.f259H;
        C0040o[] ar = oVarArr;
        if (oVarArr == null || ar.length <= featureId) {
            C0040o[] nar = new C0040o[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.f259H = nar;
        }
        C0040o st = ar[featureId];
        if (st != null) {
            return st;
        }
        C0040o oVar = new C0040o(featureId);
        C0040o st2 = oVar;
        ar[featureId] = oVar;
        return st2;
    }

    /* renamed from: w0 */
    public final boolean mo164w0(C0040o st, int keyCode, KeyEvent event, int flags) {
        C0098g gVar;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.f334m || mo165x0(st, event)) && (gVar = st.f331j) != null) {
            handled = gVar.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.f287m == null) {
            mo125N(st, true);
        }
        return handled;
    }

    /* renamed from: h0 */
    public final void mo147h0(int featureId) {
        this.f273V |= 1 << featureId;
        if (!this.f272U) {
            C0460r.m2247V(this.f281g.getDecorView(), this.f274W);
            this.f272U = true;
        }
    }

    /* renamed from: S */
    public void mo130S(int featureId) {
        C0040o st;
        C0040o st2 = mo139a0(featureId, true);
        if (st2.f331j != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.f331j.mo630Q(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.f340s = savedActionViewStates;
            }
            st2.f331j.mo659d0();
            st2.f331j.clear();
        }
        st2.f339r = true;
        st2.f338q = true;
        if ((featureId == 108 || featureId == 0) && this.f287m != null && (st = mo139a0(0, false)) != null) {
            st.f334m = false;
            mo165x0(st, (KeyEvent) null);
        }
    }

    /* renamed from: I0 */
    public int mo120I0(int insetTop) {
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.f291q;
        int i = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) this.f291q.getLayoutParams();
            boolean mlpChanged = false;
            if (this.f291q.isShown()) {
                if (this.f276Y == null) {
                    this.f276Y = new Rect();
                    this.f277Z = new Rect();
                }
                Rect insets = this.f276Y;
                Rect localInsets = this.f277Z;
                insets.set(0, insetTop, 0, 0);
                C0140c1.m787a(this.f297w, insets, localInsets);
                if (mlp.topMargin != (localInsets.top == 0 ? insetTop : 0)) {
                    mlpChanged = true;
                    mlp.topMargin = insetTop;
                    View view = this.f299y;
                    if (view == null) {
                        View view2 = new View(this.f280f);
                        this.f299y = view2;
                        view2.setBackgroundColor(this.f280f.getResources().getColor(C0005c.abc_input_method_navigation_guard));
                        this.f297w.addView(this.f299y, -1, new ViewGroup.LayoutParams(-1, insetTop));
                    } else {
                        ViewGroup.LayoutParams lp = view.getLayoutParams();
                        if (lp.height != insetTop) {
                            lp.height = insetTop;
                            this.f299y.setLayoutParams(lp);
                        }
                    }
                }
                showStatusGuard = this.f299y != null;
                if (!this.f255D && showStatusGuard) {
                    insetTop = 0;
                }
            } else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
            }
            if (mlpChanged) {
                this.f291q.setLayoutParams(mlp);
            }
        }
        View view3 = this.f299y;
        if (view3 != null) {
            if (!showStatusGuard) {
                i = 8;
            }
            view3.setVisibility(i);
        }
        return insetTop;
    }

    /* renamed from: E0 */
    public final void mo112E0() {
        if (this.f296v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: z0 */
    public final int mo167z0(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: Q */
    public void mo128Q() {
        C0098g gVar;
        C0139c0 c0Var = this.f287m;
        if (c0Var != null) {
            c0Var.mo979j();
        }
        if (this.f292r != null) {
            this.f281g.getDecorView().removeCallbacks(this.f293s);
            if (this.f292r.isShowing()) {
                try {
                    this.f292r.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f292r = null;
        }
        mo131T();
        C0040o st = mo139a0(0, false);
        if (st != null && (gVar = st.f331j) != null) {
            gVar.close();
        }
    }

    /* renamed from: E */
    public boolean mo111E() {
        return mo113F(true);
    }

    /* renamed from: F */
    public final boolean mo113F(boolean allowRecreation) {
        if (this.f265N) {
            return false;
        }
        int nightMode = mo119I();
        boolean applied = mo116G0(mo150k0(nightMode), allowRecreation);
        if (nightMode == 0) {
            mo137Z().mo199e();
        } else {
            C0036l lVar = this.f270S;
            if (lVar != null) {
                lVar.mo198a();
            }
        }
        if (nightMode == 3) {
            mo136Y().mo199e();
        } else {
            C0036l lVar2 = this.f271T;
            if (lVar2 != null) {
                lVar2.mo198a();
            }
        }
        return applied;
    }

    /* renamed from: i */
    public int mo92i() {
        return this.f266O;
    }

    /* renamed from: k0 */
    public int mo150k0(int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode != -1) {
            if (mode != 0) {
                if (!(mode == 1 || mode == 2)) {
                    if (mode == 3) {
                        return mo136Y().mo196c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.f280f.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return mo137Z().mo196c();
            } else {
                return -1;
            }
        }
        return mode;
    }

    /* renamed from: I */
    public final int mo119I() {
        int i = this.f266O;
        return i != -100 ? i : C0021e.m58h();
    }

    /* renamed from: G0 */
    public final boolean mo116G0(int mode, boolean allowRecreation) {
        int newNightMode;
        int i = Build.VERSION.SDK_INT;
        boolean handled = false;
        int applicationNightMode = this.f280f.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        if (mode == 1) {
            newNightMode = 16;
        } else if (mode != 2) {
            newNightMode = applicationNightMode;
        } else {
            newNightMode = 32;
        }
        boolean activityHandlingUiMode = mo148i0();
        if ((f251f0 || newNightMode != applicationNightMode) && !activityHandlingUiMode && i >= 17 && !this.f262K && (this.f279e instanceof ContextThemeWrapper)) {
            Configuration conf = new Configuration();
            conf.uiMode = (conf.uiMode & -49) | newNightMode;
            try {
                ((ContextThemeWrapper) this.f279e).applyOverrideConfiguration(conf);
                handled = true;
            } catch (IllegalStateException e) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
                handled = false;
            }
        }
        int currentNightMode = this.f280f.getResources().getConfiguration().uiMode & 48;
        if (!handled && currentNightMode != newNightMode && allowRecreation && !activityHandlingUiMode && this.f262K && (i >= 17 || this.f263L)) {
            Object obj = this.f279e;
            if (obj instanceof Activity) {
                C0326a.m1745g((Activity) obj);
                handled = true;
            }
        }
        if (!handled && currentNightMode != newNightMode) {
            mo118H0(newNightMode, activityHandlingUiMode);
            handled = true;
        }
        if (handled) {
            Object obj2 = this.f279e;
            if (obj2 instanceof C0019c) {
                ((C0019c) obj2).mo82x(mode);
            }
        }
        return handled;
    }

    /* renamed from: H0 */
    public final void mo118H0(int uiModeNightModeValue, boolean callOnConfigChange) {
        Resources res = this.f280f.getResources();
        Configuration conf = new Configuration(res.getConfiguration());
        conf.uiMode = (res.getConfiguration().uiMode & -49) | uiModeNightModeValue;
        res.updateConfiguration(conf, (DisplayMetrics) null);
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            C0044h.m207a(res);
        }
        int i2 = this.f267P;
        if (i2 != 0) {
            this.f280f.setTheme(i2);
            if (i >= 23) {
                this.f280f.getTheme().applyStyle(this.f267P, true);
            }
        }
        if (callOnConfigChange) {
            Object obj = this.f279e;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0582g) {
                    if (((C0582g) activity).mo2824a().mo3100b().mo3102a(C0577d.C0579b.STARTED)) {
                        activity.onConfigurationChanged(conf);
                    }
                } else if (this.f264M) {
                    activity.onConfigurationChanged(conf);
                }
            }
        }
    }

    /* renamed from: Z */
    public final C0036l mo137Z() {
        if (this.f270S == null) {
            this.f270S = new C0038m(C0046j.m214a(this.f280f));
        }
        return this.f270S;
    }

    /* renamed from: Y */
    public final C0036l mo136Y() {
        if (this.f271T == null) {
            this.f271T = new C0035k(this.f280f);
        }
        return this.f271T;
    }

    /* renamed from: i0 */
    public final boolean mo148i0() {
        if (!this.f269R && (this.f279e instanceof Activity)) {
            PackageManager pm = this.f280f.getPackageManager();
            if (pm == null) {
                return false;
            }
            try {
                ActivityInfo info = pm.getActivityInfo(new ComponentName(this.f280f, this.f279e.getClass()), 0);
                this.f268Q = (info == null || (info.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f268Q = false;
            }
        }
        this.f269R = true;
        return this.f268Q;
    }

    /* renamed from: a.b.k.f$i */
    public class C0032i implements C0073b.C0074a {

        /* renamed from: a */
        public C0073b.C0074a f310a;

        public C0032i(C0073b.C0074a wrapped) {
            this.f310a = wrapped;
        }

        /* renamed from: d */
        public boolean mo183d(C0073b mode, Menu menu) {
            return this.f310a.mo183d(mode, menu);
        }

        /* renamed from: a */
        public boolean mo180a(C0073b mode, Menu menu) {
            return this.f310a.mo180a(mode, menu);
        }

        /* renamed from: c */
        public boolean mo182c(C0073b mode, MenuItem item) {
            return this.f310a.mo182c(mode, item);
        }

        /* renamed from: b */
        public void mo181b(C0073b mode) {
            this.f310a.mo181b(mode);
            C0022f fVar = C0022f.this;
            if (fVar.f292r != null) {
                fVar.f281g.getDecorView().removeCallbacks(C0022f.this.f293s);
            }
            C0022f fVar2 = C0022f.this;
            if (fVar2.f291q != null) {
                fVar2.mo131T();
                C0022f fVar3 = C0022f.this;
                C0472v c = C0460r.m2256c(fVar3.f291q);
                c.mo2597a(0.0f);
                fVar3.f294t = c;
                C0022f.this.f294t.mo2602f(new C0033a());
            }
            C0022f fVar4 = C0022f.this;
            C0020d dVar = fVar4.f283i;
            if (dVar != null) {
                dVar.mo52f(fVar4.f290p);
            }
            C0022f.this.f290p = null;
        }

        /* renamed from: a.b.k.f$i$a */
        public class C0033a extends C0477x {
            public C0033a() {
            }

            /* renamed from: a */
            public void mo176a(View view) {
                C0022f.this.f291q.setVisibility(8);
                C0022f fVar = C0022f.this;
                PopupWindow popupWindow = fVar.f292r;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f291q.getParent() instanceof View) {
                    C0460r.m2253a0((View) C0022f.this.f291q.getParent());
                }
                C0022f.this.f291q.removeAllViews();
                C0022f.this.f294t.mo2602f((C0476w) null);
                C0022f.this.f294t = null;
            }
        }
    }

    /* renamed from: a.b.k.f$p */
    public final class C0041p implements C0113m.C0114a {
        public C0041p() {
        }

        /* renamed from: b */
        public void mo178b(C0098g menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.mo617D();
            boolean isSubMenu = parentMenu != menu;
            C0040o panel = C0022f.this.mo134W(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                C0022f.this.mo121J(panel.f322a, panel, parentMenu);
                C0022f.this.mo125N(panel, true);
                return;
            }
            C0022f.this.mo125N(panel, allMenusAreClosing);
        }

        /* renamed from: c */
        public boolean mo179c(C0098g subMenu) {
            Window.Callback cb;
            if (subMenu != null) {
                return true;
            }
            C0022f fVar = C0022f.this;
            if (!fVar.f253B || (cb = fVar.mo142c0()) == null || C0022f.this.f265N) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }
    }

    /* renamed from: a.b.k.f$h */
    public final class C0031h implements C0113m.C0114a {
        public C0031h() {
        }

        /* renamed from: c */
        public boolean mo179c(C0098g subMenu) {
            Window.Callback cb = C0022f.this.mo142c0();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(108, subMenu);
            return true;
        }

        /* renamed from: b */
        public void mo178b(C0098g menu, boolean allMenusAreClosing) {
            C0022f.this.mo122K(menu);
        }
    }

    /* renamed from: a.b.k.f$o */
    public static final class C0040o {

        /* renamed from: a */
        public int f322a;

        /* renamed from: b */
        public int f323b;

        /* renamed from: c */
        public int f324c;

        /* renamed from: d */
        public int f325d;

        /* renamed from: e */
        public int f326e;

        /* renamed from: f */
        public int f327f;

        /* renamed from: g */
        public ViewGroup f328g;

        /* renamed from: h */
        public View f329h;

        /* renamed from: i */
        public View f330i;

        /* renamed from: j */
        public C0098g f331j;

        /* renamed from: k */
        public C0095e f332k;

        /* renamed from: l */
        public Context f333l;

        /* renamed from: m */
        public boolean f334m;

        /* renamed from: n */
        public boolean f335n;

        /* renamed from: o */
        public boolean f336o;

        /* renamed from: p */
        public boolean f337p;

        /* renamed from: q */
        public boolean f338q = false;

        /* renamed from: r */
        public boolean f339r;

        /* renamed from: s */
        public Bundle f340s;

        public C0040o(int featureId) {
            this.f322a = featureId;
        }

        /* renamed from: b */
        public boolean mo206b() {
            if (this.f329h == null) {
                return false;
            }
            if (this.f330i == null && this.f332k.mo596a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void mo208d(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(C0003a.actionBarPopupTheme, outValue, true);
            int i = outValue.resourceId;
            if (i != 0) {
                widgetTheme.applyStyle(i, true);
            }
            widgetTheme.resolveAttribute(C0003a.panelMenuListTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            } else {
                widgetTheme.applyStyle(C0011i.Theme_AppCompat_CompactMenu, true);
            }
            Context context2 = new C0076d(context, 0);
            context2.getTheme().setTo(widgetTheme);
            this.f333l = context2;
            TypedArray a = context2.obtainStyledAttributes(C0012j.f213u0);
            this.f323b = a.getResourceId(C0012j.f227x0, 0);
            this.f327f = a.getResourceId(C0012j.f223w0, 0);
            a.recycle();
        }

        /* renamed from: c */
        public void mo207c(C0098g menu) {
            C0095e eVar;
            C0098g gVar = this.f331j;
            if (menu != gVar) {
                if (gVar != null) {
                    gVar.mo628O(this.f332k);
                }
                this.f331j = menu;
                if (menu != null && (eVar = this.f332k) != null) {
                    menu.mo651b(eVar);
                }
            }
        }

        /* renamed from: a */
        public C0115n mo205a(C0113m.C0114a cb) {
            if (this.f331j == null) {
                return null;
            }
            if (this.f332k == null) {
                C0095e eVar = new C0095e(this.f333l, C0009g.abc_list_menu_item_layout);
                this.f332k = eVar;
                eVar.mo548d(cb);
                this.f331j.mo651b(this.f332k);
            }
            return this.f332k.mo597f(this.f328g);
        }
    }

    /* renamed from: a.b.k.f$n */
    public class C0039n extends ContentFrameLayout {
        public C0039n(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return C0022f.this.mo129R(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !mo201c((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            C0022f.this.mo124M(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(C0053a.m277d(getContext(), resid));
        }

        /* renamed from: c */
        public final boolean mo201c(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    /* renamed from: a.b.k.f$j */
    public class C0034j extends C0085i {
        public C0034j(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return C0022f.this.mo129R(event) || super.dispatchKeyEvent(event);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || C0022f.this.mo154o0(event.getKeyCode(), event);
        }

        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof C0098g)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        public void onContentChanged() {
        }

        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            C0098g mb = menu instanceof C0098g ? (C0098g) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.mo641a0(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.mo641a0(false);
            }
            return handled;
        }

        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            C0022f.this.mo159r0(featureId);
            return true;
        }

        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            C0022f.this.mo160s0(featureId);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (C0022f.this.mo149j0()) {
                return mo184b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* renamed from: b */
        public final ActionMode mo184b(ActionMode.Callback callback) {
            C0078f.C0079a callbackWrapper = new C0078f.C0079a(C0022f.this.f280f, callback);
            C0073b supportActionMode = C0022f.this.mo109C0(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.mo444e(supportActionMode);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (!C0022f.this.mo149j0() || type != 0) {
                return super.onWindowStartingActionMode(callback, type);
            }
            return mo184b(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            C0098g gVar;
            C0040o panel = C0022f.this.mo139a0(0, true);
            if (panel == null || (gVar = panel.f331j) == null) {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, gVar, deviceId);
            }
        }
    }

    /* renamed from: a.b.k.f$l */
    public abstract class C0036l {

        /* renamed from: a */
        public BroadcastReceiver f316a;

        /* renamed from: b */
        public abstract IntentFilter mo195b();

        /* renamed from: c */
        public abstract int mo196c();

        /* renamed from: d */
        public abstract void mo197d();

        public C0036l() {
        }

        /* renamed from: e */
        public void mo199e() {
            mo198a();
            IntentFilter filter = mo195b();
            if (filter != null && filter.countActions() != 0) {
                if (this.f316a == null) {
                    this.f316a = new C0037a();
                }
                C0022f.this.f280f.registerReceiver(this.f316a, filter);
            }
        }

        /* renamed from: a.b.k.f$l$a */
        public class C0037a extends BroadcastReceiver {
            public C0037a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0036l.this.mo197d();
            }
        }

        /* renamed from: a */
        public void mo198a() {
            BroadcastReceiver broadcastReceiver = this.f316a;
            if (broadcastReceiver != null) {
                try {
                    C0022f.this.f280f.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException e) {
                }
                this.f316a = null;
            }
        }
    }

    /* renamed from: a.b.k.f$m */
    public class C0038m extends C0036l {

        /* renamed from: c */
        public final C0046j f319c;

        public C0038m(C0046j twilightManager) {
            super();
            this.f319c = twilightManager;
        }

        /* renamed from: c */
        public int mo196c() {
            return this.f319c.mo225d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo197d() {
            C0022f.this.mo111E();
        }

        /* renamed from: b */
        public IntentFilter mo195b() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.TIME_SET");
            filter.addAction("android.intent.action.TIMEZONE_CHANGED");
            filter.addAction("android.intent.action.TIME_TICK");
            return filter;
        }
    }

    /* renamed from: a.b.k.f$k */
    public class C0035k extends C0036l {

        /* renamed from: c */
        public final PowerManager f314c;

        public C0035k(Context context) {
            super();
            this.f314c = (PowerManager) context.getSystemService("power");
        }

        /* renamed from: c */
        public int mo196c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f314c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo197d() {
            C0022f.this.mo111E();
        }

        /* renamed from: b */
        public IntentFilter mo195b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return filter;
        }
    }
}
