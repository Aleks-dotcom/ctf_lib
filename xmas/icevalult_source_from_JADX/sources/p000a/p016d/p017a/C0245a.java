package p000a.p016d.p017a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: a.d.a.a */
public class C0245a extends FrameLayout {

    /* renamed from: f */
    public static final C0252f f1162f;

    /* renamed from: b */
    public boolean f1163b;

    /* renamed from: c */
    public boolean f1164c;

    /* renamed from: d */
    public final Rect f1165d;

    /* renamed from: e */
    public final C0251e f1166e;

    static {
        new int[1][0] = 16842801;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1162f = new C0248c();
        } else if (i >= 17) {
            f1162f = new C0246b();
        } else {
            f1162f = new C0249d();
        }
        f1162f.mo1675l();
    }

    public void setPadding(int left, int top, int right, int bottom) {
    }

    public void setPaddingRelative(int start, int top, int end, int bottom) {
    }

    public boolean getUseCompatPadding() {
        return this.f1163b;
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f1163b != useCompatPadding) {
            this.f1163b = useCompatPadding;
            f1162f.mo1684h(this.f1166e);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        C0252f fVar = f1162f;
        if (!(fVar instanceof C0248c)) {
            int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
            if (widthMode == Integer.MIN_VALUE || widthMode == 1073741824) {
                widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo1683g(this.f1166e)), View.MeasureSpec.getSize(widthMeasureSpec)), widthMode);
            }
            int minWidth = View.MeasureSpec.getMode(heightMeasureSpec);
            if (minWidth == Integer.MIN_VALUE || minWidth == 1073741824) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo1681e(this.f1166e)), View.MeasureSpec.getSize(heightMeasureSpec)), minWidth);
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMinimumWidth(int minWidth) {
        super.setMinimumWidth(minWidth);
    }

    public void setMinimumHeight(int minHeight) {
        super.setMinimumHeight(minHeight);
    }

    public void setCardBackgroundColor(int color) {
        f1162f.mo1680d(this.f1166e, ColorStateList.valueOf(color));
    }

    public void setCardBackgroundColor(ColorStateList color) {
        f1162f.mo1680d(this.f1166e, color);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1162f.mo1685i(this.f1166e);
    }

    public int getContentPaddingLeft() {
        return this.f1165d.left;
    }

    public int getContentPaddingRight() {
        return this.f1165d.right;
    }

    public int getContentPaddingTop() {
        return this.f1165d.top;
    }

    public int getContentPaddingBottom() {
        return this.f1165d.bottom;
    }

    public void setRadius(float radius) {
        f1162f.mo1688m(this.f1166e, radius);
    }

    public float getRadius() {
        return f1162f.mo1678b(this.f1166e);
    }

    public void setCardElevation(float elevation) {
        f1162f.mo1686j(this.f1166e, elevation);
    }

    public float getCardElevation() {
        return f1162f.mo1682f(this.f1166e);
    }

    public void setMaxCardElevation(float maxElevation) {
        f1162f.mo1687k(this.f1166e, maxElevation);
    }

    public float getMaxCardElevation() {
        return f1162f.mo1677a(this.f1166e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1164c;
    }

    public void setPreventCornerOverlap(boolean preventCornerOverlap) {
        if (preventCornerOverlap != this.f1164c) {
            this.f1164c = preventCornerOverlap;
            f1162f.mo1679c(this.f1166e);
        }
    }
}
