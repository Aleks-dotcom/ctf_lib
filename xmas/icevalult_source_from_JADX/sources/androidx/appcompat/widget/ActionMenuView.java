package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p011p.C0131c;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0158i0;

public class ActionMenuView extends C0158i0 implements C0098g.C0100b, C0115n {

    /* renamed from: A */
    public int f3092A;

    /* renamed from: B */
    public C0791e f3093B;

    /* renamed from: q */
    public C0098g f3094q;

    /* renamed from: r */
    public Context f3095r;

    /* renamed from: s */
    public int f3096s;

    /* renamed from: t */
    public boolean f3097t;

    /* renamed from: u */
    public C0131c f3098u;

    /* renamed from: v */
    public C0113m.C0114a f3099v;

    /* renamed from: w */
    public C0098g.C0099a f3100w;

    /* renamed from: x */
    public boolean f3101x;

    /* renamed from: y */
    public int f3102y;

    /* renamed from: z */
    public int f3103z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0787a {
        /* renamed from: a */
        boolean mo964a();

        /* renamed from: b */
        boolean mo965b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0791e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.f3103z = (int) (56.0f * density);
        this.f3092A = (int) (4.0f * density);
        this.f3095r = context;
        this.f3096s = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.f3096s != resId) {
            this.f3096s = resId;
            if (resId == 0) {
                this.f3095r = getContext();
            } else {
                this.f3095r = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f3096s;
    }

    public void setPresenter(C0131c presenter) {
        this.f3098u = presenter;
        presenter.mo955G(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        C0131c cVar = this.f3098u;
        if (cVar != null) {
            cVar.mo551h(false);
            if (this.f3098u.mo952D()) {
                this.f3098u.mo949A();
                this.f3098u.mo958J();
            }
        }
    }

    public void setOnMenuItemClickListener(C0791e listener) {
        this.f3093B = listener;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        C0098g gVar;
        boolean wasFormatted = this.f3101x;
        boolean z = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        this.f3101x = z;
        if (wasFormatted != z) {
            this.f3102y = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.f3101x || (gVar = this.f3094q) == null || widthSize == this.f3102y)) {
            this.f3102y = widthSize;
            gVar.mo624K(true);
        }
        int childCount = getChildCount();
        if (!this.f3101x || childCount <= 0) {
            for (int i = 0; i < childCount; i++) {
                C0789c lp = (C0789c) getChildAt(i).getLayoutParams();
                lp.rightMargin = 0;
                lp.leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        mo4017M(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02bd  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4017M(int r41, int r42) {
        /*
            r40 = this;
            r0 = r40
            int r1 = android.view.View.MeasureSpec.getMode(r42)
            int r2 = android.view.View.MeasureSpec.getSize(r41)
            int r3 = android.view.View.MeasureSpec.getSize(r42)
            int r4 = r40.getPaddingLeft()
            int r5 = r40.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r40.getPaddingTop()
            int r6 = r40.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r42
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r8 = r0.f3103z
            int r9 = r2 / r8
            int r10 = r2 % r8
            r11 = 0
            if (r9 != 0) goto L_0x0035
            r0.setMeasuredDimension(r2, r11)
            return
        L_0x0035:
            int r12 = r10 / r9
            int r8 = r8 + r12
            r12 = r9
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            int r11 = r40.getChildCount()
            r21 = 0
            r38 = r16
            r16 = r3
            r3 = r38
            r39 = r21
            r21 = r4
            r4 = r39
        L_0x0054:
            if (r4 >= r11) goto L_0x00e6
            android.view.View r7 = r0.getChildAt(r4)
            r23 = r9
            int r9 = r7.getVisibility()
            r24 = r10
            r10 = 8
            if (r9 != r10) goto L_0x0068
            goto L_0x00dc
        L_0x0068:
            boolean r9 = r7 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r3 = r3 + 1
            if (r9 == 0) goto L_0x0077
            int r10 = r0.f3092A
            r25 = r3
            r3 = 0
            r7.setPadding(r10, r3, r10, r3)
            goto L_0x007a
        L_0x0077:
            r25 = r3
            r3 = 0
        L_0x007a:
            android.view.ViewGroup$LayoutParams r10 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r10 = (androidx.appcompat.widget.ActionMenuView.C0789c) r10
            r10.f3109h = r3
            r10.f3106e = r3
            r10.f3105d = r3
            r10.f3107f = r3
            r10.leftMargin = r3
            r10.rightMargin = r3
            if (r9 == 0) goto L_0x0099
            r3 = r7
            androidx.appcompat.view.menu.ActionMenuItemView r3 = (androidx.appcompat.view.menu.ActionMenuItemView) r3
            boolean r3 = r3.mo3891f()
            if (r3 == 0) goto L_0x0099
            r3 = 1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r10.f3108g = r3
            boolean r3 = r10.f3104c
            if (r3 == 0) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = r12
        L_0x00a3:
            r26 = r9
            int r9 = m3817L(r7, r8, r3, r6, r5)
            int r14 = java.lang.Math.max(r14, r9)
            r27 = r3
            boolean r3 = r10.f3107f
            if (r3 == 0) goto L_0x00b5
            int r15 = r15 + 1
        L_0x00b5:
            boolean r3 = r10.f3104c
            if (r3 == 0) goto L_0x00bb
            r17 = 1
        L_0x00bb:
            int r12 = r12 - r9
            int r3 = r7.getMeasuredHeight()
            int r3 = java.lang.Math.max(r13, r3)
            r13 = 1
            if (r9 != r13) goto L_0x00d5
            int r13 = r13 << r4
            r28 = r9
            r22 = r10
            long r9 = (long) r13
            long r9 = r18 | r9
            r13 = r3
            r18 = r9
            r3 = r25
            goto L_0x00dc
        L_0x00d5:
            r28 = r9
            r22 = r10
            r13 = r3
            r3 = r25
        L_0x00dc:
            int r4 = r4 + 1
            r7 = r42
            r9 = r23
            r10 = r24
            goto L_0x0054
        L_0x00e6:
            r23 = r9
            r24 = r10
            r4 = 2
            if (r17 == 0) goto L_0x00f1
            if (r3 != r4) goto L_0x00f1
            r7 = 1
            goto L_0x00f2
        L_0x00f1:
            r7 = 0
        L_0x00f2:
            r9 = 0
        L_0x00f3:
            r25 = 1
            r27 = 0
            if (r15 <= 0) goto L_0x01a6
            if (r12 <= 0) goto L_0x01a6
            r10 = 2147483647(0x7fffffff, float:NaN)
            r29 = 0
            r31 = 0
            r32 = 0
            r4 = r31
            r38 = r32
            r32 = r5
            r5 = r38
        L_0x010c:
            if (r5 >= r11) goto L_0x013c
            android.view.View r33 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r34 = r33.getLayoutParams()
            r35 = r9
            r9 = r34
            androidx.appcompat.widget.ActionMenuView$c r9 = (androidx.appcompat.widget.ActionMenuView.C0789c) r9
            r34 = r15
            boolean r15 = r9.f3107f
            if (r15 != 0) goto L_0x0123
            goto L_0x0135
        L_0x0123:
            int r15 = r9.f3105d
            if (r15 >= r10) goto L_0x012d
            int r10 = r9.f3105d
            long r29 = r25 << r5
            r4 = 1
            goto L_0x0135
        L_0x012d:
            if (r15 != r10) goto L_0x0135
            long r36 = r25 << r5
            long r29 = r29 | r36
            int r4 = r4 + 1
        L_0x0135:
            int r5 = r5 + 1
            r15 = r34
            r9 = r35
            goto L_0x010c
        L_0x013c:
            r35 = r9
            r34 = r15
            long r18 = r18 | r29
            if (r4 <= r12) goto L_0x014a
            r36 = r1
            r37 = r2
            goto L_0x01b0
        L_0x014a:
            int r10 = r10 + 1
            r5 = 0
        L_0x014d:
            if (r5 >= r11) goto L_0x0198
            android.view.View r9 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r15 = r9.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r15 = (androidx.appcompat.widget.ActionMenuView.C0789c) r15
            r33 = r4
            r22 = 1
            int r4 = r22 << r5
            r36 = r1
            r37 = r2
            long r1 = (long) r4
            long r1 = r29 & r1
            int r4 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r4 != 0) goto L_0x0174
            int r1 = r15.f3105d
            if (r1 != r10) goto L_0x018f
            int r1 = r22 << r5
            long r1 = (long) r1
            long r18 = r18 | r1
            goto L_0x018f
        L_0x0174:
            if (r7 == 0) goto L_0x0185
            boolean r1 = r15.f3108g
            if (r1 == 0) goto L_0x0185
            r1 = 1
            if (r12 != r1) goto L_0x0185
            int r1 = r0.f3092A
            int r2 = r1 + r8
            r4 = 0
            r9.setPadding(r2, r4, r1, r4)
        L_0x0185:
            int r1 = r15.f3105d
            r2 = 1
            int r1 = r1 + r2
            r15.f3105d = r1
            r15.f3109h = r2
            int r12 = r12 + -1
        L_0x018f:
            int r5 = r5 + 1
            r4 = r33
            r1 = r36
            r2 = r37
            goto L_0x014d
        L_0x0198:
            r36 = r1
            r37 = r2
            r33 = r4
            r9 = 1
            r5 = r32
            r15 = r34
            r4 = 2
            goto L_0x00f3
        L_0x01a6:
            r36 = r1
            r37 = r2
            r32 = r5
            r35 = r9
            r34 = r15
        L_0x01b0:
            if (r17 != 0) goto L_0x01b7
            r1 = 1
            if (r3 != r1) goto L_0x01b7
            r1 = 1
            goto L_0x01b8
        L_0x01b7:
            r1 = 0
        L_0x01b8:
            if (r12 <= 0) goto L_0x0280
            int r2 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0280
            int r2 = r3 + -1
            if (r12 < r2) goto L_0x01cb
            if (r1 != 0) goto L_0x01cb
            r2 = 1
            if (r14 <= r2) goto L_0x01c8
            goto L_0x01cb
        L_0x01c8:
            r10 = r1
            goto L_0x0281
        L_0x01cb:
            int r2 = java.lang.Long.bitCount(r18)
            float r2 = (float) r2
            if (r1 != 0) goto L_0x0209
            long r4 = r18 & r25
            r9 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r10 == 0) goto L_0x01eb
            r4 = 0
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r5 = (androidx.appcompat.widget.ActionMenuView.C0789c) r5
            boolean r10 = r5.f3108g
            if (r10 != 0) goto L_0x01ec
            float r2 = r2 - r9
            goto L_0x01ec
        L_0x01eb:
            r4 = 0
        L_0x01ec:
            int r5 = r11 + -1
            r10 = 1
            int r5 = r10 << r5
            long r4 = (long) r5
            long r4 = r18 & r4
            int r10 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r10 == 0) goto L_0x0209
            int r4 = r11 + -1
            android.view.View r4 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r4 = (androidx.appcompat.widget.ActionMenuView.C0789c) r4
            boolean r5 = r4.f3108g
            if (r5 != 0) goto L_0x0209
            float r2 = r2 - r9
        L_0x0209:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0216
            int r4 = r12 * r8
            float r4 = (float) r4
            float r4 = r4 / r2
            int r4 = (int) r4
            r20 = r4
            goto L_0x0218
        L_0x0216:
            r20 = 0
        L_0x0218:
            r4 = r20
            r5 = 0
            r9 = r35
        L_0x021d:
            if (r5 >= r11) goto L_0x027b
            r10 = 1
            int r15 = r10 << r5
            r10 = r1
            r20 = r2
            long r1 = (long) r15
            long r1 = r18 & r1
            int r15 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r15 != 0) goto L_0x022f
            r25 = 2
            goto L_0x0275
        L_0x022f:
            android.view.View r1 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r2 = (androidx.appcompat.widget.ActionMenuView.C0789c) r2
            boolean r15 = r1 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r15 == 0) goto L_0x0253
            r2.f3106e = r4
            r15 = 1
            r2.f3109h = r15
            if (r5 != 0) goto L_0x024f
            boolean r15 = r2.f3108g
            if (r15 != 0) goto L_0x024f
            int r15 = -r4
            r25 = 2
            int r15 = r15 / 2
            r2.leftMargin = r15
        L_0x024f:
            r9 = 1
            r25 = 2
            goto L_0x0275
        L_0x0253:
            boolean r15 = r2.f3104c
            if (r15 == 0) goto L_0x0265
            r2.f3106e = r4
            r15 = 1
            r2.f3109h = r15
            int r15 = -r4
            r25 = 2
            int r15 = r15 / 2
            r2.rightMargin = r15
            r9 = 1
            goto L_0x0275
        L_0x0265:
            r25 = 2
            if (r5 == 0) goto L_0x026d
            int r15 = r4 / 2
            r2.leftMargin = r15
        L_0x026d:
            int r15 = r11 + -1
            if (r5 == r15) goto L_0x0275
            int r15 = r4 / 2
            r2.rightMargin = r15
        L_0x0275:
            int r5 = r5 + 1
            r1 = r10
            r2 = r20
            goto L_0x021d
        L_0x027b:
            r10 = r1
            r20 = r2
            r12 = 0
            goto L_0x0283
        L_0x0280:
            r10 = r1
        L_0x0281:
            r9 = r35
        L_0x0283:
            if (r9 == 0) goto L_0x02b3
            r2 = 0
        L_0x0286:
            if (r2 >= r11) goto L_0x02b0
            android.view.View r4 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r5 = (androidx.appcompat.widget.ActionMenuView.C0789c) r5
            boolean r15 = r5.f3109h
            if (r15 != 0) goto L_0x0299
            r22 = r3
            goto L_0x02ab
        L_0x0299:
            int r15 = r5.f3105d
            int r15 = r15 * r8
            int r1 = r5.f3106e
            int r15 = r15 + r1
            r22 = r3
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)
            r4.measure(r3, r6)
        L_0x02ab:
            int r2 = r2 + 1
            r3 = r22
            goto L_0x0286
        L_0x02b0:
            r22 = r3
            goto L_0x02b5
        L_0x02b3:
            r22 = r3
        L_0x02b5:
            r1 = r36
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x02bd
            r3 = r13
            goto L_0x02bf
        L_0x02bd:
            r3 = r16
        L_0x02bf:
            r2 = r37
            r0.setMeasuredDimension(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.mo4017M(int, int):void");
    }

    /* renamed from: L */
    public static int m3817L(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        View view = child;
        int i = cellsRemaining;
        C0789c lp = (C0789c) child.getLayoutParams();
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding, View.MeasureSpec.getMode(parentHeightMeasureSpec));
        ActionMenuItemView itemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.mo3891f();
        int cellsUsed = 0;
        if (i > 0 && (!hasText || i >= 2)) {
            child.measure(View.MeasureSpec.makeMeasureSpec(cellSize * i, RecyclerView.UNDEFINED_DURATION), childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f3104c && hasText) {
            expandable = true;
        }
        lp.f3107f = expandable;
        lp.f3105d = cellsUsed;
        child.measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * cellSize, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i;
        int overflowWidth;
        int dividerWidth;
        boolean isLayoutRtl;
        int midVertical;
        int r;
        int l;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.f3101x) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical2 = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowWidth = 0;
        int nonOverflowCount = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        boolean hasOverflow = false;
        boolean isLayoutRtl2 = C0140c1.m788b(this);
        int i2 = 0;
        while (true) {
            i = 8;
            if (i2 >= childCount) {
                break;
            }
            View v = actionMenuView.getChildAt(i2);
            if (v.getVisibility() == 8) {
                midVertical = midVertical2;
                isLayoutRtl = isLayoutRtl2;
            } else {
                C0789c p = (C0789c) v.getLayoutParams();
                if (p.f3104c) {
                    overflowWidth2 = v.getMeasuredWidth();
                    if (actionMenuView.mo4012G(i2)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v.getMeasuredHeight();
                    if (isLayoutRtl2) {
                        l = getPaddingLeft() + p.leftMargin;
                        r = l + overflowWidth2;
                    } else {
                        r = (getWidth() - getPaddingRight()) - p.rightMargin;
                        l = r - overflowWidth2;
                    }
                    isLayoutRtl = isLayoutRtl2;
                    int t = midVertical2 - (height / 2);
                    midVertical = midVertical2;
                    v.layout(l, t, r, t + height);
                    widthRemaining -= overflowWidth2;
                    hasOverflow = true;
                } else {
                    midVertical = midVertical2;
                    isLayoutRtl = isLayoutRtl2;
                    int size = v.getMeasuredWidth() + p.leftMargin + p.rightMargin;
                    nonOverflowWidth += size;
                    widthRemaining -= size;
                    if (actionMenuView.mo4012G(i2)) {
                        nonOverflowWidth += dividerWidth2;
                    }
                    nonOverflowCount++;
                }
            }
            i2++;
            midVertical2 = midVertical;
            isLayoutRtl2 = isLayoutRtl;
        }
        int midVertical3 = midVertical2;
        boolean isLayoutRtl3 = isLayoutRtl2;
        if (childCount != 1 || hasOverflow) {
            int spacerCount = nonOverflowCount - (!hasOverflow);
            int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
            if (isLayoutRtl3) {
                int startRight = getWidth() - getPaddingRight();
                int i3 = 0;
                while (i3 < childCount) {
                    View v2 = actionMenuView.getChildAt(i3);
                    C0789c lp = (C0789c) v2.getLayoutParams();
                    if (v2.getVisibility() == i) {
                        dividerWidth = dividerWidth2;
                        overflowWidth = overflowWidth2;
                    } else if (lp.f3104c) {
                        dividerWidth = dividerWidth2;
                        overflowWidth = overflowWidth2;
                    } else {
                        int startRight2 = startRight - lp.rightMargin;
                        int width = v2.getMeasuredWidth();
                        int height2 = v2.getMeasuredHeight();
                        int t2 = midVertical3 - (height2 / 2);
                        dividerWidth = dividerWidth2;
                        overflowWidth = overflowWidth2;
                        v2.layout(startRight2 - width, t2, startRight2, t2 + height2);
                        startRight = startRight2 - ((lp.leftMargin + width) + spacerSize);
                    }
                    i3++;
                    dividerWidth2 = dividerWidth;
                    overflowWidth2 = overflowWidth;
                    i = 8;
                }
                int i4 = overflowWidth2;
                return;
            }
            int i5 = overflowWidth2;
            int startLeft = getPaddingLeft();
            int i6 = 0;
            while (i6 < childCount) {
                View v3 = actionMenuView.getChildAt(i6);
                C0789c lp2 = (C0789c) v3.getLayoutParams();
                if (v3.getVisibility() != 8 && !lp2.f3104c) {
                    int startLeft2 = startLeft + lp2.leftMargin;
                    int width2 = v3.getMeasuredWidth();
                    int height3 = v3.getMeasuredHeight();
                    int t3 = midVertical3 - (height3 / 2);
                    v3.layout(startLeft2, t3, startLeft2 + width2, t3 + height3);
                    startLeft = startLeft2 + lp2.rightMargin + width2 + spacerSize;
                }
                i6++;
                actionMenuView = this;
            }
            return;
        }
        View v4 = actionMenuView.getChildAt(0);
        int width3 = v4.getMeasuredWidth();
        int height4 = v4.getMeasuredHeight();
        int l2 = ((right - left) / 2) - (width3 / 2);
        int t4 = midVertical3 - (height4 / 2);
        v4.layout(l2, t4, l2 + width3, t4 + height4);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4007B();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.f3098u.mo956H(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3098u.mo961z();
    }

    /* renamed from: K */
    public boolean mo4016K() {
        return this.f3097t;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.f3097t = reserveOverflow;
    }

    /* renamed from: C */
    public C0789c mo1134m() {
        C0789c params = new C0789c(-2, -2);
        params.f891b = 16;
        return params;
    }

    /* renamed from: D */
    public C0789c mo1135n(AttributeSet attrs) {
        return new C0789c(getContext(), attrs);
    }

    /* renamed from: E */
    public C0789c mo1136o(ViewGroup.LayoutParams p) {
        if (p == null) {
            return mo1134m();
        }
        C0789c result = p instanceof C0789c ? new C0789c((C0789c) p) : new C0789c(p);
        if (result.f891b <= 0) {
            result.f891b = 16;
        }
        return result;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0789c;
    }

    /* renamed from: F */
    public C0789c mo4011F() {
        C0789c result = mo1134m();
        result.f3104c = true;
        return result;
    }

    /* renamed from: b */
    public boolean mo695b(C0102i item) {
        return this.f3094q.mo625L(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: d */
    public void mo847d(C0098g menu) {
        this.f3094q = menu;
    }

    public Menu getMenu() {
        if (this.f3094q == null) {
            Context context = getContext();
            C0098g gVar = new C0098g(context);
            this.f3094q = gVar;
            gVar.mo631R(new C0790d());
            C0131c cVar = new C0131c(context);
            this.f3098u = cVar;
            cVar.mo957I(true);
            C0131c cVar2 = this.f3098u;
            C0113m.C0114a aVar = this.f3099v;
            if (aVar == null) {
                aVar = new C0788b();
            }
            cVar2.mo548d(aVar);
            this.f3094q.mo653c(this.f3098u, this.f3095r);
            this.f3098u.mo955G(this);
        }
        return this.f3094q;
    }

    /* renamed from: O */
    public void mo4019O(C0113m.C0114a pcb, C0098g.C0099a mcb) {
        this.f3099v = pcb;
        this.f3100w = mcb;
    }

    /* renamed from: N */
    public C0098g mo4018N() {
        return this.f3094q;
    }

    /* renamed from: P */
    public boolean mo4020P() {
        C0131c cVar = this.f3098u;
        return cVar != null && cVar.mo958J();
    }

    /* renamed from: H */
    public boolean mo4013H() {
        C0131c cVar = this.f3098u;
        return cVar != null && cVar.mo949A();
    }

    /* renamed from: J */
    public boolean mo4015J() {
        C0131c cVar = this.f3098u;
        return cVar != null && cVar.mo952D();
    }

    /* renamed from: I */
    public boolean mo4014I() {
        C0131c cVar = this.f3098u;
        return cVar != null && cVar.mo951C();
    }

    /* renamed from: B */
    public void mo4007B() {
        C0131c cVar = this.f3098u;
        if (cVar != null) {
            cVar.mo959x();
        }
    }

    /* renamed from: G */
    public boolean mo4012G(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof C0787a)) {
            result = false | ((C0787a) childBefore).mo965b();
        }
        if (childIndex <= 0 || !(child instanceof C0787a)) {
            return result;
        }
        return result | ((C0787a) child).mo964a();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.f3098u.mo954F(exclusive);
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0790d implements C0098g.C0099a {
        public C0790d() {
        }

        /* renamed from: b */
        public boolean mo140b(C0098g menu, MenuItem item) {
            C0791e eVar = ActionMenuView.this.f3093B;
            return eVar != null && eVar.onMenuItemClick(item);
        }

        /* renamed from: a */
        public void mo138a(C0098g menu) {
            C0098g.C0099a aVar = ActionMenuView.this.f3100w;
            if (aVar != null) {
                aVar.mo138a(menu);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0788b implements C0113m.C0114a {
        /* renamed from: b */
        public void mo178b(C0098g menu, boolean allMenusAreClosing) {
        }

        /* renamed from: c */
        public boolean mo179c(C0098g subMenu) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0789c extends C0158i0.C0159a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f3104c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f3105d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f3106e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f3107f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f3108g;

        /* renamed from: h */
        public boolean f3109h;

        public C0789c(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0789c(ViewGroup.LayoutParams other) {
            super(other);
        }

        public C0789c(C0789c other) {
            super(other);
            this.f3104c = other.f3104c;
        }

        public C0789c(int width, int height) {
            super(width, height);
            this.f3104c = false;
        }
    }
}
