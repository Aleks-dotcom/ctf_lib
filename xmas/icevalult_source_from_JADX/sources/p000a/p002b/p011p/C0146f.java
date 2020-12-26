package p000a.p002b.p011p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p000a.p002b.C0003a;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p040n.C0483b;
import p000a.p025h.p040n.C0490i;

/* renamed from: a.b.p.f */
public class C0146f extends Button implements C0459q, C0483b {

    /* renamed from: b */
    public final C0144e f835b;

    /* renamed from: c */
    public final C0223y f836c;

    public C0146f(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.buttonStyle);
    }

    public C0146f(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0201t0.m1044b(context), attrs, defStyleAttr);
        C0144e eVar = new C0144e(this);
        this.f835b = eVar;
        eVar.mo1026e(attrs, defStyleAttr);
        C0223y yVar = new C0223y(this);
        this.f836c = yVar;
        yVar.mo1545m(attrs, defStyleAttr);
        yVar.mo1535b();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f835b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f835b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f835b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f835b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f835b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f835b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f835b;
        if (eVar != null) {
            eVar.mo1023b();
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1535b();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1548p(context, resId);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Button.class.getName());
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1546n(changed, left, top, right, bottom);
        }
    }

    public void setTextSize(int unit, float size) {
        if (C0483b.f2088a) {
            super.setTextSize(unit, size);
            return;
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1558z(unit, size);
        }
    }

    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        C0223y yVar = this.f836c;
        if (yVar != null && !C0483b.f2088a && yVar.mo1544l()) {
            this.f836c.mo1536c();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1553u(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1551s(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (C0483b.f2088a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1552t(presetSizes, unit);
        }
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0483b.f2088a) {
            C0223y yVar = this.f836c;
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
        C0223y yVar = this.f836c;
        if (yVar != null) {
            return yVar.mo1539g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0483b.f2088a) {
            return super.getAutoSizeMinTextSize();
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            return yVar.mo1538f();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (C0483b.f2088a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            return yVar.mo1537e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0483b.f2088a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0223y yVar = this.f836c;
        if (yVar != null) {
            return yVar.mo1540h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        C0223y yVar = this.f836c;
        if (yVar != null) {
            yVar.mo1550r(allCaps);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(C0490i.m2441p(this, actionModeCallback));
    }
}
