package p066b.p067a.p068a.p069a.p070a0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p000a.p002b.C0012j;
import p000a.p002b.p011p.C0158i0;
import p066b.p067a.p068a.p069a.C1020k;

/* renamed from: b.a.a.a.a0.d */
public class C0914d extends C0158i0 {

    /* renamed from: q */
    public Drawable f3822q;

    /* renamed from: r */
    public final Rect f3823r;

    /* renamed from: s */
    public final Rect f3824s;

    /* renamed from: t */
    public int f3825t;

    /* renamed from: u */
    public boolean f3826u;

    /* renamed from: v */
    public boolean f3827v;

    public C0914d(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0914d(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f3823r = new Rect();
        this.f3824s = new Rect();
        this.f3825t = C0012j.f21D0;
        this.f3826u = true;
        this.f3827v = false;
        TypedArray a = C0921g.m5054k(context, attrs, C1020k.f4277r0, defStyle, 0, new int[0]);
        this.f3825t = a.getInt(C1020k.f4285t0, this.f3825t);
        Drawable d = a.getDrawable(C1020k.f4281s0);
        if (d != null) {
            setForeground(d);
        }
        this.f3826u = a.getBoolean(C1020k.f4289u0, true);
        a.recycle();
    }

    public int getForegroundGravity() {
        return this.f3825t;
    }

    public void setForegroundGravity(int foregroundGravity) {
        if (this.f3825t != foregroundGravity) {
            if ((8388615 & foregroundGravity) == 0) {
                foregroundGravity |= 8388611;
            }
            if ((foregroundGravity & 112) == 0) {
                foregroundGravity |= 48;
            }
            this.f3825t = foregroundGravity;
            if (foregroundGravity == 119 && this.f3822q != null) {
                this.f3822q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f3822q;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3822q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3822q;
        if (drawable != null && drawable.isStateful()) {
            this.f3822q.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3822q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f3822q);
            }
            this.f3822q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3825t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f3822q;
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f3827v |= changed;
    }

    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f3827v = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3822q != null) {
            Drawable foreground = this.f3822q;
            if (this.f3827v) {
                this.f3827v = false;
                Rect selfBounds = this.f3823r;
                Rect overlayBounds = this.f3824s;
                int w = getRight() - getLeft();
                int h = getBottom() - getTop();
                if (this.f3826u) {
                    selfBounds.set(0, 0, w, h);
                } else {
                    selfBounds.set(getPaddingLeft(), getPaddingTop(), w - getPaddingRight(), h - getPaddingBottom());
                }
                Gravity.apply(this.f3825t, foreground.getIntrinsicWidth(), foreground.getIntrinsicHeight(), selfBounds, overlayBounds);
                foreground.setBounds(overlayBounds);
            }
            foreground.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float x, float y) {
        super.drawableHotspotChanged(x, y);
        Drawable drawable = this.f3822q;
        if (drawable != null) {
            drawable.setHotspot(x, y);
        }
    }
}
