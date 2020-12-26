package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p000a.p002b.C0003a;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p040n.C0492j;

/* renamed from: a.b.p.g */
public class C0150g extends CheckBox implements C0492j, C0459q {

    /* renamed from: b */
    public final C0157i f853b;

    /* renamed from: c */
    public final C0144e f854c;

    /* renamed from: d */
    public final C0223y f855d;

    public C0150g(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.f5r);
    }

    public C0150g(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0157i iVar = new C0157i(this);
        this.f853b = iVar;
        iVar.mo1109e(attrs, defStyleAttr);
        C0144e eVar = new C0144e(this);
        this.f854c = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f855d = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
    }

    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        C0157i iVar = this.f853b;
        if (iVar != null) {
            iVar.mo1110f();
        }
    }

    public void setButtonDrawable(int resId) {
        setButtonDrawable(C0053a.m277d(getContext(), resId));
    }

    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        C0157i iVar = this.f853b;
        return iVar != null ? iVar.mo1106b(value) : value;
    }

    public void setSupportButtonTintList(ColorStateList tint) {
        C0157i iVar = this.f853b;
        if (iVar != null) {
            iVar.mo1111g(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        C0157i iVar = this.f853b;
        if (iVar != null) {
            return iVar.mo1107c();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        C0157i iVar = this.f853b;
        if (iVar != null) {
            iVar.mo1112h(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0157i iVar = this.f853b;
        if (iVar != null) {
            return iVar.mo1108d();
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f854c;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f854c;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f854c;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f854c;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f854c;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f854c;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f854c;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0223y yVar = this.f855d;
        if (yVar != null) {
            yVar.mo1535b();
        }
    }
}
