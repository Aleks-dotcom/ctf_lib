package p066b.p067a.p068a.p069a.p082m;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.p025h.p033h.C0379a;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0479z;

/* renamed from: b.a.a.a.m.b */
public abstract class C1036b extends C1037c<View> {

    /* renamed from: d */
    public final Rect f4345d = new Rect();

    /* renamed from: e */
    public final Rect f4346e = new Rect();

    /* renamed from: f */
    public int f4347f = 0;

    /* renamed from: g */
    public int f4348g;

    /* renamed from: H */
    public abstract View mo5890H(List<View> list);

    /* renamed from: J */
    public abstract float mo5892J(View view);

    public C1036b() {
    }

    public C1036b(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: m */
    public boolean mo4426m(CoordinatorLayout parent, View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        C0479z parentInsets;
        int childLpHeight = child.getLayoutParams().height;
        if (childLpHeight == -1 || childLpHeight == -2) {
            View header = mo5890H(parent.mo4391r(child));
            if (header != null) {
                int availableHeight = View.MeasureSpec.getSize(parentHeightMeasureSpec);
                if (availableHeight <= 0) {
                    availableHeight = parent.getHeight();
                } else if (C0460r.m2288s(header) && (parentInsets = parent.getLastWindowInsets()) != null) {
                    availableHeight += parentInsets.mo2615d() + parentInsets.mo2612a();
                }
                int height = mo5894L(header) + availableHeight;
                int headerHeight = header.getMeasuredHeight();
                if (mo5897P()) {
                    child.setTranslationY((float) (-headerHeight));
                } else {
                    View view = child;
                    height -= headerHeight;
                }
                parent.mo4351J(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(height, childLpHeight == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), heightUsed);
                return true;
            }
            View view2 = child;
            return false;
        }
        View view3 = child;
        return false;
    }

    /* renamed from: F */
    public void mo5889F(CoordinatorLayout parent, View child, int layoutDirection) {
        View header = mo5890H(parent.mo4391r(child));
        if (header != null) {
            CoordinatorLayout.C0827f lp = (CoordinatorLayout.C0827f) child.getLayoutParams();
            Rect available = this.f4345d;
            available.set(parent.getPaddingLeft() + lp.leftMargin, header.getBottom() + lp.topMargin, (parent.getWidth() - parent.getPaddingRight()) - lp.rightMargin, ((parent.getHeight() + header.getBottom()) - parent.getPaddingBottom()) - lp.bottomMargin);
            C0479z parentInsets = parent.getLastWindowInsets();
            if (parentInsets != null && C0460r.m2288s(parent) && !C0460r.m2288s(child)) {
                available.left += parentInsets.mo2613b();
                available.right -= parentInsets.mo2614c();
            }
            Rect out = this.f4346e;
            C0444c.m2173a(m5462N(lp.f3366c), child.getMeasuredWidth(), child.getMeasuredHeight(), available, out, layoutDirection);
            int overlap = mo5891I(header);
            child.layout(out.left, out.top - overlap, out.right, out.bottom - overlap);
            this.f4347f = out.top - header.getBottom();
            return;
        }
        super.mo5889F(parent, child, layoutDirection);
        this.f4347f = 0;
    }

    /* renamed from: P */
    public boolean mo5897P() {
        return false;
    }

    /* renamed from: I */
    public final int mo5891I(View header) {
        if (this.f4348g == 0) {
            return 0;
        }
        float J = mo5892J(header);
        int i = this.f4348g;
        return C0379a.m1963b((int) (J * ((float) i)), 0, i);
    }

    /* renamed from: N */
    public static int m5462N(int gravity) {
        if (gravity == 0) {
            return 8388659;
        }
        return gravity;
    }

    /* renamed from: L */
    public int mo5894L(View v) {
        return v.getMeasuredHeight();
    }

    /* renamed from: M */
    public final int mo5895M() {
        return this.f4347f;
    }

    /* renamed from: O */
    public final void mo5896O(int overlayTop) {
        this.f4348g = overlayTop;
    }

    /* renamed from: K */
    public final int mo5893K() {
        return this.f4348g;
    }
}
