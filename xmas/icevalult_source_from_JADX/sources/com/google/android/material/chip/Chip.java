package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p000a.p002b.p011p.C0150g;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p043j.p045b.C0504a;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0986i;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0921g;
import p066b.p067a.p068a.p069a.p070a0.C0922h;
import p066b.p067a.p068a.p069a.p073d0.C0932c;
import p066b.p067a.p068a.p069a.p073d0.C0933d;
import p066b.p067a.p068a.p069a.p073d0.C0937f;
import p066b.p067a.p068a.p069a.p074e0.C0942b;
import p066b.p067a.p068a.p069a.p076g0.C0957h;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p088s.C1047a;

public class Chip extends C0150g implements C1047a.C1048a, C0975n {

    /* renamed from: u */
    public static final Rect f4767u = new Rect();

    /* renamed from: v */
    public static final int[] f4768v = {16842913};

    /* renamed from: w */
    public static final int[] f4769w = {16842911};

    /* renamed from: e */
    public C1047a f4770e;

    /* renamed from: f */
    public InsetDrawable f4771f;

    /* renamed from: g */
    public RippleDrawable f4772g;

    /* renamed from: h */
    public View.OnClickListener f4773h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f4774i;

    /* renamed from: j */
    public boolean f4775j;

    /* renamed from: k */
    public boolean f4776k;

    /* renamed from: l */
    public boolean f4777l;

    /* renamed from: m */
    public boolean f4778m;

    /* renamed from: n */
    public boolean f4779n;

    /* renamed from: o */
    public int f4780o;

    /* renamed from: p */
    public int f4781p;

    /* renamed from: q */
    public final C1156c f4782q;

    /* renamed from: r */
    public final Rect f4783r;

    /* renamed from: s */
    public final RectF f4784s;

    /* renamed from: t */
    public final C0937f f4785t;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C1154a extends C0937f {
        public C1154a() {
        }

        /* renamed from: b */
        public void mo5522b(Typeface typeface, boolean fontResolvedSynchronously) {
            Chip chip = Chip.this;
            chip.setText(chip.f4770e.mo6018B2() ? Chip.this.f4770e.mo6071Z0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        /* renamed from: a */
        public void mo5521a(int reason) {
        }
    }

    public Chip(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.chipStyle);
    }

    public Chip(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f4783r = new Rect();
        this.f4784s = new RectF();
        this.f4785t = new C1154a();
        mo6631B(attrs);
        int i = C0989j.Widget_MaterialComponents_Chip_Action;
        C1047a drawable = C1047a.m5564q0(context, attrs, defStyleAttr, i);
        mo6670n(context, attrs, defStyleAttr);
        setChipDrawable(drawable);
        drawable.mo5587S(C0460r.m2284q(this));
        TypedArray a = C0921g.m5054k(context, attrs, C1020k.f4264o, defStyleAttr, i, new int[0]);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            setTextColor(C0932c.m5073a(context, a, C1020k.f4272q));
        }
        boolean hasShapeAppearanceAttribute = a.hasValue(C1020k.f4194Y);
        a.recycle();
        C1156c cVar = new C1156c(this);
        this.f4782q = cVar;
        if (i2 >= 24) {
            C0460r.m2257c0(this, cVar);
        } else {
            mo6779w();
        }
        if (!hasShapeAppearanceAttribute) {
            mo6671o();
        }
        setChecked(this.f4775j);
        setText(drawable.mo6071Z0());
        setEllipsize(drawable.mo6059T0());
        setIncludeFontPadding(false);
        mo6630A();
        if (!this.f4770e.mo6018B2()) {
            setSingleLine();
        }
        setGravity(8388627);
        mo6782z();
        if (mo6777u()) {
            setMinHeight(this.f4781p);
        }
        this.f4780o = C0460r.m2292v(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0957h.m5179f(this, this.f4770e);
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo5587S(elevation);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (mo6681q() || isClickable()) {
            info.setClassName(mo6681q() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            info.setClassName("android.view.View");
        }
        info.setCheckable(mo6681q());
        info.setClickable(isClickable());
    }

    /* renamed from: w */
    public final void mo6779w() {
        if (Build.VERSION.SDK_INT < 24) {
            if (!mo6669m() || !mo6682r()) {
                C0460r.m2257c0(this, (C0420a) null);
            } else {
                C0460r.m2257c0(this, this.f4782q);
            }
        }
    }

    /* renamed from: n */
    public final void mo6670n(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = C0921g.m5054k(context, attrs, C1020k.f4264o, defStyleAttr, C0989j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f4779n = a.getBoolean(C1020k.f4174T, false);
        this.f4781p = (int) Math.ceil((double) a.getDimension(C1020k.f4126H, (float) Math.ceil((double) C0922h.m5056a(getContext(), 48))));
        a.recycle();
    }

    /* renamed from: z */
    public final void mo6782z() {
        C1047a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f4770e) != null) {
            C0460r.m2281o0(this, (int) (this.f4770e.mo6037I0() + this.f4770e.mo6077c1() + this.f4770e.mo6092h0()), getPaddingTop(), (int) (aVar.mo6022D0() + this.f4770e.mo6075b1() + this.f4770e.mo6103l0()), getPaddingBottom());
        }
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);
        if (this.f4780o != layoutDirection) {
            this.f4780o = layoutDirection;
            mo6782z();
        }
    }

