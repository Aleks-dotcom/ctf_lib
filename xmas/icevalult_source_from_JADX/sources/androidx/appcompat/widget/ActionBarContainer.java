package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.C0008f;
import p000a.p002b.C0012j;
import p000a.p002b.p011p.C0128b;
import p000a.p002b.p011p.C0188p0;
import p000a.p025h.p038m.C0460r;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f3039b;

    /* renamed from: c */
    public View f3040c;

    /* renamed from: d */
    public View f3041d;

    /* renamed from: e */
    public View f3042e;

    /* renamed from: f */
    public Drawable f3043f;

    /* renamed from: g */
    public Drawable f3044g;

    /* renamed from: h */
    public Drawable f3045h;

    /* renamed from: i */
    public boolean f3046i;

    /* renamed from: j */
    public boolean f3047j;

    /* renamed from: k */
    public int f3048k;

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        C0460r.m2263f0(this, new C0128b(this));
        TypedArray a = context.obtainStyledAttributes(attrs, C0012j.f112a);
        this.f3043f = a.getDrawable(C0012j.f117b);
        this.f3044g = a.getDrawable(C0012j.f127d);
        this.f3048k = a.getDimensionPixelSize(C0012j.f157j, -1);
        boolean z = true;
        if (getId() == C0008f.split_action_bar) {
            this.f3046i = true;
            this.f3045h = a.getDrawable(C0012j.f122c);
        }
        a.recycle();
        if (!this.f3046i ? !(this.f3043f == null && this.f3044g == null) : this.f3045h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3041d = findViewById(C0008f.action_bar);
        this.f3042e = findViewById(C0008f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f3043f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3043f);
        }
        this.f3043f = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f3041d;
            if (view != null) {
                this.f3043f.setBounds(view.getLeft(), this.f3041d.getTop(), this.f3041d.getRight(), this.f3041d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f3046i ? !(this.f3043f == null && this.f3044g == null) : this.f3045h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f3044g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3044g);
        }
        this.f3044g = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f3047j && (drawable = this.f3044g) != null) {
                drawable.setBounds(this.f3040c.getLeft(), this.f3040c.getTop(), this.f3040c.getRight(), this.f3040c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f3046i ? !(this.f3043f == null && this.f3044g == null) : this.f3045h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f3045h;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f3045h);
        }
        this.f3045h = bg;
        boolean z = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f3046i && (drawable = this.f3045h) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f3046i ? this.f3043f == null && this.f3044g == null : this.f3045h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f3043f;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f3044g;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.f3045h;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return (who == this.f3043f && !this.f3046i) || (who == this.f3044g && this.f3047j) || ((who == this.f3045h && this.f3046i) || super.verifyDrawable(who));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3043f;
        if (drawable != null && drawable.isStateful()) {
            this.f3043f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3044g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3044g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3045h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f3045h.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3043f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3044g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3045h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        this.f3039b = isTransitioning;
        setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f3039b || super.onInterceptTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(C0188p0 tabView) {
        View view = this.f3040c;
        if (view != null) {
            removeView(view);
        }
        this.f3040c = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f3040c;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback, int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo3925b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: a */
    public final int mo3924a(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i;
        if (this.f3041d == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i = this.f3048k) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i, View.MeasureSpec.getSize(heightMeasureSpec)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f3041d != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f3040c;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!mo3925b(this.f3041d)) {
                    topMarginForTabs = mo3924a(this.f3041d);
                } else if (!mo3925b(this.f3042e)) {
                    topMarginForTabs = mo3924a(this.f3042e);
                } else {
                    topMarginForTabs = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(mo3924a(this.f3040c) + topMarginForTabs, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        Drawable drawable;
        super.onLayout(changed, l, t, r, b);
        View tabContainer = this.f3040c;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            int i = ((FrameLayout.LayoutParams) tabContainer.getLayoutParams()).bottomMargin;
            tabContainer.layout(l, (containerHeight - tabContainer.getMeasuredHeight()) - i, r, containerHeight - i);
        }
        boolean needsInvalidate = false;
        if (this.f3046i) {
            Drawable drawable2 = this.f3045h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f3043f != null) {
                if (this.f3041d.getVisibility() == 0) {
                    this.f3043f.setBounds(this.f3041d.getLeft(), this.f3041d.getTop(), this.f3041d.getRight(), this.f3041d.getBottom());
                } else {
                    View view = this.f3042e;
                    if (view == null || view.getVisibility() != 0) {
                        this.f3043f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f3043f.setBounds(this.f3042e.getLeft(), this.f3042e.getTop(), this.f3042e.getRight(), this.f3042e.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.f3047j = hasTabs;
            if (hasTabs && (drawable = this.f3044g) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
