package p000a.p025h.p036k;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p000a.p025h.p037l.C0414c;

/* renamed from: a.h.k.c */
public class C0400c implements Spannable {

    /* renamed from: b */
    public final Spannable f1959b;

    /* renamed from: c */
    public final C0401a f1960c;

    static {
        new Object();
    }

    /* renamed from: a.h.k.c$a */
    public static final class C0401a {

        /* renamed from: a */
        public final TextPaint f1961a;

        /* renamed from: b */
        public final TextDirectionHeuristic f1962b;

        /* renamed from: c */
        public final int f1963c;

        /* renamed from: d */
        public final int f1964d;

        /* renamed from: e */
        public final PrecomputedText.Params f1965e = null;

        /* renamed from: a.h.k.c$a$a */
        public static class C0402a {

            /* renamed from: a */
            public final TextPaint f1966a;

            /* renamed from: b */
            public TextDirectionHeuristic f1967b;

            /* renamed from: c */
            public int f1968c;

            /* renamed from: d */
            public int f1969d;

            public C0402a(TextPaint paint) {
                this.f1966a = paint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f1968c = 1;
                    this.f1969d = 1;
                } else {
                    this.f1969d = 0;
                    this.f1968c = 0;
                }
                if (i >= 18) {
                    this.f1967b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f1967b = null;
                }
            }

            /* renamed from: b */
            public C0402a mo2402b(int strategy) {
                this.f1968c = strategy;
                return this;
            }

            /* renamed from: c */
            public C0402a mo2403c(int frequency) {
                this.f1969d = frequency;
                return this;
            }

            /* renamed from: d */
            public C0402a mo2404d(TextDirectionHeuristic textDir) {
                this.f1967b = textDir;
                return this;
            }

            /* renamed from: a */
            public C0401a mo2401a() {
                return new C0401a(this.f1966a, this.f1967b, this.f1968c, this.f1969d);
            }
        }

        public C0401a(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            this.f1961a = paint;
            this.f1962b = textDir;
            this.f1963c = strategy;
            this.f1964d = frequency;
        }

        public C0401a(PrecomputedText.Params wrapped) {
            this.f1961a = wrapped.getTextPaint();
            this.f1962b = wrapped.getTextDirection();
            this.f1963c = wrapped.getBreakStrategy();
            this.f1964d = wrapped.getHyphenationFrequency();
        }

