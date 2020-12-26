package p000a.p019f.p020a.p021j;

import java.util.Arrays;

/* renamed from: a.f.a.j.j */
public class C0298j extends C0291f {

    /* renamed from: k0 */
    public C0291f[] f1491k0 = new C0291f[4];

    /* renamed from: l0 */
    public int f1492l0 = 0;

    /* renamed from: I0 */
    public void mo2130I0(C0291f widget) {
        int i = this.f1492l0 + 1;
        C0291f[] fVarArr = this.f1491k0;
        if (i > fVarArr.length) {
            this.f1491k0 = (C0291f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C0291f[] fVarArr2 = this.f1491k0;
        int i2 = this.f1492l0;
        fVarArr2[i2] = widget;
        this.f1492l0 = i2 + 1;
    }

    /* renamed from: J0 */
    public void mo2131J0() {
        this.f1492l0 = 0;
    }
}
