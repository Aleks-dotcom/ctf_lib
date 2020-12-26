package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.C1020k;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    public TextView f4859b;

    /* renamed from: c */
    public Button f4860c;

    /* renamed from: d */
    public int f4861d;

    /* renamed from: e */
    public int f4862e;

    public SnackbarContentLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4140K1);
        this.f4861d = a.getDimensionPixelSize(C1020k.f4144L1, -1);
        this.f4862e = a.getDimensionPixelSize(C1020k.f4164Q1, -1);
        a.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4859b = (TextView) findViewById(C0943f.snackbar_text);
        this.f4860c = (Button) findViewById(C0943f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f4859b;
    }

    public Button getActionView() {
        return this.f4860c;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f4861d > 0 && getMeasuredWidth() > (i = this.f4861d)) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int multiLineVPadding = getResources().getDimensionPixelSize(C0928d.design_snackbar_padding_vertical_2lines);
        int singleLineVPadding = getResources().getDimensionPixelSize(C0928d.design_snackbar_padding_vertical);
        boolean isMultiLine = this.f4859b.getLayout().getLineCount() > 1;
        boolean remeasure = false;
        if (!isMultiLine || this.f4862e <= 0 || this.f4860c.getMeasuredWidth() <= this.f4862e) {
            int messagePadding = isMultiLine ? multiLineVPadding : singleLineVPadding;
            if (mo6979b(0, messagePadding, messagePadding)) {
                remeasure = true;
            }
        } else if (mo6979b(1, multiLineVPadding, multiLineVPadding - singleLineVPadding)) {
            remeasure = true;
        }
        if (remeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* renamed from: b */
    public final boolean mo6979b(int orientation, int messagePadTop, int messagePadBottom) {
        boolean changed = false;
        if (orientation != getOrientation()) {
            setOrientation(orientation);
            changed = true;
        }
        if (this.f4859b.getPaddingTop() == messagePadTop && this.f4859b.getPaddingBottom() == messagePadBottom) {
            return changed;
        }
        m6298a(this.f4859b, messagePadTop, messagePadBottom);
        return true;
    }

    /* renamed from: a */
    public static void m6298a(View view, int topPadding, int bottomPadding) {
        if (C0460r.m2237L(view)) {
            C0460r.m2281o0(view, C0460r.m2226A(view), topPadding, C0460r.m2296z(view), bottomPadding);
        } else {
            view.setPadding(view.getPaddingLeft(), topPadding, view.getPaddingRight(), bottomPadding);
        }
    }
}