        /* renamed from: e */
        public TextPaint mo2397e() {
            return this.f1961a;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo2396d() {
            return this.f1962b;
        }

        /* renamed from: b */
        public int mo2394b() {
            return this.f1963c;
        }

        /* renamed from: c */
        public int mo2395c() {
            return this.f1964d;
        }

        /* renamed from: a */
        public boolean mo2393a(C0401a other) {
            PrecomputedText.Params params = this.f1965e;
            if (params != null) {
                return params.equals(other.f1965e);
            }
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f1963c != other.mo2394b() || this.f1964d != other.mo2395c())) || this.f1961a.getTextSize() != other.mo2397e().getTextSize() || this.f1961a.getTextScaleX() != other.mo2397e().getTextScaleX() || this.f1961a.getTextSkewX() != other.mo2397e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f1961a.getLetterSpacing() != other.mo2397e().getLetterSpacing() || !TextUtils.equals(this.f1961a.getFontFeatureSettings(), other.mo2397e().getFontFeatureSettings()))) || this.f1961a.getFlags() != other.mo2397e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f1961a.getTextLocales().equals(other.mo2397e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f1961a.getTextLocale().equals(other.mo2397e().getTextLocale())) {
                return false;
            }
            if (this.f1961a.getTypeface() == null) {
                if (other.mo2397e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f1961a.getTypeface().equals(other.mo2397e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof C0401a)) {
                return false;
            }
            C0401a other = (C0401a) o;
            if (!mo2393a(other)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 18 || this.f1962b == other.mo2396d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0414c.m2050b(Float.valueOf(this.f1961a.getTextSize()), Float.valueOf(this.f1961a.getTextScaleX()), Float.valueOf(this.f1961a.getTextSkewX()), Float.valueOf(this.f1961a.getLetterSpacing()), Integer.valueOf(this.f1961a.getFlags()), this.f1961a.getTextLocales(), this.f1961a.getTypeface(), Boolean.valueOf(this.f1961a.isElegantTextHeight()), this.f1962b, Integer.valueOf(this.f1963c), Integer.valueOf(this.f1964d));
            } else if (i >= 21) {
                return C0414c.m2050b(Float.valueOf(this.f1961a.getTextSize()), Float.valueOf(this.f1961a.getTextScaleX()), Float.valueOf(this.f1961a.getTextSkewX()), Float.valueOf(this.f1961a.getLetterSpacing()), Integer.valueOf(this.f1961a.getFlags()), this.f1961a.getTextLocale(), this.f1961a.getTypeface(), Boolean.valueOf(this.f1961a.isElegantTextHeight()), this.f1962b, Integer.valueOf(this.f1963c), Integer.valueOf(this.f1964d));
            } else if (i >= 18) {
                return C0414c.m2050b(Float.valueOf(this.f1961a.getTextSize()), Float.valueOf(this.f1961a.getTextScaleX()), Float.valueOf(this.f1961a.getTextSkewX()), Integer.valueOf(this.f1961a.getFlags()), this.f1961a.getTextLocale(), this.f1961a.getTypeface(), this.f1962b, Integer.valueOf(this.f1963c), Integer.valueOf(this.f1964d));
            } else if (i >= 17) {
                return C0414c.m2050b(Float.valueOf(this.f1961a.getTextSize()), Float.valueOf(this.f1961a.getTextScaleX()), Float.valueOf(this.f1961a.getTextSkewX()), Integer.valueOf(this.f1961a.getFlags()), this.f1961a.getTextLocale(), this.f1961a.getTypeface(), this.f1962b, Integer.valueOf(this.f1963c), Integer.valueOf(this.f1964d));
            } else {
                return C0414c.m2050b(Float.valueOf(this.f1961a.getTextSize()), Float.valueOf(this.f1961a.getTextScaleX()), Float.valueOf(this.f1961a.getTextSkewX()), Integer.valueOf(this.f1961a.getFlags()), this.f1961a.getTypeface(), this.f1962b, Integer.valueOf(this.f1963c), Integer.valueOf(this.f1964d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f1961a.getTextSize());
            sb.append(", textScaleX=" + this.f1961a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1961a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb.append(", letterSpacing=" + this.f1961a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f1961a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb.append(", textLocale=" + this.f1961a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f1961a.getTextLocale());
            }
            sb.append(", typeface=" + this.f1961a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f1961a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f1962b);
            sb.append(", breakStrategy=" + this.f1963c);
            sb.append(", hyphenationFrequency=" + this.f1964d);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public C0401a mo2381a() {
        return this.f1960c;
    }

    public void setSpan(Object what, int start, int end, int flags) {
        if (!(what instanceof MetricAffectingSpan)) {
            this.f1959b.setSpan(what, start, end, flags);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public void removeSpan(Object what) {
        if (!(what instanceof MetricAffectingSpan)) {
            this.f1959b.removeSpan(what);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public <T> T[] getSpans(int start, int end, Class<T> type) {
        return this.f1959b.getSpans(start, end, type);
    }

    public int getSpanStart(Object tag) {
        return this.f1959b.getSpanStart(tag);
    }

    public int getSpanEnd(Object tag) {
        return this.f1959b.getSpanEnd(tag);
    }

    public int getSpanFlags(Object tag) {
        return this.f1959b.getSpanFlags(tag);
    }

    public int nextSpanTransition(int start, int limit, Class type) {
        return this.f1959b.nextSpanTransition(start, limit, type);
    }

    public int length() {
        return this.f1959b.length();
    }

    public char charAt(int index) {
        return this.f1959b.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return this.f1959b.subSequence(start, end);
    }

    public String toString() {
        return this.f1959b.toString();
    }
}
