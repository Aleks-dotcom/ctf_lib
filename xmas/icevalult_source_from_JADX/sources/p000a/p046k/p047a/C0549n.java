package p000a.p046k.p047a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p000a.p051m.C0577d;

/* renamed from: a.k.a.n */
public abstract class C0549n {

    /* renamed from: a */
    public ArrayList<C0550a> f2284a = new ArrayList<>();

    /* renamed from: b */
    public int f2285b;

    /* renamed from: c */
    public int f2286c;

    /* renamed from: d */
    public int f2287d;

    /* renamed from: e */
    public int f2288e;

    /* renamed from: f */
    public int f2289f;

    /* renamed from: g */
    public int f2290g;

    /* renamed from: h */
    public boolean f2291h;

    /* renamed from: i */
    public String f2292i;

    /* renamed from: j */
    public int f2293j;

    /* renamed from: k */
    public CharSequence f2294k;

    /* renamed from: l */
    public int f2295l;

    /* renamed from: m */
    public CharSequence f2296m;

    /* renamed from: n */
    public ArrayList<String> f2297n;

    /* renamed from: o */
    public ArrayList<String> f2298o;

    /* renamed from: p */
    public boolean f2299p = false;

    /* renamed from: q */
    public ArrayList<Runnable> f2300q;

    /* renamed from: a.k.a.n$a */
    public static final class C0550a {

        /* renamed from: a */
        public int f2301a;

        /* renamed from: b */
        public Fragment f2302b;

        /* renamed from: c */
        public int f2303c;

        /* renamed from: d */
        public int f2304d;

        /* renamed from: e */
        public int f2305e;

        /* renamed from: f */
        public int f2306f;

        /* renamed from: g */
        public C0577d.C0579b f2307g;

        /* renamed from: h */
        public C0577d.C0579b f2308h;

        public C0550a() {
        }

        public C0550a(int cmd, Fragment fragment) {
            this.f2301a = cmd;
            this.f2302b = fragment;
            C0577d.C0579b bVar = C0577d.C0579b.RESUMED;
            this.f2307g = bVar;
            this.f2308h = bVar;
        }
    }

    /* renamed from: b */
    public void mo3036b(C0550a op) {
        this.f2284a.add(op);
        op.f2303c = this.f2285b;
        op.f2304d = this.f2286c;
        op.f2305e = this.f2287d;
        op.f2306f = this.f2288e;
    }
}
