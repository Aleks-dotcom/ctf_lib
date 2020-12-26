package p000a.p046k.p047a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.Fragment;
import p000a.p051m.C0577d;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.a.m */
public final class C0547m implements Parcelable {
    public static final Parcelable.Creator<C0547m> CREATOR = new C0548a();

    /* renamed from: b */
    public final String f2270b;

    /* renamed from: c */
    public final String f2271c;

    /* renamed from: d */
    public final boolean f2272d;

    /* renamed from: e */
    public final int f2273e;

    /* renamed from: f */
    public final int f2274f;

    /* renamed from: g */
    public final String f2275g;

    /* renamed from: h */
    public final boolean f2276h;

    /* renamed from: i */
    public final boolean f2277i;

    /* renamed from: j */
    public final boolean f2278j;

    /* renamed from: k */
    public final Bundle f2279k;

    /* renamed from: l */
    public final boolean f2280l;

    /* renamed from: m */
    public final int f2281m;

    /* renamed from: n */
    public Bundle f2282n;

    /* renamed from: o */
    public Fragment f2283o;

    public C0547m(Fragment frag) {
        this.f2270b = frag.getClass().getName();
        this.f2271c = frag.f3456f;
        this.f2272d = frag.f3464n;
        this.f2273e = frag.f3473w;
        this.f2274f = frag.f3474x;
        this.f2275g = frag.f3475y;
        this.f2276h = frag.f3430B;
        this.f2277i = frag.f3463m;
        this.f2278j = frag.f3429A;
        this.f2279k = frag.f3457g;
        this.f2280l = frag.f3476z;
        this.f2281m = frag.f3446R.ordinal();
    }

    public C0547m(Parcel in) {
        this.f2270b = in.readString();
        this.f2271c = in.readString();
        boolean z = true;
        this.f2272d = in.readInt() != 0;
        this.f2273e = in.readInt();
        this.f2274f = in.readInt();
        this.f2275g = in.readString();
        this.f2276h = in.readInt() != 0;
        this.f2277i = in.readInt() != 0;
        this.f2278j = in.readInt() != 0;
        this.f2279k = in.readBundle();
        this.f2280l = in.readInt() == 0 ? false : z;
        this.f2282n = in.readBundle();
        this.f2281m = in.readInt();
    }

    /* renamed from: f */
    public Fragment mo3029f(ClassLoader classLoader, C0524g factory) {
        if (this.f2283o == null) {
            Bundle bundle = this.f2279k;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            Fragment a = factory.mo2862a(classLoader, this.f2270b);
            this.f2283o = a;
            a.mo4631e1(this.f2279k);
            Bundle bundle2 = this.f2282n;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.f2283o.f3453c = this.f2282n;
            } else {
                this.f2283o.f3453c = new Bundle();
            }
            Fragment fragment = this.f2283o;
            fragment.f3456f = this.f2271c;
            fragment.f3464n = this.f2272d;
            fragment.f3466p = true;
            fragment.f3473w = this.f2273e;
            fragment.f3474x = this.f2274f;
            fragment.f3475y = this.f2275g;
            fragment.f3430B = this.f2276h;
            fragment.f3463m = this.f2277i;
            fragment.f3429A = this.f2278j;
            fragment.f3476z = this.f2280l;
            fragment.f3446R = C0577d.C0579b.values()[this.f2281m];
            if (C0529j.f2197I) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f2283o);
            }
        }
        return this.f2283o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2270b);
        sb.append(" (");
        sb.append(this.f2271c);
        sb.append(")}:");
        if (this.f2272d) {
            sb.append(" fromLayout");
        }
        if (this.f2274f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2274f));
        }
        String str = this.f2275g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2275g);
        }
        if (this.f2276h) {
            sb.append(" retainInstance");
        }
        if (this.f2277i) {
            sb.append(" removing");
        }
        if (this.f2278j) {
            sb.append(" detached");
        }
        if (this.f2280l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f2270b);
        dest.writeString(this.f2271c);
        dest.writeInt(this.f2272d ? 1 : 0);
        dest.writeInt(this.f2273e);
        dest.writeInt(this.f2274f);
        dest.writeString(this.f2275g);
        dest.writeInt(this.f2276h ? 1 : 0);
        dest.writeInt(this.f2277i ? 1 : 0);
        dest.writeInt(this.f2278j ? 1 : 0);
        dest.writeBundle(this.f2279k);
        dest.writeInt(this.f2280l ? 1 : 0);
        dest.writeBundle(this.f2282n);
        dest.writeInt(this.f2281m);
    }

    /* renamed from: a.k.a.m$a */
    public static class C0548a implements Parcelable.Creator<C0547m> {
        /* renamed from: a */
        public C0547m createFromParcel(Parcel in) {
            return new C0547m(in);
        }

        /* renamed from: b */
        public C0547m[] newArray(int size) {
            return new C0547m[size];
        }
    }
}
