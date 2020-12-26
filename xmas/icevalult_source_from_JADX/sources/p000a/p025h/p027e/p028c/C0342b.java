package p000a.p025h.p027e.p028c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: a.h.e.c.b */
public final class C0342b {

    /* renamed from: a */
    public final Shader f1836a;

    /* renamed from: b */
    public final ColorStateList f1837b;

    /* renamed from: c */
    public int f1838c;

    public C0342b(Shader shader, ColorStateList colorStateList, int color) {
        this.f1836a = shader;
        this.f1837b = colorStateList;
        this.f1838c = color;
    }

    /* renamed from: d */
    public static C0342b m1790d(Shader shader) {
        return new C0342b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: c */
    public static C0342b m1789c(ColorStateList colorStateList) {
        return new C0342b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: b */
    public static C0342b m1788b(int color) {
        return new C0342b((Shader) null, (ColorStateList) null, color);
    }

    /* renamed from: f */
    public Shader mo2239f() {
        return this.f1836a;
    }

    /* renamed from: e */
    public int mo2238e() {
        return this.f1838c;
    }

    /* renamed from: k */
    public void mo2243k(int color) {
        this.f1838c = color;
    }

    /* renamed from: h */
    public boolean mo2240h() {
        return this.f1836a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1837b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2241i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1836a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1837b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p027e.p028c.C0342b.mo2241i():boolean");
    }

    /* renamed from: j */
    public boolean mo2242j(int[] stateSet) {
        if (!mo2241i()) {
            return false;
        }
        ColorStateList colorStateList = this.f1837b;
        int colorForState = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (colorForState == this.f1838c) {
            return false;
        }
        this.f1838c = colorForState;
        return true;
    }

    /* renamed from: l */
    public boolean mo2244l() {
        return mo2240h() || this.f1838c != 0;
    }

    /* renamed from: g */
    public static C0342b m1791g(Resources resources, int resId, Resources.Theme theme) {
        try {
            return m1787a(resources, resId, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C0342b m1787a(Resources resources, int resId, Resources.Theme theme) {
        int type;
        XmlPullParser parser = resources.getXml(resId);
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            int next = parser.next();
            type = next;
            if (next == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            String name = parser.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m1789c(C0341a.m1782b(resources, parser, attrs, theme));
            }
            if (c == 1) {
                return m1790d(C0348d.m1818b(resources, parser, attrs, theme));
            }
            throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
