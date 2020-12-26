package p000a.p046k.p047a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p000a.p046k.p047a.C0549n;
import p000a.p051m.C0577d;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.a.b */
public final class C0517b implements Parcelable {
    public static final Parcelable.Creator<C0517b> CREATOR = new C0518a();

    /* renamed from: b */
    public final int[] f2163b;

    /* renamed from: c */
    public final ArrayList<String> f2164c;

    /* renamed from: d */
    public final int[] f2165d;

    /* renamed from: e */
    public final int[] f2166e;

    /* renamed from: f */
    public final int f2167f;

    /* renamed from: g */
    public final int f2168g;

    /* renamed from: h */
    public final String f2169h;

    /* renamed from: i */
    public final int f2170i;

    /* renamed from: j */
    public final int f2171j;

    /* renamed from: k */
    public final CharSequence f2172k;

    /* renamed from: l */
    public final int f2173l;

    /* renamed from: m */
    public final CharSequence f2174m;

    /* renamed from: n */
    public final ArrayList<String> f2175n;

    /* renamed from: o */
    public final ArrayList<String> f2176o;

    /* renamed from: p */
    public final boolean f2177p;

    public C0517b(C0516a bse) {
        int numOps = bse.f2284a.size();
        this.f2163b = new int[(numOps * 5)];
        if (bse.f2291h) {
            this.f2164c = new ArrayList<>(numOps);
            this.f2165d = new int[numOps];
            this.f2166e = new int[numOps];
            int pos = 0;
            int opNum = 0;
            while (opNum < numOps) {
                C0549n.C0550a op = bse.f2284a.get(opNum);
                int pos2 = pos + 1;
                this.f2163b[pos] = op.f2301a;
                ArrayList<String> arrayList = this.f2164c;
                Fragment fragment = op.f2302b;
                arrayList.add(fragment != null ? fragment.f3456f : null);
                int[] iArr = this.f2163b;
                int pos3 = pos2 + 1;
                iArr[pos2] = op.f2303c;
                int pos4 = pos3 + 1;
                iArr[pos3] = op.f2304d;
                int pos5 = pos4 + 1;
                iArr[pos4] = op.f2305e;
                iArr[pos5] = op.f2306f;
                this.f2165d[opNum] = op.f2307g.ordinal();
                this.f2166e[opNum] = op.f2308h.ordinal();
                opNum++;
                pos = pos5 + 1;
            }
            this.f2167f = bse.f2289f;
            this.f2168g = bse.f2290g;
            this.f2169h = bse.f2292i;
            this.f2170i = bse.f2162t;
            this.f2171j = bse.f2293j;
            this.f2172k = bse.f2294k;
            this.f2173l = bse.f2295l;
            this.f2174m = bse.f2296m;
            this.f2175n = bse.f2297n;
            this.f2176o = bse.f2298o;
            this.f2177p = bse.f2299p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0517b(Parcel in) {
        this.f2163b = in.createIntArray();
        this.f2164c = in.createStringArrayList();
        this.f2165d = in.createIntArray();
        this.f2166e = in.createIntArray();
        this.f2167f = in.readInt();
        this.f2168g = in.readInt();
        this.f2169h = in.readString();
        this.f2170i = in.readInt();
        this.f2171j = in.readInt();
        this.f2172k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f2173l = in.readInt();
        this.f2174m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f2175n = in.createStringArrayList();
        this.f2176o = in.createStringArrayList();
        this.f2177p = in.readInt() != 0;
    }

    /* renamed from: f */
    public C0516a mo2794f(C0529j fm) {
        C0516a bse = new C0516a(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f2163b.length) {
            C0549n.C0550a op = new C0549n.C0550a();
            int pos2 = pos + 1;
            op.f2301a = this.f2163b[pos];
            if (C0529j.f2197I) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f2163b[pos2]);
            }
            String fWho = this.f2164c.get(num);
            if (fWho != null) {
                op.f2302b = fm.f2212h.get(fWho);
            } else {
                op.f2302b = null;
            }
            op.f2307g = C0577d.C0579b.values()[this.f2165d[num]];
            op.f2308h = C0577d.C0579b.values()[this.f2166e[num]];
            int[] iArr = this.f2163b;
            int pos3 = pos2 + 1;
            int pos4 = iArr[pos2];
            op.f2303c = pos4;
            int pos5 = pos3 + 1;
            int pos6 = iArr[pos3];
            op.f2304d = pos6;
            int pos7 = pos5 + 1;
            int pos8 = iArr[pos5];
            op.f2305e = pos8;
            int i = iArr[pos7];
            op.f2306f = i;
            bse.f2285b = pos4;
            bse.f2286c = pos6;
            bse.f2287d = pos8;
            bse.f2288e = i;
            bse.mo3036b(op);
            num++;
            pos = pos7 + 1;
        }
        bse.f2289f = this.f2167f;
        bse.f2290g = this.f2168g;
        bse.f2292i = this.f2169h;
        bse.f2162t = this.f2170i;
        bse.f2291h = true;
        bse.f2293j = this.f2171j;
        bse.f2294k = this.f2172k;
        bse.f2295l = this.f2173l;
        bse.f2296m = this.f2174m;
        bse.f2297n = this.f2175n;
        bse.f2298o = this.f2176o;
        bse.f2299p = this.f2177p;
        bse.mo2779c(1);
        return bse;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f2163b);
        dest.writeStringList(this.f2164c);
        dest.writeIntArray(this.f2165d);
        dest.writeIntArray(this.f2166e);
        dest.writeInt(this.f2167f);
        dest.writeInt(this.f2168g);
        dest.writeString(this.f2169h);
        dest.writeInt(this.f2170i);
        dest.writeInt(this.f2171j);
        TextUtils.writeToParcel(this.f2172k, dest, 0);
        dest.writeInt(this.f2173l);
        TextUtils.writeToParcel(this.f2174m, dest, 0);
        dest.writeStringList(this.f2175n);
        dest.writeStringList(this.f2176o);
        dest.writeInt(this.f2177p ? 1 : 0);
    }

    /* renamed from: a.k.a.b$a */
    public static class C0518a implements Parcelable.Creator<C0517b> {
        /* renamed from: a */
        public C0517b createFromParcel(Parcel in) {
            return new C0517b(in);
        }

        /* renamed from: b */
        public C0517b[] newArray(int size) {
            return new C0517b[size];
        }
    }
}
