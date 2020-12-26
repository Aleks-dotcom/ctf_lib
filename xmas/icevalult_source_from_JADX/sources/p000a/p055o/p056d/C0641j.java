package p000a.p055o.p056d;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.j */
public abstract class C0641j {

    /* renamed from: a */
    public final RecyclerView.C0876o f2566a;

    /* renamed from: b */
    public int f2567b;

    /* renamed from: c */
    public final Rect f2568c;

    /* renamed from: d */
    public abstract int mo3346d(View view);

    /* renamed from: e */
    public abstract int mo3347e(View view);

    /* renamed from: f */
    public abstract int mo3348f(View view);

    /* renamed from: g */
    public abstract int mo3349g(View view);

    /* renamed from: h */
    public abstract int mo3350h();

    /* renamed from: i */
    public abstract int mo3351i();

    /* renamed from: j */
    public abstract int mo3352j();

    /* renamed from: k */
    public abstract int mo3353k();

    /* renamed from: l */
    public abstract int mo3354l();

    /* renamed from: m */
    public abstract int mo3355m();

    /* renamed from: n */
    public abstract int mo3356n();

    /* renamed from: p */
    public abstract int mo3358p(View view);

    /* renamed from: q */
    public abstract int mo3359q(View view);

    /* renamed from: r */
    public abstract void mo3360r(int i);

    public /* synthetic */ C0641j(RecyclerView.C0876o x0, C0642a x1) {
        this(x0);
    }

    public C0641j(RecyclerView.C0876o layoutManager) {
        this.f2567b = RecyclerView.UNDEFINED_DURATION;
        this.f2568c = new Rect();
        this.f2566a = layoutManager;
    }

    /* renamed from: s */
    public void mo3361s() {
        this.f2567b = mo3356n();
    }

    /* renamed from: o */
    public int mo3357o() {
        if (Integer.MIN_VALUE == this.f2567b) {
            return 0;
        }
        return mo3356n() - this.f2567b;
    }

    /* renamed from: b */
    public static C0641j m3160b(RecyclerView.C0876o layoutManager, int orientation) {
        if (orientation == 0) {
            return m3159a(layoutManager);
        }
        if (orientation == 1) {
            return m3161c(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: a.o.d.j$a */
    public static class C0642a extends C0641j {
        public C0642a(RecyclerView.C0876o layoutManager) {
            super(layoutManager, (C0642a) null);
        }

        /* renamed from: i */
        public int mo3351i() {
            return this.f2566a.mo5207o0() - this.f2566a.mo5188f0();
        }

        /* renamed from: h */
        public int mo3350h() {
            return this.f2566a.mo5207o0();
        }

        /* renamed from: r */
        public void mo3360r(int amount) {
            this.f2566a.mo5138C0(amount);
        }

        /* renamed from: m */
        public int mo3355m() {
            return this.f2566a.mo5185e0();
        }

        /* renamed from: e */
        public int mo3347e(View view) {
            RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
            return this.f2566a.mo5165S(view) + params.leftMargin + params.rightMargin;
        }

        /* renamed from: f */
        public int mo3348f(View view) {
            RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
            return this.f2566a.mo5164R(view) + params.topMargin + params.bottomMargin;
        }

        /* renamed from: d */
        public int mo3346d(View view) {
            return this.f2566a.mo5166T(view) + ((RecyclerView.C0881p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: g */
        public int mo3349g(View view) {
            return this.f2566a.mo5162Q(view) - ((RecyclerView.C0881p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: p */
        public int mo3358p(View view) {
            this.f2566a.mo5205n0(view, true, this.f2568c);
            return this.f2568c.right;
        }

        /* renamed from: q */
        public int mo3359q(View view) {
            this.f2566a.mo5205n0(view, true, this.f2568c);
            return this.f2568c.left;
        }

        /* renamed from: n */
        public int mo3356n() {
            return (this.f2566a.mo5207o0() - this.f2566a.mo5185e0()) - this.f2566a.mo5188f0();
        }

        /* renamed from: j */
        public int mo3352j() {
            return this.f2566a.mo5188f0();
        }

        /* renamed from: k */
        public int mo3353k() {
            return this.f2566a.mo5209p0();
        }

        /* renamed from: l */
        public int mo3354l() {
            return this.f2566a.mo5171X();
        }
    }

    /* renamed from: a */
    public static C0641j m3159a(RecyclerView.C0876o layoutManager) {
        return new C0642a(layoutManager);
    }

    /* renamed from: a.o.d.j$b */
    public static class C0643b extends C0641j {
        public C0643b(RecyclerView.C0876o layoutManager) {
            super(layoutManager, (C0642a) null);
        }

        /* renamed from: i */
        public int mo3351i() {
            return this.f2566a.mo5170W() - this.f2566a.mo5183d0();
        }

        /* renamed from: h */
        public int mo3350h() {
            return this.f2566a.mo5170W();
        }

        /* renamed from: r */
        public void mo3360r(int amount) {
            this.f2566a.mo5139D0(amount);
        }

        /* renamed from: m */
        public int mo3355m() {
            return this.f2566a.mo5190g0();
        }

        /* renamed from: e */
        public int mo3347e(View view) {
            RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
            return this.f2566a.mo5164R(view) + params.topMargin + params.bottomMargin;
        }

        /* renamed from: f */
        public int mo3348f(View view) {
            RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
            return this.f2566a.mo5165S(view) + params.leftMargin + params.rightMargin;
        }

        /* renamed from: d */
        public int mo3346d(View view) {
            return this.f2566a.mo5159O(view) + ((RecyclerView.C0881p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: g */
        public int mo3349g(View view) {
            return this.f2566a.mo5167U(view) - ((RecyclerView.C0881p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: p */
        public int mo3358p(View view) {
            this.f2566a.mo5205n0(view, true, this.f2568c);
            return this.f2568c.bottom;
        }

        /* renamed from: q */
        public int mo3359q(View view) {
            this.f2566a.mo5205n0(view, true, this.f2568c);
            return this.f2568c.top;
        }

        /* renamed from: n */
        public int mo3356n() {
            return (this.f2566a.mo5170W() - this.f2566a.mo5190g0()) - this.f2566a.mo5183d0();
        }

        /* renamed from: j */
        public int mo3352j() {
            return this.f2566a.mo5183d0();
        }

        /* renamed from: k */
        public int mo3353k() {
            return this.f2566a.mo5171X();
        }

        /* renamed from: l */
        public int mo3354l() {
            return this.f2566a.mo5209p0();
        }
    }

    /* renamed from: c */
    public static C0641j m3161c(RecyclerView.C0876o layoutManager) {
        return new C0643b(layoutManager);
    }
}
