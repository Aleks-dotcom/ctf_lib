package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p000a.p025h.p026d.C0336f;
import p000a.p025h.p037l.C0412a;
import p000a.p025h.p038m.C0447e;
import p000a.p046k.p047a.C0520d;
import p000a.p046k.p047a.C0522e;
import p000a.p046k.p047a.C0524g;
import p000a.p046k.p047a.C0525h;
import p000a.p046k.p047a.C0526i;
import p000a.p046k.p047a.C0529j;
import p000a.p046k.p047a.C0566r;
import p000a.p046k.p047a.C0567s;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;
import p000a.p051m.C0583h;
import p000a.p051m.C0589l;
import p000a.p051m.C0598r;
import p000a.p051m.C0599s;
import p000a.p052n.p053a.C0600a;
import p000a.p057p.C0657a;
import p000a.p057p.C0658b;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0582g, C0599s, C0658b {

    /* renamed from: X */
    public static final Object f3428X = new Object();

    /* renamed from: A */
    public boolean f3429A;

    /* renamed from: B */
    public boolean f3430B;

    /* renamed from: C */
    public boolean f3431C;

    /* renamed from: D */
    public boolean f3432D;

    /* renamed from: E */
    public boolean f3433E = true;

    /* renamed from: F */
    public boolean f3434F;

    /* renamed from: G */
    public ViewGroup f3435G;

    /* renamed from: H */
    public View f3436H;

    /* renamed from: I */
    public View f3437I;

    /* renamed from: J */
    public boolean f3438J;

    /* renamed from: K */
    public boolean f3439K = true;

    /* renamed from: L */
    public C0841d f3440L;

    /* renamed from: M */
    public boolean f3441M;

    /* renamed from: N */
    public boolean f3442N;

    /* renamed from: O */
    public float f3443O;

    /* renamed from: P */
    public LayoutInflater f3444P;

    /* renamed from: Q */
    public boolean f3445Q;

    /* renamed from: R */
    public C0577d.C0579b f3446R;

    /* renamed from: S */
    public C0583h f3447S;

    /* renamed from: T */
    public C0566r f3448T;

    /* renamed from: U */
    public C0589l<C0582g> f3449U;

    /* renamed from: V */
    public C0657a f3450V;

    /* renamed from: W */
    public int f3451W;

    /* renamed from: b */
    public int f3452b = 0;

    /* renamed from: c */
    public Bundle f3453c;

    /* renamed from: d */
    public SparseArray<Parcelable> f3454d;

    /* renamed from: e */
    public Boolean f3455e;

    /* renamed from: f */
    public String f3456f = UUID.randomUUID().toString();

    /* renamed from: g */
    public Bundle f3457g;

    /* renamed from: h */
    public Fragment f3458h;

    /* renamed from: i */
    public String f3459i = null;

    /* renamed from: j */
    public int f3460j;

    /* renamed from: k */
    public Boolean f3461k = null;

    /* renamed from: l */
    public boolean f3462l;

    /* renamed from: m */
    public boolean f3463m;

    /* renamed from: n */
    public boolean f3464n;

    /* renamed from: o */
    public boolean f3465o;

    /* renamed from: p */
    public boolean f3466p;

    /* renamed from: q */
    public boolean f3467q;

    /* renamed from: r */
    public int f3468r;

    /* renamed from: s */
    public C0529j f3469s;

    /* renamed from: t */
    public C0525h f3470t;

    /* renamed from: u */
    public C0529j f3471u = new C0529j();

    /* renamed from: v */
    public Fragment f3472v;

    /* renamed from: w */
    public int f3473w;

    /* renamed from: x */
    public int f3474x;

    /* renamed from: y */
    public String f3475y;

    /* renamed from: z */
    public boolean f3476z;

    /* renamed from: androidx.fragment.app.Fragment$f */
    public interface C0843f {
        /* renamed from: a */
        void mo3004a();

        /* renamed from: b */
        void mo3005b();
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C0838a implements Runnable {
        public C0838a() {
        }

        public void run() {
            Fragment.this.mo4651k1();
        }
    }

    /* renamed from: a */
    public C0577d mo2824a() {
        return this.f3447S;
    }

    /* renamed from: e */
    public C0598r mo2825e() {
        C0529j jVar = this.f3469s;
        if (jVar != null) {
            return jVar.mo2985v0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: d */
    public final SavedStateRegistry mo3433d() {
        return this.f3450V.mo3430b();
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0842e extends RuntimeException {
        public C0842e(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    public Fragment() {
        new C0838a();
        this.f3446R = C0577d.C0579b.RESUMED;
        this.f3449U = new C0589l<>();
        mo4592L();
    }

    /* renamed from: L */
    public final void mo4592L() {
        this.f3447S = new C0583h(this);
        this.f3450V = C0657a.m3302a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3447S.mo3099a(new C0580e() {
                /* renamed from: g */
                public void mo3103g(C0582g source, C0577d.C0578a event) {
                    View view;
                    if (event == C0577d.C0578a.ON_STOP && (view = Fragment.this.f3436H) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: N */
    public static Fragment m4135N(Context context, String fname, Bundle args) {
        try {
            Fragment f = (Fragment) C0524g.m2651d(context.getClassLoader(), fname).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f.getClass().getClassLoader());
                f.mo4631e1(args);
            }
            return f;
        } catch (InstantiationException e) {
            throw new C0842e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0842e("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0842e("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0842e("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: b1 */
    public final void mo4625b1(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f3454d;
        if (sparseArray != null) {
            this.f3437I.restoreHierarchyState(sparseArray);
            this.f3454d = null;
        }
        this.f3434F = false;
        mo4685z0(savedInstanceState);
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f3436H != null) {
            this.f3448T.mo3079b(C0577d.C0578a.ON_CREATE);
        }
    }

    /* renamed from: P */
    public final boolean mo4599P() {
        return this.f3468r > 0;
    }

    public final boolean equals(Object o) {
        return super.equals(o);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0412a.m2047a(this, sb);
        sb.append(" (");
        sb.append(this.f3456f);
        sb.append(")");
        if (this.f3473w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3473w));
        }
        if (this.f3475y != null) {
            sb.append(" ");
            sb.append(this.f3475y);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: e1 */
    public void mo4631e1(Bundle args) {
        if (this.f3469s == null || !mo4603R()) {
            this.f3457g = args;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* renamed from: n */
    public final Bundle mo4656n() {
        return this.f3457g;
    }

    /* renamed from: R */
    public final boolean mo4603R() {
        C0529j jVar = this.f3469s;
        if (jVar == null) {
            return false;
        }
        return jVar.mo2891C0();
    }

    /* renamed from: J */
    public final Fragment mo4588J() {
        String str;
        Fragment fragment = this.f3458h;
        if (fragment != null) {
            return fragment;
        }
        C0529j jVar = this.f3469s;
        if (jVar == null || (str = this.f3459i) == null) {
            return null;
        }
        return jVar.f2212h.get(str);
    }

    /* renamed from: p */
    public Context mo4663p() {
        C0525h hVar = this.f3470t;
        if (hVar == null) {
            return null;
        }
        return hVar.mo2864i();
    }

    /* renamed from: Y0 */
    public final Context mo4618Y0() {
        Context context = mo4663p();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: i */
    public final C0520d mo4643i() {
        C0525h hVar = this.f3470t;
        if (hVar == null) {
            return null;
        }
        return (C0520d) hVar.mo2863h();
    }

    /* renamed from: X0 */
    public final C0520d mo4616X0() {
        C0520d activity = mo4643i();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: v */
    public final Object mo4676v() {
        C0525h hVar = this.f3470t;
        if (hVar == null) {
            return null;
        }
        return hVar.mo2830m();
    }

    /* renamed from: C */
    public final Resources mo4574C() {
        return mo4618Y0().getResources();
    }

    /* renamed from: I */
    public final String mo4586I(int resId) {
        return mo4574C().getString(resId);
    }

    /* renamed from: u */
    public final C0526i mo4674u() {
        return this.f3469s;
    }

    /* renamed from: o */
    public final C0526i mo4658o() {
        if (this.f3470t != null) {
            return this.f3471u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: A */
    public final Fragment mo4570A() {
        return this.f3472v;
    }

    /* renamed from: j0 */
    public void mo4647j0(boolean hidden) {
    }

    /* renamed from: D */
    public final boolean mo4576D() {
        return this.f3430B;
    }

    /* renamed from: U */
    public void mo4609U(int requestCode, int resultCode, Intent data) {
    }

    /* renamed from: t0 */
    public void mo4672t0(int requestCode, String[] permissions, int[] grantResults) {
    }

    /* renamed from: i0 */
    public LayoutInflater mo4644i0(Bundle savedInstanceState) {
        return mo4678w(savedInstanceState);
    }

    /* renamed from: K0 */
    public LayoutInflater mo4591K0(Bundle savedInstanceState) {
        LayoutInflater layoutInflater = mo4644i0(savedInstanceState);
        this.f3444P = layoutInflater;
        return layoutInflater;
    }

    @Deprecated
    /* renamed from: w */
    public LayoutInflater mo4678w(Bundle savedFragmentState) {
        C0525h hVar = this.f3470t;
        if (hVar != null) {
            LayoutInflater result = hVar.mo2831n();
            C0529j jVar = this.f3471u;
            jVar.mo2980t0();
            C0447e.m2183b(result, jVar);
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: l0 */
    public void mo4653l0(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.f3434F = true;
        C0525h hVar = this.f3470t;
        Activity hostActivity = hVar == null ? null : hVar.mo2863h();
        if (hostActivity != null) {
            this.f3434F = false;
            mo4650k0(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    /* renamed from: k0 */
    public void mo4650k0(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.f3434F = true;
    }

    /* renamed from: X */
    public void mo4615X(Fragment childFragment) {
    }

    /* renamed from: W */
    public void mo4613W(Context context) {
        this.f3434F = true;
        C0525h hVar = this.f3470t;
        Activity hostActivity = hVar == null ? null : hVar.mo2863h();
        if (hostActivity != null) {
            this.f3434F = false;
            mo4611V(hostActivity);
        }
    }

    @Deprecated
    /* renamed from: V */
    public void mo4611V(Activity activity) {
        this.f3434F = true;
    }

    /* renamed from: a0 */
    public Animation mo4621a0(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: b0 */
    public Animator mo4624b0(int transit, boolean enter, int nextAnim) {
        return null;
    }

    /* renamed from: Z */
    public void mo4619Z(Bundle savedInstanceState) {
        this.f3434F = true;
        mo4622a1(savedInstanceState);
        if (!this.f3471u.mo2889B0(1)) {
            this.f3471u.mo2986w();
        }
    }

    /* renamed from: a1 */
    public void mo4622a1(Bundle savedInstanceState) {
        Parcelable p;
        if (savedInstanceState != null && (p = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            this.f3471u.mo2931X0(p);
            this.f3471u.mo2986w();
        }
    }

    /* renamed from: d0 */
    public View mo4628d0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = this.f3451W;
        if (i != 0) {
            return inflater.inflate(i, container, false);
        }
        return null;
    }

    /* renamed from: y0 */
    public void mo4683y0(View view, Bundle savedInstanceState) {
    }

    /* renamed from: K */
    public View mo4590K() {
        return this.f3436H;
    }

    /* renamed from: Z0 */
    public final View mo4620Z0() {
        View view = mo4590K();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: T */
    public void mo4607T(Bundle savedInstanceState) {
        this.f3434F = true;
    }

    /* renamed from: z0 */
    public void mo4685z0(Bundle savedInstanceState) {
        this.f3434F = true;
    }

    /* renamed from: w0 */
    public void mo4679w0() {
        this.f3434F = true;
    }

    /* renamed from: u0 */
    public void mo4675u0() {
        this.f3434F = true;
    }

    /* renamed from: v0 */
    public void mo4677v0(Bundle outState) {
    }

    /* renamed from: m0 */
    public void mo4655m0(boolean isInMultiWindowMode) {
    }

    /* renamed from: q0 */
    public void mo4666q0(boolean isInPictureInPictureMode) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.f3434F = true;
    }

    /* renamed from: s0 */
    public void mo4670s0(boolean isPrimaryNavigationFragment) {
    }

    /* renamed from: p0 */
    public void mo4664p0() {
        this.f3434F = true;
    }

    /* renamed from: x0 */
    public void mo4681x0() {
        this.f3434F = true;
    }

    public void onLowMemory() {
        this.f3434F = true;
    }

    /* renamed from: g0 */
    public void mo4637g0() {
        this.f3434F = true;
    }

    /* renamed from: e0 */
    public void mo4630e0() {
        this.f3434F = true;
    }

    /* renamed from: M */
    public void mo4594M() {
        mo4592L();
        this.f3456f = UUID.randomUUID().toString();
        this.f3462l = false;
        this.f3463m = false;
        this.f3464n = false;
        this.f3465o = false;
        this.f3466p = false;
        this.f3468r = 0;
        this.f3469s = null;
        this.f3471u = new C0529j();
        this.f3470t = null;
        this.f3473w = 0;
        this.f3474x = 0;
        this.f3475y = null;
        this.f3476z = false;
        this.f3429A = false;
    }

    /* renamed from: h0 */
    public void mo4640h0() {
        this.f3434F = true;
    }

    /* renamed from: c0 */
    public void mo4626c0(Menu menu, MenuInflater inflater) {
    }

    /* renamed from: r0 */
    public void mo4668r0(Menu menu) {
    }

    /* renamed from: f0 */
    public void mo4634f0() {
    }

    /* renamed from: n0 */
    public boolean mo4657n0(MenuItem item) {
        return false;
    }

    /* renamed from: o0 */
    public void mo4659o0(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        mo4616X0().onCreateContextMenu(menu, v, menuInfo);
    }

    /* renamed from: Y */
    public boolean mo4617Y(MenuItem item) {
        return false;
    }

    /* renamed from: q */
    public Object mo4665q() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3487g;
    }

    /* renamed from: E */
    public Object mo4578E() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3488h;
        return obj == f3428X ? mo4665q() : obj;
    }

    /* renamed from: s */
    public Object mo4669s() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3489i;
    }

    /* renamed from: B */
    public Object mo4572B() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3490j;
        return obj == f3428X ? mo4669s() : obj;
    }

    /* renamed from: F */
    public Object mo4580F() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3491k;
    }

    /* renamed from: G */
    public Object mo4582G() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3492l;
        if (obj == f3428X) {
            return mo4580F();
        }
        return obj;
    }

    /* renamed from: j */
    public boolean mo4646j() {
        Boolean bool;
        C0841d dVar = this.f3440L;
        if (dVar == null || (bool = dVar.f3494n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: k */
    public boolean mo4649k() {
        Boolean bool;
        C0841d dVar = this.f3440L;
        if (dVar == null || (bool = dVar.f3493m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: k1 */
    public void mo4651k1() {
        C0529j jVar = this.f3469s;
        if (jVar == null || jVar.f2222r == null) {
            mo4636g().f3497q = false;
        } else if (Looper.myLooper() != this.f3469s.f2222r.mo2865j().getLooper()) {
            this.f3469s.f2222r.mo2865j().postAtFrontOfQueue(new C0839b());
        } else {
            mo4623b();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C0839b implements Runnable {
        public C0839b() {
        }

        public void run() {
            Fragment.this.mo4623b();
        }
    }

    /* renamed from: b */
    public void mo4623b() {
        C0843f listener;
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            listener = null;
        } else {
            dVar.f3497q = false;
            C0843f listener2 = dVar.f3498r;
            dVar.f3498r = null;
            listener = listener2;
        }
        if (listener != null) {
            listener.mo3004a();
        }
    }

    /* renamed from: f */
    public void mo4633f(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.f3473w));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.f3474x));
        writer.print(" mTag=");
        writer.println(this.f3475y);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.f3452b);
        writer.print(" mWho=");
        writer.print(this.f3456f);
        writer.print(" mBackStackNesting=");
        writer.println(this.f3468r);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.f3462l);
        writer.print(" mRemoving=");
        writer.print(this.f3463m);
        writer.print(" mFromLayout=");
        writer.print(this.f3464n);
        writer.print(" mInLayout=");
        writer.println(this.f3465o);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.f3476z);
        writer.print(" mDetached=");
        writer.print(this.f3429A);
        writer.print(" mMenuVisible=");
        writer.print(this.f3433E);
        writer.print(" mHasMenu=");
        writer.println(this.f3432D);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.f3430B);
        writer.print(" mUserVisibleHint=");
        writer.println(this.f3439K);
        if (this.f3469s != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.f3469s);
        }
        if (this.f3470t != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.f3470t);
        }
        if (this.f3472v != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.f3472v);
        }
        if (this.f3457g != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.f3457g);
        }
        if (this.f3453c != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.f3453c);
        }
        if (this.f3454d != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.f3454d);
        }
        Fragment target = mo4588J();
        if (target != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(target);
            writer.print(" mTargetRequestCode=");
            writer.println(this.f3460j);
        }
        if (mo4680x() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(mo4680x());
        }
        if (this.f3435G != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.f3435G);
        }
        if (this.f3436H != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.f3436H);
        }
        if (this.f3437I != null) {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(this.f3436H);
        }
        if (mo4652l() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(mo4652l());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(mo4584H());
        }
        if (mo4663p() != null) {
            C0600a.m2972b(this).mo3139a(prefix, fd, writer, args);
        }
        writer.print(prefix);
        writer.println("Child " + this.f3471u + ":");
        C0529j jVar = this.f3471u;
        jVar.mo2866a(prefix + "  ", fd, writer, args);
    }

    /* renamed from: h */
    public Fragment mo4639h(String who) {
        if (who.equals(this.f3456f)) {
            return this;
        }
        return this.f3471u.mo2962l0(who);
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C0840c extends C0522e {
        public C0840c() {
        }

        /* renamed from: f */
        public View mo2826f(int id) {
            View view = Fragment.this.f3436H;
            if (view != null) {
                return view.findViewById(id);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        /* renamed from: g */
        public boolean mo2827g() {
            return Fragment.this.f3436H != null;
        }
    }

    /* renamed from: B0 */
    public void mo4573B0() {
        this.f3471u.mo2958k(this.f3470t, new C0840c(), this);
        this.f3434F = false;
        mo4613W(this.f3470t.mo2864i());
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* renamed from: E0 */
    public void mo4579E0(Bundle savedInstanceState) {
        this.f3471u.mo2911N0();
        this.f3452b = 1;
        this.f3434F = false;
        this.f3450V.mo3431c(savedInstanceState);
        mo4619Z(savedInstanceState);
        this.f3445Q = true;
        if (this.f3434F) {
            this.f3447S.mo3107i(C0577d.C0578a.ON_CREATE);
            return;
        }
        throw new C0567s("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: G0 */
    public void mo4583G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.f3471u.mo2911N0();
        this.f3467q = true;
        this.f3448T = new C0566r();
        View d0 = mo4628d0(inflater, container, savedInstanceState);
        this.f3436H = d0;
        if (d0 != null) {
            this.f3448T.mo3080e();
            this.f3449U.mo3116h(this.f3448T);
        } else if (!this.f3448T.mo3081f()) {
            this.f3448T = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: A0 */
    public void mo4571A0(Bundle savedInstanceState) {
        this.f3471u.mo2911N0();
        this.f3452b = 2;
        this.f3434F = false;
        mo4607T(savedInstanceState);
        if (this.f3434F) {
            this.f3471u.mo2979t();
            return;
        }
        throw new C0567s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: V0 */
    public void mo4612V0() {
        this.f3471u.mo2911N0();
        this.f3471u.mo2946f0();
        this.f3452b = 3;
        this.f3434F = false;
        mo4679w0();
        if (this.f3434F) {
            C0583h hVar = this.f3447S;
            C0577d.C0578a aVar = C0577d.C0578a.ON_START;
            hVar.mo3107i(aVar);
            if (this.f3436H != null) {
                this.f3448T.mo3079b(aVar);
            }
            this.f3471u.mo2932Y();
            return;
        }
        throw new C0567s("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: T0 */
    public void mo4608T0() {
        this.f3471u.mo2911N0();
        this.f3471u.mo2946f0();
        this.f3452b = 4;
        this.f3434F = false;
        mo4675u0();
        if (this.f3434F) {
            C0583h hVar = this.f3447S;
            C0577d.C0578a aVar = C0577d.C0578a.ON_RESUME;
            hVar.mo3107i(aVar);
            if (this.f3436H != null) {
                this.f3448T.mo3079b(aVar);
            }
            this.f3471u.mo2930X();
            this.f3471u.mo2946f0();
            return;
        }
        throw new C0567s("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: S */
    public void mo4605S() {
        this.f3471u.mo2911N0();
    }

    /* renamed from: S0 */
    public void mo4606S0() {
        boolean isPrimaryNavigationFragment = this.f3469s.mo2887A0(this);
        Boolean bool = this.f3461k;
        if (bool == null || bool.booleanValue() != isPrimaryNavigationFragment) {
            this.f3461k = Boolean.valueOf(isPrimaryNavigationFragment);
            mo4670s0(isPrimaryNavigationFragment);
            this.f3471u.mo2928W();
        }
    }

    /* renamed from: M0 */
    public void mo4595M0(boolean isInMultiWindowMode) {
        mo4655m0(isInMultiWindowMode);
        this.f3471u.mo2888B(isInMultiWindowMode);
    }

    /* renamed from: Q0 */
    public void mo4602Q0(boolean isInPictureInPictureMode) {
        mo4666q0(isInPictureInPictureMode);
        this.f3471u.mo2924U(isInPictureInPictureMode);
    }

    /* renamed from: C0 */
    public void mo4575C0(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        this.f3471u.mo2982u(newConfig);
    }

    /* renamed from: L0 */
    public void mo4593L0() {
        onLowMemory();
        this.f3471u.mo2886A();
    }

    /* renamed from: F0 */
    public boolean mo4581F0(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.f3476z) {
            return false;
        }
        if (this.f3432D && this.f3433E) {
            show = true;
            mo4626c0(menu, inflater);
        }
        return show | this.f3471u.mo2988x(menu, inflater);
    }

    /* renamed from: R0 */
    public boolean mo4604R0(Menu menu) {
        boolean show = false;
        if (this.f3476z) {
            return false;
        }
        if (this.f3432D && this.f3433E) {
            show = true;
            mo4668r0(menu);
        }
        return show | this.f3471u.mo2926V(menu);
    }

    /* renamed from: N0 */
    public boolean mo4596N0(MenuItem item) {
        if (this.f3476z) {
            return false;
        }
        if ((!this.f3432D || !this.f3433E || !mo4657n0(item)) && !this.f3471u.mo2916Q(item)) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    public boolean mo4577D0(MenuItem item) {
        if (this.f3476z) {
            return false;
        }
        if (!mo4617Y(item) && !this.f3471u.mo2984v(item)) {
            return false;
        }
        return true;
    }

    /* renamed from: O0 */
    public void mo4598O0(Menu menu) {
        if (!this.f3476z) {
            if (this.f3432D && this.f3433E) {
                mo4659o0(menu);
            }
            this.f3471u.mo2918R(menu);
        }
    }

    /* renamed from: U0 */
    public void mo4610U0(Bundle outState) {
        mo4677v0(outState);
        this.f3450V.mo3432d(outState);
        Parcelable p = this.f3471u.mo2934Z0();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
    }

    /* renamed from: P0 */
    public void mo4600P0() {
        this.f3471u.mo2922T();
        if (this.f3436H != null) {
            this.f3448T.mo3079b(C0577d.C0578a.ON_PAUSE);
        }
        this.f3447S.mo3107i(C0577d.C0578a.ON_PAUSE);
        this.f3452b = 3;
        this.f3434F = false;
        mo4664p0();
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: W0 */
    public void mo4614W0() {
        this.f3471u.mo2935a0();
        if (this.f3436H != null) {
            this.f3448T.mo3079b(C0577d.C0578a.ON_STOP);
        }
        this.f3447S.mo3107i(C0577d.C0578a.ON_STOP);
        this.f3452b = 2;
        this.f3434F = false;
        mo4681x0();
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: I0 */
    public void mo4587I0() {
        this.f3471u.mo2992z();
        if (this.f3436H != null) {
            this.f3448T.mo3079b(C0577d.C0578a.ON_DESTROY);
        }
        this.f3452b = 1;
        this.f3434F = false;
        mo4637g0();
        if (this.f3434F) {
            C0600a.m2972b(this).mo3140c();
            this.f3467q = false;
            return;
        }
        throw new C0567s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: H0 */
    public void mo4585H0() {
        this.f3471u.mo2990y();
        this.f3447S.mo3107i(C0577d.C0578a.ON_DESTROY);
        this.f3452b = 0;
        this.f3434F = false;
        this.f3445Q = false;
        mo4630e0();
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* renamed from: J0 */
    public void mo4589J0() {
        this.f3434F = false;
        mo4640h0();
        this.f3444P = null;
        if (!this.f3434F) {
            throw new C0567s("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3471u.mo2991y0()) {
            this.f3471u.mo2990y();
            this.f3471u = new C0529j();
        }
    }

    /* renamed from: i1 */
    public void mo4645i1(C0843f listener) {
        mo4636g();
        C0841d dVar = this.f3440L;
        C0843f fVar = dVar.f3498r;
        if (listener != fVar) {
            if (listener == null || fVar == null) {
                if (dVar.f3497q) {
                    dVar.f3498r = listener;
                }
                if (listener != null) {
                    listener.mo3005b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: g */
    public final C0841d mo4636g() {
        if (this.f3440L == null) {
            this.f3440L = new C0841d();
        }
        return this.f3440L;
    }

    /* renamed from: x */
    public int mo4680x() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3484d;
    }

    /* renamed from: g1 */
    public void mo4638g1(int animResourceId) {
        if (this.f3440L != null || animResourceId != 0) {
            mo4636g().f3484d = animResourceId;
        }
    }

    /* renamed from: y */
    public int mo4682y() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3485e;
    }

    /* renamed from: h1 */
    public void mo4641h1(int nextTransition, int nextTransitionStyle) {
        if (this.f3440L != null || nextTransition != 0 || nextTransitionStyle != 0) {
            mo4636g();
            C0841d dVar = this.f3440L;
            dVar.f3485e = nextTransition;
            dVar.f3486f = nextTransitionStyle;
        }
    }

    /* renamed from: z */
    public int mo4684z() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3486f;
    }

    /* renamed from: r */
    public C0336f mo4667r() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3495o;
    }

    /* renamed from: t */
    public C0336f mo4671t() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3496p;
    }

    /* renamed from: l */
    public View mo4652l() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3481a;
    }

    /* renamed from: c1 */
    public void mo4627c1(View view) {
        mo4636g().f3481a = view;
    }

    /* renamed from: d1 */
    public void mo4629d1(Animator animator) {
        mo4636g().f3482b = animator;
    }

    /* renamed from: m */
    public Animator mo4654m() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return null;
        }
        return dVar.f3482b;
    }

    /* renamed from: H */
    public int mo4584H() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3483c;
    }

    /* renamed from: j1 */
    public void mo4648j1(int state) {
        mo4636g().f3483c = state;
    }

    /* renamed from: Q */
    public boolean mo4601Q() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return false;
        }
        return dVar.f3497q;
    }

    /* renamed from: O */
    public boolean mo4597O() {
        C0841d dVar = this.f3440L;
        if (dVar == null) {
            return false;
        }
        return dVar.f3499s;
    }

    /* renamed from: f1 */
    public void mo4635f1(boolean replaced) {
        mo4636g().f3499s = replaced;
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public static class C0841d {

        /* renamed from: a */
        public View f3481a;

        /* renamed from: b */
        public Animator f3482b;

        /* renamed from: c */
        public int f3483c;

        /* renamed from: d */
        public int f3484d;

        /* renamed from: e */
        public int f3485e;

        /* renamed from: f */
        public int f3486f;

        /* renamed from: g */
        public Object f3487g = null;

        /* renamed from: h */
        public Object f3488h;

        /* renamed from: i */
        public Object f3489i;

        /* renamed from: j */
        public Object f3490j;

        /* renamed from: k */
        public Object f3491k;

        /* renamed from: l */
        public Object f3492l;

        /* renamed from: m */
        public Boolean f3493m;

        /* renamed from: n */
        public Boolean f3494n;

        /* renamed from: o */
        public C0336f f3495o;

        /* renamed from: p */
        public C0336f f3496p;

        /* renamed from: q */
        public boolean f3497q;

        /* renamed from: r */
        public C0843f f3498r;

        /* renamed from: s */
        public boolean f3499s;

        public C0841d() {
            Object obj = Fragment.f3428X;
            this.f3488h = obj;
            this.f3489i = null;
            this.f3490j = obj;
            this.f3491k = null;
            this.f3492l = obj;
        }
    }
}
