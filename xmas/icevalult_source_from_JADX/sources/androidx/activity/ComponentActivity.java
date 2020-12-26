package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.savedstate.SavedStateRegistry;
import p000a.p001a.C0002c;
import p000a.p025h.p026d.C0334d;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;
import p000a.p051m.C0583h;
import p000a.p051m.C0592o;
import p000a.p051m.C0598r;
import p000a.p051m.C0599s;
import p000a.p057p.C0657a;
import p000a.p057p.C0658b;

public class ComponentActivity extends C0334d implements C0582g, C0599s, C0658b, C0002c {

    /* renamed from: c */
    public final C0583h f2868c = new C0583h(this);

    /* renamed from: d */
    public final C0657a f2869d = C0657a.m3302a(this);

    /* renamed from: e */
    public C0598r f2870e;

    /* renamed from: f */
    public final OnBackPressedDispatcher f2871f = new OnBackPressedDispatcher(new C0762a());

    /* renamed from: g */
    public int f2872g;

    /* renamed from: androidx.activity.ComponentActivity$b */
    public static final class C0763b {

        /* renamed from: a */
        public Object f2876a;

        /* renamed from: b */
        public C0598r f2877b;
    }

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C0762a implements Runnable {
        public C0762a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public ComponentActivity() {
        if (mo2824a() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo2824a().mo3099a(new C0580e() {
                    /* renamed from: g */
                    public void mo3103g(C0582g source, C0577d.C0578a event) {
                        if (event == C0577d.C0578a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View decor = window != null ? window.peekDecorView() : null;
                            if (decor != null) {
                                decor.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo2824a().mo3099a(new C0580e() {
                /* renamed from: g */
                public void mo3103g(C0582g source, C0577d.C0578a event) {
                    if (event == C0577d.C0578a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo2825e().mo3136a();
                    }
                }
            });
            if (19 <= i && i <= 23) {
                mo2824a().mo3099a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f2869d.mo3431c(savedInstanceState);
        C0592o.m2952e(this);
        int i = this.f2872g;
        if (i != 0) {
            setContentView(i);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        C0577d lifecycle = mo2824a();
        if (lifecycle instanceof C0583h) {
            ((C0583h) lifecycle).mo3113p(C0577d.C0579b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.f2869d.mo3432d(outState);
    }

    public final Object onRetainNonConfigurationInstance() {
        C0763b nc;
        Object custom = mo3825k();
        C0598r viewModelStore = this.f2870e;
        if (viewModelStore == null && (nc = (C0763b) getLastNonConfigurationInstance()) != null) {
            viewModelStore = nc.f2877b;
        }
        if (viewModelStore == null && custom == null) {
            return null;
        }
        C0763b nci = new C0763b();
        nci.f2876a = custom;
        nci.f2877b = viewModelStore;
        return nci;
    }

    @Deprecated
    /* renamed from: k */
    public Object mo3825k() {
        return null;
    }

    /* renamed from: a */
    public C0577d mo2824a() {
        return this.f2868c;
    }

    /* renamed from: e */
    public C0598r mo2825e() {
        if (getApplication() != null) {
            if (this.f2870e == null) {
                C0763b nc = (C0763b) getLastNonConfigurationInstance();
                if (nc != null) {
                    this.f2870e = nc.f2877b;
                }
                if (this.f2870e == null) {
                    this.f2870e = new C0598r();
                }
            }
            return this.f2870e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f2871f.mo3831c();
    }

    /* renamed from: c */
    public final OnBackPressedDispatcher mo8c() {
        return this.f2871f;
    }

    /* renamed from: d */
    public final SavedStateRegistry mo3433d() {
        return this.f2869d.mo3430b();
    }
}
