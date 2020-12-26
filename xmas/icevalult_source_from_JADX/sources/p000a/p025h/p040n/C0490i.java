package p000a.p025h.p040n;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p000a.p025h.p036k.C0400c;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.h.n.i */
public final class C0490i {
    /* renamed from: i */
    public static void m2434i(TextView textView, Drawable start, Drawable top, Drawable end, Drawable bottom) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(start, top, end, bottom);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            boolean rtl = z;
            textView.setCompoundDrawables(rtl ? end : start, top, rtl ? start : end, bottom);
        } else {
            textView.setCompoundDrawables(start, top, end, bottom);
        }
    }

    /* renamed from: n */
    public static void m2439n(TextView textView, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(resId);
        } else {
            textView.setTextAppearance(textView.getContext(), resId);
        }
    }

    /* renamed from: a */
    public static Drawable[] m2426a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        boolean rtl = z;
        Drawable[] compounds = textView.getCompoundDrawables();
        if (rtl) {
            Drawable start = compounds[2];
            Drawable end = compounds[0];
            compounds[0] = start;
            compounds[2] = end;
        }
        return compounds;
    }

    /* renamed from: p */
    public static ActionMode.Callback m2441p(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0491a)) ? callback : new C0491a(callback, textView);
    }

    /* renamed from: a.h.n.i$a */
    public static class C0491a implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f2096a;

        /* renamed from: b */
        public final TextView f2097b;

        /* renamed from: c */
        public Class f2098c;

        /* renamed from: d */
        public Method f2099d;

        /* renamed from: e */
        public boolean f2100e;

        /* renamed from: f */
        public boolean f2101f = false;

        public C0491a(ActionMode.Callback callback, TextView textView) {
            this.f2096a = callback;
            this.f2097b = textView;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f2096a.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            mo2660f(menu);
            return this.f2096a.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f2096a.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.f2096a.onDestroyActionMode(mode);
        }

        /* renamed from: f */
        public final void mo2660f(Menu menu) {
            Method removeItemAtMethod;
            Context context = this.f2097b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2101f) {
                this.f2101f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2098c = cls;
                    this.f2099d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2100e = true;
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    this.f2098c = null;
                    this.f2099d = null;
                    this.f2100e = false;
                }
            }
            try {
                if (!this.f2100e || !this.f2098c.isInstance(menu)) {
                    removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    removeItemAtMethod = this.f2099d;
                }
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, new Object[]{Integer.valueOf(i)});
                    }
                }
                List<ResolveInfo> supportedActivities = mo2657c(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info.loadLabel(packageManager)).setIntent(mo2656b(info, this.f2097b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            }
        }

        /* renamed from: c */
        public final List<ResolveInfo> mo2657c(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            if (!(context instanceof Activity)) {
                return supportedActivities;
            }
            for (ResolveInfo info : packageManager.queryIntentActivities(mo2655a(), 0)) {
                if (mo2659e(info, context)) {
                    supportedActivities.add(info);
                }
            }
            return supportedActivities;
        }

        /* renamed from: e */
        public final boolean mo2659e(ResolveInfo info, Context context) {
            if (context.getPackageName().equals(info.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = info.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final Intent mo2656b(ResolveInfo info, TextView textView11) {
            Intent putExtra = mo2655a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !mo2658d(textView11));
            ActivityInfo activityInfo = info.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: d */
        public final boolean mo2658d(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        /* renamed from: a */
        public final Intent mo2655a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: j */
    public static void m2435j(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        C0419h.m2059b(firstBaselineToTopHeight);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (i < 16 || textView.getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight - (-fontMetricsTop), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: k */
    public static void m2436k(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        C0419h.m2059b(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), lastBaselineToBottomHeight - fontMetricsBottom);
        }
    }

    /* renamed from: b */
    public static int m2427b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m2428c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: l */
    public static void m2437l(TextView textView, int lineHeight) {
        C0419h.m2059b(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing((float) (lineHeight - fontHeight), 1.0f);
        }
    }

    /* renamed from: f */
    public static C0400c.C0401a m2431f(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0400c.C0401a(textView.getTextMetricsParams());
        }
        C0400c.C0401a.C0402a builder = new C0400c.C0401a.C0402a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            builder.mo2402b(textView.getBreakStrategy());
            builder.mo2403c(textView.getHyphenationFrequency());
        }
        if (i >= 18) {
            builder.mo2404d(m2430e(textView));
        }
        return builder.mo2401a();
    }

    /* renamed from: o */
    public static void m2440o(TextView textView, C0400c.C0401a params) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setTextDirection(m2429d(params.mo2396d()));
        }
        if (i < 23) {
            float paintTextScaleX = params.mo2397e().getTextScaleX();
            textView.getPaint().set(params.mo2397e());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.mo2397e());
        textView.setBreakStrategy(params.mo2394b());
        textView.setHyphenationFrequency(params.mo2395c());
    }

    /* renamed from: m */
    public static void m2438m(TextView textView, C0400c precomputed) {
        if (m2431f(textView).mo2393a(precomputed.mo2381a())) {
            textView.setText(precomputed);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: e */
    public static TextDirectionHeuristic m2430e(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            boolean defaultIsRtl = z;
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (defaultIsRtl) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte digitDirection = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: d */
    public static int m2429d(TextDirectionHeuristic heuristic) {
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (heuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (heuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (heuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (heuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: g */
    public static void m2432g(TextView textView, ColorStateList tint) {
        C0419h.m2060c(textView);
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(tint);
        } else if (textView instanceof C0493k) {
            ((C0493k) textView).setSupportCompoundDrawablesTintList(tint);
        }
    }

    /* renamed from: h */
    public static void m2433h(TextView textView, PorterDuff.Mode tintMode) {
        C0419h.m2060c(textView);
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(tintMode);
        } else if (textView instanceof C0493k) {
            ((C0493k) textView).setSupportCompoundDrawablesTintMode(tintMode);
        }
    }
}
