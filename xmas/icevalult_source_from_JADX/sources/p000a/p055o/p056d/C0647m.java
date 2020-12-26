package p000a.p055o.p056d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.o.d.m */
public abstract class C0647m extends RecyclerView.C0870l {

    /* renamed from: g */
    public boolean f2573g = true;

    /* renamed from: w */
    public abstract boolean mo3246w(RecyclerView.C0862d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo3247x(RecyclerView.C0862d0 d0Var, RecyclerView.C0862d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo3248y(RecyclerView.C0862d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo3249z(RecyclerView.C0862d0 d0Var);

    /* renamed from: f */
    public boolean mo3386f(RecyclerView.C0862d0 viewHolder) {
        return !this.f2573g || viewHolder.mo5078t();
    }

    /* renamed from: c */
    public boolean mo3384c(RecyclerView.C0862d0 viewHolder, RecyclerView.C0870l.C0873c preLayoutInfo, RecyclerView.C0870l.C0873c postLayoutInfo) {
        int oldLeft = preLayoutInfo.f3636a;
        int oldTop = preLayoutInfo.f3637b;
        View disappearingItemView = viewHolder.f3608a;
        int newLeft = postLayoutInfo == null ? disappearingItemView.getLeft() : postLayoutInfo.f3636a;
        int newTop = postLayoutInfo == null ? disappearingItemView.getTop() : postLayoutInfo.f3637b;
        if (viewHolder.mo5081v() || (oldLeft == newLeft && oldTop == newTop)) {
            return mo3249z(viewHolder);
        }
        disappearingItemView.layout(newLeft, newTop, disappearingItemView.getWidth() + newLeft, disappearingItemView.getHeight() + newTop);
        return mo3248y(viewHolder, oldLeft, oldTop, newLeft, newTop);
    }

    /* renamed from: a */
    public boolean mo3382a(RecyclerView.C0862d0 viewHolder, RecyclerView.C0870l.C0873c preLayoutInfo, RecyclerView.C0870l.C0873c postLayoutInfo) {
        int i;
        int i2;
        if (preLayoutInfo == null || ((i = preLayoutInfo.f3636a) == (i2 = postLayoutInfo.f3636a) && preLayoutInfo.f3637b == postLayoutInfo.f3637b)) {
            return mo3246w(viewHolder);
        }
        return mo3248y(viewHolder, i, preLayoutInfo.f3637b, i2, postLayoutInfo.f3637b);
    }

    /* renamed from: d */
    public boolean mo3385d(RecyclerView.C0862d0 viewHolder, RecyclerView.C0870l.C0873c preInfo, RecyclerView.C0870l.C0873c postInfo) {
        int i = preInfo.f3636a;
        int i2 = postInfo.f3636a;
        if (i == i2 && preInfo.f3637b == postInfo.f3637b) {
            mo3370E(viewHolder);
            return false;
        }
        return mo3248y(viewHolder, i, preInfo.f3637b, i2, postInfo.f3637b);
    }

    /* renamed from: b */
    public boolean mo3383b(RecyclerView.C0862d0 oldHolder, RecyclerView.C0862d0 newHolder, RecyclerView.C0870l.C0873c preInfo, RecyclerView.C0870l.C0873c postInfo) {
        int toTop;
        int toLeft;
        int fromLeft = preInfo.f3636a;
        int fromTop = preInfo.f3637b;
        if (newHolder.mo5056J()) {
            toLeft = preInfo.f3636a;
            toTop = preInfo.f3637b;
        } else {
            toLeft = postInfo.f3636a;
            toTop = postInfo.f3637b;
        }
        return mo3247x(oldHolder, newHolder, fromLeft, fromTop, toLeft, toTop);
    }

    /* renamed from: G */
    public final void mo3372G(RecyclerView.C0862d0 item) {
        mo3380O(item);
        mo5112h(item);
    }

    /* renamed from: E */
    public final void mo3370E(RecyclerView.C0862d0 item) {
        mo3378M(item);
        mo5112h(item);
    }

    /* renamed from: A */
    public final void mo3366A(RecyclerView.C0862d0 item) {
        mo3374I(item);
        mo5112h(item);
    }

    /* renamed from: C */
    public final void mo3368C(RecyclerView.C0862d0 item, boolean oldItem) {
        mo3376K(item, oldItem);
        mo5112h(item);
    }

    /* renamed from: H */
    public final void mo3373H(RecyclerView.C0862d0 item) {
        mo3381P(item);
    }

    /* renamed from: F */
    public final void mo3371F(RecyclerView.C0862d0 item) {
        mo3379N(item);
    }

    /* renamed from: B */
    public final void mo3367B(RecyclerView.C0862d0 item) {
        mo3375J(item);
    }

    /* renamed from: D */
    public final void mo3369D(RecyclerView.C0862d0 item, boolean oldItem) {
        mo3377L(item, oldItem);
    }

    /* renamed from: P */
    public void mo3381P(RecyclerView.C0862d0 item) {
    }

    /* renamed from: O */
    public void mo3380O(RecyclerView.C0862d0 item) {
    }

    /* renamed from: J */
    public void mo3375J(RecyclerView.C0862d0 item) {
    }

    /* renamed from: I */
    public void mo3374I(RecyclerView.C0862d0 item) {
    }

    /* renamed from: N */
    public void mo3379N(RecyclerView.C0862d0 item) {
    }

    /* renamed from: M */
    public void mo3378M(RecyclerView.C0862d0 item) {
    }

    /* renamed from: L */
    public void mo3377L(RecyclerView.C0862d0 item, boolean oldItem) {
    }

    /* renamed from: K */
    public void mo3376K(RecyclerView.C0862d0 item, boolean oldItem) {
    }
}
