package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.d */
public class C0285d {

    /* renamed from: a */
    public C0291f f1339a;

    /* renamed from: b */
    public C0291f f1340b;

    /* renamed from: c */
    public C0291f f1341c;

    /* renamed from: d */
    public C0291f f1342d;

    /* renamed from: e */
    public C0291f f1343e;

    /* renamed from: f */
    public C0291f f1344f;

    /* renamed from: g */
    public C0291f f1345g;

    /* renamed from: h */
    public ArrayList<C0291f> f1346h;

    /* renamed from: i */
    public int f1347i;

    /* renamed from: j */
    public int f1348j;

    /* renamed from: k */
    public float f1349k = 0.0f;

    /* renamed from: l */
    public int f1350l;

    /* renamed from: m */
    public boolean f1351m = false;

    /* renamed from: n */
    public boolean f1352n;

    /* renamed from: o */
    public boolean f1353o;

    /* renamed from: p */
    public boolean f1354p;

    /* renamed from: q */
    public boolean f1355q;

    public C0285d(C0291f first, int orientation, boolean isRtl) {
        this.f1339a = first;
        this.f1350l = orientation;
        this.f1351m = isRtl;
    }

    /* renamed from: c */
    public static boolean m1519c(C0291f widget, int orientation) {
        if (widget.mo2020C() != 8 && widget.f1386C[orientation] == C0291f.C0293b.MATCH_CONSTRAINT) {
            int[] iArr = widget.f1422g;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo2000b() {
        boolean z;
        C0291f next;
        int offset = this.f1350l * 2;
        C0291f lastVisited = this.f1339a;
        C0291f widget = this.f1339a;
        C0291f fVar = this.f1339a;
        boolean done = false;
        while (true) {
            z = true;
            if (done) {
                break;
            }
            this.f1347i++;
            C0291f[] fVarArr = widget.f1427i0;
            int i = this.f1350l;
            fVarArr[i] = null;
            widget.f1425h0[i] = null;
            if (widget.mo2020C() != 8) {
                if (this.f1340b == null) {
                    this.f1340b = widget;
                }
                this.f1342d = widget;
                C0291f.C0293b[] bVarArr = widget.f1386C;
                int i2 = this.f1350l;
                if (bVarArr[i2] == C0291f.C0293b.MATCH_CONSTRAINT) {
                    int[] iArr = widget.f1422g;
                    if (iArr[i2] == 0 || iArr[i2] == 3 || iArr[i2] == 2) {
                        this.f1348j++;
                        float[] fArr = widget.f1423g0;
                        float weight = fArr[i2];
                        if (weight > 0.0f) {
                            this.f1349k += fArr[i2];
                        }
                        if (m1519c(widget, i2)) {
                            if (weight < 0.0f) {
                                this.f1352n = true;
                            } else {
                                this.f1353o = true;
                            }
                            if (this.f1346h == null) {
                                this.f1346h = new ArrayList<>();
                            }
                            this.f1346h.add(widget);
                        }
                        if (this.f1344f == null) {
                            this.f1344f = widget;
                        }
                        C0291f fVar2 = this.f1345g;
                        if (fVar2 != null) {
                            fVar2.f1425h0[this.f1350l] = widget;
                        }
                        this.f1345g = widget;
                    }
                }
            }
            if (lastVisited != widget) {
                lastVisited.f1427i0[this.f1350l] = widget;
            }
            lastVisited = widget;
            C0286e nextAnchor = widget.f1384A[offset + 1].f1359d;
            if (nextAnchor != null) {
                next = nextAnchor.f1357b;
                C0286e[] eVarArr = next.f1384A;
                if (eVarArr[offset].f1359d == null || eVarArr[offset].f1359d.f1357b != widget) {
                    next = null;
                }
            } else {
                next = null;
            }
            if (next != null) {
                widget = next;
            } else {
                done = true;
            }
        }
        this.f1341c = widget;
        if (this.f1350l != 0 || !this.f1351m) {
            this.f1343e = this.f1339a;
        } else {
            this.f1343e = widget;
        }
        if (!this.f1353o || !this.f1352n) {
            z = false;
        }
        this.f1354p = z;
    }

    /* renamed from: a */
    public void mo1999a() {
        if (!this.f1355q) {
            mo2000b();
        }
        this.f1355q = true;
    }
}
