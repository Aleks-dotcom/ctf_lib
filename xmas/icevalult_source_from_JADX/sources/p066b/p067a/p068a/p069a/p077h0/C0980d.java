package p066b.p067a.p068a.p069a.p077h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0921g;

/* renamed from: b.a.a.a.h0.d */
public class C0980d extends FrameLayout {

    /* renamed from: g */
    public static final View.OnTouchListener f4009g = new C0981a();

    /* renamed from: b */
    public C0979c f4010b;

    /* renamed from: c */
    public C0978b f4011c;

    /* renamed from: d */
    public int f4012d;

    /* renamed from: e */
    public final float f4013e;

    /* renamed from: f */
    public final float f4014f;

    /* renamed from: b.a.a.a.h0.d$a */
    public static class C0981a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View v, MotionEvent event) {
            return true;
        }
    }

    public C0980d(Context context, AttributeSet attrs) {
        super(C0921g.m5049f(context, attrs, 0, 0), attrs);
        TypedArray a = getContext().obtainStyledAttributes(attrs, C1020k.f4140K1);
        int i = C1020k.f4160P1;
        if (a.hasValue(i)) {
            C0460r.m2271j0(this, (float) a.getDimensionPixelSize(i, 0));
        }
        this.f4012d = a.getInt(C1020k.f4152N1, 0);
        this.f4013e = a.getFloat(C1020k.f4156O1, 1.0f);
        this.f4014f = a.getFloat(C1020k.f4148M1, 1.0f);
        a.recycle();
        setOnTouchListener(f4009g);
        setFocusable(true);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4009g);
        super.setOnClickListener(onClickListener);
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        C0979c cVar = this.f4010b;
        if (cVar != null) {
            cVar.mo5727a(this, l, t, r, b);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0978b bVar = this.f4011c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C0460r.m2253a0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0978b bVar = this.f4011c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    public void setOnLayoutChangeListener(C0979c onLayoutChangeListener) {
        this.f4010b = onLayoutChangeListener;
    }

    public void setOnAttachStateChangeListener(C0978b listener) {
        this.f4011c = listener;
    }

    public int getAnimationMode() {
        return this.f4012d;
    }

    public void setAnimationMode(int animationMode) {
        this.f4012d = animationMode;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4013e;
    }

    public float getActionTextColorAlpha() {
        return this.f4014f;
    }
}
