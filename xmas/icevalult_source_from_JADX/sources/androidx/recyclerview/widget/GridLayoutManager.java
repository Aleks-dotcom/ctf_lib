package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p000a.p025h.p038m.p039a0.C0424c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    public boolean f3524I = false;

    /* renamed from: J */
    public int f3525J = -1;

    /* renamed from: K */
    public int[] f3526K;

    /* renamed from: L */
    public View[] f3527L;

    /* renamed from: M */
    public final SparseIntArray f3528M = new SparseIntArray();

    /* renamed from: N */
    public final SparseIntArray f3529N = new SparseIntArray();

    /* renamed from: O */
    public C0849c f3530O = new C0847a();

    /* renamed from: P */
    public final Rect f3531P = new Rect();

    /* renamed from: Q */
    public boolean f3532Q;

    public GridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mo4730e3(RecyclerView.C0876o.m4567i0(context, attrs, defStyleAttr, defStyleRes).f3660b);
    }

    public GridLayoutManager(Context context, int spanCount, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
        mo4730e3(spanCount);
    }

    /* renamed from: E2 */
    public void mo4700E2(boolean stackFromEnd) {
        if (!stackFromEnd) {
            super.mo4700E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: k0 */
    public int mo4733k0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3547s == 0) {
            return this.f3525J;
        }
        if (state.mo5029b() < 1) {
            return 0;
        }
        return mo4724Y2(recycler, state, state.mo5029b() - 1) + 1;
    }

    /* renamed from: N */
    public int mo4704N(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (this.f3547s == 1) {
            return this.f3525J;
        }
        if (state.mo5029b() < 1) {
            return 0;
        }
        return mo4724Y2(recycler, state, state.mo5029b() - 1) + 1;
    }

    /* renamed from: P0 */
    public void mo4708P0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, View host, C0424c info) {
        ViewGroup.LayoutParams lp = host.getLayoutParams();
        if (!(lp instanceof C0848b)) {
            super.mo5160O0(host, info);
            return;
        }
        C0848b glp = (C0848b) lp;
        int spanGroupIndex = mo4724Y2(recycler, state, glp.mo5230a());
        if (this.f3547s == 0) {
            info.mo2462Y(C0424c.C0427c.m2152a(glp.mo4745e(), glp.mo4746f(), spanGroupIndex, 1, false, false));
            return;
        }
        info.mo2462Y(C0424c.C0427c.m2152a(spanGroupIndex, 1, glp.mo4745e(), glp.mo4746f(), false, false));
    }

    /* renamed from: X0 */
    public void mo4721X0(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        if (state.mo5032e()) {
            mo4707O2();
        }
        super.mo4721X0(recycler, state);
        mo4711R2();
    }

    /* renamed from: Y0 */
    public void mo4723Y0(RecyclerView.C0856a0 state) {
        super.mo4723Y0(state);
        this.f3524I = false;
    }

    /* renamed from: R2 */
    public final void mo4711R2() {
        this.f3528M.clear();
        this.f3529N.clear();
    }

    /* renamed from: O2 */
    public final void mo4707O2() {
        int childCount = mo5151J();
        for (int i = 0; i < childCount; i++) {
            C0848b lp = (C0848b) mo5150I(i).getLayoutParams();
            int viewPosition = lp.mo5230a();
            this.f3528M.put(viewPosition, lp.mo4746f());
            this.f3529N.put(viewPosition, lp.mo4745e());
        }
    }

    /* renamed from: R0 */
    public void mo4710R0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.f3530O.mo4751h();
        this.f3530O.mo4750g();
    }

    /* renamed from: S0 */
    public void mo4712S0(RecyclerView recyclerView) {
        this.f3530O.mo4751h();
        this.f3530O.mo4750g();
    }

    /* renamed from: U0 */
    public void mo4716U0(RecyclerView recyclerView, int positionStart, int itemCount) {
        this.f3530O.mo4751h();
        this.f3530O.mo4750g();
    }

    /* renamed from: W0 */
    public void mo4719W0(RecyclerView recyclerView, int positionStart, int itemCount, Object payload) {
        this.f3530O.mo4751h();
        this.f3530O.mo4750g();
    }

    /* renamed from: T0 */
    public void mo4714T0(RecyclerView recyclerView, int from, int to, int itemCount) {
        this.f3530O.mo4751h();
        this.f3530O.mo4750g();
    }

    /* renamed from: D */
    public RecyclerView.C0881p mo4698D() {
        if (this.f3547s == 0) {
            return new C0848b(-2, -1);
        }
        return new C0848b(-1, -2);
    }

    /* renamed from: E */
    public RecyclerView.C0881p mo4699E(Context c, AttributeSet attrs) {
        return new C0848b(c, attrs);
    }

    /* renamed from: F */
    public RecyclerView.C0881p mo4701F(ViewGroup.LayoutParams lp) {
        if (lp instanceof ViewGroup.MarginLayoutParams) {
            return new C0848b((ViewGroup.MarginLayoutParams) lp);
        }
        return new C0848b(lp);
    }

    /* renamed from: m */
    public boolean mo4734m(RecyclerView.C0881p lp) {
        return lp instanceof C0848b;
    }

    /* renamed from: f3 */
    public final void mo4731f3() {
        int totalSpace;
        if (mo4804p2() == 1) {
            totalSpace = (mo5207o0() - mo5188f0()) - mo5185e0();
        } else {
            totalSpace = (mo5170W() - mo5183d0()) - mo5190g0();
        }
        mo4709P2(totalSpace);
    }

    /* renamed from: C1 */
    public void mo4697C1(Rect childrenBounds, int wSpec, int hSpec) {
        int width;
        int usedHeight;
        if (this.f3526K == null) {
            super.mo4697C1(childrenBounds, wSpec, hSpec);
        }
        int horizontalPadding = mo5185e0() + mo5188f0();
        int verticalPadding = mo5190g0() + mo5183d0();
        if (this.f3547s == 1) {
            width = RecyclerView.C0876o.m4568n(hSpec, childrenBounds.height() + verticalPadding, mo5178b0());
            int[] iArr = this.f3526K;
            usedHeight = RecyclerView.C0876o.m4568n(wSpec, iArr[iArr.length - 1] + horizontalPadding, mo5181c0());
        } else {
            int width2 = RecyclerView.C0876o.m4568n(wSpec, childrenBounds.width() + horizontalPadding, mo5181c0());
            int[] iArr2 = this.f3526K;
            usedHeight = width2;
            width = RecyclerView.C0876o.m4568n(hSpec, iArr2[iArr2.length - 1] + verticalPadding, mo5178b0());
        }
        mo5137B1(usedHeight, width);
    }

    /* renamed from: P2 */
    public final void mo4709P2(int totalSpace) {
        this.f3526K = m4275Q2(this.f3526K, this.f3525J, totalSpace);
    }

    /* renamed from: Q2 */
    public static int[] m4275Q2(int[] cachedBorders, int spanCount, int totalSpace) {
        if (!(cachedBorders != null && cachedBorders.length == spanCount + 1 && cachedBorders[cachedBorders.length - 1] == totalSpace)) {
            cachedBorders = new int[(spanCount + 1)];
        }
        cachedBorders[0] = 0;
        int sizePerSpan = totalSpace / spanCount;
        int sizePerSpanRemainder = totalSpace % spanCount;
        int consumedPixels = 0;
        int additionalSize = 0;
        for (int i = 1; i <= spanCount; i++) {
            int itemSize = sizePerSpan;
            additionalSize += sizePerSpanRemainder;
            if (additionalSize > 0 && spanCount - additionalSize < sizePerSpanRemainder) {
                itemSize++;
                additionalSize -= spanCount;
            }
            consumedPixels += itemSize;
            cachedBorders[i] = consumedPixels;
        }
        return cachedBorders;
    }

    /* renamed from: W2 */
    public int mo4720W2(int startSpan, int spanSize) {
        if (this.f3547s != 1 || !mo4806q2()) {
            int[] iArr = this.f3526K;
            return iArr[startSpan + spanSize] - iArr[startSpan];
        }
        int[] iArr2 = this.f3526K;
        int i = this.f3525J;
        return iArr2[i - startSpan] - iArr2[(i - startSpan) - spanSize];
    }

    /* renamed from: u2 */
    public void mo4739u2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, LinearLayoutManager.C0850a anchorInfo, int itemDirection) {
        super.mo4739u2(recycler, state, anchorInfo, itemDirection);
        mo4731f3();
        if (state.mo5029b() > 0 && !state.mo5032e()) {
            mo4717U2(recycler, state, anchorInfo, itemDirection);
        }
        mo4718V2();
    }

    /* renamed from: V2 */
    public final void mo4718V2() {
        View[] viewArr = this.f3527L;
        if (viewArr == null || viewArr.length != this.f3525J) {
            this.f3527L = new View[this.f3525J];
        }
    }

    /* renamed from: w1 */
    public int mo4741w1(int dx, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        mo4731f3();
        mo4718V2();
        return super.mo4741w1(dx, recycler, state);
    }

    /* renamed from: y1 */
    public int mo4742y1(int dy, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        mo4731f3();
        mo4718V2();
        return super.mo4742y1(dy, recycler, state);
    }

    /* renamed from: U2 */
    public final void mo4717U2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, LinearLayoutManager.C0850a anchorInfo, int itemDirection) {
        boolean layingOutInPrimaryDirection = itemDirection == 1;
        int span = mo4725Z2(recycler, state, anchorInfo.f3556b);
        if (layingOutInPrimaryDirection) {
            while (span > 0) {
                int i = anchorInfo.f3556b;
                if (i > 0) {
                    int i2 = i - 1;
                    anchorInfo.f3556b = i2;
                    span = mo4725Z2(recycler, state, i2);
                } else {
                    return;
                }
            }
            return;
        }
        int indexLimit = state.mo5029b() - 1;
        int pos = anchorInfo.f3556b;
        int bestSpan = span;
        while (pos < indexLimit) {
            int next = mo4725Z2(recycler, state, pos + 1);
            if (next <= bestSpan) {
                break;
            }
            pos++;
            bestSpan = next;
        }
        anchorInfo.f3556b = pos;
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
            if (position >= 0 && position < itemCount && mo4725Z2(recycler, state, position) == 0) {
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

    /* renamed from: Y2 */
    public final int mo4724Y2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int viewPosition) {
        if (!state.mo5032e()) {
            return this.f3530O.mo4747b(viewPosition, this.f3525J);
        }
        int adapterPosition = recycler.mo5266f(viewPosition);
        if (adapterPosition != -1) {
            return this.f3530O.mo4747b(adapterPosition, this.f3525J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + viewPosition);
        return 0;
    }

    /* renamed from: Z2 */
    public final int mo4725Z2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int pos) {
        if (!state.mo5032e()) {
            return this.f3530O.mo4748c(pos, this.f3525J);
        }
        int cached = this.f3529N.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.mo5266f(pos);
        if (adapterPosition != -1) {
            return this.f3530O.mo4748c(adapterPosition, this.f3525J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 0;
    }

    /* renamed from: a3 */
    public final int mo4726a3(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int pos) {
        if (!state.mo5032e()) {
            return this.f3530O.mo4744f(pos);
        }
        int cached = this.f3528M.get(pos, -1);
        if (cached != -1) {
            return cached;
        }
        int adapterPosition = recycler.mo5266f(pos);
        if (adapterPosition != -1) {
            return this.f3530O.mo4744f(adapterPosition);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + pos);
        return 1;
    }

    /* renamed from: N1 */
    public void mo4705N1(RecyclerView.C0856a0 state, LinearLayoutManager.C0852c layoutState, RecyclerView.C0876o.C0879c layoutPrefetchRegistry) {
        int remainingSpan = this.f3525J;
        for (int count = 0; count < this.f3525J && layoutState.mo4826c(state) && remainingSpan > 0; count++) {
            int pos = layoutState.f3567d;
            layoutPrefetchRegistry.mo3307a(pos, Math.max(0, layoutState.f3570g));
            remainingSpan -= this.f3530O.mo4744f(pos);
            layoutState.f3567d += layoutState.f3568e;
        }
    }

    /* renamed from: s2 */
    public void mo4737s2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, LinearLayoutManager.C0852c layoutState, LinearLayoutManager.C0851b result) {
        int consumedSpanCount;
        int itemSpanIndex;
        int maxSize;
        int bottom;
        int right;
        int left;
        int top;
        int otherDirSpecMode;
        float maxSizeInOther;
        boolean flexibleInOtherDir;
        int hSpec;
        int wSpec;
        boolean z;
        View view;
        RecyclerView.C0888v vVar = recycler;
        RecyclerView.C0856a0 a0Var = state;
        LinearLayoutManager.C0852c cVar = layoutState;
        LinearLayoutManager.C0851b bVar = result;
        int otherDirSpecMode2 = this.f3549u.mo3354l();
        boolean flexibleInOtherDir2 = otherDirSpecMode2 != 1073741824;
        int currentOtherDirSize = mo5151J() > 0 ? this.f3526K[this.f3525J] : 0;
        if (flexibleInOtherDir2) {
            mo4731f3();
        }
        boolean layingOutInPrimaryDirection = cVar.f3568e == 1;
        int remainingSpan = this.f3525J;
        if (!layingOutInPrimaryDirection) {
            remainingSpan = mo4725Z2(vVar, a0Var, cVar.f3567d) + mo4726a3(vVar, a0Var, cVar.f3567d);
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        } else {
            itemSpanIndex = 0;
            consumedSpanCount = 0;
        }
        while (itemSpanIndex < this.f3525J && cVar.mo4826c(a0Var) && remainingSpan > 0) {
            int pos = cVar.f3567d;
            int spanSize = mo4726a3(vVar, a0Var, pos);
            if (spanSize <= this.f3525J) {
                remainingSpan -= spanSize;
                if (remainingSpan < 0 || (view = cVar.mo4827d(vVar)) == null) {
                    break;
                }
                consumedSpanCount += spanSize;
                this.f3527L[itemSpanIndex] = view;
                itemSpanIndex++;
            } else {
                throw new IllegalArgumentException("Item at position " + pos + " requires " + spanSize + " spans but GridLayoutManager has only " + this.f3525J + " spans.");
            }
        }
        int i = remainingSpan;
        if (itemSpanIndex == 0) {
            bVar.f3561b = true;
            return;
        }
        int maxSize2 = 0;
        mo4706N2(vVar, a0Var, itemSpanIndex, layingOutInPrimaryDirection);
        int i2 = 0;
        float maxSizeInOther2 = 0.0f;
        while (i2 < itemSpanIndex) {
            View view2 = this.f3527L[i2];
            if (cVar.f3575l != null) {
                z = false;
                if (layingOutInPrimaryDirection) {
                    mo5177b(view2);
                } else {
                    mo5180c(view2, 0);
                }
            } else if (layingOutInPrimaryDirection) {
                mo5182d(view2);
                z = false;
            } else {
                z = false;
                mo5184e(view2, 0);
            }
            mo5197j(view2, this.f3531P);
            mo4728c3(view2, otherDirSpecMode2, z);
            int size = this.f3549u.mo3347e(view2);
            if (size > maxSize2) {
                maxSize2 = size;
            }
            int maxSize3 = maxSize2;
            View view3 = view2;
            float otherSize = (((float) this.f3549u.mo3348f(view2)) * 1.0f) / ((float) ((C0848b) view2.getLayoutParams()).f3534f);
            if (otherSize > maxSizeInOther2) {
                maxSizeInOther2 = otherSize;
            }
            i2++;
            maxSize2 = maxSize3;
        }
        if (flexibleInOtherDir2) {
            mo4727b3(maxSizeInOther2, currentOtherDirSize);
            int maxSize4 = 0;
            for (int i3 = 0; i3 < itemSpanIndex; i3++) {
                View view4 = this.f3527L[i3];
                mo4728c3(view4, 1073741824, true);
                int size2 = this.f3549u.mo3347e(view4);
                if (size2 > maxSize4) {
                    maxSize4 = size2;
                }
            }
            maxSize = maxSize4;
        } else {
            maxSize = maxSize2;
        }
        int i4 = 0;
        while (i4 < itemSpanIndex) {
            View view5 = this.f3527L[i4];
            if (this.f3549u.mo3347e(view5) != maxSize) {
                C0848b lp = (C0848b) view5.getLayoutParams();
                Rect decorInsets = lp.f3664b;
                maxSizeInOther = maxSizeInOther2;
                int verticalInsets = decorInsets.top + decorInsets.bottom + lp.topMargin + lp.bottomMargin;
                int horizontalInsets = decorInsets.left + decorInsets.right + lp.leftMargin + lp.rightMargin;
                Rect rect = decorInsets;
                int totalSpaceInOther = mo4720W2(lp.f3533e, lp.f3534f);
                otherDirSpecMode = otherDirSpecMode2;
                if (this.f3547s == 1) {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = RecyclerView.C0876o.m4566K(totalSpaceInOther, 1073741824, horizontalInsets, lp.width, false);
                    hSpec = View.MeasureSpec.makeMeasureSpec(maxSize - verticalInsets, 1073741824);
                    C0848b bVar2 = lp;
                } else {
                    flexibleInOtherDir = flexibleInOtherDir2;
                    wSpec = View.MeasureSpec.makeMeasureSpec(maxSize - horizontalInsets, 1073741824);
                    C0848b bVar3 = lp;
                    hSpec = RecyclerView.C0876o.m4566K(totalSpaceInOther, 1073741824, verticalInsets, lp.height, false);
                }
                mo4729d3(view5, wSpec, hSpec, true);
            } else {
                maxSizeInOther = maxSizeInOther2;
                otherDirSpecMode = otherDirSpecMode2;
                flexibleInOtherDir = flexibleInOtherDir2;
            }
            i4++;
            RecyclerView.C0888v vVar2 = recycler;
            RecyclerView.C0856a0 a0Var2 = state;
            flexibleInOtherDir2 = flexibleInOtherDir;
            maxSizeInOther2 = maxSizeInOther;
            otherDirSpecMode2 = otherDirSpecMode;
        }
        int i5 = otherDirSpecMode2;
        boolean z2 = flexibleInOtherDir2;
        bVar.f3560a = maxSize;
        int left2 = 0;
        int right2 = 0;
        int top2 = 0;
        int bottom2 = 0;
        if (this.f3547s == 1) {
            if (cVar.f3569f == -1) {
                bottom2 = cVar.f3565b;
                top2 = bottom2 - maxSize;
            } else {
                top2 = cVar.f3565b;
                bottom2 = top2 + maxSize;
            }
        } else if (cVar.f3569f == -1) {
            right2 = cVar.f3565b;
            left2 = right2 - maxSize;
        } else {
            left2 = cVar.f3565b;
            right2 = left2 + maxSize;
        }
        int i6 = 0;
        while (i6 < itemSpanIndex) {
            View view6 = this.f3527L[i6];
            C0848b params = (C0848b) view6.getLayoutParams();
            if (this.f3547s != 1) {
                left = left2;
                right = right2;
                int top3 = mo5190g0() + this.f3526K[params.f3533e];
                top = top3;
                bottom = this.f3549u.mo3348f(view6) + top3;
            } else if (mo4806q2()) {
                int i7 = left2;
                int i8 = right2;
                int right3 = mo5185e0() + this.f3526K[this.f3525J - params.f3533e];
                left = right3 - this.f3549u.mo3348f(view6);
                top = top2;
                bottom = bottom2;
                right = right3;
            } else {
                int i9 = left2;
                int i10 = right2;
                int left3 = mo5185e0() + this.f3526K[params.f3533e];
                left = left3;
                right = this.f3549u.mo3348f(view6) + left3;
                top = top2;
                bottom = bottom2;
            }
            int count = itemSpanIndex;
            mo5228z0(view6, left, top, right, bottom);
            if (params.mo5232c() || params.mo5231b()) {
                bVar.f3562c = true;
            }
            bVar.f3563d |= view6.hasFocusable();
            i6++;
            top2 = top;
            left2 = left;
            right2 = right;
            bottom2 = bottom;
            itemSpanIndex = count;
        }
        int i11 = right2;
        Arrays.fill(this.f3527L, (Object) null);
    }

    /* renamed from: c3 */
    public final void mo4728c3(View view, int otherDirParentSpecMode, boolean alreadyMeasured) {
        int hSpec;
        int wSpec;
        C0848b lp = (C0848b) view.getLayoutParams();
        Rect decorInsets = lp.f3664b;
        int verticalInsets = decorInsets.top + decorInsets.bottom + lp.topMargin + lp.bottomMargin;
        int horizontalInsets = decorInsets.left + decorInsets.right + lp.leftMargin + lp.rightMargin;
        int availableSpaceInOther = mo4720W2(lp.f3533e, lp.f3534f);
        if (this.f3547s == 1) {
            wSpec = RecyclerView.C0876o.m4566K(availableSpaceInOther, otherDirParentSpecMode, horizontalInsets, lp.width, false);
            hSpec = RecyclerView.C0876o.m4566K(this.f3549u.mo3356n(), mo5171X(), verticalInsets, lp.height, true);
        } else {
            hSpec = RecyclerView.C0876o.m4566K(availableSpaceInOther, otherDirParentSpecMode, verticalInsets, lp.height, false);
            wSpec = RecyclerView.C0876o.m4566K(this.f3549u.mo3356n(), mo5209p0(), horizontalInsets, lp.width, true);
        }
        mo4729d3(view, wSpec, hSpec, alreadyMeasured);
    }

    /* renamed from: b3 */
    public final void mo4727b3(float maxSizeInOther, int currentOtherDirSize) {
        mo4709P2(Math.max(Math.round(((float) this.f3525J) * maxSizeInOther), currentOtherDirSize));
    }

    /* renamed from: d3 */
    public final void mo4729d3(View child, int widthSpec, int heightSpec, boolean alreadyMeasured) {
        boolean measure;
        RecyclerView.C0881p lp = (RecyclerView.C0881p) child.getLayoutParams();
        if (alreadyMeasured) {
            measure = mo5149H1(child, widthSpec, heightSpec, lp);
        } else {
            measure = mo5144F1(child, widthSpec, heightSpec, lp);
        }
        if (measure) {
            child.measure(widthSpec, heightSpec);
        }
    }

    /* renamed from: N2 */
    public final void mo4706N2(RecyclerView.C0888v recycler, RecyclerView.C0856a0 state, int count, boolean layingOutInPrimaryDirection) {
        int diff;
        int end;
        int start;
        if (layingOutInPrimaryDirection) {
            start = 0;
            end = count;
            diff = 1;
        } else {
            start = count - 1;
            end = -1;
            diff = -1;
        }
        int span = 0;
        for (int i = start; i != end; i += diff) {
            View view = this.f3527L[i];
            C0848b params = (C0848b) view.getLayoutParams();
            int a3 = mo4726a3(recycler, state, mo5193h0(view));
            params.f3534f = a3;
            params.f3533e = span;
            span += a3;
        }
    }

    /* renamed from: X2 */
    public int mo4722X2() {
        return this.f3525J;
    }

    /* renamed from: e3 */
    public void mo4730e3(int spanCount) {
        if (spanCount != this.f3525J) {
            this.f3524I = true;
            if (spanCount >= 1) {
                this.f3525J = spanCount;
                this.f3530O.mo4751h();
                mo5217t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + spanCount);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C0849c {

        /* renamed from: a */
        public final SparseIntArray f3535a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f3536b = new SparseIntArray();

        /* renamed from: c */
        public boolean f3537c = false;

        /* renamed from: d */
        public boolean f3538d = false;

        /* renamed from: e */
        public abstract int mo4743e(int i, int i2);

        /* renamed from: f */
        public abstract int mo4744f(int i);

        /* renamed from: h */
        public void mo4751h() {
            this.f3535a.clear();
        }

        /* renamed from: g */
        public void mo4750g() {
            this.f3536b.clear();
        }

        /* renamed from: c */
        public int mo4748c(int position, int spanCount) {
            if (!this.f3537c) {
                return mo4743e(position, spanCount);
            }
            int existing = this.f3535a.get(position, -1);
            if (existing != -1) {
                return existing;
            }
            int value = mo4743e(position, spanCount);
            this.f3535a.put(position, value);
            return value;
        }

        /* renamed from: b */
        public int mo4747b(int position, int spanCount) {
            if (!this.f3538d) {
                return mo4749d(position, spanCount);
            }
            int existing = this.f3536b.get(position, -1);
            if (existing != -1) {
                return existing;
            }
            int value = mo4749d(position, spanCount);
            this.f3536b.put(position, value);
            return value;
        }

        /* renamed from: a */
        public static int m4326a(SparseIntArray cache, int position) {
            int lo = 0;
            int hi = cache.size() - 1;
            while (lo <= hi) {
                int mid = (lo + hi) >>> 1;
                if (cache.keyAt(mid) < position) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            int index = lo - 1;
            if (index < 0 || index >= cache.size()) {
                return -1;
            }
            return cache.keyAt(index);
        }

        /* renamed from: d */
        public int mo4749d(int adapterPosition, int spanCount) {
            int span;
            int prevKey;
            int span2 = 0;
            int group = 0;
            int start = 0;
            if (this.f3538d && (prevKey = m4326a(this.f3536b, adapterPosition)) != -1) {
                group = this.f3536b.get(prevKey);
                start = prevKey + 1;
                span2 = mo4748c(prevKey, spanCount) + mo4744f(prevKey);
                if (span2 == spanCount) {
                    span2 = 0;
                    group++;
                }
            }
            int positionSpanSize = mo4744f(adapterPosition);
            for (int i = start; i < adapterPosition; i++) {
                int size = mo4744f(i);
                span += size;
                if (span == spanCount) {
                    span = 0;
                    group++;
                } else if (span > spanCount) {
                    span = size;
                    group++;
                }
            }
            if (span + positionSpanSize > spanCount) {
                return group + 1;
            }
            return group;
        }
    }

    /* renamed from: J0 */
    public View mo4702J0(View focused, int focusDirection, RecyclerView.C0888v recycler, RecyclerView.C0856a0 state) {
        int limit;
        int inc;
        int start;
        int focusableSpanGroupIndex;
        View prevFocusedChild;
        int focusableWeakCandidateSpanIndex;
        int focusableWeakCandidateOverlap;
        int overlap;
        RecyclerView.C0888v vVar = recycler;
        RecyclerView.C0856a0 a0Var = state;
        View prevFocusedChild2 = mo5135B(focused);
        if (prevFocusedChild2 == null) {
            return null;
        }
        C0848b lp = (C0848b) prevFocusedChild2.getLayoutParams();
        int prevSpanStart = lp.f3533e;
        int prevSpanEnd = lp.f3533e + lp.f3534f;
        View view = super.mo4702J0(focused, focusDirection, recycler, state);
        if (view == null) {
            return null;
        }
        int layoutDir = mo4773R1(focusDirection);
        int ascend = (layoutDir == 1) != this.f3552x;
        if (ascend != 0) {
            start = mo5151J() - 1;
            inc = -1;
            limit = -1;
        } else {
            start = 0;
            inc = 1;
            limit = mo5151J();
        }
        boolean preferLastSpan = this.f3547s == 1 && mo4806q2();
        View focusableWeakCandidate = null;
        View unfocusableWeakCandidate = null;
        int focusableSpanGroupIndex2 = mo4724Y2(vVar, a0Var, start);
        int focusableWeakCandidateSpanIndex2 = -1;
        C0848b bVar = lp;
        int focusableWeakCandidateSpanIndex3 = 0;
        View view2 = view;
        int unfocusableWeakCandidateSpanIndex = -1;
        int unfocusableWeakCandidateSpanIndex2 = layoutDir;
        int unfocusableWeakCandidateOverlap = 0;
        int unfocusableWeakCandidateOverlap2 = ascend;
        int i = start;
        while (true) {
            if (i == limit) {
                int i2 = focusableWeakCandidateSpanIndex2;
                int i3 = focusableWeakCandidateSpanIndex3;
                int i4 = focusableSpanGroupIndex2;
                int i5 = start;
                break;
            }
            int start2 = start;
            int spanGroupIndex = mo4724Y2(vVar, a0Var, i);
            View candidate = mo5150I(i);
            if (candidate == prevFocusedChild2) {
                View view3 = prevFocusedChild2;
                int i6 = focusableWeakCandidateSpanIndex2;
                int i7 = focusableWeakCandidateSpanIndex3;
                int i8 = focusableSpanGroupIndex2;
                break;
            }
            if (!candidate.hasFocusable() || spanGroupIndex == focusableSpanGroupIndex2) {
                C0848b candidateLp = (C0848b) candidate.getLayoutParams();
                prevFocusedChild = prevFocusedChild2;
                int candidateStart = candidateLp.f3533e;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
                int i9 = spanGroupIndex;
                int candidateEnd = candidateLp.f3533e + candidateLp.f3534f;
                if (candidate.hasFocusable() && candidateStart == prevSpanStart && candidateEnd == prevSpanEnd) {
                    return candidate;
                }
                if ((!candidate.hasFocusable() || focusableWeakCandidate != null) && (candidate.hasFocusable() || unfocusableWeakCandidate != null)) {
                    int overlap2 = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                    if (!candidate.hasFocusable()) {
                        focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        if (focusableWeakCandidate == null) {
                            focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                            boolean z = false;
                            if (mo5226y0(candidate, false, true)) {
                                if (overlap2 > unfocusableWeakCandidateOverlap) {
                                    overlap = 1;
                                } else if (overlap2 == unfocusableWeakCandidateOverlap) {
                                    if (candidateStart > unfocusableWeakCandidateSpanIndex) {
                                        z = true;
                                    }
                                    if (preferLastSpan == z) {
                                        overlap = 1;
                                    }
                                }
                            }
                        } else {
                            focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                        }
                    } else if (overlap2 > focusableWeakCandidateSpanIndex3) {
                        focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                        overlap = 1;
                    } else {
                        if (overlap2 == focusableWeakCandidateSpanIndex3) {
                            focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                            if (preferLastSpan == (candidateStart > focusableWeakCandidateSpanIndex2)) {
                                overlap = 1;
                                focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                            }
                        } else {
                            focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                        }
                        focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                    }
                    overlap = 0;
                } else {
                    overlap = 1;
                    focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                    focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                }
                if (overlap != 0) {
                    if (candidate.hasFocusable()) {
                        focusableWeakCandidate = candidate;
                        focusableWeakCandidateSpanIndex2 = candidateLp.f3533e;
                        focusableWeakCandidateSpanIndex3 = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                    } else {
                        int unfocusableWeakCandidateSpanIndex3 = candidateLp.f3533e;
                        unfocusableWeakCandidate = candidate;
                        unfocusableWeakCandidateOverlap = Math.min(candidateEnd, prevSpanEnd) - Math.max(candidateStart, prevSpanStart);
                        focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex;
                        unfocusableWeakCandidateSpanIndex = unfocusableWeakCandidateSpanIndex3;
                        focusableWeakCandidateSpanIndex3 = focusableWeakCandidateOverlap;
                    }
                    i += inc;
                    vVar = recycler;
                    a0Var = state;
                    start = start2;
                    prevFocusedChild2 = prevFocusedChild;
                    focusableSpanGroupIndex2 = focusableSpanGroupIndex;
                }
            } else if (focusableWeakCandidate != null) {
                View view4 = prevFocusedChild2;
                int i10 = focusableWeakCandidateSpanIndex2;
                int i11 = focusableWeakCandidateSpanIndex3;
                int i12 = focusableSpanGroupIndex2;
                break;
            } else {
                prevFocusedChild = prevFocusedChild2;
                focusableWeakCandidateSpanIndex = focusableWeakCandidateSpanIndex2;
                focusableWeakCandidateOverlap = focusableWeakCandidateSpanIndex3;
                focusableSpanGroupIndex = focusableSpanGroupIndex2;
            }
            focusableWeakCandidateSpanIndex3 = focusableWeakCandidateOverlap;
            focusableWeakCandidateSpanIndex2 = focusableWeakCandidateSpanIndex;
            i += inc;
            vVar = recycler;
            a0Var = state;
            start = start2;
            prevFocusedChild2 = prevFocusedChild;
            focusableSpanGroupIndex2 = focusableSpanGroupIndex;
        }
        return focusableWeakCandidate != null ? focusableWeakCandidate : unfocusableWeakCandidate;
    }

    /* renamed from: L1 */
    public boolean mo4703L1() {
        return this.f3542D == null && !this.f3524I;
    }

    /* renamed from: s */
    public int mo4736s(RecyclerView.C0856a0 state) {
        if (this.f3532Q) {
            return mo4715T2(state);
        }
        return super.mo4736s(state);
    }

    /* renamed from: v */
    public int mo4740v(RecyclerView.C0856a0 state) {
        if (this.f3532Q) {
            return mo4715T2(state);
        }
        return super.mo4740v(state);
    }

    /* renamed from: r */
    public int mo4735r(RecyclerView.C0856a0 state) {
        if (this.f3532Q) {
            return mo4713S2(state);
        }
        return super.mo4735r(state);
    }

    /* renamed from: u */
    public int mo4738u(RecyclerView.C0856a0 state) {
        if (this.f3532Q) {
            return mo4713S2(state);
        }
        return super.mo4738u(state);
    }

    /* renamed from: T2 */
    public final int mo4715T2(RecyclerView.C0856a0 state) {
        if (mo5151J() == 0 || state.mo5029b() == 0) {
            return 0;
        }
        mo4775T1();
        View startChild = mo4780Y1(!mo4807r2(), true);
        View endChild = mo4779X1(!mo4807r2(), true);
        if (startChild == null || endChild == null) {
            return 0;
        }
        if (!mo4807r2()) {
            return this.f3530O.mo4747b(state.mo5029b() - 1, this.f3525J) + 1;
        }
        int laidOutArea = this.f3549u.mo3346d(endChild) - this.f3549u.mo3349g(startChild);
        int firstVisibleSpan = this.f3530O.mo4747b(mo5193h0(startChild), this.f3525J);
        return (int) ((((float) laidOutArea) / ((float) ((this.f3530O.mo4747b(mo5193h0(endChild), this.f3525J) - firstVisibleSpan) + 1))) * ((float) (this.f3530O.mo4747b(state.mo5029b() - 1, this.f3525J) + 1)));
    }

    /* renamed from: S2 */
    public final int mo4713S2(RecyclerView.C0856a0 state) {
        int spansBefore;
        if (mo5151J() == 0 || state.mo5029b() == 0) {
            return 0;
        }
        mo4775T1();
        boolean smoothScrollEnabled = mo4807r2();
        View startChild = mo4780Y1(!smoothScrollEnabled, true);
        View endChild = mo4779X1(!smoothScrollEnabled, true);
        if (startChild == null) {
        } else if (endChild == null) {
            boolean z = smoothScrollEnabled;
        } else {
            int startChildSpan = this.f3530O.mo4747b(mo5193h0(startChild), this.f3525J);
            int endChildSpan = this.f3530O.mo4747b(mo5193h0(endChild), this.f3525J);
            int minSpan = Math.min(startChildSpan, endChildSpan);
            int maxSpan = Math.max(startChildSpan, endChildSpan);
            int totalSpans = this.f3530O.mo4747b(state.mo5029b() - 1, this.f3525J) + 1;
            if (this.f3552x) {
                spansBefore = Math.max(0, (totalSpans - maxSpan) - 1);
            } else {
                spansBefore = Math.max(0, minSpan);
            }
            if (!smoothScrollEnabled) {
                return spansBefore;
            }
            boolean z2 = smoothScrollEnabled;
            int i = spansBefore;
            return Math.round((((float) spansBefore) * (((float) Math.abs(this.f3549u.mo3346d(endChild) - this.f3549u.mo3349g(startChild))) / ((float) ((this.f3530O.mo4747b(mo5193h0(endChild), this.f3525J) - this.f3530O.mo4747b(mo5193h0(startChild), this.f3525J)) + 1)))) + ((float) (this.f3549u.mo3355m() - this.f3549u.mo3349g(startChild))));
        }
        return 0;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0847a extends C0849c {
        /* renamed from: f */
        public int mo4744f(int position) {
            return 1;
        }

        /* renamed from: e */
        public int mo4743e(int position, int spanCount) {
            return position % spanCount;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0848b extends RecyclerView.C0881p {

        /* renamed from: e */
        public int f3533e = -1;

        /* renamed from: f */
        public int f3534f = 0;

        public C0848b(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0848b(int width, int height) {
            super(width, height);
        }

        public C0848b(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public C0848b(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: e */
        public int mo4745e() {
            return this.f3533e;
        }

        /* renamed from: f */
        public int mo4746f() {
            return this.f3534f;
        }
    }
}
