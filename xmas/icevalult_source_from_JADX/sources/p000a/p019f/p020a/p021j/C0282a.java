package p000a.p019f.p020a.p021j;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p019f.p020a.p021j.C0286e;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.a */
public class C0282a {
    /* renamed from: a */
    public static void m1498a(C0294g layoutWidget) {
        if ((layoutWidget.mo2103R0() & 32) != 32) {
            m1507j(layoutWidget);
            return;
        }
        layoutWidget.f1455D0 = true;
        layoutWidget.f1470x0 = false;
        layoutWidget.f1471y0 = false;
        layoutWidget.f1472z0 = false;
        List<ConstraintWidget> widgets = layoutWidget.f1518k0;
        List<C0295h> list = layoutWidget.f1469w0;
        C0291f.C0293b s = layoutWidget.mo2081s();
        C0291f.C0293b bVar = C0291f.C0293b.WRAP_CONTENT;
        boolean horizontalWrapContent = s == bVar;
        boolean verticalWrapContent = layoutWidget.mo2018B() == bVar;
        boolean hasWrapContent = horizontalWrapContent || verticalWrapContent;
        list.clear();
        Iterator<ConstraintWidget> it = widgets.iterator();
        while (it.hasNext()) {
            C0291f widget = (C0291f) it.next();
            widget.f1434p = null;
            widget.f1417d0 = false;
            widget.mo1994S();
        }
        Iterator<ConstraintWidget> it2 = widgets.iterator();
        while (it2.hasNext()) {
            C0291f widget2 = (C0291f) it2.next();
            if (widget2.f1434p == null && !m1499b(widget2, list, hasWrapContent)) {
                m1507j(layoutWidget);
                layoutWidget.f1455D0 = false;
                return;
            }
        }
        int measuredWidth = 0;
        int measuredHeight = 0;
        for (C0295h group : list) {
            measuredWidth = Math.max(measuredWidth, m1500c(group, 0));
            measuredHeight = Math.max(measuredHeight, m1500c(group, 1));
        }
        if (horizontalWrapContent) {
            layoutWidget.mo2058g0(C0291f.C0293b.FIXED);
            layoutWidget.mo2095y0(measuredWidth);
            layoutWidget.f1470x0 = true;
            layoutWidget.f1471y0 = true;
            layoutWidget.f1452A0 = measuredWidth;
        }
        if (verticalWrapContent) {
            layoutWidget.mo2087u0(C0291f.C0293b.FIXED);
            layoutWidget.mo2050b0(measuredHeight);
            layoutWidget.f1470x0 = true;
            layoutWidget.f1472z0 = true;
            layoutWidget.f1453B0 = measuredHeight;
        }
        m1506i(list, 0, layoutWidget.mo2022D());
        m1506i(list, 1, layoutWidget.mo2079r());
    }

    /* renamed from: b */
    public static boolean m1499b(C0291f widget, List<C0295h> widgetGroups, boolean hasWrapContent) {
        C0295h traverseList = new C0295h(new ArrayList(), true);
        widgetGroups.add(traverseList);
        return m1508k(widget, traverseList, widgetGroups, hasWrapContent);
    }

