package p000a.p046k.p047a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;
import p000a.p046k.p047a.C0529j;
import p000a.p046k.p047a.C0549n;

/* renamed from: a.k.a.a */
public final class C0516a extends C0549n implements C0529j.C0541k {

    /* renamed from: r */
    public final C0529j f2160r;

    /* renamed from: s */
    public boolean f2161s;

    /* renamed from: t */
    public int f2162t = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2162t >= 0) {
            sb.append(" #");
            sb.append(this.f2162t);
        }
        if (this.f2292i != null) {
            sb.append(" ");
            sb.append(this.f2292i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: d */
    public void mo2780d(String prefix, PrintWriter writer) {
        mo2781e(prefix, writer, true);
    }

    /* renamed from: e */
    public void mo2781e(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.f2292i);
            writer.print(" mIndex=");
            writer.print(this.f2162t);
            writer.print(" mCommitted=");
            writer.println(this.f2161s);
            if (this.f2289f != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f2289f));
                writer.print(" mTransitionStyle=#");
                writer.println(Integer.toHexString(this.f2290g));
            }
            if (!(this.f2285b == 0 && this.f2286c == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f2285b));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f2286c));
            }
            if (!(this.f2287d == 0 && this.f2288e == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f2287d));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f2288e));
            }
            if (!(this.f2293j == 0 && this.f2294k == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.f2293j));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.f2294k);
            }
            if (!(this.f2295l == 0 && this.f2296m == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.f2295l));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.f2296m);
            }
        }
        if (!this.f2284a.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            int numOps = this.f2284a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                C0549n.C0550a op = this.f2284a.get(opNum);
                switch (op.f2301a) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        cmdStr = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        cmdStr = "cmd=" + op.f2301a;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f2302b);
                if (full) {
                    if (!(op.f2303c == 0 && op.f2304d == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f2303c));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f2304d));
                    }
                    if (op.f2305e != 0 || op.f2306f != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f2305e));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f2306f));
                    }
                }
            }
        }
    }

    public C0516a(C0529j manager) {
        this.f2160r = manager;
    }

    /* renamed from: c */
    public void mo2779c(int amt) {
        if (this.f2291h) {
            if (C0529j.f2197I) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.f2284a.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                C0549n.C0550a op = this.f2284a.get(opNum);
                Fragment fragment = op.f2302b;
                if (fragment != null) {
                    fragment.f3468r += amt;
                    if (C0529j.f2197I) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f2302b + " to " + op.f2302b.f3468r);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo2789n() {
        if (this.f2300q != null) {
            for (int i = 0; i < this.f2300q.size(); i++) {
                this.f2300q.get(i).run();
            }
            this.f2300q = null;
        }
    }

    /* renamed from: a */
    public boolean mo2778a(ArrayList<C0516a> records, ArrayList<Boolean> isRecordPop) {
        if (C0529j.f2197I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        records.add(this);
        isRecordPop.add(false);
        if (!this.f2291h) {
            return true;
        }
        this.f2160r.mo2948g(this);
        return true;
    }

    /* renamed from: j */
    public boolean mo2786j(int containerId) {
        int numOps = this.f2284a.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            Fragment fragment = this.f2284a.get(opNum).f2302b;
            if (fragment != null) {
                fragContainer = fragment.f3474x;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    /* renamed from: k */
    public boolean mo2787k(ArrayList<C0516a> records, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f2284a.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            Fragment fragment = this.f2284a.get(opNum).f2302b;
            int container = fragment != null ? fragment.f3474x : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    C0516a record = records.get(i);
                    int numThoseOps = record.f2284a.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        Fragment fragment2 = record.f2284a.get(thoseOpIndex).f2302b;
                        if ((fragment2 != null ? fragment2.f3474x : 0) == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo2782f() {
        int numOps = this.f2284a.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            C0549n.C0550a op = this.f2284a.get(opNum);
            Fragment f = op.f2302b;
            if (f != null) {
                f.mo4641h1(this.f2289f, this.f2290g);
            }
            switch (op.f2301a) {
                case 1:
                    f.mo4638g1(op.f2303c);
                    this.f2160r.mo2950h(f, false);
                    break;
                case 3:
                    f.mo4638g1(op.f2304d);
                    this.f2160r.mo2923T0(f);
                    break;
                case 4:
                    f.mo4638g1(op.f2304d);
                    this.f2160r.mo2989x0(f);
                    break;
                case 5:
                    f.mo4638g1(op.f2303c);
                    this.f2160r.mo2949g1(f);
                    break;
                case 6:
                    f.mo4638g1(op.f2304d);
                    this.f2160r.mo2977s(f);
                    break;
                case 7:
                    f.mo4638g1(op.f2303c);
                    this.f2160r.mo2961l(f);
                    break;
                case 8:
                    this.f2160r.mo2947f1(f);
                    break;
                case 9:
                    this.f2160r.mo2947f1((Fragment) null);
                    break;
                case 10:
                    this.f2160r.mo2944e1(f, op.f2308h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f2301a);
            }
            if (!(this.f2299p || op.f2301a == 1 || f == null)) {
                this.f2160r.mo2903J0(f);
            }
        }
        if (this.f2299p == 0) {
            C0529j jVar = this.f2160r;
            jVar.mo2905K0(jVar.f2221q, true);
        }
    }

    /* renamed from: g */
    public void mo2783g(boolean moveToState) {
        for (int opNum = this.f2284a.size() - 1; opNum >= 0; opNum--) {
            C0549n.C0550a op = this.f2284a.get(opNum);
            Fragment f = op.f2302b;
            if (f != null) {
                f.mo4641h1(C0529j.m2688Y0(this.f2289f), this.f2290g);
            }
            switch (op.f2301a) {
                case 1:
                    f.mo4638g1(op.f2306f);
                    this.f2160r.mo2923T0(f);
                    break;
                case 3:
                    f.mo4638g1(op.f2305e);
                    this.f2160r.mo2950h(f, false);
                    break;
                case 4:
                    f.mo4638g1(op.f2305e);
                    this.f2160r.mo2949g1(f);
                    break;
                case 5:
                    f.mo4638g1(op.f2306f);
                    this.f2160r.mo2989x0(f);
                    break;
                case 6:
                    f.mo4638g1(op.f2305e);
                    this.f2160r.mo2961l(f);
                    break;
                case 7:
                    f.mo4638g1(op.f2306f);
                    this.f2160r.mo2977s(f);
                    break;
                case 8:
                    this.f2160r.mo2947f1((Fragment) null);
                    break;
                case 9:
                    this.f2160r.mo2947f1(f);
                    break;
                case 10:
                    this.f2160r.mo2944e1(f, op.f2307g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f2301a);
            }
            if (!(this.f2299p || op.f2301a == 3 || f == null)) {
                this.f2160r.mo2903J0(f);
            }
        }
        if (this.f2299p == 0 && moveToState) {
            C0529j jVar = this.f2160r;
            jVar.mo2905K0(jVar.f2221q, true);
        }
    }

    /* renamed from: h */
    public Fragment mo2784h(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f2284a.size()) {
            C0549n.C0550a op = this.f2284a.get(opNum);
            int i = op.f2301a;
            if (i != 1) {
                if (i == 2) {
                    Fragment f = op.f2302b;
                    int containerId = f.f3474x;
                    boolean alreadyAdded = false;
                    for (int i2 = added.size() - 1; i2 >= 0; i2--) {
                        Fragment old = added.get(i2);
                        if (old.f3474x == containerId) {
                            if (old == f) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f2284a.add(opNum, new C0549n.C0550a(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                C0549n.C0550a removeOp = new C0549n.C0550a(3, old);
                                removeOp.f2303c = op.f2303c;
                                removeOp.f2305e = op.f2305e;
                                removeOp.f2304d = op.f2304d;
                                removeOp.f2306f = op.f2306f;
                                this.f2284a.add(opNum, removeOp);
                                added.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f2284a.remove(opNum);
                        opNum--;
                    } else {
                        op.f2301a = 1;
                        added.add(f);
                    }
                } else if (i == 3 || i == 6) {
                    added.remove(op.f2302b);
                    Fragment fragment = op.f2302b;
                    if (fragment == oldPrimaryNav) {
                        this.f2284a.add(opNum, new C0549n.C0550a(9, fragment));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i != 7) {
                    if (i == 8) {
                        this.f2284a.add(opNum, new C0549n.C0550a(9, oldPrimaryNav));
                        opNum++;
                        oldPrimaryNav = op.f2302b;
                    }
                }
                opNum++;
            }
            added.add(op.f2302b);
            opNum++;
        }
        return oldPrimaryNav;
    }

    /* renamed from: p */
    public Fragment mo2791p(ArrayList<Fragment> added, Fragment oldPrimaryNav) {
        for (int opNum = this.f2284a.size() - 1; opNum >= 0; opNum--) {
            C0549n.C0550a op = this.f2284a.get(opNum);
            int i = op.f2301a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            oldPrimaryNav = null;
                            break;
                        case 9:
                            oldPrimaryNav = op.f2302b;
                            break;
                        case 10:
                            op.f2308h = op.f2307g;
                            break;
                    }
                }
                added.add(op.f2302b);
            }
            added.remove(op.f2302b);
        }
        return oldPrimaryNav;
    }

    /* renamed from: m */
    public boolean mo2788m() {
        for (int opNum = 0; opNum < this.f2284a.size(); opNum++) {
            if (m2580l(this.f2284a.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo2790o(Fragment.C0843f listener) {
        for (int opNum = 0; opNum < this.f2284a.size(); opNum++) {
            C0549n.C0550a op = this.f2284a.get(opNum);
            if (m2580l(op)) {
                op.f2302b.mo4645i1(listener);
            }
        }
    }

    /* renamed from: l */
    public static boolean m2580l(C0549n.C0550a op) {
        Fragment fragment = op.f2302b;
        return fragment != null && fragment.f3462l && fragment.f3436H != null && !fragment.f3429A && !fragment.f3476z && fragment.mo4601Q();
    }

    /* renamed from: i */
    public String mo2785i() {
        return this.f2292i;
    }
}
