package p000a.p025h.p027e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: a.h.e.a */
public class C0339a {

    /* renamed from: a */
    public static final Object f1834a = new Object();

    /* renamed from: b */
    public static TypedValue f1835b;

    /* renamed from: d */
    public static boolean m1778d(Context context, Intent[] intents, Bundle options) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intents, options);
            return true;
        }
        context.startActivities(intents);
        return true;
    }

    /* renamed from: c */
    public static Drawable m1777c(Context context, int id) {
        int resolvedId;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            return context.getDrawable(id);
        }
        if (i >= 16) {
            return context.getResources().getDrawable(id);
        }
        synchronized (f1834a) {
            if (f1835b == null) {
                f1835b = new TypedValue();
            }
            context.getResources().getValue(id, f1835b, true);
            resolvedId = f1835b.resourceId;
        }
        return context.getResources().getDrawable(resolvedId);
    }

    /* renamed from: b */
    public static ColorStateList m1776b(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(id);
        }
        return context.getResources().getColorStateList(id);
    }

    /* renamed from: a */
    public static int m1775a(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(id);
        }
        return context.getResources().getColor(id);
    }
}
