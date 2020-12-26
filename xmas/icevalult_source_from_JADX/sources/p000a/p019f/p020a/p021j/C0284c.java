package p000a.p019f.p020a.p021j;

import p000a.p019f.p020a.C0275e;

/* renamed from: a.f.a.j.c */
public class C0284c {
    /* renamed from: a */
    public static void m1517a(C0294g constraintWidgetContainer, C0275e system, int orientation) {
        C0285d[] chainsArray;
        int chainsSize;
        int offset;
        if (orientation == 0) {
            offset = 0;
            chainsSize = constraintWidgetContainer.f1465s0;
            chainsArray = constraintWidgetContainer.f1468v0;
        } else {
            offset = 2;
            chainsSize = constraintWidgetContainer.f1466t0;
            chainsArray = constraintWidgetContainer.f1467u0;
        }
        for (int i = 0; i < chainsSize; i++) {
            C0285d first = chainsArray[i];
            first.mo1999a();
            if (!constraintWidgetContainer.mo2109X0(4)) {
                m1518b(constraintWidgetContainer, system, orientation, offset, first);
            } else if (!C0299k.m1665b(constraintWidgetContainer, system, orientation, offset, first)) {
                m1518b(constraintWidgetContainer, system, orientation, offset, first);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x060c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0651 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0197  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1518b(p000a.p019f.p020a.p021j.C0294g r44, p000a.p019f.p020a.C0275e r45, int r46, int r47, p000a.p019f.p020a.p021j.C0285d r48) {
        /*
            r0 = r44
            r10 = r45
            r11 = r48
            a.f.a.j.f r12 = r11.f1339a
            a.f.a.j.f r13 = r11.f1341c
            a.f.a.j.f r14 = r11.f1340b
            a.f.a.j.f r15 = r11.f1342d
            a.f.a.j.f r9 = r11.f1343e
            r1 = r12
            r2 = 0
            r3 = 0
            float r4 = r11.f1349k
            a.f.a.j.f r8 = r11.f1344f
            a.f.a.j.f r7 = r11.f1345g
            a.f.a.j.f$b[] r5 = r0.f1386C
            r5 = r5[r46]
            a.f.a.j.f$b r6 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            r16 = r1
            if (r5 != r6) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            r18 = r5
            r5 = 0
            r6 = 0
            r19 = 0
            if (r46 != 0) goto L_0x0052
            int r1 = r9.f1419e0
            if (r1 != 0) goto L_0x0035
            r22 = 1
            goto L_0x0037
        L_0x0035:
            r22 = 0
        L_0x0037:
            r5 = r22
            r22 = r2
            r2 = 1
            if (r1 != r2) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            r6 = 2
            if (r1 != r6) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            r19 = r2
            r21 = r3
            r23 = r5
            r6 = r16
            r16 = r1
            goto L_0x0072
        L_0x0052:
            r22 = r2
            int r1 = r9.f1421f0
            if (r1 != 0) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r5 = r2
            r2 = 1
            if (r1 != r2) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            r6 = 2
            if (r1 != r6) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            r19 = r2
            r21 = r3
            r23 = r5
            r6 = r16
            r16 = r1
        L_0x0072:
            r3 = 5
            if (r21 != 0) goto L_0x014c
            a.f.a.j.e[] r2 = r6.f1384A
            r2 = r2[r47]
            r24 = 4
            if (r18 != 0) goto L_0x007f
            if (r16 == 0) goto L_0x0081
        L_0x007f:
            r24 = 1
        L_0x0081:
            int r25 = r2.mo2004d()
            a.f.a.j.e r5 = r2.f1359d
            if (r5 == 0) goto L_0x0094
            if (r6 == r12) goto L_0x0094
            int r5 = r5.mo2004d()
            int r25 = r25 + r5
            r5 = r25
            goto L_0x0096
        L_0x0094:
            r5 = r25
        L_0x0096:
            if (r16 == 0) goto L_0x00a1
            if (r6 == r12) goto L_0x00a1
            if (r6 == r14) goto L_0x00a1
            r24 = 6
            r27 = r24
            goto L_0x00ac
        L_0x00a1:
            if (r23 == 0) goto L_0x00aa
            if (r18 == 0) goto L_0x00aa
            r24 = 4
            r27 = r24
            goto L_0x00ac
        L_0x00aa:
            r27 = r24
        L_0x00ac:
            a.f.a.j.e r1 = r2.f1359d
            if (r1 == 0) goto L_0x00d2
            if (r6 != r14) goto L_0x00bc
            r25 = r4
            a.f.a.i r4 = r2.f1364i
            a.f.a.i r1 = r1.f1364i
            r10.mo1967i(r4, r1, r5, r3)
            goto L_0x00c6
        L_0x00bc:
            r25 = r4
            a.f.a.i r4 = r2.f1364i
            a.f.a.i r1 = r1.f1364i
            r3 = 6
            r10.mo1967i(r4, r1, r5, r3)
        L_0x00c6:
            a.f.a.i r1 = r2.f1364i
            a.f.a.j.e r3 = r2.f1359d
            a.f.a.i r3 = r3.f1364i
            r4 = r27
            r10.mo1963e(r1, r3, r5, r4)
            goto L_0x00d6
        L_0x00d2:
            r25 = r4
            r4 = r27
        L_0x00d6:
            if (r18 == 0) goto L_0x0114
            int r1 = r6.mo2020C()
            r3 = 8
            if (r1 == r3) goto L_0x00fe
            a.f.a.j.f$b[] r1 = r6.f1386C
            r1 = r1[r46]
            a.f.a.j.f$b r3 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x00fe
            a.f.a.j.e[] r1 = r6.f1384A
            int r3 = r47 + 1
            r3 = r1[r3]
            a.f.a.i r3 = r3.f1364i
            r1 = r1[r47]
            a.f.a.i r1 = r1.f1364i
            r26 = r2
            r27 = r4
            r2 = 5
            r4 = 0
            r10.mo1967i(r3, r1, r4, r2)
            goto L_0x0102
        L_0x00fe:
            r26 = r2
            r27 = r4
        L_0x0102:
            a.f.a.j.e[] r1 = r6.f1384A
            r1 = r1[r47]
            a.f.a.i r1 = r1.f1364i
            a.f.a.j.e[] r2 = r0.f1384A
            r2 = r2[r47]
            a.f.a.i r2 = r2.f1364i
            r3 = 6
            r4 = 0
            r10.mo1967i(r1, r2, r4, r3)
            goto L_0x0118
        L_0x0114:
            r26 = r2
            r27 = r4
        L_0x0118:
            a.f.a.j.e[] r1 = r6.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            a.f.a.j.e r1 = r1.f1359d
            if (r1 == 0) goto L_0x013c
            a.f.a.j.f r2 = r1.f1357b
            a.f.a.j.e[] r3 = r2.f1384A
            r4 = r3[r47]
            a.f.a.j.e r4 = r4.f1359d
            if (r4 == 0) goto L_0x0138
            r3 = r3[r47]
            a.f.a.j.e r3 = r3.f1359d
            a.f.a.j.f r3 = r3.f1357b
            if (r3 == r6) goto L_0x0135
            goto L_0x0138
        L_0x0135:
            r22 = r2
            goto L_0x013f
        L_0x0138:
            r2 = 0
            r22 = r2
            goto L_0x013f
        L_0x013c:
            r2 = 0
            r22 = r2
        L_0x013f:
            if (r22 == 0) goto L_0x0145
            r2 = r22
            r6 = r2
            goto L_0x0148
        L_0x0145:
            r2 = 1
            r21 = r2
        L_0x0148:
            r4 = r25
            goto L_0x0072
        L_0x014c:
            r25 = r4
            if (r15 == 0) goto L_0x0174
            a.f.a.j.e[] r1 = r13.f1384A
            int r2 = r47 + 1
            r2 = r1[r2]
            a.f.a.j.e r2 = r2.f1359d
            if (r2 == 0) goto L_0x0174
            a.f.a.j.e[] r2 = r15.f1384A
            int r3 = r47 + 1
            r2 = r2[r3]
            a.f.a.i r3 = r2.f1364i
            int r4 = r47 + 1
            r1 = r1[r4]
            a.f.a.j.e r1 = r1.f1359d
            a.f.a.i r1 = r1.f1364i
            int r4 = r2.mo2004d()
            int r4 = -r4
            r5 = 5
            r10.mo1969k(r3, r1, r4, r5)
            goto L_0x0175
        L_0x0174:
            r5 = 5
        L_0x0175:
            if (r18 == 0) goto L_0x0193
            a.f.a.j.e[] r1 = r0.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            a.f.a.i r1 = r1.f1364i
            a.f.a.j.e[] r2 = r13.f1384A
            int r3 = r47 + 1
            r3 = r2[r3]
            a.f.a.i r3 = r3.f1364i
            int r4 = r47 + 1
            r2 = r2[r4]
            int r2 = r2.mo2004d()
            r4 = 6
            r10.mo1967i(r1, r3, r2, r4)
        L_0x0193:
            java.util.ArrayList<a.f.a.j.f> r4 = r11.f1346h
            if (r4 == 0) goto L_0x0280
            int r1 = r4.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0275
            r3 = 0
            r20 = 0
            boolean r2 = r11.f1352n
            if (r2 == 0) goto L_0x01ad
            boolean r2 = r11.f1354p
            if (r2 != 0) goto L_0x01ad
            int r2 = r11.f1348j
            float r2 = (float) r2
            goto L_0x01af
        L_0x01ad:
            r2 = r25
        L_0x01af:
            r25 = 0
            r5 = r25
        L_0x01b3:
            if (r5 >= r1) goto L_0x0266
            java.lang.Object r25 = r4.get(r5)
            r0 = r25
            a.f.a.j.f r0 = (p000a.p019f.p020a.p021j.C0291f) r0
            r37 = r1
            float[] r1 = r0.f1423g0
            r1 = r1[r46]
            r25 = 0
            int r28 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r28 >= 0) goto L_0x01f5
            r28 = r1
            boolean r1 = r11.f1354p
            if (r1 == 0) goto L_0x01ec
            a.f.a.j.e[] r1 = r0.f1384A
            int r25 = r47 + 1
            r38 = r4
            r4 = r1[r25]
            a.f.a.i r4 = r4.f1364i
            r1 = r1[r47]
            a.f.a.i r1 = r1.f1364i
            r39 = r6
            r6 = 4
            r40 = r7
            r7 = 0
            r10.mo1963e(r4, r1, r7, r6)
            r17 = r8
            r7 = 6
            r8 = 0
            goto L_0x0256
        L_0x01ec:
            r38 = r4
            r39 = r6
            r40 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01fd
        L_0x01f5:
            r28 = r1
            r38 = r4
            r39 = r6
            r40 = r7
        L_0x01fd:
            int r4 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r4 != 0) goto L_0x0215
            a.f.a.j.e[] r4 = r0.f1384A
            int r6 = r47 + 1
            r6 = r4[r6]
            a.f.a.i r6 = r6.f1364i
            r4 = r4[r47]
            a.f.a.i r4 = r4.f1364i
            r17 = r8
            r7 = 6
            r8 = 0
            r10.mo1963e(r6, r4, r8, r7)
            goto L_0x0256
        L_0x0215:
            r17 = r8
            r7 = 6
            r8 = 0
            if (r3 == 0) goto L_0x0250
            a.f.a.j.e[] r4 = r3.f1384A
            r6 = r4[r47]
            a.f.a.i r6 = r6.f1364i
            int r24 = r47 + 1
            r4 = r4[r24]
            a.f.a.i r4 = r4.f1364i
            a.f.a.j.e[] r7 = r0.f1384A
            r8 = r7[r47]
            a.f.a.i r8 = r8.f1364i
            int r25 = r47 + 1
            r7 = r7[r25]
            a.f.a.i r7 = r7.f1364i
            r25 = r3
            a.f.a.b r3 = r45.mo1977s()
            r28 = r3
            r29 = r20
            r30 = r2
            r31 = r1
            r32 = r6
            r33 = r4
            r34 = r8
            r35 = r7
            r28.mo1938k(r29, r30, r31, r32, r33, r34, r35)
            r10.mo1962d(r3)
            goto L_0x0252
        L_0x0250:
            r25 = r3
        L_0x0252:
            r3 = r0
            r4 = r1
            r20 = r4
        L_0x0256:
            int r5 = r5 + 1
            r0 = r44
            r8 = r17
            r1 = r37
            r4 = r38
            r6 = r39
            r7 = r40
            goto L_0x01b3
        L_0x0266:
            r37 = r1
            r25 = r3
            r38 = r4
            r39 = r6
            r40 = r7
            r17 = r8
            r25 = r2
            goto L_0x0288
        L_0x0275:
            r37 = r1
            r38 = r4
            r39 = r6
            r40 = r7
            r17 = r8
            goto L_0x0288
        L_0x0280:
            r38 = r4
            r39 = r6
            r40 = r7
            r17 = r8
        L_0x0288:
            if (r14 == 0) goto L_0x0325
            if (r14 == r15) goto L_0x0299
            if (r16 == 0) goto L_0x028f
            goto L_0x0299
        L_0x028f:
            r35 = r9
            r30 = r38
            r31 = r39
            r33 = r40
            goto L_0x032d
        L_0x0299:
            a.f.a.j.e[] r1 = r12.f1384A
            r2 = r1[r47]
            a.f.a.j.e[] r3 = r13.f1384A
            int r4 = r47 + 1
            r4 = r3[r4]
            r5 = r1[r47]
            a.f.a.j.e r5 = r5.f1359d
            if (r5 == 0) goto L_0x02b0
            r1 = r1[r47]
            a.f.a.j.e r1 = r1.f1359d
            a.f.a.i r1 = r1.f1364i
            goto L_0x02b1
        L_0x02b0:
            r1 = 0
        L_0x02b1:
            r20 = r1
            int r1 = r47 + 1
            r1 = r3[r1]
            a.f.a.j.e r1 = r1.f1359d
            if (r1 == 0) goto L_0x02c4
            int r1 = r47 + 1
            r1 = r3[r1]
            a.f.a.j.e r1 = r1.f1359d
            a.f.a.i r1 = r1.f1364i
            goto L_0x02c5
        L_0x02c4:
            r1 = 0
        L_0x02c5:
            r24 = r1
            if (r14 != r15) goto L_0x02d4
            a.f.a.j.e[] r1 = r14.f1384A
            r2 = r1[r47]
            int r3 = r47 + 1
            r4 = r1[r3]
            r8 = r2
            r7 = r4
            goto L_0x02d6
        L_0x02d4:
            r8 = r2
            r7 = r4
        L_0x02d6:
            if (r20 == 0) goto L_0x0317
            if (r24 == 0) goto L_0x0317
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r46 != 0) goto L_0x02e3
            float r1 = r9.f1405V
            r26 = r1
            goto L_0x02e7
        L_0x02e3:
            float r1 = r9.f1406W
            r26 = r1
        L_0x02e7:
            int r27 = r8.mo2004d()
            int r28 = r7.mo2004d()
            a.f.a.i r2 = r8.f1364i
            a.f.a.i r6 = r7.f1364i
            r29 = 5
            r1 = r45
            r3 = r20
            r30 = r38
            r4 = r27
            r5 = r26
            r32 = r6
            r31 = r39
            r6 = r24
            r34 = r7
            r33 = r40
            r7 = r32
            r32 = r8
            r8 = r28
            r35 = r9
            r9 = r29
            r1.mo1961c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0323
        L_0x0317:
            r34 = r7
            r32 = r8
            r35 = r9
            r30 = r38
            r31 = r39
            r33 = r40
        L_0x0323:
            goto L_0x060a
        L_0x0325:
            r35 = r9
            r30 = r38
            r31 = r39
            r33 = r40
        L_0x032d:
            if (r23 == 0) goto L_0x0476
            if (r14 == 0) goto L_0x0476
            r1 = r14
            r2 = r14
            int r3 = r11.f1348j
            if (r3 <= 0) goto L_0x033e
            int r4 = r11.f1347i
            if (r4 != r3) goto L_0x033e
            r27 = 1
            goto L_0x0340
        L_0x033e:
            r27 = 0
        L_0x0340:
            r20 = r27
            r8 = r1
            r9 = r2
        L_0x0344:
            if (r8 == 0) goto L_0x046e
            a.f.a.j.f[] r1 = r8.f1427i0
            r1 = r1[r46]
            r7 = r1
        L_0x034b:
            if (r7 == 0) goto L_0x035a
            int r1 = r7.mo2020C()
            r5 = 8
            if (r1 != r5) goto L_0x035c
            a.f.a.j.f[] r1 = r7.f1427i0
            r7 = r1[r46]
            goto L_0x034b
        L_0x035a:
            r5 = 8
        L_0x035c:
            if (r7 != 0) goto L_0x036b
            if (r8 != r15) goto L_0x0361
            goto L_0x036b
        L_0x0361:
            r39 = r7
            r40 = r8
            r41 = r9
            r0 = 8
            goto L_0x045c
        L_0x036b:
            a.f.a.j.e[] r1 = r8.f1384A
            r6 = r1[r47]
            a.f.a.i r4 = r6.f1364i
            a.f.a.j.e r1 = r6.f1359d
            if (r1 == 0) goto L_0x0378
            a.f.a.i r1 = r1.f1364i
            goto L_0x0379
        L_0x0378:
            r1 = 0
        L_0x0379:
            if (r9 == r8) goto L_0x0386
            a.f.a.j.e[] r2 = r9.f1384A
            int r3 = r47 + 1
            r2 = r2[r3]
            a.f.a.i r1 = r2.f1364i
            r22 = r1
            goto L_0x03a0
        L_0x0386:
            if (r8 != r14) goto L_0x039e
            if (r9 != r8) goto L_0x039e
            a.f.a.j.e[] r2 = r12.f1384A
            r3 = r2[r47]
            a.f.a.j.e r3 = r3.f1359d
            if (r3 == 0) goto L_0x0399
            r2 = r2[r47]
            a.f.a.j.e r2 = r2.f1359d
            a.f.a.i r2 = r2.f1364i
            goto L_0x039a
        L_0x0399:
            r2 = 0
        L_0x039a:
            r1 = r2
            r22 = r1
            goto L_0x03a0
        L_0x039e:
            r22 = r1
        L_0x03a0:
            r1 = 0
            r2 = 0
            r3 = 0
            int r24 = r6.mo2004d()
            a.f.a.j.e[] r0 = r8.f1384A
            int r27 = r47 + 1
            r0 = r0[r27]
            int r0 = r0.mo2004d()
            if (r7 == 0) goto L_0x03c8
            a.f.a.j.e[] r5 = r7.f1384A
            r1 = r5[r47]
            a.f.a.i r2 = r1.f1364i
            a.f.a.j.e[] r5 = r8.f1384A
            int r28 = r47 + 1
            r5 = r5[r28]
            a.f.a.i r3 = r5.f1364i
            r28 = r1
            r29 = r2
            r31 = r3
            goto L_0x03e2
        L_0x03c8:
            a.f.a.j.e[] r5 = r13.f1384A
            int r28 = r47 + 1
            r5 = r5[r28]
            a.f.a.j.e r1 = r5.f1359d
            if (r1 == 0) goto L_0x03d4
            a.f.a.i r2 = r1.f1364i
        L_0x03d4:
            a.f.a.j.e[] r5 = r8.f1384A
            int r28 = r47 + 1
            r5 = r5[r28]
            a.f.a.i r3 = r5.f1364i
            r28 = r1
            r29 = r2
            r31 = r3
        L_0x03e2:
            if (r28 == 0) goto L_0x03e9
            int r1 = r28.mo2004d()
            int r0 = r0 + r1
        L_0x03e9:
            if (r9 == 0) goto L_0x03f7
            a.f.a.j.e[] r1 = r9.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            int r1 = r1.mo2004d()
            int r24 = r24 + r1
        L_0x03f7:
            if (r4 == 0) goto L_0x044e
            if (r22 == 0) goto L_0x044e
            if (r29 == 0) goto L_0x044e
            if (r31 == 0) goto L_0x044e
            r1 = r24
            if (r8 != r14) goto L_0x040e
            a.f.a.j.e[] r2 = r14.f1384A
            r2 = r2[r47]
            int r1 = r2.mo2004d()
            r32 = r1
            goto L_0x0410
        L_0x040e:
            r32 = r1
        L_0x0410:
            r1 = r0
            if (r8 != r15) goto L_0x0420
            a.f.a.j.e[] r2 = r15.f1384A
            int r3 = r47 + 1
            r2 = r2[r3]
            int r1 = r2.mo2004d()
            r34 = r1
            goto L_0x0422
        L_0x0420:
            r34 = r1
        L_0x0422:
            r1 = 4
            if (r20 == 0) goto L_0x0429
            r1 = 6
            r36 = r1
            goto L_0x042b
        L_0x0429:
            r36 = r1
        L_0x042b:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r45
            r2 = r4
            r3 = r22
            r37 = r4
            r4 = r32
            r38 = r0
            r0 = 8
            r27 = r6
            r6 = r29
            r39 = r7
            r7 = r31
            r40 = r8
            r8 = r34
            r41 = r9
            r9 = r36
            r1.mo1961c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x045c
        L_0x044e:
            r38 = r0
            r37 = r4
            r27 = r6
            r39 = r7
            r40 = r8
            r41 = r9
            r0 = 8
        L_0x045c:
            int r1 = r40.mo2020C()
            if (r1 == r0) goto L_0x0466
            r1 = r40
            r9 = r1
            goto L_0x0468
        L_0x0466:
            r9 = r41
        L_0x0468:
            r8 = r39
            r22 = r39
            goto L_0x0344
        L_0x046e:
            r40 = r8
            r41 = r9
            r31 = r40
            goto L_0x060a
        L_0x0476:
            r0 = 8
            if (r19 == 0) goto L_0x060a
            if (r14 == 0) goto L_0x060a
            r1 = r14
            r2 = r14
            int r3 = r11.f1348j
            if (r3 <= 0) goto L_0x0489
            int r4 = r11.f1347i
            if (r4 != r3) goto L_0x0489
            r27 = 1
            goto L_0x048b
        L_0x0489:
            r27 = 0
        L_0x048b:
            r20 = r27
            r8 = r1
            r9 = r2
        L_0x048f:
            if (r8 == 0) goto L_0x0581
            a.f.a.j.f[] r1 = r8.f1427i0
            r1 = r1[r46]
        L_0x0495:
            if (r1 == 0) goto L_0x04a2
            int r2 = r1.mo2020C()
            if (r2 != r0) goto L_0x04a2
            a.f.a.j.f[] r2 = r1.f1427i0
            r1 = r2[r46]
            goto L_0x0495
        L_0x04a2:
            if (r8 == r14) goto L_0x0567
            if (r8 == r15) goto L_0x0567
            if (r1 == 0) goto L_0x0567
            if (r1 != r15) goto L_0x04ad
            r1 = 0
            r7 = r1
            goto L_0x04ae
        L_0x04ad:
            r7 = r1
        L_0x04ae:
            a.f.a.j.e[] r1 = r8.f1384A
            r6 = r1[r47]
            a.f.a.i r5 = r6.f1364i
            a.f.a.j.e r1 = r6.f1359d
            if (r1 == 0) goto L_0x04bb
            a.f.a.i r1 = r1.f1364i
            goto L_0x04bc
        L_0x04bb:
            r1 = 0
        L_0x04bc:
            a.f.a.j.e[] r2 = r9.f1384A
            int r3 = r47 + 1
            r2 = r2[r3]
            a.f.a.i r4 = r2.f1364i
            r1 = 0
            r2 = 0
            r3 = 0
            int r22 = r6.mo2004d()
            a.f.a.j.e[] r0 = r8.f1384A
            int r24 = r47 + 1
            r0 = r0[r24]
            int r0 = r0.mo2004d()
            if (r7 == 0) goto L_0x04f0
            r24 = r1
            a.f.a.j.e[] r1 = r7.f1384A
            r1 = r1[r47]
            a.f.a.i r2 = r1.f1364i
            r24 = r2
            a.f.a.j.e r2 = r1.f1359d
            if (r2 == 0) goto L_0x04e8
            a.f.a.i r2 = r2.f1364i
            goto L_0x04e9
        L_0x04e8:
            r2 = 0
        L_0x04e9:
            r28 = r2
            r29 = r24
            r24 = r1
            goto L_0x0511
        L_0x04f0:
            r24 = r1
            a.f.a.j.e[] r1 = r8.f1384A
            int r28 = r47 + 1
            r29 = r2
            r2 = r1[r28]
            a.f.a.j.e r2 = r2.f1359d
            if (r2 == 0) goto L_0x0505
            r24 = r3
            a.f.a.i r3 = r2.f1364i
            r29 = r3
            goto L_0x0507
        L_0x0505:
            r24 = r3
        L_0x0507:
            int r3 = r47 + 1
            r1 = r1[r3]
            a.f.a.i r1 = r1.f1364i
            r28 = r1
            r24 = r2
        L_0x0511:
            if (r24 == 0) goto L_0x0518
            int r1 = r24.mo2004d()
            int r0 = r0 + r1
        L_0x0518:
            if (r9 == 0) goto L_0x0526
            a.f.a.j.e[] r1 = r9.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            int r1 = r1.mo2004d()
            int r22 = r22 + r1
        L_0x0526:
            r1 = 4
            if (r20 == 0) goto L_0x052d
            r1 = 6
            r31 = r1
            goto L_0x052f
        L_0x052d:
            r31 = r1
        L_0x052f:
            if (r5 == 0) goto L_0x0558
            if (r4 == 0) goto L_0x0558
            if (r29 == 0) goto L_0x0558
            if (r28 == 0) goto L_0x0558
            r32 = 1056964608(0x3f000000, float:0.5)
            r1 = r45
            r2 = r5
            r3 = r4
            r34 = r4
            r4 = r22
            r36 = r5
            r5 = r32
            r32 = r6
            r6 = r29
            r37 = r7
            r7 = r28
            r38 = r8
            r8 = r0
            r39 = r9
            r9 = r31
            r1.mo1961c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0564
        L_0x0558:
            r34 = r4
            r36 = r5
            r32 = r6
            r37 = r7
            r38 = r8
            r39 = r9
        L_0x0564:
            r22 = r37
            goto L_0x056d
        L_0x0567:
            r38 = r8
            r39 = r9
            r22 = r1
        L_0x056d:
            int r0 = r38.mo2020C()
            r1 = 8
            if (r0 == r1) goto L_0x0579
            r0 = r38
            r9 = r0
            goto L_0x057b
        L_0x0579:
            r9 = r39
        L_0x057b:
            r8 = r22
            r0 = 8
            goto L_0x048f
        L_0x0581:
            r38 = r8
            r39 = r9
            a.f.a.j.e[] r0 = r14.f1384A
            r0 = r0[r47]
            a.f.a.j.e[] r1 = r12.f1384A
            r1 = r1[r47]
            a.f.a.j.e r9 = r1.f1359d
            a.f.a.j.e[] r1 = r15.f1384A
            int r2 = r47 + 1
            r8 = r1[r2]
            a.f.a.j.e[] r1 = r13.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            a.f.a.j.e r7 = r1.f1359d
            if (r9 == 0) goto L_0x05ea
            if (r14 == r15) goto L_0x05b4
            a.f.a.i r1 = r0.f1364i
            a.f.a.i r2 = r9.f1364i
            int r3 = r0.mo2004d()
            r6 = 5
            r10.mo1963e(r1, r2, r3, r6)
            r42 = r7
            r43 = r8
            r24 = r9
            goto L_0x05f0
        L_0x05b4:
            r6 = 5
            if (r7 == 0) goto L_0x05e3
            a.f.a.i r2 = r0.f1364i
            a.f.a.i r3 = r9.f1364i
            int r4 = r0.mo2004d()
            a.f.a.i r1 = r8.f1364i
            a.f.a.i r5 = r7.f1364i
            int r27 = r8.mo2004d()
            r28 = 5
            r29 = r1
            r1 = r45
            r24 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = r29
            r42 = r7
            r7 = r24
            r43 = r8
            r8 = r27
            r24 = r9
            r9 = r28
            r1.mo1961c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05f0
        L_0x05e3:
            r42 = r7
            r43 = r8
            r24 = r9
            goto L_0x05f0
        L_0x05ea:
            r42 = r7
            r43 = r8
            r24 = r9
        L_0x05f0:
            r1 = r42
            if (r1 == 0) goto L_0x0606
            if (r14 == r15) goto L_0x0606
            r2 = r43
            a.f.a.i r3 = r2.f1364i
            a.f.a.i r4 = r1.f1364i
            int r5 = r2.mo2004d()
            int r5 = -r5
            r6 = 5
            r10.mo1963e(r3, r4, r5, r6)
            goto L_0x0608
        L_0x0606:
            r2 = r43
        L_0x0608:
            r31 = r38
        L_0x060a:
            if (r23 != 0) goto L_0x060e
            if (r19 == 0) goto L_0x0683
        L_0x060e:
            if (r14 == 0) goto L_0x0683
            a.f.a.j.e[] r0 = r14.f1384A
            r1 = r0[r47]
            a.f.a.j.e[] r2 = r15.f1384A
            int r3 = r47 + 1
            r2 = r2[r3]
            a.f.a.j.e r3 = r1.f1359d
            if (r3 == 0) goto L_0x0621
            a.f.a.i r3 = r3.f1364i
            goto L_0x0622
        L_0x0621:
            r3 = 0
        L_0x0622:
            r20 = r3
            a.f.a.j.e r3 = r2.f1359d
            if (r3 == 0) goto L_0x062b
            a.f.a.i r3 = r3.f1364i
            goto L_0x062c
        L_0x062b:
            r3 = 0
        L_0x062c:
            if (r13 == r15) goto L_0x0640
            a.f.a.j.e[] r4 = r13.f1384A
            int r5 = r47 + 1
            r4 = r4[r5]
            a.f.a.j.e r5 = r4.f1359d
            if (r5 == 0) goto L_0x063b
            a.f.a.i r5 = r5.f1364i
            goto L_0x063c
        L_0x063b:
            r5 = 0
        L_0x063c:
            r3 = r5
            r24 = r3
            goto L_0x0642
        L_0x0640:
            r24 = r3
        L_0x0642:
            if (r14 != r15) goto L_0x064d
            r1 = r0[r47]
            int r3 = r47 + 1
            r2 = r0[r3]
            r0 = r1
            r9 = r2
            goto L_0x064f
        L_0x064d:
            r0 = r1
            r9 = r2
        L_0x064f:
            if (r20 == 0) goto L_0x0681
            if (r24 == 0) goto L_0x0681
            r26 = 1056964608(0x3f000000, float:0.5)
            int r27 = r0.mo2004d()
            if (r15 != 0) goto L_0x065d
            r1 = r13
            r15 = r1
        L_0x065d:
            a.f.a.j.e[] r1 = r15.f1384A
            int r2 = r47 + 1
            r1 = r1[r2]
            int r28 = r1.mo2004d()
            a.f.a.i r2 = r0.f1364i
            a.f.a.i r7 = r9.f1364i
            r29 = 5
            r1 = r45
            r3 = r20
            r4 = r27
            r5 = r26
            r6 = r24
            r8 = r28
            r32 = r9
            r9 = r29
            r1.mo1961c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0683
        L_0x0681:
            r32 = r9
        L_0x0683:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p019f.p020a.p021j.C0284c.m1518b(a.f.a.j.g, a.f.a.e, int, int, a.f.a.j.d):void");
    }
}
