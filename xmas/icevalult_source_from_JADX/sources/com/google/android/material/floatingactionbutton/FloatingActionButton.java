package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import p000a.p002b.p011p.C0160j;
import p000a.p002b.p011p.C0183n;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p037l.C0419h;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p040n.C0494l;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0912b;
import p066b.p067a.p068a.p069a.p070a0.C0923i;
import p066b.p067a.p068a.p069a.p075f0.C0945b;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;
import p066b.p067a.p068a.p069a.p078i0.C0987a;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p081l.C1033k;
import p066b.p067a.p068a.p069a.p095y.C1099a;
import p066b.p067a.p068a.p069a.p095y.C1100b;
import p066b.p067a.p068a.p069a.p096z.C1102b;
import p066b.p067a.p068a.p069a.p096z.C1115c;

@CoordinatorLayout.C0825d(Behavior.class)
public class FloatingActionButton extends C0923i implements C0459q, C0494l, C1099a, C0975n {

    /* renamed from: c */
    public ColorStateList f4816c;

    /* renamed from: d */
    public PorterDuff.Mode f4817d;

    /* renamed from: e */
    public ColorStateList f4818e;

    /* renamed from: f */
    public PorterDuff.Mode f4819f;

    /* renamed from: g */
    public ColorStateList f4820g;

    /* renamed from: h */
    public int f4821h;

    /* renamed from: i */
    public int f4822i;

    /* renamed from: j */
    public int f4823j;

    /* renamed from: k */
    public int f4824k;

    /* renamed from: l */
    public boolean f4825l;

    /* renamed from: m */
    public final Rect f4826m;

    /* renamed from: n */
    public final Rect f4827n;

    /* renamed from: o */
    public final C0183n f4828o;

    /* renamed from: p */
    public final C1100b f4829p;

