package p000a.p002b.p011p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000a.p002b.C0003a;
import p000a.p002b.p006m.p007a.C0067c;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0472v;
import p000a.p025h.p040n.C0487f;

/* renamed from: a.b.p.f0 */
public class C0147f0 extends ListView {

    /* renamed from: b */
    public final Rect f837b = new Rect();

    /* renamed from: c */
    public int f838c = 0;

    /* renamed from: d */
    public int f839d = 0;

    /* renamed from: e */
    public int f840e = 0;

    /* renamed from: f */
    public int f841f = 0;

    /* renamed from: g */
    public int f842g;

    /* renamed from: h */
    public Field f843h;

    /* renamed from: i */
    public C0148a f844i;

    /* renamed from: j */
    public boolean f845j;

    /* renamed from: k */
    public boolean f846k;

    /* renamed from: l */
    public boolean f847l;

    /* renamed from: m */
    public C0472v f848m;

    /* renamed from: n */
    public C0487f f849n;

    /* renamed from: o */
    public C0149b f850o;

    public C0147f0(Context context, boolean hijackFocus) {
        super(context, (AttributeSet) null, C0003a.dropDownListViewStyle);
        this.f846k = hijackFocus;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f843h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f846k && this.f845j) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f846k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f846k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f846k || super.hasFocus();
    }

    public void setSelector(Drawable sel) {
        C0148a aVar = sel != null ? new C0148a(sel) : null;
        this.f844i = aVar;
        super.setSelector(aVar);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f838c = padding.left;
        this.f839d = padding.top;
        this.f840e = padding.right;
        this.f841f = padding.bottom;
    }

    public void drawableStateChanged() {
        if (this.f850o == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            mo1068k();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        mo1054c(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f842g = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        C0149b bVar = this.f850o;
        if (bVar != null) {
            bVar.mo1075a();
        }
        return super.onTouchEvent(ev);
    }

    /* renamed from: d */
    public int mo1055d(int widthMeasureSpec, int startPosition, int endPosition, int maxHeight, int disallowPartialChildPosition) {
        ViewGroup.LayoutParams childLp;
        int heightMeasureSpec;
        int i = maxHeight;
        int i2 = disallowPartialChildPosition;
        int paddingTop = getListPaddingTop();
        int paddingBottom = getListPaddingBottom();
        int listPaddingLeft = getListPaddingLeft();
        int listPaddingRight = getListPaddingRight();
        int reportedDividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return paddingTop + paddingBottom;
        }
        int returnedHeight = paddingTop + paddingBottom;
        int dividerHeight = (reportedDividerHeight <= 0 || divider == null) ? 0 : reportedDividerHeight;
        int prevHeightWithoutPartialChild = 0;
        View child = null;
        int viewType = 0;
        int count = adapter.getCount();
        int i3 = 0;
        while (i3 < count) {
            int paddingTop2 = paddingTop;
            int newType = adapter.getItemViewType(i3);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            int i4 = newType;
            child = adapter.getView(i3, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 == null) {
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            } else {
                childLp = childLp2;
            }
            int paddingBottom2 = paddingBottom;
            int paddingBottom3 = childLp.height;
            if (paddingBottom3 > 0) {
                ViewGroup.LayoutParams layoutParams = childLp;
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingBottom3, 1073741824);
            } else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i3 > 0) {
                returnedHeight += dividerHeight;
            }
            returnedHeight += child.getMeasuredHeight();
            if (returnedHeight >= i) {
                return (i2 < 0 || i3 <= i2 || prevHeightWithoutPartialChild <= 0 || returnedHeight == i) ? i : prevHeightWithoutPartialChild;
            }
            if (i2 >= 0 && i3 >= i2) {
                prevHeightWithoutPartialChild = returnedHeight;
            }
            i3++;
            paddingTop = paddingTop2;
            paddingBottom = paddingBottom2;
        }
        return returnedHeight;
    }

    private void setSelectorEnabled(boolean enabled) {
        C0148a aVar = this.f844i;
        if (aVar != null) {
            aVar.mo1074c(enabled);
        }
    }

    /* renamed from: a.b.p.f0$a */
    public static class C0148a extends C0067c {

        /* renamed from: c */
        public boolean f851c = true;

        public C0148a(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: c */
        public void mo1074c(boolean enabled) {
            this.f851c = enabled;
        }

        public boolean setState(int[] stateSet) {
            if (this.f851c) {
                return super.setState(stateSet);
            }
            return false;
        }

        public void draw(Canvas canvas) {
            if (this.f851c) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float x, float y) {
            if (this.f851c) {
                super.setHotspot(x, y);
            }
        }

        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f851c) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f851c) {
                return super.setVisible(visible, restart);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.f850o == null) {
            C0149b bVar = new C0149b();
            this.f850o = bVar;
            bVar.mo1076b();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                mo1068k();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    public void onDetachedFromWindow() {
        this.f850o = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1058e(android.view.MotionEvent r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            int r2 = r12.getActionMasked()
            r3 = 1
            if (r2 == r3) goto L_0x0012
            r4 = 2
            if (r2 == r4) goto L_0x0013
            r4 = 3
            if (r2 == r4) goto L_0x0010
            goto L_0x0043
        L_0x0010:
            r0 = 0
            goto L_0x0043
        L_0x0012:
            r0 = 0
        L_0x0013:
            int r4 = r12.findPointerIndex(r13)
            if (r4 >= 0) goto L_0x001b
            r0 = 0
            goto L_0x0043
        L_0x001b:
            float r5 = r12.getX(r4)
            int r5 = (int) r5
            float r6 = r12.getY(r4)
            int r6 = (int) r6
            int r7 = r11.pointToPosition(r5, r6)
            r8 = -1
            if (r7 != r8) goto L_0x002e
            r1 = 1
            goto L_0x0043
        L_0x002e:
            int r8 = r11.getFirstVisiblePosition()
            int r8 = r7 - r8
            android.view.View r8 = r11.getChildAt(r8)
            float r9 = (float) r5
            float r10 = (float) r6
            r11.mo1064i(r8, r7, r9, r10)
            r0 = 1
            if (r2 != r3) goto L_0x0043
            r11.mo1053b(r8, r7)
        L_0x0043:
            if (r0 == 0) goto L_0x0047
            if (r1 == 0) goto L_0x004a
        L_0x0047:
            r11.mo1052a()
        L_0x004a:
            if (r0 == 0) goto L_0x0062
            a.h.n.f r4 = r11.f849n
            if (r4 != 0) goto L_0x0057
            a.h.n.f r4 = new a.h.n.f
            r4.<init>(r11)
            r11.f849n = r4
        L_0x0057:
            a.h.n.f r4 = r11.f849n
            r4.mo2630m(r3)
            a.h.n.f r3 = r11.f849n
            r3.onTouch(r11, r12)
            goto L_0x006a
        L_0x0062:
            a.h.n.f r3 = r11.f849n
            if (r3 == 0) goto L_0x006a
            r4 = 0
            r3.mo2630m(r4)
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0147f0.mo1058e(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: b */
    public final void mo1053b(View child, int position) {
        performItemClick(child, position, getItemIdAtPosition(position));
    }

    public void setListSelectionHidden(boolean hideListSelection) {
        this.f845j = hideListSelection;
    }

    /* renamed from: k */
    public final void mo1068k() {
        Drawable selector = getSelector();
        if (selector != null && mo1067j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: c */
    public final void mo1054c(Canvas canvas) {
        Drawable selector;
        if (!this.f837b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f837b);
            selector.draw(canvas);
        }
    }

    /* renamed from: h */
    public final void mo1061h(int position, View sel, float x, float y) {
        mo1060g(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            C0370a.m1941k(selector, x, y);
        }
    }

    /* renamed from: g */
    public final void mo1060g(int position, View sel) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        mo1059f(position, sel);
        if (manageState) {
            Rect bounds = this.f837b;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0370a.m1941k(selector, x, y);
        }
    }

    /* renamed from: f */
    public final void mo1059f(int position, View sel) {
        Rect selectorRect = this.f837b;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f838c;
        selectorRect.top -= this.f839d;
        selectorRect.right += this.f840e;
        selectorRect.bottom += this.f841f;
        try {
            boolean isChildViewEnabled = this.f843h.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.f843h.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo1052a() {
        this.f847l = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f842g - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        C0472v vVar = this.f848m;
        if (vVar != null) {
            vVar.mo2598b();
            this.f848m = null;
        }
    }

    /* renamed from: i */
    public final void mo1064i(View child, int position, float x, float y) {
        View motionView;
        this.f847l = true;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            drawableHotspotChanged(x, y);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f842g;
        if (!(i2 == -1 || (motionView = getChildAt(i2 - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f842g = position;
        float childX = x - ((float) child.getLeft());
        float childY = y - ((float) child.getTop());
        if (i >= 21) {
            child.drawableHotspotChanged(childX, childY);
        }
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        mo1061h(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    public final boolean mo1067j() {
        return this.f847l;
    }

    /* renamed from: a.b.p.f0$b */
    public class C0149b implements Runnable {
        public C0149b() {
        }

        public void run() {
            C0147f0 f0Var = C0147f0.this;
            f0Var.f850o = null;
            f0Var.drawableStateChanged();
        }

        /* renamed from: a */
        public void mo1075a() {
            C0147f0 f0Var = C0147f0.this;
            f0Var.f850o = null;
            f0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo1076b() {
            C0147f0.this.post(this);
        }
    }
}
