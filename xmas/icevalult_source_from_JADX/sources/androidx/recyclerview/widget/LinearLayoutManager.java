package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.p055o.p056d.C0637g;
import p000a.p055o.p056d.C0641j;
import p000a.p055o.p056d.C0646l;

public class LinearLayoutManager extends RecyclerView.C0876o implements RecyclerView.C0893z.C0895b {

    /* renamed from: A */
    public int f3539A = -1;

    /* renamed from: B */
    public int f3540B = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: C */
    public boolean f3541C;

    /* renamed from: D */
    public C0853d f3542D = null;

    /* renamed from: E */
    public final C0850a f3543E = new C0850a();

    /* renamed from: F */
    public final C0851b f3544F = new C0851b();

    /* renamed from: G */
    public int f3545G = 2;

    /* renamed from: H */
    public int[] f3546H = new int[2];

    /* renamed from: s */
    public int f3547s = 1;

    /* renamed from: t */
    public C0852c f3548t;

    /* renamed from: u */
    public C0641j f3549u;

    /* renamed from: v */
    public boolean f3550v;

    /* renamed from: w */
    public boolean f3551w = false;

    /* renamed from: x */
    public boolean f3552x = false;

    /* renamed from: y */
    public boolean f3553y = false;

    /* renamed from: z */
    public boolean f3554z = true;

    public LinearLayoutManager(Context context, int orientation, boolean reverseLayout) {
        mo4755C2(orientation);
        mo4756D2(reverseLayout);
    }

