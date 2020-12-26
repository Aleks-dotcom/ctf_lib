package p000a.p016d.p017a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: a.d.a.h */
public class C0254h extends Drawable {

    /* renamed from: q */
    public static final double f1180q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    public static C0255a f1181r;

    /* renamed from: a */
    public final int f1182a;

    /* renamed from: b */
    public Paint f1183b;

    /* renamed from: c */
    public Paint f1184c;

    /* renamed from: d */
    public Paint f1185d;

    /* renamed from: e */
    public final RectF f1186e;

    /* renamed from: f */
    public float f1187f;

    /* renamed from: g */
    public Path f1188g;

    /* renamed from: h */
    public float f1189h;

    /* renamed from: i */
    public float f1190i;

    /* renamed from: j */
    public float f1191j;

    /* renamed from: k */
    public ColorStateList f1192k;

    /* renamed from: l */
    public boolean f1193l;

    /* renamed from: m */
    public final int f1194m;

    /* renamed from: n */
    public final int f1195n;

    /* renamed from: o */
    public boolean f1196o;

    /* renamed from: p */
    public boolean f1197p;

    /* renamed from: a.d.a.h$a */
    public interface C0255a {
        /* renamed from: a */
        void mo1676a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* renamed from: n */
    public final void mo1733n(ColorStateList color) {
        ColorStateList valueOf = color == null ? ColorStateList.valueOf(0) : color;
        this.f1192k = valueOf;
        this.f1183b.setColor(valueOf.getColorForState(getState(), this.f1192k.getDefaultColor()));
    }

    /* renamed from: t */
    public final int mo1743t(float value) {
        int i = (int) (0.5f + value);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: m */
    public void mo1732m(boolean addPaddingForCorners) {
        this.f1196o = addPaddingForCorners;
        invalidateSelf();
    }

    public void setAlpha(int alpha) {
        this.f1183b.setAlpha(alpha);
        this.f1184c.setAlpha(alpha);
        this.f1185d.setAlpha(alpha);
    }

    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.f1193l = true;
    }

    /* renamed from: s */
    public final void mo1740s(float shadowSize, float maxShadowSize) {
        if (shadowSize < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + shadowSize + ". Must be >= 0");
        } else if (maxShadowSize >= 0.0f) {
            float shadowSize2 = (float) mo1743t(shadowSize);
            float maxShadowSize2 = (float) mo1743t(maxShadowSize);
            if (shadowSize2 > maxShadowSize2) {
                shadowSize2 = maxShadowSize2;
                if (!this.f1197p) {
                    this.f1197p = true;
                }
            }
            if (this.f1191j != shadowSize2 || this.f1189h != maxShadowSize2) {
                this.f1191j = shadowSize2;
                this.f1189h = maxShadowSize2;
                this.f1190i = (float) ((int) ((1.5f * shadowSize2) + ((float) this.f1182a) + 0.5f));
                this.f1193l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + maxShadowSize + ". Must be >= 0");
        }
    }

    public boolean getPadding(Rect padding) {
        int vOffset = (int) Math.ceil((double) m1290d(this.f1189h, this.f1187f, this.f1196o));
        int hOffset = (int) Math.ceil((double) m1289c(this.f1189h, this.f1187f, this.f1196o));
        padding.set(hOffset, vOffset, hOffset, vOffset);
        return true;
    }

