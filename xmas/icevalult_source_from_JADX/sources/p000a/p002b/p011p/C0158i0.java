package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p002b.C0012j;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.p.i0 */
public class C0158i0 extends ViewGroup {

    /* renamed from: b */
    public boolean f875b;

    /* renamed from: c */
    public int f876c;

    /* renamed from: d */
    public int f877d;

    /* renamed from: e */
    public int f878e;

    /* renamed from: f */
    public int f879f;

    /* renamed from: g */
    public int f880g;

    /* renamed from: h */
    public float f881h;

    /* renamed from: i */
    public boolean f882i;

    /* renamed from: j */
    public int[] f883j;

    /* renamed from: k */
    public int[] f884k;

    /* renamed from: l */
    public Drawable f885l;

    /* renamed from: m */
    public int f886m;

    /* renamed from: n */
    public int f887n;

    /* renamed from: o */
    public int f888o;

    /* renamed from: p */
    public int f889p;

    public C0158i0(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0158i0(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0158i0(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f875b = true;
        this.f876c = -1;
        this.f877d = 0;
        this.f879f = 8388659;
        C0218w0 a = C0218w0.m1093u(context, attrs, C0012j.f73Q0, defStyleAttr, 0);
        int index = a.mo1506k(C0012j.f81S0, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a.mo1506k(C0012j.f77R0, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a.mo1496a(C0012j.f85T0, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.f881h = a.mo1504i(C0012j.f93V0, -1.0f);
        this.f876c = a.mo1506k(C0012j.f89U0, -1);
        this.f882i = a.mo1496a(C0012j.f105Y0, false);
        setDividerDrawable(a.mo1502g(C0012j.f97W0));
        this.f888o = a.mo1506k(C0012j.f109Z0, 0);
        this.f889p = a.mo1501f(C0012j.f101X0, 0);
        a.mo1514v();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.f888o) {
            requestLayout();
        }
        this.f888o = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.f888o;
    }

    public Drawable getDividerDrawable() {
        return this.f885l;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.f885l) {
            this.f885l = divider;
            boolean z = false;
            if (divider != null) {
                this.f886m = divider.getIntrinsicWidth();
                this.f887n = divider.getIntrinsicHeight();
            } else {
                this.f886m = 0;
                this.f887n = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.f889p = padding;
    }

    public int getDividerPadding() {
        return this.f889p;
    }

    public int getDividerWidth() {
        return this.f886m;
    }

    public void onDraw(Canvas canvas) {
        if (this.f885l != null) {
            if (this.f878e == 1) {
                mo1129h(canvas);
            } else {
                mo1115g(canvas);
            }
        }
    }

    /* renamed from: h */
    public void mo1129h(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = mo1145s(i);
            if (!(child == null || child.getVisibility() == 8 || !mo1158t(i))) {
                mo1130i(canvas, (child.getTop() - ((C0159a) child.getLayoutParams()).topMargin) - this.f887n);
            }
        }
        if (mo1158t(count) != 0) {
            View child2 = mo1145s(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f887n;
            } else {
                bottom = child2.getBottom() + ((C0159a) child2.getLayoutParams()).bottomMargin;
            }
            mo1130i(canvas, bottom);
        }
    }

    /* renamed from: g */
    public void mo1115g(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = C0140c1.m788b(this);
        for (int i = 0; i < count; i++) {
            View child = mo1145s(i);
            if (!(child == null || child.getVisibility() == 8 || !mo1158t(i))) {
                C0159a lp = (C0159a) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + lp.rightMargin;
                } else {
                    position2 = (child.getLeft() - lp.leftMargin) - this.f886m;
                }
                mo1131j(canvas, position2);
            }
        }
        if (mo1158t(count) != 0) {
            View child2 = mo1145s(count - 1);
            if (child2 != null) {
                C0159a lp2 = (C0159a) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - lp2.leftMargin) - this.f886m;
                } else {
                    position = child2.getRight() + lp2.rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.f886m;
            }
            mo1131j(canvas, position);
        }
    }

    /* renamed from: i */
    public void mo1130i(Canvas canvas, int top) {
        this.f885l.setBounds(getPaddingLeft() + this.f889p, top, (getWidth() - getPaddingRight()) - this.f889p, this.f887n + top);
        this.f885l.draw(canvas);
    }

    /* renamed from: j */
    public void mo1131j(Canvas canvas, int left) {
        this.f885l.setBounds(left, getPaddingTop() + this.f889p, this.f886m + left, (getHeight() - getPaddingBottom()) - this.f889p);
        this.f885l.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f875b = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.f882i = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.f876c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f876c;
        if (childCount > i) {
            View child = getChildAt(i);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f877d;
                if (this.f878e == 1 && (majorGravity = this.f879f & 112) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f880g) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f880g;
                    }
                }
                return ((C0159a) child.getLayoutParams()).topMargin + childTop + childBaseline;
            } else if (this.f876c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f876c;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f876c = i;
    }

    /* renamed from: s */
    public View mo1145s(int index) {
        return getChildAt(index);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f881h;
    }

    public void setWeightSum(float weightSum) {
        this.f881h = Math.max(0.0f, weightSum);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f878e == 1) {
            mo1164z(widthMeasureSpec, heightMeasureSpec);
        } else {
            mo1162x(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* renamed from: t */
    public boolean mo1158t(int childIndex) {
        if (childIndex == 0) {
            if ((this.f888o & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.f888o & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f888o & 2) == 0) {
            return false;
        } else {
            for (int i = childIndex - 1; i >= 0; i--) {
                if (getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1164z(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f880g = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            r6 = 0
            r14 = 0
            int r15 = r7.f876c
            boolean r10 = r7.f882i
            r17 = 0
            r18 = 0
            r19 = r14
            r14 = r0
            r0 = r5
            r5 = r2
            r2 = r18
            r18 = r6
            r6 = r1
            r37 = r4
            r4 = r3
            r3 = r17
            r17 = r37
        L_0x0036:
            r20 = r4
            r1 = 8
            r22 = 1
            r23 = 0
            if (r2 >= r11) goto L_0x01ba
            android.view.View r4 = r7.mo1145s(r2)
            if (r4 != 0) goto L_0x0058
            int r1 = r7.f880g
            int r21 = r7.mo1163y(r2)
            int r1 = r1 + r21
            r7.f880g = r1
            r31 = r11
            r26 = r13
            r4 = r20
            goto L_0x01ae
        L_0x0058:
            r26 = r3
            int r3 = r4.getVisibility()
            if (r3 != r1) goto L_0x006f
            int r1 = r7.mo1142p(r4, r2)
            int r2 = r2 + r1
            r31 = r11
            r4 = r20
            r3 = r26
            r26 = r13
            goto L_0x01ae
        L_0x006f:
            boolean r1 = r7.mo1158t(r2)
            if (r1 == 0) goto L_0x007c
            int r1 = r7.f880g
            int r3 = r7.f887n
            int r1 = r1 + r3
            r7.f880g = r1
        L_0x007c:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r3 = r1
            a.b.p.i0$a r3 = (p000a.p002b.p011p.C0158i0.C0159a) r3
            float r1 = r3.f890a
            float r27 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x00b9
            int r0 = r3.height
            if (r0 != 0) goto L_0x00b9
            int r0 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            int r0 = r7.f880g
            int r1 = r3.topMargin
            int r1 = r1 + r0
            r28 = r2
            int r2 = r3.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r0, r1)
            r7.f880g = r1
            r19 = 1
            r32 = r5
            r33 = r6
            r31 = r11
            r24 = r20
            r2 = r26
            r21 = r28
            r11 = 1073741824(0x40000000, float:2.0)
            r26 = r13
            r13 = r3
            r3 = r4
            goto L_0x012a
        L_0x00b9:
            r28 = r2
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r3.height
            if (r2 != 0) goto L_0x00cb
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cb
            r0 = 0
            r1 = -2
            r3.height = r1
            r2 = r0
            goto L_0x00cc
        L_0x00cb:
            r2 = r0
        L_0x00cc:
            r29 = 0
            int r0 = (r27 > r23 ? 1 : (r27 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            int r0 = r7.f880g
            r30 = r0
            goto L_0x00d9
        L_0x00d7:
            r30 = 0
        L_0x00d9:
            r25 = 1073741824(0x40000000, float:2.0)
            r0 = r38
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4
            r8 = r2
            r21 = r28
            r2 = r21
            r9 = r26
            r26 = r13
            r13 = r3
            r3 = r39
            r31 = r11
            r24 = r20
            r11 = 1073741824(0x40000000, float:2.0)
            r20 = r4
            r4 = r29
            r32 = r5
            r5 = r40
            r33 = r6
            r6 = r30
            r0.mo1161w(r1, r2, r3, r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x0107
            r13.height = r8
        L_0x0107:
            int r0 = r20.getMeasuredHeight()
            int r1 = r7.f880g
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = r20
            int r4 = r7.mo1144r(r3)
            int r2 = r2 + r4
            int r2 = java.lang.Math.max(r1, r2)
            r7.f880g = r2
            if (r10 == 0) goto L_0x0129
            int r2 = java.lang.Math.max(r0, r9)
            goto L_0x012a
        L_0x0129:
            r2 = r9
        L_0x012a:
            if (r15 < 0) goto L_0x0137
            r4 = r21
            int r0 = r4 + 1
            if (r15 != r0) goto L_0x0139
            int r0 = r7.f880g
            r7.f877d = r0
            goto L_0x0139
        L_0x0137:
            r4 = r21
        L_0x0139:
            if (r4 >= r15) goto L_0x014a
            float r0 = r13.f890a
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 > 0) goto L_0x0142
            goto L_0x014a
        L_0x0142:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x014a:
            r0 = 0
            if (r12 == r11) goto L_0x0155
            int r1 = r13.width
            r5 = -1
            if (r1 != r5) goto L_0x0155
            r18 = 1
            r0 = 1
        L_0x0155:
            int r1 = r13.leftMargin
            int r5 = r13.rightMargin
            int r1 = r1 + r5
            int r5 = r3.getMeasuredWidth()
            int r5 = r5 + r1
            int r6 = java.lang.Math.max(r14, r5)
            int r8 = r3.getMeasuredState()
            r9 = r33
            int r8 = android.view.View.combineMeasuredStates(r9, r8)
            if (r17 == 0) goto L_0x0177
            int r9 = r13.width
            r11 = -1
            if (r9 != r11) goto L_0x0177
            r9 = 1
            goto L_0x0178
        L_0x0177:
            r9 = 0
        L_0x0178:
            float r11 = r13.f890a
            int r11 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r11 <= 0) goto L_0x018d
            if (r0 == 0) goto L_0x0182
            r11 = r1
            goto L_0x0183
        L_0x0182:
            r11 = r5
        L_0x0183:
            r14 = r24
            int r11 = java.lang.Math.max(r14, r11)
            r20 = r1
            r14 = r11
            goto L_0x019e
        L_0x018d:
            r14 = r24
            if (r0 == 0) goto L_0x0193
            r11 = r1
            goto L_0x0194
        L_0x0193:
            r11 = r5
        L_0x0194:
            r20 = r1
            r1 = r32
            int r1 = java.lang.Math.max(r1, r11)
            r32 = r1
        L_0x019e:
            int r1 = r7.mo1142p(r3, r4)
            int r1 = r1 + r4
            r3 = r2
            r17 = r9
            r4 = r14
            r0 = r27
            r5 = r32
            r2 = r1
            r14 = r6
            r6 = r8
        L_0x01ae:
            int r2 = r2 + 1
            r8 = r39
            r9 = r40
            r13 = r26
            r11 = r31
            goto L_0x0036
        L_0x01ba:
            r4 = r2
            r9 = r3
            r1 = r5
            r31 = r11
            r26 = r13
            r3 = r20
            r2 = 8
            r11 = 1073741824(0x40000000, float:2.0)
            int r4 = r7.f880g
            if (r4 <= 0) goto L_0x01db
            r4 = r31
            boolean r5 = r7.mo1158t(r4)
            if (r5 == 0) goto L_0x01dd
            int r5 = r7.f880g
            int r8 = r7.f887n
            int r5 = r5 + r8
            r7.f880g = r5
            goto L_0x01dd
        L_0x01db:
            r4 = r31
        L_0x01dd:
            if (r10 == 0) goto L_0x023f
            r5 = r26
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r8) goto L_0x01eb
            if (r5 != 0) goto L_0x01e8
            goto L_0x01eb
        L_0x01e8:
            r33 = r6
            goto L_0x0243
        L_0x01eb:
            r8 = 0
            r7.f880g = r8
            r8 = 0
        L_0x01ef:
            if (r8 >= r4) goto L_0x023c
            android.view.View r13 = r7.mo1145s(r8)
            if (r13 != 0) goto L_0x0204
            int r11 = r7.f880g
            int r21 = r7.mo1163y(r8)
            int r11 = r11 + r21
            r7.f880g = r11
            r33 = r6
            goto L_0x0233
        L_0x0204:
            int r11 = r13.getVisibility()
            if (r11 != r2) goto L_0x0212
            int r11 = r7.mo1142p(r13, r8)
            int r8 = r8 + r11
            r33 = r6
            goto L_0x0233
        L_0x0212:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            a.b.p.i0$a r11 = (p000a.p002b.p011p.C0158i0.C0159a) r11
            int r2 = r7.f880g
            int r24 = r2 + r9
            r33 = r6
            int r6 = r11.topMargin
            int r24 = r24 + r6
            int r6 = r11.bottomMargin
            int r24 = r24 + r6
            int r6 = r7.mo1144r(r13)
            int r6 = r24 + r6
            int r6 = java.lang.Math.max(r2, r6)
            r7.f880g = r6
        L_0x0233:
            int r8 = r8 + 1
            r6 = r33
            r2 = 8
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x01ef
        L_0x023c:
            r33 = r6
            goto L_0x0243
        L_0x023f:
            r33 = r6
            r5 = r26
        L_0x0243:
            int r2 = r7.f880g
            int r6 = r38.getPaddingTop()
            int r8 = r38.getPaddingBottom()
            int r6 = r6 + r8
            int r2 = r2 + r6
            r7.f880g = r2
            int r2 = r7.f880g
            int r6 = r38.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r40
            r8 = r9
            r9 = 0
            int r11 = android.view.View.resolveSizeAndState(r2, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r11 & r9
            int r9 = r7.f880g
            int r9 = r2 - r9
            if (r19 != 0) goto L_0x0300
            if (r9 == 0) goto L_0x027c
            int r13 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r13 <= 0) goto L_0x027c
            r24 = r0
            r26 = r2
            r27 = r3
            goto L_0x0306
        L_0x027c:
            int r1 = java.lang.Math.max(r1, r3)
            if (r10 == 0) goto L_0x02e7
            r13 = 1073741824(0x40000000, float:2.0)
            if (r5 == r13) goto L_0x02e7
            r13 = 0
        L_0x0287:
            if (r13 >= r4) goto L_0x02de
            r24 = r0
            android.view.View r0 = r7.mo1145s(r13)
            if (r0 == 0) goto L_0x02cd
            r16 = r1
            int r1 = r0.getVisibility()
            r26 = r2
            r2 = 8
            if (r1 != r2) goto L_0x02a0
            r27 = r3
            goto L_0x02d3
        L_0x02a0:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            a.b.p.i0$a r1 = (p000a.p002b.p011p.C0158i0.C0159a) r1
            float r2 = r1.f890a
            int r22 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r22 <= 0) goto L_0x02c6
            r22 = r1
            int r1 = r0.getMeasuredWidth()
            r25 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            r27 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            r0.measure(r1, r3)
            goto L_0x02d3
        L_0x02c6:
            r22 = r1
            r25 = r2
            r27 = r3
            goto L_0x02d3
        L_0x02cd:
            r16 = r1
            r26 = r2
            r27 = r3
        L_0x02d3:
            int r13 = r13 + 1
            r1 = r16
            r0 = r24
            r2 = r26
            r3 = r27
            goto L_0x0287
        L_0x02de:
            r24 = r0
            r16 = r1
            r26 = r2
            r27 = r3
            goto L_0x02ef
        L_0x02e7:
            r24 = r0
            r16 = r1
            r26 = r2
            r27 = r3
        L_0x02ef:
            r13 = r39
            r34 = r5
            r28 = r8
            r5 = r9
            r29 = r10
            r30 = r15
            r1 = r16
            r9 = r33
            goto L_0x0439
        L_0x0300:
            r24 = r0
            r26 = r2
            r27 = r3
        L_0x0306:
            float r0 = r7.f881h
            int r2 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r2 <= 0) goto L_0x030d
            goto L_0x030f
        L_0x030d:
            r0 = r24
        L_0x030f:
            r2 = 0
            r7.f880g = r2
            r3 = 0
            r13 = r9
            r9 = r33
        L_0x0316:
            if (r3 >= r4) goto L_0x041f
            android.view.View r2 = r7.mo1145s(r3)
            r28 = r8
            int r8 = r2.getVisibility()
            r29 = r10
            r10 = 8
            if (r8 != r10) goto L_0x0332
            r34 = r5
            r33 = r13
            r30 = r15
            r13 = r39
            goto L_0x0410
        L_0x0332:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            a.b.p.i0$a r8 = (p000a.p002b.p011p.C0158i0.C0159a) r8
            float r10 = r8.f890a
            int r30 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r30 <= 0) goto L_0x03ab
            r30 = r15
            float r15 = (float) r13
            float r15 = r15 * r10
            float r15 = r15 / r0
            int r15 = (int) r15
            float r0 = r0 - r10
            int r13 = r13 - r15
            int r31 = r38.getPaddingLeft()
            int r32 = r38.getPaddingRight()
            int r31 = r31 + r32
            r32 = r0
            int r0 = r8.leftMargin
            int r31 = r31 + r0
            int r0 = r8.rightMargin
            int r0 = r31 + r0
            r31 = r10
            int r10 = r8.width
            r33 = r13
            r13 = r39
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r13, r0, r10)
            int r10 = r8.height
            if (r10 != 0) goto L_0x0386
            r10 = 1073741824(0x40000000, float:2.0)
            if (r5 == r10) goto L_0x0373
            r34 = r5
            goto L_0x0388
        L_0x0373:
            if (r15 <= 0) goto L_0x0377
            r10 = r15
            goto L_0x0378
        L_0x0377:
            r10 = 0
        L_0x0378:
            r34 = r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            r2.measure(r0, r10)
            r35 = r15
            goto L_0x039d
        L_0x0386:
            r34 = r5
        L_0x0388:
            int r5 = r2.getMeasuredHeight()
            int r5 = r5 + r15
            if (r5 >= 0) goto L_0x0390
            r5 = 0
        L_0x0390:
            r35 = r15
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r2.measure(r0, r15)
        L_0x039d:
            int r5 = r2.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r5)
            r0 = r32
            goto L_0x03b6
        L_0x03ab:
            r34 = r5
            r31 = r10
            r5 = r13
            r30 = r15
            r13 = r39
            r33 = r5
        L_0x03b6:
            int r5 = r8.leftMargin
            int r10 = r8.rightMargin
            int r5 = r5 + r10
            int r10 = r2.getMeasuredWidth()
            int r10 = r10 + r5
            int r14 = java.lang.Math.max(r14, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x03d1
            int r15 = r8.width
            r32 = r0
            r0 = -1
            if (r15 != r0) goto L_0x03d3
            r0 = 1
            goto L_0x03d4
        L_0x03d1:
            r32 = r0
        L_0x03d3:
            r0 = 0
        L_0x03d4:
            if (r0 == 0) goto L_0x03d8
            r15 = r5
            goto L_0x03d9
        L_0x03d8:
            r15 = r10
        L_0x03d9:
            int r1 = java.lang.Math.max(r1, r15)
            if (r17 == 0) goto L_0x03e8
            int r15 = r8.width
            r35 = r0
            r0 = -1
            if (r15 != r0) goto L_0x03eb
            r15 = 1
            goto L_0x03ec
        L_0x03e8:
            r35 = r0
            r0 = -1
        L_0x03eb:
            r15 = 0
        L_0x03ec:
            int r0 = r7.f880g
            int r17 = r2.getMeasuredHeight()
            int r17 = r0 + r17
            r36 = r1
            int r1 = r8.topMargin
            int r17 = r17 + r1
            int r1 = r8.bottomMargin
            int r17 = r17 + r1
            int r1 = r7.mo1144r(r2)
            int r1 = r17 + r1
            int r1 = java.lang.Math.max(r0, r1)
            r7.f880g = r1
            r17 = r15
            r0 = r32
            r1 = r36
        L_0x0410:
            int r3 = r3 + 1
            r8 = r28
            r10 = r29
            r15 = r30
            r13 = r33
            r5 = r34
            r2 = 0
            goto L_0x0316
        L_0x041f:
            r34 = r5
            r28 = r8
            r29 = r10
            r5 = r13
            r30 = r15
            r13 = r39
            int r2 = r7.f880g
            int r3 = r38.getPaddingTop()
            int r8 = r38.getPaddingBottom()
            int r3 = r3 + r8
            int r2 = r2 + r3
            r7.f880g = r2
        L_0x0439:
            if (r17 != 0) goto L_0x0440
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x0440
            r14 = r1
        L_0x0440:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r0 = r0 + r2
            int r14 = r14 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r14, r0)
            int r2 = android.view.View.resolveSizeAndState(r0, r13, r9)
            r7.setMeasuredDimension(r2, r11)
            if (r18 == 0) goto L_0x045e
            r7.mo1133l(r4, r6)
        L_0x045e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0158i0.mo1164z(int, int):void");
    }

    /* renamed from: l */
    public final void mo1133l(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = mo1145s(i);
            if (child.getVisibility() != 8) {
                C0159a lp = (C0159a) child.getLayoutParams();
                if (lp.width == -1) {
                    int oldHeight = lp.height;
                    lp.height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    lp.height = oldHeight;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:198:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x062c  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0634  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1162x(int r49, int r50) {
        /*
            r48 = this;
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = 0
            r7.f880g = r10
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            int r11 = r48.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r49)
            int r13 = android.view.View.MeasureSpec.getMode(r50)
            r6 = 0
            r14 = 0
            int[] r15 = r7.f883j
            if (r15 == 0) goto L_0x0025
            int[] r15 = r7.f884k
            if (r15 != 0) goto L_0x002e
        L_0x0025:
            r15 = 4
            int[] r10 = new int[r15]
            r7.f883j = r10
            int[] r10 = new int[r15]
            r7.f884k = r10
        L_0x002e:
            int[] r10 = r7.f883j
            int[] r15 = r7.f884k
            r17 = 3
            r18 = r6
            r6 = -1
            r10[r17] = r6
            r19 = 2
            r10[r19] = r6
            r20 = 1
            r10[r20] = r6
            r16 = 0
            r10[r16] = r6
            r15[r17] = r6
            r15[r19] = r6
            r15[r20] = r6
            r15[r16] = r6
            boolean r6 = r7.f875b
            r22 = r14
            boolean r14 = r7.f882i
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 != r9) goto L_0x005a
            r23 = 1
            goto L_0x005c
        L_0x005a:
            r23 = 0
        L_0x005c:
            r24 = 0
            r25 = 0
            r9 = r25
            r45 = r5
            r5 = r0
            r0 = r45
            r46 = r4
            r4 = r1
            r1 = r24
            r24 = r22
            r22 = r18
            r18 = r46
            r47 = r3
            r3 = r2
            r2 = r47
        L_0x0077:
            r28 = 0
            if (r9 >= r11) goto L_0x0257
            android.view.View r8 = r7.mo1145s(r9)
            if (r8 != 0) goto L_0x0097
            r30 = r1
            int r1 = r7.f880g
            int r26 = r7.mo1163y(r9)
            int r1 = r1 + r26
            r7.f880g = r1
            r21 = r6
            r31 = r11
            r1 = r30
            r30 = r12
            goto L_0x024b
        L_0x0097:
            r30 = r1
            int r1 = r8.getVisibility()
            r31 = r2
            r2 = 8
            if (r1 != r2) goto L_0x00b4
            int r1 = r7.mo1142p(r8, r9)
            int r9 = r9 + r1
            r21 = r6
            r1 = r30
            r2 = r31
            r31 = r11
            r30 = r12
            goto L_0x024b
        L_0x00b4:
            boolean r1 = r7.mo1158t(r9)
            if (r1 == 0) goto L_0x00c1
            int r1 = r7.f880g
            int r2 = r7.f886m
            int r1 = r1 + r2
            r7.f880g = r1
        L_0x00c1:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            r2 = r1
            a.b.p.i0$a r2 = (p000a.p002b.p011p.C0158i0.C0159a) r2
            float r1 = r2.f890a
            float r29 = r0 + r1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 != r0) goto L_0x012a
            int r0 = r2.width
            if (r0 != 0) goto L_0x012a
            int r0 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r0 <= 0) goto L_0x012a
            if (r23 == 0) goto L_0x00e8
            int r0 = r7.f880g
            int r1 = r2.leftMargin
            r32 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = r0 + r1
            r7.f880g = r0
            goto L_0x00f8
        L_0x00e8:
            r32 = r3
            int r0 = r7.f880g
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = java.lang.Math.max(r0, r1)
            r7.f880g = r1
        L_0x00f8:
            if (r6 == 0) goto L_0x0115
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L_0x01b1
        L_0x0115:
            r24 = 1
            r1 = r2
            r40 = r4
            r21 = r6
            r3 = r30
            r36 = r31
            r38 = r32
            r31 = r11
            r30 = r12
            r11 = -1
            r12 = r5
            goto L_0x01b1
        L_0x012a:
            r32 = r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r2.width
            if (r3 != 0) goto L_0x013c
            int r1 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x013c
            r0 = 0
            r1 = -2
            r2.width = r1
            r3 = r0
            goto L_0x013d
        L_0x013c:
            r3 = r0
        L_0x013d:
            int r0 = (r29 > r28 ? 1 : (r29 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0146
            int r0 = r7.f880g
            r33 = r0
            goto L_0x0148
        L_0x0146:
            r33 = 0
        L_0x0148:
            r34 = 0
            r0 = r48
            r35 = r30
            r1 = r8
            r37 = r2
            r36 = r31
            r2 = r9
            r39 = r3
            r38 = r32
            r3 = r49
            r40 = r4
            r4 = r33
            r30 = r12
            r12 = r5
            r5 = r50
            r21 = r6
            r31 = r11
            r11 = -1
            r6 = r34
            r0.mo1161w(r1, r2, r3, r4, r5, r6)
            r0 = r39
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0178
            r1 = r37
            r1.width = r0
            goto L_0x017a
        L_0x0178:
            r1 = r37
        L_0x017a:
            int r2 = r8.getMeasuredWidth()
            if (r23 == 0) goto L_0x0191
            int r3 = r7.f880g
            int r4 = r1.leftMargin
            int r4 = r4 + r2
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.mo1144r(r8)
            int r4 = r4 + r5
            int r3 = r3 + r4
            r7.f880g = r3
            goto L_0x01a6
        L_0x0191:
            int r3 = r7.f880g
            int r4 = r3 + r2
            int r5 = r1.leftMargin
            int r4 = r4 + r5
            int r5 = r1.rightMargin
            int r4 = r4 + r5
            int r5 = r7.mo1144r(r8)
            int r4 = r4 + r5
            int r4 = java.lang.Math.max(r3, r4)
            r7.f880g = r4
        L_0x01a6:
            if (r14 == 0) goto L_0x01af
            r3 = r35
            int r3 = java.lang.Math.max(r2, r3)
            goto L_0x01b1
        L_0x01af:
            r3 = r35
        L_0x01b1:
            r0 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x01bd
            int r2 = r1.height
            if (r2 != r11) goto L_0x01bd
            r22 = 1
            r0 = 1
        L_0x01bd:
            int r2 = r1.topMargin
            int r4 = r1.bottomMargin
            int r2 = r2 + r4
            int r4 = r8.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r8.getMeasuredState()
            r6 = r40
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r21 == 0) goto L_0x0205
            int r6 = r8.getBaseline()
            if (r6 == r11) goto L_0x0200
            int r11 = r1.f891b
            if (r11 >= 0) goto L_0x01df
            int r11 = r7.f879f
        L_0x01df:
            r11 = r11 & 112(0x70, float:1.57E-43)
            int r26 = r11 >> 4
            r27 = -2
            r26 = r26 & -2
            int r26 = r26 >> 1
            r27 = r2
            r2 = r10[r26]
            int r2 = java.lang.Math.max(r2, r6)
            r10[r26] = r2
            r2 = r15[r26]
            r33 = r3
            int r3 = r4 - r6
            int r2 = java.lang.Math.max(r2, r3)
            r15[r26] = r2
            goto L_0x0209
        L_0x0200:
            r27 = r2
            r33 = r3
            goto L_0x0209
        L_0x0205:
            r27 = r2
            r33 = r3
        L_0x0209:
            int r2 = java.lang.Math.max(r12, r4)
            if (r18 == 0) goto L_0x0216
            int r3 = r1.height
            r6 = -1
            if (r3 != r6) goto L_0x0216
            r3 = 1
            goto L_0x0217
        L_0x0216:
            r3 = 0
        L_0x0217:
            float r6 = r1.f890a
            int r6 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r6 <= 0) goto L_0x022a
            if (r0 == 0) goto L_0x0222
            r6 = r27
            goto L_0x0223
        L_0x0222:
            r6 = r4
        L_0x0223:
            r11 = r36
            int r6 = java.lang.Math.max(r11, r6)
            goto L_0x023b
        L_0x022a:
            r11 = r36
            if (r0 == 0) goto L_0x0231
            r6 = r27
            goto L_0x0232
        L_0x0231:
            r6 = r4
        L_0x0232:
            r12 = r38
            int r6 = java.lang.Math.max(r12, r6)
            r38 = r6
            r6 = r11
        L_0x023b:
            int r11 = r7.mo1142p(r8, r9)
            int r9 = r9 + r11
            r18 = r3
            r4 = r5
            r0 = r29
            r1 = r33
            r3 = r38
            r5 = r2
            r2 = r6
        L_0x024b:
            int r9 = r9 + 1
            r8 = r49
            r6 = r21
            r12 = r30
            r11 = r31
            goto L_0x0077
        L_0x0257:
            r21 = r6
            r31 = r11
            r30 = r12
            r11 = r2
            r2 = r3
            r6 = r4
            r12 = r5
            r3 = r1
            int r1 = r7.f880g
            if (r1 <= 0) goto L_0x0276
            r1 = r31
            boolean r4 = r7.mo1158t(r1)
            if (r4 == 0) goto L_0x0278
            int r4 = r7.f880g
            int r5 = r7.f886m
            int r4 = r4 + r5
            r7.f880g = r4
            goto L_0x0278
        L_0x0276:
            r1 = r31
        L_0x0278:
            r4 = r10[r20]
            r5 = -1
            if (r4 != r5) goto L_0x028f
            r4 = 0
            r8 = r10[r4]
            if (r8 != r5) goto L_0x028f
            r4 = r10[r19]
            if (r4 != r5) goto L_0x028f
            r4 = r10[r17]
            if (r4 == r5) goto L_0x028b
            goto L_0x028f
        L_0x028b:
            r40 = r6
            r5 = r12
            goto L_0x02c2
        L_0x028f:
            r4 = r10[r17]
            r5 = 0
            r8 = r10[r5]
            r9 = r10[r20]
            r5 = r10[r19]
            int r5 = java.lang.Math.max(r9, r5)
            int r5 = java.lang.Math.max(r8, r5)
            int r4 = java.lang.Math.max(r4, r5)
            r5 = r15[r17]
            r8 = 0
            r9 = r15[r8]
            r8 = r15[r20]
            r40 = r6
            r6 = r15[r19]
            int r6 = java.lang.Math.max(r8, r6)
            int r6 = java.lang.Math.max(r9, r6)
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r4 + r5
            int r6 = java.lang.Math.max(r12, r6)
            r5 = r6
        L_0x02c2:
            if (r14 == 0) goto L_0x033e
            r4 = r30
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r6) goto L_0x02d1
            if (r4 != 0) goto L_0x02cd
            goto L_0x02d1
        L_0x02cd:
            r26 = r5
            goto L_0x0342
        L_0x02d1:
            r6 = 0
            r7.f880g = r6
            r6 = 0
        L_0x02d5:
            if (r6 >= r1) goto L_0x0339
            android.view.View r8 = r7.mo1145s(r6)
            if (r8 != 0) goto L_0x02eb
            int r9 = r7.f880g
            int r12 = r7.mo1163y(r6)
            int r9 = r9 + r12
            r7.f880g = r9
            r26 = r5
            r30 = r6
            goto L_0x0332
        L_0x02eb:
            int r9 = r8.getVisibility()
            r12 = 8
            if (r9 != r12) goto L_0x02fb
            int r9 = r7.mo1142p(r8, r6)
            int r6 = r6 + r9
            r26 = r5
            goto L_0x0334
        L_0x02fb:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            a.b.p.i0$a r9 = (p000a.p002b.p011p.C0158i0.C0159a) r9
            if (r23 == 0) goto L_0x0319
            int r12 = r7.f880g
            r26 = r5
            int r5 = r9.leftMargin
            int r5 = r5 + r3
            r30 = r6
            int r6 = r9.rightMargin
            int r5 = r5 + r6
            int r6 = r7.mo1144r(r8)
            int r5 = r5 + r6
            int r12 = r12 + r5
            r7.f880g = r12
            goto L_0x0332
        L_0x0319:
            r26 = r5
            r30 = r6
            int r5 = r7.f880g
            int r6 = r5 + r3
            int r12 = r9.leftMargin
            int r6 = r6 + r12
            int r12 = r9.rightMargin
            int r6 = r6 + r12
            int r12 = r7.mo1144r(r8)
            int r6 = r6 + r12
            int r6 = java.lang.Math.max(r5, r6)
            r7.f880g = r6
        L_0x0332:
            r6 = r30
        L_0x0334:
            int r6 = r6 + 1
            r5 = r26
            goto L_0x02d5
        L_0x0339:
            r26 = r5
            r30 = r6
            goto L_0x0342
        L_0x033e:
            r26 = r5
            r4 = r30
        L_0x0342:
            int r5 = r7.f880g
            int r6 = r48.getPaddingLeft()
            int r8 = r48.getPaddingRight()
            int r6 = r6 + r8
            int r5 = r5 + r6
            r7.f880g = r5
            int r5 = r7.f880g
            int r6 = r48.getSuggestedMinimumWidth()
            int r5 = java.lang.Math.max(r5, r6)
            r6 = r49
            r8 = 0
            int r9 = android.view.View.resolveSizeAndState(r5, r6, r8)
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r9 & r8
            int r8 = r7.f880g
            int r8 = r5 - r8
            if (r24 != 0) goto L_0x0410
            if (r8 == 0) goto L_0x037d
            int r30 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r30 <= 0) goto L_0x037d
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0419
        L_0x037d:
            int r2 = java.lang.Math.max(r2, r11)
            if (r14 == 0) goto L_0x03f0
            r12 = 1073741824(0x40000000, float:2.0)
            if (r4 == r12) goto L_0x03f0
            r12 = 0
        L_0x0388:
            if (r12 >= r1) goto L_0x03e5
            r31 = r0
            android.view.View r0 = r7.mo1145s(r12)
            if (r0 == 0) goto L_0x03d2
            r16 = r2
            int r2 = r0.getVisibility()
            r33 = r5
            r5 = 8
            if (r2 != r5) goto L_0x03a3
            r35 = r3
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x03da
        L_0x03a3:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            a.b.p.i0$a r2 = (p000a.p002b.p011p.C0158i0.C0159a) r2
            float r5 = r2.f890a
            int r17 = (r5 > r28 ? 1 : (r5 == r28 ? 0 : -1))
            if (r17 <= 0) goto L_0x03c9
            r17 = r2
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r35 = r3
            int r3 = r0.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r0.measure(r5, r3)
            goto L_0x03da
        L_0x03c9:
            r17 = r2
            r35 = r3
            r19 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x03da
        L_0x03d2:
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x03da:
            int r12 = r12 + 1
            r2 = r16
            r0 = r31
            r5 = r33
            r3 = r35
            goto L_0x0388
        L_0x03e5:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x03fa
        L_0x03f0:
            r31 = r0
            r16 = r2
            r35 = r3
            r33 = r5
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x03fa:
            r12 = r50
            r34 = r1
            r25 = r9
            r36 = r11
            r2 = r16
            r5 = r26
            r26 = r14
            r45 = r40
            r40 = r4
            r4 = r45
            goto L_0x0603
        L_0x0410:
            r31 = r0
            r35 = r3
            r33 = r5
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0419:
            float r0 = r7.f881h
            int r5 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r5 <= 0) goto L_0x0420
            goto L_0x0422
        L_0x0420:
            r0 = r31
        L_0x0422:
            r5 = -1
            r10[r17] = r5
            r10[r19] = r5
            r10[r20] = r5
            r12 = 0
            r10[r12] = r5
            r15[r17] = r5
            r15[r19] = r5
            r15[r20] = r5
            r15[r12] = r5
            r5 = -1
            r7.f880g = r12
            r12 = 0
            r2 = r12
            r12 = r8
            r8 = r5
            r5 = r40
        L_0x043d:
            if (r2 >= r1) goto L_0x05a0
            r36 = r11
            android.view.View r11 = r7.mo1145s(r2)
            if (r11 == 0) goto L_0x0582
            r26 = r14
            int r14 = r11.getVisibility()
            r34 = r1
            r1 = 8
            if (r14 != r1) goto L_0x045e
            r40 = r4
            r25 = r9
            r1 = r12
            r27 = -2
            r12 = r50
            goto L_0x058f
        L_0x045e:
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            a.b.p.i0$a r14 = (p000a.p002b.p011p.C0158i0.C0159a) r14
            float r1 = r14.f890a
            int r37 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r37 <= 0) goto L_0x04d1
            float r6 = (float) r12
            float r6 = r6 * r1
            float r6 = r6 / r0
            int r6 = (int) r6
            float r0 = r0 - r1
            int r12 = r12 - r6
            int r37 = r48.getPaddingTop()
            int r38 = r48.getPaddingBottom()
            int r37 = r37 + r38
            r38 = r0
            int r0 = r14.topMargin
            int r37 = r37 + r0
            int r0 = r14.bottomMargin
            int r0 = r37 + r0
            r37 = r1
            int r1 = r14.height
            r25 = r9
            r39 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r12, r0, r1)
            int r1 = r14.width
            if (r1 != 0) goto L_0x04ad
            if (r4 == r9) goto L_0x049e
            goto L_0x04ad
        L_0x049e:
            if (r6 <= 0) goto L_0x04a2
            r1 = r6
            goto L_0x04a3
        L_0x04a2:
            r1 = 0
        L_0x04a3:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r1, r0)
            r40 = r4
            goto L_0x04c0
        L_0x04ad:
            int r1 = r11.getMeasuredWidth()
            int r1 = r1 + r6
            if (r1 >= 0) goto L_0x04b5
            r1 = 0
        L_0x04b5:
            r40 = r4
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r11.measure(r4, r0)
        L_0x04c0:
            int r1 = r11.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            int r5 = android.view.View.combineMeasuredStates(r5, r1)
            r0 = r38
            r1 = r39
            goto L_0x04dc
        L_0x04d1:
            r37 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r9 = 1073741824(0x40000000, float:2.0)
            r12 = r50
        L_0x04dc:
            if (r23 == 0) goto L_0x04f3
            int r4 = r7.f880g
            int r6 = r11.getMeasuredWidth()
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.mo1144r(r11)
            int r6 = r6 + r9
            int r4 = r4 + r6
            r7.f880g = r4
            goto L_0x050b
        L_0x04f3:
            int r4 = r7.f880g
            int r6 = r11.getMeasuredWidth()
            int r6 = r6 + r4
            int r9 = r14.leftMargin
            int r6 = r6 + r9
            int r9 = r14.rightMargin
            int r6 = r6 + r9
            int r9 = r7.mo1144r(r11)
            int r6 = r6 + r9
            int r6 = java.lang.Math.max(r4, r6)
            r7.f880g = r6
        L_0x050b:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x0516
            int r4 = r14.height
            r6 = -1
            if (r4 != r6) goto L_0x0516
            r4 = 1
            goto L_0x0517
        L_0x0516:
            r4 = 0
        L_0x0517:
            int r6 = r14.topMargin
            int r9 = r14.bottomMargin
            int r6 = r6 + r9
            int r9 = r11.getMeasuredHeight()
            int r9 = r9 + r6
            int r8 = java.lang.Math.max(r8, r9)
            r39 = r0
            if (r4 == 0) goto L_0x052b
            r0 = r6
            goto L_0x052c
        L_0x052b:
            r0 = r9
        L_0x052c:
            int r0 = java.lang.Math.max(r3, r0)
            if (r18 == 0) goto L_0x053b
            int r3 = r14.height
            r41 = r0
            r0 = -1
            if (r3 != r0) goto L_0x053d
            r0 = 1
            goto L_0x053e
        L_0x053b:
            r41 = r0
        L_0x053d:
            r0 = 0
        L_0x053e:
            if (r21 == 0) goto L_0x0575
            int r3 = r11.getBaseline()
            r18 = r0
            r0 = -1
            if (r3 == r0) goto L_0x0570
            int r0 = r14.f891b
            if (r0 >= 0) goto L_0x054f
            int r0 = r7.f879f
        L_0x054f:
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r42 = r0 >> 4
            r27 = -2
            r42 = r42 & -2
            int r42 = r42 >> 1
            r43 = r0
            r0 = r10[r42]
            int r0 = java.lang.Math.max(r0, r3)
            r10[r42] = r0
            r0 = r15[r42]
            r44 = r1
            int r1 = r9 - r3
            int r0 = java.lang.Math.max(r0, r1)
            r15[r42] = r0
            goto L_0x057b
        L_0x0570:
            r44 = r1
            r27 = -2
            goto L_0x057b
        L_0x0575:
            r18 = r0
            r44 = r1
            r27 = -2
        L_0x057b:
            r0 = r39
            r3 = r41
            r1 = r44
            goto L_0x058f
        L_0x0582:
            r34 = r1
            r40 = r4
            r25 = r9
            r1 = r12
            r26 = r14
            r27 = -2
            r12 = r50
        L_0x058f:
            int r2 = r2 + 1
            r6 = r49
            r12 = r1
            r9 = r25
            r14 = r26
            r1 = r34
            r11 = r36
            r4 = r40
            goto L_0x043d
        L_0x05a0:
            r34 = r1
            r40 = r4
            r25 = r9
            r36 = r11
            r1 = r12
            r26 = r14
            r12 = r50
            int r2 = r7.f880g
            int r4 = r48.getPaddingLeft()
            int r6 = r48.getPaddingRight()
            int r4 = r4 + r6
            int r2 = r2 + r4
            r7.f880g = r2
            r2 = r10[r20]
            r4 = -1
            if (r2 != r4) goto L_0x05d0
            r2 = 0
            r6 = r10[r2]
            if (r6 != r4) goto L_0x05d0
            r2 = r10[r19]
            if (r2 != r4) goto L_0x05d0
            r2 = r10[r17]
            if (r2 == r4) goto L_0x05ce
            goto L_0x05d0
        L_0x05ce:
            r6 = r8
            goto L_0x05ff
        L_0x05d0:
            r2 = r10[r17]
            r4 = 0
            r6 = r10[r4]
            r9 = r10[r20]
            r11 = r10[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r6 = java.lang.Math.max(r6, r9)
            int r2 = java.lang.Math.max(r2, r6)
            r6 = r15[r17]
            r4 = r15[r4]
            r9 = r15[r20]
            r11 = r15[r19]
            int r9 = java.lang.Math.max(r9, r11)
            int r4 = java.lang.Math.max(r4, r9)
            int r4 = java.lang.Math.max(r6, r4)
            int r6 = r2 + r4
            int r6 = java.lang.Math.max(r8, r6)
        L_0x05ff:
            r8 = r1
            r2 = r3
            r4 = r5
            r5 = r6
        L_0x0603:
            if (r18 != 0) goto L_0x060a
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 == r0) goto L_0x060a
            r5 = r2
        L_0x060a:
            int r0 = r48.getPaddingTop()
            int r1 = r48.getPaddingBottom()
            int r0 = r0 + r1
            int r5 = r5 + r0
            int r0 = r48.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r5, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r4
            r1 = r25 | r1
            int r3 = r4 << 16
            int r3 = android.view.View.resolveSizeAndState(r0, r12, r3)
            r7.setMeasuredDimension(r1, r3)
            if (r22 == 0) goto L_0x0634
            r1 = r49
            r3 = r34
            r7.mo1132k(r3, r1)
            goto L_0x0638
        L_0x0634:
            r1 = r49
            r3 = r34
        L_0x0638:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0158i0.mo1162x(int, int):void");
    }

    /* renamed from: k */
    public final void mo1132k(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = mo1145s(i);
            if (child.getVisibility() != 8) {
                C0159a lp = (C0159a) child.getLayoutParams();
                if (lp.height == -1) {
                    int oldWidth = lp.width;
                    lp.width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    lp.width = oldWidth;
                }
            }
        }
    }

    /* renamed from: p */
    public int mo1142p(View child, int index) {
        return 0;
    }

    /* renamed from: y */
    public int mo1163y(int childIndex) {
        return 0;
    }

    /* renamed from: w */
    public void mo1161w(View child, int childIndex, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* renamed from: q */
    public int mo1143q(View child) {
        return 0;
    }

    /* renamed from: r */
    public int mo1144r(View child) {
        return 0;
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.f878e == 1) {
            mo1160v(l, t, r, b);
        } else {
            mo1159u(l, t, r, b);
        }
    }

    /* renamed from: v */
    public void mo1160v(int left, int top, int right, int bottom) {
        int childTop;
        int paddingLeft;
        int gravity;
        int childLeft;
        int paddingLeft2 = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft2) - getPaddingRight();
        int count = getVirtualChildCount();
        int i = this.f879f;
        int majorGravity = i & 112;
        int minorGravity = i & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - this.f880g) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - this.f880g;
        }
        int i2 = 0;
        while (i2 < count) {
            View child = mo1145s(i2);
            if (child == null) {
                childTop += mo1163y(i2);
                paddingLeft = paddingLeft2;
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                C0159a lp = (C0159a) child.getLayoutParams();
                int gravity2 = lp.f891b;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int layoutDirection = C0460r.m2292v(this);
                int b = C0444c.m2174b(gravity, layoutDirection) & 7;
                if (b == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft2) + lp.leftMargin) - lp.rightMargin;
                } else if (b != 5) {
                    childLeft = lp.leftMargin + paddingLeft2;
                } else {
                    childLeft = (childRight - childWidth) - lp.rightMargin;
                }
                if (mo1158t(i2) != 0) {
                    childTop += this.f887n;
                }
                int childTop2 = childTop + lp.topMargin;
                int i3 = layoutDirection;
                int i4 = gravity;
                paddingLeft = paddingLeft2;
                mo1113A(child, childLeft, childTop2 + mo1143q(child), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + lp.bottomMargin + mo1144r(child);
                i2 += mo1142p(child, i2);
                childTop = childTop3;
            } else {
                paddingLeft = paddingLeft2;
            }
            i2++;
            paddingLeft2 = paddingLeft;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1159u(int r34, int r35, int r36, int r37) {
        /*
            r33 = this;
            r6 = r33
            boolean r7 = p000a.p002b.p011p.C0140c1.m788b(r33)
            int r8 = r33.getPaddingTop()
            int r9 = r37 - r35
            int r0 = r33.getPaddingBottom()
            int r10 = r9 - r0
            int r0 = r9 - r8
            int r1 = r33.getPaddingBottom()
            int r11 = r0 - r1
            int r12 = r33.getVirtualChildCount()
            int r0 = r6.f879f
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r13 = r0 & r1
            r14 = r0 & 112(0x70, float:1.57E-43)
            boolean r15 = r6.f875b
            int[] r5 = r6.f883j
            int[] r4 = r6.f884k
            int r3 = p000a.p025h.p038m.C0460r.m2292v(r33)
            int r0 = p000a.p025h.p038m.C0444c.m2174b(r13, r3)
            r16 = 2
            r2 = 1
            if (r0 == r2) goto L_0x004e
            r1 = 5
            if (r0 == r1) goto L_0x0042
            int r0 = r33.getPaddingLeft()
            goto L_0x005b
        L_0x0042:
            int r0 = r33.getPaddingLeft()
            int r0 = r0 + r36
            int r0 = r0 - r34
            int r1 = r6.f880g
            int r0 = r0 - r1
            goto L_0x005b
        L_0x004e:
            int r0 = r33.getPaddingLeft()
            int r1 = r36 - r34
            int r2 = r6.f880g
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x005b:
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0067
            int r1 = r12 + -1
            r2 = -1
            r18 = r1
            r19 = r2
            goto L_0x006b
        L_0x0067:
            r18 = r1
            r19 = r2
        L_0x006b:
            r1 = 0
            r2 = r1
        L_0x006d:
            if (r2 >= r12) goto L_0x0177
            int r1 = r19 * r2
            int r1 = r18 + r1
            r20 = r7
            android.view.View r7 = r6.mo1145s(r1)
            if (r7 != 0) goto L_0x0091
            int r21 = r6.mo1163y(r1)
            int r0 = r0 + r21
            r22 = r3
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r12
            r21 = 1
            goto L_0x0165
        L_0x0091:
            r21 = r2
            int r2 = r7.getVisibility()
            r22 = r3
            r3 = 8
            if (r2 == r3) goto L_0x0154
            int r23 = r7.getMeasuredWidth()
            int r24 = r7.getMeasuredHeight()
            r2 = -1
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            a.b.p.i0$a r3 = (p000a.p002b.p011p.C0158i0.C0159a) r3
            r25 = r2
            r2 = -1
            if (r15 == 0) goto L_0x00bd
            r26 = r9
            int r9 = r3.height
            if (r9 == r2) goto L_0x00bf
            int r9 = r7.getBaseline()
            goto L_0x00c1
        L_0x00bd:
            r26 = r9
        L_0x00bf:
            r9 = r25
        L_0x00c1:
            int r2 = r3.f891b
            if (r2 >= 0) goto L_0x00c9
            r2 = r14
            r27 = r2
            goto L_0x00cb
        L_0x00c9:
            r27 = r2
        L_0x00cb:
            r2 = r27 & 112(0x70, float:1.57E-43)
            r28 = r12
            r12 = 16
            if (r2 == r12) goto L_0x0107
            r12 = 48
            if (r2 == r12) goto L_0x00f5
            r12 = 80
            if (r2 == r12) goto L_0x00de
            r2 = r8
            r12 = r2
            goto L_0x0114
        L_0x00de:
            int r2 = r10 - r24
            int r12 = r3.bottomMargin
            int r2 = r2 - r12
            r12 = -1
            if (r9 == r12) goto L_0x00f3
            int r12 = r7.getMeasuredHeight()
            int r12 = r12 - r9
            r25 = r4[r16]
            int r25 = r25 - r12
            int r2 = r2 - r25
            r12 = r2
            goto L_0x0114
        L_0x00f3:
            r12 = r2
            goto L_0x0114
        L_0x00f5:
            int r2 = r3.topMargin
            int r2 = r2 + r8
            r12 = -1
            if (r9 == r12) goto L_0x0104
            r12 = 1
            r17 = r5[r12]
            int r17 = r17 - r9
            int r2 = r2 + r17
            r12 = r2
            goto L_0x0114
        L_0x0104:
            r12 = 1
            r12 = r2
            goto L_0x0114
        L_0x0107:
            r12 = 1
            int r2 = r11 - r24
            int r2 = r2 / 2
            int r2 = r2 + r8
            int r12 = r3.topMargin
            int r2 = r2 + r12
            int r12 = r3.bottomMargin
            int r2 = r2 - r12
            r12 = r2
        L_0x0114:
            boolean r2 = r6.mo1158t(r1)
            if (r2 == 0) goto L_0x011d
            int r2 = r6.f886m
            int r0 = r0 + r2
        L_0x011d:
            int r2 = r3.leftMargin
            int r25 = r0 + r2
            int r0 = r6.mo1143q(r7)
            int r2 = r25 + r0
            r0 = r33
            r29 = r8
            r8 = r1
            r1 = r7
            r17 = r21
            r21 = 1
            r30 = r9
            r9 = r3
            r3 = r12
            r31 = r4
            r4 = r23
            r32 = r5
            r5 = r24
            r0.mo1113A(r1, r2, r3, r4, r5)
            int r0 = r9.rightMargin
            int r0 = r23 + r0
            int r1 = r6.mo1144r(r7)
            int r0 = r0 + r1
            int r25 = r25 + r0
            int r0 = r6.mo1142p(r7, r8)
            int r2 = r17 + r0
            r0 = r25
            goto L_0x0165
        L_0x0154:
            r31 = r4
            r32 = r5
            r29 = r8
            r26 = r9
            r28 = r12
            r17 = r21
            r21 = 1
            r8 = r1
            r2 = r17
        L_0x0165:
            int r2 = r2 + 1
            r7 = r20
            r3 = r22
            r9 = r26
            r12 = r28
            r8 = r29
            r4 = r31
            r5 = r32
            goto L_0x006d
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0158i0.mo1159u(int, int, int, int):void");
    }

    /* renamed from: A */
    public final void mo1113A(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f878e != orientation) {
            this.f878e = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f878e;
    }

    public void setGravity(int gravity) {
        if (this.f879f != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & 112) == 0) {
                gravity |= 48;
            }
            this.f879f = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f879f;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i = this.f879f;
        if ((8388615 & i) != gravity) {
            this.f879f = (-8388616 & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & 112;
        int i = this.f879f;
        if ((i & 112) != gravity) {
            this.f879f = (i & -113) | gravity;
            requestLayout();
        }
    }

    /* renamed from: n */
    public C0159a generateLayoutParams(AttributeSet attrs) {
        return new C0159a(getContext(), attrs);
    }

    /* renamed from: m */
    public C0159a generateDefaultLayoutParams() {
        int i = this.f878e;
        if (i == 0) {
            return new C0159a(-2, -2);
        }
        if (i == 1) {
            return new C0159a(-1, -2);
        }
        return null;
    }

    /* renamed from: o */
    public C0159a generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0159a(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0159a;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* renamed from: a.b.p.i0$a */
    public static class C0159a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f890a;

        /* renamed from: b */
        public int f891b;

        public C0159a(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f891b = -1;
            TypedArray a = c.obtainStyledAttributes(attrs, C0012j.f114a1);
            this.f890a = a.getFloat(C0012j.f124c1, 0.0f);
            this.f891b = a.getInt(C0012j.f119b1, -1);
            a.recycle();
        }

        public C0159a(int width, int height) {
            super(width, height);
            this.f891b = -1;
            this.f890a = 0.0f;
        }

        public C0159a(ViewGroup.LayoutParams p) {
            super(p);
            this.f891b = -1;
        }
    }
}
