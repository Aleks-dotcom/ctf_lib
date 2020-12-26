package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import p000a.p062s.C0754a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0754a parcel) {
        RemoteActionCompat obj = new RemoteActionCompat();
        obj.f3383a = (IconCompat) parcel.mo3817v(obj.f3383a, 1);
        obj.f3384b = parcel.mo3807l(obj.f3384b, 2);
        obj.f3385c = parcel.mo3807l(obj.f3385c, 3);
        obj.f3386d = (PendingIntent) parcel.mo3813r(obj.f3386d, 4);
        obj.f3387e = parcel.mo3803h(obj.f3387e, 5);
        obj.f3388f = parcel.mo3803h(obj.f3388f, 6);
        return obj;
    }

    public static void write(RemoteActionCompat obj, C0754a parcel) {
        parcel.mo3819x(false, false);
        parcel.mo3794M(obj.f3383a, 1);
        parcel.mo3785D(obj.f3384b, 2);
        parcel.mo3785D(obj.f3385c, 3);
        parcel.mo3789H(obj.f3386d, 4);
        parcel.mo3821z(obj.f3387e, 5);
        parcel.mo3821z(obj.f3388f, 6);
    }
}
