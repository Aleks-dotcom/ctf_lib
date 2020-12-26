package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p040n.C0494l;

/* renamed from: a.b.p.o */
public class C0185o extends ImageView implements C0459q, C0494l {

    /* renamed from: b */
    public final C0144e f968b;

    /* renamed from: c */
    public final C0183n f969c;

    public C0185o(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0185o(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0185o(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0144e eVar = new C0144e(this);
        this.f968b = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0183n nVar = new C0183n(this);
        this.f969c = nVar;
        nVar.mo1273f(attrs, defStyleAttr);
    }

    public void setImageResource(int resId) {
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1274g(resId);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1269b();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1269b();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1269b();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f968b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f968b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f968b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f968b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f968b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f968b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList tint) {
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1275h(tint);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C0183n nVar = this.f969c;
        if (nVar != null) {
            return nVar.mo1270c();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1276i(tintMode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0183n nVar = this.f969c;
        if (nVar != null) {
            return nVar.mo1271d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f968b;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0183n nVar = this.f969c;
        if (nVar != null) {
            nVar.mo1269b();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f969c.mo1272e() && super.hasOverlappingRendering();
    }
}
