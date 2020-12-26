package p000a.p046k.p047a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.C0001b;
import p000a.p018e.C0258b;
import p000a.p025h.p037l.C0412a;
import p000a.p025h.p037l.C0413b;
import p000a.p025h.p038m.C0458p;
import p000a.p046k.p047a.C0526i;
import p000a.p051m.C0577d;
import p000a.p051m.C0598r;

/* renamed from: a.k.a.j */
public final class C0529j extends C0526i implements LayoutInflater.Factory2 {

    /* renamed from: I */
    public static boolean f2197I = false;

    /* renamed from: J */
    public static final Interpolator f2198J = new DecelerateInterpolator(2.5f);

    /* renamed from: K */
    public static final Interpolator f2199K = new DecelerateInterpolator(1.5f);

    /* renamed from: A */
    public ArrayList<C0516a> f2200A;

    /* renamed from: B */
    public ArrayList<Boolean> f2201B;

    /* renamed from: C */
    public ArrayList<Fragment> f2202C;

    /* renamed from: D */
    public Bundle f2203D = null;

    /* renamed from: E */
    public SparseArray<Parcelable> f2204E = null;

    /* renamed from: F */
    public ArrayList<C0542l> f2205F;

    /* renamed from: G */
    public C0545l f2206G;

    /* renamed from: H */
    public Runnable f2207H = new C0531b();

    /* renamed from: d */
    public ArrayList<C0541k> f2208d;

    /* renamed from: e */
    public boolean f2209e;

    /* renamed from: f */
    public int f2210f = 0;

    /* renamed from: g */
    public final ArrayList<Fragment> f2211g = new ArrayList<>();

    /* renamed from: h */
    public final HashMap<String, Fragment> f2212h = new HashMap<>();

    /* renamed from: i */
    public ArrayList<C0516a> f2213i;

    /* renamed from: j */
    public ArrayList<Fragment> f2214j;

    /* renamed from: k */
    public OnBackPressedDispatcher f2215k;

    /* renamed from: l */
    public final C0001b f2216l = new C0530a(false);

    /* renamed from: m */
    public ArrayList<C0516a> f2217m;

    /* renamed from: n */
    public ArrayList<Integer> f2218n;

    /* renamed from: o */
    public ArrayList<C0526i.C0528b> f2219o;

    /* renamed from: p */
    public final CopyOnWriteArrayList<C0539i> f2220p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    public int f2221q = 0;

    /* renamed from: r */
    public C0525h f2222r;

    /* renamed from: s */
    public C0522e f2223s;

    /* renamed from: t */
    public Fragment f2224t;

    /* renamed from: u */
    public Fragment f2225u;

    /* renamed from: v */
    public boolean f2226v;

    /* renamed from: w */
    public boolean f2227w;

    /* renamed from: x */
    public boolean f2228x;

    /* renamed from: y */
    public boolean f2229y;

    /* renamed from: z */
    public boolean f2230z;

    /* renamed from: a.k.a.j$i */
    public static final class C0539i {

        /* renamed from: a */
        public final C0526i.C0527a f2252a;

        /* renamed from: b */
        public final boolean f2253b;
    }

    /* renamed from: a.k.a.j$j */
    public static class C0540j {

        /* renamed from: a */
        public static final int[] f2254a = {16842755, 16842960, 16842961};
    }

