package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.p021j.C0286e;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.g */
public class C0294g extends C0306q {

    /* renamed from: A0 */
    public int f1452A0 = 0;

    /* renamed from: B0 */
    public int f1453B0 = 0;

    /* renamed from: C0 */
    public int f1454C0 = 7;

    /* renamed from: D0 */
    public boolean f1455D0 = false;

    /* renamed from: E0 */
    public boolean f1456E0 = false;

    /* renamed from: F0 */
    public boolean f1457F0 = false;

    /* renamed from: l0 */
    public boolean f1458l0 = false;

    /* renamed from: m0 */
    public C0275e f1459m0 = new C0275e();

    /* renamed from: n0 */
    public C0304p f1460n0;

    /* renamed from: o0 */
    public int f1461o0;

    /* renamed from: p0 */
    public int f1462p0;

    /* renamed from: q0 */
    public int f1463q0;

    /* renamed from: r0 */
    public int f1464r0;

    /* renamed from: s0 */
    public int f1465s0 = 0;

    /* renamed from: t0 */
    public int f1466t0 = 0;

    /* renamed from: u0 */
    public C0285d[] f1467u0 = new C0285d[4];

    /* renamed from: v0 */
    public C0285d[] f1468v0 = new C0285d[4];

    /* renamed from: w0 */
    public List<C0295h> f1469w0 = new ArrayList();

    /* renamed from: x0 */
    public boolean f1470x0 = false;

    /* renamed from: y0 */
    public boolean f1471y0 = false;

    /* renamed from: z0 */
    public boolean f1472z0 = false;

    /* renamed from: c1 */
    public void mo2114c1(int value) {
        this.f1454C0 = value;
    }

    /* renamed from: R0 */
    public int mo2103R0() {
        return this.f1454C0;
    }

    /* renamed from: X0 */
    public boolean mo2109X0(int feature) {
        return (this.f1454C0 & feature) == feature;
    }

    /* renamed from: Q */
    public void mo2040Q() {
        this.f1459m0.mo1957E();
        this.f1461o0 = 0;
        this.f1463q0 = 0;
        this.f1462p0 = 0;
        this.f1464r0 = 0;
        this.f1469w0.clear();
        this.f1455D0 = false;
        super.mo2040Q();
    }

    /* renamed from: V0 */
    public boolean mo2107V0() {
        return this.f1456E0;
    }

    /* renamed from: T0 */
    public boolean mo2105T0() {
        return this.f1457F0;
    }

    /* renamed from: O0 */
    public boolean mo2100O0(C0275e system) {
        mo1996b(system);
        int count = this.f1518k0.size();
        for (int i = 0; i < count; i++) {
            C0291f widget = this.f1518k0.get(i);
            if (widget instanceof C0294g) {
                C0291f.C0293b[] bVarArr = widget.f1386C;
                C0291f.C0293b horizontalBehaviour = bVarArr[0];
                C0291f.C0293b verticalBehaviour = bVarArr[1];
                C0291f.C0293b bVar = C0291f.C0293b.WRAP_CONTENT;
                if (horizontalBehaviour == bVar) {
                    widget.mo2058g0(C0291f.C0293b.FIXED);
                }
                if (verticalBehaviour == bVar) {
                    widget.mo2087u0(C0291f.C0293b.FIXED);
                }
                widget.mo1996b(system);
                if (horizontalBehaviour == bVar) {
                    widget.mo2058g0(horizontalBehaviour);
                }
                if (verticalBehaviour == bVar) {
                    widget.mo2087u0(verticalBehaviour);
                }
            } else {
                C0299k.m1666c(this, system, widget);
                widget.mo1996b(system);
            }
        }
        if (this.f1465s0 > 0) {
            C0284c.m1517a(this, system, 0);
        }
        if (this.f1466t0 > 0) {
            C0284c.m1517a(this, system, 1);
        }
        return true;
    }

