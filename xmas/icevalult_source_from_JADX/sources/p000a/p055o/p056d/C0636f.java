package p000a.p055o.p056d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.f */
public class C0636f {

    /* renamed from: a */
    public boolean f2546a = true;

    /* renamed from: b */
    public int f2547b;

    /* renamed from: c */
    public int f2548c;

    /* renamed from: d */
    public int f2549d;

    /* renamed from: e */
    public int f2550e;

    /* renamed from: f */
    public int f2551f = 0;

    /* renamed from: g */
    public int f2552g = 0;

    /* renamed from: h */
    public boolean f2553h;

    /* renamed from: i */
    public boolean f2554i;

    /* renamed from: a */
    public boolean mo3313a(RecyclerView.C0856a0 state) {
        int i = this.f2548c;
        return i >= 0 && i < state.mo5029b();
    }

    /* renamed from: b */
    public View mo3314b(RecyclerView.C0888v recycler) {
        View view = recycler.mo5275o(this.f2548c);
        this.f2548c += this.f2549d;
        return view;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2547b + ", mCurrentPosition=" + this.f2548c + ", mItemDirection=" + this.f2549d + ", mLayoutDirection=" + this.f2550e + ", mStartLine=" + this.f2551f + ", mEndLine=" + this.f2552g + '}';
    }
}