    /* renamed from: k */
    public static boolean m1508k(C0291f widget, C0295h upperGroup, List<C0295h> widgetGroups, boolean hasWrapContent) {
        C0286e eVar;
        C0291f fVar;
        C0286e eVar2;
        C0291f fVar2;
        if (widget == null) {
            return true;
        }
        widget.f1415c0 = false;
        C0294g layoutWidget = (C0294g) widget.mo2086u();
        C0295h hVar = widget.f1434p;
        if (hVar == null) {
            widget.f1413b0 = true;
            upperGroup.f1473a.add(widget);
            widget.f1434p = upperGroup;
            if (widget.f1437s.f1359d == null && widget.f1439u.f1359d == null && widget.f1438t.f1359d == null && widget.f1440v.f1359d == null && widget.f1441w.f1359d == null && widget.f1444z.f1359d == null) {
                m1503f(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
            }
            if (!(widget.f1438t.f1359d == null || widget.f1440v.f1359d == null)) {
                if (layoutWidget.mo2018B() == C0291f.C0293b.WRAP_CONTENT) {
                }
                if (hasWrapContent) {
                    m1503f(layoutWidget, widget, upperGroup);
                    return false;
                } else if (!(widget.f1438t.f1359d.f1357b == widget.mo2086u() && widget.f1440v.f1359d.f1357b == widget.mo2086u())) {
                    m1503f(layoutWidget, widget, upperGroup);
                }
            }
            if (!(widget.f1437s.f1359d == null || widget.f1439u.f1359d == null)) {
                if (layoutWidget.mo2081s() == C0291f.C0293b.WRAP_CONTENT) {
                }
                if (hasWrapContent) {
                    m1503f(layoutWidget, widget, upperGroup);
                    return false;
                } else if (!(widget.f1437s.f1359d.f1357b == widget.mo2086u() && widget.f1439u.f1359d.f1357b == widget.mo2086u())) {
                    m1503f(layoutWidget, widget, upperGroup);
                }
            }
            C0291f.C0293b s = widget.mo2081s();
            C0291f.C0293b bVar = C0291f.C0293b.MATCH_CONSTRAINT;
            if (((s == bVar) ^ (widget.mo2018B() == bVar)) && widget.f1390G != 0.0f) {
                m1504g(widget);
            } else if (widget.mo2081s() == bVar || widget.mo2018B() == bVar) {
                m1503f(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
            }
            C0286e eVar3 = widget.f1437s.f1359d;
            if (((eVar3 == null && widget.f1439u.f1359d == null) || ((eVar3 != null && eVar3.f1357b == widget.f1387D && widget.f1439u.f1359d == null) || (((eVar2 = widget.f1439u.f1359d) != null && eVar2.f1357b == widget.f1387D && eVar3 == null) || (eVar3 != null && eVar3.f1357b == (fVar2 = widget.f1387D) && eVar2 != null && eVar2.f1357b == fVar2)))) && widget.f1444z.f1359d == null && !(widget instanceof C0296i) && !(widget instanceof C0298j)) {
                upperGroup.f1478f.add(widget);
            }
            C0286e eVar4 = widget.f1438t.f1359d;
            if (((eVar4 == null && widget.f1440v.f1359d == null) || ((eVar4 != null && eVar4.f1357b == widget.f1387D && widget.f1440v.f1359d == null) || (((eVar = widget.f1440v.f1359d) != null && eVar.f1357b == widget.f1387D && eVar4 == null) || (eVar4 != null && eVar4.f1357b == (fVar = widget.f1387D) && eVar != null && eVar.f1357b == fVar)))) && widget.f1444z.f1359d == null && widget.f1441w.f1359d == null && !(widget instanceof C0296i) && !(widget instanceof C0298j)) {
                upperGroup.f1479g.add(widget);
            }
            if (widget instanceof C0298j) {
                m1503f(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
                C0298j hWidget = (C0298j) widget;
                for (int widgetsCount = 0; widgetsCount < hWidget.f1492l0; widgetsCount++) {
                    if (!m1508k(hWidget.f1491k0[widgetsCount], upperGroup, widgetGroups, hasWrapContent)) {
                        return false;
                    }
                }
            }
            for (C0286e anchor : widget.f1384A) {
                C0286e eVar5 = anchor.f1359d;
                if (!(eVar5 == null || eVar5.f1357b == widget.mo2086u())) {
                    if (anchor.f1358c == C0286e.C0290d.CENTER) {
                        m1503f(layoutWidget, widget, upperGroup);
                        if (hasWrapContent) {
                            return false;
                        }
                    } else {
                        m1505h(anchor);
                    }
                    if (!m1508k(anchor.f1359d.f1357b, upperGroup, widgetGroups, hasWrapContent)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar != upperGroup) {
            upperGroup.f1473a.addAll(hVar.f1473a);
            upperGroup.f1478f.addAll(widget.f1434p.f1478f);
            upperGroup.f1479g.addAll(widget.f1434p.f1479g);
            C0295h hVar2 = widget.f1434p;
            if (!hVar2.f1476d) {
                upperGroup.f1476d = false;
            }
            widgetGroups.remove(hVar2);
            for (C0291f auxWidget : widget.f1434p.f1473a) {
                auxWidget.f1434p = upperGroup;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static void m1503f(C0294g layoutWidget, C0291f widget, C0295h group) {
        group.f1476d = false;
        layoutWidget.f1455D0 = false;
        widget.f1413b0 = false;
    }

    /* renamed from: c */
    public static int m1500c(C0295h group, int orientation) {
        int dimension = 0;
        int offset = orientation * 2;
        List<C0291f> b = group.mo2119b(orientation);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C0291f widget = b.get(i);
            C0286e[] eVarArr = widget.f1384A;
            dimension = Math.max(dimension, m1501d(widget, orientation, eVarArr[offset + 1].f1359d == null || !(eVarArr[offset].f1359d == null || eVarArr[offset + 1].f1359d == null), 0));
        }
        group.f1477e[orientation] = dimension;
        return dimension;
    }

    /* renamed from: d */
    public static int m1501d(C0291f widget, int orientation, boolean topLeftFlow, int depth) {
        int endOffset;
        int startOffset;
        int baselinePostDistance;
        int baselinePreDistance;
        int flow;
        int depth2;
        int dimensionPost;
        int postTemp;
        int startOffset2;
        int postTemp2;
        C0291f fVar = widget;
        int i = orientation;
        boolean z = topLeftFlow;
        boolean hasBaseline = false;
        if (!fVar.f1413b0) {
            return 0;
        }
        int dimensionPre = 0;
        int dimensionPost2 = 0;
        if (fVar.f1441w.f1359d != null && i == 1) {
            hasBaseline = true;
        }
        if (z) {
            baselinePreDistance = widget.mo2063j();
            baselinePostDistance = widget.mo2079r() - widget.mo2063j();
            startOffset = i * 2;
            endOffset = startOffset + 1;
        } else {
            baselinePreDistance = widget.mo2079r() - widget.mo2063j();
            baselinePostDistance = widget.mo2063j();
            endOffset = i * 2;
            startOffset = endOffset + 1;
        }
        C0286e[] eVarArr = fVar.f1384A;
        if (eVarArr[endOffset].f1359d == null || eVarArr[startOffset].f1359d != null) {
            flow = 1;
        } else {
            flow = -1;
            int aux = startOffset;
            startOffset = endOffset;
            endOffset = aux;
        }
        if (hasBaseline) {
            depth2 = depth - baselinePreDistance;
        } else {
            depth2 = depth;
        }
        int dimension = (eVarArr[startOffset].mo2004d() * flow) + m1502e(widget, orientation);
        int downDepth = dimension + depth2;
        int postTemp3 = (i == 0 ? widget.mo2022D() : widget.mo2079r()) * flow;
        Iterator<C0303o> it = fVar.f1384A[startOffset].mo2006f().f1506a.iterator();
        while (it.hasNext()) {
            dimensionPre = Math.max(dimensionPre, m1501d(((C0301m) it.next()).f1494c.f1357b, i, z, downDepth));
            it = it;
            dimensionPost2 = dimensionPost2;
        }
        int dimensionPost3 = dimensionPost2;
        Iterator<C0303o> it2 = fVar.f1384A[endOffset].mo2006f().f1506a.iterator();
        int dimensionPost4 = dimensionPost3;
        while (it2.hasNext()) {
            Iterator<C0303o> it3 = it2;
            C0301m anchor = (C0301m) it2.next();
            C0301m mVar = anchor;
            dimensionPost4 = Math.max(dimensionPost4, m1501d(anchor.f1494c.f1357b, i, z, postTemp3 + downDepth));
            it2 = it3;
            endOffset = endOffset;
        }
        int endOffset2 = endOffset;
        if (hasBaseline) {
            dimensionPre -= baselinePreDistance;
            dimensionPost = dimensionPost4 + baselinePostDistance;
        } else {
            dimensionPost = dimensionPost4 + ((i == 0 ? widget.mo2022D() : widget.mo2079r()) * flow);
        }
        int dimensionBaseline = 0;
        if (i == 1) {
            Iterator<C0303o> it4 = fVar.f1441w.mo2006f().f1506a.iterator();
            while (it4.hasNext()) {
                Iterator<C0303o> it5 = it4;
                C0301m anchor2 = (C0301m) it4.next();
                int startOffset3 = startOffset;
                if (flow == 1) {
                    postTemp2 = postTemp3;
                    dimensionBaseline = Math.max(dimensionBaseline, m1501d(anchor2.f1494c.f1357b, i, z, baselinePreDistance + downDepth));
                } else {
                    postTemp2 = postTemp3;
                    dimensionBaseline = Math.max(dimensionBaseline, m1501d(anchor2.f1494c.f1357b, i, z, (baselinePostDistance * flow) + downDepth));
                }
                it4 = it5;
                startOffset = startOffset3;
                postTemp3 = postTemp2;
            }
            startOffset2 = startOffset;
            postTemp = postTemp3;
            if (fVar.f1441w.mo2006f().f1506a.size() > 0 && !hasBaseline) {
                if (flow == 1) {
                    dimensionBaseline += baselinePreDistance;
                } else {
                    dimensionBaseline -= baselinePostDistance;
                }
            }
        } else {
            startOffset2 = startOffset;
            postTemp = postTemp3;
        }
        int startOffset4 = dimension;
        int dimension2 = dimension + Math.max(dimensionPre, Math.max(dimensionPost, dimensionBaseline));
        int leftTop = depth2 + startOffset4;
        int end = leftTop + postTemp;
        int i2 = downDepth;
        if (flow == -1) {
            int aux2 = end;
            end = leftTop;
            leftTop = aux2;
        }
        if (z) {
            C0299k.m1668e(fVar, i, leftTop);
            fVar.mo2047Z(leftTop, end, i);
        } else {
            fVar.f1434p.mo2118a(fVar, i);
            fVar.mo2078q0(leftTop, i);
        }
        if (widget.mo2073o(orientation) == C0291f.C0293b.MATCH_CONSTRAINT && fVar.f1390G != 0.0f) {
            fVar.f1434p.mo2118a(fVar, i);
        }
        C0286e[] eVarArr2 = fVar.f1384A;
        if (eVarArr2[startOffset2].f1359d == null || eVarArr2[endOffset2].f1359d == null) {
        } else {
            C0291f parent = widget.mo2086u();
            C0286e[] eVarArr3 = fVar.f1384A;
            boolean z2 = hasBaseline;
            if (eVarArr3[startOffset2].f1359d.f1357b == parent && eVarArr3[endOffset2].f1359d.f1357b == parent) {
                fVar.f1434p.mo2118a(fVar, i);
            }
        }
        return dimension2;
    }

    /* renamed from: h */
    public static void m1505h(C0286e originAnchor) {
        C0303o originNode = originAnchor.mo2006f();
        C0286e eVar = originAnchor.f1359d;
        if (eVar != null && eVar.f1359d != originAnchor) {
            eVar.mo2006f().mo2148a(originNode);
        }
    }

    /* renamed from: j */
    public static void m1507j(C0294g layoutWidget) {
        layoutWidget.f1469w0.clear();
        layoutWidget.f1469w0.add(0, new C0295h(layoutWidget.f1518k0));
    }

    /* renamed from: i */
    public static void m1506i(List<C0295h> groups, int orientation, int containerLength) {
        int groupsSize = groups.size();
        for (int i = 0; i < groupsSize; i++) {
            for (C0291f widget : groups.get(i).mo2120c(orientation)) {
                if (widget.f1413b0) {
                    m1509l(widget, orientation, containerLength);
                }
            }
        }
    }

    /* renamed from: l */
    public static void m1509l(C0291f widget, int orientation, int containerLength) {
        int offset = orientation * 2;
        C0286e[] eVarArr = widget.f1384A;
        C0286e startAnchor = eVarArr[offset];
        C0286e endAnchor = eVarArr[offset + 1];
        if ((startAnchor.f1359d == null || endAnchor.f1359d == null) ? false : true) {
            C0299k.m1668e(widget, orientation, m1502e(widget, orientation) + startAnchor.mo2004d());
        } else if (widget.f1390G == 0.0f || widget.mo2073o(orientation) != C0291f.C0293b.MATCH_CONSTRAINT) {
            int end = containerLength - widget.mo2088v(orientation);
            int start = end - widget.mo2083t(orientation);
            widget.mo2047Z(start, end, orientation);
            C0299k.m1668e(widget, orientation, start);
        } else {
            int length = m1504g(widget);
            int start2 = (int) widget.f1384A[offset].mo2006f().f1498g;
            endAnchor.mo2006f().f1497f = startAnchor.mo2006f();
            endAnchor.mo2006f().f1498g = (float) length;
            endAnchor.mo2006f().f1507b = 1;
            widget.mo2047Z(start2, start2 + length, orientation);
        }
    }

    /* renamed from: e */
    public static int m1502e(C0291f widget, int orientation) {
        C0291f fVar;
        C0286e eVar;
        int offset = orientation * 2;
        C0286e[] eVarArr = widget.f1384A;
        C0286e startAnchor = eVarArr[offset];
        C0286e endAnchor = eVarArr[offset + 1];
        C0286e eVar2 = startAnchor.f1359d;
        if (eVar2 == null || eVar2.f1357b != (fVar = widget.f1387D) || (eVar = endAnchor.f1359d) == null || eVar.f1357b != fVar) {
            return 0;
        }
        return (int) (((float) (((fVar.mo2083t(orientation) - startAnchor.mo2004d()) - endAnchor.mo2004d()) - widget.mo2083t(orientation))) * (orientation == 0 ? widget.f1405V : widget.f1406W));
    }

    /* renamed from: g */
    public static int m1504g(C0291f widget) {
        int length;
        int length2 = -1;
        C0291f.C0293b s = widget.mo2081s();
        C0291f.C0293b bVar = C0291f.C0293b.MATCH_CONSTRAINT;
        if (s == bVar) {
            if (widget.f1391H == 0) {
                length2 = (int) (((float) widget.mo2079r()) * widget.f1390G);
            } else {
                length2 = (int) (((float) widget.mo2079r()) / widget.f1390G);
            }
            widget.mo2095y0(length2);
        } else if (widget.mo2018B() == bVar) {
            if (widget.f1391H == 1) {
                length = (int) (((float) widget.mo2022D()) * widget.f1390G);
            } else {
                length = (int) (((float) widget.mo2022D()) / widget.f1390G);
            }
            widget.mo2050b0(length2);
        }
        return length2;
    }
}