    /* renamed from: a.k.a.j$k */
    public interface C0541k {
        /* renamed from: a */
        boolean mo2778a(ArrayList<C0516a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: a.k.a.j$a */
    public class C0530a extends C0001b {
        public C0530a(boolean x0) {
            super(x0);
        }

        /* renamed from: b */
        public void mo3b() {
            C0529j.this.mo2987w0();
        }
    }

    /* renamed from: a.k.a.j$b */
    public class C0531b implements Runnable {
        public C0531b() {
        }

        public void run() {
            C0529j.this.mo2946f0();
        }
    }

    /* renamed from: i1 */
    public final void mo2955i1(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter pw = new PrintWriter(new C0413b("FragmentManager"));
        C0525h hVar = this.f2222r;
        if (hVar != null) {
            try {
                hVar.mo2829l("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo2866a("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw ex;
    }

    /* renamed from: k1 */
    public final void mo2960k1() {
        ArrayList<C0541k> arrayList = this.f2208d;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            C0001b bVar = this.f2216l;
            if (mo2974q0() <= 0 || !mo2887A0(this.f2224t)) {
                z = false;
            }
            bVar.mo7f(z);
            return;
        }
        this.f2216l.mo7f(true);
    }

    /* renamed from: A0 */
    public boolean mo2887A0(Fragment parent) {
        if (parent == null) {
            return true;
        }
        C0529j parentFragmentManager = parent.f3469s;
        if (parent != parentFragmentManager.mo2983u0() || !mo2887A0(parentFragmentManager.f2224t)) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    public void mo2987w0() {
        mo2946f0();
        if (this.f2216l.mo4c()) {
            mo2869d();
        } else {
            this.f2215k.mo3831c();
        }
    }

    /* renamed from: d */
    public boolean mo2869d() {
        mo2967o();
        return mo2915P0((String) null, -1, 0);
    }

    /* renamed from: P0 */
    public final boolean mo2915P0(String name, int id, int flags) {
        mo2946f0();
        mo2941d0(true);
        Fragment fragment = this.f2225u;
        if (fragment != null && id < 0 && name == null && fragment.mo4658o().mo2869d()) {
            return true;
        }
        boolean executePop = mo2917Q0(this.f2200A, this.f2201B, name, id, flags);
        if (executePop) {
            this.f2209e = true;
            try {
                mo2925U0(this.f2200A, this.f2201B);
            } finally {
                mo2971p();
            }
        }
        mo2960k1();
        mo2937b0();
        mo2963m();
        return executePop;
    }

    /* renamed from: q0 */
    public int mo2974q0() {
        ArrayList<C0516a> arrayList = this.f2213i;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: S0 */
    public void mo2921S0(Bundle bundle, String key, Fragment fragment) {
        if (fragment.f3469s == this) {
            bundle.putString(key, fragment.f3456f);
            return;
        }
        mo2955i1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: s0 */
    public Fragment mo2978s0(Bundle bundle, String key) {
        String who = bundle.getString(key);
        if (who == null) {
            return null;
        }
        Fragment f = this.f2212h.get(who);
        if (f != null) {
            return f;
        }
        mo2955i1(new IllegalStateException("Fragment no longer exists for key " + key + ": unique id " + who));
        throw null;
    }

    /* renamed from: c */
    public List<Fragment> mo2868c() {
        List<Fragment> list;
        if (this.f2211g.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2211g) {
            list = (List) this.f2211g.clone();
        }
        return list;
    }

    /* renamed from: v0 */
    public C0598r mo2985v0(Fragment f) {
        return this.f2206G.mo3022i(f);
    }

    /* renamed from: r0 */
    public C0545l mo2976r0(Fragment f) {
        return this.f2206G.mo3019f(f);
    }

    /* renamed from: i */
    public void mo2953i(Fragment f) {
        if (mo2891C0()) {
            if (f2197I) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f2206G.mo3016d(f) && f2197I) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + f);
        }
    }

    /* renamed from: V0 */
    public void mo2927V0(Fragment f) {
        if (mo2891C0()) {
            if (f2197I) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f2206G.mo3024k(f) && f2197I) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + f);
        }
    }

    /* renamed from: y0 */
    public boolean mo2991y0() {
        return this.f2229y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0412a.m2047a(fragment, sb);
        } else {
            C0412a.m2047a(this.f2222r, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo2866a(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int N;
        int N2;
        int N3;
        int N4;
        String innerPrefix = prefix + "    ";
        if (!this.f2212h.isEmpty()) {
            writer.print(prefix);
            writer.print("Active Fragments in ");
            writer.print(Integer.toHexString(System.identityHashCode(this)));
            writer.println(":");
            for (Fragment f : this.f2212h.values()) {
                writer.print(prefix);
                writer.println(f);
                if (f != null) {
                    f.mo4633f(innerPrefix, fd, writer, args);
                }
            }
        }
        int N5 = this.f2211g.size();
        if (N5 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i = 0; i < N5; i++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i);
                writer.print(": ");
                writer.println(this.f2211g.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2214j;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < N4; i2++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(this.f2214j.get(i2).toString());
            }
        }
        ArrayList<C0516a> arrayList2 = this.f2213i;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i3 = 0; i3 < N3; i3++) {
                C0516a bs = this.f2213i.get(i3);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(bs.toString());
                bs.mo2780d(innerPrefix, writer);
            }
        }
        synchronized (this) {
            ArrayList<C0516a> arrayList3 = this.f2217m;
            if (arrayList3 != null && (N2 = arrayList3.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i4 = 0; i4 < N2; i4++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i4);
                    writer.print(": ");
                    writer.println(this.f2217m.get(i4));
                }
            }
            ArrayList<Integer> arrayList4 = this.f2218n;
            if (arrayList4 != null && arrayList4.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.f2218n.toArray()));
            }
        }
        ArrayList<C0541k> arrayList5 = this.f2208d;
        if (arrayList5 != null && (N = arrayList5.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i5 = 0; i5 < N; i5++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i5);
                writer.print(": ");
                writer.println(this.f2208d.get(i5));
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.f2222r);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.f2223s);
        if (this.f2224t != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.f2224t);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.f2221q);
        writer.print(" mStateSaved=");
        writer.print(this.f2227w);
        writer.print(" mStopped=");
        writer.print(this.f2228x);
        writer.print(" mDestroyed=");
        writer.println(this.f2229y);
        if (this.f2226v) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.f2226v);
        }
    }

    /* renamed from: H0 */
    public static C0537g m2687H0(float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(f2198J);
        scale.setDuration(220);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(f2199K);
        alpha.setDuration(220);
        set.addAnimation(alpha);
        return new C0537g((Animation) set);
    }

    /* renamed from: F0 */
    public static C0537g m2686F0(float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(f2199K);
        anim.setDuration(220);
        return new C0537g((Animation) anim);
    }

    /* renamed from: D0 */
    public C0537g mo2893D0(Fragment fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.mo4680x();
        fragment.mo4638g1(0);
        ViewGroup viewGroup = fragment.f3435G;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animation = fragment.mo4621a0(transit, enter, nextAnim);
        if (animation != null) {
            return new C0537g(animation);
        }
        Animator animator = fragment.mo4624b0(transit, enter, nextAnim);
        if (animator != null) {
            return new C0537g(animator);
        }
        if (nextAnim != 0) {
            boolean isAnim = "anim".equals(this.f2222r.mo2864i().getResources().getResourceTypeName(nextAnim));
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation2 = AnimationUtils.loadAnimation(this.f2222r.mo2864i(), nextAnim);
                    if (animation2 != null) {
                        return new C0537g(animation2);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator2 = AnimatorInflater.loadAnimator(this.f2222r.mo2864i(), nextAnim);
                    if (animator2 != null) {
                        return new C0537g(animator2);
                    }
                } catch (RuntimeException e3) {
                    if (!isAnim) {
                        Animation animation3 = AnimationUtils.loadAnimation(this.f2222r.mo2864i(), nextAnim);
                        if (animation3 != null) {
                            return new C0537g(animation3);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = m2690j1(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                return m2687H0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m2687H0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m2687H0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m2687H0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m2686F0(0.0f, 1.0f);
            case 6:
                return m2686F0(1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.f2222r.mo2833p()) {
                    transitionStyle = this.f2222r.mo2832o();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    /* renamed from: O0 */
    public void mo2913O0(Fragment f) {
        if (!f.f3438J) {
            return;
        }
        if (this.f2209e) {
            this.f2230z = true;
            return;
        }
        f.f3438J = false;
        mo2909M0(f, this.f2221q, 0, 0, false);
    }

    /* renamed from: B0 */
    public boolean mo2889B0(int state) {
        return this.f2221q >= state;
    }

    /* JADX WARNING: type inference failed for: r2v43, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r1 != 3) goto L_0x0322;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0300  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2909M0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            boolean r0 = r8.f3462l
            r9 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r8.f3429A
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r20
            goto L_0x0016
        L_0x0011:
            r0 = r20
            if (r0 <= r9) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r8.f3463m
            if (r1 == 0) goto L_0x002a
            int r1 = r8.f3452b
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r1 = r19.mo4599P()
            if (r1 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r8.f3452b
        L_0x002a:
            boolean r1 = r8.f3438J
            r10 = 3
            r11 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r8.f3452b
            if (r1 >= r10) goto L_0x0037
            if (r0 <= r11) goto L_0x0037
            r0 = 2
        L_0x0037:
            a.m.d$b r1 = r8.f3446R
            a.m.d$b r2 = p000a.p051m.C0577d.C0579b.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r9)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            int r1 = r8.f3452b
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r1 > r0) goto L_0x0328
            boolean r1 = r8.f3464n
            if (r1 == 0) goto L_0x005b
            boolean r1 = r8.f3465o
            if (r1 != 0) goto L_0x005b
            return
        L_0x005b:
            android.view.View r1 = r19.mo4652l()
            if (r1 != 0) goto L_0x0067
            android.animation.Animator r1 = r19.mo4654m()
            if (r1 == 0) goto L_0x007b
        L_0x0067:
            r8.mo4627c1(r14)
            r8.mo4629d1(r14)
            int r3 = r19.mo4584H()
            r4 = 0
            r5 = 0
            r6 = 1
            r1 = r18
            r2 = r19
            r1.mo2909M0(r2, r3, r4, r5, r6)
        L_0x007b:
            int r1 = r8.f3452b
            if (r1 == 0) goto L_0x0087
            if (r1 == r9) goto L_0x01e5
            if (r1 == r11) goto L_0x02dc
            if (r1 == r10) goto L_0x02fd
            goto L_0x0322
        L_0x0087:
            if (r0 <= 0) goto L_0x01e5
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x00a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x00a1:
            android.os.Bundle r1 = r8.f3453c
            if (r1 == 0) goto L_0x00f8
            a.k.a.h r2 = r7.f2222r
            android.content.Context r2 = r2.mo2864i()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.setClassLoader(r2)
            android.os.Bundle r1 = r8.f3453c
            java.lang.String r2 = "android:view_state"
            android.util.SparseArray r1 = r1.getSparseParcelableArray(r2)
            r8.f3454d = r1
            android.os.Bundle r1 = r8.f3453c
            java.lang.String r2 = "android:target_state"
            androidx.fragment.app.Fragment r1 = r7.mo2978s0(r1, r2)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r2 = r1.f3456f
            goto L_0x00ca
        L_0x00c9:
            r2 = r14
        L_0x00ca:
            r8.f3459i = r2
            if (r2 == 0) goto L_0x00d8
            android.os.Bundle r2 = r8.f3453c
            java.lang.String r3 = "android:target_req_state"
            int r2 = r2.getInt(r3, r13)
            r8.f3460j = r2
        L_0x00d8:
            java.lang.Boolean r2 = r8.f3455e
            if (r2 == 0) goto L_0x00e5
            boolean r2 = r2.booleanValue()
            r8.f3439K = r2
            r8.f3455e = r14
            goto L_0x00ef
        L_0x00e5:
            android.os.Bundle r2 = r8.f3453c
            java.lang.String r3 = "android:user_visible_hint"
            boolean r2 = r2.getBoolean(r3, r9)
            r8.f3439K = r2
        L_0x00ef:
            boolean r2 = r8.f3439K
            if (r2 != 0) goto L_0x00f8
            r8.f3438J = r9
            if (r0 <= r11) goto L_0x00f8
            r0 = 2
        L_0x00f8:
            a.k.a.h r1 = r7.f2222r
            r8.f3470t = r1
            androidx.fragment.app.Fragment r2 = r7.f2224t
            r8.f3472v = r2
            if (r2 == 0) goto L_0x0105
            a.k.a.j r1 = r2.f3471u
            goto L_0x0107
        L_0x0105:
            a.k.a.j r1 = r1.f2194f
        L_0x0107:
            r8.f3469s = r1
            androidx.fragment.app.Fragment r1 = r8.f3458h
            java.lang.String r15 = " that does not belong to this FragmentManager!"
            java.lang.String r6 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            if (r1 == 0) goto L_0x0162
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r7.f2212h
            java.lang.String r1 = r1.f3456f
            java.lang.Object r1 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = r8.f3458h
            if (r1 != r2) goto L_0x0140
            int r1 = r2.f3452b
            if (r1 >= r9) goto L_0x0135
            r3 = 1
            r4 = 0
            r16 = 0
            r17 = 1
            r1 = r18
            r10 = r5
            r5 = r16
            r11 = r6
            r6 = r17
            r1.mo2909M0(r2, r3, r4, r5, r6)
            goto L_0x0137
        L_0x0135:
            r10 = r5
            r11 = r6
        L_0x0137:
            androidx.fragment.app.Fragment r1 = r8.f3458h
            java.lang.String r1 = r1.f3456f
            r8.f3459i = r1
            r8.f3458h = r14
            goto L_0x0164
        L_0x0140:
            r10 = r5
            r11 = r6
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r8)
            r2.append(r11)
            androidx.fragment.app.Fragment r3 = r8.f3458h
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0162:
            r10 = r5
            r11 = r6
        L_0x0164:
            java.lang.String r1 = r8.f3459i
            if (r1 == 0) goto L_0x01a8
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r7.f2212h
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            if (r6 == 0) goto L_0x0188
            int r1 = r6.f3452b
            if (r1 >= r9) goto L_0x0185
            r3 = 1
            r4 = 0
            r5 = 0
            r10 = 1
            r1 = r18
            r2 = r6
            r17 = r6
            r6 = r10
            r1.mo2909M0(r2, r3, r4, r5, r6)
            goto L_0x01a8
        L_0x0185:
            r17 = r6
            goto L_0x01a8
        L_0x0188:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r8)
            r2.append(r11)
            java.lang.String r3 = r8.f3459i
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a8:
            a.k.a.h r1 = r7.f2222r
            android.content.Context r1 = r1.mo2864i()
            r7.mo2900I(r8, r1, r13)
            r19.mo4573B0()
            androidx.fragment.app.Fragment r1 = r8.f3472v
            if (r1 != 0) goto L_0x01be
            a.k.a.h r1 = r7.f2222r
            r1.mo2828k(r8)
            goto L_0x01c1
        L_0x01be:
            r1.mo4615X(r8)
        L_0x01c1:
            a.k.a.h r1 = r7.f2222r
            android.content.Context r1 = r1.mo2864i()
            r7.mo2892D(r8, r1, r13)
            boolean r1 = r8.f3445Q
            if (r1 != 0) goto L_0x01de
            android.os.Bundle r1 = r8.f3453c
            r7.mo2902J(r8, r1, r13)
            android.os.Bundle r1 = r8.f3453c
            r8.mo4579E0(r1)
            android.os.Bundle r1 = r8.f3453c
            r7.mo2894E(r8, r1, r13)
            goto L_0x01e5
        L_0x01de:
            android.os.Bundle r1 = r8.f3453c
            r8.mo4622a1(r1)
            r8.f3452b = r9
        L_0x01e5:
            if (r0 <= 0) goto L_0x01ea
            r18.mo2943e0(r19)
        L_0x01ea:
            if (r0 <= r9) goto L_0x02dc
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0204
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0204:
            boolean r1 = r8.f3464n
            if (r1 != 0) goto L_0x02c7
            r1 = 0
            int r2 = r8.f3474x
            if (r2 == 0) goto L_0x027e
            r3 = -1
            if (r2 == r3) goto L_0x025f
            a.k.a.e r3 = r7.f2223s
            android.view.View r2 = r3.mo2826f(r2)
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x027e
            boolean r2 = r8.f3466p
            if (r2 == 0) goto L_0x0220
            goto L_0x027e
        L_0x0220:
            android.content.res.Resources r0 = r19.mo4574C()     // Catch:{ NotFoundException -> 0x022b }
            int r1 = r8.f3474x     // Catch:{ NotFoundException -> 0x022b }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x022b }
            goto L_0x022f
        L_0x022b:
            r0 = move-exception
            java.lang.String r1 = "unknown"
            r0 = r1
        L_0x022f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            r2.append(r3)
            int r3 = r8.f3474x
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r7.mo2955i1(r1)
            throw r14
        L_0x025f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r7.mo2955i1(r0)
            throw r14
        L_0x027e:
            r8.f3435G = r1
            android.os.Bundle r2 = r8.f3453c
            android.view.LayoutInflater r2 = r8.mo4591K0(r2)
            android.os.Bundle r3 = r8.f3453c
            r8.mo4583G0(r2, r1, r3)
            android.view.View r2 = r8.f3436H
            if (r2 == 0) goto L_0x02c5
            r8.f3437I = r2
            r2.setSaveFromParentEnabled(r13)
            if (r1 == 0) goto L_0x029b
            android.view.View r2 = r8.f3436H
            r1.addView(r2)
        L_0x029b:
            boolean r2 = r8.f3476z
            if (r2 == 0) goto L_0x02a6
            android.view.View r2 = r8.f3436H
            r3 = 8
            r2.setVisibility(r3)
        L_0x02a6:
            android.view.View r2 = r8.f3436H
            android.os.Bundle r3 = r8.f3453c
            r8.mo4683y0(r2, r3)
            android.view.View r2 = r8.f3436H
            android.os.Bundle r3 = r8.f3453c
            r7.mo2912O(r8, r2, r3, r13)
            android.view.View r2 = r8.f3436H
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02c1
            android.view.ViewGroup r2 = r8.f3435G
            if (r2 == 0) goto L_0x02c1
            goto L_0x02c2
        L_0x02c1:
            r9 = 0
        L_0x02c2:
            r8.f3441M = r9
            goto L_0x02c7
        L_0x02c5:
            r8.f3437I = r14
        L_0x02c7:
            android.os.Bundle r1 = r8.f3453c
            r8.mo4571A0(r1)
            android.os.Bundle r1 = r8.f3453c
            r7.mo2890C(r8, r1, r13)
            android.view.View r1 = r8.f3436H
            if (r1 == 0) goto L_0x02da
            android.os.Bundle r1 = r8.f3453c
            r8.mo4625b1(r1)
        L_0x02da:
            r8.f3453c = r14
        L_0x02dc:
            r1 = 2
            if (r0 <= r1) goto L_0x02fd
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x02f7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x02f7:
            r19.mo4612V0()
            r7.mo2908M(r8, r13)
        L_0x02fd:
            r1 = 3
            if (r0 <= r1) goto L_0x0322
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0318
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0318:
            r19.mo4608T0()
            r7.mo2904K(r8, r13)
            r8.f3453c = r14
            r8.f3454d = r14
        L_0x0322:
            r2 = r21
            r4 = r22
            goto L_0x0505
        L_0x0328:
            if (r1 <= r0) goto L_0x0501
            if (r1 == r9) goto L_0x0426
            r2 = 2
            if (r1 == r2) goto L_0x037c
            r2 = 3
            if (r1 == r2) goto L_0x035b
            r2 = 4
            if (r1 == r2) goto L_0x033b
            r2 = r21
            r4 = r22
            goto L_0x0505
        L_0x033b:
            if (r0 >= r2) goto L_0x035b
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0355
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0355:
            r19.mo4600P0()
            r7.mo2899H(r8, r13)
        L_0x035b:
            r1 = 3
            if (r0 >= r1) goto L_0x037c
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0376
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0376:
            r19.mo4614W0()
            r7.mo2910N(r8, r13)
        L_0x037c:
            r1 = 2
            if (r0 >= r1) goto L_0x0421
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0397
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0397:
            android.view.View r1 = r8.f3436H
            if (r1 == 0) goto L_0x03aa
            a.k.a.h r1 = r7.f2222r
            boolean r1 = r1.mo2834q(r8)
            if (r1 == 0) goto L_0x03aa
            android.util.SparseArray<android.os.Parcelable> r1 = r8.f3454d
            if (r1 != 0) goto L_0x03aa
            r18.mo2938b1(r19)
        L_0x03aa:
            r19.mo4587I0()
            r7.mo2914P(r8, r13)
            android.view.View r1 = r8.f3436H
            if (r1 == 0) goto L_0x040d
            android.view.ViewGroup r2 = r8.f3435G
            if (r2 == 0) goto L_0x040d
            r2.endViewTransition(r1)
            android.view.View r1 = r8.f3436H
            r1.clearAnimation()
            r1 = 0
            androidx.fragment.app.Fragment r2 = r19.mo4570A()
            if (r2 == 0) goto L_0x03d5
            androidx.fragment.app.Fragment r2 = r19.mo4570A()
            boolean r2 = r2.f3463m
            if (r2 != 0) goto L_0x03d0
            goto L_0x03d5
        L_0x03d0:
            r2 = r21
            r4 = r22
            goto L_0x0411
        L_0x03d5:
            int r2 = r7.f2221q
            r3 = 0
            if (r2 <= 0) goto L_0x03fa
            boolean r2 = r7.f2229y
            if (r2 != 0) goto L_0x03fa
            android.view.View r2 = r8.f3436H
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x03f5
            float r2 = r8.f3443O
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x03f5
            r2 = r21
            r4 = r22
            a.k.a.j$g r1 = r7.mo2893D0(r8, r2, r13, r4)
            goto L_0x03fe
        L_0x03f5:
            r2 = r21
            r4 = r22
            goto L_0x03fe
        L_0x03fa:
            r2 = r21
            r4 = r22
        L_0x03fe:
            r8.f3443O = r3
            if (r1 == 0) goto L_0x0405
            r7.mo2956j(r8, r1, r0)
        L_0x0405:
            android.view.ViewGroup r3 = r8.f3435G
            android.view.View r5 = r8.f3436H
            r3.removeView(r5)
            goto L_0x0411
        L_0x040d:
            r2 = r21
            r4 = r22
        L_0x0411:
            r8.f3435G = r14
            r8.f3436H = r14
            r8.f3448T = r14
            a.m.l<a.m.g> r1 = r8.f3449U
            r1.mo3116h(r14)
            r8.f3437I = r14
            r8.f3465o = r13
            goto L_0x042a
        L_0x0421:
            r2 = r21
            r4 = r22
            goto L_0x042a
        L_0x0426:
            r2 = r21
            r4 = r22
        L_0x042a:
            if (r0 >= r9) goto L_0x0505
            boolean r1 = r7.f2229y
            if (r1 == 0) goto L_0x0452
            android.view.View r1 = r19.mo4652l()
            if (r1 == 0) goto L_0x0441
            android.view.View r1 = r19.mo4652l()
            r8.mo4627c1(r14)
            r1.clearAnimation()
            goto L_0x0452
        L_0x0441:
            android.animation.Animator r1 = r19.mo4654m()
            if (r1 == 0) goto L_0x0452
            android.animation.Animator r1 = r19.mo4654m()
            r8.mo4629d1(r14)
            r1.cancel()
        L_0x0452:
            android.view.View r1 = r19.mo4652l()
            if (r1 != 0) goto L_0x04fc
            android.animation.Animator r1 = r19.mo4654m()
            if (r1 == 0) goto L_0x0460
            goto L_0x04fc
        L_0x0460:
            boolean r1 = f2197I
            if (r1 == 0) goto L_0x0478
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom CREATED: "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r12, r1)
        L_0x0478:
            boolean r1 = r8.f3463m
            if (r1 == 0) goto L_0x0484
            boolean r1 = r19.mo4599P()
            if (r1 != 0) goto L_0x0484
            r1 = 1
            goto L_0x0485
        L_0x0484:
            r1 = 0
        L_0x0485:
            if (r1 != 0) goto L_0x0493
            a.k.a.l r3 = r7.f2206G
            boolean r3 = r3.mo3025l(r8)
            if (r3 == 0) goto L_0x0490
            goto L_0x0493
        L_0x0490:
            r8.f3452b = r13
            goto L_0x04c8
        L_0x0493:
            a.k.a.h r3 = r7.f2222r
            boolean r5 = r3 instanceof p000a.p051m.C0599s
            if (r5 == 0) goto L_0x04a0
            a.k.a.l r3 = r7.f2206G
            boolean r3 = r3.mo3023j()
            goto L_0x04b8
        L_0x04a0:
            android.content.Context r3 = r3.mo2864i()
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x04b7
            a.k.a.h r3 = r7.f2222r
            android.content.Context r3 = r3.mo2864i()
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r5 = r3.isChangingConfigurations()
            r5 = r5 ^ r9
            r3 = r5
            goto L_0x04b8
        L_0x04b7:
            r3 = 1
        L_0x04b8:
            if (r1 != 0) goto L_0x04bc
            if (r3 == 0) goto L_0x04c1
        L_0x04bc:
            a.k.a.l r5 = r7.f2206G
            r5.mo3017e(r8)
        L_0x04c1:
            r19.mo4585H0()
            r7.mo2896F(r8, r13)
        L_0x04c8:
            r19.mo4589J0()
            r7.mo2897G(r8, r13)
            if (r23 != 0) goto L_0x0505
            if (r1 != 0) goto L_0x04f8
            a.k.a.l r3 = r7.f2206G
            boolean r3 = r3.mo3025l(r8)
            if (r3 == 0) goto L_0x04db
            goto L_0x04f8
        L_0x04db:
            r8.f3470t = r14
            r8.f3472v = r14
            r8.f3469s = r14
            java.lang.String r3 = r8.f3459i
            if (r3 == 0) goto L_0x0505
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r5 = r7.f2212h
            java.lang.Object r3 = r5.get(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x0505
            boolean r5 = r3.mo4576D()
            if (r5 == 0) goto L_0x0505
            r8.f3458h = r3
            goto L_0x0505
        L_0x04f8:
            r18.mo2898G0(r19)
            goto L_0x0505
        L_0x04fc:
            r8.mo4648j1(r0)
            r0 = 1
            goto L_0x0505
        L_0x0501:
            r2 = r21
            r4 = r22
        L_0x0505:
            int r1 = r8.f3452b
            if (r1 == r0) goto L_0x0531
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "moveToState: Fragment state for "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r3 = " not updated inline; expected state "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = " found "
            r1.append(r3)
            int r3 = r8.f3452b
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r12, r1)
            r8.f3452b = r0
        L_0x0531:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0529j.mo2909M0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: j */
    public final void mo2956j(Fragment fragment, C0537g anim, int newState) {
        View viewToAnimate = fragment.f3436H;
        ViewGroup container = fragment.f3435G;
        container.startViewTransition(viewToAnimate);
        fragment.mo4648j1(newState);
        if (anim.f2245a != null) {
            Animation animation = new C0538h(anim.f2245a, container, viewToAnimate);
            fragment.mo4627c1(fragment.f3436H);
            animation.setAnimationListener(new C0532c(container, fragment));
            fragment.f3436H.startAnimation(animation);
            return;
        }
        Animator animator = anim.f2246b;
        fragment.mo4629d1(anim.f2246b);
        animator.addListener(new C0534d(container, viewToAnimate, fragment));
        animator.setTarget(fragment.f3436H);
        animator.start();
    }

    /* renamed from: a.k.a.j$c */
    public class C0532c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f2233a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f2234b;

        public C0532c(ViewGroup viewGroup, Fragment fragment) {
            this.f2233a = viewGroup;
            this.f2234b = fragment;
        }

        public void onAnimationStart(Animation animation) {
        }

        /* renamed from: a.k.a.j$c$a */
        public class C0533a implements Runnable {
            public C0533a() {
            }

            public void run() {
                if (C0532c.this.f2234b.mo4652l() != null) {
                    C0532c.this.f2234b.mo4627c1((View) null);
                    C0532c cVar = C0532c.this;
                    C0529j jVar = C0529j.this;
                    Fragment fragment = cVar.f2234b;
                    jVar.mo2909M0(fragment, fragment.mo4584H(), 0, 0, false);
                }
            }
        }

        public void onAnimationEnd(Animation animation) {
            this.f2233a.post(new C0533a());
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: a.k.a.j$d */
    public class C0534d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f2237a;

        /* renamed from: b */
        public final /* synthetic */ View f2238b;

        /* renamed from: c */
        public final /* synthetic */ Fragment f2239c;

        public C0534d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2237a = viewGroup;
            this.f2238b = view;
            this.f2239c = fragment;
        }

        public void onAnimationEnd(Animator anim) {
            this.f2237a.endViewTransition(this.f2238b);
            Animator animator = this.f2239c.mo4654m();
            this.f2239c.mo4629d1((Animator) null);
            if (animator != null && this.f2237a.indexOfChild(this.f2238b) < 0) {
                C0529j jVar = C0529j.this;
                Fragment fragment = this.f2239c;
                jVar.mo2909M0(fragment, fragment.mo4584H(), 0, 0, false);
            }
        }
    }

    /* renamed from: L0 */
    public void mo2907L0(Fragment f) {
        mo2909M0(f, this.f2221q, 0, 0, false);
    }

    /* renamed from: e0 */
    public void mo2943e0(Fragment f) {
        if (f.f3464n && !f.f3467q) {
            f.mo4583G0(f.mo4591K0(f.f3453c), (ViewGroup) null, f.f3453c);
            View view = f.f3436H;
            if (view != null) {
                f.f3437I = view;
                view.setSaveFromParentEnabled(false);
                if (f.f3476z) {
                    f.f3436H.setVisibility(8);
                }
                f.mo4683y0(f.f3436H, f.f3453c);
                mo2912O(f, f.f3436H, f.f3453c, false);
                return;
            }
            f.f3437I = null;
        }
    }

    /* renamed from: r */
    public void mo2975r(Fragment fragment) {
        Animator animator;
        if (fragment.f3436H != null) {
            C0537g anim = mo2893D0(fragment, fragment.mo4682y(), !fragment.f3476z, fragment.mo4684z());
            if (anim == null || (animator = anim.f2246b) == null) {
                if (anim != null) {
                    fragment.f3436H.startAnimation(anim.f2245a);
                    anim.f2245a.start();
                }
                fragment.f3436H.setVisibility((!fragment.f3476z || fragment.mo4597O()) ? 0 : 8);
                if (fragment.mo4597O()) {
                    fragment.mo4635f1(false);
                }
            } else {
                animator.setTarget(fragment.f3436H);
                if (!fragment.f3476z) {
                    fragment.f3436H.setVisibility(0);
                } else if (fragment.mo4597O()) {
                    fragment.mo4635f1(false);
                } else {
                    ViewGroup container = fragment.f3435G;
                    View animatingView = fragment.f3436H;
                    container.startViewTransition(animatingView);
                    anim.f2246b.addListener(new C0535e(this, container, animatingView, fragment));
                }
                anim.f2246b.start();
            }
        }
        if (fragment.f3462l && mo2993z0(fragment)) {
            this.f2226v = true;
        }
        fragment.f3442N = false;
        fragment.mo4647j0(fragment.f3476z);
    }

    /* renamed from: a.k.a.j$e */
    public class C0535e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f2241a;

        /* renamed from: b */
        public final /* synthetic */ View f2242b;

        /* renamed from: c */
        public final /* synthetic */ Fragment f2243c;

        public C0535e(C0529j this$0, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2241a = viewGroup;
            this.f2242b = view;
            this.f2243c = fragment;
        }

        public void onAnimationEnd(Animator animation) {
            this.f2241a.endViewTransition(this.f2242b);
            animation.removeListener(this);
            Fragment fragment = this.f2243c;
            View view = fragment.f3436H;
            if (view != null && fragment.f3476z) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r4 = r1.f3436H;
        r5 = r11.f3435G;
        r6 = r5.indexOfChild(r4);
     */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2903J0(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r10.f2212h
            java.lang.String r1 = r11.f3456f
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = f2197I
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " to state "
            r0.append(r1)
            int r1 = r10.f2221q
            r0.append(r1)
            java.lang.String r1 = "since it is not added to "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r10.f2221q
            boolean r1 = r11.f3463m
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0051
            boolean r1 = r11.mo4599P()
            if (r1 == 0) goto L_0x004d
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x0051
        L_0x004d:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x0051:
            int r7 = r11.mo4682y()
            int r8 = r11.mo4684z()
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r0
            r4.mo2909M0(r5, r6, r7, r8, r9)
            android.view.View r1 = r11.f3436H
            if (r1 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r1 = r10.mo2964m0(r11)
            if (r1 == 0) goto L_0x0082
            android.view.View r4 = r1.f3436H
            android.view.ViewGroup r5 = r11.f3435G
            int r6 = r5.indexOfChild(r4)
            android.view.View r7 = r11.f3436H
            int r7 = r5.indexOfChild(r7)
            if (r7 >= r6) goto L_0x0082
            r5.removeViewAt(r7)
            android.view.View r8 = r11.f3436H
            r5.addView(r8, r6)
        L_0x0082:
            boolean r4 = r11.f3441M
            if (r4 == 0) goto L_0x00be
            android.view.ViewGroup r4 = r11.f3435G
            if (r4 == 0) goto L_0x00be
            float r4 = r11.f3443O
            r5 = 0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0096
            android.view.View r6 = r11.f3436H
            r6.setAlpha(r4)
        L_0x0096:
            r11.f3443O = r5
            r11.f3441M = r3
            int r3 = r11.mo4682y()
            int r4 = r11.mo4684z()
            a.k.a.j$g r2 = r10.mo2893D0(r11, r3, r2, r4)
            if (r2 == 0) goto L_0x00be
            android.view.animation.Animation r3 = r2.f2245a
            if (r3 == 0) goto L_0x00b2
            android.view.View r4 = r11.f3436H
            r4.startAnimation(r3)
            goto L_0x00be
        L_0x00b2:
            android.animation.Animator r3 = r2.f2246b
            android.view.View r4 = r11.f3436H
            r3.setTarget(r4)
            android.animation.Animator r3 = r2.f2246b
            r3.start()
        L_0x00be:
            boolean r1 = r11.f3442N
            if (r1 == 0) goto L_0x00c5
            r10.mo2975r(r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0529j.mo2903J0(androidx.fragment.app.Fragment):void");
    }

    /* renamed from: K0 */
    public void mo2905K0(int newState, boolean always) {
        C0525h hVar;
        if (this.f2222r == null && newState != 0) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.f2221q) {
            this.f2221q = newState;
            int numAdded = this.f2211g.size();
            for (int i = 0; i < numAdded; i++) {
                mo2903J0(this.f2211g.get(i));
            }
            for (Fragment f : this.f2212h.values()) {
                if (f != null && ((f.f3463m || f.f3429A) && !f.f3441M)) {
                    mo2903J0(f);
                }
            }
            mo2952h1();
            if (this.f2226v && (hVar = this.f2222r) != null && this.f2221q == 4) {
                hVar.mo2835r();
                this.f2226v = false;
            }
        }
    }

    /* renamed from: h1 */
    public void mo2952h1() {
        for (Fragment f : this.f2212h.values()) {
            if (f != null) {
                mo2913O0(f);
            }
        }
    }

    /* renamed from: E0 */
    public void mo2895E0(Fragment f) {
        if (this.f2212h.get(f.f3456f) == null) {
            this.f2212h.put(f.f3456f, f);
            if (f.f3431C) {
                if (f.f3430B) {
                    mo2953i(f);
                } else {
                    mo2927V0(f);
                }
                f.f3431C = false;
            }
            if (f2197I) {
                Log.v("FragmentManager", "Added fragment to active set " + f);
            }
        }
    }

    /* renamed from: G0 */
    public void mo2898G0(Fragment f) {
        if (this.f2212h.get(f.f3456f) != null) {
            if (f2197I) {
                Log.v("FragmentManager", "Removed fragment from active set " + f);
            }
            for (Fragment fragment : this.f2212h.values()) {
                if (fragment != null && f.f3456f.equals(fragment.f3459i)) {
                    fragment.f3458h = f;
                    fragment.f3459i = null;
                }
            }
            this.f2212h.put(f.f3456f, (Object) null);
            mo2927V0(f);
            String str = f.f3459i;
            if (str != null) {
                f.f3458h = this.f2212h.get(str);
            }
            f.mo4594M();
        }
    }

    /* renamed from: h */
    public void mo2950h(Fragment fragment, boolean moveToStateNow) {
        if (f2197I) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        mo2895E0(fragment);
        if (fragment.f3429A) {
            return;
        }
        if (!this.f2211g.contains(fragment)) {
            synchronized (this.f2211g) {
                this.f2211g.add(fragment);
            }
            fragment.f3462l = true;
            fragment.f3463m = false;
            if (fragment.f3436H == null) {
                fragment.f3442N = false;
            }
            if (mo2993z0(fragment)) {
                this.f2226v = true;
            }
            if (moveToStateNow) {
                mo2907L0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: T0 */
    public void mo2923T0(Fragment fragment) {
        if (f2197I) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f3468r);
        }
        boolean inactive = !fragment.mo4599P();
        if (!fragment.f3429A || inactive) {
            synchronized (this.f2211g) {
                this.f2211g.remove(fragment);
            }
            if (mo2993z0(fragment)) {
                this.f2226v = true;
            }
            fragment.f3462l = false;
            fragment.f3463m = true;
        }
    }

    /* renamed from: x0 */
    public void mo2989x0(Fragment fragment) {
        if (f2197I) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f3476z) {
            fragment.f3476z = true;
            fragment.f3442N = true ^ fragment.f3442N;
        }
    }

    /* renamed from: g1 */
    public void mo2949g1(Fragment fragment) {
        if (f2197I) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f3476z) {
            fragment.f3476z = false;
            fragment.f3442N = !fragment.f3442N;
        }
    }

    /* renamed from: s */
    public void mo2977s(Fragment fragment) {
        if (f2197I) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f3429A) {
            fragment.f3429A = true;
            if (fragment.f3462l) {
                if (f2197I) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f2211g) {
                    this.f2211g.remove(fragment);
                }
                if (mo2993z0(fragment)) {
                    this.f2226v = true;
                }
                fragment.f3462l = false;
            }
        }
    }

    /* renamed from: l */
    public void mo2961l(Fragment fragment) {
        if (f2197I) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f3429A) {
            fragment.f3429A = false;
            if (fragment.f3462l) {
                return;
            }
            if (!this.f2211g.contains(fragment)) {
                if (f2197I) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f2211g) {
                    this.f2211g.add(fragment);
                }
                fragment.f3462l = true;
                if (mo2993z0(fragment)) {
                    this.f2226v = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* renamed from: j0 */
    public Fragment mo2957j0(int id) {
        for (int i = this.f2211g.size() - 1; i >= 0; i--) {
            Fragment f = this.f2211g.get(i);
            if (f != null && f.f3473w == id) {
                return f;
            }
        }
        for (Fragment f2 : this.f2212h.values()) {
            if (f2 != null && f2.f3473w == id) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: k0 */
    public Fragment mo2959k0(String tag) {
        if (tag != null) {
            for (int i = this.f2211g.size() - 1; i >= 0; i--) {
                Fragment f = this.f2211g.get(i);
                if (f != null && tag.equals(f.f3475y)) {
                    return f;
                }
            }
        }
        if (tag == null) {
            return null;
        }
        for (Fragment f2 : this.f2212h.values()) {
            if (f2 != null && tag.equals(f2.f3475y)) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: l0 */
    public Fragment mo2962l0(String str) {
        Fragment h;
        for (Fragment next : this.f2212h.values()) {
            if (next != null && (h = next.mo4639h(str)) != null) {
                return h;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final void mo2967o() {
        if (mo2891C0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: C0 */
    public boolean mo2891C0() {
        return this.f2227w || this.f2228x;
    }

    /* renamed from: c1 */
    public void mo2940c1() {
        synchronized (this) {
            ArrayList<C0542l> arrayList = this.f2205F;
            boolean pendingReady = false;
            boolean postponeReady = arrayList != null && !arrayList.isEmpty();
            ArrayList<C0541k> arrayList2 = this.f2208d;
            if (arrayList2 != null && arrayList2.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.f2222r.mo2865j().removeCallbacks(this.f2207H);
                this.f2222r.mo2865j().post(this.f2207H);
                mo2960k1();
            }
        }
    }

    /* renamed from: d1 */
    public void mo2942d1(int index, C0516a bse) {
        synchronized (this) {
            if (this.f2217m == null) {
                this.f2217m = new ArrayList<>();
            }
            int N = this.f2217m.size();
            if (index < N) {
                if (f2197I) {
                    Log.v("FragmentManager", "Setting back stack index " + index + " to " + bse);
                }
                this.f2217m.set(index, bse);
            } else {
                while (N < index) {
                    this.f2217m.add((Object) null);
                    if (this.f2218n == null) {
                        this.f2218n = new ArrayList<>();
                    }
                    if (f2197I) {
                        Log.v("FragmentManager", "Adding available back stack index " + N);
                    }
                    this.f2218n.add(Integer.valueOf(N));
                    N++;
                }
                if (f2197I) {
                    Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                }
                this.f2217m.add(bse);
            }
        }
    }

    /* renamed from: o0 */
    public void mo2968o0(int index) {
        synchronized (this) {
            this.f2217m.set(index, (Object) null);
            if (this.f2218n == null) {
                this.f2218n = new ArrayList<>();
            }
            if (f2197I) {
                Log.v("FragmentManager", "Freeing back stack index " + index);
            }
            this.f2218n.add(Integer.valueOf(index));
        }
    }

    /* renamed from: d0 */
    public final void mo2941d0(boolean allowStateLoss) {
        if (this.f2209e) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2222r == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2222r.mo2865j().getLooper()) {
            if (!allowStateLoss) {
                mo2967o();
            }
            if (this.f2200A == null) {
                this.f2200A = new ArrayList<>();
                this.f2201B = new ArrayList<>();
            }
            this.f2209e = true;
            try {
                mo2954i0((ArrayList<C0516a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2209e = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: p */
    public final void mo2971p() {
        this.f2209e = false;
        this.f2201B.clear();
        this.f2200A.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f0 */
    public boolean mo2946f0() {
        mo2941d0(true);
        boolean didSomething = false;
        while (mo2972p0(this.f2200A, this.f2201B)) {
            this.f2209e = true;
            try {
                mo2925U0(this.f2200A, this.f2201B);
                mo2971p();
                didSomething = true;
            } catch (Throwable th) {
                mo2971p();
                throw th;
            }
        }
        mo2960k1();
        mo2937b0();
        mo2963m();
        return didSomething;
    }

    /* renamed from: i0 */
    public final void mo2954i0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop) {
        int index;
        ArrayList<C0542l> arrayList = this.f2205F;
        int numPostponed = arrayList == null ? 0 : arrayList.size();
        int i = 0;
        while (i < numPostponed) {
            C0542l listener = this.f2205F.get(i);
            if (records != null && !listener.f2255a && (index = records.indexOf(listener.f2256b)) != -1 && isRecordPop.get(index).booleanValue()) {
                this.f2205F.remove(i);
                i--;
                numPostponed--;
                listener.mo3006c();
            } else if (listener.mo3008e() != 0 || (records != null && listener.f2256b.mo2787k(records, 0, records.size()))) {
                this.f2205F.remove(i);
                i--;
                numPostponed--;
                if (records != null && !listener.f2255a) {
                    int indexOf = records.indexOf(listener.f2256b);
                    int index2 = indexOf;
                    if (indexOf != -1 && isRecordPop.get(index2).booleanValue()) {
                        listener.mo3006c();
                    }
                }
                listener.mo3007d();
            }
            i++;
        }
    }

    /* renamed from: U0 */
    public final void mo2925U0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop) {
        if (records != null && !records.isEmpty()) {
            if (isRecordPop == null || records.size() != isRecordPop.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            mo2954i0(records, isRecordPop);
            int numRecords = records.size();
            int startIndex = 0;
            int recordNum = 0;
            while (recordNum < numRecords) {
                if (!records.get(recordNum).f2299p) {
                    if (startIndex != recordNum) {
                        mo2951h0(records, isRecordPop, startIndex, recordNum);
                    }
                    int reorderingEnd = recordNum + 1;
                    if (isRecordPop.get(recordNum).booleanValue()) {
                        while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !records.get(reorderingEnd).f2299p) {
                            reorderingEnd++;
                        }
                    }
                    mo2951h0(records, isRecordPop, recordNum, reorderingEnd);
                    startIndex = reorderingEnd;
                    recordNum = reorderingEnd - 1;
                }
                recordNum++;
            }
            if (startIndex != numRecords) {
                mo2951h0(records, isRecordPop, startIndex, numRecords);
            }
        }
    }

    /* renamed from: h0 */
    public final void mo2951h0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i;
        ArrayList<C0516a> arrayList = records;
        ArrayList<Boolean> arrayList2 = isRecordPop;
        int i2 = startIndex;
        int i3 = endIndex;
        boolean allowReordering = arrayList.get(i2).f2299p;
        ArrayList<Fragment> arrayList3 = this.f2202C;
        if (arrayList3 == null) {
            this.f2202C = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f2202C.addAll(this.f2211g);
        int recordNum = startIndex;
        boolean addToBackStack = false;
        Fragment oldPrimaryNav = mo2983u0();
        while (true) {
            boolean z = true;
            if (recordNum >= i3) {
                break;
            }
            C0516a record = arrayList.get(recordNum);
            if (!arrayList2.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.mo2784h(this.f2202C, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.mo2791p(this.f2202C, oldPrimaryNav);
            }
            if (!addToBackStack && !record.f2291h) {
                z = false;
            }
            addToBackStack = z;
            recordNum++;
        }
        this.f2202C.clear();
        if (!allowReordering) {
            C0551o.m2827C(this, records, isRecordPop, startIndex, endIndex, false);
        }
        m2689g0(records, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            C0258b bVar = new C0258b();
            mo2945f(bVar);
            postponeIndex = mo2919R0(records, isRecordPop, startIndex, endIndex, bVar);
            mo2901I0(bVar);
        }
        if (postponeIndex != i2 && allowReordering) {
            C0551o.m2827C(this, records, isRecordPop, startIndex, postponeIndex, true);
            mo2905K0(this.f2221q, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < i3; recordNum2++) {
            C0516a record2 = arrayList.get(recordNum2);
            if (arrayList2.get(recordNum2).booleanValue() && (i = record2.f2162t) >= 0) {
                mo2968o0(i);
                record2.f2162t = -1;
            }
            record2.mo2789n();
        }
        if (addToBackStack) {
            mo2929W0();
        }
    }

    /* renamed from: I0 */
    public final void mo2901I0(C0258b<Fragment> fragments) {
        int numAdded = fragments.size();
        for (int i = 0; i < numAdded; i++) {
            Fragment fragment = fragments.mo1773i(i);
            if (!fragment.f3462l) {
                View view = fragment.mo4620Z0();
                fragment.f3443O = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: R0 */
    public final int mo2919R0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, C0258b<Fragment> added) {
        int postponeIndex = endIndex;
        for (int i = endIndex - 1; i >= startIndex; i--) {
            C0516a record = records.get(i);
            boolean isPop = isRecordPop.get(i).booleanValue();
            if (record.mo2788m() && !record.mo2787k(records, i + 1, endIndex)) {
                if (this.f2205F == null) {
                    this.f2205F = new ArrayList<>();
                }
                C0542l listener = new C0542l(record, isPop);
                this.f2205F.add(listener);
                record.mo2790o(listener);
                if (isPop) {
                    record.mo2782f();
                } else {
                    record.mo2783g(false);
                }
                postponeIndex--;
                if (i != postponeIndex) {
                    records.remove(i);
                    records.add(postponeIndex, record);
                }
                mo2945f(added);
            }
        }
        return postponeIndex;
    }

    /* renamed from: q */
    public void mo2973q(C0516a record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.mo2783g(moveToState);
        } else {
            record.mo2782f();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList arrayList = new ArrayList(1);
        records.add(record);
        arrayList.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            C0551o.m2827C(this, records, arrayList, 0, 1, true);
        }
        if (moveToState) {
            mo2905K0(this.f2221q, true);
        }
        for (Fragment fragment : this.f2212h.values()) {
            if (fragment != null && fragment.f3436H != null && fragment.f3441M && record.mo2786j(fragment.f3474x)) {
                float f = fragment.f3443O;
                if (f > 0.0f) {
                    fragment.f3436H.setAlpha(f);
                }
                if (moveToState) {
                    fragment.f3443O = 0.0f;
                } else {
                    fragment.f3443O = -1.0f;
                    fragment.f3441M = false;
                }
            }
        }
    }

    /* renamed from: m0 */
    public final Fragment mo2964m0(Fragment f) {
        ViewGroup container = f.f3435G;
        View view = f.f3436H;
        if (container == null || view == null) {
            return null;
        }
        for (int i = this.f2211g.indexOf(f) - 1; i >= 0; i--) {
            Fragment underFragment = this.f2211g.get(i);
            if (underFragment.f3435G == container && underFragment.f3436H != null) {
                return underFragment;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public static void m2689g0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            C0516a record = records.get(i);
            boolean moveToState = true;
            if (isRecordPop.get(i).booleanValue()) {
                record.mo2779c(-1);
                if (i != endIndex - 1) {
                    moveToState = false;
                }
                record.mo2783g(moveToState);
            } else {
                record.mo2779c(1);
                record.mo2782f();
            }
        }
    }

    /* renamed from: f */
    public final void mo2945f(C0258b<Fragment> added) {
        int i = this.f2221q;
        if (i >= 1) {
            int state = Math.min(i, 3);
            int numAdded = this.f2211g.size();
            for (int i2 = 0; i2 < numAdded; i2++) {
                Fragment fragment = this.f2211g.get(i2);
                if (fragment.f3452b < state) {
                    mo2909M0(fragment, state, fragment.mo4680x(), fragment.mo4682y(), false);
                    if (fragment.f3436H != null && !fragment.f3476z && fragment.f3441M) {
                        added.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void mo2966n0() {
        if (this.f2205F != null) {
            while (!this.f2205F.isEmpty()) {
                this.f2205F.remove(0).mo3007d();
            }
        }
    }

    /* renamed from: c0 */
    public final void mo2939c0() {
        for (Fragment fragment : this.f2212h.values()) {
            if (fragment != null) {
                if (fragment.mo4652l() != null) {
                    int stateAfterAnimating = fragment.mo4584H();
                    View animatingAway = fragment.mo4652l();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.mo4627c1((View) null);
                    mo2909M0(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.mo4654m() != null) {
                    fragment.mo4654m().end();
                }
            }
        }
    }

    /* renamed from: p0 */
    public final boolean mo2972p0(ArrayList<C0516a> records, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            ArrayList<C0541k> arrayList = this.f2208d;
            if (arrayList != null) {
                if (arrayList.size() != 0) {
                    int numActions = this.f2208d.size();
                    for (int i = 0; i < numActions; i++) {
                        didSomething |= this.f2208d.get(i).mo2778a(records, isPop);
                    }
                    this.f2208d.clear();
                    this.f2222r.mo2865j().removeCallbacks(this.f2207H);
                    return didSomething;
                }
            }
            return false;
        }
    }

    /* renamed from: b0 */
    public void mo2937b0() {
        if (this.f2230z) {
            this.f2230z = false;
            mo2952h1();
        }
    }

    /* renamed from: W0 */
    public void mo2929W0() {
        if (this.f2219o != null) {
            for (int i = 0; i < this.f2219o.size(); i++) {
                this.f2219o.get(i).mo2885a();
            }
        }
    }

    /* renamed from: g */
    public void mo2948g(C0516a state) {
        if (this.f2213i == null) {
            this.f2213i = new ArrayList<>();
        }
        this.f2213i.add(state);
    }

    /* renamed from: Q0 */
    public boolean mo2917Q0(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        ArrayList<C0516a> arrayList = this.f2213i;
        if (arrayList == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList.size() - 1;
            if (last < 0) {
                return false;
            }
            records.add(this.f2213i.remove(last));
            isRecordPop.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                int index2 = arrayList.size() - 1;
                while (index >= 0) {
                    C0516a bss = this.f2213i.get(index);
                    if ((name != null && name.equals(bss.mo2785i())) || (id >= 0 && id == bss.f2162t)) {
                        break;
                    }
                    index2 = index - 1;
                }
                if (index < 0) {
                    return false;
                }
                if ((flags & 1) != 0) {
                    index--;
                    while (index >= 0) {
                        C0516a bss2 = this.f2213i.get(index);
                        if ((name == null || !name.equals(bss2.mo2785i())) && (id < 0 || id != bss2.f2162t)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f2213i.size() - 1) {
                return false;
            }
            for (int i = this.f2213i.size() - 1; i > index; i--) {
                records.add(this.f2213i.remove(i));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    /* renamed from: b1 */
    public void mo2938b1(Fragment f) {
        if (f.f3437I != null) {
            SparseArray<Parcelable> sparseArray = this.f2204E;
            if (sparseArray == null) {
                this.f2204E = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            f.f3437I.saveHierarchyState(this.f2204E);
            if (this.f2204E.size() > 0) {
                f.f3454d = this.f2204E;
                this.f2204E = null;
            }
        }
    }

    /* renamed from: a1 */
    public Bundle mo2936a1(Fragment f) {
        Bundle result = null;
        if (this.f2203D == null) {
            this.f2203D = new Bundle();
        }
        f.mo4610U0(this.f2203D);
        mo2906L(f, this.f2203D, false);
        if (!this.f2203D.isEmpty()) {
            result = this.f2203D;
            this.f2203D = null;
        }
        if (f.f3436H != null) {
            mo2938b1(f);
        }
        if (f.f3454d != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f.f3454d);
        }
        if (!f.f3439K) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f.f3439K);
        }
        return result;
    }

    /* renamed from: Z0 */
    public Parcelable mo2934Z0() {
        int size;
        mo2966n0();
        mo2939c0();
        mo2946f0();
        this.f2227w = true;
        if (this.f2212h.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> active = new ArrayList<>(this.f2212h.size());
        boolean haveFragments = false;
        for (Fragment f : this.f2212h.values()) {
            if (f != null) {
                if (f.f3469s == this) {
                    haveFragments = true;
                    C0547m fs = new C0547m(f);
                    active.add(fs);
                    if (f.f3452b <= 0 || fs.f2282n != null) {
                        fs.f2282n = f.f3453c;
                    } else {
                        fs.f2282n = mo2936a1(f);
                        String str = f.f3459i;
                        if (str != null) {
                            Fragment target = this.f2212h.get(str);
                            if (target != null) {
                                if (fs.f2282n == null) {
                                    fs.f2282n = new Bundle();
                                }
                                mo2921S0(fs.f2282n, "android:target_state", target);
                                int i = f.f3460j;
                                if (i != 0) {
                                    fs.f2282n.putInt("android:target_req_state", i);
                                }
                            } else {
                                mo2955i1(new IllegalStateException("Failure saving state: " + f + " has target not in fragment manager: " + f.f3459i));
                                throw null;
                            }
                        }
                    }
                    if (f2197I) {
                        Log.v("FragmentManager", "Saved state of " + f + ": " + fs.f2282n);
                    }
                } else {
                    mo2955i1(new IllegalStateException("Failure saving state: active " + f + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!haveFragments) {
            if (f2197I) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> added = null;
        C0517b[] backStack = null;
        int size2 = this.f2211g.size();
        if (size2 > 0) {
            added = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f2211g.iterator();
            while (it.hasNext()) {
                Fragment f2 = it.next();
                added.add(f2.f3456f);
                if (f2.f3469s != this) {
                    mo2955i1(new IllegalStateException("Failure saving state: active " + f2 + " was removed from the FragmentManager"));
                    throw null;
                } else if (f2197I) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + f2.f3456f + "): " + f2);
                }
            }
        }
        ArrayList<C0516a> arrayList = this.f2213i;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStack = new C0517b[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStack[i2] = new C0517b(this.f2213i.get(i2));
                if (f2197I) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f2213i.get(i2));
                }
            }
        }
        C0543k fms = new C0543k();
        fms.f2258b = active;
        fms.f2259c = added;
        fms.f2260d = backStack;
        Fragment fragment = this.f2225u;
        if (fragment != null) {
            fms.f2261e = fragment.f3456f;
        }
        fms.f2262f = this.f2210f;
        return fms;
    }

    /* renamed from: X0 */
    public void mo2931X0(Parcelable state) {
        C0547m fs;
        if (state != null) {
            C0543k fms = (C0543k) state;
            if (fms.f2258b != null) {
                for (Fragment f : this.f2206G.mo3020h()) {
                    if (f2197I) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f);
                    }
                    Iterator<C0547m> it = fms.f2258b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fs = null;
                            break;
                        }
                        C0547m fragmentState = it.next();
                        if (fragmentState.f2271c.equals(f.f3456f)) {
                            fs = fragmentState;
                            break;
                        }
                    }
                    if (fs == null) {
                        if (f2197I) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + f + " that was not found in the set of active Fragments " + fms.f2258b);
                        }
                        Fragment fragment = f;
                        mo2909M0(fragment, 1, 0, 0, false);
                        f.f3463m = true;
                        mo2909M0(fragment, 0, 0, 0, false);
                    } else {
                        fs.f2283o = f;
                        f.f3454d = null;
                        f.f3468r = 0;
                        f.f3465o = false;
                        f.f3462l = false;
                        Fragment fragment2 = f.f3458h;
                        f.f3459i = fragment2 != null ? fragment2.f3456f : null;
                        f.f3458h = null;
                        Bundle bundle = fs.f2282n;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f2222r.mo2864i().getClassLoader());
                            f.f3454d = fs.f2282n.getSparseParcelableArray("android:view_state");
                            f.f3453c = fs.f2282n;
                        }
                    }
                }
                this.f2212h.clear();
                Iterator<C0547m> it2 = fms.f2258b.iterator();
                while (it2.hasNext()) {
                    C0547m fs2 = it2.next();
                    if (fs2 != null) {
                        Fragment f2 = fs2.mo3029f(this.f2222r.mo2864i().getClassLoader(), mo2867b());
                        f2.f3469s = this;
                        if (f2197I) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + f2.f3456f + "): " + f2);
                        }
                        this.f2212h.put(f2.f3456f, f2);
                        fs2.f2283o = null;
                    }
                }
                this.f2211g.clear();
                ArrayList<String> arrayList = fms.f2259c;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String who = it3.next();
                        Fragment f3 = this.f2212h.get(who);
                        if (f3 != null) {
                            f3.f3462l = true;
                            if (f2197I) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + who + "): " + f3);
                            }
                            if (!this.f2211g.contains(f3)) {
                                synchronized (this.f2211g) {
                                    this.f2211g.add(f3);
                                }
                            } else {
                                throw new IllegalStateException("Already added " + f3);
                            }
                        } else {
                            mo2955i1(new IllegalStateException("No instantiated fragment for (" + who + ")"));
                            throw null;
                        }
                    }
                }
                if (fms.f2260d != null) {
                    this.f2213i = new ArrayList<>(fms.f2260d.length);
                    int i = 0;
                    while (true) {
                        C0517b[] bVarArr = fms.f2260d;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0516a bse = bVarArr[i].mo2794f(this);
                        if (f2197I) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i + " (index " + bse.f2162t + "): " + bse);
                            PrintWriter pw = new PrintWriter(new C0413b("FragmentManager"));
                            bse.mo2781e("  ", pw, false);
                            pw.close();
                        }
                        this.f2213i.add(bse);
                        int i2 = bse.f2162t;
                        if (i2 >= 0) {
                            mo2942d1(i2, bse);
                        }
                        i++;
                    }
                } else {
                    this.f2213i = null;
                }
                String str = fms.f2261e;
                if (str != null) {
                    Fragment fragment3 = this.f2212h.get(str);
                    this.f2225u = fragment3;
                    mo2920S(fragment3);
                }
                this.f2210f = fms.f2262f;
            }
        }
    }

    /* renamed from: m */
    public final void mo2963m() {
        this.f2212h.values().removeAll(Collections.singleton((Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2958k(p000a.p046k.p047a.C0525h r5, p000a.p046k.p047a.C0522e r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            a.k.a.h r0 = r4.f2222r
            if (r0 != 0) goto L_0x004c
            r4.f2222r = r5
            r4.f2223s = r6
            r4.f2224t = r7
            if (r7 == 0) goto L_0x000f
            r4.mo2960k1()
        L_0x000f:
            boolean r0 = r5 instanceof p000a.p001a.C0002c
            if (r0 == 0) goto L_0x0026
            r0 = r5
            a.a.c r0 = (p000a.p001a.C0002c) r0
            androidx.activity.OnBackPressedDispatcher r1 = r0.mo8c()
            r4.f2215k = r1
            if (r7 == 0) goto L_0x0020
            r2 = r7
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            a.a.b r3 = r4.f2216l
            r1.mo3829a(r2, r3)
        L_0x0026:
            if (r7 == 0) goto L_0x0031
            a.k.a.j r0 = r7.f3469s
            a.k.a.l r0 = r0.mo2976r0(r7)
            r4.f2206G = r0
            goto L_0x004b
        L_0x0031:
            boolean r0 = r5 instanceof p000a.p051m.C0599s
            if (r0 == 0) goto L_0x0043
            r0 = r5
            a.m.s r0 = (p000a.p051m.C0599s) r0
            a.m.r r0 = r0.mo2825e()
            a.k.a.l r1 = p000a.p046k.p047a.C0545l.m2810g(r0)
            r4.f2206G = r1
            goto L_0x004b
        L_0x0043:
            a.k.a.l r0 = new a.k.a.l
            r1 = 0
            r0.<init>(r1)
            r4.f2206G = r0
        L_0x004b:
            return
        L_0x004c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p046k.p047a.C0529j.mo2958k(a.k.a.h, a.k.a.e, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: N0 */
    public void mo2911N0() {
        this.f2227w = false;
        this.f2228x = false;
        int addedCount = this.f2211g.size();
        for (int i = 0; i < addedCount; i++) {
            Fragment fragment = this.f2211g.get(i);
            if (fragment != null) {
                fragment.mo4605S();
            }
        }
    }

    /* renamed from: w */
    public void mo2986w() {
        this.f2227w = false;
        this.f2228x = false;
        mo2933Z(1);
    }

    /* renamed from: t */
    public void mo2979t() {
        this.f2227w = false;
        this.f2228x = false;
        mo2933Z(2);
    }

    /* renamed from: Y */
    public void mo2932Y() {
        this.f2227w = false;
        this.f2228x = false;
        mo2933Z(3);
    }

    /* renamed from: X */
    public void mo2930X() {
        this.f2227w = false;
        this.f2228x = false;
        mo2933Z(4);
    }

    /* renamed from: T */
    public void mo2922T() {
        mo2933Z(3);
    }

    /* renamed from: a0 */
    public void mo2935a0() {
        this.f2228x = true;
        mo2933Z(2);
    }

    /* renamed from: z */
    public void mo2992z() {
        mo2933Z(1);
    }

    /* renamed from: y */
    public void mo2990y() {
        this.f2229y = true;
        mo2946f0();
        mo2933Z(0);
        this.f2222r = null;
        this.f2223s = null;
        this.f2224t = null;
        if (this.f2215k != null) {
            this.f2216l.mo5d();
            this.f2215k = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: Z */
    public final void mo2933Z(int nextState) {
        try {
            this.f2209e = true;
            mo2905K0(nextState, false);
            this.f2209e = false;
            mo2946f0();
        } catch (Throwable th) {
            this.f2209e = false;
            throw th;
        }
    }

    /* renamed from: B */
    public void mo2888B(boolean z) {
        int size = this.f2211g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f2211g.get(size);
                if (fragment != null) {
                    fragment.mo4595M0(z);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: U */
    public void mo2924U(boolean z) {
        int size = this.f2211g.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = this.f2211g.get(size);
                if (fragment != null) {
                    fragment.mo4602Q0(z);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public void mo2982u(Configuration newConfig) {
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment f = this.f2211g.get(i);
            if (f != null) {
                f.mo4575C0(newConfig);
            }
        }
    }

    /* renamed from: A */
    public void mo2886A() {
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment fragment = this.f2211g.get(i);
            if (fragment != null) {
                fragment.mo4593L0();
            }
        }
    }

    /* renamed from: x */
    public boolean mo2988x(Menu menu, MenuInflater inflater) {
        if (this.f2221q < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment f = this.f2211g.get(i);
            if (f != null && f.mo4581F0(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f);
            }
        }
        if (this.f2214j != null) {
            for (int i2 = 0; i2 < this.f2214j.size(); i2++) {
                Fragment f2 = this.f2214j.get(i2);
                if (newMenus == null || !newMenus.contains(f2)) {
                    f2.mo4634f0();
                }
            }
        }
        this.f2214j = newMenus;
        return show;
    }

    /* renamed from: V */
    public boolean mo2926V(Menu menu) {
        if (this.f2221q < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment fragment = this.f2211g.get(i);
            if (fragment != null && fragment.mo4604R0(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: Q */
    public boolean mo2916Q(MenuItem item) {
        if (this.f2221q < 1) {
            return false;
        }
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment f = this.f2211g.get(i);
            if (f != null && f.mo4596N0(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo2984v(MenuItem item) {
        if (this.f2221q < 1) {
            return false;
        }
        for (int i = 0; i < this.f2211g.size(); i++) {
            Fragment f = this.f2211g.get(i);
            if (f != null && f.mo4577D0(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R */
    public void mo2918R(Menu menu) {
        if (this.f2221q >= 1) {
            for (int i = 0; i < this.f2211g.size(); i++) {
                Fragment f = this.f2211g.get(i);
                if (f != null) {
                    f.mo4598O0(menu);
                }
            }
        }
    }

    /* renamed from: f1 */
    public void mo2947f1(Fragment f) {
        if (f == null || (this.f2212h.get(f.f3456f) == f && (f.f3470t == null || f.mo4674u() == this))) {
            Fragment previousPrimaryNav = this.f2225u;
            this.f2225u = f;
            mo2920S(previousPrimaryNav);
            mo2920S(this.f2225u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: S */
    public final void mo2920S(Fragment f) {
        if (f != null && this.f2212h.get(f.f3456f) == f) {
            f.mo4606S0();
        }
    }

    /* renamed from: W */
    public void mo2928W() {
        mo2960k1();
        mo2920S(this.f2225u);
    }

    /* renamed from: u0 */
    public Fragment mo2983u0() {
        return this.f2225u;
    }

    /* renamed from: e1 */
    public void mo2944e1(Fragment f, C0577d.C0579b state) {
        if (this.f2212h.get(f.f3456f) == f && (f.f3470t == null || f.mo4674u() == this)) {
            f.f3446R = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: b */
    public C0524g mo2867b() {
        if (super.mo2867b() == C0526i.f2195c) {
            Fragment fragment = this.f2224t;
            if (fragment != null) {
                return fragment.f3469s.mo2867b();
            }
            mo2870e(new C0536f());
        }
        return super.mo2867b();
    }

    /* renamed from: a.k.a.j$f */
    public class C0536f extends C0524g {
        public C0536f() {
        }

        /* renamed from: a */
        public Fragment mo2862a(ClassLoader classLoader, String className) {
            C0525h hVar = C0529j.this.f2222r;
            return hVar.mo2837b(hVar.mo2864i(), className, (Bundle) null);
        }
    }

    /* renamed from: I */
    public void mo2900I(Fragment f, Context context, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2900I(f, context, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2877g(this, f, context);
            }
        }
    }

    /* renamed from: D */
    public void mo2892D(Fragment f, Context context, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2892D(f, context, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2872b(this, f, context);
            }
        }
    }

    /* renamed from: J */
    public void mo2902J(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2902J(f, savedInstanceState, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2878h(this, f, savedInstanceState);
            }
        }
    }

    /* renamed from: E */
    public void mo2894E(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2894E(f, savedInstanceState, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2873c(this, f, savedInstanceState);
            }
        }
    }

    /* renamed from: C */
    public void mo2890C(Fragment f, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2890C(f, savedInstanceState, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2871a(this, f, savedInstanceState);
            }
        }
    }

    /* renamed from: O */
    public void mo2912O(Fragment f, View v, Bundle savedInstanceState, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2912O(f, v, savedInstanceState, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2883m(this, f, v, savedInstanceState);
            }
        }
    }

    /* renamed from: M */
    public void mo2908M(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2908M(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2881k(this, f);
            }
        }
    }

    /* renamed from: K */
    public void mo2904K(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2904K(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2879i(this, f);
            }
        }
    }

    /* renamed from: H */
    public void mo2899H(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2899H(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2876f(this, f);
            }
        }
    }

    /* renamed from: N */
    public void mo2910N(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2910N(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2882l(this, f);
            }
        }
    }

    /* renamed from: L */
    public void mo2906L(Fragment f, Bundle outState, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2906L(f, outState, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2880j(this, f, outState);
            }
        }
    }

    /* renamed from: P */
    public void mo2914P(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2914P(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2884n(this, f);
            }
        }
    }

    /* renamed from: F */
    public void mo2896F(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2896F(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2874d(this, f);
            }
        }
    }

    /* renamed from: G */
    public void mo2897G(Fragment f, boolean onlyRecursive) {
        Fragment fragment = this.f2224t;
        if (fragment != null) {
            C0526i parentManager = fragment.mo4674u();
            if (parentManager instanceof C0529j) {
                ((C0529j) parentManager).mo2897G(f, true);
            }
        }
        Iterator<C0539i> it = this.f2220p.iterator();
        while (it.hasNext()) {
            C0539i holder = it.next();
            if (!onlyRecursive || holder.f2253b) {
                holder.f2252a.mo2875e(this, f);
            }
        }
    }

    /* renamed from: n */
    public boolean mo2965n() {
        boolean hasMenu = false;
        for (Fragment f : this.f2212h.values()) {
            if (f != null) {
                hasMenu = mo2993z0(f);
                continue;
            }
            if (hasMenu) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z0 */
    public final boolean mo2993z0(Fragment f) {
        return (f.f3432D && f.f3433E) || f.f3471u.mo2965n();
    }

    /* renamed from: Y0 */
    public static int m2688Y0(int transit) {
        if (transit == 4097) {
            return 8194;
        }
        if (transit == 4099) {
            return 4099;
        }
        if (transit != 8194) {
            return 0;
        }
        return 4097;
    }

    /* renamed from: j1 */
    public static int m2690j1(int transit, boolean enter) {
        if (transit == 4097) {
            return enter ? 1 : 2;
        } else if (transit == 4099) {
            return enter ? 5 : 6;
        } else if (transit != 8194) {
            return -1;
        } else {
            return enter ? 3 : 4;
        }
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        String fname;
        Fragment fragment;
        AttributeSet attributeSet = attrs;
        Fragment fragment2 = null;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attributeSet.getAttributeValue((String) null, "class");
        TypedArray a = context.obtainStyledAttributes(attributeSet, C0540j.f2254a);
        int i = 0;
        if (fname2 == null) {
            fname = a.getString(0);
        } else {
            fname = fname2;
        }
        int id = a.getResourceId(1, -1);
        String tag = a.getString(2);
        a.recycle();
        if (fname == null || !C0524g.m2649b(context.getClassLoader(), fname)) {
            return null;
        }
        if (parent != null) {
            i = parent.getId();
        }
        int containerId = i;
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        if (id != -1) {
            fragment2 = mo2957j0(id);
        }
        if (fragment2 == null && tag != null) {
            fragment2 = mo2959k0(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = mo2957j0(containerId);
        }
        if (f2197I) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(id) + " fname=" + fname + " existing=" + fragment2);
        }
        if (fragment2 == null) {
            Fragment fragment3 = mo2867b().mo2862a(context.getClassLoader(), fname);
            fragment3.f3464n = true;
            fragment3.f3473w = id != 0 ? id : containerId;
            fragment3.f3474x = containerId;
            fragment3.f3475y = tag;
            fragment3.f3465o = true;
            fragment3.f3469s = this;
            C0525h hVar = this.f2222r;
            fragment3.f3470t = hVar;
            fragment3.mo4653l0(hVar.mo2864i(), attributeSet, fragment3.f3453c);
            mo2950h(fragment3, true);
            fragment = fragment3;
        } else if (!fragment2.f3465o) {
            fragment2.f3465o = true;
            C0525h hVar2 = this.f2222r;
            fragment2.f3470t = hVar2;
            fragment2.mo4653l0(hVar2.mo2864i(), attributeSet, fragment2.f3453c);
            fragment = fragment2;
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        if (this.f2221q >= 1 || !fragment.f3464n) {
            mo2907L0(fragment);
        } else {
            mo2909M0(fragment, 1, 0, 0, false);
        }
        View view = fragment.f3436H;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.f3436H.getTag() == null) {
                fragment.f3436H.setTag(tag);
            }
            return fragment.f3436H;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView((View) null, name, context, attrs);
    }

    /* renamed from: t0 */
    public LayoutInflater.Factory2 mo2980t0() {
        return this;
    }

    /* renamed from: a.k.a.j$l */
    public static class C0542l implements Fragment.C0843f {

        /* renamed from: a */
        public final boolean f2255a;

        /* renamed from: b */
        public final C0516a f2256b;

        /* renamed from: c */
        public int f2257c;

        public C0542l(C0516a record, boolean isBack) {
            this.f2255a = isBack;
            this.f2256b = record;
        }

        /* renamed from: a */
        public void mo3004a() {
            int i = this.f2257c - 1;
            this.f2257c = i;
            if (i == 0) {
                this.f2256b.f2160r.mo2940c1();
            }
        }

        /* renamed from: b */
        public void mo3005b() {
            this.f2257c++;
        }

        /* renamed from: e */
        public boolean mo3008e() {
            return this.f2257c == 0;
        }

        /* renamed from: d */
        public void mo3007d() {
            boolean z = false;
            boolean canceled = this.f2257c > 0;
            C0529j manager = this.f2256b.f2160r;
            int numAdded = manager.f2211g.size();
            for (int i = 0; i < numAdded; i++) {
                Fragment fragment = manager.f2211g.get(i);
                fragment.mo4645i1((Fragment.C0843f) null);
                if (canceled && fragment.mo4601Q()) {
                    fragment.mo4651k1();
                }
            }
            C0516a aVar = this.f2256b;
            C0529j jVar = aVar.f2160r;
            boolean z2 = this.f2255a;
            if (!canceled) {
                z = true;
            }
            jVar.mo2973q(aVar, z2, z, true);
        }

        /* renamed from: c */
        public void mo3006c() {
            C0516a aVar = this.f2256b;
            aVar.f2160r.mo2973q(aVar, this.f2255a, false, false);
        }
    }

    /* renamed from: a.k.a.j$g */
    public static class C0537g {

        /* renamed from: a */
        public final Animation f2245a;

        /* renamed from: b */
        public final Animator f2246b;

        public C0537g(Animation animation) {
            this.f2245a = animation;
            this.f2246b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C0537g(Animator animator) {
            this.f2245a = null;
            this.f2246b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: a.k.a.j$h */
    public static class C0538h extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f2247b;

        /* renamed from: c */
        public final View f2248c;

        /* renamed from: d */
        public boolean f2249d;

        /* renamed from: e */
        public boolean f2250e;

        /* renamed from: f */
        public boolean f2251f = true;

        public C0538h(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f2247b = parent;
            this.f2248c = child;
            addAnimation(animation);
            parent.post(this);
        }

        public boolean getTransformation(long currentTime, Transformation t) {
            this.f2251f = true;
            if (this.f2249d) {
                return true ^ this.f2250e;
            }
            if (!super.getTransformation(currentTime, t)) {
                this.f2249d = true;
                C0458p.m2224a(this.f2247b, this);
            }
            return true;
        }

        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f2251f = true;
            if (this.f2249d) {
                return true ^ this.f2250e;
            }
            if (!super.getTransformation(currentTime, outTransformation, scale)) {
                this.f2249d = true;
                C0458p.m2224a(this.f2247b, this);
            }
            return true;
        }

        public void run() {
            if (this.f2249d || !this.f2251f) {
                this.f2247b.endViewTransition(this.f2248c);
                this.f2250e = true;
                return;
            }
            this.f2251f = false;
            this.f2247b.post(this);
        }
    }
}
