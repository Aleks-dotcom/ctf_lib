package p066b.p067a.p068a.p069a.p089t;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p066b.p067a.p068a.p069a.p089t.C1053d;

/* renamed from: b.a.a.a.t.b */
public class C1051b extends FrameLayout implements C1053d {

    /* renamed from: b */
    public final C1052c f4459b;

    /* renamed from: b */
    public void mo6155b() {
        this.f4459b.mo6164a();
    }

    /* renamed from: a */
    public void mo6154a() {
        this.f4459b.mo6165b();
    }

    public C1053d.C1058e getRevealInfo() {
        return this.f4459b.mo6169f();
    }

    public void setRevealInfo(C1053d.C1058e revealInfo) {
        this.f4459b.mo6173j(revealInfo);
    }

    public int getCircularRevealScrimColor() {
        return this.f4459b.mo6168e();
    }

    public void setCircularRevealScrimColor(int color) {
        this.f4459b.mo6172i(color);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f4459b.mo6167d();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4459b.mo6171h(drawable);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        C1052c cVar = this.f4459b;
        if (cVar != null) {
            cVar.mo6166c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public boolean isOpaque() {
        C1052c cVar = this.f4459b;
        if (cVar != null) {
            return cVar.mo6170g();
        }
        return super.isOpaque();
    }
}
