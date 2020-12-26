package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p027e.p028c.C0351f;

/* renamed from: a.b.p.w0 */
public class C0218w0 {

    /* renamed from: a */
    public final Context f1079a;

    /* renamed from: b */
    public final TypedArray f1080b;

    /* renamed from: c */
    public TypedValue f1081c;

    /* renamed from: t */
    public static C0218w0 m1092t(Context context, AttributeSet set, int[] attrs) {
        return new C0218w0(context, context.obtainStyledAttributes(set, attrs));
    }

    /* renamed from: u */
    public static C0218w0 m1093u(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new C0218w0(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    /* renamed from: s */
    public static C0218w0 m1091s(Context context, int resid, int[] attrs) {
        return new C0218w0(context, context.obtainStyledAttributes(resid, attrs));
    }

    public C0218w0(Context context, TypedArray array) {
        this.f1079a = context;
        this.f1080b = array;
    }

    /* renamed from: g */
    public Drawable mo1502g(int index) {
        int resourceId;
        if (!this.f1080b.hasValue(index) || (resourceId = this.f1080b.getResourceId(index, 0)) == 0) {
            return this.f1080b.getDrawable(index);
        }
        return C0053a.m277d(this.f1079a, resourceId);
    }

    /* renamed from: h */
    public Drawable mo1503h(int index) {
        int resourceId;
        if (!this.f1080b.hasValue(index) || (resourceId = this.f1080b.getResourceId(index, 0)) == 0) {
            return null;
        }
        return C0160j.m883b().mo1166d(this.f1079a, resourceId, true);
    }

    /* renamed from: j */
    public Typeface mo1505j(int index, int style, C0351f.C0352a fontCallback) {
        int resourceId = this.f1080b.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1081c == null) {
            this.f1081c = new TypedValue();
        }
        return C0351f.m1826c(this.f1079a, resourceId, this.f1081c, style, fontCallback);
    }

    /* renamed from: p */
    public CharSequence mo1511p(int index) {
        return this.f1080b.getText(index);
    }

    /* renamed from: o */
    public String mo1510o(int index) {
        return this.f1080b.getString(index);
    }

    /* renamed from: a */
    public boolean mo1496a(int index, boolean defValue) {
        return this.f1080b.getBoolean(index, defValue);
    }

    /* renamed from: k */
    public int mo1506k(int index, int defValue) {
        return this.f1080b.getInt(index, defValue);
    }

    /* renamed from: i */
    public float mo1504i(int index, float defValue) {
        return this.f1080b.getFloat(index, defValue);
    }

    /* renamed from: b */
    public int mo1497b(int index, int defValue) {
        return this.f1080b.getColor(index, defValue);
    }

    /* renamed from: c */
    public ColorStateList mo1498c(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f1080b.hasValue(index) || (resourceId = this.f1080b.getResourceId(index, 0)) == 0 || (value = C0053a.m276c(this.f1079a, resourceId)) == null) {
            return this.f1080b.getColorStateList(index);
        }
        return value;
    }

    /* renamed from: l */
    public int mo1507l(int index, int defValue) {
        return this.f1080b.getInteger(index, defValue);
    }

    /* renamed from: d */
    public float mo1499d(int index, float defValue) {
        return this.f1080b.getDimension(index, defValue);
    }

    /* renamed from: e */
    public int mo1500e(int index, int defValue) {
        return this.f1080b.getDimensionPixelOffset(index, defValue);
    }

    /* renamed from: f */
    public int mo1501f(int index, int defValue) {
        return this.f1080b.getDimensionPixelSize(index, defValue);
    }

    /* renamed from: m */
    public int mo1508m(int index, int defValue) {
        return this.f1080b.getLayoutDimension(index, defValue);
    }

    /* renamed from: n */
    public int mo1509n(int index, int defValue) {
        return this.f1080b.getResourceId(index, defValue);
    }

    /* renamed from: q */
    public CharSequence[] mo1512q(int index) {
        return this.f1080b.getTextArray(index);
    }

    /* renamed from: r */
    public boolean mo1513r(int index) {
        return this.f1080b.hasValue(index);
    }

    /* renamed from: v */
    public void mo1514v() {
        this.f1080b.recycle();
    }
}
