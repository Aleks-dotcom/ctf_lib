package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p055o.p056d.C0636f;
import p000a.p055o.p056d.C0637g;
import p000a.p055o.p056d.C0641j;
import p000a.p055o.p056d.C0646l;

public class StaggeredGridLayoutManager extends RecyclerView.C0876o implements RecyclerView.C0893z.C0895b {

    /* renamed from: A */
    public boolean f3699A = false;

    /* renamed from: B */
    public BitSet f3700B;

    /* renamed from: C */
    public int f3701C = -1;

    /* renamed from: D */
    public int f3702D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    public C0899d f3703E = new C0899d();

    /* renamed from: F */
    public int f3704F = 2;

    /* renamed from: G */
    public boolean f3705G;

    /* renamed from: H */
    public boolean f3706H;

    /* renamed from: I */
    public C0902e f3707I;

    /* renamed from: J */
    public int f3708J;

    /* renamed from: K */
    public final Rect f3709K = new Rect();

    /* renamed from: L */
    public final C0897b f3710L = new C0897b();

    /* renamed from: M */
    public boolean f3711M = false;

    /* renamed from: N */
    public boolean f3712N = true;

    /* renamed from: O */
    public int[] f3713O;

    /* renamed from: P */
    public final Runnable f3714P = new C0896a();

    /* renamed from: s */
    public int f3715s = -1;

    /* renamed from: t */
    public C0904f[] f3716t;

    /* renamed from: u */
    public C0641j f3717u;

    /* renamed from: v */
    public C0641j f3718v;

    /* renamed from: w */
    public int f3719w;

    /* renamed from: x */
    public int f3720x;

    /* renamed from: y */
    public final C0636f f3721y;

    /* renamed from: z */
    public boolean f3722z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C0896a implements Runnable {
        public C0896a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5338S1();
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        RecyclerView.C0876o.C0880d properties = RecyclerView.C0876o.m4567i0(context, attrs, defStyleAttr, defStyleRes);
        mo5321H2(properties.f3659a);
        mo5323J2(properties.f3660b);
        mo5322I2(properties.f3661c);
        this.f3721y = new C0636f();
        mo5346a2();
    }

    /* renamed from: s0 */
    public boolean mo4808s0() {
        return this.f3704F != 0;
    }

    /* renamed from: a2 */
    public final void mo5346a2() {
        this.f3717u = C0641j.m3160b(this, this.f3719w);
        this.f3718v = C0641j.m3160b(this, 1 - this.f3719w);
    }

    /* renamed from: S1 */
    public boolean mo5338S1() {
        int maxPos;
        int minPos;
        if (mo5151J() == 0 || this.f3704F == 0 || !mo5213r0()) {
            return false;
        }
        if (this.f3699A) {
            minPos = mo5356k2();
            maxPos = mo5355j2();
        } else {
            minPos = mo5355j2();
            maxPos = mo5356k2();
        }
        if (minPos == 0 && mo5363r2() != null) {
            this.f3703E.mo5380b();
            mo5219u1();
            mo5217t1();
            return true;
        } else if (!this.f3711M) {
            return false;
        } else {
            int invalidGapDir = this.f3699A ? -1 : 1;
            C0899d.C0900a invalidFsi = this.f3703E.mo5383e(minPos, maxPos + 1, invalidGapDir, true);
            if (invalidFsi == null) {
                this.f3711M = false;
                this.f3703E.mo5382d(maxPos + 1);
                return false;
            }
            C0899d.C0900a validFsi = this.f3703E.mo5383e(minPos, invalidFsi.f3735b, invalidGapDir * -1, true);
            if (validFsi == null) {
                this.f3703E.mo5382d(invalidFsi.f3735b);
            } else {
                this.f3703E.mo5382d(validFsi.f3735b + 1);
            }
            mo5219u1();
            mo5217t1();
            return true;
        }
    }

    /* renamed from: e1 */
    public void mo5186e1(int state) {
        if (state == 0) {
            mo5338S1();
        }
    }

    /* renamed from: I0 */
    public void mo4761I0(RecyclerView view, RecyclerView.C0888v recycler) {
        super.mo4761I0(view, recycler);
        mo5208o1(this.f3714P);
        for (int i = 0; i < this.f3715s; i++) {
            this.f3716t[i].mo5414e();
        }
        view.requestLayout();
    }

