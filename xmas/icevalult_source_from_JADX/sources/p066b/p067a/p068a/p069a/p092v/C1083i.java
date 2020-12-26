package p066b.p067a.p068a.p069a.p092v;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: b.a.a.a.v.i */
public final class C1083i implements Comparable<C1083i>, Parcelable {
    public static final Parcelable.Creator<C1083i> CREATOR = new C1084a();

    /* renamed from: b */
    public final Calendar f4527b;

    /* renamed from: c */
    public final String f4528c;

    /* renamed from: d */
    public final int f4529d;

    /* renamed from: e */
    public final int f4530e;

    /* renamed from: f */
    public final int f4531f;

    /* renamed from: g */
    public final int f4532g;

    public C1083i(Calendar rawCalendar) {
        rawCalendar.set(5, 1);
        Calendar d = C1093o.m5816d(rawCalendar);
        this.f4527b = d;
        this.f4529d = d.get(2);
        this.f4530e = d.get(1);
        this.f4531f = d.getMaximum(7);
        this.f4532g = d.getActualMaximum(5);
        this.f4528c = C1093o.m5826n().format(d.getTime());
        d.getTimeInMillis();
    }

    /* renamed from: g */
    public static C1083i m5779g(int year, int month) {
        Calendar calendar = C1093o.m5823k();
        calendar.set(1, year);
        calendar.set(2, month);
        return new C1083i(calendar);
    }

    /* renamed from: n */
    public static C1083i m5780n() {
        return new C1083i(C1093o.m5821i());
    }

    /* renamed from: h */
    public int mo6236h() {
        int difference = this.f4527b.get(7) - this.f4527b.getFirstDayOfWeek();
        if (difference < 0) {
            return difference + this.f4531f;
        }
        return difference;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C1083i)) {
            return false;
        }
        C1083i that = (C1083i) o;
        if (this.f4529d == that.f4529d && this.f4530e == that.f4530e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4529d), Integer.valueOf(this.f4530e)});
    }

    /* renamed from: f */
    public int compareTo(C1083i other) {
        return this.f4527b.compareTo(other.f4527b);
    }

    /* renamed from: m */
    public int mo6242m(C1083i other) {
        if (this.f4527b instanceof GregorianCalendar) {
            return ((other.f4530e - this.f4530e) * 12) + (other.f4529d - this.f4529d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: k */
    public long mo6240k() {
        return this.f4527b.getTimeInMillis();
    }

    /* renamed from: i */
    public long mo6238i(int day) {
        Calendar dayCalendar = C1093o.m5816d(this.f4527b);
        dayCalendar.set(5, day);
        return dayCalendar.getTimeInMillis();
    }

    /* renamed from: l */
    public C1083i mo6241l(int months) {
        Calendar laterMonth = C1093o.m5816d(this.f4527b);
        laterMonth.add(2, months);
        return new C1083i(laterMonth);
    }

    /* renamed from: j */
    public String mo6239j() {
        return this.f4528c;
    }

    /* renamed from: b.a.a.a.v.i$a */
    public static class C1084a implements Parcelable.Creator<C1083i> {
        /* renamed from: a */
        public C1083i createFromParcel(Parcel source) {
            return C1083i.m5779g(source.readInt(), source.readInt());
        }

        /* renamed from: b */
        public C1083i[] newArray(int size) {
            return new C1083i[size];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f4530e);
        dest.writeInt(this.f4529d);
    }
}
