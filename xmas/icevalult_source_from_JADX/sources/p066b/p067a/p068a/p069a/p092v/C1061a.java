package p066b.p067a.p068a.p069a.p092v;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: b.a.a.a.v.a */
public final class C1061a implements Parcelable {
    public static final Parcelable.Creator<C1061a> CREATOR = new C1062a();

    /* renamed from: b */
    public final C1083i f4469b;

    /* renamed from: c */
    public final C1083i f4470c;

    /* renamed from: d */
    public final C1083i f4471d;

    /* renamed from: e */
    public final C1063b f4472e;

    /* renamed from: f */
    public final int f4473f;

    /* renamed from: g */
    public final int f4474g;

    /* renamed from: b.a.a.a.v.a$b */
    public interface C1063b extends Parcelable {
        /* renamed from: e */
        boolean mo6202e(long j);
    }

    public /* synthetic */ C1061a(C1083i x0, C1083i x1, C1083i x2, C1063b x3, C1062a x4) {
        this(x0, x1, x2, x3);
    }

    public C1061a(C1083i start, C1083i end, C1083i openAt, C1063b validator) {
        this.f4469b = start;
        this.f4470c = end;
        this.f4471d = openAt;
        this.f4472e = validator;
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (openAt.compareTo(end) <= 0) {
            this.f4474g = start.mo6242m(end) + 1;
            this.f4473f = (end.f4530e - start.f4530e) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* renamed from: f */
    public C1063b mo6190f() {
        return this.f4472e;
    }

    /* renamed from: j */
    public C1083i mo6195j() {
        return this.f4469b;
    }

    /* renamed from: g */
    public C1083i mo6191g() {
        return this.f4470c;
    }

    /* renamed from: i */
    public C1083i mo6194i() {
        return this.f4471d;
    }

    /* renamed from: h */
    public int mo6192h() {
        return this.f4474g;
    }

    /* renamed from: k */
    public int mo6196k() {
        return this.f4473f;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C1061a)) {
            return false;
        }
        C1061a that = (C1061a) o;
        if (!this.f4469b.equals(that.f4469b) || !this.f4470c.equals(that.f4470c) || !this.f4471d.equals(that.f4471d) || !this.f4472e.equals(that.f4472e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4469b, this.f4470c, this.f4471d, this.f4472e});
    }

    /* renamed from: b.a.a.a.v.a$a */
    public static class C1062a implements Parcelable.Creator<C1061a> {
        /* renamed from: a */
        public C1061a createFromParcel(Parcel source) {
            return new C1061a((C1083i) source.readParcelable(C1083i.class.getClassLoader()), (C1083i) source.readParcelable(C1083i.class.getClassLoader()), (C1083i) source.readParcelable(C1083i.class.getClassLoader()), (C1063b) source.readParcelable(C1063b.class.getClassLoader()), (C1062a) null);
        }

        /* renamed from: b */
        public C1061a[] newArray(int size) {
            return new C1061a[size];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f4469b, 0);
        dest.writeParcelable(this.f4470c, 0);
        dest.writeParcelable(this.f4471d, 0);
        dest.writeParcelable(this.f4472e, 0);
    }
}
