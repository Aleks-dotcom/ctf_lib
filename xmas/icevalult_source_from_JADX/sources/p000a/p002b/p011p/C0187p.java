package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p000a.p002b.C0003a;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p038m.C0459q;

/* renamed from: a.b.p.p */
public class C0187p extends MultiAutoCompleteTextView implements C0459q {

    /* renamed from: d */
    public static final int[] f978d = {16843126};

    /* renamed from: b */
    public final C0144e f979b;

    /* renamed from: c */
    public final C0223y f980c;

    public C0187p(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.autoCompleteTextViewStyle);
    }

    public C0187p(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0218w0 a = C0218w0.m1093u(getContext(), attrs, f978d, defStyleAttr, 0);
        if (a.mo1513r(0)) {
            setDropDownBackgroundDrawable(a.mo1502g(0));
        }
        a.mo1514v();
        C0144e eVar = new C0144e(this);
        this.f979b = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f980c = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
        yVar.mo1535b();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(C0053a.m277d(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f979b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f979b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f979b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f979b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f979b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f979b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f979b;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0223y yVar = this.f980c;
        if (yVar != null) {
            yVar.mo1535b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0223y yVar = this.f980c;
        if (yVar != null) {
            yVar.mo1548p(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        C0172l.m938a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }
}
