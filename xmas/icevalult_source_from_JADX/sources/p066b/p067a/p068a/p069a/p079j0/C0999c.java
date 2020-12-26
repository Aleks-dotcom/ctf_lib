package p066b.p067a.p068a.p069a.p079j0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;

/* renamed from: b.a.a.a.j0.c */
public class C0999c extends C0953g {

    /* renamed from: x */
    public final Paint f4036x;

    /* renamed from: y */
    public final RectF f4037y;

    /* renamed from: z */
    public int f4038z;

    public C0999c() {
        this((C0960k) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0999c(C0960k shapeAppearanceModel) {
        super(shapeAppearanceModel != null ? shapeAppearanceModel : new C0960k());
        this.f4036x = new Paint(1);
        mo5775m0();
        this.f4037y = new RectF();
    }

    /* renamed from: m0 */
    public final void mo5775m0() {
        this.f4036x.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f4036x.setColor(-1);
        this.f4036x.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: f0 */
    public boolean mo5768f0() {
        return !this.f4037y.isEmpty();
    }

    /* renamed from: k0 */
    public void mo5773k0(float left, float top, float right, float bottom) {
        RectF rectF = this.f4037y;
        if (left != rectF.left || top != rectF.top || right != rectF.right || bottom != rectF.bottom) {
            rectF.set(left, top, right, bottom);
            invalidateSelf();
        }
    }

    /* renamed from: l0 */
    public void mo5774l0(RectF bounds) {
        mo5773k0(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    /* renamed from: i0 */
    public void mo5771i0() {
        mo5773k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(Canvas canvas) {
        mo5770h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f4037y, this.f4036x);
        mo5769g0(canvas);
    }

    /* renamed from: h0 */
    public final void mo5770h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (mo5776n0(callback)) {
            View viewCallback = (View) callback;
            if (viewCallback.getLayerType() != 2) {
                viewCallback.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        mo5772j0(canvas);
    }

    /* renamed from: j0 */
    public final void mo5772j0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4038z = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f4038z = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    /* renamed from: g0 */
    public final void mo5769g0(Canvas canvas) {
        if (!mo5776n0(getCallback())) {
            canvas.restoreToCount(this.f4038z);
        }
    }

    /* renamed from: n0 */
    public final boolean mo5776n0(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
