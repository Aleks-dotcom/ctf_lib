package p000a.p043j.p044a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.j.a.a */
public abstract class C0501a implements Parcelable {
    public static final Parcelable.Creator<C0501a> CREATOR = new C0503b();

    /* renamed from: c */
    public static final C0501a f2116c = new C0502a();

    /* renamed from: b */
    public final Parcelable f2117b;

    /* renamed from: a.j.a.a$a */
    public static class C0502a extends C0501a {
        public C0502a() {
            super((C0502a) null);
        }
    }

    public /* synthetic */ C0501a(C0502a x0) {
        this();
    }

    public C0501a() {
        this.f2117b = null;
    }

    public C0501a(Parcelable superState) {
        if (superState != null) {
            this.f2117b = superState != f2116c ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public C0501a(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f2117b = superState != null ? superState : f2116c;
    }

    /* renamed from: f */
    public final Parcelable mo2682f() {
        return this.f2117b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f2117b, flags);
    }

    /* renamed from: a.j.a.a$b */
    public static class C0503b implements Parcelable.ClassLoaderCreator<C0501a> {
        /* renamed from: b */
        public C0501a createFromParcel(Parcel in, ClassLoader loader) {
            if (in.readParcelable(loader) == null) {
                return C0501a.f2116c;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public C0501a createFromParcel(Parcel in) {
            return createFromParcel(in, (ClassLoader) null);
        }

        /* renamed from: c */
        public C0501a[] newArray(int size) {
            return new C0501a[size];
        }
    }
}
