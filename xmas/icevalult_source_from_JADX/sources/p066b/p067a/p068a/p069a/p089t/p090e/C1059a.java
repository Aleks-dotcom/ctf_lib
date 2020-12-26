package p066b.p067a.p068a.p069a.p089t.p090e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p066b.p067a.p068a.p069a.p086q.C1043a;
import p066b.p067a.p068a.p069a.p089t.C1052c;
import p066b.p067a.p068a.p069a.p089t.C1053d;

/* renamed from: b.a.a.a.t.e.a */
public class C1059a extends C1043a implements C1053d {

    /* renamed from: o */
    public final C1052c f4468o;

    /* renamed from: b */
    public void mo6155b() {
        this.f4468o.mo6164a();
    }

    /* renamed from: a */
    public void mo6154a() {
        this.f4468o.mo6165b();
    }

    public void setRevealInfo(C1053d.C1058e revealInfo) {
        this.f4468o.mo6173j(revealInfo);
    }

    public C1053d.C1058e getRevealInfo() {
        return this.f4468o.mo6169f();
    }

    public void setCircularRevealScrimColor(int color) {
        this.f4468o.mo6172i(color);
    }

    public int getCircularRevealScrimColor() {
        return this.f4468o.mo6168e();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f4468o.mo6167d();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4468o.mo6171h(drawable);
    }

    public void draw(Canvas canvas) {
        C1052c cVar = this.f4468o;
        if (cVar != null) {
            cVar.mo6166c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public boolean isOpaque() {
        C1052c cVar = this.f4468o;
        if (cVar != null) {
            return cVar.mo6170g();
        }
        return super.isOpaque();
    }
}