    public LinearLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.C0876o.C0880d properties = RecyclerView.C0876o.m4567i0(context, attrs, defStyleAttr, defStyleRes);
        mo4755C2(properties.f3659a);
        mo4756D2(properties.f3661c);
        mo4700E2(properties.f3662d);
    }

    /* renamed from: s0 */
    public boolean mo4808s0() {
        return true;
    }

    /* renamed from: D */
    public RecyclerView.C0881p mo4698D() {
        return new RecyclerView.C0881p(-2, -2);
    }

    /* renamed from: I0 */
    public void mo4761I0(RecyclerView view, RecyclerView.C0888v recycler) {
        super.mo4761I0(view, recycler);
        if (this.f3541C) {
            mo5200k1(recycler);
            recycler.mo5263c();
        }
    }

    /* renamed from: K0 */
    public void mo4765K0(AccessibilityEvent event) {
        super.mo4765K0(event);
        if (mo5151J() > 0) {
            event.setFromIndex(mo4781Z1());
            event.setToIndex(mo4786c2());
        }
    }

    /* renamed from: d1 */
    public Parcelable mo4787d1() {
        if (this.f3542D != null) {
            return new C0853d(this.f3542D);
        }
        C0853d state = new C0853d();
        if (mo5151J() > 0) {
            mo4775T1();
            boolean didLayoutFromEnd = this.f3550v ^ this.f3552x;
            state.f3579d = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = mo4799m2();
                state.f3578c = this.f3549u.mo3351i() - this.f3549u.mo3346d(refChild);
                state.f3577b = mo5193h0(refChild);
            } else {
                View refChild2 = mo4800n2();
                state.f3577b = mo5193h0(refChild2);
                state.f3578c = this.f3549u.mo3349g(refChild2) - this.f3549u.mo3355m();
            }
        } else {
            state.mo4832g();
        }
        return state;
    }

    /* renamed from: c1 */
    public void mo4785c1(Parcelable state) {
        if (state instanceof C0853d) {
            this.f3542D = (C0853d) state;
            mo5217t1();
        }
    }

    /* renamed from: k */
    public boolean mo4795k() {
        return this.f3547s == 0;
    }

    /* renamed from: l */
    public boolean mo4797l() {
        return this.f3547s == 1;
    }

    /* renamed from: E2 */
    public void mo4700E2(boolean stackFromEnd) {
        mo4791g((String) null);
        if (this.f3553y != stackFromEnd) {
            this.f3553y = stackFromEnd;
            mo5217t1();
        }
    }

    /* renamed from: p2 */
    public int mo4804p2() {
        return this.f3547s;
    }

    /* renamed from: C2 */
    public void mo4755C2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            mo4791g((String) null);
            if (orientation != this.f3547s || this.f3549u == null) {
                C0641j b = C0641j.m3160b(this, orientation);
                this.f3549u = b;
                this.f3543E.f3555a = b;
                this.f3547s = orientation;
                mo5217t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + orientation);
    }

    /* renamed from: A2 */
    public final void mo4752A2() {
        if (this.f3547s == 1 || !mo4806q2()) {
            this.f3552x = this.f3551w;
        } else {
            this.f3552x = !this.f3551w;
        }
    }

    /* renamed from: D2 */
    public void mo4756D2(boolean reverseLayout) {
        mo4791g((String) null);
        if (reverseLayout != this.f3551w) {
            this.f3551w = reverseLayout;
            mo5217t1();
        }
    }

    /* renamed from: C */
    public View mo4754C(int position) {
        int childCount = mo5151J();
        if (childCount == 0) {
            return null;
        }
        int viewPosition = position - mo5193h0(mo5150I(0));
        if (viewPosition >= 0 && viewPosition < childCount) {
            View child = mo5150I(viewPosition);
            if (mo5193h0(child) == position) {
                return child;
            }
        }
        return super.mo4754C(position);
    }

    @Deprecated
    /* renamed from: o2 */
    public int mo4802o2(RecyclerView.C0856a0 state) {
        if (state.mo5031d()) {
            return this.f3549u.mo3356n();
        }
        return 0;
    }

    /* renamed from: M1 */
    public void mo4768M1(RecyclerView.C0856a0 state, int[] extraLayoutSpace) {
        int extraLayoutSpaceStart = 0;
        int extraLayoutSpaceEnd = 0;
        int extraScrollSpace = mo4802o2(state);
        if (this.f3548t.f3569f == -1) {
            extraLayoutSpaceStart = extraScrollSpace;
        } else {
            extraLayoutSpaceEnd = extraScrollSpace;
        }
        extraLayoutSpace[0] = extraLayoutSpaceStart;
        extraLayoutSpace[1] = extraLayoutSpaceEnd;
    }

    /* renamed from: I1 */
    public void mo4762I1(RecyclerView recyclerView, RecyclerView.C0856a0 state, int position) {
        C0637g linearSmoothScroller = new C0637g(recyclerView.getContext());
        linearSmoothScroller.mo5306p(position);
        mo5152J1(linearSmoothScroller);
    }

    /* renamed from: a */
    public PointF mo4782a(int targetPosition) {
        if (mo5151J() == 0) {
            return null;
        }
        boolean z = false;
        int i = 1;
        if (targetPosition < mo5193h0(mo5150I(0))) {
            z = true;
        }
        if (z != this.f3552x) {
            i = -1;
        }
        int direction = i;
        if (this.f3547s == 0) {
            return new PointF((float) direction, 0.0f);
        }
        return new PointF(0.0f, (float) direction);
    }

    /* renamed from: X0 */
    public void mo4721X0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        int endOffset;
        int startOffset;
        int i;
        View existing;
        int upcomingOffset;
        int firstLayoutDirection = -1;
        if (!(this.f3542D == null && this.f3539A == -1) && state.mo5029b() == 0) {
            mo5200k1(recycler);
            return;
        }
        C0853d dVar = this.f3542D;
        if (dVar != null && dVar.mo4831f()) {
            this.f3539A = this.f3542D.f3577b;
        }
        mo4775T1();
        this.f3548t.f3564a = false;
        mo4752A2();
        View focused = mo5168V();
        C0850a aVar = this.f3543E;
        if (!aVar.f3559e || this.f3539A != -1 || this.f3542D != null) {
            aVar.mo4821e();
            C0850a aVar2 = this.f3543E;
            aVar2.f3558d = this.f3552x ^ this.f3553y;
            mo4760H2(recycler, state, aVar2);
            this.f3543E.f3559e = true;
        } else if (focused != null && (this.f3549u.mo3349g(focused) >= this.f3549u.mo3351i() || this.f3549u.mo3346d(focused) <= this.f3549u.mo3355m())) {
            this.f3543E.mo4819c(focused, mo5193h0(focused));
        }
        C0852c cVar = this.f3548t;
        cVar.f3569f = cVar.f3574k >= 0 ? 1 : -1;
        int[] iArr = this.f3546H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4768M1(state, iArr);
        int extraForStart = Math.max(0, this.f3546H[0]) + this.f3549u.mo3355m();
        int extraForEnd = Math.max(0, this.f3546H[1]) + this.f3549u.mo3352j();
        if (!(!state.mo5032e() || (i = this.f3539A) == -1 || this.f3540B == Integer.MIN_VALUE || (existing = mo4754C(i)) == null)) {
            if (this.f3552x) {
                upcomingOffset = (this.f3549u.mo3351i() - this.f3549u.mo3346d(existing)) - this.f3540B;
            } else {
                upcomingOffset = this.f3540B - (this.f3549u.mo3349g(existing) - this.f3549u.mo3355m());
            }
            if (upcomingOffset > 0) {
                extraForStart += upcomingOffset;
            } else {
                extraForEnd -= upcomingOffset;
            }
        }
        C0850a aVar3 = this.f3543E;
        if (aVar3.f3558d) {
            if (this.f3552x) {
                firstLayoutDirection = 1;
            }
        } else if (!this.f3552x) {
            firstLayoutDirection = 1;
        }
        mo4739u2(recycler, state, aVar3, firstLayoutDirection);
        mo5222w(recycler);
        this.f3548t.f3576m = mo4816z2();
        this.f3548t.f3573j = state.mo5032e();
        this.f3548t.f3572i = 0;
        C0850a aVar4 = this.f3543E;
        if (aVar4.f3558d) {
            mo4769M2(aVar4);
            C0852c cVar2 = this.f3548t;
            cVar2.f3571h = extraForStart;
            mo4776U1(recycler, cVar2, state, false);
            C0852c cVar3 = this.f3548t;
            startOffset = cVar3.f3565b;
            int firstElement = cVar3.f3567d;
            int i2 = cVar3.f3566c;
            if (i2 > 0) {
                extraForEnd += i2;
            }
            mo4766K2(this.f3543E);
            C0852c cVar4 = this.f3548t;
            cVar4.f3571h = extraForEnd;
            cVar4.f3567d += cVar4.f3568e;
            mo4776U1(recycler, cVar4, state, false);
            C0852c cVar5 = this.f3548t;
            endOffset = cVar5.f3565b;
            if (cVar5.f3566c > 0) {
                int extraForStart2 = cVar5.f3566c;
                mo4767L2(firstElement, startOffset);
                C0852c cVar6 = this.f3548t;
                cVar6.f3571h = extraForStart2;
                mo4776U1(recycler, cVar6, state, false);
                startOffset = this.f3548t.f3565b;
            }
        } else {
            mo4766K2(aVar4);
            C0852c cVar7 = this.f3548t;
            cVar7.f3571h = extraForEnd;
            mo4776U1(recycler, cVar7, state, false);
            C0852c cVar8 = this.f3548t;
            endOffset = cVar8.f3565b;
            int lastElement = cVar8.f3567d;
            int i3 = cVar8.f3566c;
            if (i3 > 0) {
                extraForStart += i3;
            }
            mo4769M2(this.f3543E);
            C0852c cVar9 = this.f3548t;
            cVar9.f3571h = extraForStart;
            cVar9.f3567d += cVar9.f3568e;
            mo4776U1(recycler, cVar9, state, false);
            C0852c cVar10 = this.f3548t;
            int startOffset2 = cVar10.f3565b;
            if (cVar10.f3566c > 0) {
                int extraForEnd2 = cVar10.f3566c;
                mo4764J2(lastElement, endOffset);
                C0852c cVar11 = this.f3548t;
                cVar11.f3571h = extraForEnd2;
                mo4776U1(recycler, cVar11, state, false);
                endOffset = this.f3548t.f3565b;
                startOffset = startOffset2;
            } else {
                startOffset = startOffset2;
            }
        }
        if (mo5151J() > 0) {
            if (this.f3552x ^ this.f3553y) {
                int fixOffset = mo4796k2(endOffset, recycler, state, true);
                int startOffset3 = startOffset + fixOffset;
                int fixOffset2 = mo4798l2(startOffset3, recycler, state, false);
                startOffset = startOffset3 + fixOffset2;
                endOffset = endOffset + fixOffset + fixOffset2;
            } else {
                int fixOffset3 = mo4798l2(startOffset, recycler, state, true);
                int endOffset2 = endOffset + fixOffset3;
                int fixOffset4 = mo4796k2(endOffset2, recycler, state, false);
                startOffset = startOffset + fixOffset3 + fixOffset4;
                endOffset = endOffset2 + fixOffset4;
            }
        }
        mo4810t2(recycler, state, startOffset, endOffset);
        if (!state.mo5032e()) {
            this.f3549u.mo3361s();
        } else {
            this.f3543E.mo4821e();
        }
        this.f3550v = this.f3553y;
    }

    /* renamed from: Y0 */
    public void mo4723Y0(RecyclerView.C0856a0 state) {
        super.mo4723Y0(state);
        this.f3542D = null;
        this.f3539A = -1;
        this.f3540B = RecyclerView.UNDEFINED_DURATION;
        this.f3543E.mo4821e();
    }

    /* renamed from: u2 */
    public void mo4739u2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, C0850a anchorInfo, int firstLayoutItemDirection) {
    }

    /* renamed from: t2 */
    public final void mo4810t2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int startOffset, int endOffset) {
        RecyclerView.C0888v vVar = recycler;
        RecyclerView.C0856a0 a0Var = state;
        if (!state.mo5034g() || mo5151J() == 0 || state.mo5032e()) {
            int i = startOffset;
            int i2 = endOffset;
        } else if (!mo4703L1()) {
            int i3 = startOffset;
            int i4 = endOffset;
        } else {
            int scrapExtraStart = 0;
            int scrapExtraEnd = 0;
            List<RecyclerView.C0862d0> k = recycler.mo5271k();
            int scrapSize = k.size();
            int firstChildPos = mo5193h0(mo5150I(0));
            for (int i5 = 0; i5 < scrapSize; i5++) {
                RecyclerView.C0862d0 scrap = k.get(i5);
                if (!scrap.mo5081v()) {
                    int direction = 1;
                    if ((scrap.mo5071m() < firstChildPos) != this.f3552x) {
                        direction = -1;
                    }
                    if (direction == -1) {
                        scrapExtraStart += this.f3549u.mo3347e(scrap.f3608a);
                    } else {
                        scrapExtraEnd += this.f3549u.mo3347e(scrap.f3608a);
                    }
                }
            }
            this.f3548t.f3575l = k;
            if (scrapExtraStart > 0) {
                mo4767L2(mo5193h0(mo4800n2()), startOffset);
                C0852c cVar = this.f3548t;
                cVar.f3571h = scrapExtraStart;
                cVar.f3566c = 0;
                cVar.mo4824a();
                mo4776U1(vVar, this.f3548t, a0Var, false);
            } else {
                int i6 = startOffset;
            }
            if (scrapExtraEnd > 0) {
                mo4764J2(mo5193h0(mo4799m2()), endOffset);
                C0852c cVar2 = this.f3548t;
                cVar2.f3571h = scrapExtraEnd;
                cVar2.f3566c = 0;
                cVar2.mo4824a();
                mo4776U1(vVar, this.f3548t, a0Var, false);
            } else {
                int i7 = endOffset;
            }
            this.f3548t.f3575l = null;
        }
    }

    /* renamed from: H2 */
    public final void mo4760H2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, C0850a anchorInfo) {
        if (!mo4759G2(state, anchorInfo) && !mo4757F2(recycler, state, anchorInfo)) {
            anchorInfo.mo4817a();
            anchorInfo.f3556b = this.f3553y ? state.mo5029b() - 1 : 0;
        }
    }

    /* renamed from: F2 */
    public final boolean mo4757F2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, C0850a anchorInfo) {
        View referenceChild;
        int i;
        boolean notVisible = false;
        if (mo5151J() == 0) {
            return false;
        }
        View focused = mo5168V();
        if (focused != null && anchorInfo.mo4820d(focused, state)) {
            anchorInfo.mo4819c(focused, mo5193h0(focused));
            return true;
        } else if (this.f3550v != this.f3553y) {
            return false;
        } else {
            if (anchorInfo.f3558d) {
                referenceChild = mo4793i2(recycler, state);
            } else {
                referenceChild = mo4794j2(recycler, state);
            }
            if (referenceChild == null) {
                return false;
            }
            anchorInfo.mo4818b(referenceChild, mo5193h0(referenceChild));
            if (!state.mo5032e() && mo4703L1()) {
                if (this.f3549u.mo3349g(referenceChild) >= this.f3549u.mo3351i() || this.f3549u.mo3346d(referenceChild) < this.f3549u.mo3355m()) {
                    notVisible = true;
                }
                if (notVisible) {
                    if (anchorInfo.f3558d) {
                        i = this.f3549u.mo3351i();
                    } else {
                        i = this.f3549u.mo3355m();
                    }
                    anchorInfo.f3557c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: G2 */
    public final boolean mo4759G2(RecyclerView.C0856a0 state, C0850a anchorInfo) {
        int i;
        int i2;
        boolean z = false;
        if (state.mo5032e() || (i = this.f3539A) == -1) {
            return false;
        }
        if (i < 0 || i >= state.mo5029b()) {
            this.f3539A = -1;
            this.f3540B = RecyclerView.UNDEFINED_DURATION;
            return false;
        }
        anchorInfo.f3556b = this.f3539A;
        C0853d dVar = this.f3542D;
        if (dVar != null && dVar.mo4831f()) {
            boolean z2 = this.f3542D.f3579d;
            anchorInfo.f3558d = z2;
            if (z2) {
                anchorInfo.f3557c = this.f3549u.mo3351i() - this.f3542D.f3578c;
            } else {
                anchorInfo.f3557c = this.f3549u.mo3355m() + this.f3542D.f3578c;
            }
            return true;
        } else if (this.f3540B == Integer.MIN_VALUE) {
            View child = mo4754C(this.f3539A);
            if (child == null) {
                if (mo5151J() > 0) {
                    if ((this.f3539A < mo5193h0(mo5150I(0))) == this.f3552x) {
                        z = true;
                    }
                    anchorInfo.f3558d = z;
                }
                anchorInfo.mo4817a();
            } else if (this.f3549u.mo3347e(child) > this.f3549u.mo3356n()) {
                anchorInfo.mo4817a();
                return true;
            } else if (this.f3549u.mo3349g(child) - this.f3549u.mo3355m() < 0) {
                anchorInfo.f3557c = this.f3549u.mo3355m();
                anchorInfo.f3558d = false;
                return true;
            } else if (this.f3549u.mo3351i() - this.f3549u.mo3346d(child) < 0) {
                anchorInfo.f3557c = this.f3549u.mo3351i();
                anchorInfo.f3558d = true;
                return true;
            } else {
                if (anchorInfo.f3558d) {
                    i2 = this.f3549u.mo3346d(child) + this.f3549u.mo3357o();
                } else {
                    i2 = this.f3549u.mo3349g(child);
                }
                anchorInfo.f3557c = i2;
            }
            return true;
        } else {
            boolean z3 = this.f3552x;
            anchorInfo.f3558d = z3;
            if (z3) {
                anchorInfo.f3557c = this.f3549u.mo3351i() - this.f3540B;
            } else {
                anchorInfo.f3557c = this.f3549u.mo3355m() + this.f3540B;
            }
            return true;
        }
    }

    /* renamed from: k2 */
    public final int mo4796k2(int endOffset, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = this.f3549u.mo3351i() - endOffset;
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -mo4753B2(-gap2, recycler, state);
        int endOffset2 = endOffset + fixOffset;
        if (!canOffsetChildren || (gap = this.f3549u.mo3351i() - endOffset2) <= 0) {
            return fixOffset;
        }
        this.f3549u.mo3360r(gap);
        return gap + fixOffset;
    }

    /* renamed from: l2 */
    public final int mo4798l2(int startOffset, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, boolean canOffsetChildren) {
        int gap;
        int gap2 = startOffset - this.f3549u.mo3355m();
        if (gap2 <= 0) {
            return 0;
        }
        int fixOffset = -mo4753B2(gap2, recycler, state);
        int startOffset2 = startOffset + fixOffset;
        if (!canOffsetChildren || (gap = startOffset2 - this.f3549u.mo3355m()) <= 0) {
            return fixOffset;
        }
        this.f3549u.mo3360r(-gap);
        return fixOffset - gap;
    }

    /* renamed from: K2 */
    public final void mo4766K2(C0850a anchorInfo) {
        mo4764J2(anchorInfo.f3556b, anchorInfo.f3557c);
    }

    /* renamed from: J2 */
    public final void mo4764J2(int itemPosition, int offset) {
        this.f3548t.f3566c = this.f3549u.mo3351i() - offset;
        C0852c cVar = this.f3548t;
        cVar.f3568e = this.f3552x ? -1 : 1;
        cVar.f3567d = itemPosition;
        cVar.f3569f = 1;
        cVar.f3565b = offset;
        cVar.f3570g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: M2 */
    public final void mo4769M2(C0850a anchorInfo) {
        mo4767L2(anchorInfo.f3556b, anchorInfo.f3557c);
    }

    /* renamed from: L2 */
    public final void mo4767L2(int itemPosition, int offset) {
        this.f3548t.f3566c = offset - this.f3549u.mo3355m();
        C0852c cVar = this.f3548t;
        cVar.f3567d = itemPosition;
        cVar.f3568e = this.f3552x ? 1 : -1;
        cVar.f3569f = -1;
        cVar.f3565b = offset;
        cVar.f3570g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: q2 */
    public boolean mo4806q2() {
        return mo5173Z() == 1;
    }

    /* renamed from: T1 */
    public void mo4775T1() {
        if (this.f3548t == null) {
            this.f3548t = mo4774S1();
        }
    }

    /* renamed from: S1 */
    public C0852c mo4774S1() {
        return new C0852c();
    }

    /* renamed from: x1 */
    public void mo4813x1(int position) {
        this.f3539A = position;
        this.f3540B = RecyclerView.UNDEFINED_DURATION;
        C0853d dVar = this.f3542D;
        if (dVar != null) {
            dVar.mo4832g();
        }
        mo5217t1();
    }

    /* renamed from: w1 */
    public int mo4741w1(int dx, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3547s == 1) {
            return 0;
        }
        return mo4753B2(dx, recycler, state);
    }

    /* renamed from: y1 */
    public int mo4742y1(int dy, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3547s == 0) {
            return 0;
        }
        return mo4753B2(dy, recycler, state);
    }

    /* renamed from: r */
    public int mo4735r(RecyclerView.C0856a0 state) {
        return mo4771P1(state);
    }

    /* renamed from: u */
    public int mo4738u(RecyclerView.C0856a0 state) {
        return mo4771P1(state);
    }

    /* renamed from: q */
    public int mo4805q(RecyclerView.C0856a0 state) {
        return mo4770O1(state);
    }

    /* renamed from: t */
    public int mo4809t(RecyclerView.C0856a0 state) {
        return mo4770O1(state);
    }

    /* renamed from: s */
    public int mo4736s(RecyclerView.C0856a0 state) {
        return mo4772Q1(state);
    }

    /* renamed from: v */
    public int mo4740v(RecyclerView.C0856a0 state) {
        return mo4772Q1(state);
    }

    /* renamed from: P1 */
    public final int mo4771P1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        mo4775T1();
        return C0646l.m3223b(state, this.f3549u, mo4780Y1(!this.f3554z, true), mo4779X1(!this.f3554z, true), this, this.f3554z, this.f3552x);
    }

    /* renamed from: O1 */
    public final int mo4770O1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        mo4775T1();
        return C0646l.m3222a(state, this.f3549u, mo4780Y1(!this.f3554z, true), mo4779X1(!this.f3554z, true), this, this.f3554z);
    }

    /* renamed from: Q1 */
    public final int mo4772Q1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        mo4775T1();
        return C0646l.m3224c(state, this.f3549u, mo4780Y1(!this.f3554z, true), mo4779X1(!this.f3554z, true), this, this.f3554z);
    }

    /* renamed from: r2 */
    public boolean mo4807r2() {
        return this.f3554z;
    }

    /* renamed from: I2 */
    public final void mo4763I2(int layoutDirection, int requiredSpace, boolean canUseExistingSpace, RecyclerView.C0856a0 state) {
        int scrollingOffset;
        this.f3548t.f3576m = mo4816z2();
        this.f3548t.f3569f = layoutDirection;
        int[] iArr = this.f3546H;
        boolean layoutToEnd = false;
        iArr[0] = 0;
        int i = 1;
        iArr[1] = 0;
        mo4768M1(state, iArr);
        int extraForStart = Math.max(0, this.f3546H[0]);
        int extraForEnd = Math.max(0, this.f3546H[1]);
        if (layoutDirection == 1) {
            layoutToEnd = true;
        }
        C0852c cVar = this.f3548t;
        int i2 = layoutToEnd ? extraForEnd : extraForStart;
        cVar.f3571h = i2;
        cVar.f3572i = layoutToEnd ? extraForStart : extraForEnd;
        if (layoutToEnd) {
            cVar.f3571h = i2 + this.f3549u.mo3352j();
            View child = mo4799m2();
            C0852c cVar2 = this.f3548t;
            if (this.f3552x) {
                i = -1;
            }
            cVar2.f3568e = i;
            int h0 = mo5193h0(child);
            C0852c cVar3 = this.f3548t;
            cVar2.f3567d = h0 + cVar3.f3568e;
            cVar3.f3565b = this.f3549u.mo3346d(child);
            scrollingOffset = this.f3549u.mo3346d(child) - this.f3549u.mo3351i();
        } else {
            View child2 = mo4800n2();
            this.f3548t.f3571h += this.f3549u.mo3355m();
            C0852c cVar4 = this.f3548t;
            if (!this.f3552x) {
                i = -1;
            }
            cVar4.f3568e = i;
            int h02 = mo5193h0(child2);
            C0852c cVar5 = this.f3548t;
            cVar4.f3567d = h02 + cVar5.f3568e;
            cVar5.f3565b = this.f3549u.mo3349g(child2);
            scrollingOffset = (-this.f3549u.mo3349g(child2)) + this.f3549u.mo3355m();
        }
        C0852c cVar6 = this.f3548t;
        cVar6.f3566c = requiredSpace;
        if (canUseExistingSpace) {
            cVar6.f3566c = requiredSpace - scrollingOffset;
        }
        cVar6.f3570g = scrollingOffset;
    }

    /* renamed from: z2 */
    public boolean mo4816z2() {
        return this.f3549u.mo3353k() == 0 && this.f3549u.mo3350h() == 0;
    }

    /* renamed from: N1 */
    public void mo4705N1(RecyclerView.C0856a0 state, C0852c layoutState, RecyclerView.C0876o.C0879c layoutPrefetchRegistry) {
        int pos = layoutState.f3567d;
        if (pos >= 0 && pos < state.mo5029b()) {
            layoutPrefetchRegistry.mo3307a(pos, Math.max(0, layoutState.f3570g));
        }
    }

    /* renamed from: p */
    public void mo4803p(int adapterItemCount, RecyclerView.C0876o.C0879c layoutPrefetchRegistry) {
        boolean fromEnd;
        int anchorPos;
        C0853d dVar = this.f3542D;
        int direction = -1;
        if (dVar == null || !dVar.mo4831f()) {
            mo4752A2();
            fromEnd = this.f3552x;
            if (this.f3539A == -1) {
                anchorPos = fromEnd ? adapterItemCount - 1 : 0;
            } else {
                anchorPos = this.f3539A;
            }
        } else {
            C0853d dVar2 = this.f3542D;
            fromEnd = dVar2.f3579d;
            anchorPos = dVar2.f3577b;
        }
        if (!fromEnd) {
            direction = 1;
        }
        int targetPos = anchorPos;
        for (int i = 0; i < this.f3545G && targetPos >= 0 && targetPos < adapterItemCount; i++) {
            layoutPrefetchRegistry.mo3307a(targetPos, 0);
            targetPos += direction;
        }
    }

    /* renamed from: o */
    public void mo4801o(int dx, int dy, RecyclerView.C0856a0 state, RecyclerView.C0876o.C0879c layoutPrefetchRegistry) {
        int delta = this.f3547s == 0 ? dx : dy;
        if (mo5151J() != 0 && delta != 0) {
            mo4775T1();
            mo4763I2(delta > 0 ? 1 : -1, Math.abs(delta), true, state);
            mo4705N1(state, this.f3548t, layoutPrefetchRegistry);
        }
    }

    /* renamed from: B2 */
    public int mo4753B2(int delta, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (mo5151J() == 0 || delta == 0) {
            return 0;
        }
        mo4775T1();
        this.f3548t.f3564a = true;
        int layoutDirection = delta > 0 ? 1 : -1;
        int absDelta = Math.abs(delta);
        mo4763I2(layoutDirection, absDelta, true, state);
        C0852c cVar = this.f3548t;
        int consumed = cVar.f3570g + mo4776U1(recycler, cVar, state, false);
        if (consumed < 0) {
            return 0;
        }
        int scrolled = absDelta > consumed ? layoutDirection * consumed : delta;
        this.f3549u.mo3360r(-scrolled);
        this.f3548t.f3574k = scrolled;
        return scrolled;
    }

    /* renamed from: g */
    public void mo4791g(String message) {
        if (this.f3542D == null) {
            super.mo4791g(message);
        }
    }

    /* renamed from: w2 */
    public final void mo4812w2(RecyclerView.C0888v recycler, int startIndex, int endIndex) {
        if (startIndex != endIndex) {
            if (endIndex > startIndex) {
                for (int i = endIndex - 1; i >= startIndex; i--) {
                    mo5206n1(i, recycler);
                }
                return;
            }
            for (int i2 = startIndex; i2 > endIndex; i2--) {
                mo5206n1(i2, recycler);
            }
        }
    }

    /* renamed from: y2 */
    public final void mo4815y2(RecyclerView.C0888v recycler, int scrollingOffset, int noRecycleSpace) {
        if (scrollingOffset >= 0) {
            int limit = scrollingOffset - noRecycleSpace;
            int childCount = mo5151J();
            if (this.f3552x) {
                for (int i = childCount - 1; i >= 0; i--) {
                    View child = mo5150I(i);
                    if (this.f3549u.mo3346d(child) > limit || this.f3549u.mo3358p(child) > limit) {
                        mo4812w2(recycler, childCount - 1, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View child2 = mo5150I(i2);
                if (this.f3549u.mo3346d(child2) > limit || this.f3549u.mo3358p(child2) > limit) {
                    mo4812w2(recycler, 0, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: x2 */
    public final void mo4814x2(RecyclerView.C0888v recycler, int scrollingOffset, int noRecycleSpace) {
        int childCount = mo5151J();
        if (scrollingOffset >= 0) {
            int limit = (this.f3549u.mo3350h() - scrollingOffset) + noRecycleSpace;
            if (this.f3552x) {
                for (int i = 0; i < childCount; i++) {
                    View child = mo5150I(i);
                    if (this.f3549u.mo3349g(child) < limit || this.f3549u.mo3359q(child) < limit) {
                        mo4812w2(recycler, 0, i);
                        return;
                    }
                }
                return;
            }
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View child2 = mo5150I(i2);
                if (this.f3549u.mo3349g(child2) < limit || this.f3549u.mo3359q(child2) < limit) {
                    mo4812w2(recycler, childCount - 1, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: v2 */
    public final void mo4811v2(RecyclerView.C0888v recycler, C0852c layoutState) {
        if (layoutState.f3564a && !layoutState.f3576m) {
            int scrollingOffset = layoutState.f3570g;
            int noRecycleSpace = layoutState.f3572i;
            if (layoutState.f3569f == -1) {
                mo4814x2(recycler, scrollingOffset, noRecycleSpace);
            } else {
                mo4815y2(recycler, scrollingOffset, noRecycleSpace);
            }
        }
    }

    /* renamed from: U1 */
    public int mo4776U1(RecyclerView.C0888v recycler, C0852c layoutState, RecyclerView.C0856a0 state, boolean stopOnFocusable) {
        int start = layoutState.f3566c;
        int i = layoutState.f3570g;
        if (i != Integer.MIN_VALUE) {
            int i2 = layoutState.f3566c;
            if (i2 < 0) {
                layoutState.f3570g = i + i2;
            }
            mo4811v2(recycler, layoutState);
        }
        int remainingSpace = layoutState.f3566c + layoutState.f3571h;
        C0851b layoutChunkResult = this.f3544F;
        while (true) {
            if ((!layoutState.f3576m && remainingSpace <= 0) || !layoutState.mo4826c(state)) {
                break;
            }
            layoutChunkResult.mo4823a();
            mo4737s2(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.f3561b) {
                layoutState.f3565b += layoutChunkResult.f3560a * layoutState.f3569f;
                if (!layoutChunkResult.f3562c || layoutState.f3575l != null || !state.mo5032e()) {
                    int i3 = layoutState.f3566c;
                    int i4 = layoutChunkResult.f3560a;
                    layoutState.f3566c = i3 - i4;
                    remainingSpace -= i4;
                }
                int i5 = layoutState.f3570g;
                if (i5 != Integer.MIN_VALUE) {
                    int i6 = i5 + layoutChunkResult.f3560a;
                    layoutState.f3570g = i6;
                    int i7 = layoutState.f3566c;
                    if (i7 < 0) {
                        layoutState.f3570g = i6 + i7;
                    }
                    mo4811v2(recycler, layoutState);
                }
                if (stopOnFocusable && layoutChunkResult.f3563d) {
                    break;
                }
            } else {
                break;
            }
        }
        return start - layoutState.f3566c;
    }

    /* renamed from: s2 */
    public void mo4737s2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, C0852c layoutState, C0851b result) {
        int top;
        int left;
        int bottom;
        int right;
        int left2;
        int right2;
        C0852c cVar = layoutState;
        C0851b bVar = result;
        View view = cVar.mo4827d(recycler);
        if (view == null) {
            bVar.f3561b = true;
            return;
        }
        RecyclerView.C0881p params = (RecyclerView.C0881p) view.getLayoutParams();
        if (cVar.f3575l == null) {
            if (this.f3552x == (cVar.f3569f == -1)) {
                mo5182d(view);
            } else {
                mo5184e(view, 0);
            }
        } else {
            if (this.f3552x == (cVar.f3569f == -1)) {
                mo5177b(view);
            } else {
                mo5180c(view, 0);
            }
        }
        mo5133A0(view, 0, 0);
        bVar.f3560a = this.f3549u.mo3347e(view);
        if (this.f3547s == 1) {
            if (mo4806q2()) {
                right2 = mo5207o0() - mo5188f0();
                left2 = right2 - this.f3549u.mo3348f(view);
            } else {
                left2 = mo5185e0();
                right2 = this.f3549u.mo3348f(view) + left2;
            }
            if (cVar.f3569f == -1) {
                right = right2;
                bottom = cVar.f3565b;
                left = left2;
                top = cVar.f3565b - bVar.f3560a;
            } else {
                int top2 = cVar.f3565b;
                right = right2;
                bottom = cVar.f3565b + bVar.f3560a;
                left = left2;
                top = top2;
            }
        } else {
            int top3 = mo5190g0();
            int bottom2 = this.f3549u.mo3348f(view) + top3;
            if (cVar.f3569f == -1) {
                bottom = bottom2;
                right = cVar.f3565b;
                left = cVar.f3565b - bVar.f3560a;
                top = top3;
            } else {
                int left3 = cVar.f3565b;
                bottom = bottom2;
                right = cVar.f3565b + bVar.f3560a;
                left = left3;
                top = top3;
            }
        }
        mo5228z0(view, left, top, right, bottom);
        if (params.mo5232c() || params.mo5231b()) {
            bVar.f3562c = true;
        }
        bVar.f3563d = view.hasFocusable();
    }

    /* renamed from: G1 */
    public boolean mo4758G1() {
        return (mo5171X() == 1073741824 || mo5209p0() == 1073741824 || !mo5211q0()) ? false : true;
    }

    /* renamed from: R1 */
    public int mo4773R1(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.f3547s == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.f3547s == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.f3547s == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.f3547s == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3547s != 1 && mo4806q2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f3547s != 1 && mo4806q2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: n2 */
    public final View mo4800n2() {
        return mo5150I(this.f3552x ? mo5151J() - 1 : 0);
    }

    /* renamed from: m2 */
    public final View mo4799m2() {
        return mo5150I(this.f3552x ? 0 : mo5151J() - 1);
    }

    /* renamed from: Y1 */
    public View mo4780Y1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f3552x) {
            return mo4789e2(mo5151J() - 1, -1, completelyVisible, acceptPartiallyVisible);
        }
        return mo4789e2(0, mo5151J(), completelyVisible, acceptPartiallyVisible);
    }

    /* renamed from: X1 */
    public View mo4779X1(boolean completelyVisible, boolean acceptPartiallyVisible) {
        if (this.f3552x) {
            return mo4789e2(0, mo5151J(), completelyVisible, acceptPartiallyVisible);
        }
        return mo4789e2(mo5151J() - 1, -1, completelyVisible, acceptPartiallyVisible);
    }

    /* renamed from: i2 */
    public final View mo4793i2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3552x) {
            return mo4778W1(recycler, state);
        }
        return mo4784b2(recycler, state);
    }

    /* renamed from: j2 */
    public final View mo4794j2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3552x) {
            return mo4784b2(recycler, state);
        }
        return mo4778W1(recycler, state);
    }

    /* renamed from: W1 */
    public final View mo4778W1(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        return mo4732h2(recycler, state, 0, mo5151J(), state.mo5029b());
    }

    /* renamed from: b2 */
    public final View mo4784b2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        return mo4732h2(recycler, state, mo5151J() - 1, -1, state.mo5029b());
    }

    /* renamed from: h2 */
    public View mo4732h2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int start, int end, int itemCount) {
        mo4775T1();
        View invalidMatch = null;
        View outOfBoundsMatch = null;
        int boundsStart = this.f3549u.mo3355m();
        int boundsEnd = this.f3549u.mo3351i();
        int diff = end > start ? 1 : -1;
        for (int i = start; i != end; i += diff) {
            View view = mo5150I(i);
            int position = mo5193h0(view);
            if (position >= 0 && position < itemCount) {
                if (((RecyclerView.C0881p) view.getLayoutParams()).mo5232c()) {
                    if (invalidMatch == null) {
                        invalidMatch = view;
                    }
                } else if (this.f3549u.mo3349g(view) < boundsEnd && this.f3549u.mo3346d(view) >= boundsStart) {
                    return view;
                } else {
                    if (outOfBoundsMatch == null) {
                        outOfBoundsMatch = view;
                    }
                }
            }
        }
        return outOfBoundsMatch != null ? outOfBoundsMatch : invalidMatch;
    }

    /* renamed from: f2 */
    public final View mo4790f2() {
        if (this.f3552x) {
            return mo4777V1();
        }
        return mo4783a2();
    }

    /* renamed from: g2 */
    public final View mo4792g2() {
        if (this.f3552x) {
            return mo4783a2();
        }
        return mo4777V1();
    }

    /* renamed from: V1 */
    public final View mo4777V1() {
        return mo4788d2(0, mo5151J());
    }

    /* renamed from: a2 */
    public final View mo4783a2() {
        return mo4788d2(mo5151J() - 1, -1);
    }

    /* renamed from: Z1 */
    public int mo4781Z1() {
        View child = mo4789e2(0, mo5151J(), false, true);
        if (child == null) {
            return -1;
        }
        return mo5193h0(child);
    }

    /* renamed from: c2 */
    public int mo4786c2() {
        View child = mo4789e2(mo5151J() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return mo5193h0(child);
    }

    /* renamed from: e2 */
    public View mo4789e2(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptPartiallyVisible) {
        int preferredBoundsFlag;
        mo4775T1();
        int acceptableBoundsFlag = 0;
        if (completelyVisible) {
            preferredBoundsFlag = 24579;
        } else {
            preferredBoundsFlag = 320;
        }
        if (acceptPartiallyVisible) {
            acceptableBoundsFlag = 320;
        }
        if (this.f3547s == 0) {
            return this.f3643e.mo3397a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f3644f.mo3397a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    /* renamed from: d2 */
    public View mo4788d2(int fromIndex, int toIndex) {
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        mo4775T1();
        if ((toIndex > fromIndex ? 1 : toIndex < fromIndex ? -1 : 0) == 0) {
            return mo5150I(fromIndex);
        }
        if (this.f3549u.mo3349g(mo5150I(fromIndex)) < this.f3549u.mo3355m()) {
            preferredBoundsFlag = 16644;
            acceptableBoundsFlag = 16388;
        } else {
            preferredBoundsFlag = 4161;
            acceptableBoundsFlag = 4097;
        }
        if (this.f3547s == 0) {
            return this.f3643e.mo3397a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
        }
        return this.f3644f.mo3397a(fromIndex, toIndex, preferredBoundsFlag, acceptableBoundsFlag);
    }

    /* renamed from: J0 */
    public View mo4702J0(View focused, int focusDirection, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        int layoutDir;
        View nextCandidate;
        View nextFocus;
        mo4752A2();
        if (mo5151J() == 0 || (layoutDir = mo4773R1(focusDirection)) == Integer.MIN_VALUE) {
            return null;
        }
        mo4775T1();
        mo4763I2(layoutDir, (int) (((float) this.f3549u.mo3356n()) * 0.33333334f), false, state);
        C0852c cVar = this.f3548t;
        cVar.f3570g = RecyclerView.UNDEFINED_DURATION;
        cVar.f3564a = false;
        mo4776U1(recycler, cVar, state, true);
        if (layoutDir == -1) {
            nextCandidate = mo4792g2();
        } else {
            nextCandidate = mo4790f2();
        }
        if (layoutDir == -1) {
            nextFocus = mo4800n2();
        } else {
            nextFocus = mo4799m2();
        }
        if (!nextFocus.hasFocusable()) {
            return nextCandidate;
        }
        if (nextCandidate == null) {
            return null;
        }
        return nextFocus;
    }

    /* renamed from: L1 */
    public boolean mo4703L1() {
        return this.f3542D == null && this.f3550v == this.f3553y;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0852c {

        /* renamed from: a */
        public boolean f3564a = true;

        /* renamed from: b */
        public int f3565b;

        /* renamed from: c */
        public int f3566c;

        /* renamed from: d */
        public int f3567d;

        /* renamed from: e */
        public int f3568e;

        /* renamed from: f */
        public int f3569f;

        /* renamed from: g */
        public int f3570g;

        /* renamed from: h */
        public int f3571h = 0;

        /* renamed from: i */
        public int f3572i = 0;

        /* renamed from: j */
        public boolean f3573j;

        /* renamed from: k */
        public int f3574k;

        /* renamed from: l */
        public List<RecyclerView.C0862d0> f3575l = null;

        /* renamed from: m */
        public boolean f3576m;

        /* renamed from: c */
        public boolean mo4826c(RecyclerView.C0856a0 state) {
            int i = this.f3567d;
            return i >= 0 && i < state.mo5029b();
        }

        /* renamed from: d */
        public View mo4827d(RecyclerView.C0888v recycler) {
            if (this.f3575l != null) {
                return mo4828e();
            }
            View view = recycler.mo5275o(this.f3567d);
            this.f3567d += this.f3568e;
            return view;
        }

        /* renamed from: e */
        public final View mo4828e() {
            int size = this.f3575l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3575l.get(i).f3608a;
                RecyclerView.C0881p lp = (RecyclerView.C0881p) view.getLayoutParams();
                if (!lp.mo5232c() && this.f3567d == lp.mo5230a()) {
                    mo4825b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo4824a() {
            mo4825b((View) null);
        }

        /* renamed from: b */
        public void mo4825b(View ignore) {
            View closest = mo4829f(ignore);
            if (closest == null) {
                this.f3567d = -1;
            } else {
                this.f3567d = ((RecyclerView.C0881p) closest.getLayoutParams()).mo5230a();
            }
        }

        /* renamed from: f */
        public View mo4829f(View ignore) {
            int distance;
            int size = this.f3575l.size();
            View closest = null;
            int closestDistance = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                View view = this.f3575l.get(i).f3608a;
                RecyclerView.C0881p lp = (RecyclerView.C0881p) view.getLayoutParams();
                if (view != ignore && !lp.mo5232c() && (distance = (lp.mo5230a() - this.f3567d) * this.f3568e) >= 0 && distance < closestDistance) {
                    closest = view;
                    closestDistance = distance;
                    if (distance == 0) {
                        break;
                    }
                }
            }
            return closest;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0853d implements Parcelable {
        public static final Parcelable.Creator<C0853d> CREATOR = new C0854a();

        /* renamed from: b */
        public int f3577b;

        /* renamed from: c */
        public int f3578c;

        /* renamed from: d */
        public boolean f3579d;

        public C0853d() {
        }

        public C0853d(Parcel in) {
            this.f3577b = in.readInt();
            this.f3578c = in.readInt();
            this.f3579d = in.readInt() != 1 ? false : true;
        }

        public C0853d(C0853d other) {
            this.f3577b = other.f3577b;
            this.f3578c = other.f3578c;
            this.f3579d = other.f3579d;
        }

        /* renamed from: f */
        public boolean mo4831f() {
            return this.f3577b >= 0;
        }

        /* renamed from: g */
        public void mo4832g() {
            this.f3577b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f3577b);
            dest.writeInt(this.f3578c);
            dest.writeInt(this.f3579d ? 1 : 0);
        }

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class C0854a implements Parcelable.Creator<C0853d> {
            /* renamed from: a */
            public C0853d createFromParcel(Parcel in) {
                return new C0853d(in);
            }

            /* renamed from: b */
            public C0853d[] newArray(int size) {
                return new C0853d[size];
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0850a {

        /* renamed from: a */
        public C0641j f3555a;

        /* renamed from: b */
        public int f3556b;

        /* renamed from: c */
        public int f3557c;

        /* renamed from: d */
        public boolean f3558d;

        /* renamed from: e */
        public boolean f3559e;

        public C0850a() {
            mo4821e();
        }

        /* renamed from: e */
        public void mo4821e() {
            this.f3556b = -1;
            this.f3557c = RecyclerView.UNDEFINED_DURATION;
            this.f3558d = false;
            this.f3559e = false;
        }

        /* renamed from: a */
        public void mo4817a() {
            int i;
            if (this.f3558d) {
                i = this.f3555a.mo3351i();
            } else {
                i = this.f3555a.mo3355m();
            }
            this.f3557c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3556b + ", mCoordinate=" + this.f3557c + ", mLayoutFromEnd=" + this.f3558d + ", mValid=" + this.f3559e + '}';
        }

        /* renamed from: d */
        public boolean mo4820d(View child, RecyclerView.C0856a0 state) {
            RecyclerView.C0881p lp = (RecyclerView.C0881p) child.getLayoutParams();
            return !lp.mo5232c() && lp.mo5230a() >= 0 && lp.mo5230a() < state.mo5029b();
        }

        /* renamed from: c */
        public void mo4819c(View child, int position) {
            int endMargin;
            int spaceChange = this.f3555a.mo3357o();
            if (spaceChange >= 0) {
                mo4818b(child, position);
                return;
            }
            this.f3556b = position;
            if (this.f3558d) {
                int previousEndMargin = (this.f3555a.mo3351i() - spaceChange) - this.f3555a.mo3346d(child);
                this.f3557c = this.f3555a.mo3351i() - previousEndMargin;
                if (previousEndMargin > 0) {
                    int childSize = this.f3555a.mo3347e(child);
                    int layoutStart = this.f3555a.mo3355m();
                    int startMargin = (this.f3557c - childSize) - (Math.min(this.f3555a.mo3349g(child) - layoutStart, 0) + layoutStart);
                    if (startMargin < 0) {
                        this.f3557c += Math.min(previousEndMargin, -startMargin);
                        return;
                    }
                    return;
                }
                return;
            }
            int childStart = this.f3555a.mo3349g(child);
            int startMargin2 = childStart - this.f3555a.mo3355m();
            this.f3557c = childStart;
            if (startMargin2 > 0 && (endMargin = (this.f3555a.mo3351i() - Math.min(0, (this.f3555a.mo3351i() - spaceChange) - this.f3555a.mo3346d(child))) - (this.f3555a.mo3347e(child) + childStart)) < 0) {
                this.f3557c -= Math.min(startMargin2, -endMargin);
            }
        }

        /* renamed from: b */
        public void mo4818b(View child, int position) {
            if (this.f3558d) {
                this.f3557c = this.f3555a.mo3346d(child) + this.f3555a.mo3357o();
            } else {
                this.f3557c = this.f3555a.mo3349g(child);
            }
            this.f3556b = position;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0851b {

        /* renamed from: a */
        public int f3560a;

        /* renamed from: b */
        public boolean f3561b;

        /* renamed from: c */
        public boolean f3562c;

        /* renamed from: d */
        public boolean f3563d;

        /* renamed from: a */
        public void mo4823a() {
            this.f3560a = 0;
            this.f3561b = false;
            this.f3562c = false;
            this.f3563d = false;
        }
    }
}
