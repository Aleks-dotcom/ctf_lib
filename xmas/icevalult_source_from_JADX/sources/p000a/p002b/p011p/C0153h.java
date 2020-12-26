package p000a.p002b.p011p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p040n.C0490i;

/* renamed from: a.b.p.h */
public class C0153h extends CheckedTextView {

    /* renamed from: c */
    public static final int[] f856c = {16843016};

    /* renamed from: b */
    public final C0223y f857b;

    public C0153h(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    public C0153h(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f857b = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
        yVar.mo1535b();
        C0218w0 a = C0218w0.m1093u(getContext(), attrs, f856c, defStyleAttr, 0);
        setCheckMarkDrawable(a.mo1502g(0));
        a.mo1514v();
    }

    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(C0053a.m277d(getContext(), resId));
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0223y yVar = this.f857b;
        if (yVar != null) {
            yVar.mo1548p(context, resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0223y yVar = this.f857b;
        if (yVar != null) {
            yVar.mo1535b();
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
}
