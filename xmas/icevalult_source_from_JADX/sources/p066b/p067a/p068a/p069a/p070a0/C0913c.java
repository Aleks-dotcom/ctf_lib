package p066b.p067a.p068a.p069a.p070a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p000a.p025h.p038m.C0448f;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C1020k;

/* renamed from: b.a.a.a.a0.c */
public class C0913c extends ViewGroup {

    /* renamed from: b */
    public int f3819b;

    /* renamed from: c */
    public int f3820c;

    /* renamed from: d */
    public boolean f3821d;

    public C0913c(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0913c(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3821d = false;
        mo5489c(context, attrs);
    }

    /* renamed from: c */
    public final void mo5489c(Context context, AttributeSet attrs) {
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, C1020k.f4265o0, 0, 0);
        this.f3819b = array.getDimensionPixelSize(C1020k.f4273q0, 0);
        this.f3820c = array.getDimensionPixelSize(C1020k.f4269p0, 0);
        array.recycle();
    }

    public int getLineSpacing() {
        return this.f3819b;
    }

    public void setLineSpacing(int lineSpacing) {
        this.f3819b = lineSpacing;
    }

    public int getItemSpacing() {
        return this.f3820c;
    }

    public void setItemSpacing(int itemSpacing) {
        this.f3820c = itemSpacing;
    }

    /* renamed from: b */
    public boolean mo5488b() {
        return this.f3821d;
    }

    public void setSingleLine(boolean singleLine) {
        this.f3821d = singleLine;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int maxWidth;
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int maxWidth2 = (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) ? width : Integer.MAX_VALUE;
        int childLeft = getPaddingLeft();
        int childTop = getPaddingTop();
        int childBottom = childTop;
        int i = childLeft;
        int maxChildRight = 0;
        int maxRight = maxWidth2 - getPaddingRight();
        int i2 = 0;
        while (i2 < getChildCount()) {
            View child = getChildAt(i2);
            if (child.getVisibility() == 8) {
                int i3 = widthMeasureSpec;
                int i4 = heightMeasureSpec;
                maxWidth = maxWidth2;
            } else {
                measureChild(child, widthMeasureSpec, heightMeasureSpec);
                maxWidth = maxWidth2;
                ViewGroup.LayoutParams lp = child.getLayoutParams();
                int leftMargin = 0;
                int rightMargin = 0;
                int childTop2 = childTop;
                if ((lp instanceof ViewGroup.MarginLayoutParams) != 0) {
                    ViewGroup.MarginLayoutParams marginLp = (ViewGroup.MarginLayoutParams) lp;
                    ViewGroup.LayoutParams layoutParams = lp;
                    leftMargin = 0 + marginLp.leftMargin;
                    rightMargin = 0 + marginLp.rightMargin;
                }
                if (childLeft + leftMargin + child.getMeasuredWidth() <= maxRight || mo5488b()) {
                    childTop = childTop2;
                } else {
                    childLeft = getPaddingLeft();
                    childTop = this.f3819b + childBottom;
                }
                int childRight = childLeft + leftMargin + child.getMeasuredWidth();
                int childBottom2 = child.getMeasuredHeight() + childTop;
                if (childRight > maxChildRight) {
                    maxChildRight = childRight;
                }
                int childBottom3 = childBottom2;
                childLeft += leftMargin + rightMargin + child.getMeasuredWidth() + this.f3820c;
                if (i2 == getChildCount() - 1) {
                    maxChildRight += rightMargin;
                    childBottom = childBottom3;
                } else {
                    childBottom = childBottom3;
                }
            }
            i2++;
            maxWidth2 = maxWidth;
        }
        int i5 = childTop;
        setMeasuredDimension(m5023a(width, widthMode, maxChildRight + getPaddingRight()), m5023a(height, heightMode, childBottom + getPaddingBottom()));
    }

    /* renamed from: a */
    public static int m5023a(int size, int mode, int childrenEdge) {
        if (mode == Integer.MIN_VALUE) {
            return Math.min(childrenEdge, size);
        }
        if (mode != 1073741824) {
            return childrenEdge;
        }
        return size;
    }

    public void onLayout(boolean sizeChanged, int left, int top, int right, int bottom) {
        if (getChildCount() != 0) {
            boolean z = true;
            if (C0460r.m2292v(this) != 1) {
                z = false;
            }
            boolean isRtl = z;
            int paddingStart = isRtl ? getPaddingRight() : getPaddingLeft();
            int paddingEnd = isRtl ? getPaddingLeft() : getPaddingRight();
            int childStart = paddingStart;
            int childTop = getPaddingTop();
            int childBottom = childTop;
            int maxChildEnd = (right - left) - paddingEnd;
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                if (child.getVisibility() != 8) {
                    ViewGroup.LayoutParams lp = child.getLayoutParams();
                    int startMargin = 0;
                    int endMargin = 0;
                    if (lp instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLp = (ViewGroup.MarginLayoutParams) lp;
                        startMargin = C0448f.m2185b(marginLp);
                        endMargin = C0448f.m2184a(marginLp);
                    }
                    int childEnd = childStart + startMargin + child.getMeasuredWidth();
                    if (!this.f3821d && childEnd > maxChildEnd) {
                        childStart = paddingStart;
                        childTop = childBottom + this.f3819b;
                    }
                    int childEnd2 = childStart + startMargin + child.getMeasuredWidth();
                    int childBottom2 = child.getMeasuredHeight() + childTop;
                    if (isRtl) {
                        child.layout(maxChildEnd - childEnd2, childTop, (maxChildEnd - childStart) - startMargin, childBottom2);
                    } else {
                        child.layout(childStart + startMargin, childTop, childEnd2, childBottom2);
                    }
                    childStart += startMargin + endMargin + child.getMeasuredWidth() + this.f3820c;
                    childBottom = childBottom2;
                }
            }
        }
    }
}
