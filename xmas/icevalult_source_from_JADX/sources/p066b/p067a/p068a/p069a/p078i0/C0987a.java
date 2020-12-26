package p066b.p067a.p068a.p069a.p078i0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p018e.C0269g;
import p000a.p043j.p044a.C0501a;

/* renamed from: b.a.a.a.i0.a */
public class C0987a extends C0501a {
    public static final Parcelable.Creator<C0987a> CREATOR = new C0988a();

    /* renamed from: d */
    public final C0269g<String, Bundle> f4024d;

    public /* synthetic */ C0987a(Parcel x0, ClassLoader x1, C0988a x2) {
        this(x0, x1);
    }

    public C0987a(Parcelable superState) {
        super(superState);
        this.f4024d = new C0269g<>();
    }

    public C0987a(Parcel in, ClassLoader loader) {
        super(in, loader);
        int size = in.readInt();
        String[] keys = new String[size];
        in.readStringArray(keys);
        Bundle[] states = new Bundle[size];
        in.readTypedArray(states, Bundle.CREATOR);
        this.f4024d = new C0269g<>(size);
        for (int i = 0; i < size; i++) {
            this.f4024d.put(keys[i], states[i]);
        }
    }

    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        int size = this.f4024d.size();
        out.writeInt(size);
        String[] keys = new String[size];
        Bundle[] states = new Bundle[size];
        for (int i = 0; i < size; i++) {
            keys[i] = this.f4024d.mo1882i(i);
            states[i] = this.f4024d.mo1887m(i);
        }
        out.writeStringArray(keys);
        out.writeTypedArray(states, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4024d + "}";
    }

    /* renamed from: b.a.a.a.i0.a$a */
    public static class C0988a implements Parcelable.ClassLoaderCreator<C0987a> {
        /* renamed from: b */
        public C0987a createFromParcel(Parcel in, ClassLoader loader) {
            return new C0987a(in, loader, (C0988a) null);
        }

        /* renamed from: a */
        public C0987a createFromParcel(Parcel in) {
            return new C0987a(in, (ClassLoader) null, (C0988a) null);
        }

        /* renamed from: c */
        public C0987a[] newArray(int size) {
            return new C0987a[size];
        }
    }
}
