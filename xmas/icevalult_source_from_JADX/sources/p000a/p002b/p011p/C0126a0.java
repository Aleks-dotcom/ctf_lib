package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p002b.C0012j;

/* renamed from: a.b.p.a0 */
public class C0126a0 {

    /* renamed from: k */
    public static final RectF f771k = new RectF();

    /* renamed from: l */
    public static ConcurrentHashMap<String, Method> f772l = new ConcurrentHashMap<>();

    /* renamed from: m */
    public static ConcurrentHashMap<String, Field> f773m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f774a = 0;

    /* renamed from: b */
    public boolean f775b = false;

    /* renamed from: c */
    public float f776c = -1.0f;

    /* renamed from: d */
    public float f777d = -1.0f;

    /* renamed from: e */
    public float f778e = -1.0f;

    /* renamed from: f */
    public int[] f779f = new int[0];

    /* renamed from: g */
    public boolean f780g = false;

    /* renamed from: h */
    public TextPaint f781h;

    /* renamed from: i */
    public final TextView f782i;

    /* renamed from: j */
    public final Context f783j;

    public C0126a0(TextView textView) {
        this.f782i = textView;
        this.f783j = textView.getContext();
    }

    /* renamed from: t */
    public void mo931t(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        TypedArray a = this.f783j.obtainStyledAttributes(attrs, C0012j.f128d0, defStyleAttr, 0);
        int i = C0012j.f153i0;
        if (a.hasValue(i)) {
            this.f774a = a.getInt(i, 0);
        }
        int i2 = C0012j.f148h0;
        if (a.hasValue(i2)) {
            autoSizeStepGranularityInPx = a.getDimension(i2, -1.0f);
        }
        int i3 = C0012j.f138f0;
        if (a.hasValue(i3)) {
            autoSizeMinTextSizeInPx = a.getDimension(i3, -1.0f);
        }
        int i4 = C0012j.f133e0;
        if (a.hasValue(i4)) {
            autoSizeMaxTextSizeInPx = a.getDimension(i4, -1.0f);
        }
        int i5 = C0012j.f143g0;
        if (a.hasValue(i5) && (autoSizeStepSizeArrayResId = a.getResourceId(i5, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            mo911A(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a.recycle();
        if (!mo914D()) {
            this.f774a = 0;
        } else if (this.f774a == 1) {
            if (!this.f780g) {
                DisplayMetrics displayMetrics = this.f783j.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                mo915E(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            mo937z();
        }
    }

    /* renamed from: w */
    public void mo934w(int autoSizeTextType) {
        if (!mo914D()) {
            return;
        }
        if (autoSizeTextType == 0) {
            mo918d();
        } else if (autoSizeTextType == 1) {
            DisplayMetrics displayMetrics = this.f783j.getResources().getDisplayMetrics();
            mo915E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (mo937z()) {
                mo916b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
        }
    }

    /* renamed from: u */
    public void mo932u(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (mo914D()) {
            DisplayMetrics displayMetrics = this.f783j.getResources().getDisplayMetrics();
            mo915E(TypedValue.applyDimension(unit, (float) autoSizeMinTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeMaxTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeStepGranularity, displayMetrics));
            if (mo937z()) {
                mo916b();
            }
        }
    }

    /* renamed from: v */
    public void mo933v(int[] presetSizes, int unit) {
        if (mo914D()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.f783j.getResources().getDisplayMetrics();
                    for (int i = 0; i < presetSizesLength; i++) {
                        presetSizesInPx[i] = Math.round(TypedValue.applyDimension(unit, (float) presetSizes[i], displayMetrics));
                    }
                }
                this.f779f = mo917c(presetSizesInPx);
                if (!mo912B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f780g = false;
            }
            if (mo937z()) {
                mo916b();
            }
        }
    }

    /* renamed from: n */
    public int mo928n() {
        return this.f774a;
    }

    /* renamed from: l */
    public int mo926l() {
        return Math.round(this.f776c);
    }

    /* renamed from: k */
    public int mo925k() {
        return Math.round(this.f777d);
    }

    /* renamed from: j */
    public int mo924j() {
        return Math.round(this.f778e);
    }

    /* renamed from: m */
    public int[] mo927m() {
        return this.f779f;
    }

    /* renamed from: A */
    public final void mo911A(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i = 0; i < textSizesLength; i++) {
                parsedSizes[i] = textSizes.getDimensionPixelSize(i, -1);
            }
            this.f779f = mo917c(parsedSizes);
            mo912B();
        }
    }

    /* renamed from: B */
    public final boolean mo912B() {
        int[] iArr = this.f779f;
        int sizesLength = iArr.length;
        boolean z = sizesLength > 0;
        this.f780g = z;
        if (z) {
            this.f774a = 1;
            this.f777d = (float) iArr[0];
            this.f778e = (float) iArr[sizesLength - 1];
            this.f776c = -1.0f;
        }
        return z;
    }

    /* renamed from: c */
    public final int[] mo917c(int[] presetValues) {
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        List<Integer> uniqueValidSizes = new ArrayList<>();
        for (int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch(uniqueValidSizes, Integer.valueOf(currentPresetValue)) < 0) {
                uniqueValidSizes.add(Integer.valueOf(currentPresetValue));
            }
        }
        if (presetValuesLength == uniqueValidSizes.size()) {
            return presetValues;
        }
        int uniqueValidSizesLength = uniqueValidSizes.size();
        int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int i = 0; i < uniqueValidSizesLength; i++) {
            cleanedUpSizes[i] = uniqueValidSizes.get(i).intValue();
        }
        return cleanedUpSizes;
    }

    /* renamed from: E */
    public final void mo915E(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f774a = 1;
            this.f777d = autoSizeMinTextSizeInPx;
            this.f778e = autoSizeMaxTextSizeInPx;
            this.f776c = autoSizeStepGranularityInPx;
            this.f780g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: z */
    public final boolean mo937z() {
        if (!mo914D() || this.f774a != 1) {
            this.f775b = false;
        } else {
            if (!this.f780g || this.f779f.length == 0) {
                int autoSizeValuesLength = ((int) Math.floor((double) ((this.f778e - this.f777d) / this.f776c))) + 1;
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                for (int i = 0; i < autoSizeValuesLength; i++) {
                    autoSizeTextSizesInPx[i] = Math.round(this.f777d + (((float) i) * this.f776c));
                }
                this.f779f = mo917c(autoSizeTextSizesInPx);
            }
            this.f775b = true;
        }
        return this.f775b;
    }

    /* renamed from: b */
    public void mo916b() {
        boolean horizontallyScrolling;
        int availableWidth;
        if (mo930s()) {
            if (this.f775b) {
                if (this.f782i.getMeasuredHeight() > 0 && this.f782i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        horizontallyScrolling = this.f782i.isHorizontallyScrollable();
                    } else {
                        horizontallyScrolling = ((Boolean) m703r(this.f782i, "getHorizontallyScrolling", false)).booleanValue();
                    }
                    if (horizontallyScrolling) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.f782i.getMeasuredWidth() - this.f782i.getTotalPaddingLeft()) - this.f782i.getTotalPaddingRight();
                    }
                    int availableHeight = (this.f782i.getHeight() - this.f782i.getCompoundPaddingBottom()) - this.f782i.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        RectF rectF = f771k;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) availableWidth;
                            rectF.bottom = (float) availableHeight;
                            float optimalTextSize = (float) mo923i(rectF);
                            if (optimalTextSize != this.f782i.getTextSize()) {
                                mo936y(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f775b = true;
        }
    }

    /* renamed from: d */
    public final void mo918d() {
        this.f774a = 0;
        this.f777d = -1.0f;
        this.f778e = -1.0f;
        this.f776c = -1.0f;
        this.f779f = new int[0];
        this.f775b = false;
    }

    /* renamed from: y */
    public void mo936y(int unit, float size) {
        Resources res;
        Context context = this.f783j;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        mo935x(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    /* renamed from: x */
    public final void mo935x(float size) {
        if (size != this.f782i.getPaint().getTextSize()) {
            this.f782i.getPaint().setTextSize(size);
            boolean isInLayout = false;
            if (Build.VERSION.SDK_INT >= 18) {
                isInLayout = this.f782i.isInLayout();
            }
            if (this.f782i.getLayout() != null) {
                this.f775b = false;
                try {
                    Method method = m702p("nullLayouts");
                    if (method != null) {
                        method.invoke(this.f782i, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.f782i.requestLayout();
                } else {
                    this.f782i.forceLayout();
                }
                this.f782i.invalidate();
            }
        }
    }

    /* renamed from: i */
    public final int mo923i(RectF availableSpace) {
        int sizesCount = this.f779f.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (mo913C(this.f779f[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f779f[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: q */
    public void mo929q(int suggestedSizeInPx) {
        TextPaint textPaint = this.f781h;
        if (textPaint == null) {
            this.f781h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f781h.set(this.f782i.getPaint());
        this.f781h.setTextSize((float) suggestedSizeInPx);
    }

    /* renamed from: e */
    public StaticLayout mo919e(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return mo920f(text, alignment, availableWidth, maxLines);
        }
        if (i >= 16) {
            return mo922h(text, alignment, availableWidth);
        }
        return mo921g(text, alignment, availableWidth);
    }

    /* renamed from: C */
    public final boolean mo913C(int suggestedSizeInPx, RectF availableSpace) {
        CharSequence transformedText;
        CharSequence text = this.f782i.getText();
        TransformationMethod transformationMethod = this.f782i.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.f782i)) == null)) {
            text = transformedText;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f782i.getMaxLines() : -1;
        mo929q(suggestedSizeInPx);
        StaticLayout layout = mo919e(text, (Layout.Alignment) m703r(this.f782i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(availableSpace.right), maxLines);
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    /* renamed from: f */
    public final StaticLayout mo920f(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder layoutBuilder = StaticLayout.Builder.obtain(text, 0, text.length(), this.f781h, availableWidth);
        layoutBuilder.setAlignment(alignment).setLineSpacing(this.f782i.getLineSpacingExtra(), this.f782i.getLineSpacingMultiplier()).setIncludePad(this.f782i.getIncludeFontPadding()).setBreakStrategy(this.f782i.getBreakStrategy()).setHyphenationFrequency(this.f782i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.f782i.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) m703r(this.f782i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            layoutBuilder.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return layoutBuilder.build();
    }

    /* renamed from: h */
    public final StaticLayout mo922h(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        return new StaticLayout(text, this.f781h, availableWidth, alignment, this.f782i.getLineSpacingMultiplier(), this.f782i.getLineSpacingExtra(), this.f782i.getIncludeFontPadding());
    }

    /* renamed from: g */
    public final StaticLayout mo921g(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        return new StaticLayout(text, this.f781h, availableWidth, alignment, ((Float) m700a(this.f782i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m700a(this.f782i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m700a(this.f782i, "mIncludePad", true)).booleanValue());
    }

    /* renamed from: r */
    public static <T> T m703r(Object object, String methodName, T defaultValue) {
        try {
            T result = m702p(methodName).invoke(object, new Object[0]);
            if (result != null || 0 == 0) {
                return result;
            }
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", ex);
            if (0 != 0 || 1 == 0) {
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0 && 1 != 0) {
                T result2 = defaultValue;
            }
            throw th;
        }
        return defaultValue;
    }

    /* renamed from: a */
    public static <T> T m700a(Object object, String fieldName, T defaultValue) {
        try {
            Field field = m701o(fieldName);
            if (field == null) {
                return defaultValue;
            }
            return field.get(object);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + fieldName + " member", e);
            return defaultValue;
        }
    }

    /* renamed from: p */
    public static Method m702p(String methodName) {
        try {
            Method method = f772l.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                f772l.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    /* renamed from: o */
    public static Field m701o(String fieldName) {
        try {
            Field field = f773m.get(fieldName);
            if (field == null && (field = TextView.class.getDeclaredField(fieldName)) != null) {
                field.setAccessible(true);
                f773m.put(fieldName, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + fieldName + " member", e);
            return null;
        }
    }

    /* renamed from: s */
    public boolean mo930s() {
        return mo914D() && this.f774a != 0;
    }

    /* renamed from: D */
    public final boolean mo914D() {
        return !(this.f782i instanceof C0170k);
    }
}
