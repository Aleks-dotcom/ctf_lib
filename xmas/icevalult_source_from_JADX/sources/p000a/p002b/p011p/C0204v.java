package p000a.p002b.p011p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p002b.C0012j;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.p.v */
public class C0204v extends C0196r {

    /* renamed from: d */
    public final SeekBar f1044d;

    /* renamed from: e */
    public Drawable f1045e;

    /* renamed from: f */
    public ColorStateList f1046f = null;

    /* renamed from: g */
    public PorterDuff.Mode f1047g = null;

    /* renamed from: h */
    public boolean f1048h = false;

    /* renamed from: i */
    public boolean f1049i = false;

    public C0204v(SeekBar view) {
        super(view);
        this.f1044d = view;
    }

    /* renamed from: c */
    public void mo1405c(AttributeSet attrs, int defStyleAttr) {
        super.mo1405c(attrs, defStyleAttr);
        C0218w0 a = C0218w0.m1093u(this.f1044d.getContext(), attrs, C0012j.f72Q, defStyleAttr, 0);
        Drawable drawable = a.mo1503h(C0012j.f76R);
        if (drawable != null) {
            this.f1044d.setThumb(drawable);
        }
        mo1430j(a.mo1502g(C0012j.f80S));
        int i = C0012j.f88U;
        if (a.mo1513r(i)) {
            this.f1047g = C0145e0.m827d(a.mo1506k(i, -1), this.f1047g);
            this.f1049i = true;
        }
        int i2 = C0012j.f84T;
        if (a.mo1513r(i2)) {
            this.f1046f = a.mo1498c(i2);
            this.f1048h = true;
        }
        a.mo1514v();
        mo1426f();
    }

    /* renamed from: j */
    public void mo1430j(Drawable tickMark) {
        Drawable drawable = this.f1045e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1045e = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f1044d);
            C0370a.m1943m(tickMark, C0460r.m2292v(this.f1044d));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f1044d.getDrawableState());
            }
            mo1426f();
        }
        this.f1044d.invalidate();
    }

    /* renamed from: f */
    public final void mo1426f() {
        Drawable drawable = this.f1045e;
        if (drawable == null) {
            return;
        }
        if (this.f1048h || this.f1049i) {
            Drawable r = C0370a.m1948r(drawable.mutate());
            this.f1045e = r;
            if (this.f1048h) {
                C0370a.m1945o(r, this.f1046f);
            }
            if (this.f1049i) {
                C0370a.m1946p(this.f1045e, this.f1047g);
            }
            if (this.f1045e.isStateful()) {
                this.f1045e.setState(this.f1044d.getDrawableState());
            }
        }
    }

    /* renamed from: i */
    public void mo1429i() {
        Drawable drawable = this.f1045e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: h */
    public void mo1428h() {
        Drawable tickMark = this.f1045e;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f1044d.getDrawableState())) {
            this.f1044d.invalidateDrawable(tickMark);
        }
    }

    /* renamed from: g */
    public void mo1427g(Canvas canvas) {
        if (this.f1045e != null) {
            int count = this.f1044d.getMax();
            int halfH = 1;
            if (count > 1) {
                int w = this.f1045e.getIntrinsicWidth();
                int h = this.f1045e.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                if (h >= 0) {
                    halfH = h / 2;
                }
                this.f1045e.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((float) ((this.f1044d.getWidth() - this.f1044d.getPaddingLeft()) - this.f1044d.getPaddingRight())) / ((float) count);
                int saveCount = canvas.save();
                canvas.translate((float) this.f1044d.getPaddingLeft(), (float) (this.f1044d.getHeight() / 2));
                for (int i = 0; i <= count; i++) {
                    this.f1045e.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
