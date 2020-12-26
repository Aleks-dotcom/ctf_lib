package p066b.p067a.p068a.p069a.p082m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p025h.p038m.C0460r;

/* renamed from: b.a.a.a.m.a */
public abstract class C1034a<V extends View> extends C1037c<V> {

    /* renamed from: d */
    public Runnable f4335d;

    /* renamed from: e */
    public OverScroller f4336e;

    /* renamed from: f */
    public boolean f4337f;

    /* renamed from: g */
    public int f4338g = -1;

    /* renamed from: h */
    public int f4339h;

    /* renamed from: i */
    public int f4340i = -1;

    /* renamed from: j */
    public VelocityTracker f4341j;

    /* renamed from: H */
    public abstract boolean mo5878H(V v);

    /* renamed from: K */
    public abstract int mo5881K(V v);

    /* renamed from: L */
    public abstract int mo5882L(V v);

    /* renamed from: M */
    public abstract int mo5883M();

    /* renamed from: N */
    public abstract void mo5884N(CoordinatorLayout coordinatorLayout, V v);

    /* renamed from: Q */
    public abstract int mo5887Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    public C1034a() {
    }

    public C1034a(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 != 3) goto L_0x0083;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4424k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f4340i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f4340i = r0
        L_0x0012:
            int r0 = r10.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r3 = r7.f4337f
            if (r3 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r3 = r10.getActionMasked()
            r4 = 0
            if (r3 == 0) goto L_0x0060
            r5 = -1
            if (r3 == r2) goto L_0x0051
            if (r3 == r1) goto L_0x002f
            r1 = 3
            if (r3 == r1) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r1 = r7.f4338g
            if (r1 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r3 = r10.findPointerIndex(r1)
            if (r3 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r4 = r10.getY(r3)
            int r4 = (int) r4
            int r5 = r7.f4339h
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r7.f4340i
            if (r5 <= r6) goto L_0x0083
            r7.f4337f = r2
            r7.f4339h = r4
            goto L_0x0083
        L_0x0051:
            r7.f4337f = r4
            r7.f4338g = r5
            android.view.VelocityTracker r1 = r7.f4341j
            if (r1 == 0) goto L_0x0083
            r1.recycle()
            r1 = 0
            r7.f4341j = r1
            goto L_0x0083
        L_0x0060:
            r7.f4337f = r4
            float r1 = r10.getX()
            int r1 = (int) r1
            float r2 = r10.getY()
            int r2 = (int) r2
            boolean r3 = r7.mo5878H(r9)
            if (r3 == 0) goto L_0x0083
            boolean r3 = r8.mo4343B(r9, r1, r2)
            if (r3 == 0) goto L_0x0083
            r7.f4339h = r2
            int r3 = r10.getPointerId(r4)
            r7.f4338g = r3
            r7.mo5879I()
        L_0x0083:
            android.view.VelocityTracker r1 = r7.f4341j
            if (r1 == 0) goto L_0x008a
            r1.addMovement(r10)
        L_0x008a:
            boolean r1 = r7.f4337f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p082m.C1034a.mo4424k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4413D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f4340i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f4340i = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008e
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r4 = 3
            if (r0 == r4) goto L_0x007f
            goto L_0x00af
        L_0x0025:
            int r0 = r11.f4338g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r2 = r14.getY(r0)
            int r2 = (int) r2
            int r3 = r11.f4339h
            int r3 = r3 - r2
            boolean r4 = r11.f4337f
            if (r4 != 0) goto L_0x0049
            int r4 = java.lang.Math.abs(r3)
            int r5 = r11.f4340i
            if (r4 <= r5) goto L_0x0049
            r11.f4337f = r1
            if (r3 <= 0) goto L_0x0048
            int r3 = r3 - r5
            goto L_0x0049
        L_0x0048:
            int r3 = r3 + r5
        L_0x0049:
            boolean r4 = r11.f4337f
            if (r4 == 0) goto L_0x00af
            r11.f4339h = r2
            int r8 = r11.mo5881K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r3
            r4.mo5885O(r5, r6, r7, r8, r9)
            goto L_0x00af
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f4341j
            if (r0 == 0) goto L_0x007f
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f4341j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f4341j
            int r4 = r11.f4338g
            float r0 = r0.getYVelocity(r4)
            int r4 = r11.mo5882L(r13)
            int r8 = -r4
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r10 = r0
            r5.mo5880J(r6, r7, r8, r9, r10)
        L_0x007f:
            r11.f4337f = r2
            r11.f4338g = r3
            android.view.VelocityTracker r0 = r11.f4341j
            if (r0 == 0) goto L_0x00af
            r0.recycle()
            r0 = 0
            r11.f4341j = r0
            goto L_0x00af
        L_0x008e:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r4 = r12.mo4343B(r13, r0, r3)
            if (r4 == 0) goto L_0x00b7
            boolean r4 = r11.mo5878H(r13)
            if (r4 == 0) goto L_0x00b7
            r11.f4339h = r3
            int r2 = r14.getPointerId(r2)
            r11.f4338g = r2
            r11.mo5879I()
        L_0x00af:
            android.view.VelocityTracker r0 = r11.f4341j
            if (r0 == 0) goto L_0x00b6
            r0.addMovement(r14)
        L_0x00b6:
            return r1
        L_0x00b7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p082m.C1034a.mo4413D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public int mo5886P(CoordinatorLayout parent, V header, int newOffset) {
        return mo5887Q(parent, header, newOffset, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* renamed from: O */
    public final int mo5885O(CoordinatorLayout coordinatorLayout, V header, int dy, int minOffset, int maxOffset) {
        return mo5887Q(coordinatorLayout, header, mo5883M() - dy, minOffset, maxOffset);
    }

    /* renamed from: J */
    public final boolean mo5880J(CoordinatorLayout coordinatorLayout, V layout, int minOffset, int maxOffset, float velocityY) {
        V v = layout;
        Runnable runnable = this.f4335d;
        if (runnable != null) {
            layout.removeCallbacks(runnable);
            this.f4335d = null;
        }
        if (this.f4336e == null) {
            this.f4336e = new OverScroller(layout.getContext());
        }
        this.f4336e.fling(0, mo5898E(), 0, Math.round(velocityY), 0, 0, minOffset, maxOffset);
        if (this.f4336e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C1035a aVar = new C1035a(coordinatorLayout, layout);
            this.f4335d = aVar;
            C0460r.m2247V(layout, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo5884N(coordinatorLayout, layout);
        return false;
    }

    /* renamed from: I */
    public final void mo5879I() {
        if (this.f4341j == null) {
            this.f4341j = VelocityTracker.obtain();
        }
    }

    /* renamed from: b.a.a.a.m.a$a */
    public class C1035a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f4342b;

        /* renamed from: c */
        public final View f4343c;

        public C1035a(CoordinatorLayout parent, V layout) {
            this.f4342b = parent;
            this.f4343c = layout;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f4343c != null && (overScroller = C1034a.this.f4336e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C1034a aVar = C1034a.this;
                    aVar.mo5886P(this.f4342b, this.f4343c, aVar.f4336e.getCurrY());
                    C0460r.m2247V(this.f4343c, this);
                    return;
                }
                C1034a.this.mo5884N(this.f4342b, this.f4343c);
            }
        }
    }
}
