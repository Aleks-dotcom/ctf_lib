package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.C0008f;
import p000a.p002b.C0012j;
import p000a.p025h.p038m.C0460r;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f3112b;

    /* renamed from: c */
    public int f3113c = -1;

    /* renamed from: d */
    public int f3114d = 0;

    public ButtonBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        int[] iArr = C0012j.f45J0;
        TypedArray ta = context.obtainStyledAttributes(attrs, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attrs, ta, 0, 0);
        }
        this.f3112b = ta.getBoolean(C0012j.f49K0, true);
        ta.recycle();
    }

    public void setAllowStacking(boolean allowStacking) {
        if (this.f3112b != allowStacking) {
            this.f3112b = allowStacking;
            if (!allowStacking && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int initialWidthMeasureSpec;
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.f3112b) {
            if (widthSize > this.f3113c && mo4037b()) {
                setStacked(false);
            }
            this.f3113c = widthSize;
        }
        boolean needsRemeasure = false;
        if (mo4037b() || View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            initialWidthMeasureSpec = widthMeasureSpec;
        } else {
            initialWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize, RecyclerView.UNDEFINED_DURATION);
            needsRemeasure = true;
        }
        super.onMeasure(initialWidthMeasureSpec, heightMeasureSpec);
        if (this.f3112b && !mo4037b()) {
            if ((-16777216 & getMeasuredWidthAndState()) == 16777216) {
                setStacked(true);
                needsRemeasure = true;
            }
        }
        if (needsRemeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int minHeight = 0;
        int firstVisible = mo4036a(0);
        if (firstVisible >= 0) {
            View firstButton = getChildAt(firstVisible);
            LinearLayout.LayoutParams firstParams = (LinearLayout.LayoutParams) firstButton.getLayoutParams();
            minHeight = 0 + getPaddingTop() + firstButton.getMeasuredHeight() + firstParams.topMargin + firstParams.bottomMargin;
            if (mo4037b()) {
                int secondVisible = mo4036a(firstVisible + 1);
                if (secondVisible >= 0) {
                    minHeight += getChildAt(secondVisible).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                minHeight += getPaddingBottom();
            }
        }
        if (C0460r.m2293w(this) != minHeight) {
            setMinimumHeight(minHeight);
        }
    }

    /* renamed from: a */
    public final int mo4036a(int index) {
        int count = getChildCount();
        for (int i = index; i < count; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f3114d, super.getMinimumHeight());
    }

    private void setStacked(boolean stacked) {
        setOrientation(stacked);
        setGravity(stacked ? 5 : 80);
        View spacer = findViewById(C0008f.spacer);
        if (spacer != null) {
            spacer.setVisibility(stacked ? 8 : 4);
        }
        for (int i = getChildCount() - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
    }

    /* renamed from: b */
    public final boolean mo4037b() {
        return getOrientation() == 1;
    }
}
