package p000a.p002b.p011p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p002b.C0012j;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p040n.C0484c;

/* renamed from: a.b.p.i */
public class C0157i {

    /* renamed from: a */
    public final CompoundButton f869a;

    /* renamed from: b */
    public ColorStateList f870b = null;

    /* renamed from: c */
    public PorterDuff.Mode f871c = null;

    /* renamed from: d */
    public boolean f872d = false;

    /* renamed from: e */
    public boolean f873e = false;

    /* renamed from: f */
    public boolean f874f;

    public C0157i(CompoundButton view) {
        this.f869a = view;
    }

    /* renamed from: e */
    public void mo1109e(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        int resourceId2;
        TypedArray a = this.f869a.getContext().obtainStyledAttributes(attrs, C0012j.f53L0, defStyleAttr, 0);
        boolean buttonDrawableLoaded = false;
        try {
            int i = C0012j.f61N0;
            if (a.hasValue(i) && (resourceId2 = a.getResourceId(i, 0)) != 0) {
                try {
                    CompoundButton compoundButton = this.f869a;
                    compoundButton.setButtonDrawable(C0053a.m277d(compoundButton.getContext(), resourceId2));
                    buttonDrawableLoaded = true;
                } catch (Resources.NotFoundException e) {
                }
            }
            if (!buttonDrawableLoaded) {
                int i2 = C0012j.f57M0;
                if (a.hasValue(i2) && (resourceId = a.getResourceId(i2, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f869a;
                    compoundButton2.setButtonDrawable(C0053a.m277d(compoundButton2.getContext(), resourceId));
                }
            }
            int resourceId3 = C0012j.f65O0;
            if (a.hasValue(resourceId3)) {
                C0484c.m2412c(this.f869a, a.getColorStateList(resourceId3));
            }
            int i3 = C0012j.f69P0;
            if (a.hasValue(i3)) {
                C0484c.m2413d(this.f869a, C0145e0.m827d(a.getInt(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.recycle();
        }
    }

    /* renamed from: g */
    public void mo1111g(ColorStateList tint) {
        this.f870b = tint;
        this.f872d = true;
        mo1105a();
    }

    /* renamed from: c */
    public ColorStateList mo1107c() {
        return this.f870b;
    }

    /* renamed from: h */
    public void mo1112h(PorterDuff.Mode tintMode) {
        this.f871c = tintMode;
        this.f873e = true;
        mo1105a();
    }

    /* renamed from: d */
    public PorterDuff.Mode mo1108d() {
        return this.f871c;
    }

    /* renamed from: f */
    public void mo1110f() {
        if (this.f874f) {
            this.f874f = false;
            return;
        }
        this.f874f = true;
        mo1105a();
    }

    /* renamed from: a */
    public void mo1105a() {
        Drawable buttonDrawable = C0484c.m2410a(this.f869a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f872d || this.f873e) {
            Drawable buttonDrawable2 = C0370a.m1948r(buttonDrawable).mutate();
            if (this.f872d) {
                C0370a.m1945o(buttonDrawable2, this.f870b);
            }
            if (this.f873e) {
                C0370a.m1946p(buttonDrawable2, this.f871c);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f869a.getDrawableState());
            }
            this.f869a.setButtonDrawable(buttonDrawable2);
        }
    }

    /* renamed from: b */
    public int mo1106b(int superValue) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = C0484c.m2410a(this.f869a)) == null) {
            return superValue;
        }
        return superValue + buttonDrawable.getIntrinsicWidth();
    }
}
