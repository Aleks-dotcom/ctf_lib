package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p000a.p062s.C0754a;

public class IconCompatParcelizer {
    public static IconCompat read(C0754a parcel) {
        IconCompat obj = new IconCompat();
        obj.f3390a = parcel.mo3811p(obj.f3390a, 1);
        obj.f3392c = parcel.mo3805j(obj.f3392c, 2);
        obj.f3393d = parcel.mo3813r(obj.f3393d, 3);
        obj.f3394e = parcel.mo3811p(obj.f3394e, 4);
        obj.f3395f = parcel.mo3811p(obj.f3395f, 5);
        obj.f3396g = (ColorStateList) parcel.mo3813r(obj.f3396g, 6);
        obj.f3398i = parcel.mo3815t(obj.f3398i, 7);
        obj.mo4480e();
        return obj;
    }

    public static void write(IconCompat obj, C0754a parcel) {
        parcel.mo3819x(true, true);
        obj.mo4481f(parcel.mo3801f());
        int i = obj.f3390a;
        if (-1 != i) {
            parcel.mo3787F(i, 1);
        }
        byte[] bArr = obj.f3392c;
        if (bArr != null) {
            parcel.mo3783B(bArr, 2);
        }
        Parcelable parcelable = obj.f3393d;
        if (parcelable != null) {
            parcel.mo3789H(parcelable, 3);
        }
        int i2 = obj.f3394e;
        if (i2 != 0) {
            parcel.mo3787F(i2, 4);
        }
        int i3 = obj.f3395f;
        if (i3 != 0) {
            parcel.mo3787F(i3, 5);
        }
        ColorStateList colorStateList = obj.f3396g;
        if (colorStateList != null) {
            parcel.mo3789H(colorStateList, 6);
        }
        String str = obj.f3398i;
        if (str != null) {
            parcel.mo3791J(str, 7);
        }
    }
}
