package p066b.p067a.p068a.p069a.p083n;

import p066b.p067a.p068a.p069a.p076g0.C0952f;
import p066b.p067a.p068a.p069a.p076g0.C0967m;

/* renamed from: b.a.a.a.n.a */
public class C1040a extends C0952f implements Cloneable {

    /* renamed from: b */
    public float f4359b;

    /* renamed from: c */
    public float f4360c;

    /* renamed from: d */
    public float f4361d;

    /* renamed from: e */
    public float f4362e;

    /* renamed from: f */
    public float f4363f;

    /* renamed from: a */
    public void mo5569a(float length, float center, float interpolation, C0967m shapePath) {
        float f = length;
        C0967m mVar = shapePath;
        float f2 = this.f4361d;
        if (f2 == 0.0f) {
            mVar.mo5698l(f, 0.0f);
            return;
        }
        float cradleRadius = ((this.f4360c * 2.0f) + f2) / 2.0f;
        float roundedCornerOffset = interpolation * this.f4359b;
        float middle = center + this.f4363f;
        float verticalOffset = (this.f4362e * interpolation) + ((1.0f - interpolation) * cradleRadius);
        if (verticalOffset / cradleRadius >= 1.0f) {
            mVar.mo5698l(f, 0.0f);
            return;
        }
        float distanceBetweenCenters = cradleRadius + roundedCornerOffset;
        float distanceY = verticalOffset + roundedCornerOffset;
        float distanceX = (float) Math.sqrt((double) ((distanceBetweenCenters * distanceBetweenCenters) - (distanceY * distanceY)));
        float leftRoundedCornerCircleX = middle - distanceX;
        float rightRoundedCornerCircleX = middle + distanceX;
        float cornerRadiusArcLength = (float) Math.toDegrees(Math.atan((double) (distanceX / distanceY)));
        float cutoutArcOffset = 90.0f - cornerRadiusArcLength;
        mVar.mo5698l(leftRoundedCornerCircleX, 0.0f);
        float cornerRadiusArcLength2 = cornerRadiusArcLength;
        float f3 = leftRoundedCornerCircleX;
        float f4 = distanceX;
        shapePath.mo5687a(leftRoundedCornerCircleX - roundedCornerOffset, 0.0f, leftRoundedCornerCircleX + roundedCornerOffset, roundedCornerOffset * 2.0f, 270.0f, cornerRadiusArcLength2);
        shapePath.mo5687a(middle - cradleRadius, (-cradleRadius) - verticalOffset, middle + cradleRadius, cradleRadius - verticalOffset, 180.0f - cutoutArcOffset, (cutoutArcOffset * 2.0f) - 180.0f);
        shapePath.mo5687a(rightRoundedCornerCircleX - roundedCornerOffset, 0.0f, rightRoundedCornerCircleX + roundedCornerOffset, roundedCornerOffset * 2.0f, 270.0f - cornerRadiusArcLength2, cornerRadiusArcLength2);
        mVar.mo5698l(f, 0.0f);
    }

    /* renamed from: e */
    public float mo5908e() {
        return this.f4361d;
    }

    /* renamed from: i */
    public void mo5912i(float fabDiameter) {
        this.f4361d = fabDiameter;
    }

    /* renamed from: j */
    public void mo5913j(float horizontalOffset) {
        this.f4363f = horizontalOffset;
    }

    /* renamed from: b */
    public float mo5905b() {
        return this.f4362e;
    }

    /* renamed from: f */
    public void mo5909f(float cradleVerticalOffset) {
        this.f4362e = cradleVerticalOffset;
    }

    /* renamed from: c */
    public float mo5906c() {
        return this.f4360c;
    }

    /* renamed from: g */
    public void mo5910g(float fabMargin) {
        this.f4360c = fabMargin;
    }

    /* renamed from: d */
    public float mo5907d() {
        return this.f4359b;
    }

    /* renamed from: h */
    public void mo5911h(float roundedCornerRadius) {
        this.f4359b = roundedCornerRadius;
    }
}
