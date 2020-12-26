package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p011p.C0146f;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p040n.C0490i;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.p076g0.C0957h;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;
import p066b.p067a.p068a.p069a.p084o.C1041a;

public class MaterialButton extends C0146f implements Checkable, C0975n {

    /* renamed from: p */
    public static final int[] f4752p = {16842911};

    /* renamed from: q */
    public static final int[] f4753q = {16842912};

    /* renamed from: r */
    public static final int f4754r = C0989j.Widget_MaterialComponents_Button;

    /* renamed from: d */
    public final C1041a f4755d;

    /* renamed from: e */
    public final LinkedHashSet<C1152a> f4756e;

    /* renamed from: f */
    public C1153b f4757f;

    /* renamed from: g */
    public PorterDuff.Mode f4758g;

    /* renamed from: h */
    public ColorStateList f4759h;

    /* renamed from: i */
    public Drawable f4760i;

    /* renamed from: j */
    public int f4761j;

    /* renamed from: k */
    public int f4762k;

    /* renamed from: l */
    public int f4763l;

    /* renamed from: m */
    public boolean f4764m;

    /* renamed from: n */
    public boolean f4765n;

    /* renamed from: o */
    public int f4766o;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C1152a {
        /* renamed from: a */
        void mo6628a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C1153b {
        /* renamed from: a */
        void mo6629a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f4754r
            android.content.Context r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5049f(r9, r10, r11, r6)
            r8.<init>(r0, r10, r11)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r8.f4756e = r0
            r7 = 0
            r8.f4764m = r7
            r8.f4765n = r7
            android.content.Context r9 = r8.getContext()
            int[] r2 = p066b.p067a.p068a.p069a.C1020k.f4293v0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5054k(r0, r1, r2, r3, r4, r5)
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4127H0
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r8.f4763l = r1
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4139K0
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = p066b.p067a.p068a.p069a.p070a0.C0922h.m5058c(r1, r2)
            r8.f4758g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4135J0
            android.content.res.ColorStateList r1 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5073a(r1, r0, r2)
            r8.f4759h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p066b.p067a.p068a.p069a.C1020k.f4119F0
            android.graphics.drawable.Drawable r1 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5076d(r1, r0, r2)
            r8.f4760i = r1
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4123G0
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f4766o = r1
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4131I0
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r8.f4761j = r1
            b.a.a.a.g0.k$b r1 = p066b.p067a.p068a.p069a.p076g0.C0960k.m5186e(r9, r10, r11, r6)
            b.a.a.a.g0.k r1 = r1.mo5662m()
            b.a.a.a.o.a r3 = new b.a.a.a.o.a
            r3.<init>(r8, r1)
            r8.f4755d = r3
            r3.mo5932o(r0)
            r0.recycle()
            int r3 = r8.f4763l
            r8.setCompoundDrawablePadding(r3)
            android.graphics.drawable.Drawable r3 = r8.f4760i
            if (r3 == 0) goto L_0x0086
            r7 = 1
        L_0x0086:
            r8.mo6580e(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private String getA11yClassName() {
        return (mo6576a() ? CompoundButton.class : Button.class).getName();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(getA11yClassName());
        info.setCheckable(mo6576a());
        info.setChecked(isChecked());
        info.setClickable(isClickable());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        if (mo6578c()) {
            this.f4755d.mo5942y(tint);
        } else {
            super.setSupportBackgroundTintList(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo6578c()) {
            return this.f4755d.mo5927j();
        }
        return super.getSupportBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (mo6578c()) {
            this.f4755d.mo5943z(tintMode);
        } else {
            super.setSupportBackgroundTintMode(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo6578c()) {
            return this.f4755d.mo5928k();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(ColorStateList tintList) {
        setSupportBackgroundTintList(tintList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        setSupportBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(int color) {
        if (mo6578c()) {
            this.f4755d.mo5933p(color);
        } else {
            super.setBackgroundColor(color);
        }
    }

    public void setBackground(Drawable background) {
        setBackgroundDrawable(background);
    }

    public void setBackgroundResource(int backgroundResourceId) {
        Drawable background = null;
        if (backgroundResourceId != 0) {
            background = C0053a.m277d(getContext(), backgroundResourceId);
        }
        setBackgroundDrawable(background);
    }

    public void setBackgroundDrawable(Drawable background) {
        if (!mo6578c()) {
            super.setBackgroundDrawable(background);
        } else if (background != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f4755d.mo5934q();
            super.setBackgroundDrawable(background);
        } else {
            getBackground().setState(background.getState());
        }
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        C1041a aVar;
        super.onLayout(changed, left, top, right, bottom);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f4755d) != null) {
            aVar.mo5915B(bottom - top, right - left);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mo6581f();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        super.onTextChanged(charSequence, i, i1, i2);
        mo6581f();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0957h.m5179f(this, this.f4755d.mo5921d());
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        if (mo6578c()) {
            this.f4755d.mo5921d().mo5587S(elevation);
        }
    }

    /* renamed from: f */
    public final void mo6581f() {
        if (this.f4760i != null && getLayout() != null) {
            int i = this.f4766o;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f4762k = 0;
                mo6580e(false);
                return;
            }
            Paint textPaint = getPaint();
            String buttonText = getText().toString();
            if (getTransformationMethod() != null) {
                buttonText = getTransformationMethod().getTransformation(buttonText, this).toString();
            }
            int textWidth = Math.min((int) textPaint.measureText(buttonText), getLayout().getEllipsizedWidth());
            int localIconSize = this.f4761j;
            if (localIconSize == 0) {
                localIconSize = this.f4760i.getIntrinsicWidth();
            }
            int newIconLeft = (((((getMeasuredWidth() - textWidth) - C0460r.m2296z(this)) - localIconSize) - this.f4763l) - C0460r.m2226A(this)) / 2;
            boolean b = mo6577b();
            if (this.f4766o != 4) {
                z = false;
            }
            if (b != z) {
                newIconLeft = -newIconLeft;
            }
            if (this.f4762k != newIconLeft) {
                this.f4762k = newIconLeft;
                mo6580e(false);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo6577b() {
        return C0460r.m2292v(this) == 1;
    }

    public void setInternalBackground(Drawable background) {
        super.setBackgroundDrawable(background);
    }

    public void setIconPadding(int iconPadding) {
        if (this.f4763l != iconPadding) {
            this.f4763l = iconPadding;
            setCompoundDrawablePadding(iconPadding);
        }
    }

    public int getIconPadding() {
        return this.f4763l;
    }

    public void setIconSize(int iconSize) {
        if (iconSize < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f4761j != iconSize) {
            this.f4761j = iconSize;
            mo6580e(true);
        }
    }

    public int getIconSize() {
        return this.f4761j;
    }

    public void setIcon(Drawable icon) {
        if (this.f4760i != icon) {
            this.f4760i = icon;
            mo6580e(true);
        }
    }

    public void setIconResource(int iconResourceId) {
        Drawable icon = null;
        if (iconResourceId != 0) {
            icon = C0053a.m277d(getContext(), iconResourceId);
        }
        setIcon(icon);
    }

    public Drawable getIcon() {
        return this.f4760i;
    }

    public void setIconTint(ColorStateList iconTint) {
        if (this.f4759h != iconTint) {
            this.f4759h = iconTint;
            mo6580e(false);
        }
    }

    public void setIconTintResource(int iconTintResourceId) {
        setIconTint(C0053a.m276c(getContext(), iconTintResourceId));
    }

    public ColorStateList getIconTint() {
        return this.f4759h;
    }

    public void setIconTintMode(PorterDuff.Mode iconTintMode) {
        if (this.f4758g != iconTintMode) {
            this.f4758g = iconTintMode;
            mo6580e(false);
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4758g;
    }

    /* renamed from: e */
    public final void mo6580e(boolean needsIconUpdate) {
        Drawable drawable = this.f4760i;
        boolean hasIconChanged = false;
        if (drawable != null) {
            Drawable mutate = C0370a.m1948r(drawable).mutate();
            this.f4760i = mutate;
            C0370a.m1945o(mutate, this.f4759h);
            PorterDuff.Mode mode = this.f4758g;
            if (mode != null) {
                C0370a.m1946p(this.f4760i, mode);
            }
            int width = this.f4761j;
            if (width == 0) {
                width = this.f4760i.getIntrinsicWidth();
            }
            int height = this.f4761j;
            if (height == 0) {
                height = this.f4760i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4760i;
            int i = this.f4762k;
            drawable2.setBounds(i, 0, i + width, height);
        }
        int width2 = this.f4766o;
        boolean isIconStart = width2 == 1 || width2 == 2;
        if (needsIconUpdate) {
            mo6579d(isIconStart);
            return;
        }
        Drawable[] existingDrawables = C0490i.m2426a(this);
        Drawable drawableStart = existingDrawables[0];
        Drawable drawableEnd = existingDrawables[2];
        if ((isIconStart && drawableStart != this.f4760i) || (!isIconStart && drawableEnd != this.f4760i)) {
            hasIconChanged = true;
        }
        if (hasIconChanged) {
            mo6579d(isIconStart);
        }
    }

    /* renamed from: d */
    public final void mo6579d(boolean isIconStart) {
        if (isIconStart) {
            C0490i.m2434i(this, this.f4760i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0490i.m2434i(this, (Drawable) null, (Drawable) null, this.f4760i, (Drawable) null);
        }
    }

    public void setRippleColor(ColorStateList rippleColor) {
        if (mo6578c()) {
            this.f4755d.mo5937t(rippleColor);
        }
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        if (mo6578c()) {
            setRippleColor(C0053a.m276c(getContext(), rippleColorResourceId));
        }
    }

    public ColorStateList getRippleColor() {
        if (mo6578c()) {
            return this.f4755d.mo5923f();
        }
        return null;
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        if (mo6578c()) {
            this.f4755d.mo5940w(strokeColor);
        }
    }

    public void setStrokeColorResource(int strokeColorResourceId) {
        if (mo6578c()) {
            setStrokeColor(C0053a.m276c(getContext(), strokeColorResourceId));
        }
    }

    public ColorStateList getStrokeColor() {
        if (mo6578c()) {
            return this.f4755d.mo5925h();
        }
        return null;
    }

    public void setStrokeWidth(int strokeWidth) {
        if (mo6578c()) {
            this.f4755d.mo5941x(strokeWidth);
        }
    }

    public void setStrokeWidthResource(int strokeWidthResourceId) {
        if (mo6578c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(strokeWidthResourceId));
        }
    }

    public int getStrokeWidth() {
        if (mo6578c()) {
            return this.f4755d.mo5926i();
        }
        return 0;
    }

    public void setCornerRadius(int cornerRadius) {
        if (mo6578c()) {
            this.f4755d.mo5936s(cornerRadius);
        }
    }

    public void setCornerRadiusResource(int cornerRadiusResourceId) {
        if (mo6578c()) {
            setCornerRadius(getResources().getDimensionPixelSize(cornerRadiusResourceId));
        }
    }

    public int getCornerRadius() {
        if (mo6578c()) {
            return this.f4755d.mo5919b();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.f4766o;
    }

    public void setIconGravity(int iconGravity) {
        if (this.f4766o != iconGravity) {
            this.f4766o = iconGravity;
            mo6581f();
        }
    }

    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 2);
        if (mo6576a()) {
            Button.mergeDrawableStates(drawableState, f4752p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(drawableState, f4753q);
        }
        return drawableState;
    }

    public void setChecked(boolean checked) {
        if (mo6576a() && isEnabled() && this.f4764m != checked) {
            this.f4764m = checked;
            refreshDrawableState();
            if (!this.f4765n) {
                this.f4765n = true;
                Iterator it = this.f4756e.iterator();
                while (it.hasNext()) {
                    ((C1152a) it.next()).mo6628a(this, this.f4764m);
                }
                this.f4765n = false;
            }
        }
    }

    public boolean isChecked() {
        return this.f4764m;
    }

    public void toggle() {
        setChecked(!this.f4764m);
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    /* renamed from: a */
    public boolean mo6576a() {
        C1041a aVar = this.f4755d;
        return aVar != null && aVar.mo5931n();
    }

    public void setCheckable(boolean checkable) {
        if (mo6578c()) {
            this.f4755d.mo5935r(checkable);
        }
    }

    public void setShapeAppearanceModel(C0960k shapeAppearanceModel) {
        if (mo6578c()) {
            this.f4755d.mo5938u(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public C0960k getShapeAppearanceModel() {
        if (mo6578c()) {
            return this.f4755d.mo5924g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public void setOnPressedChangeListenerInternal(C1153b listener) {
        this.f4757f = listener;
    }

    public void setPressed(boolean pressed) {
        C1153b bVar = this.f4757f;
        if (bVar != null) {
            bVar.mo6629a(this, pressed);
        }
        super.setPressed(pressed);
    }

    /* renamed from: c */
    public final boolean mo6578c() {
        C1041a aVar = this.f4755d;
        return aVar != null && !aVar.mo5930m();
    }

    public void setShouldDrawSurfaceColorStroke(boolean shouldDrawSurfaceColorStroke) {
        if (mo6578c()) {
            this.f4755d.mo5939v(shouldDrawSurfaceColorStroke);
        }
    }
}