    /* renamed from: f1 */
    public void mo2117f1(C0275e system, boolean[] flags) {
        flags[2] = false;
        mo2029G0(system);
        int count = this.f1518k0.size();
        for (int i = 0; i < count; i++) {
            C0291f widget = this.f1518k0.get(i);
            widget.mo2029G0(system);
            C0291f.C0293b bVar = widget.f1386C[0];
            C0291f.C0293b bVar2 = C0291f.C0293b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && widget.mo2022D() < widget.mo2026F()) {
                flags[2] = true;
            }
            if (widget.f1386C[1] == bVar2 && widget.mo2079r() < widget.mo2024E()) {
                flags[2] = true;
            }
        }
    }

    /* renamed from: d1 */
    public void mo2115d1(boolean isRtl) {
        this.f1458l0 = isRtl;
    }

    /* renamed from: U0 */
    public boolean mo2106U0() {
        return this.f1458l0;
    }

    /* renamed from: d */
    public void mo1998d(int optimizationLevel) {
        super.mo1998d(optimizationLevel);
        int count = this.f1518k0.size();
        for (int i = 0; i < count; i++) {
            this.f1518k0.get(i).mo1998d(optimizationLevel);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r16v4 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r16v1, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0208  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2098K0() {
        /*
            r23 = this;
            r1 = r23
            int r2 = r1.f1392I
            int r3 = r1.f1393J
            int r0 = r23.mo2022D()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r23.mo2079r()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f1456E0 = r4
            r1.f1457F0 = r4
            a.f.a.j.f r0 = r1.f1387D
            if (r0 == 0) goto L_0x0046
            a.f.a.j.p r0 = r1.f1460n0
            if (r0 != 0) goto L_0x002a
            a.f.a.j.p r0 = new a.f.a.j.p
            r0.<init>(r1)
            r1.f1460n0 = r0
        L_0x002a:
            a.f.a.j.p r0 = r1.f1460n0
            r0.mo2153b(r1)
            int r0 = r1.f1461o0
            r1.mo2021C0(r0)
            int r0 = r1.f1462p0
            r1.mo2023D0(r0)
            r23.mo2041R()
            a.f.a.e r0 = r1.f1459m0
            a.f.a.c r0 = r0.mo1980w()
            r1.mo2042T(r0)
            goto L_0x004a
        L_0x0046:
            r1.f1392I = r4
            r1.f1393J = r4
        L_0x004a:
            int r0 = r1.f1454C0
            r7 = 32
            r8 = 8
            r9 = 1
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.mo2109X0(r8)
            if (r0 != 0) goto L_0x005c
            r23.mo2111Z0()
        L_0x005c:
            boolean r0 = r1.mo2109X0(r7)
            if (r0 != 0) goto L_0x0065
            r23.mo2108W0()
        L_0x0065:
            a.f.a.e r0 = r1.f1459m0
            r0.f1281g = r9
            goto L_0x006e
        L_0x006a:
            a.f.a.e r0 = r1.f1459m0
            r0.f1281g = r4
        L_0x006e:
            r0 = 0
            a.f.a.j.f$b[] r10 = r1.f1386C
            r11 = r10[r9]
            r10 = r10[r4]
            r23.mo2113b1()
            java.util.List<a.f.a.j.h> r12 = r1.f1469w0
            int r12 = r12.size()
            if (r12 != 0) goto L_0x0091
            java.util.List<a.f.a.j.h> r12 = r1.f1469w0
            r12.clear()
            java.util.List<a.f.a.j.h> r12 = r1.f1469w0
            a.f.a.j.h r13 = new a.f.a.j.h
            java.util.ArrayList<a.f.a.j.f> r14 = r1.f1518k0
            r13.<init>(r14)
            r12.add(r4, r13)
        L_0x0091:
            r12 = 0
            java.util.List<a.f.a.j.h> r13 = r1.f1469w0
            int r13 = r13.size()
            java.util.ArrayList<a.f.a.j.f> r14 = r1.f1518k0
            a.f.a.j.f$b r15 = r23.mo2081s()
            a.f.a.j.f$b r8 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r15 == r8) goto L_0x00ab
            a.f.a.j.f$b r15 = r23.mo2018B()
            if (r15 != r8) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r8 = 0
            goto L_0x00ac
        L_0x00ab:
            r8 = 1
        L_0x00ac:
            r15 = 0
        L_0x00ad:
            if (r15 >= r13) goto L_0x032d
            boolean r9 = r1.f1455D0
            if (r9 != 0) goto L_0x032d
            java.util.List<a.f.a.j.h> r9 = r1.f1469w0
            java.lang.Object r9 = r9.get(r15)
            a.f.a.j.h r9 = (p000a.p019f.p020a.p021j.C0295h) r9
            boolean r9 = r9.f1476d
            if (r9 == 0) goto L_0x00c5
            r22 = r3
            r21 = r13
            goto L_0x0321
        L_0x00c5:
            boolean r9 = r1.mo2109X0(r7)
            if (r9 == 0) goto L_0x00f8
            a.f.a.j.f$b r9 = r23.mo2081s()
            a.f.a.j.f$b r7 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            if (r9 != r7) goto L_0x00ea
            a.f.a.j.f$b r9 = r23.mo2018B()
            if (r9 != r7) goto L_0x00ea
            java.util.List<a.f.a.j.h> r7 = r1.f1469w0
            java.lang.Object r7 = r7.get(r15)
            a.f.a.j.h r7 = (p000a.p019f.p020a.p021j.C0295h) r7
            java.util.List r7 = r7.mo2121d()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f1518k0 = r7
            goto L_0x00f8
        L_0x00ea:
            java.util.List<a.f.a.j.h> r7 = r1.f1469w0
            java.lang.Object r7 = r7.get(r15)
            a.f.a.j.h r7 = (p000a.p019f.p020a.p021j.C0295h) r7
            java.util.List<a.f.a.j.f> r7 = r7.f1473a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r1.f1518k0 = r7
        L_0x00f8:
            r23.mo2113b1()
            java.util.ArrayList<a.f.a.j.f> r7 = r1.f1518k0
            int r7 = r7.size()
            r9 = 0
            r12 = 0
        L_0x0103:
            if (r12 >= r7) goto L_0x011f
            java.util.ArrayList<a.f.a.j.f> r4 = r1.f1518k0
            java.lang.Object r4 = r4.get(r12)
            a.f.a.j.f r4 = (p000a.p019f.p020a.p021j.C0291f) r4
            r18 = r9
            boolean r9 = r4 instanceof p000a.p019f.p020a.p021j.C0306q
            if (r9 == 0) goto L_0x0119
            r9 = r4
            a.f.a.j.q r9 = (p000a.p019f.p020a.p021j.C0306q) r9
            r9.mo2098K0()
        L_0x0119:
            int r12 = r12 + 1
            r9 = r18
            r4 = 0
            goto L_0x0103
        L_0x011f:
            r18 = r9
            r4 = 1
            r9 = r4
            r4 = r0
        L_0x0124:
            if (r9 == 0) goto L_0x030a
            int r12 = r18 + 1
            a.f.a.e r0 = r1.f1459m0     // Catch:{ Exception -> 0x0170 }
            r0.mo1957E()     // Catch:{ Exception -> 0x0170 }
            r23.mo2113b1()     // Catch:{ Exception -> 0x0170 }
            a.f.a.e r0 = r1.f1459m0     // Catch:{ Exception -> 0x0170 }
            r1.mo2057g(r0)     // Catch:{ Exception -> 0x0170 }
            r0 = 0
        L_0x0136:
            if (r0 >= r7) goto L_0x0154
            r19 = r4
            java.util.ArrayList<a.f.a.j.f> r4 = r1.f1518k0     // Catch:{ Exception -> 0x0150 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0150 }
            a.f.a.j.f r4 = (p000a.p019f.p020a.p021j.C0291f) r4     // Catch:{ Exception -> 0x0150 }
            r20 = r9
            a.f.a.e r9 = r1.f1459m0     // Catch:{ Exception -> 0x016c }
            r4.mo2057g(r9)     // Catch:{ Exception -> 0x016c }
            int r0 = r0 + 1
            r4 = r19
            r9 = r20
            goto L_0x0136
        L_0x0150:
            r0 = move-exception
            r20 = r9
            goto L_0x0175
        L_0x0154:
            r19 = r4
            r20 = r9
            a.f.a.e r0 = r1.f1459m0     // Catch:{ Exception -> 0x016c }
            boolean r0 = r1.mo2100O0(r0)     // Catch:{ Exception -> 0x016c }
            r9 = r0
            if (r9 == 0) goto L_0x0169
            a.f.a.e r0 = r1.f1459m0     // Catch:{ Exception -> 0x0167 }
            r0.mo1953A()     // Catch:{ Exception -> 0x0167 }
            goto L_0x0169
        L_0x0167:
            r0 = move-exception
            goto L_0x0175
        L_0x0169:
            r21 = r13
            goto L_0x0194
        L_0x016c:
            r0 = move-exception
            r9 = r20
            goto L_0x0175
        L_0x0170:
            r0 = move-exception
            r19 = r4
            r20 = r9
        L_0x0175:
            r0.printStackTrace()
            java.io.PrintStream r4 = java.lang.System.out
            r18 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r21 = r13
            java.lang.String r13 = "EXCEPTION : "
            r9.append(r13)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r4.println(r9)
            r9 = r18
        L_0x0194:
            if (r9 == 0) goto L_0x01a2
            a.f.a.e r4 = r1.f1459m0
            boolean[] r13 = p000a.p019f.p020a.p021j.C0299k.f1493a
            r1.mo2117f1(r4, r13)
            r22 = r3
            r20 = r9
            goto L_0x01fa
        L_0x01a2:
            a.f.a.e r4 = r1.f1459m0
            r1.mo2029G0(r4)
            r4 = 0
        L_0x01a8:
            if (r4 >= r7) goto L_0x01f6
            java.util.ArrayList<a.f.a.j.f> r13 = r1.f1518k0
            java.lang.Object r13 = r13.get(r4)
            a.f.a.j.f r13 = (p000a.p019f.p020a.p021j.C0291f) r13
            a.f.a.j.f$b[] r0 = r13.f1386C
            r17 = 0
            r0 = r0[r17]
            r20 = r9
            a.f.a.j.f$b r9 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            if (r0 != r9) goto L_0x01d5
            int r0 = r13.mo2022D()
            r22 = r3
            int r3 = r13.mo2026F()
            if (r0 >= r3) goto L_0x01d2
            boolean[] r0 = p000a.p019f.p020a.p021j.C0299k.f1493a
            r3 = 2
            r16 = 1
            r0[r3] = r16
            goto L_0x01fa
        L_0x01d2:
            r16 = 1
            goto L_0x01d9
        L_0x01d5:
            r22 = r3
            r16 = 1
        L_0x01d9:
            a.f.a.j.f$b[] r0 = r13.f1386C
            r0 = r0[r16]
            if (r0 != r9) goto L_0x01ef
            int r0 = r13.mo2079r()
            int r3 = r13.mo2024E()
            if (r0 >= r3) goto L_0x01ef
            boolean[] r0 = p000a.p019f.p020a.p021j.C0299k.f1493a
            r3 = 2
            r0[r3] = r16
            goto L_0x01fa
        L_0x01ef:
            int r4 = r4 + 1
            r9 = r20
            r3 = r22
            goto L_0x01a8
        L_0x01f6:
            r22 = r3
            r20 = r9
        L_0x01fa:
            r0 = 0
            if (r8 == 0) goto L_0x0270
            r3 = 8
            if (r12 >= r3) goto L_0x0270
            boolean[] r4 = p000a.p019f.p020a.p021j.C0299k.f1493a
            r9 = 2
            boolean r4 = r4[r9]
            if (r4 == 0) goto L_0x0270
            r4 = 0
            r9 = 0
            r13 = 0
        L_0x020b:
            if (r13 >= r7) goto L_0x0236
            java.util.ArrayList<a.f.a.j.f> r3 = r1.f1518k0
            java.lang.Object r3 = r3.get(r13)
            a.f.a.j.f r3 = (p000a.p019f.p020a.p021j.C0291f) r3
            r18 = r0
            int r0 = r3.f1392I
            int r20 = r3.mo2022D()
            int r0 = r0 + r20
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r3.f1393J
            int r20 = r3.mo2079r()
            int r0 = r0 + r20
            int r9 = java.lang.Math.max(r9, r0)
            int r13 = r13 + 1
            r0 = r18
            r3 = 8
            goto L_0x020b
        L_0x0236:
            r18 = r0
            int r0 = r1.f1401R
            int r0 = java.lang.Math.max(r0, r4)
            int r3 = r1.f1402S
            int r3 = java.lang.Math.max(r3, r9)
            a.f.a.j.f$b r4 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r10 != r4) goto L_0x025c
            int r9 = r23.mo2022D()
            if (r9 >= r0) goto L_0x025c
            r1.mo2095y0(r0)
            a.f.a.j.f$b[] r9 = r1.f1386C
            r13 = 0
            r9[r13] = r4
            r9 = 1
            r13 = 1
            r19 = r9
            r18 = r13
        L_0x025c:
            if (r11 != r4) goto L_0x0272
            int r9 = r23.mo2079r()
            if (r9 >= r3) goto L_0x0272
            r1.mo2050b0(r3)
            a.f.a.j.f$b[] r9 = r1.f1386C
            r13 = 1
            r9[r13] = r4
            r4 = 1
            r9 = 1
            r0 = r9
            goto L_0x0276
        L_0x0270:
            r18 = r0
        L_0x0272:
            r0 = r18
            r4 = r19
        L_0x0276:
            int r3 = r1.f1401R
            int r9 = r23.mo2022D()
            int r3 = java.lang.Math.max(r3, r9)
            int r9 = r23.mo2022D()
            if (r3 <= r9) goto L_0x0293
            r1.mo2095y0(r3)
            a.f.a.j.f$b[] r9 = r1.f1386C
            a.f.a.j.f$b r13 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r17 = 0
            r9[r17] = r13
            r4 = 1
            r0 = 1
        L_0x0293:
            int r9 = r1.f1402S
            int r13 = r23.mo2079r()
            int r9 = java.lang.Math.max(r9, r13)
            int r13 = r23.mo2079r()
            if (r9 <= r13) goto L_0x02b0
            r1.mo2050b0(r9)
            a.f.a.j.f$b[] r13 = r1.f1386C
            a.f.a.j.f$b r18 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r16 = 1
            r13[r16] = r18
            r4 = 1
            r0 = 1
        L_0x02b0:
            if (r4 != 0) goto L_0x02fc
            a.f.a.j.f$b[] r13 = r1.f1386C
            r17 = 0
            r13 = r13[r17]
            r18 = r0
            a.f.a.j.f$b r0 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r13 != r0) goto L_0x02d8
            if (r5 <= 0) goto L_0x02d8
            int r13 = r23.mo2022D()
            if (r13 <= r5) goto L_0x02d8
            r13 = 1
            r1.f1456E0 = r13
            r4 = 1
            a.f.a.j.f$b[] r13 = r1.f1386C
            a.f.a.j.f$b r19 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r17 = 0
            r13[r17] = r19
            r1.mo2095y0(r5)
            r13 = 1
            r18 = r13
        L_0x02d8:
            a.f.a.j.f$b[] r13 = r1.f1386C
            r19 = r3
            r3 = 1
            r13 = r13[r3]
            if (r13 != r0) goto L_0x02f9
            if (r6 <= 0) goto L_0x02f9
            int r0 = r23.mo2079r()
            if (r0 <= r6) goto L_0x02f9
            r1.f1457F0 = r3
            r0 = 1
            a.f.a.j.f$b[] r4 = r1.f1386C
            a.f.a.j.f$b r13 = p000a.p019f.p020a.p021j.C0291f.C0293b.FIXED
            r4[r3] = r13
            r1.mo2050b0(r6)
            r3 = 1
            r4 = r0
            r9 = r3
            goto L_0x0302
        L_0x02f9:
            r9 = r18
            goto L_0x0302
        L_0x02fc:
            r18 = r0
            r19 = r3
            r9 = r18
        L_0x0302:
            r18 = r12
            r13 = r21
            r3 = r22
            goto L_0x0124
        L_0x030a:
            r22 = r3
            r19 = r4
            r20 = r9
            r21 = r13
            java.util.List<a.f.a.j.h> r0 = r1.f1469w0
            java.lang.Object r0 = r0.get(r15)
            a.f.a.j.h r0 = (p000a.p019f.p020a.p021j.C0295h) r0
            r0.mo2124g()
            r12 = r18
            r0 = r19
        L_0x0321:
            int r15 = r15 + 1
            r13 = r21
            r3 = r22
            r4 = 0
            r7 = 32
            r9 = 1
            goto L_0x00ad
        L_0x032d:
            r22 = r3
            r21 = r13
            r1.f1518k0 = r14
            a.f.a.j.f r3 = r1.f1387D
            if (r3 == 0) goto L_0x0365
            int r3 = r1.f1401R
            int r4 = r23.mo2022D()
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r1.f1402S
            int r7 = r23.mo2079r()
            int r4 = java.lang.Math.max(r4, r7)
            a.f.a.j.p r7 = r1.f1460n0
            r7.mo2152a(r1)
            int r7 = r1.f1461o0
            int r7 = r7 + r3
            int r9 = r1.f1463q0
            int r7 = r7 + r9
            r1.mo2095y0(r7)
            int r7 = r1.f1462p0
            int r7 = r7 + r4
            int r9 = r1.f1464r0
            int r7 = r7 + r9
            r1.mo2050b0(r7)
            r3 = r22
            goto L_0x036b
        L_0x0365:
            r1.f1392I = r2
            r3 = r22
            r1.f1393J = r3
        L_0x036b:
            if (r0 == 0) goto L_0x0375
            a.f.a.j.f$b[] r4 = r1.f1386C
            r7 = 0
            r4[r7] = r10
            r7 = 1
            r4[r7] = r11
        L_0x0375:
            a.f.a.e r4 = r1.f1459m0
            a.f.a.c r4 = r4.mo1980w()
            r1.mo2042T(r4)
            a.f.a.j.g r4 = r23.mo2157J0()
            if (r1 != r4) goto L_0x0387
            r23.mo2027F0()
        L_0x0387:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p019f.p020a.p021j.C0294g.mo2098K0():void");
    }

    /* renamed from: a1 */
    public void mo2112a1() {
        mo2111Z0();
        mo1998d(this.f1454C0);
    }

    /* renamed from: e1 */
    public void mo2116e1() {
        C0301m leftNode = mo2059h(C0286e.C0290d.LEFT).mo2006f();
        C0301m topNode = mo2059h(C0286e.C0290d.TOP).mo2006f();
        leftNode.mo2139l((C0301m) null, 0.0f);
        topNode.mo2139l((C0301m) null, 0.0f);
    }

    /* renamed from: Y0 */
    public void mo2110Y0(int width, int height) {
        C0302n nVar;
        C0302n nVar2;
        C0291f.C0293b bVar = this.f1386C[0];
        C0291f.C0293b bVar2 = C0291f.C0293b.WRAP_CONTENT;
        if (!(bVar == bVar2 || (nVar2 = this.f1414c) == null)) {
            nVar2.mo2147h(width);
        }
        if (this.f1386C[1] != bVar2 && (nVar = this.f1416d) != null) {
            nVar.mo2147h(height);
        }
    }

    /* renamed from: Z0 */
    public void mo2111Z0() {
        int count = this.f1518k0.size();
        mo1994S();
        for (int i = 0; i < count; i++) {
            this.f1518k0.get(i).mo1994S();
        }
    }

    /* renamed from: W0 */
    public void mo2108W0() {
        if (!mo2109X0(8)) {
            mo1998d(this.f1454C0);
        }
        mo2116e1();
    }

    /* renamed from: S0 */
    public boolean mo2104S0() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo2113b1() {
        this.f1465s0 = 0;
        this.f1466t0 = 0;
    }

    /* renamed from: N0 */
    public void mo2099N0(C0291f constraintWidget, int type) {
        C0291f widget = constraintWidget;
        if (type == 0) {
            mo2101P0(widget);
        } else if (type == 1) {
            mo2102Q0(widget);
        }
    }

    /* renamed from: P0 */
    public final void mo2101P0(C0291f widget) {
        int i = this.f1465s0 + 1;
        C0285d[] dVarArr = this.f1468v0;
        if (i >= dVarArr.length) {
            this.f1468v0 = (C0285d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f1468v0[this.f1465s0] = new C0285d(widget, 0, mo2106U0());
        this.f1465s0++;
    }

    /* renamed from: Q0 */
    public final void mo2102Q0(C0291f widget) {
        int i = this.f1466t0 + 1;
        C0285d[] dVarArr = this.f1467u0;
        if (i >= dVarArr.length) {
            this.f1467u0 = (C0285d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f1467u0[this.f1466t0] = new C0285d(widget, 1, mo2106U0());
        this.f1466t0++;
    }
}