    /* renamed from: d */
    public static float m1290d(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) (1.5f * maxShadowSize)) + ((1.0d - f1180q) * ((double) cornerRadius)));
        }
        return 1.5f * maxShadowSize;
    }

    /* renamed from: c */
    public static float m1289c(float maxShadowSize, float cornerRadius, boolean addPaddingForCorners) {
        if (addPaddingForCorners) {
            return (float) (((double) maxShadowSize) + ((1.0d - f1180q) * ((double) cornerRadius)));
        }
        return maxShadowSize;
    }

    public boolean onStateChange(int[] stateSet) {
        ColorStateList colorStateList = this.f1192k;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (this.f1183b.getColor() == newColor) {
            return false;
        }
        this.f1183b.setColor(newColor);
        this.f1193l = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1192k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter cf) {
        this.f1183b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: p */
    public void mo1737p(float radius) {
        if (radius >= 0.0f) {
            float radius2 = (float) ((int) (0.5f + radius));
            if (this.f1187f != radius2) {
                this.f1187f = radius2;
                this.f1193l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + radius + ". Must be >= 0");
    }

    public void draw(Canvas canvas) {
        if (this.f1193l) {
            mo1718a(getBounds());
            this.f1193l = false;
        }
        canvas.translate(0.0f, this.f1191j / 2.0f);
        mo1721e(canvas);
        canvas.translate(0.0f, (-this.f1191j) / 2.0f);
        f1181r.mo1676a(canvas, this.f1186e, this.f1187f, this.f1183b);
    }

    /* renamed from: e */
    public final void mo1721e(Canvas canvas) {
        float f = this.f1187f;
        float edgeShadowTop = (-f) - this.f1190i;
        float inset = f + ((float) this.f1182a) + (this.f1191j / 2.0f);
        boolean z = true;
        boolean drawHorizontalEdges = this.f1186e.width() - (inset * 2.0f) > 0.0f;
        if (this.f1186e.height() - (inset * 2.0f) <= 0.0f) {
            z = false;
        }
        boolean drawVerticalEdges = z;
        int saved = canvas.save();
        RectF rectF = this.f1186e;
        canvas.translate(rectF.left + inset, rectF.top + inset);
        canvas.drawPath(this.f1188g, this.f1184c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f1186e.width() - (inset * 2.0f), -this.f1187f, this.f1185d);
        }
        canvas.restoreToCount(saved);
        int saved2 = canvas.save();
        RectF rectF2 = this.f1186e;
        canvas.translate(rectF2.right - inset, rectF2.bottom - inset);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1188g, this.f1184c);
        if (drawHorizontalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f1186e.width() - (inset * 2.0f), (-this.f1187f) + this.f1190i, this.f1185d);
        }
        canvas.restoreToCount(saved2);
        int saved3 = canvas.save();
        RectF rectF3 = this.f1186e;
        canvas.translate(rectF3.left + inset, rectF3.bottom - inset);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1188g, this.f1184c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f1186e.height() - (inset * 2.0f), -this.f1187f, this.f1185d);
        }
        canvas.restoreToCount(saved3);
        int saved4 = canvas.save();
        RectF rectF4 = this.f1186e;
        canvas.translate(rectF4.right - inset, rectF4.top + inset);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1188g, this.f1184c);
        if (drawVerticalEdges) {
            canvas.drawRect(0.0f, edgeShadowTop, this.f1186e.height() - (2.0f * inset), -this.f1187f, this.f1185d);
        }
        canvas.restoreToCount(saved4);
    }

    /* renamed from: b */
    public final void mo1719b() {
        float f = this.f1187f;
        RectF innerBounds = new RectF(-f, -f, f, f);
        RectF outerBounds = new RectF(innerBounds);
        float f2 = this.f1190i;
        outerBounds.inset(-f2, -f2);
        Path path = this.f1188g;
        if (path == null) {
            this.f1188g = new Path();
        } else {
            path.reset();
        }
        this.f1188g.setFillType(Path.FillType.EVEN_ODD);
        this.f1188g.moveTo(-this.f1187f, 0.0f);
        this.f1188g.rLineTo(-this.f1190i, 0.0f);
        this.f1188g.arcTo(outerBounds, 180.0f, 90.0f, false);
        this.f1188g.arcTo(innerBounds, 270.0f, -90.0f, false);
        this.f1188g.close();
        float f3 = this.f1187f;
        float startRatio = f3 / (this.f1190i + f3);
        Paint paint = this.f1184c;
        float f4 = this.f1190i + this.f1187f;
        int i = this.f1194m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f4, new int[]{i, i, this.f1195n}, new float[]{0.0f, startRatio, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1185d;
        float f5 = this.f1187f;
        float f6 = this.f1190i;
        int i2 = this.f1194m;
        paint2.setShader(new LinearGradient(0.0f, (-f5) + f6, 0.0f, (-f5) - f6, new int[]{i2, i2, this.f1195n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1185d.setAntiAlias(false);
    }

    /* renamed from: a */
    public final void mo1718a(Rect bounds) {
        float f = this.f1189h;
        float verticalOffset = 1.5f * f;
        this.f1186e.set(((float) bounds.left) + f, ((float) bounds.top) + verticalOffset, ((float) bounds.right) - f, ((float) bounds.bottom) - verticalOffset);
        mo1719b();
    }

    /* renamed from: g */
    public float mo1723g() {
        return this.f1187f;
    }

    /* renamed from: h */
    public void mo1726h(Rect into) {
        getPadding(into);
    }

    /* renamed from: r */
    public void mo1739r(float size) {
        mo1740s(size, this.f1189h);
    }

    /* renamed from: q */
    public void mo1738q(float size) {
        mo1740s(this.f1191j, size);
    }

    /* renamed from: l */
    public float mo1731l() {
        return this.f1191j;
    }

    /* renamed from: i */
    public float mo1727i() {
        return this.f1189h;
    }

    /* renamed from: k */
    public float mo1730k() {
        float f = this.f1189h;
        return ((this.f1189h + ((float) this.f1182a)) * 2.0f) + (Math.max(f, this.f1187f + ((float) this.f1182a) + (f / 2.0f)) * 2.0f);
    }

    /* renamed from: j */
    public float mo1729j() {
        float f = this.f1189h;
        return (((this.f1189h * 1.5f) + ((float) this.f1182a)) * 2.0f) + (Math.max(f, this.f1187f + ((float) this.f1182a) + ((f * 1.5f) / 2.0f)) * 2.0f);
    }

    /* renamed from: o */
    public void mo1734o(ColorStateList color) {
        mo1733n(color);
        invalidateSelf();
    }

    /* renamed from: f */
    public ColorStateList mo1722f() {
        return this.f1192k;
    }
}