    /* renamed from: r2 */
    public View mo5363r2() {
        int childLimit;
        int firstChildIndex;
        int endChildIndex = mo5151J() - 1;
        BitSet mSpansToCheck = new BitSet(this.f3715s);
        mSpansToCheck.set(0, this.f3715s, true);
        int nextChildDiff = -1;
        int preferredSpanDir = (this.f3719w != 1 || !mo5365t2()) ? -1 : 1;
        if (this.f3699A) {
            firstChildIndex = endChildIndex;
            childLimit = 0 - 1;
        } else {
            firstChildIndex = 0;
            childLimit = endChildIndex + 1;
        }
        if (firstChildIndex < childLimit) {
            nextChildDiff = 1;
        }
        for (int i = firstChildIndex; i != childLimit; i += nextChildDiff) {
            View child = mo5150I(i);
            C0898c lp = (C0898c) child.getLayoutParams();
            if (mSpansToCheck.get(lp.f3731e.f3753e)) {
                if (mo5339T1(lp.f3731e)) {
                    return child;
                }
                mSpansToCheck.clear(lp.f3731e.f3753e);
            }
            if (!lp.f3732f && i + nextChildDiff != childLimit) {
                View nextChild = mo5150I(i + nextChildDiff);
                boolean compareSpans = false;
                if (this.f3699A) {
                    int myEnd = this.f3717u.mo3346d(child);
                    int nextEnd = this.f3717u.mo3346d(nextChild);
                    if (myEnd < nextEnd) {
                        return child;
                    }
                    if (myEnd == nextEnd) {
                        compareSpans = true;
                    }
                } else {
                    int myStart = this.f3717u.mo3349g(child);
                    int nextStart = this.f3717u.mo3349g(nextChild);
                    if (myStart > nextStart) {
                        return child;
                    }
                    if (myStart == nextStart) {
                        compareSpans = true;
                    }
                }
                if (!compareSpans) {
                    continue;
                } else {
                    if ((lp.f3731e.f3753e - ((C0898c) nextChild.getLayoutParams()).f3731e.f3753e < 0) != (preferredSpanDir < 0)) {
                        return child;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: T1 */
    public final boolean mo5339T1(C0904f span) {
        if (this.f3699A) {
            if (span.mo5420k() < this.f3717u.mo3351i()) {
                ArrayList<View> arrayList = span.f3749a;
                return !span.mo5423n(arrayList.get(arrayList.size() - 1)).f3732f;
            }
        } else if (span.mo5424o() > this.f3717u.mo3355m()) {
            return !span.mo5423n(span.f3749a.get(0)).f3732f;
        }
        return false;
    }

    /* renamed from: J2 */
    public void mo5323J2(int spanCount) {
        mo4791g((String) null);
        if (spanCount != this.f3715s) {
            mo5364s2();
            this.f3715s = spanCount;
            this.f3700B = new BitSet(this.f3715s);
            this.f3716t = new C0904f[this.f3715s];
            for (int i = 0; i < this.f3715s; i++) {
                this.f3716t[i] = new C0904f(i);
            }
            mo5217t1();
        }
    }

    /* renamed from: H2 */
    public void mo5321H2(int orientation) {
        if (orientation == 0 || orientation == 1) {
            mo4791g((String) null);
            if (orientation != this.f3719w) {
                this.f3719w = orientation;
                C0641j tmp = this.f3717u;
                this.f3717u = this.f3718v;
                this.f3718v = tmp;
                mo5217t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: I2 */
    public void mo5322I2(boolean reverseLayout) {
        mo4791g((String) null);
        C0902e eVar = this.f3707I;
        if (!(eVar == null || eVar.f3746i == reverseLayout)) {
            eVar.f3746i = reverseLayout;
        }
        this.f3722z = reverseLayout;
        mo5217t1();
    }

    /* renamed from: g */
    public void mo4791g(String message) {
        if (this.f3707I == null) {
            super.mo4791g(message);
        }
    }

    /* renamed from: s2 */
    public void mo5364s2() {
        this.f3703E.mo5380b();
        mo5217t1();
    }

    /* renamed from: E2 */
    public final void mo5318E2() {
        if (this.f3719w == 1 || !mo5365t2()) {
            this.f3699A = this.f3722z;
        } else {
            this.f3699A = !this.f3722z;
        }
    }

    /* renamed from: t2 */
    public boolean mo5365t2() {
        return mo5173Z() == 1;
    }

    /* renamed from: C1 */
    public void mo4697C1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        int horizontalPadding = mo5185e0() + mo5188f0();
        int verticalPadding = mo5190g0() + mo5183d0();
        if (this.f3719w == 1) {
            width = RecyclerView.C0876o.m4568n(hSpec, childrenBounds.height() + verticalPadding, mo5178b0());
            usedHeight = RecyclerView.C0876o.m4568n(wSpec, (this.f3720x * this.f3715s) + horizontalPadding, mo5181c0());
        } else {
            usedHeight = RecyclerView.C0876o.m4568n(wSpec, childrenBounds.width() + horizontalPadding, mo5181c0());
            width = RecyclerView.C0876o.m4568n(hSpec, (this.f3720x * this.f3715s) + verticalPadding, mo5178b0());
        }
        mo5137B1(usedHeight, width);
    }

    /* renamed from: X0 */
    public void mo4721X0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        mo5368w2(recycler, state, true);
    }

    /* renamed from: w2 */
    public final void mo5368w2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, boolean shouldCheckForGaps) {
        C0902e eVar;
        C0897b anchorInfo = this.f3710L;
        if (!(this.f3707I == null && this.f3701C == -1) && state.mo5029b() == 0) {
            mo5200k1(recycler);
            anchorInfo.mo5375c();
            return;
        }
        boolean needToCheckForGaps = true;
        boolean recalculateAnchor = (anchorInfo.f3728e && this.f3701C == -1 && this.f3707I == null) ? false : true;
        if (recalculateAnchor) {
            anchorInfo.mo5375c();
            if (this.f3707I != null) {
                mo5328N1(anchorInfo);
            } else {
                mo5318E2();
                anchorInfo.f3726c = this.f3699A;
            }
            mo5329N2(state, anchorInfo);
            anchorInfo.f3728e = true;
        }
        if (this.f3707I == null && this.f3701C == -1 && !(anchorInfo.f3726c == this.f3705G && mo5365t2() == this.f3706H)) {
            this.f3703E.mo5380b();
            anchorInfo.f3727d = true;
        }
        if (mo5151J() > 0 && ((eVar = this.f3707I) == null || eVar.f3741d < 1)) {
            if (anchorInfo.f3727d) {
                for (int i = 0; i < this.f3715s; i++) {
                    this.f3716t[i].mo5414e();
                    int i2 = anchorInfo.f3725b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f3716t[i].mo5431v(i2);
                    }
                }
            } else if (recalculateAnchor || this.f3710L.f3729f == null) {
                for (int i3 = 0; i3 < this.f3715s; i3++) {
                    this.f3716t[i3].mo5411b(this.f3699A, anchorInfo.f3725b);
                }
                this.f3710L.mo5376d(this.f3716t);
            } else {
                for (int i4 = 0; i4 < this.f3715s; i4++) {
                    C0904f span = this.f3716t[i4];
                    span.mo5414e();
                    span.mo5431v(this.f3710L.f3729f[i4]);
                }
            }
        }
        mo5222w(recycler);
        this.f3721y.f2546a = false;
        this.f3711M = false;
        mo5333P2(this.f3718v.mo3356n());
        mo5331O2(anchorInfo.f3724a, state);
        if (anchorInfo.f3726c) {
            mo5320G2(-1);
            mo5347b2(recycler, this.f3721y, state);
            mo5320G2(1);
            C0636f fVar = this.f3721y;
            fVar.f2548c = anchorInfo.f3724a + fVar.f2549d;
            mo5347b2(recycler, fVar, state);
        } else {
            mo5320G2(1);
            mo5347b2(recycler, this.f3721y, state);
            mo5320G2(-1);
            C0636f fVar2 = this.f3721y;
            fVar2.f2548c = anchorInfo.f3724a + fVar2.f2549d;
            mo5347b2(recycler, fVar2, state);
        }
        mo5317D2();
        if (mo5151J() > 0) {
            if (this.f3699A) {
                mo5353h2(recycler, state, true);
                mo5354i2(recycler, state, false);
            } else {
                mo5354i2(recycler, state, true);
                mo5353h2(recycler, state, false);
            }
        }
        boolean hasGaps = false;
        if (shouldCheckForGaps && !state.mo5032e()) {
            if (this.f3704F == 0 || mo5151J() <= 0 || (!this.f3711M && mo5363r2() == null)) {
                needToCheckForGaps = false;
            }
            if (needToCheckForGaps) {
                mo5208o1(this.f3714P);
                if (mo5338S1()) {
                    hasGaps = true;
                }
            }
        }
        if (state.mo5032e()) {
            this.f3710L.mo5375c();
        }
        this.f3705G = anchorInfo.f3726c;
        this.f3706H = mo5365t2();
        if (hasGaps) {
            this.f3710L.mo5375c();
            mo5368w2(recycler, state, false);
        }
    }

    /* renamed from: Y0 */
    public void mo4723Y0(RecyclerView.C0856a0 state) {
        super.mo4723Y0(state);
        this.f3701C = -1;
        this.f3702D = RecyclerView.UNDEFINED_DURATION;
        this.f3707I = null;
        this.f3710L.mo5375c();
    }

    /* renamed from: D2 */
    public final void mo5317D2() {
        if (this.f3718v.mo3353k() != 1073741824) {
            float maxSize = 0.0f;
            int childCount = mo5151J();
            for (int i = 0; i < childCount; i++) {
                View child = mo5150I(i);
                float size = (float) this.f3718v.mo3347e(child);
                if (size >= maxSize) {
                    if (((C0898c) child.getLayoutParams()).mo5378f()) {
                        size = (1.0f * size) / ((float) this.f3715s);
                    }
                    maxSize = Math.max(maxSize, size);
                }
            }
            int before = this.f3720x;
            int desired = Math.round(((float) this.f3715s) * maxSize);
            if (this.f3718v.mo3353k() == Integer.MIN_VALUE) {
                desired = Math.min(desired, this.f3718v.mo3356n());
            }
            mo5333P2(desired);
            if (this.f3720x != before) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child2 = mo5150I(i2);
                    C0898c lp = (C0898c) child2.getLayoutParams();
                    if (!lp.f3732f) {
                        if (!mo5365t2() || this.f3719w != 1) {
                            int i3 = lp.f3731e.f3753e;
                            int newOffset = this.f3720x * i3;
                            int prevOffset = i3 * before;
                            if (this.f3719w == 1) {
                                child2.offsetLeftAndRight(newOffset - prevOffset);
                            } else {
                                child2.offsetTopAndBottom(newOffset - prevOffset);
                            }
                        } else {
                            int i4 = this.f3715s;
                            int i5 = lp.f3731e.f3753e;
                            child2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f3720x) - ((-((i4 - 1) - i5)) * before));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: N1 */
    public final void mo5328N1(C0897b anchorInfo) {
        C0902e eVar = this.f3707I;
        int i = eVar.f3741d;
        if (i > 0) {
            if (i == this.f3715s) {
                for (int i2 = 0; i2 < this.f3715s; i2++) {
                    this.f3716t[i2].mo5414e();
                    C0902e eVar2 = this.f3707I;
                    int line = eVar2.f3742e[i2];
                    if (line != Integer.MIN_VALUE) {
                        if (eVar2.f3747j) {
                            line += this.f3717u.mo3351i();
                        } else {
                            line += this.f3717u.mo3355m();
                        }
                    }
                    this.f3716t[i2].mo5431v(line);
                }
            } else {
                eVar.mo5404g();
                C0902e eVar3 = this.f3707I;
                eVar3.f3739b = eVar3.f3740c;
            }
        }
        C0902e eVar4 = this.f3707I;
        this.f3706H = eVar4.f3748k;
        mo5322I2(eVar4.f3746i);
        mo5318E2();
        C0902e eVar5 = this.f3707I;
        int i3 = eVar5.f3739b;
        if (i3 != -1) {
            this.f3701C = i3;
            anchorInfo.f3726c = eVar5.f3747j;
        } else {
            anchorInfo.f3726c = this.f3699A;
        }
        if (eVar5.f3743f > 1) {
            C0899d dVar = this.f3703E;
            dVar.f3733a = eVar5.f3744g;
            dVar.f3734b = eVar5.f3745h;
        }
    }

    /* renamed from: N2 */
    public void mo5329N2(RecyclerView.C0856a0 state, C0897b anchorInfo) {
        if (!mo5327M2(state, anchorInfo) && !mo5325L2(state, anchorInfo)) {
            anchorInfo.mo5373a();
            anchorInfo.f3724a = 0;
        }
    }

    /* renamed from: L2 */
    public final boolean mo5325L2(RecyclerView.C0856a0 state, C0897b anchorInfo) {
        int i;
        if (this.f3705G) {
            i = mo5352g2(state.mo5029b());
        } else {
            i = mo5348c2(state.mo5029b());
        }
        anchorInfo.f3724a = i;
        anchorInfo.f3725b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: M2 */
    public boolean mo5327M2(RecyclerView.C0856a0 state, C0897b anchorInfo) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (state.mo5032e() || (i = this.f3701C) == -1) {
            return false;
        }
        if (i < 0 || i >= state.mo5029b()) {
            this.f3701C = -1;
            this.f3702D = RecyclerView.UNDEFINED_DURATION;
            return false;
        }
        C0902e eVar = this.f3707I;
        if (eVar == null || eVar.f3739b == -1 || eVar.f3741d < 1) {
            View child = mo4754C(this.f3701C);
            if (child != null) {
                if (this.f3699A) {
                    i2 = mo5356k2();
                } else {
                    i2 = mo5355j2();
                }
                anchorInfo.f3724a = i2;
                if (this.f3702D != Integer.MIN_VALUE) {
                    if (anchorInfo.f3726c) {
                        anchorInfo.f3725b = (this.f3717u.mo3351i() - this.f3702D) - this.f3717u.mo3346d(child);
                    } else {
                        anchorInfo.f3725b = (this.f3717u.mo3355m() + this.f3702D) - this.f3717u.mo3349g(child);
                    }
                    return true;
                } else if (this.f3717u.mo3347e(child) > this.f3717u.mo3356n()) {
                    if (anchorInfo.f3726c) {
                        i3 = this.f3717u.mo3351i();
                    } else {
                        i3 = this.f3717u.mo3355m();
                    }
                    anchorInfo.f3725b = i3;
                    return true;
                } else {
                    int startGap = this.f3717u.mo3349g(child) - this.f3717u.mo3355m();
                    if (startGap < 0) {
                        anchorInfo.f3725b = -startGap;
                        return true;
                    }
                    int endGap = this.f3717u.mo3351i() - this.f3717u.mo3346d(child);
                    if (endGap < 0) {
                        anchorInfo.f3725b = endGap;
                        return true;
                    }
                    anchorInfo.f3725b = RecyclerView.UNDEFINED_DURATION;
                }
            } else {
                int i4 = this.f3701C;
                anchorInfo.f3724a = i4;
                int i5 = this.f3702D;
                if (i5 == Integer.MIN_VALUE) {
                    if (mo5336R1(i4) == 1) {
                        z = true;
                    }
                    anchorInfo.f3726c = z;
                    anchorInfo.mo5373a();
                } else {
                    anchorInfo.mo5374b(i5);
                }
                anchorInfo.f3727d = true;
            }
        } else {
            anchorInfo.f3725b = RecyclerView.UNDEFINED_DURATION;
            anchorInfo.f3724a = this.f3701C;
        }
        return true;
    }

    /* renamed from: P2 */
    public void mo5333P2(int totalSpace) {
        this.f3720x = totalSpace / this.f3715s;
        this.f3708J = View.MeasureSpec.makeMeasureSpec(totalSpace, this.f3718v.mo3353k());
    }

    /* renamed from: L1 */
    public boolean mo4703L1() {
        return this.f3707I == null;
    }

    /* renamed from: r */
    public int mo4735r(RecyclerView.C0856a0 state) {
        return mo5341V1(state);
    }

    /* renamed from: V1 */
    public final int mo5341V1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        return C0646l.m3223b(state, this.f3717u, mo5350e2(!this.f3712N), mo5349d2(!this.f3712N), this, this.f3712N, this.f3699A);
    }

    /* renamed from: u */
    public int mo4738u(RecyclerView.C0856a0 state) {
        return mo5341V1(state);
    }

    /* renamed from: q */
    public int mo4805q(RecyclerView.C0856a0 state) {
        return mo5340U1(state);
    }

    /* renamed from: U1 */
    public final int mo5340U1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        return C0646l.m3222a(state, this.f3717u, mo5350e2(!this.f3712N), mo5349d2(!this.f3712N), this, this.f3712N);
    }

    /* renamed from: t */
    public int mo4809t(RecyclerView.C0856a0 state) {
        return mo5340U1(state);
    }

    /* renamed from: s */
    public int mo4736s(RecyclerView.C0856a0 state) {
        return mo5342W1(state);
    }

    /* renamed from: W1 */
    public final int mo5342W1(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0) {
            return 0;
        }
        return C0646l.m3224c(state, this.f3717u, mo5350e2(!this.f3712N), mo5349d2(!this.f3712N), this, this.f3712N);
    }

    /* renamed from: v */
    public int mo4740v(RecyclerView.C0856a0 state) {
        return mo5342W1(state);
    }

    /* renamed from: v2 */
    public final void mo5367v2(View child, C0898c lp, boolean alreadyMeasured) {
        if (lp.f3732f) {
            if (this.f3719w == 1) {
                mo5366u2(child, this.f3708J, RecyclerView.C0876o.m4566K(mo5170W(), mo5171X(), mo5190g0() + mo5183d0(), lp.height, true), alreadyMeasured);
            } else {
                mo5366u2(child, RecyclerView.C0876o.m4566K(mo5207o0(), mo5209p0(), mo5185e0() + mo5188f0(), lp.width, true), this.f3708J, alreadyMeasured);
            }
        } else if (this.f3719w == 1) {
            mo5366u2(child, RecyclerView.C0876o.m4566K(this.f3720x, mo5209p0(), 0, lp.width, false), RecyclerView.C0876o.m4566K(mo5170W(), mo5171X(), mo5190g0() + mo5183d0(), lp.height, true), alreadyMeasured);
        } else {
            mo5366u2(child, RecyclerView.C0876o.m4566K(mo5207o0(), mo5209p0(), mo5185e0() + mo5188f0(), lp.width, true), RecyclerView.C0876o.m4566K(this.f3720x, mo5171X(), 0, lp.height, false), alreadyMeasured);
        }
    }

    /* renamed from: u2 */
    public final void mo5366u2(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        mo5197j(child, this.f3709K);
        C0898c lp = (C0898c) child.getLayoutParams();
        int i = lp.leftMargin;
        Rect rect = this.f3709K;
        int widthSpec2 = mo5337R2(widthSpec, i + rect.left, lp.rightMargin + rect.right);
        int i2 = lp.topMargin;
        Rect rect2 = this.f3709K;
        int heightSpec2 = mo5337R2(heightSpec, i2 + rect2.top, lp.bottomMargin + rect2.bottom);
        if (alreadyMeasured) {
            measure = mo5149H1(child, widthSpec2, heightSpec2, lp);
        } else {
            measure = mo5144F1(child, widthSpec2, heightSpec2, lp);
        }
        if (measure) {
            child.measure(widthSpec2, heightSpec2);
        }
    }

    /* renamed from: R2 */
    public final int mo5337R2(int spec, int startInset, int endInset) {
        if (startInset == 0 && endInset == 0) {
            return spec;
        }
        int mode = View.MeasureSpec.getMode(spec);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(spec) - startInset) - endInset), mode);
        }
        return spec;
    }

    /* renamed from: c1 */
    public void mo4785c1(Parcelable state) {
        if (state instanceof C0902e) {
            this.f3707I = (C0902e) state;
            mo5217t1();
        }
    }

    /* renamed from: d1 */
    public Parcelable mo4787d1() {
        int i;
        int line;
        int[] iArr;
        if (this.f3707I != null) {
            return new C0902e(this.f3707I);
        }
        C0902e state = new C0902e();
        state.f3746i = this.f3722z;
        state.f3747j = this.f3705G;
        state.f3748k = this.f3706H;
        C0899d dVar = this.f3703E;
        if (dVar == null || (iArr = dVar.f3733a) == null) {
            state.f3743f = 0;
        } else {
            state.f3744g = iArr;
            state.f3743f = iArr.length;
            state.f3745h = dVar.f3734b;
        }
        if (mo5151J() > 0) {
            if (this.f3705G) {
                i = mo5356k2();
            } else {
                i = mo5355j2();
            }
            state.f3739b = i;
            state.f3740c = mo5351f2();
            int i2 = this.f3715s;
            state.f3741d = i2;
            state.f3742e = new int[i2];
            for (int i3 = 0; i3 < this.f3715s; i3++) {
                if (this.f3705G) {
                    line = this.f3716t[i3].mo5421l(RecyclerView.UNDEFINED_DURATION);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f3717u.mo3351i();
                    }
                } else {
                    line = this.f3716t[i3].mo5425p(RecyclerView.UNDEFINED_DURATION);
                    if (line != Integer.MIN_VALUE) {
                        line -= this.f3717u.mo3355m();
                    }
                }
                state.f3742e[i3] = line;
            }
        } else {
            state.f3739b = -1;
            state.f3740c = -1;
            state.f3741d = 0;
        }
        return state;
    }

    /* renamed from: P0 */
    public void mo4708P0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, View host, C0424c info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof C0898c)) {
            super.mo5160O0(host, info);
            return;
        }
        C0898c sglp = (C0898c) lp;
        if (this.f3719w == 0) {
            info.mo2462Y(C0424c.C0427c.m2152a(sglp.mo5377e(), sglp.f3732f ? this.f3715s : 1, -1, -1, false, false));
        } else {
            info.mo2462Y(C0424c.C0427c.m2152a(-1, -1, sglp.mo5377e(), sglp.f3732f ? this.f3715s : 1, false, false));
        }
    }

    /* renamed from: K0 */
    public void mo4765K0(AccessibilityEvent event) {
        super.mo4765K0(event);
        if (mo5151J() > 0) {
            View start = mo5350e2(false);
            View end = mo5349d2(false);
            if (start != null && end != null) {
                int startPos = mo5193h0(start);
                int endPos = mo5193h0(end);
                if (startPos < endPos) {
                    event.setFromIndex(startPos);
                    event.setToIndex(endPos);
                    return;
                }
                event.setFromIndex(endPos);
                event.setToIndex(startPos);
            }
        }
    }

    /* renamed from: f2 */
    public int mo5351f2() {
        View first;
        if (this.f3699A) {
            first = mo5349d2(true);
        } else {
            first = mo5350e2(true);
        }
        if (first == null) {
            return -1;
        }
        return mo5193h0(first);
    }

    /* renamed from: k0 */
    public int mo4733k0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3719w == 0) {
            return this.f3715s;
        }
        return super.mo4733k0(recycler, state);
    }

    /* renamed from: N */
    public int mo4704N(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3719w == 1) {
            return this.f3715s;
        }
        return super.mo4704N(recycler, state);
    }

    /* renamed from: e2 */
    public View mo5350e2(boolean fullyVisible) {
        int boundsStart = this.f3717u.mo3355m();
        int boundsEnd = this.f3717u.mo3351i();
        int limit = mo5151J();
        View partiallyVisible = null;
        for (int i = 0; i < limit; i++) {
            View child = mo5150I(i);
            int childStart = this.f3717u.mo3349g(child);
            if (this.f3717u.mo3346d(child) > boundsStart && childStart < boundsEnd) {
                if (childStart >= boundsStart || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    /* renamed from: d2 */
    public View mo5349d2(boolean fullyVisible) {
        int boundsStart = this.f3717u.mo3355m();
        int boundsEnd = this.f3717u.mo3351i();
        View partiallyVisible = null;
        for (int i = mo5151J() - 1; i >= 0; i--) {
            View child = mo5150I(i);
            int childStart = this.f3717u.mo3349g(child);
            int childEnd = this.f3717u.mo3346d(child);
            if (childEnd > boundsStart && childStart < boundsEnd) {
                if (childEnd <= boundsEnd || !fullyVisible) {
                    return child;
                }
                if (partiallyVisible == null) {
                    partiallyVisible = child;
                }
            }
        }
        return partiallyVisible;
    }

    /* renamed from: h2 */
    public final void mo5353h2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, boolean canOffsetChildren) {
        int gap;
        int maxEndLine = mo5357l2(RecyclerView.UNDEFINED_DURATION);
        if (maxEndLine != Integer.MIN_VALUE && (gap = this.f3717u.mo3351i() - maxEndLine) > 0) {
            int gap2 = gap - (-mo5319F2(-gap, recycler, state));
            if (canOffsetChildren && gap2 > 0) {
                this.f3717u.mo3360r(gap2);
            }
        }
    }

    /* renamed from: i2 */
    public final void mo5354i2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, boolean canOffsetChildren) {
        int gap;
        int minStartLine = mo5360o2(Integer.MAX_VALUE);
        if (minStartLine != Integer.MAX_VALUE && (gap = minStartLine - this.f3717u.mo3355m()) > 0) {
            int gap2 = gap - mo5319F2(gap, recycler, state);
            if (canOffsetChildren && gap2 > 0) {
                this.f3717u.mo3360r(-gap2);
            }
        }
    }

    /* renamed from: O2 */
    public final void mo5331O2(int anchorPosition, RecyclerView.C0856a0 state) {
        int targetPos;
        C0636f fVar = this.f3721y;
        boolean z = false;
        fVar.f2547b = 0;
        fVar.f2548c = anchorPosition;
        int startExtra = 0;
        int endExtra = 0;
        if (mo5224x0() && (targetPos = state.mo5030c()) != -1) {
            if (this.f3699A == (targetPos < anchorPosition)) {
                endExtra = this.f3717u.mo3356n();
            } else {
                startExtra = this.f3717u.mo3356n();
            }
        }
        if (mo5156M() != 0) {
            this.f3721y.f2551f = this.f3717u.mo3355m() - startExtra;
            this.f3721y.f2552g = this.f3717u.mo3351i() + endExtra;
        } else {
            this.f3721y.f2552g = this.f3717u.mo3350h() + endExtra;
            this.f3721y.f2551f = -startExtra;
        }
        C0636f fVar2 = this.f3721y;
        fVar2.f2553h = false;
        fVar2.f2546a = true;
        if (this.f3717u.mo3353k() == 0 && this.f3717u.mo3350h() == 0) {
            z = true;
        }
        fVar2.f2554i = z;
    }

    /* renamed from: G2 */
    public final void mo5320G2(int direction) {
        C0636f fVar = this.f3721y;
        fVar.f2550e = direction;
        int i = 1;
        if (this.f3699A != (direction == -1)) {
            i = -1;
        }
        fVar.f2549d = i;
    }

    /* renamed from: C0 */
    public void mo5138C0(int dx) {
        super.mo5138C0(dx);
        for (int i = 0; i < this.f3715s; i++) {
            this.f3716t[i].mo5427r(dx);
        }
    }

    /* renamed from: D0 */
    public void mo5139D0(int dy) {
        super.mo5139D0(dy);
        for (int i = 0; i < this.f3715s; i++) {
            this.f3716t[i].mo5427r(dy);
        }
    }

    /* renamed from: U0 */
    public void mo4716U0(RecyclerView recyclerView, int positionStart, int itemCount) {
        mo5362q2(positionStart, itemCount, 2);
    }

    /* renamed from: R0 */
    public void mo4710R0(RecyclerView recyclerView, int positionStart, int itemCount) {
        mo5362q2(positionStart, itemCount, 1);
    }

    /* renamed from: S0 */
    public void mo4712S0(RecyclerView recyclerView) {
        this.f3703E.mo5380b();
        mo5217t1();
    }

    /* renamed from: T0 */
    public void mo4714T0(RecyclerView recyclerView, int from, int to, int itemCount) {
        mo5362q2(from, to, 8);
    }

    /* renamed from: W0 */
    public void mo4719W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        mo5362q2(positionStart, itemCount, 4);
    }

    /* renamed from: q2 */
    public final void mo5362q2(int positionStart, int itemCountOrToPosition, int cmd) {
        int affectedRangeStart;
        int affectedRangeEnd;
        int minPosition = this.f3699A ? mo5356k2() : mo5355j2();
        if (cmd != 8) {
            affectedRangeStart = positionStart;
            affectedRangeEnd = positionStart + itemCountOrToPosition;
        } else if (positionStart < itemCountOrToPosition) {
            affectedRangeEnd = itemCountOrToPosition + 1;
            affectedRangeStart = positionStart;
        } else {
            affectedRangeEnd = positionStart + 1;
            affectedRangeStart = itemCountOrToPosition;
        }
        this.f3703E.mo5386h(affectedRangeStart);
        if (cmd == 1) {
            this.f3703E.mo5388j(positionStart, itemCountOrToPosition);
        } else if (cmd == 2) {
            this.f3703E.mo5389k(positionStart, itemCountOrToPosition);
        } else if (cmd == 8) {
            this.f3703E.mo5389k(positionStart, 1);
            this.f3703E.mo5388j(itemCountOrToPosition, 1);
        }
        if (affectedRangeEnd > minPosition) {
            if (affectedRangeStart <= (this.f3699A ? mo5355j2() : mo5356k2())) {
                mo5217t1();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* renamed from: b2 */
    public final int mo5347b2(RecyclerView.C0888v recycler, C0636f layoutState, RecyclerView.C0856a0 state) {
        int targetLine;
        int i;
        int diff;
        C0904f currentSpan;
        int end;
        int start;
        int otherStart;
        int otherEnd;
        C0904f currentSpan2;
        int i2;
        int otherEnd2;
        boolean hasInvalidGap;
        int i3;
        RecyclerView.C0888v vVar = recycler;
        C0636f fVar = layoutState;
        ? r9 = 0;
        boolean z = true;
        this.f3700B.set(0, this.f3715s, true);
        if (this.f3721y.f2554i) {
            if (fVar.f2550e == 1) {
                targetLine = Integer.MAX_VALUE;
            } else {
                targetLine = Integer.MIN_VALUE;
            }
        } else if (fVar.f2550e == 1) {
            targetLine = fVar.f2552g + fVar.f2547b;
        } else {
            targetLine = fVar.f2551f - fVar.f2547b;
        }
        mo5324K2(fVar.f2550e, targetLine);
        if (this.f3699A) {
            i = this.f3717u.mo3351i();
        } else {
            i = this.f3717u.mo3355m();
        }
        int defaultNewViewLine = i;
        boolean added = false;
        while (true) {
            if (layoutState.mo3313a(state)) {
                if (!this.f3721y.f2554i && this.f3700B.isEmpty()) {
                    break;
                }
                View view = fVar.mo3314b(vVar);
                C0898c lp = (C0898c) view.getLayoutParams();
                int position = lp.mo5230a();
                int spanIndex = this.f3703E.mo5385g(position);
                boolean assignSpan = spanIndex == -1;
                if (assignSpan) {
                    C0904f currentSpan3 = lp.f3732f ? this.f3716t[r9] : mo5361p2(fVar);
                    this.f3703E.mo5392n(position, currentSpan3);
                    currentSpan = currentSpan3;
                } else {
                    currentSpan = this.f3716t[spanIndex];
                }
                lp.f3731e = currentSpan;
                if (fVar.f2550e == z) {
                    mo5182d(view);
                } else {
                    mo5184e(view, r9);
                }
                mo5367v2(view, lp, r9);
                if (fVar.f2550e == z) {
                    if (lp.f3732f) {
                        start = mo5357l2(defaultNewViewLine);
                    } else {
                        start = currentSpan.mo5421l(defaultNewViewLine);
                    }
                    end = this.f3717u.mo3347e(view) + start;
                    if (assignSpan && lp.f3732f) {
                        C0899d.C0900a fullSpanItem = mo5344Y1(start);
                        fullSpanItem.f3736c = -1;
                        fullSpanItem.f3735b = position;
                        this.f3703E.mo5379a(fullSpanItem);
                    }
                } else {
                    if (lp.f3732f != 0) {
                        i3 = mo5360o2(defaultNewViewLine);
                    } else {
                        i3 = currentSpan.mo5425p(defaultNewViewLine);
                    }
                    end = i3;
                    start = end - this.f3717u.mo3347e(view);
                    if (assignSpan && lp.f3732f) {
                        C0899d.C0900a fullSpanItem2 = mo5345Z1(end);
                        fullSpanItem2.f3736c = z;
                        fullSpanItem2.f3735b = position;
                        this.f3703E.mo5379a(fullSpanItem2);
                    }
                }
                int start2 = start;
                int end2 = end;
                if (lp.f3732f != 0 && fVar.f2549d == -1) {
                    if (assignSpan) {
                        this.f3711M = z;
                    } else {
                        if (fVar.f2550e == z) {
                            hasInvalidGap = mo5330O1() ^ z;
                        } else {
                            hasInvalidGap = mo5332P1() ^ z;
                        }
                        if (hasInvalidGap) {
                            C0899d.C0900a fullSpanItem3 = this.f3703E.mo5384f(position);
                            if (fullSpanItem3 != null) {
                                fullSpanItem3.f3738e = z;
                            }
                            this.f3711M = z;
                        }
                    }
                }
                mo5334Q1(view, lp, fVar);
                if (!mo5365t2() || this.f3719w != z) {
                    if (lp.f3732f != 0) {
                        i2 = this.f3718v.mo3355m();
                    } else {
                        i2 = (currentSpan.f3753e * this.f3720x) + this.f3718v.mo3355m();
                    }
                    int otherStart2 = i2;
                    otherEnd = this.f3718v.mo3347e(view) + otherStart2;
                    otherStart = otherStart2;
                } else {
                    if (lp.f3732f) {
                        otherEnd2 = this.f3718v.mo3351i();
                    } else {
                        otherEnd2 = this.f3718v.mo3351i() - (((this.f3715s - (z ? 1 : 0)) - currentSpan.f3753e) * this.f3720x);
                    }
                    otherEnd = otherEnd2;
                    otherStart = otherEnd2 - this.f3718v.mo3347e(view);
                }
                if (this.f3719w == z) {
                    currentSpan2 = currentSpan;
                    int i4 = spanIndex;
                    int i5 = position;
                    mo5228z0(view, otherStart, start2, otherEnd, end2);
                } else {
                    currentSpan2 = currentSpan;
                    int i6 = spanIndex;
                    int i7 = position;
                    mo5228z0(view, start2, otherStart, end2, otherEnd);
                }
                if (lp.f3732f) {
                    mo5324K2(this.f3721y.f2550e, targetLine);
                } else {
                    mo5335Q2(currentSpan2, this.f3721y.f2550e, targetLine);
                }
                mo5314A2(vVar, this.f3721y);
                if (this.f3721y.f2553h && view.hasFocusable()) {
                    if (lp.f3732f) {
                        this.f3700B.clear();
                    } else {
                        this.f3700B.set(currentSpan2.f3753e, false);
                    }
                }
                added = true;
                r9 = 0;
                z = true;
            } else {
                break;
            }
        }
        if (!added) {
            mo5314A2(vVar, this.f3721y);
        }
        if (this.f3721y.f2550e == -1) {
            diff = this.f3717u.mo3355m() - mo5360o2(this.f3717u.mo3355m());
        } else {
            diff = mo5357l2(this.f3717u.mo3351i()) - this.f3717u.mo3351i();
        }
        if (diff > 0) {
            return Math.min(fVar.f2547b, diff);
        }
        return 0;
    }

    /* renamed from: Y1 */
    public final C0899d.C0900a mo5344Y1(int newItemTop) {
        C0899d.C0900a fsi = new C0899d.C0900a();
        fsi.f3737d = new int[this.f3715s];
        for (int i = 0; i < this.f3715s; i++) {
            fsi.f3737d[i] = newItemTop - this.f3716t[i].mo5421l(newItemTop);
        }
        return fsi;
    }

    /* renamed from: Z1 */
    public final C0899d.C0900a mo5345Z1(int newItemBottom) {
        C0899d.C0900a fsi = new C0899d.C0900a();
        fsi.f3737d = new int[this.f3715s];
        for (int i = 0; i < this.f3715s; i++) {
            fsi.f3737d[i] = this.f3716t[i].mo5425p(newItemBottom) - newItemBottom;
        }
        return fsi;
    }

    /* renamed from: Q1 */
    public final void mo5334Q1(View view, C0898c lp, C0636f layoutState) {
        if (layoutState.f2550e == 1) {
            if (lp.f3732f) {
                mo5326M1(view);
            } else {
                lp.f3731e.mo5410a(view);
            }
        } else if (lp.f3732f) {
            mo5371z2(view);
        } else {
            lp.f3731e.mo5430u(view);
        }
    }

    /* renamed from: A2 */
    public final void mo5314A2(RecyclerView.C0888v recycler, C0636f layoutState) {
        int line;
        int line2;
        if (layoutState.f2546a && !layoutState.f2554i) {
            if (layoutState.f2547b == 0) {
                if (layoutState.f2550e == -1) {
                    mo5315B2(recycler, layoutState.f2552g);
                } else {
                    mo5316C2(recycler, layoutState.f2551f);
                }
            } else if (layoutState.f2550e == -1) {
                int i = layoutState.f2551f;
                int scrolled = i - mo5358m2(i);
                if (scrolled < 0) {
                    line2 = layoutState.f2552g;
                } else {
                    line2 = layoutState.f2552g - Math.min(scrolled, layoutState.f2547b);
                }
                mo5315B2(recycler, line2);
            } else {
                int scrolled2 = mo5359n2(layoutState.f2552g) - layoutState.f2552g;
                if (scrolled2 < 0) {
                    line = layoutState.f2551f;
                } else {
                    line = layoutState.f2551f + Math.min(scrolled2, layoutState.f2547b);
                }
                mo5316C2(recycler, line);
            }
        }
    }

    /* renamed from: M1 */
    public final void mo5326M1(View view) {
        for (int i = this.f3715s - 1; i >= 0; i--) {
            this.f3716t[i].mo5410a(view);
        }
    }

    /* renamed from: z2 */
    public final void mo5371z2(View view) {
        for (int i = this.f3715s - 1; i >= 0; i--) {
            this.f3716t[i].mo5430u(view);
        }
    }

    /* renamed from: K2 */
    public final void mo5324K2(int layoutDir, int targetLine) {
        for (int i = 0; i < this.f3715s; i++) {
            if (!this.f3716t[i].f3749a.isEmpty()) {
                mo5335Q2(this.f3716t[i], layoutDir, targetLine);
            }
        }
    }

    /* renamed from: Q2 */
    public final void mo5335Q2(C0904f span, int layoutDir, int targetLine) {
        int deletedSize = span.mo5419j();
        if (layoutDir == -1) {
            if (span.mo5424o() + deletedSize <= targetLine) {
                this.f3700B.set(span.f3753e, false);
            }
        } else if (span.mo5420k() - deletedSize >= targetLine) {
            this.f3700B.set(span.f3753e, false);
        }
    }

    /* renamed from: m2 */
    public final int mo5358m2(int def) {
        int maxStart = this.f3716t[0].mo5425p(def);
        for (int i = 1; i < this.f3715s; i++) {
            int spanStart = this.f3716t[i].mo5425p(def);
            if (spanStart > maxStart) {
                maxStart = spanStart;
            }
        }
        return maxStart;
    }

    /* renamed from: o2 */
    public final int mo5360o2(int def) {
        int minStart = this.f3716t[0].mo5425p(def);
        for (int i = 1; i < this.f3715s; i++) {
            int spanStart = this.f3716t[i].mo5425p(def);
            if (spanStart < minStart) {
                minStart = spanStart;
            }
        }
        return minStart;
    }

    /* renamed from: O1 */
    public boolean mo5330O1() {
        int end = this.f3716t[0].mo5421l(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3715s; i++) {
            if (this.f3716t[i].mo5421l(RecyclerView.UNDEFINED_DURATION) != end) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P1 */
    public boolean mo5332P1() {
        int start = this.f3716t[0].mo5425p(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f3715s; i++) {
            if (this.f3716t[i].mo5425p(RecyclerView.UNDEFINED_DURATION) != start) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l2 */
    public final int mo5357l2(int def) {
        int maxEnd = this.f3716t[0].mo5421l(def);
        for (int i = 1; i < this.f3715s; i++) {
            int spanEnd = this.f3716t[i].mo5421l(def);
            if (spanEnd > maxEnd) {
                maxEnd = spanEnd;
            }
        }
        return maxEnd;
    }

    /* renamed from: n2 */
    public final int mo5359n2(int def) {
        int minEnd = this.f3716t[0].mo5421l(def);
        for (int i = 1; i < this.f3715s; i++) {
            int spanEnd = this.f3716t[i].mo5421l(def);
            if (spanEnd < minEnd) {
                minEnd = spanEnd;
            }
        }
        return minEnd;
    }

    /* renamed from: C2 */
    public final void mo5316C2(RecyclerView.C0888v recycler, int line) {
        while (mo5151J() > 0) {
            View child = mo5150I(0);
            if (this.f3717u.mo3346d(child) <= line && this.f3717u.mo3358p(child) <= line) {
                C0898c lp = (C0898c) child.getLayoutParams();
                if (lp.f3732f) {
                    int j = 0;
                    while (j < this.f3715s) {
                        if (this.f3716t[j].f3749a.size() != 1) {
                            j++;
                        } else {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.f3715s; j2++) {
                        this.f3716t[j2].mo5429t();
                    }
                } else if (lp.f3731e.f3749a.size() != 1) {
                    lp.f3731e.mo5429t();
                } else {
                    return;
                }
                mo5204m1(child, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: B2 */
    public final void mo5315B2(RecyclerView.C0888v recycler, int line) {
        int i = mo5151J() - 1;
        while (i >= 0) {
            View child = mo5150I(i);
            if (this.f3717u.mo3349g(child) >= line && this.f3717u.mo3359q(child) >= line) {
                C0898c lp = (C0898c) child.getLayoutParams();
                if (lp.f3732f) {
                    int j = 0;
                    while (j < this.f3715s) {
                        if (this.f3716t[j].f3749a.size() != 1) {
                            j++;
                        } else {
                            return;
                        }
                    }
                    for (int j2 = 0; j2 < this.f3715s; j2++) {
                        this.f3716t[j2].mo5428s();
                    }
                } else if (lp.f3731e.f3749a.size() != 1) {
                    lp.f3731e.mo5428s();
                } else {
                    return;
                }
                mo5204m1(child, recycler);
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: x2 */
    public final boolean mo5369x2(int layoutDir) {
        if (this.f3719w == 0) {
            if ((layoutDir == -1) != this.f3699A) {
                return true;
            }
            return false;
        }
        if (((layoutDir == -1) == this.f3699A) == mo5365t2()) {
            return true;
        }
        return false;
    }

    /* renamed from: p2 */
    public final C0904f mo5361p2(C0636f layoutState) {
        int diff;
        int endIndex;
        int startIndex;
        if (mo5369x2(layoutState.f2550e)) {
            startIndex = this.f3715s - 1;
            endIndex = -1;
            diff = -1;
        } else {
            startIndex = 0;
            endIndex = this.f3715s;
            diff = 1;
        }
        if (layoutState.f2550e == 1) {
            C0904f min = null;
            int minLine = Integer.MAX_VALUE;
            int defaultLine = this.f3717u.mo3355m();
            for (int i = startIndex; i != endIndex; i += diff) {
                C0904f other = this.f3716t[i];
                int otherLine = other.mo5421l(defaultLine);
                if (otherLine < minLine) {
                    min = other;
                    minLine = otherLine;
                }
            }
            return min;
        }
        C0904f max = null;
        int maxLine = RecyclerView.UNDEFINED_DURATION;
        int defaultLine2 = this.f3717u.mo3351i();
        for (int i2 = startIndex; i2 != endIndex; i2 += diff) {
            C0904f other2 = this.f3716t[i2];
            int otherLine2 = other2.mo5425p(defaultLine2);
            if (otherLine2 > maxLine) {
                max = other2;
                maxLine = otherLine2;
            }
        }
        return max;
    }

    /* renamed from: l */
    public boolean mo4797l() {
        return this.f3719w == 1;
    }

    /* renamed from: k */
    public boolean mo4795k() {
        return this.f3719w == 0;
    }

    /* renamed from: w1 */
    public int mo4741w1(int dx, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        return mo5319F2(dx, recycler, state);
    }

    /* renamed from: y1 */
    public int mo4742y1(int dy, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        return mo5319F2(dy, recycler, state);
    }

    /* renamed from: R1 */
    public final int mo5336R1(int position) {
        if (mo5151J() != 0) {
            if ((position < mo5355j2()) != this.f3699A) {
                return -1;
            }
            return 1;
        } else if (this.f3699A) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public PointF mo4782a(int targetPosition) {
        int direction = mo5336R1(targetPosition);
        PointF outVector = new PointF();
        if (direction == 0) {
            return null;
        }
        if (this.f3719w == 0) {
            outVector.x = (float) direction;
            outVector.y = 0.0f;
        } else {
            outVector.x = 0.0f;
            outVector.y = (float) direction;
        }
        return outVector;
    }

    /* renamed from: I1 */
    public void mo4762I1(RecyclerView recyclerView, RecyclerView.C0856a0 state, int position) {
        C0637g scroller = new C0637g(recyclerView.getContext());
        scroller.mo5306p(position);
        mo5152J1(scroller);
    }

    /* renamed from: x1 */
    public void mo4813x1(int position) {
        C0902e eVar = this.f3707I;
        if (!(eVar == null || eVar.f3739b == position)) {
            eVar.mo5403f();
        }
        this.f3701C = position;
        this.f3702D = RecyclerView.UNDEFINED_DURATION;
        mo5217t1();
    }

    /* renamed from: o */
    public void mo4801o(int dx, int dy, RecyclerView.C0856a0 state, RecyclerView.C0876o.C0879c layoutPrefetchRegistry) {
        int distance;
        int delta = this.f3719w == 0 ? dx : dy;
        if (mo5151J() != 0 && delta != 0) {
            mo5370y2(delta, state);
            int[] iArr = this.f3713O;
            if (iArr == null || iArr.length < this.f3715s) {
                this.f3713O = new int[this.f3715s];
            }
            int itemPrefetchCount = 0;
            for (int i = 0; i < this.f3715s; i++) {
                C0636f fVar = this.f3721y;
                if (fVar.f2549d == -1) {
                    int i2 = fVar.f2551f;
                    distance = i2 - this.f3716t[i].mo5425p(i2);
                } else {
                    distance = this.f3716t[i].mo5421l(fVar.f2552g) - this.f3721y.f2552g;
                }
                if (distance >= 0) {
                    this.f3713O[itemPrefetchCount] = distance;
                    itemPrefetchCount++;
                }
            }
            Arrays.sort(this.f3713O, 0, itemPrefetchCount);
            for (int i3 = 0; i3 < itemPrefetchCount && this.f3721y.mo3313a(state); i3++) {
                layoutPrefetchRegistry.mo3307a(this.f3721y.f2548c, this.f3713O[i3]);
                C0636f fVar2 = this.f3721y;
                fVar2.f2548c += fVar2.f2549d;
            }
        }
    }

    /* renamed from: y2 */
    public void mo5370y2(int delta, RecyclerView.C0856a0 state) {
        int referenceChildPosition;
        int layoutDir;
        if (delta > 0) {
            layoutDir = 1;
            referenceChildPosition = mo5356k2();
        } else {
            layoutDir = -1;
            referenceChildPosition = mo5355j2();
        }
        this.f3721y.f2546a = true;
        mo5331O2(referenceChildPosition, state);
        mo5320G2(layoutDir);
        C0636f fVar = this.f3721y;
        fVar.f2548c = fVar.f2549d + referenceChildPosition;
        fVar.f2547b = Math.abs(delta);
    }

    /* renamed from: F2 */
    public int mo5319F2(int dt, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        int totalScroll;
        if (mo5151J() == 0 || dt == 0) {
            return 0;
        }
        mo5370y2(dt, state);
        int consumed = mo5347b2(recycler, this.f3721y, state);
        if (this.f3721y.f2547b < consumed) {
            totalScroll = dt;
        } else if (dt < 0) {
            totalScroll = -consumed;
        } else {
            totalScroll = consumed;
        }
        this.f3717u.mo3360r(-totalScroll);
        this.f3705G = this.f3699A;
        C0636f fVar = this.f3721y;
        fVar.f2547b = 0;
        mo5314A2(recycler, fVar);
        return totalScroll;
    }

    /* renamed from: k2 */
    public int mo5356k2() {
        int childCount = mo5151J();
        if (childCount == 0) {
            return 0;
        }
        return mo5193h0(mo5150I(childCount - 1));
    }

    /* renamed from: j2 */
    public int mo5355j2() {
        if (mo5151J() == 0) {
            return 0;
        }
        return mo5193h0(mo5150I(0));
    }

    /* renamed from: c2 */
    public final int mo5348c2(int itemCount) {
        int limit = mo5151J();
        for (int i = 0; i < limit; i++) {
            int position = mo5193h0(mo5150I(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: g2 */
    public final int mo5352g2(int itemCount) {
        for (int i = mo5151J() - 1; i >= 0; i--) {
            int position = mo5193h0(mo5150I(i));
            if (position >= 0 && position < itemCount) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: D */
    public RecyclerView.C0881p mo4698D() {
        if (this.f3719w == 0) {
            return new C0898c(-2, -1);
        }
        return new C0898c(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.C0881p mo4699E(Context c, AttributeSet attrs) {
        return new C0898c(c, attrs);
    }

    /* renamed from: F */
    public RecyclerView.C0881p mo4701F(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new C0898c((ViewGroup.MarginLayoutParams) lp);
        }
        return new C0898c(lp);
    }

    /* renamed from: m */
    public boolean mo4734m(RecyclerView.C0881p lp) {
        return lp instanceof C0898c;
    }

    /* renamed from: J0 */
    public View mo4702J0(View focused, int direction, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        View directChild;
        int referenceChildPosition;
        int i;
        int i2;
        int i3;
        View view;
        if (mo5151J() == 0 || (directChild = mo5135B(focused)) == null) {
            return null;
        }
        mo5318E2();
        int layoutDir = mo5343X1(direction);
        if (layoutDir == Integer.MIN_VALUE) {
            return null;
        }
        C0898c prevFocusLayoutParams = (C0898c) directChild.getLayoutParams();
        boolean prevFocusFullSpan = prevFocusLayoutParams.f3732f;
        C0904f prevFocusSpan = prevFocusLayoutParams.f3731e;
        if (layoutDir == 1) {
            referenceChildPosition = mo5356k2();
        } else {
            referenceChildPosition = mo5355j2();
        }
        mo5331O2(referenceChildPosition, state);
        mo5320G2(layoutDir);
        C0636f fVar = this.f3721y;
        fVar.f2548c = fVar.f2549d + referenceChildPosition;
        fVar.f2547b = (int) (((float) this.f3717u.mo3356n()) * 0.33333334f);
        C0636f fVar2 = this.f3721y;
        fVar2.f2553h = true;
        boolean z = false;
        fVar2.f2546a = false;
        mo5347b2(recycler, fVar2, state);
        this.f3705G = this.f3699A;
        if (!prevFocusFullSpan && (view = prevFocusSpan.mo5422m(referenceChildPosition, layoutDir)) != null && view != directChild) {
            return view;
        }
        if (mo5369x2(layoutDir)) {
            for (int i4 = this.f3715s - 1; i4 >= 0; i4--) {
                View view2 = this.f3716t[i4].mo5422m(referenceChildPosition, layoutDir);
                if (view2 != null && view2 != directChild) {
                    return view2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3715s; i5++) {
                View view3 = this.f3716t[i5].mo5422m(referenceChildPosition, layoutDir);
                if (view3 != null && view3 != directChild) {
                    return view3;
                }
            }
        }
        if ((this.f3722z ^ 1) == (layoutDir == -1 ? 1 : 0)) {
            z = true;
        }
        boolean shouldSearchFromStart = z;
        if (!prevFocusFullSpan) {
            if (shouldSearchFromStart) {
                i3 = prevFocusSpan.mo5415f();
            } else {
                i3 = prevFocusSpan.mo5416g();
            }
            View unfocusableCandidate = mo4754C(i3);
            if (!(unfocusableCandidate == null || unfocusableCandidate == directChild)) {
                return unfocusableCandidate;
            }
        }
        if (mo5369x2(layoutDir)) {
            for (int i6 = this.f3715s - 1; i6 >= 0; i6--) {
                if (i6 != prevFocusSpan.f3753e) {
                    if (shouldSearchFromStart) {
                        i2 = this.f3716t[i6].mo5415f();
                    } else {
                        i2 = this.f3716t[i6].mo5416g();
                    }
                    View unfocusableCandidate2 = mo4754C(i2);
                    if (unfocusableCandidate2 != null && unfocusableCandidate2 != directChild) {
                        return unfocusableCandidate2;
                    }
                    View view4 = unfocusableCandidate2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f3715s; i7++) {
                if (shouldSearchFromStart) {
                    i = this.f3716t[i7].mo5415f();
                } else {
                    i = this.f3716t[i7].mo5416g();
                }
                View unfocusableCandidate3 = mo4754C(i);
                if (unfocusableCandidate3 != null && unfocusableCandidate3 != directChild) {
                    return unfocusableCandidate3;
                }
            }
        }
        return null;
    }

    /* renamed from: X1 */
    public final int mo5343X1(int focusDirection) {
        if (focusDirection != 1) {
            if (focusDirection != 2) {
                if (focusDirection != 17) {
                    if (focusDirection != 33) {
                        if (focusDirection != 66) {
                            if (focusDirection == 130 && this.f3719w == 1) {
                                return 1;
                            }
                            return RecyclerView.UNDEFINED_DURATION;
                        } else if (this.f3719w == 0) {
                            return 1;
                        } else {
                            return RecyclerView.UNDEFINED_DURATION;
                        }
                    } else if (this.f3719w == 1) {
                        return -1;
                    } else {
                        return RecyclerView.UNDEFINED_DURATION;
                    }
                } else if (this.f3719w == 0) {
                    return -1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.f3719w != 1 && mo5365t2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f3719w != 1 && mo5365t2()) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0898c extends RecyclerView.C0881p {

        /* renamed from: e */
        public C0904f f3731e;

        /* renamed from: f */
        public boolean f3732f;

        public C0898c(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0898c(int width, int height) {
            super(width, height);
        }

        public C0898c(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public C0898c(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: f */
        public boolean mo5378f() {
            return this.f3732f;
        }

        /* renamed from: e */
        public final int mo5377e() {
            C0904f fVar = this.f3731e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3753e;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0904f {

        /* renamed from: a */
        public ArrayList<View> f3749a = new ArrayList<>();

        /* renamed from: b */
        public int f3750b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        public int f3751c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        public int f3752d = 0;

        /* renamed from: e */
        public final int f3753e;

        public C0904f(int index) {
            this.f3753e = index;
        }

        /* renamed from: p */
        public int mo5425p(int def) {
            int i = this.f3750b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f3749a.size() == 0) {
                return def;
            }
            mo5413d();
            return this.f3750b;
        }

        /* renamed from: d */
        public void mo5413d() {
            C0899d.C0900a fsi;
            View startView = this.f3749a.get(0);
            C0898c lp = mo5423n(startView);
            this.f3750b = StaggeredGridLayoutManager.this.f3717u.mo3349g(startView);
            if (lp.f3732f && (fsi = StaggeredGridLayoutManager.this.f3703E.mo5384f(lp.mo5230a())) != null && fsi.f3736c == -1) {
                this.f3750b -= fsi.mo5395f(this.f3753e);
            }
        }

        /* renamed from: o */
        public int mo5424o() {
            int i = this.f3750b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5413d();
            return this.f3750b;
        }

        /* renamed from: l */
        public int mo5421l(int def) {
            int i = this.f3751c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.f3749a.size() == 0) {
                return def;
            }
            mo5412c();
            return this.f3751c;
        }

        /* renamed from: c */
        public void mo5412c() {
            C0899d.C0900a fsi;
            ArrayList<View> arrayList = this.f3749a;
            View endView = arrayList.get(arrayList.size() - 1);
            C0898c lp = mo5423n(endView);
            this.f3751c = StaggeredGridLayoutManager.this.f3717u.mo3346d(endView);
            if (lp.f3732f && (fsi = StaggeredGridLayoutManager.this.f3703E.mo5384f(lp.mo5230a())) != null && fsi.f3736c == 1) {
                this.f3751c += fsi.mo5395f(this.f3753e);
            }
        }

        /* renamed from: k */
        public int mo5420k() {
            int i = this.f3751c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5412c();
            return this.f3751c;
        }

        /* renamed from: u */
        public void mo5430u(View view) {
            C0898c lp = mo5423n(view);
            lp.f3731e = this;
            this.f3749a.add(0, view);
            this.f3750b = RecyclerView.UNDEFINED_DURATION;
            if (this.f3749a.size() == 1) {
                this.f3751c = RecyclerView.UNDEFINED_DURATION;
            }
            if (lp.mo5232c() || lp.mo5231b()) {
                this.f3752d += StaggeredGridLayoutManager.this.f3717u.mo3347e(view);
            }
        }

        /* renamed from: a */
        public void mo5410a(View view) {
            C0898c lp = mo5423n(view);
            lp.f3731e = this;
            this.f3749a.add(view);
            this.f3751c = RecyclerView.UNDEFINED_DURATION;
            if (this.f3749a.size() == 1) {
                this.f3750b = RecyclerView.UNDEFINED_DURATION;
            }
            if (lp.mo5232c() || lp.mo5231b()) {
                this.f3752d += StaggeredGridLayoutManager.this.f3717u.mo3347e(view);
            }
        }

        /* renamed from: b */
        public void mo5411b(boolean reverseLayout, int offset) {
            int reference;
            if (reverseLayout) {
                reference = mo5421l(RecyclerView.UNDEFINED_DURATION);
            } else {
                reference = mo5425p(RecyclerView.UNDEFINED_DURATION);
            }
            mo5414e();
            if (reference != Integer.MIN_VALUE) {
                if (reverseLayout && reference < StaggeredGridLayoutManager.this.f3717u.mo3351i()) {
                    return;
                }
                if (reverseLayout || reference <= StaggeredGridLayoutManager.this.f3717u.mo3355m()) {
                    if (offset != Integer.MIN_VALUE) {
                        reference += offset;
                    }
                    this.f3751c = reference;
                    this.f3750b = reference;
                }
            }
        }

        /* renamed from: e */
        public void mo5414e() {
            this.f3749a.clear();
            mo5426q();
            this.f3752d = 0;
        }

        /* renamed from: q */
        public void mo5426q() {
            this.f3750b = RecyclerView.UNDEFINED_DURATION;
            this.f3751c = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: v */
        public void mo5431v(int line) {
            this.f3750b = line;
            this.f3751c = line;
        }

        /* renamed from: s */
        public void mo5428s() {
            int size = this.f3749a.size();
            View end = this.f3749a.remove(size - 1);
            C0898c lp = mo5423n(end);
            lp.f3731e = null;
            if (lp.mo5232c() || lp.mo5231b()) {
                this.f3752d -= StaggeredGridLayoutManager.this.f3717u.mo3347e(end);
            }
            if (size == 1) {
                this.f3750b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f3751c = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: t */
        public void mo5429t() {
            View start = this.f3749a.remove(0);
            C0898c lp = mo5423n(start);
            lp.f3731e = null;
            if (this.f3749a.size() == 0) {
                this.f3751c = RecyclerView.UNDEFINED_DURATION;
            }
            if (lp.mo5232c() || lp.mo5231b()) {
                this.f3752d -= StaggeredGridLayoutManager.this.f3717u.mo3347e(start);
            }
            this.f3750b = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: j */
        public int mo5419j() {
            return this.f3752d;
        }

        /* renamed from: n */
        public C0898c mo5423n(View view) {
            return (C0898c) view.getLayoutParams();
        }

        /* renamed from: r */
        public void mo5427r(int dt) {
            int i = this.f3750b;
            if (i != Integer.MIN_VALUE) {
                this.f3750b = i + dt;
            }
            int i2 = this.f3751c;
            if (i2 != Integer.MIN_VALUE) {
                this.f3751c = i2 + dt;
            }
        }

        /* renamed from: f */
        public int mo5415f() {
            if (StaggeredGridLayoutManager.this.f3722z) {
                return mo5418i(this.f3749a.size() - 1, -1, true);
            }
            return mo5418i(0, this.f3749a.size(), true);
        }

        /* renamed from: g */
        public int mo5416g() {
            if (StaggeredGridLayoutManager.this.f3722z) {
                return mo5418i(0, this.f3749a.size(), true);
            }
            return mo5418i(this.f3749a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int mo5417h(int fromIndex, int toIndex, boolean completelyVisible, boolean acceptCompletelyVisible, boolean acceptEndPointInclusion) {
            int i = toIndex;
            int start = StaggeredGridLayoutManager.this.f3717u.mo3355m();
            int end = StaggeredGridLayoutManager.this.f3717u.mo3351i();
            int next = i > fromIndex ? 1 : -1;
            for (int i2 = fromIndex; i2 != i; i2 += next) {
                View child = this.f3749a.get(i2);
                int childStart = StaggeredGridLayoutManager.this.f3717u.mo3349g(child);
                int childEnd = StaggeredGridLayoutManager.this.f3717u.mo3346d(child);
                boolean childEndInclusion = false;
                boolean childStartInclusion = !acceptEndPointInclusion ? childStart < end : childStart <= end;
                if (!acceptEndPointInclusion ? childEnd > start : childEnd >= start) {
                    childEndInclusion = true;
                }
                if (childStartInclusion && childEndInclusion) {
                    if (!completelyVisible || !acceptCompletelyVisible) {
                        if (acceptCompletelyVisible) {
                            return StaggeredGridLayoutManager.this.mo5193h0(child);
                        }
                        if (childStart < start || childEnd > end) {
                            return StaggeredGridLayoutManager.this.mo5193h0(child);
                        }
                    } else if (childStart >= start && childEnd <= end) {
                        return StaggeredGridLayoutManager.this.mo5193h0(child);
                    }
                }
            }
            return -1;
        }

        /* renamed from: i */
        public int mo5418i(int fromIndex, int toIndex, boolean acceptEndPointInclusion) {
            return mo5417h(fromIndex, toIndex, false, false, acceptEndPointInclusion);
        }

        /* renamed from: m */
        public View mo5422m(int referenceChildPosition, int layoutDir) {
            View candidate = null;
            if (layoutDir != -1) {
                for (int i = this.f3749a.size() - 1; i >= 0; i--) {
                    View view = this.f3749a.get(i);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3722z && staggeredGridLayoutManager.mo5193h0(view) >= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3722z && staggeredGridLayoutManager2.mo5193h0(view) <= referenceChildPosition) || !view.hasFocusable()) {
                        break;
                    }
                    candidate = view;
                }
            } else {
                int limit = this.f3749a.size();
                for (int i2 = 0; i2 < limit; i2++) {
                    View view2 = this.f3749a.get(i2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3722z && staggeredGridLayoutManager3.mo5193h0(view2) <= referenceChildPosition) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3722z && staggeredGridLayoutManager4.mo5193h0(view2) >= referenceChildPosition) || !view2.hasFocusable()) {
                        break;
                    }
                    candidate = view2;
                }
            }
            return candidate;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0899d {

        /* renamed from: a */
        public int[] f3733a;

        /* renamed from: b */
        public List<C0900a> f3734b;

        /* renamed from: d */
        public int mo5382d(int position) {
            List<C0900a> list = this.f3734b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (this.f3734b.get(i).f3735b >= position) {
                        this.f3734b.remove(i);
                    }
                }
            }
            return mo5386h(position);
        }

        /* renamed from: h */
        public int mo5386h(int position) {
            int[] iArr = this.f3733a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            int endPosition = mo5387i(position);
            if (endPosition == -1) {
                int[] iArr2 = this.f3733a;
                Arrays.fill(iArr2, position, iArr2.length, -1);
                return this.f3733a.length;
            }
            Arrays.fill(this.f3733a, position, endPosition + 1, -1);
            return endPosition + 1;
        }

        /* renamed from: g */
        public int mo5385g(int position) {
            int[] iArr = this.f3733a;
            if (iArr == null || position >= iArr.length) {
                return -1;
            }
            return iArr[position];
        }

        /* renamed from: n */
        public void mo5392n(int position, C0904f span) {
            mo5381c(position);
            this.f3733a[position] = span.f3753e;
        }

        /* renamed from: o */
        public int mo5393o(int position) {
            int len = this.f3733a.length;
            while (len <= position) {
                len *= 2;
            }
            return len;
        }

        /* renamed from: c */
        public void mo5381c(int position) {
            int[] iArr = this.f3733a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(position, 10) + 1)];
                this.f3733a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (position >= iArr.length) {
                int[] old = this.f3733a;
                int[] iArr3 = new int[mo5393o(position)];
                this.f3733a = iArr3;
                System.arraycopy(old, 0, iArr3, 0, old.length);
                int[] iArr4 = this.f3733a;
                Arrays.fill(iArr4, old.length, iArr4.length, -1);
            }
        }

        /* renamed from: b */
        public void mo5380b() {
            int[] iArr = this.f3733a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3734b = null;
        }

        /* renamed from: k */
        public void mo5389k(int positionStart, int itemCount) {
            int[] iArr = this.f3733a;
            if (iArr != null && positionStart < iArr.length) {
                mo5381c(positionStart + itemCount);
                int[] iArr2 = this.f3733a;
                System.arraycopy(iArr2, positionStart + itemCount, iArr2, positionStart, (iArr2.length - positionStart) - itemCount);
                int[] iArr3 = this.f3733a;
                Arrays.fill(iArr3, iArr3.length - itemCount, iArr3.length, -1);
                mo5391m(positionStart, itemCount);
            }
        }

        /* renamed from: m */
        public final void mo5391m(int positionStart, int itemCount) {
            List<C0900a> list = this.f3734b;
            if (list != null) {
                int end = positionStart + itemCount;
                for (int i = list.size() - 1; i >= 0; i--) {
                    C0900a fsi = this.f3734b.get(i);
                    int i2 = fsi.f3735b;
                    if (i2 >= positionStart) {
                        if (i2 < end) {
                            this.f3734b.remove(i);
                        } else {
                            fsi.f3735b = i2 - itemCount;
                        }
                    }
                }
            }
        }

        /* renamed from: j */
        public void mo5388j(int positionStart, int itemCount) {
            int[] iArr = this.f3733a;
            if (iArr != null && positionStart < iArr.length) {
                mo5381c(positionStart + itemCount);
                int[] iArr2 = this.f3733a;
                System.arraycopy(iArr2, positionStart, iArr2, positionStart + itemCount, (iArr2.length - positionStart) - itemCount);
                Arrays.fill(this.f3733a, positionStart, positionStart + itemCount, -1);
                mo5390l(positionStart, itemCount);
            }
        }

        /* renamed from: l */
        public final void mo5390l(int positionStart, int itemCount) {
            List<C0900a> list = this.f3734b;
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    C0900a fsi = this.f3734b.get(i);
                    int i2 = fsi.f3735b;
                    if (i2 >= positionStart) {
                        fsi.f3735b = i2 + itemCount;
                    }
                }
            }
        }

        /* renamed from: i */
        public final int mo5387i(int position) {
            if (this.f3734b == null) {
                return -1;
            }
            C0900a item = mo5384f(position);
            if (item != null) {
                this.f3734b.remove(item);
            }
            int nextFsiIndex = -1;
            int count = this.f3734b.size();
            int i = 0;
            while (true) {
                if (i >= count) {
                    break;
                } else if (this.f3734b.get(i).f3735b >= position) {
                    nextFsiIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (nextFsiIndex == -1) {
                return -1;
            }
            this.f3734b.remove(nextFsiIndex);
            return this.f3734b.get(nextFsiIndex).f3735b;
        }

        /* renamed from: a */
        public void mo5379a(C0900a fullSpanItem) {
            if (this.f3734b == null) {
                this.f3734b = new ArrayList();
            }
            int size = this.f3734b.size();
            for (int i = 0; i < size; i++) {
                C0900a other = this.f3734b.get(i);
                if (other.f3735b == fullSpanItem.f3735b) {
                    this.f3734b.remove(i);
                }
                if (other.f3735b >= fullSpanItem.f3735b) {
                    this.f3734b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f3734b.add(fullSpanItem);
        }

        /* renamed from: f */
        public C0900a mo5384f(int position) {
            List<C0900a> list = this.f3734b;
            if (list == null) {
                return null;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                C0900a fsi = this.f3734b.get(i);
                if (fsi.f3735b == position) {
                    return fsi;
                }
            }
            return null;
        }

        /* renamed from: e */
        public C0900a mo5383e(int minPos, int maxPos, int gapDir, boolean hasUnwantedGapAfter) {
            List<C0900a> list = this.f3734b;
            if (list == null) {
                return null;
            }
            int limit = list.size();
            for (int i = 0; i < limit; i++) {
                C0900a fsi = this.f3734b.get(i);
                int i2 = fsi.f3735b;
                if (i2 >= maxPos) {
                    return null;
                }
                if (i2 >= minPos && (gapDir == 0 || fsi.f3736c == gapDir || (hasUnwantedGapAfter && fsi.f3738e))) {
                    return fsi;
                }
            }
            return null;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0900a implements Parcelable {
            public static final Parcelable.Creator<C0900a> CREATOR = new C0901a();

            /* renamed from: b */
            public int f3735b;

            /* renamed from: c */
            public int f3736c;

            /* renamed from: d */
            public int[] f3737d;

            /* renamed from: e */
            public boolean f3738e;

            public C0900a(Parcel in) {
                this.f3735b = in.readInt();
                this.f3736c = in.readInt();
                this.f3738e = in.readInt() != 1 ? false : true;
                int spanCount = in.readInt();
                if (spanCount > 0) {
                    int[] iArr = new int[spanCount];
                    this.f3737d = iArr;
                    in.readIntArray(iArr);
                }
            }

            public C0900a() {
            }

            /* renamed from: f */
            public int mo5395f(int spanIndex) {
                int[] iArr = this.f3737d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[spanIndex];
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.f3735b);
                dest.writeInt(this.f3736c);
                dest.writeInt(this.f3738e ? 1 : 0);
                int[] iArr = this.f3737d;
                if (iArr == null || iArr.length <= 0) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(iArr.length);
                dest.writeIntArray(this.f3737d);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3735b + ", mGapDir=" + this.f3736c + ", mHasUnwantedGapAfter=" + this.f3738e + ", mGapPerSpan=" + Arrays.toString(this.f3737d) + '}';
            }

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            public static class C0901a implements Parcelable.Creator<C0900a> {
                /* renamed from: a */
                public C0900a createFromParcel(Parcel in) {
                    return new C0900a(in);
                }

                /* renamed from: b */
                public C0900a[] newArray(int size) {
                    return new C0900a[size];
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0902e implements Parcelable {
        public static final Parcelable.Creator<C0902e> CREATOR = new C0903a();

        /* renamed from: b */
        public int f3739b;

        /* renamed from: c */
        public int f3740c;

        /* renamed from: d */
        public int f3741d;

        /* renamed from: e */
        public int[] f3742e;

        /* renamed from: f */
        public int f3743f;

        /* renamed from: g */
        public int[] f3744g;

        /* renamed from: h */
        public List<C0899d.C0900a> f3745h;

        /* renamed from: i */
        public boolean f3746i;

        /* renamed from: j */
        public boolean f3747j;

        /* renamed from: k */
        public boolean f3748k;

        public C0902e() {
        }

        public C0902e(Parcel in) {
            this.f3739b = in.readInt();
            this.f3740c = in.readInt();
            int readInt = in.readInt();
            this.f3741d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3742e = iArr;
                in.readIntArray(iArr);
            }
            int readInt2 = in.readInt();
            this.f3743f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3744g = iArr2;
                in.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3746i = in.readInt() == 1;
            this.f3747j = in.readInt() == 1;
            this.f3748k = in.readInt() == 1 ? true : z;
            this.f3745h = in.readArrayList(C0899d.C0900a.class.getClassLoader());
        }

        public C0902e(C0902e other) {
            this.f3741d = other.f3741d;
            this.f3739b = other.f3739b;
            this.f3740c = other.f3740c;
            this.f3742e = other.f3742e;
            this.f3743f = other.f3743f;
            this.f3744g = other.f3744g;
            this.f3746i = other.f3746i;
            this.f3747j = other.f3747j;
            this.f3748k = other.f3748k;
            this.f3745h = other.f3745h;
        }

        /* renamed from: g */
        public void mo5404g() {
            this.f3742e = null;
            this.f3741d = 0;
            this.f3743f = 0;
            this.f3744g = null;
            this.f3745h = null;
        }

        /* renamed from: f */
        public void mo5403f() {
            this.f3742e = null;
            this.f3741d = 0;
            this.f3739b = -1;
            this.f3740c = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f3739b);
            dest.writeInt(this.f3740c);
            dest.writeInt(this.f3741d);
            if (this.f3741d > 0) {
                dest.writeIntArray(this.f3742e);
            }
            dest.writeInt(this.f3743f);
            if (this.f3743f > 0) {
                dest.writeIntArray(this.f3744g);
            }
            dest.writeInt(this.f3746i ? 1 : 0);
            dest.writeInt(this.f3747j ? 1 : 0);
            dest.writeInt(this.f3748k ? 1 : 0);
            dest.writeList(this.f3745h);
        }

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public static class C0903a implements Parcelable.Creator<C0902e> {
            /* renamed from: a */
            public C0902e createFromParcel(Parcel in) {
                return new C0902e(in);
            }

            /* renamed from: b */
            public C0902e[] newArray(int size) {
                return new C0902e[size];
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0897b {

        /* renamed from: a */
        public int f3724a;

        /* renamed from: b */
        public int f3725b;

        /* renamed from: c */
        public boolean f3726c;

        /* renamed from: d */
        public boolean f3727d;

        /* renamed from: e */
        public boolean f3728e;

        /* renamed from: f */
        public int[] f3729f;

        public C0897b() {
            mo5375c();
        }

        /* renamed from: c */
        public void mo5375c() {
            this.f3724a = -1;
            this.f3725b = RecyclerView.UNDEFINED_DURATION;
            this.f3726c = false;
            this.f3727d = false;
            this.f3728e = false;
            int[] iArr = this.f3729f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void mo5376d(C0904f[] spans) {
            int spanCount = spans.length;
            int[] iArr = this.f3729f;
            if (iArr == null || iArr.length < spanCount) {
                this.f3729f = new int[StaggeredGridLayoutManager.this.f3716t.length];
            }
            for (int i = 0; i < spanCount; i++) {
                this.f3729f[i] = spans[i].mo5425p(RecyclerView.UNDEFINED_DURATION);
            }
        }

        /* renamed from: a */
        public void mo5373a() {
            int i;
            if (this.f3726c) {
                i = StaggeredGridLayoutManager.this.f3717u.mo3351i();
            } else {
                i = StaggeredGridLayoutManager.this.f3717u.mo3355m();
            }
            this.f3725b = i;
        }

        /* renamed from: b */
        public void mo5374b(int addedDistance) {
            if (this.f3726c) {
                this.f3725b = StaggeredGridLayoutManager.this.f3717u.mo3351i() - addedDistance;
            } else {
                this.f3725b = StaggeredGridLayoutManager.this.f3717u.mo3355m() + addedDistance;
            }
        }
    }
}
