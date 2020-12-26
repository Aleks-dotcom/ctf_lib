package p066b.p067a.p068a.p069a.p092v;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: b.a.a.a.v.o */
public class C1093o {
    /* renamed from: h */
    public static TimeZone m5820h() {
        return TimeZone.getTimeZone("UTC");
    }

    @TargetApi(24)
    /* renamed from: j */
    public static android.icu.util.TimeZone m5822j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    public static Calendar m5821i() {
        return m5816d(Calendar.getInstance());
    }

    /* renamed from: k */
    public static Calendar m5823k() {
        return m5824l((Calendar) null);
    }

    /* renamed from: l */
    public static Calendar m5824l(Calendar rawCalendar) {
        Calendar utc = Calendar.getInstance(m5820h());
        if (rawCalendar == null) {
            utc.clear();
        } else {
            utc.setTimeInMillis(rawCalendar.getTimeInMillis());
        }
        return utc;
    }

    /* renamed from: d */
    public static Calendar m5816d(Calendar rawCalendar) {
        Calendar rawCalendarInUtc = m5824l(rawCalendar);
        Calendar utcCalendar = m5823k();
        utcCalendar.set(rawCalendarInUtc.get(1), rawCalendarInUtc.get(2), rawCalendarInUtc.get(5));
        return utcCalendar;
    }

    /* renamed from: a */
    public static long m5813a(long rawDate) {
        Calendar rawCalendar = m5823k();
        rawCalendar.setTimeInMillis(rawDate);
        return m5816d(rawCalendar).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m5815c(String pattern, Locale locale) {
        DateFormat format = DateFormat.getInstanceForSkeleton(pattern, locale);
        format.setTimeZone(m5822j());
        return format;
    }

    /* renamed from: e */
    public static java.text.DateFormat m5817e(int style, Locale locale) {
        java.text.DateFormat format = java.text.DateFormat.getDateInstance(style, locale);
        format.setTimeZone(m5820h());
        return format;
    }

    /* renamed from: g */
    public static SimpleDateFormat m5819g(String pattern, Locale locale) {
        SimpleDateFormat format = new SimpleDateFormat(pattern, locale);
        format.setTimeZone(m5820h());
        return format;
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m5814b(Locale locale) {
        return m5815c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m5825m(Locale locale) {
        return m5815c("yMMMEd", locale);
    }

    /* renamed from: f */
    public static java.text.DateFormat m5818f(Locale locale) {
        return m5817e(0, locale);
    }

    /* renamed from: n */
    public static SimpleDateFormat m5826n() {
        return m5827o(Locale.getDefault());
    }

    /* renamed from: o */
    public static SimpleDateFormat m5827o(Locale locale) {
        return m5819g("MMMM, yyyy", locale);
    }
}
