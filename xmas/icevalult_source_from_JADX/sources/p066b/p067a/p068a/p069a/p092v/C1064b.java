package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p000a.p025h.p037l.C0419h;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p073d0.C0932c;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;

/* renamed from: b.a.a.a.v.b */
public final class C1064b {

    /* renamed from: a */
    public final Rect f4475a;

    /* renamed from: b */
    public final ColorStateList f4476b;

    /* renamed from: c */
    public final ColorStateList f4477c;

    /* renamed from: d */
    public final ColorStateList f4478d;

    /* renamed from: e */
    public final int f4479e;

    /* renamed from: f */
    public final C0960k f4480f;

    public C1064b(ColorStateList backgroundColor, ColorStateList textColor, ColorStateList strokeColor, int strokeWidth, C0960k itemShape, Rect insets) {
        C0419h.m2059b(insets.left);
        C0419h.m2059b(insets.top);
        C0419h.m2059b(insets.right);
        C0419h.m2059b(insets.bottom);
        this.f4475a = insets;
        this.f4476b = textColor;
        this.f4477c = backgroundColor;
        this.f4478d = strokeColor;
        this.f4479e = strokeWidth;
        this.f4480f = itemShape;
    }

    /* renamed from: a */
    public static C1064b m5734a(Context context, int materialCalendarItemStyle) {
        Context context2 = context;
        int i = materialCalendarItemStyle;
        C0419h.m2058a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray styleableArray = context2.obtainStyledAttributes(i, C1020k.f4191X0);
        Rect insets = new Rect(styleableArray.getDimensionPixelOffset(C1020k.f4195Y0, 0), styleableArray.getDimensionPixelOffset(C1020k.f4204a1, 0), styleableArray.getDimensionPixelOffset(C1020k.f4199Z0, 0), styleableArray.getDimensionPixelOffset(C1020k.f4209b1, 0));
        ColorStateList backgroundColor = C0932c.m5073a(context2, styleableArray, C1020k.f4214c1);
        ColorStateList textColor = C0932c.m5073a(context2, styleableArray, C1020k.f4238h1);
        ColorStateList strokeColor = C0932c.m5073a(context2, styleableArray, C1020k.f4229f1);
        int strokeWidth = styleableArray.getDimensionPixelSize(C1020k.f4234g1, 0);
        int shapeAppearanceResId = styleableArray.getResourceId(C1020k.f4219d1, 0);
        C0960k itemShape = C0960k.m5183b(context2, shapeAppearanceResId, styleableArray.getResourceId(C1020k.f4224e1, 0)).mo5662m();
        styleableArray.recycle();
        int i2 = shapeAppearanceResId;
        return new C1064b(backgroundColor, textColor, strokeColor, strokeWidth, itemShape, insets);
    }

    /* renamed from: d */
    public void mo6205d(TextView item) {
        Drawable d;
        C0953g backgroundDrawable = new C0953g();
        C0953g shapeMask = new C0953g();
        backgroundDrawable.setShapeAppearanceModel(this.f4480f);
        shapeMask.setShapeAppearanceModel(this.f4480f);
        backgroundDrawable.mo5588T(this.f4477c);
        backgroundDrawable.mo5594Z((float) this.f4479e, this.f4478d);
        item.setTextColor(this.f4476b);
        if (Build.VERSION.SDK_INT >= 21) {
            d = new RippleDrawable(this.f4476b.withAlpha(30), backgroundDrawable, shapeMask);
        } else {
            d = backgroundDrawable;
        }
        Rect rect = this.f4475a;
        C0460r.m2263f0(item, new InsetDrawable(d, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* renamed from: c */
    public int mo6204c() {
        return this.f4475a.top;
    }

    /* renamed from: b */
    public int mo6203b() {
        return this.f4475a.bottom;
    }
}
