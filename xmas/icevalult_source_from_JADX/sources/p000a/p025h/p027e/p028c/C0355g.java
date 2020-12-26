package p000a.p025h.p027e.p028c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.h.e.c.g */
public class C0355g {
    /* renamed from: j */
    public static boolean m1843j(XmlPullParser parser, String attrName) {
        return parser.getAttributeValue("http://schemas.android.com/apk/res/android", attrName) != null;
    }

    /* renamed from: f */
    public static float m1839f(TypedArray a, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        if (!m1843j(parser, attrName)) {
            return defaultValue;
        }
        return a.getFloat(resId, defaultValue);
    }

    /* renamed from: a */
    public static boolean m1834a(TypedArray a, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        if (!m1843j(parser, attrName)) {
            return defaultValue;
        }
        return a.getBoolean(resId, defaultValue);
    }

    /* renamed from: g */
    public static int m1840g(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m1843j(parser, attrName)) {
            return defaultValue;
        }
        return a.getInt(resId, defaultValue);
    }

    /* renamed from: b */
    public static int m1835b(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m1843j(parser, attrName)) {
            return defaultValue;
        }
        return a.getColor(resId, defaultValue);
    }

    /* renamed from: e */
    public static C0342b m1838e(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (m1843j(parser, attrName)) {
            TypedValue value = new TypedValue();
            a.getValue(resId, value);
            int i = value.type;
            if (i >= 28 && i <= 31) {
                return C0342b.m1788b(value.data);
            }
            C0342b complexColor = C0342b.m1791g(a.getResources(), a.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return C0342b.m1788b(defaultValue);
    }

    /* renamed from: c */
    public static ColorStateList m1836c(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId) {
        if (!m1843j(parser, attrName)) {
            return null;
        }
        TypedValue value = new TypedValue();
        a.getValue(resId, value);
        int i = value.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + resId + ": " + value);
        } else if (i < 28 || i > 31) {
            return C0341a.m1783c(a.getResources(), a.getResourceId(resId, 0), theme);
        } else {
            return m1837d(value);
        }
    }

    /* renamed from: d */
    public static ColorStateList m1837d(TypedValue value) {
        return ColorStateList.valueOf(value.data);
    }

    /* renamed from: h */
    public static int m1841h(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m1843j(parser, attrName)) {
            return defaultValue;
        }
        return a.getResourceId(resId, defaultValue);
    }

    /* renamed from: i */
    public static String m1842i(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m1843j(parser, attrName)) {
            return null;
        }
        return a.getString(resId);
    }

    /* renamed from: l */
    public static TypedValue m1845l(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m1843j(parser, attrName)) {
            return null;
        }
        return a.peekValue(resId);
    }

    /* renamed from: k */
    public static TypedArray m1844k(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }
}
