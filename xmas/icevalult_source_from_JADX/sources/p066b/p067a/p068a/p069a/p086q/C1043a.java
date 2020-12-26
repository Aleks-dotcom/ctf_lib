package p066b.p067a.p068a.p069a.p086q;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p016d.p017a.C0245a;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;

/* renamed from: b.a.a.a.q.a */
public class C1043a extends C0245a implements Checkable, C0975n {

    /* renamed from: l */
    public static final int[] f4383l = {16842911};

    /* renamed from: m */
    public static final int[] f4384m = {16842912};

    /* renamed from: n */
    public static final int[] f4385n = {C0924b.state_dragged};

    /* renamed from: g */
    public final C1045b f4386g;

    /* renamed from: h */
    public boolean f4387h;

    /* renamed from: i */
    public boolean f4388i;

    /* renamed from: j */
    public boolean f4389j;

    /* renamed from: k */
    public C1044a f4390k;

    /* renamed from: b.a.a.a.q.a$a */
    public interface C1044a {
        /* renamed from: a */
        void mo5979a(C1043a aVar, boolean z);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(C0245a.class.getName());
        info.setCheckable(mo5945e());
        info.setClickable(isClickable());
        info.setChecked(isChecked());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0245a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f4386g.mo6000p(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    public void setStrokeColor(int strokeColor) {
        this.f4386g.mo6010z(ColorStateList.valueOf(strokeColor));
    }

    public void setStrokeColor(ColorStateList strokeColor) {
        this.f4386g.mo6010z(strokeColor);
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f4386g.mo5994j();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f4386g.mo5995k();
    }

    public void setStrokeWidth(int strokeWidth) {
        this.f4386g.mo5980A(strokeWidth);
    }

    public int getStrokeWidth() {
        return this.f4386g.mo5996l();
    }

    public void setRadius(float radius) {
        super.setRadius(radius);
        this.f4386g.mo6006v(radius);
    }

    public float getRadius() {
        return this.f4386g.mo5990f();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public void setProgress(float progress) {
        this.f4386g.mo6007w(progress);
    }

    public float getProgress() {
        return this.f4386g.mo5991g();
    }

    public int getContentPaddingLeft() {
        return this.f4386g.mo5997m().left;
    }

    public int getContentPaddingTop() {
        return this.f4386g.mo5997m().top;
    }

    public int getContentPaddingRight() {
        return this.f4386g.mo5997m().right;
    }

    public int getContentPaddingBottom() {
        return this.f4386g.mo5997m().bottom;
    }

    public void setCardBackgroundColor(int color) {
        this.f4386g.mo6002r(ColorStateList.valueOf(color));
    }

    public void setCardBackgroundColor(ColorStateList color) {
        this.f4386g.mo6002r(color);
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f4386g.mo5987c();
    }

    public void setClickable(boolean clickable) {
        super.setClickable(clickable);
        this.f4386g.mo5981B();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4386g.mo5986b();
        throw null;
    }

    public void setCardElevation(float elevation) {
        super.setCardElevation(elevation);
        this.f4386g.mo5983D();
    }

    public void setMaxCardElevation(float maxCardElevation) {
        super.setMaxCardElevation(maxCardElevation);
        this.f4386g.mo5984E();
    }

    public void setUseCompatPadding(boolean useCompatPadding) {
        super.setUseCompatPadding(useCompatPadding);
        this.f4386g.mo5984E();
        this.f4386g.mo5982C();
    }

    public void setPreventCornerOverlap(boolean preventCornerOverlap) {
        super.setPreventCornerOverlap(preventCornerOverlap);
        this.f4386g.mo5984E();
        this.f4386g.mo5982C();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f4387h) {
            if (!this.f4386g.mo5998n()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f4386g.mo6001q(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public boolean isChecked() {
        return this.f4388i;
    }

    public void setChecked(boolean checked) {
        if (this.f4388i != checked) {
            toggle();
        }
    }

    public void setDragged(boolean dragged) {
        if (this.f4389j != dragged) {
            this.f4389j = dragged;
            refreshDrawableState();
            mo5944d();
            invalidate();
        }
    }

    /* renamed from: f */
    public boolean mo5946f() {
        return this.f4389j;
    }

    /* renamed from: e */
    public boolean mo5945e() {
        C1045b bVar = this.f4386g;
        return bVar != null && bVar.mo5999o();
    }

    public void setCheckable(boolean checkable) {
        this.f4386g.mo6003s(checkable);
    }

    public void toggle() {
        if (mo5945e() && isEnabled()) {
            this.f4388i = !this.f4388i;
            refreshDrawableState();
            mo5944d();
            C1044a aVar = this.f4390k;
            if (aVar != null) {
                aVar.mo5979a(this, this.f4388i);
            }
        }
    }

    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 3);
        if (mo5945e()) {
            FrameLayout.mergeDrawableStates(drawableState, f4383l);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(drawableState, f4384m);
        }
        if (mo5946f()) {
            FrameLayout.mergeDrawableStates(drawableState, f4385n);
        }
        return drawableState;
    }

    public void setOnCheckedChangeListener(C1044a listener) {
        this.f4390k = listener;
    }

    public void setRippleColor(ColorStateList rippleColor) {
        this.f4386g.mo6008x(rippleColor);
    }

    public void setRippleColorResource(int rippleColorResourceId) {
        this.f4386g.mo6008x(C0053a.m276c(getContext(), rippleColorResourceId));
        throw null;
    }

    public ColorStateList getRippleColor() {
        return this.f4386g.mo5992h();
    }

    public Drawable getCheckedIcon() {
        return this.f4386g.mo5988d();
    }

    public void setCheckedIconResource(int id) {
        this.f4386g.mo6004t(C0053a.m277d(getContext(), id));
        throw null;
    }

    public void setCheckedIcon(Drawable checkedIcon) {
        this.f4386g.mo6004t(checkedIcon);
    }

    public ColorStateList getCheckedIconTint() {
        return this.f4386g.mo5989e();
    }

    public void setCheckedIconTint(ColorStateList checkedIconTint) {
        this.f4386g.mo6005u(checkedIconTint);
    }

    public void setShapeAppearanceModel(C0960k shapeAppearanceModel) {
        this.f4386g.mo6009y(shapeAppearanceModel);
    }

    public C0960k getShapeAppearanceModel() {
        return this.f4386g.mo5993i();
    }

    /* renamed from: d */
    public final void mo5944d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f4386g.mo5985a();
        }
    }
}