    /* renamed from: B */
    public final void mo6631B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* renamed from: o */
    public final void mo6671o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C1155b());
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C1155b extends ViewOutlineProvider {
        public C1155b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f4770e != null) {
                Chip.this.f4770e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public Drawable getChipDrawable() {
        return this.f4770e;
    }

    public void setChipDrawable(C1047a drawable) {
        C1047a aVar = this.f4770e;
        if (aVar != drawable) {
            mo6778v(aVar);
            this.f4770e = drawable;
            drawable.mo6120q2(false);
            mo6664h(this.f4770e);
            mo6666j(this.f4781p);
            mo6780x();
        }
    }

    /* renamed from: x */
    public final void mo6780x() {
        if (C0942b.f3881a) {
            mo6781y();
            return;
        }
        this.f4770e.mo6015A2(true);
        C0460r.m2263f0(this, getBackgroundDrawable());
        mo6667k();
    }

    /* renamed from: k */
    public final void mo6667k() {
        if (getBackgroundDrawable() == this.f4771f && this.f4770e.getCallback() == null) {
            this.f4770e.setCallback(this.f4771f);
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4771f;
        if (insetDrawable == null) {
            return this.f4770e;
        }
        return insetDrawable;
    }

    /* renamed from: y */
    public final void mo6781y() {
        this.f4772g = new RippleDrawable(C0942b.m5099a(this.f4770e.mo6067X0()), getBackgroundDrawable(), (Drawable) null);
        this.f4770e.mo6015A2(false);
        C0460r.m2263f0(this, this.f4772g);
    }

    /* renamed from: v */
    public final void mo6778v(C1047a chipDrawable) {
        if (chipDrawable != null) {
            chipDrawable.mo6084f2((C1047a.C1048a) null);
        }
    }

    /* renamed from: h */
    public final void mo6664h(C1047a chipDrawable) {
        chipDrawable.mo6084f2(this);
    }

    public int[] onCreateDrawableState(int extraSpace) {
        int[] state = super.onCreateDrawableState(extraSpace + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(state, f4768v);
        }
        if (mo6681q()) {
            CheckBox.mergeDrawableStates(state, f4769w);
        }
        return state;
    }

    public void setGravity(int gravity) {
        if (gravity != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(gravity);
        }
    }

    public void setBackgroundTintList(ColorStateList tint) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setBackgroundColor(int color) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int resid) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackground(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.f4772g) {
            super.setBackground(background);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        if (background == getBackgroundDrawable() || background == this.f4772g) {
            super.setBackgroundDrawable(background);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawables(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
        if (left != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (right == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
        if (left != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (right == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelative(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) {
        if (start != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable start, Drawable top, Drawable end, Drawable bottom) {
        if (start != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (end == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public TextUtils.TruncateAt getEllipsize() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6059T0();
        }
        return null;
    }

    public void setEllipsize(TextUtils.TruncateAt where) {
        if (this.f4770e != null) {
            if (where != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(where);
                C1047a aVar = this.f4770e;
                if (aVar != null) {
                    aVar.mo6087g2(where);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setSingleLine(boolean singleLine) {
        if (singleLine) {
            super.setSingleLine(singleLine);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setLines(int lines) {
        if (lines <= 1) {
            super.setLines(lines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMinLines(int minLines) {
        if (minLines <= 1) {
            super.setMinLines(minLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int maxLines) {
        if (maxLines <= 1) {
            super.setMaxLines(maxLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int maxWidth) {
        super.setMaxWidth(maxWidth);
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6110n2(maxWidth);
        }
    }

    /* renamed from: a */
    public void mo6151a() {
        mo6666j(this.f4781p);
        mo6780x();
        mo6782z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1047a aVar = this.f4770e;
        if (aVar == null) {
            this.f4775j = checked;
        } else if (aVar.mo6086g1()) {
            boolean wasChecked = isChecked();
            super.setChecked(checked);
            if (wasChecked != checked && (onCheckedChangeListener = this.f4774i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, checked);
            }
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener listener) {
        this.f4774i = listener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener listener) {
        this.f4773h = listener;
    }

    /* renamed from: s */
    public boolean mo6683s() {
        boolean result;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f4773h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            result = true;
        } else {
            result = false;
        }
        this.f4782q.mo2708U(1, 1);
        return result;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r1 != 3) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r7.getActionMasked()
            android.graphics.RectF r2 = r6.getCloseIconTouchBounds()
            float r3 = r7.getX()
            float r4 = r7.getY()
            boolean r2 = r2.contains(r3, r4)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r4) goto L_0x002d
            r5 = 2
            if (r1 == r5) goto L_0x0022
            r5 = 3
            if (r1 == r5) goto L_0x0035
            goto L_0x003f
        L_0x0022:
            boolean r5 = r6.f4776k
            if (r5 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x002b
            r6.setCloseIconPressed(r3)
        L_0x002b:
            r0 = 1
            goto L_0x003f
        L_0x002d:
            boolean r5 = r6.f4776k
            if (r5 == 0) goto L_0x0035
            r6.mo6683s()
            r0 = 1
        L_0x0035:
            r6.setCloseIconPressed(r3)
            goto L_0x003f
        L_0x0039:
            if (r2 == 0) goto L_0x003f
            r6.setCloseIconPressed(r4)
            r0 = 1
        L_0x003f:
            if (r0 != 0) goto L_0x0047
            boolean r5 = super.onTouchEvent(r7)
            if (r5 == 0) goto L_0x0048
        L_0x0047:
            r3 = 1
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onHoverEvent(MotionEvent event) {
        int action = event.getActionMasked();
        if (action == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(event.getX(), event.getY()));
        } else if (action == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(event);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: l */
    public final boolean mo6668l(MotionEvent event) {
        Class<C0504a> cls = C0504a.class;
        if (event.getAction() == 10) {
            try {
                Field f = cls.getDeclaredField("m");
                f.setAccessible(true);
                if (((Integer) f.get(this.f4782q)).intValue() != Integer.MIN_VALUE) {
                    Method m = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    m.setAccessible(true);
                    m.invoke(this.f4782q, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    public boolean dispatchHoverEvent(MotionEvent event) {
        return mo6668l(event) || this.f4782q.mo2718v(event) || super.dispatchHoverEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.f4782q.mo2719w(event) || this.f4782q.mo2690A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(event);
        }
        return true;
    }

    public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
        this.f4782q.mo2696I(focused, direction, previouslyFocusedRect);
    }

    public void getFocusedRect(Rect r) {
        if (this.f4782q.mo2690A() == 1 || this.f4782q.mo2720x() == 1) {
            r.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(r);
        }
    }

    private void setCloseIconPressed(boolean pressed) {
        if (this.f4776k != pressed) {
            this.f4776k = pressed;
            refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean hovered) {
        if (this.f4777l != hovered) {
            this.f4777l = hovered;
            refreshDrawableState();
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean changed = false;
        C1047a aVar = this.f4770e;
        if (aVar != null && aVar.mo6093h1()) {
            changed = this.f4770e.mo6076b2(mo6665i());
        }
        if (changed) {
            invalidate();
        }
    }

    /* renamed from: i */
    public final int[] mo6665i() {
        int count = 0;
        if (isEnabled()) {
            count = 0 + 1;
        }
        if (this.f4778m) {
            count++;
        }
        if (this.f4777l) {
            count++;
        }
        if (this.f4776k) {
            count++;
        }
        if (isChecked()) {
            count++;
        }
        int[] stateSet = new int[count];
        int i = 0;
        if (isEnabled()) {
            stateSet[0] = 16842910;
            i = 0 + 1;
        }
        if (this.f4778m) {
            stateSet[i] = 16842908;
            i++;
        }
        if (this.f4777l) {
            stateSet[i] = 16843623;
            i++;
        }
        if (this.f4776k) {
            stateSet[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            stateSet[i] = 16842913;
            int i2 = i + 1;
        }
        return stateSet;
    }

    /* renamed from: m */
    public final boolean mo6669m() {
        C1047a aVar = this.f4770e;
        return (aVar == null || aVar.mo6043L0() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f4784s.setEmpty();
        if (mo6669m()) {
            this.f4770e.mo6057S0(this.f4784s);
        }
        return this.f4784s;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF bounds = getCloseIconTouchBounds();
        this.f4783r.set((int) bounds.left, (int) bounds.top, (int) bounds.right, (int) bounds.bottom);
        return this.f4783r;
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        if (!getCloseIconTouchBounds().contains(event.getX(), event.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C1156c extends C0504a {
        public C1156c(Chip view) {
            super(view);
        }

        /* renamed from: B */
        public int mo2691B(float x, float y) {
            return (!Chip.this.mo6669m() || !Chip.this.getCloseIconTouchBounds().contains(x, y)) ? 0 : 1;
        }

        /* renamed from: C */
        public void mo2692C(List<Integer> virtualViewIds) {
            virtualViewIds.add(0);
            if (Chip.this.mo6669m() && Chip.this.mo6682r()) {
                virtualViewIds.add(1);
            }
        }

        /* renamed from: O */
        public void mo2702O(int virtualViewId, boolean hasFocus) {
            if (virtualViewId == 1) {
                boolean unused = Chip.this.f4778m = hasFocus;
                Chip.this.refreshDrawableState();
            }
        }

        /* renamed from: N */
        public void mo2701N(int virtualViewId, C0424c node) {
            CharSequence charSequence = "";
            if (virtualViewId == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    node.mo2463Z(closeIconContentDescription);
                } else {
                    CharSequence chipText = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i = C0986i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(chipText)) {
                        charSequence = chipText;
                    }
                    objArr[0] = charSequence;
                    node.mo2463Z(context.getString(i, objArr).trim());
                }
                node.mo2455R(Chip.this.getCloseIconTouchBoundsInt());
                node.mo2466b(C0424c.C0425a.f1999e);
                node.mo2467b0(Chip.this.isEnabled());
                return;
            }
            node.mo2463Z(charSequence);
            node.mo2455R(Chip.f4767u);
        }

        /* renamed from: M */
        public void mo2700M(C0424c node) {
            node.mo2457T(Chip.this.mo6681q());
            node.mo2460W(Chip.this.isClickable());
            if (Chip.this.mo6681q() || Chip.this.isClickable()) {
                node.mo2459V(Chip.this.mo6681q() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                node.mo2459V("android.view.View");
            }
            CharSequence chipText = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                node.mo2495p0(chipText);
            } else {
                node.mo2463Z(chipText);
            }
        }

        /* renamed from: J */
        public boolean mo2697J(int virtualViewId, int action, Bundle arguments) {
            if (action != 16) {
                return false;
            }
            if (virtualViewId == 0) {
                return Chip.this.performClick();
            }
            if (virtualViewId == 1) {
                return Chip.this.mo6683s();
            }
            return false;
        }
    }

    public ColorStateList getChipBackgroundColor() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6016B0();
        }
        return null;
    }

    public void setChipBackgroundColorResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6140w1(id);
        }
    }

    public void setChipBackgroundColor(ColorStateList chipBackgroundColor) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6137v1(chipBackgroundColor);
        }
    }

    public float getChipMinHeight() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6034H0();
        }
        return 0.0f;
    }

    public void setChipMinHeightResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6042K1(id);
        }
    }

    public void setChipMinHeight(float minHeight) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6040J1(minHeight);
        }
    }

    public float getChipCornerRadius() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6019C0();
        }
        return 0.0f;
    }

    @Deprecated
    public void setChipCornerRadiusResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6146y1(id);
        }
    }

    public void setShapeAppearanceModel(C0960k shapeAppearanceModel) {
        this.f4770e.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public C0960k getShapeAppearanceModel() {
        return this.f4770e.mo5571B();
    }

    @Deprecated
    public void setChipCornerRadius(float chipCornerRadius) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6143x1(chipCornerRadius);
        }
    }

    public ColorStateList getChipStrokeColor() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6039J0();
        }
        return null;
    }

    public void setChipStrokeColorResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6050O1(id);
        }
    }

    public void setChipStrokeColor(ColorStateList chipStrokeColor) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6048N1(chipStrokeColor);
        }
    }

    public float getChipStrokeWidth() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6041K0();
        }
        return 0.0f;
    }

    public void setChipStrokeWidthResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6054Q1(id);
        }
    }

    public void setChipStrokeWidth(float chipStrokeWidth) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6052P1(chipStrokeWidth);
        }
    }

    public ColorStateList getRippleColor() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6067X0();
        }
        return null;
    }

    public void setRippleColorResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6118p2(id);
            if (!this.f4770e.mo6081e1()) {
                mo6781y();
            }
        }
    }

    public void setRippleColor(ColorStateList rippleColor) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6113o2(rippleColor);
        }
        if (!this.f4770e.mo6081e1()) {
            mo6781y();
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void setLayoutDirection(int layoutDirection) {
        if (this.f4770e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(layoutDirection);
        }
    }

    public void setText(CharSequence text, TextView.BufferType type) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            if (text == null) {
                text = "";
            }
            super.setText(aVar.mo6018B2() ? null : text, type);
            C1047a aVar2 = this.f4770e;
            if (aVar2 != null) {
                aVar2.mo6131t2(text);
            }
        }
    }

    @Deprecated
    public void setChipTextResource(int id) {
        setText(getResources().getString(id));
    }

    @Deprecated
    public void setChipText(CharSequence chipText) {
        setText(chipText);
    }

    public void setTextAppearanceResource(int id) {
        setTextAppearance(getContext(), id);
    }

    public void setTextAppearance(C0933d textAppearance) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6134u2(textAppearance);
        }
        mo6630A();
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6138v2(resId);
        }
        mo6630A();
    }

    public void setTextAppearance(int resId) {
        super.setTextAppearance(resId);
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6138v2(resId);
        }
        mo6630A();
    }

    /* renamed from: A */
    public final void mo6630A() {
        TextPaint textPaint = getPaint();
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            textPaint.drawableState = aVar.getState();
        }
        C0933d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo5538i(getContext(), textPaint, this.f4785t);
        }
    }

    private C0933d getTextAppearance() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6073a1();
        }
        return null;
    }

    public void setChipIconVisible(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6035H1(id);
        }
    }

    public void setChipIconVisible(boolean chipIconVisible) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6038I1(chipIconVisible);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int id) {
        setChipIconVisible(id);
    }

    @Deprecated
    public void setChipIconEnabled(boolean chipIconEnabled) {
        setChipIconVisible(chipIconEnabled);
    }

    public Drawable getChipIcon() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6025E0();
        }
        return null;
    }

    public void setChipIconResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6020C1(id);
        }
    }

    public void setChipIcon(Drawable chipIcon) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6017B1(chipIcon);
        }
    }

    public ColorStateList getChipIconTint() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6031G0();
        }
        return null;
    }

    public void setChipIconTintResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6032G1(id);
        }
    }

    public void setChipIconTint(ColorStateList chipIconTint) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6029F1(chipIconTint);
        }
    }

    public float getChipIconSize() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6028F0();
        }
        return 0.0f;
    }

    public void setChipIconSizeResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6026E1(id);
        }
    }

    public void setChipIconSize(float chipIconSize) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6023D1(chipIconSize);
        }
    }

    /* renamed from: r */
    public boolean mo6682r() {
        C1047a aVar = this.f4770e;
        return aVar != null && aVar.mo6096i1();
    }

    public void setCloseIconVisible(int id) {
        setCloseIconVisible(getResources().getBoolean(id));
    }

    public void setCloseIconVisible(boolean closeIconVisible) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6082e2(closeIconVisible);
        }
        mo6779w();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int id) {
        setCloseIconVisible(id);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean closeIconEnabled) {
        setCloseIconVisible(closeIconEnabled);
    }

    public Drawable getCloseIcon() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6043L0();
        }
        return null;
    }

    public void setCloseIconResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6066W1(id);
        }
        mo6779w();
    }

    public void setCloseIcon(Drawable closeIcon) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6058S1(closeIcon);
        }
        mo6779w();
    }

    public ColorStateList getCloseIconTint() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6055R0();
        }
        return null;
    }

    public void setCloseIconTintResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6080d2(id);
        }
    }

    public void setCloseIconTint(ColorStateList closeIconTint) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6078c2(closeIconTint);
        }
    }

    public float getCloseIconSize() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6049O0();
        }
        return 0.0f;
    }

    public void setCloseIconSizeResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6070Y1(id);
        }
    }

    public void setCloseIconSize(float closeIconSize) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6068X1(closeIconSize);
        }
    }

    public void setCloseIconContentDescription(CharSequence closeIconContentDescription) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6060T1(closeIconContentDescription);
        }
    }

    public CharSequence getCloseIconContentDescription() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6045M0();
        }
        return null;
    }

    /* renamed from: q */
    public boolean mo6681q() {
        C1047a aVar = this.f4770e;
        return aVar != null && aVar.mo6086g1();
    }

    public void setCheckableResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6119q1(id);
        }
    }

    public void setCheckable(boolean checkable) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6117p1(checkable);
        }
    }

    public void setCheckedIconVisible(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6130t1(id);
        }
    }

    public void setCheckedIconVisible(boolean checkedIconVisible) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6133u1(checkedIconVisible);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int id) {
        setCheckedIconVisible(id);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean checkedIconEnabled) {
        setCheckedIconVisible(checkedIconEnabled);
    }

    public Drawable getCheckedIcon() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6013A0();
        }
        return null;
    }

    public void setCheckedIconResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6125s1(id);
        }
    }

    public void setCheckedIcon(Drawable checkedIcon) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6122r1(checkedIcon);
        }
    }

    public C1030h getShowMotionSpec() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6069Y0();
        }
        return null;
    }

    public void setShowMotionSpecResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6126s2(id);
        }
    }

    public void setShowMotionSpec(C1030h showMotionSpec) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6123r2(showMotionSpec);
        }
    }

    public C1030h getHideMotionSpec() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6061U0();
        }
        return null;
    }

    public void setHideMotionSpecResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6097i2(id);
        }
    }

    public void setHideMotionSpec(C1030h hideMotionSpec) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6094h2(hideMotionSpec);
        }
    }

    public float getChipStartPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6037I0();
        }
        return 0.0f;
    }

    public void setChipStartPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6046M1(id);
        }
    }

    public void setChipStartPadding(float chipStartPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6044L1(chipStartPadding);
        }
    }

    public float getIconStartPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6065W0();
        }
        return 0.0f;
    }

    public void setIconStartPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6107m2(id);
        }
    }

    public void setIconStartPadding(float iconStartPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6104l2(iconStartPadding);
        }
    }

    public float getIconEndPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6063V0();
        }
        return 0.0f;
    }

    public void setIconEndPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6102k2(id);
        }
    }

    public void setIconEndPadding(float iconEndPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6100j2(iconEndPadding);
        }
    }

    public float getTextStartPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6077c1();
        }
        return 0.0f;
    }

    public void setTextStartPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6150z2(id);
        }
    }

    public void setTextStartPadding(float textStartPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6147y2(textStartPadding);
        }
    }

    public float getTextEndPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6075b1();
        }
        return 0.0f;
    }

    public void setTextEndPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6144x2(id);
        }
    }

    public void setTextEndPadding(float textEndPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6141w2(textEndPadding);
        }
    }

    public float getCloseIconStartPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6051P0();
        }
        return 0.0f;
    }

    public void setCloseIconStartPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6074a2(id);
        }
    }

    public void setCloseIconStartPadding(float closeIconStartPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6072Z1(closeIconStartPadding);
        }
    }

    public float getCloseIconEndPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6047N0();
        }
        return 0.0f;
    }

    public void setCloseIconEndPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6064V1(id);
        }
    }

    public void setCloseIconEndPadding(float closeIconEndPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6062U1(closeIconEndPadding);
        }
    }

    public float getChipEndPadding() {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            return aVar.mo6022D0();
        }
        return 0.0f;
    }

    public void setChipEndPaddingResource(int id) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6014A1(id);
        }
    }

    public void setChipEndPadding(float chipEndPadding) {
        C1047a aVar = this.f4770e;
        if (aVar != null) {
            aVar.mo6149z1(chipEndPadding);
        }
    }

    /* renamed from: u */
    public boolean mo6777u() {
        return this.f4779n;
    }

    public void setEnsureMinTouchTargetSize(boolean flag) {
        this.f4779n = flag;
        mo6666j(this.f4781p);
    }

    /* renamed from: j */
    public boolean mo6666j(int minTargetPx) {
        this.f4781p = minTargetPx;
        int deltaY = 0;
        if (!mo6777u()) {
            mo6776t();
            return false;
        }
        int deltaHeight = Math.max(0, minTargetPx - this.f4770e.getIntrinsicHeight());
        int deltaWidth = Math.max(0, minTargetPx - this.f4770e.getIntrinsicWidth());
        if (deltaWidth > 0 || deltaHeight > 0) {
            int deltaX = deltaWidth > 0 ? deltaWidth / 2 : 0;
            if (deltaHeight > 0) {
                deltaY = deltaHeight / 2;
            }
            if (this.f4771f != null) {
                Rect padding = new Rect();
                this.f4771f.getPadding(padding);
                if (padding.top == deltaY && padding.bottom == deltaY && padding.left == deltaX && padding.right == deltaX) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != minTargetPx) {
                    setMinHeight(minTargetPx);
                }
                if (getMinWidth() != minTargetPx) {
                    setMinWidth(minTargetPx);
                }
            } else {
                setMinHeight(minTargetPx);
                setMinWidth(minTargetPx);
            }
            mo6680p(deltaX, deltaY, deltaX, deltaY);
            return true;
        }
        mo6776t();
        return false;
    }

    /* renamed from: t */
    public final void mo6776t() {
        if (this.f4771f != null) {
            this.f4771f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo6780x();
        }
    }

    /* renamed from: p */
    public final void mo6680p(int insetLeft, int insetTop, int insetRight, int insetBottom) {
        this.f4771f = new InsetDrawable(this.f4770e, insetLeft, insetTop, insetRight, insetBottom);
    }
}
