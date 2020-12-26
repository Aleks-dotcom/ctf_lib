package p000a.p019f.p020a.p021j;

import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0277f;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.k */
public class C0299k {

    /* renamed from: a */
    public static boolean[] f1493a = new boolean[3];

    /* renamed from: c */
    public static void m1666c(C0294g container, C0275e system, C0291f widget) {
        C0291f.C0293b bVar = container.f1386C[0];
        C0291f.C0293b bVar2 = C0291f.C0293b.WRAP_CONTENT;
        if (bVar != bVar2 && widget.f1386C[0] == C0291f.C0293b.MATCH_PARENT) {
            int left = widget.f1437s.f1360e;
            int right = container.mo2022D() - widget.f1439u.f1360e;
            C0286e eVar = widget.f1437s;
            eVar.f1364i = system.mo1976r(eVar);
            C0286e eVar2 = widget.f1439u;
            eVar2.f1364i = system.mo1976r(eVar2);
            system.mo1964f(widget.f1437s.f1364i, left);
            system.mo1964f(widget.f1439u.f1364i, right);
            widget.f1410a = 2;
            widget.mo2056f0(left, right);
        }
        if (container.f1386C[1] != bVar2 && widget.f1386C[1] == C0291f.C0293b.MATCH_PARENT) {
            int top = widget.f1438t.f1360e;
            int bottom = container.mo2079r() - widget.f1440v.f1360e;
            C0286e eVar3 = widget.f1438t;
            eVar3.f1364i = system.mo1976r(eVar3);
            C0286e eVar4 = widget.f1440v;
            eVar4.f1364i = system.mo1976r(eVar4);
            system.mo1964f(widget.f1438t.f1364i, top);
            system.mo1964f(widget.f1440v.f1364i, bottom);
            if (widget.f1400Q > 0 || widget.mo2020C() == 8) {
                C0286e eVar5 = widget.f1441w;
                eVar5.f1364i = system.mo1976r(eVar5);
                system.mo1964f(widget.f1441w.f1364i, widget.f1400Q + top);
            }
            widget.f1412b = 2;
            widget.mo2084t0(top, bottom);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003a A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1667d(p000a.p019f.p020a.p021j.C0291f r6, int r7) {
        /*
            a.f.a.j.f$b[] r0 = r6.f1386C
            r1 = r0[r7]
            a.f.a.j.f$b r2 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r6.f1390G
            r4 = 0
            r5 = 1
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x001c
            if (r7 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            r0 = r0[r5]
            if (r0 != r2) goto L_0x001b
            return r3
        L_0x001b:
            return r3
        L_0x001c:
            if (r7 != 0) goto L_0x002c
            int r0 = r6.f1418e
            if (r0 == 0) goto L_0x0023
            return r3
        L_0x0023:
            int r0 = r6.f1424h
            if (r0 != 0) goto L_0x002b
            int r0 = r6.f1426i
            if (r0 == 0) goto L_0x003a
        L_0x002b:
            return r3
        L_0x002c:
            int r0 = r6.f1420f
            if (r0 == 0) goto L_0x0031
            return r3
        L_0x0031:
            int r0 = r6.f1429k
            if (r0 != 0) goto L_0x003b
            int r0 = r6.f1430l
            if (r0 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            return r5
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p019f.p020a.p021j.C0299k.m1667d(a.f.a.j.f, int):boolean");
    }

    /* renamed from: a */
    public static void m1664a(int optimisationLevel, C0291f widget) {
        C0291f fVar = widget;
        widget.mo2031H0();
        C0301m leftNode = fVar.f1437s.mo2006f();
        C0301m topNode = fVar.f1438t.mo2006f();
        C0301m rightNode = fVar.f1439u.mo2006f();
        C0301m bottomNode = fVar.f1440v.mo2006f();
        boolean optimiseDimensions = (optimisationLevel & 8) == 8;
        C0291f.C0293b bVar = fVar.f1386C[0];
        C0291f.C0293b bVar2 = C0291f.C0293b.MATCH_CONSTRAINT;
        boolean isOptimizableHorizontalMatch = bVar == bVar2 && m1667d(fVar, 0);
        if (!(leftNode.f1499h == 4 || rightNode.f1499h == 4)) {
            if (fVar.f1386C[0] == C0291f.C0293b.FIXED || (isOptimizableHorizontalMatch && widget.mo2020C() == 8)) {
                C0286e eVar = fVar.f1437s.f1359d;
                if (eVar == null && fVar.f1439u.f1359d == null) {
                    leftNode.mo2143p(1);
                    rightNode.mo2143p(1);
                    if (optimiseDimensions) {
                        rightNode.mo2137j(leftNode, 1, widget.mo2092x());
                    } else {
                        rightNode.mo2136i(leftNode, widget.mo2022D());
                    }
                } else if (eVar != null && fVar.f1439u.f1359d == null) {
                    leftNode.mo2143p(1);
                    rightNode.mo2143p(1);
                    if (optimiseDimensions) {
                        rightNode.mo2137j(leftNode, 1, widget.mo2092x());
                    } else {
                        rightNode.mo2136i(leftNode, widget.mo2022D());
                    }
                } else if (eVar == null && fVar.f1439u.f1359d != null) {
                    leftNode.mo2143p(1);
                    rightNode.mo2143p(1);
                    leftNode.mo2136i(rightNode, -widget.mo2022D());
                    if (optimiseDimensions) {
                        leftNode.mo2137j(rightNode, -1, widget.mo2092x());
                    } else {
                        leftNode.mo2136i(rightNode, -widget.mo2022D());
                    }
                } else if (!(eVar == null || fVar.f1439u.f1359d == null)) {
                    leftNode.mo2143p(2);
                    rightNode.mo2143p(2);
                    if (optimiseDimensions) {
                        widget.mo2092x().mo2148a(leftNode);
                        widget.mo2092x().mo2148a(rightNode);
                        leftNode.mo2142o(rightNode, -1, widget.mo2092x());
                        rightNode.mo2142o(leftNode, 1, widget.mo2092x());
                    } else {
                        leftNode.mo2141n(rightNode, (float) (-widget.mo2022D()));
                        rightNode.mo2141n(leftNode, (float) widget.mo2022D());
                    }
                }
            } else if (isOptimizableHorizontalMatch) {
                int width = widget.mo2022D();
                leftNode.mo2143p(1);
                rightNode.mo2143p(1);
                C0286e eVar2 = fVar.f1437s.f1359d;
                if (eVar2 == null && fVar.f1439u.f1359d == null) {
                    if (optimiseDimensions) {
                        rightNode.mo2137j(leftNode, 1, widget.mo2092x());
                    } else {
                        rightNode.mo2136i(leftNode, width);
                    }
                } else if (eVar2 == null || fVar.f1439u.f1359d != null) {
                    if (eVar2 != null || fVar.f1439u.f1359d == null) {
                        if (!(eVar2 == null || fVar.f1439u.f1359d == null)) {
                            if (optimiseDimensions) {
                                widget.mo2092x().mo2148a(leftNode);
                                widget.mo2092x().mo2148a(rightNode);
                            }
                            if (fVar.f1390G == 0.0f) {
                                leftNode.mo2143p(3);
                                rightNode.mo2143p(3);
                                leftNode.mo2141n(rightNode, 0.0f);
                                rightNode.mo2141n(leftNode, 0.0f);
                            } else {
                                leftNode.mo2143p(2);
                                rightNode.mo2143p(2);
                                leftNode.mo2141n(rightNode, (float) (-width));
                                rightNode.mo2141n(leftNode, (float) width);
                                fVar.mo2095y0(width);
                            }
                        }
                    } else if (optimiseDimensions) {
                        leftNode.mo2137j(rightNode, -1, widget.mo2092x());
                    } else {
                        leftNode.mo2136i(rightNode, -width);
                    }
                } else if (optimiseDimensions) {
                    rightNode.mo2137j(leftNode, 1, widget.mo2092x());
                } else {
                    rightNode.mo2136i(leftNode, width);
                }
            }
        }
        boolean isOptimizableVerticalMatch = fVar.f1386C[1] == bVar2 && m1667d(fVar, 1);
        if (topNode.f1499h != 4 && bottomNode.f1499h != 4) {
            if (fVar.f1386C[1] == C0291f.C0293b.FIXED || (isOptimizableVerticalMatch && widget.mo2020C() == 8)) {
                C0286e eVar3 = fVar.f1438t.f1359d;
                if (eVar3 == null && fVar.f1440v.f1359d == null) {
                    topNode.mo2143p(1);
                    bottomNode.mo2143p(1);
                    if (optimiseDimensions) {
                        bottomNode.mo2137j(topNode, 1, widget.mo2090w());
                    } else {
                        bottomNode.mo2136i(topNode, widget.mo2079r());
                    }
                    C0286e eVar4 = fVar.f1441w;
                    if (eVar4.f1359d != null) {
                        eVar4.mo2006f().mo2143p(1);
                        topNode.mo2135h(1, fVar.f1441w.mo2006f(), -fVar.f1400Q);
                    }
                } else if (eVar3 != null && fVar.f1440v.f1359d == null) {
                    topNode.mo2143p(1);
                    bottomNode.mo2143p(1);
                    if (optimiseDimensions) {
                        bottomNode.mo2137j(topNode, 1, widget.mo2090w());
                    } else {
                        bottomNode.mo2136i(topNode, widget.mo2079r());
                    }
                    if (fVar.f1400Q > 0) {
                        fVar.f1441w.mo2006f().mo2135h(1, topNode, fVar.f1400Q);
                    }
                } else if (eVar3 == null && fVar.f1440v.f1359d != null) {
                    topNode.mo2143p(1);
                    bottomNode.mo2143p(1);
                    if (optimiseDimensions) {
                        topNode.mo2137j(bottomNode, -1, widget.mo2090w());
                    } else {
                        topNode.mo2136i(bottomNode, -widget.mo2079r());
                    }
                    if (fVar.f1400Q > 0) {
                        fVar.f1441w.mo2006f().mo2135h(1, topNode, fVar.f1400Q);
                    }
                } else if (eVar3 != null && fVar.f1440v.f1359d != null) {
                    topNode.mo2143p(2);
                    bottomNode.mo2143p(2);
                    if (optimiseDimensions) {
                        topNode.mo2142o(bottomNode, -1, widget.mo2090w());
                        bottomNode.mo2142o(topNode, 1, widget.mo2090w());
                        widget.mo2090w().mo2148a(topNode);
                        widget.mo2092x().mo2148a(bottomNode);
                    } else {
                        topNode.mo2141n(bottomNode, (float) (-widget.mo2079r()));
                        bottomNode.mo2141n(topNode, (float) widget.mo2079r());
                    }
                    if (fVar.f1400Q > 0) {
                        fVar.f1441w.mo2006f().mo2135h(1, topNode, fVar.f1400Q);
                    }
                }
            } else if (isOptimizableVerticalMatch) {
                int height = widget.mo2079r();
                topNode.mo2143p(1);
                bottomNode.mo2143p(1);
                C0286e eVar5 = fVar.f1438t.f1359d;
                if (eVar5 == null && fVar.f1440v.f1359d == null) {
                    if (optimiseDimensions) {
                        bottomNode.mo2137j(topNode, 1, widget.mo2090w());
                    } else {
                        bottomNode.mo2136i(topNode, height);
                    }
                } else if (eVar5 == null || fVar.f1440v.f1359d != null) {
                    if (eVar5 != null || fVar.f1440v.f1359d == null) {
                        if (eVar5 != null && fVar.f1440v.f1359d != null) {
                            if (optimiseDimensions) {
                                widget.mo2090w().mo2148a(topNode);
                                widget.mo2092x().mo2148a(bottomNode);
                            }
                            if (fVar.f1390G == 0.0f) {
                                topNode.mo2143p(3);
                                bottomNode.mo2143p(3);
                                topNode.mo2141n(bottomNode, 0.0f);
                                bottomNode.mo2141n(topNode, 0.0f);
                                return;
                            }
                            topNode.mo2143p(2);
                            bottomNode.mo2143p(2);
                            topNode.mo2141n(bottomNode, (float) (-height));
                            bottomNode.mo2141n(topNode, (float) height);
                            fVar.mo2050b0(height);
                            if (fVar.f1400Q > 0) {
                                fVar.f1441w.mo2006f().mo2135h(1, topNode, fVar.f1400Q);
                            }
                        }
                    } else if (optimiseDimensions) {
                        topNode.mo2137j(bottomNode, -1, widget.mo2090w());
                    } else {
                        topNode.mo2136i(bottomNode, -height);
                    }
                } else if (optimiseDimensions) {
                    bottomNode.mo2137j(topNode, 1, widget.mo2090w());
                } else {
                    bottomNode.mo2136i(topNode, height);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m1665b(C0294g container, C0275e system, int orientation, int offset, C0285d chainHead) {
        boolean isChainSpread;
        boolean isChainPacked;
        boolean isChainSpreadInside;
        float totalSize;
        float distance;
        boolean isChainSpread2;
        boolean isChainSpreadInside2;
        float distance2;
        float extraMargin;
        C0301m firstNode;
        float dimension;
        float distance3;
        int numMatchConstraints;
        C0301m firstNode2;
        C0301m lastNode;
        float dimension2;
        boolean isChainSpread3;
        boolean isChainPacked2;
        float lastOffset;
        float totalSize2;
        C0291f last;
        float dimension3;
        C0291f next;
        C0275e eVar = system;
        int i = orientation;
        C0285d dVar = chainHead;
        C0291f first = dVar.f1339a;
        C0291f last2 = dVar.f1341c;
        C0291f firstVisibleWidget = dVar.f1340b;
        C0291f lastVisibleWidget = dVar.f1342d;
        C0291f head = dVar.f1343e;
        float totalWeights = dVar.f1349k;
        C0291f firstMatchConstraintsWidget = dVar.f1344f;
        C0291f previousMatchConstraintsWidget = dVar.f1345g;
        C0291f widget = first;
        boolean isWrapContent = container.f1386C[i] == C0291f.C0293b.WRAP_CONTENT;
        if (i == 0) {
            int i2 = head.f1419e0;
            isChainSpread = i2 == 0;
            boolean z = isWrapContent;
            boolean isChainSpreadInside3 = i2 == 1;
            C0291f fVar = head;
            isChainPacked = i2 == 2;
            isChainSpreadInside = isChainSpreadInside3;
            C0291f fVar2 = fVar;
        } else {
            int i3 = head.f1421f0;
            isChainSpread = i3 == 0;
            boolean isChainSpreadInside4 = i3 == 1;
            C0291f fVar3 = head;
            isChainPacked = i3 == 2;
            isChainSpreadInside = isChainSpreadInside4;
        }
        float totalMargins = 0.0f;
        float totalSize3 = 0.0f;
        C0291f widget2 = widget;
        C0291f widget3 = firstMatchConstraintsWidget;
        int numMatchConstraints2 = 0;
        boolean done = false;
        C0291f fVar4 = previousMatchConstraintsWidget;
        int numVisibleWidgets = 0;
        while (!done) {
            boolean done2 = done;
            if (widget2.mo2020C() != 8) {
                numVisibleWidgets++;
                if (i == 0) {
                    totalSize += (float) widget2.mo2022D();
                } else {
                    totalSize += (float) widget2.mo2079r();
                }
                if (widget2 != firstVisibleWidget) {
                    totalSize += (float) widget2.f1384A[offset].mo2004d();
                }
                if (widget2 != lastVisibleWidget) {
                    totalSize += (float) widget2.f1384A[offset + 1].mo2004d();
                }
                totalMargins = totalMargins + ((float) widget2.f1384A[offset].mo2004d()) + ((float) widget2.f1384A[offset + 1].mo2004d());
            }
            C0286e begin = widget2.f1384A[offset];
            float totalSize4 = totalSize;
            if (widget2.mo2020C() != 8 && widget2.f1386C[i] == C0291f.C0293b.MATCH_CONSTRAINT) {
                numMatchConstraints2++;
                if (i == 0) {
                    if (!(widget2.f1418e == 0 && widget2.f1424h == 0 && widget2.f1426i == 0)) {
                        return false;
                    }
                } else if (!(widget2.f1420f == 0 && widget2.f1429k == 0 && widget2.f1430l == 0)) {
                    return false;
                }
                if (widget2.f1390G != 0.0f) {
                    return false;
                }
            }
            C0286e nextAnchor = widget2.f1384A[offset + 1].f1359d;
            if (nextAnchor != null) {
                C0291f next2 = nextAnchor.f1357b;
                C0286e eVar2 = nextAnchor;
                C0286e[] eVarArr = next2.f1384A;
                C0286e eVar3 = begin;
                if (eVarArr[offset].f1359d == null || eVarArr[offset].f1359d.f1357b != widget2) {
                    next = null;
                } else {
                    next = next2;
                }
            } else {
                C0286e eVar4 = begin;
                next = null;
            }
            if (next != null) {
                widget2 = next;
                done = done2;
            } else {
                done = true;
            }
            C0294g gVar = container;
            totalSize3 = totalSize4;
        }
        boolean z2 = done;
        C0301m firstNode3 = first.f1384A[offset].mo2006f();
        C0301m lastNode2 = last2.f1384A[offset + 1].mo2006f();
        C0301m mVar = firstNode3.f1495d;
        if (mVar != null) {
            float totalWeights2 = totalWeights;
            C0301m mVar2 = lastNode2.f1495d;
            if (mVar2 == null) {
                boolean z3 = isChainSpreadInside;
                C0291f fVar5 = lastVisibleWidget;
                boolean z4 = isChainPacked;
                boolean z5 = isChainSpread;
                float f = totalSize;
                int i4 = numMatchConstraints2;
                C0301m mVar3 = lastNode2;
                C0275e eVar5 = system;
                C0291f fVar6 = last2;
                C0301m lastNode3 = firstNode3;
            } else {
                C0291f last3 = last2;
                if (mVar.f1507b != 1) {
                    boolean z6 = isChainSpreadInside;
                    C0291f fVar7 = lastVisibleWidget;
                    boolean z7 = isChainPacked;
                    boolean z8 = isChainSpread;
                    int i5 = numMatchConstraints2;
                    C0301m mVar4 = lastNode2;
                    C0291f fVar8 = last3;
                    float f2 = totalSize;
                    C0301m lastNode4 = firstNode3;
                    C0275e eVar6 = system;
                } else if (mVar2.f1507b != 1) {
                    boolean z9 = isChainSpreadInside;
                    C0291f fVar9 = lastVisibleWidget;
                    boolean z10 = isChainPacked;
                    boolean z11 = isChainSpread;
                    int i6 = numMatchConstraints2;
                    C0301m mVar5 = lastNode2;
                    C0291f fVar10 = last3;
                    float f3 = totalSize;
                    C0301m lastNode5 = firstNode3;
                    C0275e eVar7 = system;
                } else if (numMatchConstraints2 > 0 && numMatchConstraints2 != numVisibleWidgets) {
                    return false;
                } else {
                    float extraMargin2 = 0.0f;
                    if (isChainPacked || isChainSpread || isChainSpreadInside) {
                        if (firstVisibleWidget != null) {
                            extraMargin2 = (float) firstVisibleWidget.f1384A[offset].mo2004d();
                        }
                        if (lastVisibleWidget != null) {
                            extraMargin2 += (float) lastVisibleWidget.f1384A[offset + 1].mo2004d();
                        }
                    }
                    float firstOffset = firstNode3.f1495d.f1498g;
                    float lastOffset2 = lastNode2.f1495d.f1498g;
                    if (firstOffset < lastOffset2) {
                        distance = (lastOffset2 - firstOffset) - totalSize;
                    } else {
                        distance = (firstOffset - lastOffset2) - totalSize;
                    }
                    if (numMatchConstraints2 <= 0 || numMatchConstraints2 != numVisibleWidgets) {
                        boolean isChainSpreadInside5 = isChainSpreadInside;
                        C0291f fVar11 = lastVisibleWidget;
                        boolean isChainPacked3 = isChainPacked;
                        boolean isChainSpread4 = isChainSpread;
                        float f4 = lastOffset2;
                        C0291f last4 = last3;
                        float f5 = totalSize;
                        C0275e eVar8 = system;
                        if (distance < 0.0f) {
                            isChainSpread2 = false;
                            isChainSpreadInside2 = false;
                            isChainPacked3 = true;
                        } else {
                            isChainSpreadInside2 = isChainSpreadInside5;
                            isChainSpread2 = isChainSpread4;
                        }
                        if (isChainPacked3) {
                            float distance4 = (first.mo2065k(i) * (distance - extraMargin2)) + firstOffset;
                            C0291f widget4 = first;
                            while (widget4 != null) {
                                C0277f fVar12 = C0275e.f1274q;
                                if (fVar12 != null) {
                                    numMatchConstraints = numMatchConstraints2;
                                    fVar12.f1316z--;
                                    fVar12.f1308r++;
                                    fVar12.f1314x++;
                                } else {
                                    numMatchConstraints = numMatchConstraints2;
                                }
                                C0291f next3 = widget4.f1427i0[i];
                                if (next3 != null || widget4 == last4) {
                                    if (i == 0) {
                                        dimension2 = (float) widget4.mo2022D();
                                    } else {
                                        dimension2 = (float) widget4.mo2079r();
                                    }
                                    float distance5 = distance4 + ((float) widget4.f1384A[offset].mo2004d());
                                    lastNode = lastNode2;
                                    widget4.f1384A[offset].mo2006f().mo2139l(firstNode3.f1497f, distance5);
                                    firstNode2 = firstNode3;
                                    widget4.f1384A[offset + 1].mo2006f().mo2139l(firstNode3.f1497f, distance5 + dimension2);
                                    widget4.f1384A[offset].mo2006f().mo2134g(eVar8);
                                    widget4.f1384A[offset + 1].mo2006f().mo2134g(eVar8);
                                    distance4 = distance5 + dimension2 + ((float) widget4.f1384A[offset + 1].mo2004d());
                                } else {
                                    firstNode2 = firstNode3;
                                    lastNode = lastNode2;
                                }
                                widget4 = next3;
                                numMatchConstraints2 = numMatchConstraints;
                                lastNode2 = lastNode;
                                firstNode3 = firstNode2;
                            }
                            int i7 = numMatchConstraints2;
                            C0301m mVar6 = lastNode2;
                            C0301m lastNode6 = firstNode3;
                            float f6 = extraMargin2;
                            return true;
                        }
                        C0301m firstNode4 = firstNode3;
                        int i8 = numMatchConstraints2;
                        C0301m mVar7 = lastNode2;
                        if (isChainSpread2 || isChainSpreadInside2) {
                            if (isChainSpread2) {
                                distance -= extraMargin2;
                            } else if (isChainSpreadInside2) {
                                distance -= extraMargin2;
                            }
                            C0291f widget5 = first;
                            float gap = distance / ((float) (numVisibleWidgets + 1));
                            if (isChainSpreadInside2) {
                                if (numVisibleWidgets > 1) {
                                    gap = distance / ((float) (numVisibleWidgets - 1));
                                } else {
                                    gap = distance / 2.0f;
                                }
                            }
                            float distance6 = firstOffset;
                            if (first.mo2020C() != 8) {
                                distance6 += gap;
                            }
                            if (isChainSpreadInside2 && numVisibleWidgets > 1) {
                                distance6 = firstOffset + ((float) firstVisibleWidget.f1384A[offset].mo2004d());
                            }
                            if (!isChainSpread2 || firstVisibleWidget == null) {
                                distance2 = distance6;
                            } else {
                                distance2 = distance6 + ((float) firstVisibleWidget.f1384A[offset].mo2004d());
                            }
                            while (widget5 != null) {
                                C0277f fVar13 = C0275e.f1274q;
                                if (fVar13 != null) {
                                    fVar13.f1316z--;
                                    fVar13.f1308r++;
                                    fVar13.f1314x++;
                                }
                                C0291f next4 = widget5.f1427i0[i];
                                if (next4 != null || widget5 == last4) {
                                    if (i == 0) {
                                        dimension = (float) widget5.mo2022D();
                                    } else {
                                        dimension = (float) widget5.mo2079r();
                                    }
                                    if (widget5 != firstVisibleWidget) {
                                        distance3 = distance2 + ((float) widget5.f1384A[offset].mo2004d());
                                    } else {
                                        distance3 = distance2;
                                    }
                                    firstNode = firstNode4;
                                    extraMargin = extraMargin2;
                                    widget5.f1384A[offset].mo2006f().mo2139l(firstNode.f1497f, distance3);
                                    widget5.f1384A[offset + 1].mo2006f().mo2139l(firstNode.f1497f, distance3 + dimension);
                                    widget5.f1384A[offset].mo2006f().mo2134g(eVar8);
                                    widget5.f1384A[offset + 1].mo2006f().mo2134g(eVar8);
                                    distance2 = distance3 + ((float) widget5.f1384A[offset + 1].mo2004d()) + dimension;
                                    if (next4 != null) {
                                        if (next4.mo2020C() != 8) {
                                            distance2 += gap;
                                        }
                                    }
                                } else {
                                    firstNode = firstNode4;
                                    extraMargin = extraMargin2;
                                }
                                widget5 = next4;
                                i = orientation;
                                extraMargin2 = extraMargin;
                                firstNode4 = firstNode;
                            }
                            float f7 = extraMargin2;
                            C0291f fVar14 = widget5;
                            return true;
                        }
                        C0301m mVar8 = firstNode4;
                        float f8 = extraMargin2;
                        return true;
                    }
                    if (widget2.mo2086u() != null) {
                        boolean z12 = isChainSpreadInside;
                        C0291f fVar15 = lastVisibleWidget;
                        if (widget2.mo2086u().f1386C[i] == C0291f.C0293b.WRAP_CONTENT) {
                            return false;
                        }
                    } else {
                        C0291f fVar16 = lastVisibleWidget;
                    }
                    float distance7 = (distance + totalSize) - totalMargins;
                    C0291f widget6 = first;
                    float position = firstOffset;
                    while (widget6 != null) {
                        C0277f fVar17 = C0275e.f1274q;
                        if (fVar17 != null) {
                            isChainPacked2 = isChainPacked;
                            isChainSpread3 = isChainSpread;
                            fVar17.f1316z--;
                            fVar17.f1308r++;
                            fVar17.f1314x++;
                        } else {
                            isChainPacked2 = isChainPacked;
                            isChainSpread3 = isChainSpread;
                        }
                        C0291f next5 = widget6.f1427i0[i];
                        if (next5 == null) {
                            last = last3;
                            if (widget6 != last) {
                                totalSize2 = totalSize;
                                lastOffset = lastOffset2;
                                C0275e eVar9 = system;
                                widget6 = next5;
                                totalSize = totalSize2;
                                isChainSpread = isChainSpread3;
                                lastOffset2 = lastOffset;
                                last3 = last;
                                isChainPacked = isChainPacked2;
                            }
                        } else {
                            last = last3;
                        }
                        float dimension4 = distance7 / ((float) numMatchConstraints2);
                        if (totalWeights2 > 0.0f) {
                            float[] fArr = widget6.f1423g0;
                            if (fArr[i] == -1.0f) {
                                dimension4 = 0.0f;
                            } else {
                                dimension4 = (fArr[i] * distance7) / totalWeights2;
                            }
                        }
                        float dimension5 = dimension4;
                        if (widget6.mo2020C() == 8) {
                            dimension3 = 0.0f;
                        } else {
                            dimension3 = dimension5;
                        }
                        float position2 = position + ((float) widget6.f1384A[offset].mo2004d());
                        totalSize2 = totalSize;
                        widget6.f1384A[offset].mo2006f().mo2139l(firstNode3.f1497f, position2);
                        lastOffset = lastOffset2;
                        widget6.f1384A[offset + 1].mo2006f().mo2139l(firstNode3.f1497f, position2 + dimension3);
                        C0275e eVar10 = system;
                        widget6.f1384A[offset].mo2006f().mo2134g(eVar10);
                        widget6.f1384A[offset + 1].mo2006f().mo2134g(eVar10);
                        position = position2 + dimension3 + ((float) widget6.f1384A[offset + 1].mo2004d());
                        widget6 = next5;
                        totalSize = totalSize2;
                        isChainSpread = isChainSpread3;
                        lastOffset2 = lastOffset;
                        last3 = last;
                        isChainPacked = isChainPacked2;
                    }
                    return true;
                }
                return false;
            }
        } else {
            C0291f fVar18 = lastVisibleWidget;
            boolean z13 = isChainPacked;
            boolean z14 = isChainSpread;
            float f9 = totalSize;
            float f10 = totalWeights;
            int i9 = numMatchConstraints2;
            C0301m mVar9 = lastNode2;
            C0275e eVar11 = system;
            C0291f fVar19 = last2;
            C0301m lastNode7 = firstNode3;
        }
        return false;
    }

    /* renamed from: e */
    public static void m1668e(C0291f widget, int orientation, int resolvedOffset) {
        int startOffset = orientation * 2;
        int endOffset = startOffset + 1;
        widget.f1384A[startOffset].mo2006f().f1497f = widget.mo2086u().f1437s.mo2006f();
        widget.f1384A[startOffset].mo2006f().f1498g = (float) resolvedOffset;
        widget.f1384A[startOffset].mo2006f().f1507b = 1;
        widget.f1384A[endOffset].mo2006f().f1497f = widget.f1384A[startOffset].mo2006f();
        widget.f1384A[endOffset].mo2006f().f1498g = (float) widget.mo2083t(orientation);
        widget.f1384A[endOffset].mo2006f().f1507b = 1;
    }
}
