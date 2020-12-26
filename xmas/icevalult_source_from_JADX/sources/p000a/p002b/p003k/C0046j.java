package p000a.p002b.p003k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p025h.p027e.C0340b;

/* renamed from: a.b.k.j */
public class C0046j {

    /* renamed from: d */
    public static C0046j f357d;

    /* renamed from: a */
    public final Context f358a;

    /* renamed from: b */
    public final LocationManager f359b;

    /* renamed from: c */
    public final C0047a f360c = new C0047a();

    /* renamed from: a.b.k.j$a */
    public static class C0047a {

        /* renamed from: a */
        public boolean f361a;

        /* renamed from: b */
        public long f362b;

        /* renamed from: c */
        public long f363c;

        /* renamed from: d */
        public long f364d;

        /* renamed from: e */
        public long f365e;

        /* renamed from: f */
        public long f366f;
    }

    /* renamed from: a */
    public static C0046j m214a(Context context) {
        if (f357d == null) {
            Context context2 = context.getApplicationContext();
            f357d = new C0046j(context2, (LocationManager) context2.getSystemService("location"));
        }
        return f357d;
    }

    public C0046j(Context context, LocationManager locationManager) {
        this.f358a = context;
        this.f359b = locationManager;
    }

    /* renamed from: d */
    public boolean mo225d() {
        C0047a state = this.f360c;
        if (mo226e()) {
            return state.f361a;
        }
        Location location = mo223b();
        if (location != null) {
            mo227f(location);
            return state.f361a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int hour = Calendar.getInstance().get(11);
        return hour < 6 || hour >= 22;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location mo223b() {
        Location coarseLoc = null;
        Location fineLoc = null;
        if (C0340b.m1780b(this.f358a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            coarseLoc = mo224c("network");
        }
        if (C0340b.m1780b(this.f358a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            fineLoc = mo224c("gps");
        }
        return (fineLoc == null || coarseLoc == null) ? fineLoc != null ? fineLoc : coarseLoc : fineLoc.getTime() > coarseLoc.getTime() ? fineLoc : coarseLoc;
    }

    /* renamed from: c */
    public final Location mo224c(String provider) {
        try {
            if (this.f359b.isProviderEnabled(provider)) {
                return this.f359b.getLastKnownLocation(provider);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo226e() {
        return this.f360c.f366f > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void mo227f(Location location) {
        long nextUpdate;
        long nextUpdate2;
        C0047a state = this.f360c;
        long now = System.currentTimeMillis();
        C0045i calculator = C0045i.m212b();
        C0045i iVar = calculator;
        iVar.mo222a(now - 86400000, location.getLatitude(), location.getLongitude());
        long yesterdaySunset = calculator.f354a;
        iVar.mo222a(now, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (calculator.f356c != 1) {
            z = false;
        }
        boolean isNight = z;
        long todaySunrise = calculator.f355b;
        long todaySunset = calculator.f354a;
        long yesterdaySunset2 = yesterdaySunset;
        long yesterdaySunset3 = todaySunset;
        long todaySunset2 = 86400000 + now;
        long todaySunrise2 = todaySunrise;
        boolean isNight2 = isNight;
        calculator.mo222a(todaySunset2, location.getLatitude(), location.getLongitude());
        long tomorrowSunrise = calculator.f355b;
        if (todaySunrise2 == -1 || yesterdaySunset3 == -1) {
            nextUpdate = now + 43200000;
        } else {
            if (now > yesterdaySunset3) {
                nextUpdate2 = 0 + tomorrowSunrise;
            } else if (now > todaySunrise2) {
                nextUpdate2 = 0 + yesterdaySunset3;
            } else {
                nextUpdate2 = 0 + todaySunrise2;
            }
            nextUpdate = nextUpdate2 + 60000;
        }
        state.f361a = isNight2;
        state.f362b = yesterdaySunset2;
        state.f363c = todaySunrise2;
        state.f364d = yesterdaySunset3;
        state.f365e = tomorrowSunrise;
        state.f366f = nextUpdate;
    }
}
