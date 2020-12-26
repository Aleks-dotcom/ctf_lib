package p000a.p002b.p011p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p029f.C0360c;
import p000a.p025h.p036k.C0400c;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p040n.C0483b;
import p000a.p025h.p040n.C0490i;
import p000a.p025h.p040n.C0493k;

/* renamed from: a.b.p.z */
public class C0227z extends TextView implements C0459q, C0493k, C0483b {

    /* renamed from: b */
    public final C0144e f1124b;

    /* renamed from: c */
    public final C0223y f1125c;

    /* renamed from: d */
    public final C0219x f1126d;

    /* renamed from: e */
    public Future<C0400c> f1127e;

    public C0227z(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0227z(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    public C0227z(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0144e eVar = new C0144e(this);
        this.f1124b = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f1125c = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
        yVar.mo1535b();
        this.f1126d = new C0219x(this);
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1548p(context, resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f1124b;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1535b();
        }
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1546n(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (C0483b.f2088a) {
            super.setTextSize(unit, size);
            return;
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1558z(unit, size);
        }
    }

    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        C0223y yVar = this.f1125c;
        if (yVar != null && !C0483b.f2088a && yVar.mo1544l()) {
            this.f1125c.mo1536c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1553u(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1551s(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1552t(presetSizes, unit);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0483b.f2088a) {
            C0223y yVar = this.f1125c;
            if (yVar != null) {
                return yVar.mo1541i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (C0483b.f2088a) {
            return super.getAutoSizeStepGranularity();
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            return yVar.mo1539g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0483b.f2088a) {
            return super.getAutoSizeMinTextSize();
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            return yVar.mo1538f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (C0483b.f2088a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            return yVar.mo1537e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0483b.f2088a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            return yVar.mo1540h();
        }
        return new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        C0172l.m938a(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        } else {
            C0490i.m2435j(this, firstBaselineToTopHeight);
        }
    }

    public void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        } else {
            C0490i.m2436k(this, lastBaselineToBottomHeight);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return C0490i.m2427b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0490i.m2428c(this);
    }

    public void setLineHeight(int lineHeight) {
        C0490i.m2437l(this, lineHeight);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(C0490i.m2441p(this, actionModeCallback));
    }

    public C0400c.C0401a getTextMetricsParamsCompat() {
        return C0490i.m2431f(this);
    }

    public void setTextMetricsParamsCompat(C0400c.C0401a params) {
        C0490i.m2440o(this, params);
    }

    public void setPrecomputedText(C0400c precomputed) {
        C0490i.m2438m(this, precomputed);
    }

    /* renamed from: d */
    public final void mo1562d() {
        Future<C0400c> future = this.f1127e;
        if (future != null) {
            try {
                this.f1127e = null;
                C0490i.m2438m(this, future.get());
            } catch (InterruptedException | ExecutionException e) {
            }
        }
    }

    public CharSequence getText() {
        mo1562d();
        return super.getText();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0219x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1126d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.mo1516b(textClassifier);
        }
    }

    public TextClassifier getTextClassifier() {
        C0219x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1126d) == null) {
            return super.getTextClassifier();
        }
        return xVar.mo1515a();
    }

    public void setTextFuture(Future<C0400c> future) {
        this.f1127e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        mo1562d();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawables(left, top, right, bottom);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelative(start, top, end, bottom);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = left != 0 ? C0053a.m277d(context, left) : null;
        Drawable d2 = top != 0 ? C0053a.m277d(context, top) : null;
        Drawable d3 = right != 0 ? C0053a.m277d(context, right) : null;
        if (bottom != 0) {
            drawable = C0053a.m277d(context, bottom);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = start != 0 ? C0053a.m277d(context, start) : null;
        Drawable d2 = top != 0 ? C0053a.m277d(context, top) : null;
        Drawable d3 = end != 0 ? C0053a.m277d(context, end) : null;
        if (bottom != 0) {
            drawable = C0053a.m277d(context, bottom);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0223y yVar = this.f1125c;
        if (yVar != null) {
            yVar.mo1547o();
        }
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1125c.mo1542j();
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList tintList) {
        this.f1125c.mo1554v(tintList);
        this.f1125c.mo1535b();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1125c.mo1543k();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode tintMode) {
        this.f1125c.mo1555w(tintMode);
        this.f1125c.mo1535b();
    }

    public void setTypeface(Typeface tf, int style) {
        Typeface finalTypeface = null;
        if (tf != null && style > 0) {
            finalTypeface = C0360c.m1865a(getContext(), tf, style);
        }
        super.setTypeface(finalTypeface != null ? finalTypeface : tf, style);
    }
}
