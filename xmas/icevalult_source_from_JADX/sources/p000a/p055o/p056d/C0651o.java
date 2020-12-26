package p000a.p055o.p056d;

import android.view.View;

/* renamed from: a.o.d.o */
public class C0651o {

    /* renamed from: a */
    public final C0653b f2580a;

    /* renamed from: b */
    public C0652a f2581b = new C0652a();

    /* renamed from: a.o.d.o$b */
    public interface C0653b {
        /* renamed from: a */
        View mo3404a(int i);

        /* renamed from: b */
        int mo3405b();

        /* renamed from: c */
        int mo3406c();

        /* renamed from: d */
        int mo3407d(View view);

        /* renamed from: e */
        int mo3408e(View view);
    }

    public C0651o(C0653b callback) {
        this.f2580a = callback;
    }

    /* renamed from: a.o.d.o$a */
    public static class C0652a {

        /* renamed from: a */
        public int f2582a = 0;

        /* renamed from: b */
        public int f2583b;

        /* renamed from: c */
        public int f2584c;

        /* renamed from: d */
        public int f2585d;

        /* renamed from: e */
        public int f2586e;

        /* renamed from: e */
        public void mo3403e(int rvStart, int rvEnd, int childStart, int childEnd) {
            this.f2583b = rvStart;
            this.f2584c = rvEnd;
            this.f2585d = childStart;
            this.f2586e = childEnd;
        }

        /* renamed from: a */
        public void mo3399a(int flags) {
            this.f2582a |= flags;
        }

        /* renamed from: d */
        public void mo3402d() {
            this.f2582a = 0;
        }

        /* renamed from: c */
        public int mo3401c(int x, int y) {
            if (x > y) {
                return 1;
            }
            if (x == y) {
                return 2;
            }
            return 4;
        }

        /* renamed from: b */
        public boolean mo3400b() {
            int i = this.f2582a;
            if ((i & 7) != 0 && (i & (mo3401c(this.f2585d, this.f2583b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2582a;
            if ((i2 & 112) != 0 && (i2 & (mo3401c(this.f2585d, this.f2584c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2582a;
            if ((i3 & 1792) != 0 && (i3 & (mo3401c(this.f2586e, this.f2583b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2582a;
            if ((i4 & 28672) == 0 || (i4 & (mo3401c(this.f2586e, this.f2584c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public View mo3397a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f2580a.mo3406c();
        int end = this.f2580a.mo3405b();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i = fromIndex; i != toIndex; i += next) {
            View child = this.f2580a.mo3404a(i);
            this.f2581b.mo3403e(start, end, this.f2580a.mo3408e(child), this.f2580a.mo3407d(child));
            if (preferredBoundFlags != 0) {
                this.f2581b.mo3402d();
                this.f2581b.mo3399a(preferredBoundFlags);
                if (this.f2581b.mo3400b()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f2581b.mo3402d();
                this.f2581b.mo3399a(acceptableBoundFlags);
                if (this.f2581b.mo3400b()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    /* renamed from: b */
    public boolean mo3398b(View child, int boundsFlags) {
        this.f2581b.mo3403e(this.f2580a.mo3406c(), this.f2580a.mo3405b(), this.f2580a.mo3408e(child), this.f2580a.mo3407d(child));
        if (boundsFlags == 0) {
            return false;
        }
        this.f2581b.mo3402d();
        this.f2581b.mo3399a(boundsFlags);
        return this.f2581b.mo3400b();
    }
}
