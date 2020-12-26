package p000a.p055o.p056d;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a.o.d.b */
public class C0613b {

    /* renamed from: a */
    public final C0615b f2439a;

    /* renamed from: b */
    public final C0614a f2440b = new C0614a();

    /* renamed from: c */
    public final List<View> f2441c = new ArrayList();

    /* renamed from: a.o.d.b$b */
    public interface C0615b {
        /* renamed from: a */
        View mo3220a(int i);

        /* renamed from: b */
        void mo3221b(int i);

        /* renamed from: c */
        void mo3222c(View view);

        /* renamed from: d */
        void mo3223d(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: e */
        void mo3224e(View view);

        /* renamed from: f */
        void mo3225f(View view, int i);

        /* renamed from: g */
        int mo3226g(View view);

        /* renamed from: h */
        int mo3227h();

        /* renamed from: i */
        void mo3228i(int i);

        /* renamed from: j */
        void mo3229j();

        /* renamed from: k */
        RecyclerView.C0862d0 mo3230k(View view);
    }

    public C0613b(C0615b callback) {
        this.f2439a = callback;
    }

    /* renamed from: l */
    public final void mo3201l(View child) {
        this.f2441c.add(child);
        this.f2439a.mo3224e(child);
    }

    /* renamed from: t */
    public final boolean mo3209t(View child) {
        if (!this.f2441c.remove(child)) {
            return false;
        }
        this.f2439a.mo3222c(child);
        return true;
    }

    /* renamed from: b */
    public void mo3191b(View child, boolean hidden) {
        mo3190a(child, -1, hidden);
    }

