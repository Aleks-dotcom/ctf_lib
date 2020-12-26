package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p000a.p002b.C0003a;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p040n.C0490i;

/* renamed from: a.b.p.k */
public class C0170k extends EditText implements C0459q {

    /* renamed from: b */
    public final C0144e f942b;

    /* renamed from: c */
    public final C0223y f943c;

    /* renamed from: d */
    public final C0219x f944d;

    public C0170k(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.f2A);
    }

    public C0170k(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0144e eVar = new C0144e(this);
        this.f942b = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f943c = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
        yVar.mo1535b();
        this.f944d = new C0219x(this);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f942b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f942b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f942b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f942b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f942b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f942b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f942b;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0223y yVar = this.f943c;
        if (yVar != null) {
            yVar.mo1535b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0223y yVar = this.f943c;
        if (yVar != null) {
            yVar.mo1548p(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        C0172l.m938a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(C0490i.m2441p(this, actionModeCallback));
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0219x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f944d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.mo1516b(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        C0219x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f944d) == null) {
            return super.getTextClassifier();
        }
        return xVar.mo1515a();
    }
}
