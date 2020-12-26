package p066b.p067a.p068a.p069a.p076g0;

/* renamed from: b.a.a.a.g0.e */
public class C0951e extends C0950d {

    /* renamed from: a */
    public float f3898a = -1.0f;

    /* renamed from: a */
    public void mo5567a(C0967m shapePath, float angle, float interpolation, float radius) {
        shapePath.mo5700n(0.0f, radius * interpolation, 180.0f, 180.0f - angle);
        shapePath.mo5698l((float) (Math.sin(Math.toRadians((double) angle)) * ((double) radius) * ((double) interpolation)), (float) (Math.sin(Math.toRadians((double) (90.0f - angle))) * ((double) radius) * ((double) interpolation)));
    }
}