    /* renamed from: a */
    public void mo3190a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f2439a.mo3227h();
        } else {
            offset = mo3197h(index);
        }
        this.f2440b.mo3215e(offset, hidden);
        if (hidden) {
            mo3201l(child);
        }
        this.f2439a.mo3225f(child, offset);
    }

    /* renamed from: h */
    public final int mo3197h(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = this.f2439a.mo3227h();
        int offset = index;
        while (offset < limit) {
            int diff = index - (offset - this.f2440b.mo3212b(offset));
            if (diff == 0) {
                while (this.f2440b.mo3214d(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    /* renamed from: p */
    public void mo3205p(View view) {
        int index = this.f2439a.mo3226g(view);
        if (index >= 0) {
            if (this.f2440b.mo3216f(index)) {
                mo3209t(view);
            }
            this.f2439a.mo3228i(index);
        }
    }

    /* renamed from: q */
    public void mo3206q(int index) {
        int offset = mo3197h(index);
        View view = this.f2439a.mo3220a(offset);
        if (view != null) {
            if (this.f2440b.mo3216f(offset)) {
                mo3209t(view);
            }
            this.f2439a.mo3228i(offset);
        }
    }

    /* renamed from: f */
    public View mo3195f(int index) {
        return this.f2439a.mo3220a(mo3197h(index));
    }

    /* renamed from: o */
    public void mo3204o() {
        this.f2440b.mo3217g();
        for (int i = this.f2441c.size() - 1; i >= 0; i--) {
            this.f2439a.mo3222c(this.f2441c.get(i));
            this.f2441c.remove(i);
        }
        this.f2439a.mo3229j();
    }

    /* renamed from: e */
    public View mo3194e(int position) {
        int count = this.f2441c.size();
        for (int i = 0; i < count; i++) {
            View view = this.f2441c.get(i);
            RecyclerView.C0862d0 holder = this.f2439a.mo3230k(view);
            if (holder.mo5071m() == position && !holder.mo5078t() && !holder.mo5081v()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo3192c(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f2439a.mo3227h();
        } else {
            offset = mo3197h(index);
        }
        this.f2440b.mo3215e(offset, hidden);
        if (hidden) {
            mo3201l(child);
        }
        this.f2439a.mo3223d(child, offset, layoutParams);
    }

    /* renamed from: g */
    public int mo3196g() {
        return this.f2439a.mo3227h() - this.f2441c.size();
    }

    /* renamed from: j */
    public int mo3199j() {
        return this.f2439a.mo3227h();
    }

    /* renamed from: i */
    public View mo3198i(int index) {
        return this.f2439a.mo3220a(index);
    }

    /* renamed from: d */
    public void mo3193d(int index) {
        int offset = mo3197h(index);
        this.f2440b.mo3216f(offset);
        this.f2439a.mo3221b(offset);
    }

    /* renamed from: m */
    public int mo3202m(View child) {
        int index = this.f2439a.mo3226g(child);
        if (index != -1 && !this.f2440b.mo3214d(index)) {
            return index - this.f2440b.mo3212b(index);
        }
        return -1;
    }

    /* renamed from: n */
    public boolean mo3203n(View view) {
        return this.f2441c.contains(view);
    }

    /* renamed from: k */
    public void mo3200k(View view) {
        int offset = this.f2439a.mo3226g(view);
        if (offset >= 0) {
            this.f2440b.mo3218h(offset);
            mo3201l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: s */
    public void mo3208s(View view) {
        int offset = this.f2439a.mo3226g(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2440b.mo3214d(offset)) {
            this.f2440b.mo3211a(offset);
            mo3209t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2440b.toString() + ", hidden list:" + this.f2441c.size();
    }

    /* renamed from: r */
    public boolean mo3207r(View view) {
        int index = this.f2439a.mo3226g(view);
        if (index == -1) {
            mo3209t(view);
            return true;
        } else if (!this.f2440b.mo3214d(index)) {
            return false;
        } else {
            this.f2440b.mo3216f(index);
            mo3209t(view);
            this.f2439a.mo3228i(index);
            return true;
        }
    }

    /* renamed from: a.o.d.b$a */
    public static class C0614a {

        /* renamed from: a */
        public long f2442a = 0;

        /* renamed from: b */
        public C0614a f2443b;

        /* renamed from: h */
        public void mo3218h(int index) {
            if (index >= 64) {
                mo3213c();
                this.f2443b.mo3218h(index - 64);
                return;
            }
            this.f2442a |= 1 << index;
        }

        /* renamed from: c */
        public final void mo3213c() {
            if (this.f2443b == null) {
                this.f2443b = new C0614a();
            }
        }

        /* renamed from: a */
        public void mo3211a(int index) {
            if (index >= 64) {
                C0614a aVar = this.f2443b;
                if (aVar != null) {
                    aVar.mo3211a(index - 64);
                    return;
                }
                return;
            }
            this.f2442a &= ~(1 << index);
        }

        /* renamed from: d */
        public boolean mo3214d(int index) {
            if (index < 64) {
                return (this.f2442a & (1 << index)) != 0;
            }
            mo3213c();
            return this.f2443b.mo3214d(index - 64);
        }

        /* renamed from: g */
        public void mo3217g() {
            this.f2442a = 0;
            C0614a aVar = this.f2443b;
            if (aVar != null) {
                aVar.mo3217g();
            }
        }

        /* renamed from: e */
        public void mo3215e(int index, boolean value) {
            if (index >= 64) {
                mo3213c();
                this.f2443b.mo3215e(index - 64, value);
                return;
            }
            long j = this.f2442a;
            boolean lastBit = (Long.MIN_VALUE & j) != 0;
            long mask = (1 << index) - 1;
            this.f2442a = (j & mask) | ((j & (~mask)) << 1);
            if (value) {
                mo3218h(index);
            } else {
                mo3211a(index);
            }
            if (lastBit || this.f2443b != null) {
                mo3213c();
                this.f2443b.mo3215e(0, lastBit);
            }
        }

        /* renamed from: f */
        public boolean mo3216f(int index) {
            if (index >= 64) {
                mo3213c();
                return this.f2443b.mo3216f(index - 64);
            }
            long mask = 1 << index;
            long j = this.f2442a;
            boolean value = (j & mask) != 0;
            long j2 = j & (~mask);
            this.f2442a = j2;
            long mask2 = mask - 1;
            this.f2442a = (j2 & mask2) | Long.rotateRight(j2 & (~mask2), 1);
            C0614a aVar = this.f2443b;
            if (aVar != null) {
                if (aVar.mo3214d(0)) {
                    mo3218h(63);
                }
                this.f2443b.mo3216f(0);
            }
            return value;
        }

        /* renamed from: b */
        public int mo3212b(int index) {
            C0614a aVar = this.f2443b;
            if (aVar == null) {
                if (index >= 64) {
                    return Long.bitCount(this.f2442a);
                }
                return Long.bitCount(this.f2442a & ((1 << index) - 1));
            } else if (index < 64) {
                return Long.bitCount(this.f2442a & ((1 << index) - 1));
            } else {
                return aVar.mo3212b(index - 64) + Long.bitCount(this.f2442a);
            }
        }

        public String toString() {
            if (this.f2443b == null) {
                return Long.toBinaryString(this.f2442a);
            }
            return this.f2443b.toString() + "xx" + Long.toBinaryString(this.f2442a);
        }
    }
}
