package p000a.p016d.p017a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p000a.p016d.p017a.C0254h;

/* renamed from: a.d.a.d */
public class C0249d implements C0252f {

    /* renamed from: a */
    public final RectF f1167a = new RectF();

    /* renamed from: a.d.a.d$a */
    public class C0250a implements C0254h.C0255a {
        public C0250a() {
        }

        /* renamed from: a */
        public void mo1676a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF = bounds;
            float twoRadius = cornerRadius * 2.0f;
            float innerWidth = (bounds.width() - twoRadius) - 1.0f;
            float innerHeight = (bounds.height() - twoRadius) - 1.0f;
            if (cornerRadius >= 1.0f) {
                float roundedCornerRadius = cornerRadius + 0.5f;
                C0249d.this.f1167a.set(-roundedCornerRadius, -roundedCornerRadius, roundedCornerRadius, roundedCornerRadius);
                int saved = canvas.save();
                canvas2.translate(rectF.left + roundedCornerRadius, rectF.top + roundedCornerRadius);
                canvas.drawArc(C0249d.this.f1167a, 180.0f, 90.0f, true, paint);
                canvas2.translate(innerWidth, 0.0f);
                canvas2.rotate(90.0f);
                Paint paint2 = paint;
                canvas.drawArc(C0249d.this.f1167a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(innerHeight, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0249d.this.f1167a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(innerWidth, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0249d.this.f1167a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(saved);
                float f = (rectF.left + roundedCornerRadius) - 1.0f;
                float f2 = rectF.top;
                canvas.drawRect(f, f2, (rectF.right - roundedCornerRadius) + 1.0f, f2 + roundedCornerRadius, paint);
                float f3 = (rectF.left + roundedCornerRadius) - 1.0f;
                float f4 = rectF.bottom;
                canvas.drawRect(f3, f4 - roundedCornerRadius, (rectF.right - roundedCornerRadius) + 1.0f, f4, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + cornerRadius, rectF.right, rectF.bottom - cornerRadius, paint);
        }
    }

    /* renamed from: l */
    public void mo1675l() {
        C0254h.f1181r = new C0250a();
    }

    /* renamed from: o */
    public void mo1692o(C0251e cardView) {
        Rect shadowPadding = new Rect();
        mo1691n(cardView).mo1726h(shadowPadding);
        cardView.mo1697e((int) Math.ceil((double) mo1683g(cardView)), (int) Math.ceil((double) mo1681e(cardView)));
        cardView.mo1693a(shadowPadding.left, shadowPadding.top, shadowPadding.right, shadowPadding.bottom);
    }

    /* renamed from: h */
    public void mo1684h(C0251e cardView) {
    }

    /* renamed from: c */
    public void mo1679c(C0251e cardView) {
        mo1691n(cardView).mo1732m(cardView.mo1698f());
        mo1692o(cardView);
    }

    /* renamed from: d */
    public void mo1680d(C0251e cardView, ColorStateList color) {
        mo1691n(cardView).mo1734o(color);
    }

    /* renamed from: i */
    public ColorStateList mo1685i(C0251e cardView) {
        return mo1691n(cardView).mo1722f();
    }

    /* renamed from: m */
    public void mo1688m(C0251e cardView, float radius) {
        mo1691n(cardView).mo1737p(radius);
        mo1692o(cardView);
    }

    /* renamed from: b */
    public float mo1678b(C0251e cardView) {
        return mo1691n(cardView).mo1723g();
    }

    /* renamed from: j */
    public void mo1686j(C0251e cardView, float elevation) {
        mo1691n(cardView).mo1739r(elevation);
    }

    /* renamed from: f */
    public float mo1682f(C0251e cardView) {
        return mo1691n(cardView).mo1731l();
    }

    /* renamed from: k */
    public void mo1687k(C0251e cardView, float maxElevation) {
        mo1691n(cardView).mo1738q(maxElevation);
        mo1692o(cardView);
    }

    /* renamed from: a */
    public float mo1677a(C0251e cardView) {
        return mo1691n(cardView).mo1727i();
    }

    /* renamed from: g */
    public float mo1683g(C0251e cardView) {
        return mo1691n(cardView).mo1730k();
    }

    /* renamed from: e */
    public float mo1681e(C0251e cardView) {
        return mo1691n(cardView).mo1729j();
    }

    /* renamed from: n */
    public final C0254h mo1691n(C0251e cardView) {
        return (C0254h) cardView.mo1696d();
    }
}
