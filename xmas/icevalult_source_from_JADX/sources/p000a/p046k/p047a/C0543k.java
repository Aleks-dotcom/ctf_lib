package p000a.p046k.p047a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.a.k */
public final class C0543k implements Parcelable {
    public static final Parcelable.Creator<C0543k> CREATOR = new C0544a();

    /* renamed from: b */
    public ArrayList<C0547m> f2258b;

    /* renamed from: c */
    public ArrayList<String> f2259c;

    /* renamed from: d */
    public C0517b[] f2260d;

    /* renamed from: e */
    public String f2261e = null;

    /* renamed from: f */
    public int f2262f;

    public C0543k() {
    }

    public C0543k(Parcel in) {
        this.f2258b = in.createTypedArrayList(C0547m.CREATOR);
        this.f2259c = in.createStringArrayList();
        this.f2260d = (C0517b[]) in.createTypedArray(C0517b.CREATOR);
        this.f2261e = in.readString();
        this.f2262f = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.f2258b);
        dest.writeStringList(this.f2259c);
        dest.writeTypedArray(this.f2260d, flags);
        dest.writeString(this.f2261e);
        dest.writeInt(this.f2262f);
    }

    /* renamed from: a.k.a.k$a */
    public static class C0544a implements Parcelable.Creator<C0543k> {
        /* renamed from: a */
        public C0543k createFromParcel(Parcel in) {
            return new C0543k(in);
        }

        /* renamed from: b */
        public C0543k[] newArray(int size) {
            return new C0543k[size];
        }
    }
}