    /* renamed from: q */
    public C1102b f4830q;

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C1168b {
        /* renamed from: b */
        public void mo6522b(FloatingActionButton fab) {
        }

        /* renamed from: a */
        public void mo6521a(FloatingActionButton fab) {
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int preferredSize = getSizeDimension();
        this.f4823j = (preferredSize - this.f4824k) / 2;
        getImpl().mo6316b0();
        int d = Math.min(m6243r(preferredSize, widthMeasureSpec), m6243r(preferredSize, heightMeasureSpec));
        Rect rect = this.f4826m;
        setMeasuredDimension(rect.left + d + rect.right, rect.top + d + rect.bottom);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f4820g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f4820g;
    }

    public void setRippleColor(int color) {
        setRippleColor(ColorStateList.valueOf(color));
    }

    public void setRippleColor(ColorStateList color) {
        if (this.f4820g != color) {
            this.f4820g = color;
            getImpl().mo6306R(this.f4820g);
        }
    }

    public ColorStateList getBackgroundTintList() {
        return this.f4816c;
    }

    public void setBackgroundTintList(ColorStateList tint) {
        if (this.f4816c != tint) {
            this.f4816c = tint;
            getImpl().mo6298J(tint);
        }
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f4817d;
    }

    public void setBackgroundTintMode(PorterDuff.Mode tintMode) {
        if (this.f4817d != tintMode) {
            this.f4817d = tintMode;
            getImpl().mo6299K(tintMode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        setBackgroundTintList(tint);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        setBackgroundTintMode(tintMode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public void setSupportImageTintList(ColorStateList tint) {
        if (this.f4818e != tint) {
            this.f4818e = tint;
            mo6897q();
        }
    }

    public ColorStateList getSupportImageTintList() {
        return this.f4818e;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        if (this.f4819f != tintMode) {
            this.f4819f = tintMode;
            mo6897q();
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f4819f;
    }

    /* renamed from: q */
    public final void mo6897q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f4818e;
            if (colorStateList == null) {
                C0370a.m1933c(drawable);
                return;
            }
            int color = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f4819f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0160j.m884e(color, mode));
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int resid) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int color) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setImageResource(int resId) {
        this.f4828o.mo1274g(resId);
        mo6897q();
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo6315a0();
            if (this.f4818e != null) {
                mo6897q();
            }
        }
    }

    public void setShapeAppearanceModel(C0960k shapeAppearance) {
        getImpl().mo6308T(shapeAppearance);
    }

    public C0960k getShapeAppearanceModel() {
        C0960k t = getImpl().mo6335t();
        C0419h.m2060c(t);
        return t;
    }

    public void setEnsureMinTouchTargetSize(boolean flag) {
        if (flag != getImpl().mo6329n()) {
            getImpl().mo6301M(flag);
            requestLayout();
        }
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
    }

    /* renamed from: s */
    public void mo6898s(C1168b listener) {
        mo6930t(listener, true);
    }

    /* renamed from: t */
    public void mo6930t(C1168b listener, boolean fromUser) {
        getImpl().mo6313Y(mo6931u(listener), fromUser);
    }

    /* renamed from: f */
    public void mo6863f(Animator.AnimatorListener listener) {
        getImpl().mo6320e(listener);
    }

    /* renamed from: l */
    public void mo6886l(C1168b listener) {
        mo6887m(listener, true);
    }

    /* renamed from: m */
    public void mo6887m(C1168b listener, boolean fromUser) {
        getImpl().mo6337v(mo6931u(listener), fromUser);
    }

    /* renamed from: e */
    public void mo6862e(Animator.AnimatorListener listener) {
        getImpl().mo6318d(listener);
    }

    /* renamed from: a */
    public boolean mo6281a() {
        return this.f4829p.mo6283b();
    }

    public void setExpandedComponentIdHint(int expandedComponentIdHint) {
        this.f4829p.mo6286e(expandedComponentIdHint);
    }

    public int getExpandedComponentIdHint() {
        return this.f4829p.mo6282a();
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        if (this.f4825l != useCompatPadding) {
            this.f4825l = useCompatPadding;
            getImpl().mo6289A();
        }
    }

    public boolean getUseCompatPadding() {
        return this.f4825l;
    }

    public void setSize(int size) {
        this.f4822i = 0;
        if (size != this.f4821h) {
            this.f4821h = size;
            requestLayout();
        }
    }

    public int getSize() {
        return this.f4821h;
    }

    /* renamed from: u */
    public final C1102b.C1112j mo6931u(C1168b listener) {
        if (listener == null) {
            return null;
        }
        return new C1167a(listener);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C1167a implements C1102b.C1112j {

        /* renamed from: a */
        public final /* synthetic */ C1168b f4834a;

        public C1167a(C1168b bVar) {
            this.f4834a = bVar;
        }

        /* renamed from: a */
        public void mo6354a() {
            this.f4834a.mo6522b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo6355b() {
            this.f4834a.mo6521a(FloatingActionButton.this);
        }
    }

    /* renamed from: n */
    public boolean mo6888n() {
        return getImpl().mo6338w();
    }

    /* renamed from: o */
    public boolean mo6889o() {
        return getImpl().mo6339x();
    }

    public void setCustomSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (size != this.f4822i) {
            this.f4822i = size;
            requestLayout();
        }
    }

    public int getCustomSize() {
        return this.f4822i;
    }

    public int getSizeDimension() {
        return mo6885k(this.f4821h);
    }

    /* renamed from: k */
    public final int mo6885k(int size) {
        int i = this.f4822i;
        if (i != 0) {
            return i;
        }
        Resources res = getResources();
        if (size != -1) {
            if (size != 1) {
                return res.getDimensionPixelSize(C0928d.design_fab_size_normal);
            }
            return res.getDimensionPixelSize(C0928d.design_fab_size_mini);
        } else if (Math.max(res.getConfiguration().screenWidthDp, res.getConfiguration().screenHeightDp) < 470) {
            return mo6885k(1);
        } else {
            return mo6885k(0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo6341z();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo6290B();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo6291C(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo6340y();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        if (superState == null) {
            superState = new Bundle();
        }
        new C0987a(superState);
        this.f4829p.mo6285d();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C0987a)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0987a ess = (C0987a) state;
        super.onRestoreInstanceState(ess.mo2682f());
        C1100b bVar = this.f4829p;
        Bundle bundle = ess.f4024d.get("expandableWidgetHelper");
        C0419h.m2060c(bundle);
        bVar.mo6284c(bundle);
        throw null;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo6882i(Rect rect) {
        if (!C0460r.m2235J(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo6896p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo6883j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        mo6896p(rect);
    }

    /* renamed from: p */
    public final void mo6896p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f4826m;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public Drawable getContentBackground() {
        return getImpl().mo6325j();
    }

    /* renamed from: r */
    public static int m6243r(int desiredSize, int measureSpec) {
        int i = desiredSize;
        int specMode = View.MeasureSpec.getMode(measureSpec);
        int specSize = View.MeasureSpec.getSize(measureSpec);
        if (specMode == Integer.MIN_VALUE) {
            return Math.min(desiredSize, specSize);
        }
        if (specMode == 0) {
            return desiredSize;
        }
        if (specMode == 1073741824) {
            return specSize;
        }
        throw new IllegalArgumentException();
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() != 0 || !mo6882i(this.f4827n) || this.f4827n.contains((int) ev.getX(), (int) ev.getY())) {
            return super.onTouchEvent(ev);
        }
        return false;
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0824c<T> {

        /* renamed from: a */
        public Rect f4831a;

        /* renamed from: b */
        public C1168b f4832b;

        /* renamed from: c */
        public boolean f4833c;

        public BaseBehavior() {
            this.f4833c = true;
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4257m0);
            this.f4833c = a.getBoolean(C1020k.f4261n0, true);
            a.recycle();
        }

        /* renamed from: g */
        public void mo4420g(CoordinatorLayout.C0827f lp) {
            if (lp.f3371h == 0) {
                lp.f3371h = 80;
            }
        }

        /* renamed from: H */
        public boolean mo4421h(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                mo6937K(parent, (AppBarLayout) dependency, child);
                return false;
            } else if (!m6261F(dependency)) {
                return false;
            } else {
                mo6938L(dependency, child);
                return false;
            }
        }

        /* renamed from: F */
        public static boolean m6261F(View view) {
            ViewGroup.LayoutParams lp = view.getLayoutParams();
            if (lp instanceof CoordinatorLayout.C0827f) {
                return ((CoordinatorLayout.C0827f) lp).mo4448f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        public final boolean mo6936J(View dependency, FloatingActionButton child) {
            CoordinatorLayout.C0827f lp = (CoordinatorLayout.C0827f) child.getLayoutParams();
            if (this.f4833c && lp.mo4447e() == dependency.getId() && child.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        public final boolean mo6937K(CoordinatorLayout parent, AppBarLayout appBarLayout, FloatingActionButton child) {
            if (!mo6936J(appBarLayout, child)) {
                return false;
            }
            if (this.f4831a == null) {
                this.f4831a = new Rect();
            }
            Rect rect = this.f4831a;
            C0912b.m5020a(parent, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                child.mo6887m(this.f4832b, false);
                return true;
            }
            child.mo6930t(this.f4832b, false);
            return true;
        }

        /* renamed from: L */
        public final boolean mo6938L(View bottomSheet, FloatingActionButton child) {
            if (!mo6936J(bottomSheet, child)) {
                return false;
            }
            if (bottomSheet.getTop() < (child.getHeight() / 2) + ((CoordinatorLayout.C0827f) child.getLayoutParams()).topMargin) {
                child.mo6887m(this.f4832b, false);
                return true;
            }
            child.mo6930t(this.f4832b, false);
            return true;
        }

        /* renamed from: I */
        public boolean mo4425l(CoordinatorLayout parent, FloatingActionButton child, int layoutDirection) {
            List<View> dependencies = parent.mo4391r(child);
            int count = dependencies.size();
            for (int i = 0; i < count; i++) {
                View dependency = dependencies.get(i);
                if (!(dependency instanceof AppBarLayout)) {
                    if (m6261F(dependency) && mo6938L(dependency, child)) {
                        break;
                    }
                } else if (mo6937K(parent, (AppBarLayout) dependency, child)) {
                    break;
                }
            }
            parent.mo4350I(child, layoutDirection);
            mo6933G(parent, child);
            return true;
        }

        /* renamed from: E */
        public boolean mo4415b(CoordinatorLayout parent, FloatingActionButton child, Rect rect) {
            Rect shadowPadding = child.f4826m;
            rect.set(child.getLeft() + shadowPadding.left, child.getTop() + shadowPadding.top, child.getRight() - shadowPadding.right, child.getBottom() - shadowPadding.bottom);
            return true;
        }

        /* renamed from: G */
        public final void mo6933G(CoordinatorLayout parent, FloatingActionButton fab) {
            Rect padding = fab.f4826m;
            if (padding != null && padding.centerX() > 0 && padding.centerY() > 0) {
                CoordinatorLayout.C0827f lp = (CoordinatorLayout.C0827f) fab.getLayoutParams();
                int offsetTB = 0;
                int offsetLR = 0;
                if (fab.getRight() >= parent.getWidth() - lp.rightMargin) {
                    offsetLR = padding.right;
                } else if (fab.getLeft() <= lp.leftMargin) {
                    offsetLR = -padding.left;
                }
                if (fab.getBottom() >= parent.getHeight() - lp.bottomMargin) {
                    offsetTB = padding.bottom;
                } else if (fab.getTop() <= lp.topMargin) {
                    offsetTB = -padding.top;
                }
                if (offsetTB != 0) {
                    C0460r.m2241P(fab, offsetTB);
                }
                if (offsetLR != 0) {
                    C0460r.m2240O(fab, offsetLR);
                }
            }
        }
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        getImpl().mo6317c0(elevation);
    }

    public float getCompatElevation() {
        return getImpl().mo6328m();
    }

    public void setCompatElevation(float elevation) {
        getImpl().mo6300L(elevation);
    }

    public void setCompatElevationResource(int id) {
        setCompatElevation(getResources().getDimension(id));
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo6331p();
    }

    public void setCompatHoveredFocusedTranslationZ(float translationZ) {
        getImpl().mo6303O(translationZ);
    }

    public void setCompatHoveredFocusedTranslationZResource(int id) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(id));
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo6334s();
    }

    public void setCompatPressedTranslationZ(float translationZ) {
        getImpl().mo6305Q(translationZ);
    }

    public void setCompatPressedTranslationZResource(int id) {
        setCompatPressedTranslationZ(getResources().getDimension(id));
    }

    public C1030h getShowMotionSpec() {
        return getImpl().mo6336u();
    }

    public void setShowMotionSpec(C1030h spec) {
        getImpl().mo6309U(spec);
    }

    public void setShowMotionSpecResource(int id) {
        setShowMotionSpec(C1030h.m5433c(getContext(), id));
    }

    public C1030h getHideMotionSpec() {
        return getImpl().mo6330o();
    }

    public void setHideMotionSpec(C1030h spec) {
        getImpl().mo6302N(spec);
    }

    public void setHideMotionSpecResource(int id) {
        setHideMotionSpec(C1030h.m5433c(getContext(), id));
    }

    /* renamed from: g */
    public void mo6864g(C1033k<? extends FloatingActionButton> listener) {
        getImpl().mo6321f(new C1170d(listener));
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public class C1170d<T extends FloatingActionButton> implements C1102b.C1111i {

        /* renamed from: a */
        public final C1033k<T> f4837a;

        public C1170d(C1033k<T> listener) {
            this.f4837a = listener;
        }

        /* renamed from: b */
        public void mo6353b() {
            this.f4837a.mo5877b(FloatingActionButton.this);
        }

        /* renamed from: a */
        public void mo6352a() {
            this.f4837a.mo5876a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1170d) && ((C1170d) obj).f4837a.equals(this.f4837a);
        }

        public int hashCode() {
            return this.f4837a.hashCode();
        }
    }

    public void setTranslationX(float translationX) {
        super.setTranslationX(translationX);
        getImpl().mo6296H();
    }

    public void setTranslationY(float translationY) {
        super.setTranslationY(translationY);
        getImpl().mo6296H();
    }

    public void setTranslationZ(float translationZ) {
        super.setTranslationZ(translationZ);
        getImpl().mo6296H();
    }

    public void setScaleX(float scaleX) {
        super.setScaleX(scaleX);
        getImpl().mo6295G();
    }

    public void setScaleY(float scaleY) {
        super.setScaleY(scaleY);
        getImpl().mo6295G();
    }

    public void setShadowPaddingEnabled(boolean shadowPaddingEnabled) {
        getImpl().mo6307S(shadowPaddingEnabled);
    }

    private C1102b getImpl() {
        if (this.f4830q == null) {
            this.f4830q = mo6881h();
        }
        return this.f4830q;
    }

    /* renamed from: h */
    public final C1102b mo6881h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C1115c(this, new C1169c());
        }
        return new C1102b(this, new C1169c());
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C1169c implements C0945b {
        public C1169c() {
        }

        /* renamed from: a */
        public void mo5559a(int left, int top, int right, int bottom) {
            FloatingActionButton.this.f4826m.set(left, top, right, bottom);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(floatingActionButton.f4823j + left, FloatingActionButton.this.f4823j + top, FloatingActionButton.this.f4823j + right, FloatingActionButton.this.f4823j + bottom);
        }

        /* renamed from: b */
        public void mo5560b(Drawable background) {
            if (background != null) {
                FloatingActionButton.super.setBackgroundDrawable(background);
            }
        }

        /* renamed from: c */
        public boolean mo5561c() {
            return FloatingActionButton.this.f4825l;
        }
    }
}
