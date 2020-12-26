package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p062s.C0755b;
import p000a.p062s.C0756c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0908a();

    /* renamed from: b */
    public final C0756c f3761b;

    public ParcelImpl(Parcel in) {
        this.f3761b = new C0755b(in).mo3816u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        new C0755b(dest).mo3793L(this.f3761b);
    }

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0908a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel in) {
            return new ParcelImpl(in);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int size) {
            return new ParcelImpl[size];
        }
    }
}
