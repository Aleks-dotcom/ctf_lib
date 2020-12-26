package p000a.p002b.p003k;

/* renamed from: a.b.k.i */
public class C0045i {

    /* renamed from: d */
    public static C0045i f353d;

    /* renamed from: a */
    public long f354a;

    /* renamed from: b */
    public long f355b;

    /* renamed from: c */
    public int f356c;

    /* renamed from: b */
    public static C0045i m212b() {
        if (f353d == null) {
            f353d = new C0045i();
        }
        return f353d;
    }

    /* renamed from: a */
    public void mo222a(long time, double latitude, double longitude) {
        float daysSince2000 = ((float) (time - 946728000000L)) / 8.64E7f;
        float meanAnomaly = (0.01720197f * daysSince2000) + 6.24006f;
        double trueAnomaly = ((double) meanAnomaly) + (Math.sin((double) meanAnomaly) * 0.03341960161924362d) + (Math.sin((double) (2.0f * meanAnomaly)) * 3.4906598739326E-4d) + (Math.sin((double) (3.0f * meanAnomaly)) * 5.236000106378924E-6d);
        double solarLng = 1.796593063d + trueAnomaly + 3.141592653589793d;
        double arcLongitude = (-longitude) / 360.0d;
        float n = (float) Math.round(((double) (daysSince2000 - 9.0E-4f)) - arcLongitude);
        double d = trueAnomaly;
        double solarTransitJ2000 = ((double) (9.0E-4f + n)) + arcLongitude + (Math.sin((double) meanAnomaly) * 0.0053d) + (Math.sin(2.0d * solarLng) * -0.0069d);
        double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331d));
        double latRad = 0.01745329238474369d * latitude;
        double cosHourAngle = (Math.sin(-0.10471975803375244d) - (Math.sin(latRad) * Math.sin(solarDec))) / (Math.cos(latRad) * Math.cos(solarDec));
        float f = n;
        if (cosHourAngle >= 1.0d) {
            this.f356c = 1;
            this.f354a = -1;
            this.f355b = -1;
        } else if (cosHourAngle <= -1.0d) {
            this.f356c = 0;
            this.f354a = -1;
            this.f355b = -1;
        } else {
            float hourAngle = (float) (Math.acos(cosHourAngle) / 6.283185307179586d);
            float f2 = daysSince2000;
            float f3 = meanAnomaly;
            this.f354a = Math.round((((double) hourAngle) + solarTransitJ2000) * 8.64E7d) + 946728000000L;
            long round = Math.round((solarTransitJ2000 - ((double) hourAngle)) * 8.64E7d) + 946728000000L;
            this.f355b = round;
            if (round >= time || this.f354a <= time) {
                this.f356c = 1;
            } else {
                this.f356c = 0;
            }
        }
    }
}
