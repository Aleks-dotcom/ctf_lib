package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p002b.C0009g;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.C0073b;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p011p.C0124a;
import p000a.p002b.p011p.C0131c;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0218w0;
import p000a.p025h.p038m.C0460r;

public class ActionBarContextView extends C0124a {

    /* renamed from: j */
    public CharSequence f3049j;

    /* renamed from: k */
    public CharSequence f3050k;

    /* renamed from: l */
    public View f3051l;

    /* renamed from: m */
    public View f3052m;

    /* renamed from: n */
    public LinearLayout f3053n;

    /* renamed from: o */
    public TextView f3054o;

    /* renamed from: p */
    public TextView f3055p;

    /* renamed from: q */
    public int f3056q;

    /* renamed from: r */
    public int f3057r;

    /* renamed from: s */
    public boolean f3058s;

    /* renamed from: t */
    public int f3059t;

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        C0218w0 a = C0218w0.m1093u(context, attrs, C0012j.f226x, defStyle, 0);
        C0460r.m2263f0(this, a.mo1502g(C0012j.f230y));
        this.f3056q = a.mo1509n(C0012j.f16C, 0);
        this.f3057r = a.mo1509n(C0012j.f12B, 0);
        this.f764f = a.mo1508m(C0012j.f8A, 0);
        this.f3059t = a.mo1509n(C0012j.f234z, C0009g.abc_action_mode_close_item_material);
        a.mo1514v();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0131c cVar = this.f763e;
        if (cVar != null) {
            cVar.mo949A();
            this.f763e.mo950B();
        }
    }

    public void setContentHeight(int height) {
        this.f764f = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3052m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3052m = view;
        if (!(view == null || (linearLayout = this.f3053n) == null)) {
            removeView(linearLayout);
            this.f3053n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.f3049j = title;
        mo3950i();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.f3050k = subtitle;
        mo3950i();
    }

    public CharSequence getTitle() {
        return this.f3049j;
    }

    public CharSequence getSubtitle() {
        return this.f3050k;
    }

    /* renamed from: i */
    public final void mo3950i() {
        if (this.f3053n == null) {
            LayoutInflater.from(getContext()).inflate(C0009g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3053n = linearLayout;
            this.f3054o = (TextView) linearLayout.findViewById(C0008f.action_bar_title);
            this.f3055p = (TextView) this.f3053n.findViewById(C0008f.action_bar_subtitle);
            if (this.f3056q != 0) {
                this.f3054o.setTextAppearance(getContext(), this.f3056q);
            }
            if (this.f3057r != 0) {
                this.f3055p.setTextAppearance(getContext(), this.f3057r);
            }
        }
        this.f3054o.setText(this.f3049j);
        this.f3055p.setText(this.f3050k);
        boolean hasTitle = !TextUtils.isEmpty(this.f3049j);
        boolean hasSubtitle = !TextUtils.isEmpty(this.f3050k);
        int i = 0;
        this.f3055p.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout2 = this.f3053n;
        if (!hasTitle && !hasSubtitle) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f3053n.getParent() == null) {
            addView(this.f3053n);
        }
    }

    /* renamed from: h */
    public void mo3949h(C0073b mode) {
        View view = this.f3051l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f3059t, this, false);
            this.f3051l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f3051l);
        }
        this.f3051l.findViewById(C0008f.action_mode_close_button).setOnClickListener(new C0781a(this, mode));
        C0098g menu = (C0098g) mode.mo254e();
        C0131c cVar = this.f763e;
        if (cVar != null) {
            cVar.mo959x();
        }
        C0131c cVar2 = new C0131c(getContext());
        this.f763e = cVar2;
        cVar2.mo957I(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.mo653c(this.f763e, this.f761c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f763e.mo558o(this);
        this.f762d = actionMenuView;
        C0460r.m2263f0(actionMenuView, (Drawable) null);
        addView(this.f762d, layoutParams);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class C0781a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C0073b f3060b;

        public C0781a(ActionBarContextView this$0, C0073b bVar) {
            this.f3060b = bVar;
        }

        public void onClick(View v) {
            this.f3060b.mo252c();
        }
    }

    /* renamed from: g */
    public void mo3944g() {
        if (this.f3051l == null) {
            mo3952k();
        }
    }

    /* renamed from: k */
    public void mo3952k() {
        removeAllViews();
        this.f3052m = null;
        this.f762d = null;
    }

    /* renamed from: l */
    public boolean mo3953l() {
        C0131c cVar = this.f763e;
        if (cVar != null) {
            return cVar.mo958J();
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int customHeightMode = 1073741824;
        if (widthMode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(heightMeasureSpec) != 0) {
            int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
            int maxHeight = this.f764f;
            if (maxHeight <= 0) {
                maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
            }
            int verticalPadding = getPaddingTop() + getPaddingBottom();
            int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
            int height = maxHeight - verticalPadding;
            int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, RecyclerView.UNDEFINED_DURATION);
            View view = this.f3051l;
            int i = 0;
            if (view != null) {
                int availableWidth2 = mo899c(view, availableWidth, childSpecHeight, 0);
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f3051l.getLayoutParams();
                availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
            }
            ActionMenuView actionMenuView = this.f762d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                availableWidth = mo899c(this.f762d, availableWidth, childSpecHeight, 0);
            }
            LinearLayout linearLayout = this.f3053n;
            if (linearLayout != null && this.f3052m == null) {
                if (this.f3058s) {
                    this.f3053n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), childSpecHeight);
                    int titleWidth = this.f3053n.getMeasuredWidth();
                    boolean titleFits = titleWidth <= availableWidth;
                    if (titleFits) {
                        availableWidth -= titleWidth;
                    }
                    LinearLayout linearLayout2 = this.f3053n;
                    if (!titleFits) {
                        i = 8;
                    }
                    linearLayout2.setVisibility(i);
                } else {
                    availableWidth = mo899c(linearLayout, availableWidth, childSpecHeight, 0);
                }
            }
            View view2 = this.f3052m;
            if (view2 != null) {
                ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                int i2 = lp2.width;
                int customWidthMode = i2 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                int customWidth = i2 >= 0 ? Math.min(i2, availableWidth) : availableWidth;
                int i3 = lp2.height;
                if (i3 == -2) {
                    customHeightMode = RecyclerView.UNDEFINED_DURATION;
                }
                int i4 = widthMode;
                this.f3052m.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(i3 >= 0 ? Math.min(i3, height) : height, customHeightMode));
            }
            if (this.f764f <= 0) {
                int measuredHeight = 0;
                int count = getChildCount();
                for (int i5 = 0; i5 < count; i5++) {
                    int paddedViewHeight = getChildAt(i5).getMeasuredHeight() + verticalPadding;
                    if (paddedViewHeight > measuredHeight) {
                        measuredHeight = paddedViewHeight;
                    }
                }
                setMeasuredDimension(contentWidth, measuredHeight);
                return;
            }
            setMeasuredDimension(contentWidth, maxHeight);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int x;
        boolean isLayoutRtl = C0140c1.m788b(this);
        int x2 = isLayoutRtl ? (r - l) - getPaddingRight() : getPaddingLeft();
        int y = getPaddingTop();
        int contentHeight = ((b - t) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3051l;
        if (view == null || view.getVisibility() == 8) {
            x = x2;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f3051l.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x3 = C0124a.m692d(x2, startMargin, isLayoutRtl);
            x = C0124a.m692d(x3 + mo900e(this.f3051l, x3, y, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.f3053n;
        if (!(linearLayout == null || this.f3052m != null || linearLayout.getVisibility() == 8)) {
            x += mo900e(this.f3053n, x, y, contentHeight, isLayoutRtl);
        }
        View view2 = this.f3052m;
        if (view2 != null) {
            int x4 = x + mo900e(view2, x, y, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r - l) - getPaddingRight();
        ActionMenuView actionMenuView = this.f762d;
        if (actionMenuView != null) {
            int x6 = x5 + mo900e(actionMenuView, x5, y, contentHeight, !isLayoutRtl);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == 32) {
            event.setSource(this);
            event.setClassName(getClass().getName());
            event.setPackageName(getContext().getPackageName());
            event.setContentDescription(this.f3049j);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.f3058s) {
            requestLayout();
        }
        this.f3058s = titleOptional;
    }

    /* renamed from: j */
    public boolean mo3951j() {
        return this.f3058s;
    }
}
