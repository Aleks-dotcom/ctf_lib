package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000a.p019f.p020a.p021j.C0286e;

/* renamed from: a.f.a.j.h */
public class C0295h {

    /* renamed from: a */
    public List<C0291f> f1473a;

    /* renamed from: b */
    public int f1474b = -1;

    /* renamed from: c */
    public int f1475c = -1;

    /* renamed from: d */
    public boolean f1476d = false;

    /* renamed from: e */
    public final int[] f1477e = {-1, -1};

    /* renamed from: f */
    public List<C0291f> f1478f = new ArrayList();

    /* renamed from: g */
    public List<C0291f> f1479g = new ArrayList();

    /* renamed from: h */
    public HashSet<C0291f> f1480h = new HashSet<>();

    /* renamed from: i */
    public HashSet<C0291f> f1481i = new HashSet<>();

    /* renamed from: j */
    public List<C0291f> f1482j = new ArrayList();

    /* renamed from: k */
    public List<C0291f> f1483k = new ArrayList();

    public C0295h(List<C0291f> widgets) {
        this.f1473a = widgets;
    }

    public C0295h(List<C0291f> widgets, boolean skipSolver) {
        this.f1473a = widgets;
        this.f1476d = skipSolver;
    }

    /* renamed from: b */
    public List<C0291f> mo2119b(int orientation) {
        if (orientation == 0) {
            return this.f1478f;
        }
        if (orientation == 1) {
            return this.f1479g;
        }
        return null;
    }

    /* renamed from: c */
    public Set<C0291f> mo2120c(int orientation) {
        if (orientation == 0) {
            return this.f1480h;
        }
        if (orientation == 1) {
            return this.f1481i;
        }
        return null;
    }

    /* renamed from: a */
    public void mo2118a(C0291f widget, int orientation) {
        if (orientation == 0) {
            this.f1480h.add(widget);
        } else if (orientation == 1) {
            this.f1481i.add(widget);
        }
    }

    /* renamed from: d */
    public List<C0291f> mo2121d() {
        if (!this.f1482j.isEmpty()) {
            return this.f1482j;
        }
        int size = this.f1473a.size();
        for (int i = 0; i < size; i++) {
            C0291f widget = this.f1473a.get(i);
            if (!widget.f1413b0) {
                mo2122e((ArrayList) this.f1482j, widget);
            }
        }
        this.f1483k.clear();
        this.f1483k.addAll(this.f1473a);
        this.f1483k.removeAll(this.f1482j);
        return this.f1482j;
    }

    /* renamed from: e */
    public final void mo2122e(ArrayList<C0291f> widgetsToSolve, C0291f widget) {
        if (!widget.f1417d0) {
            widgetsToSolve.add(widget);
            widget.f1417d0 = true;
            if (!widget.mo2035L()) {
                if (widget instanceof C0298j) {
                    C0298j helper = (C0298j) widget;
                    int widgetCount = helper.f1492l0;
                    for (int i = 0; i < widgetCount; i++) {
                        mo2122e(widgetsToSolve, helper.f1491k0[i]);
                    }
                }
                for (C0286e eVar : widget.f1384A) {
                    C0286e targetAnchor = eVar.f1359d;
                    if (targetAnchor != null) {
                        C0291f targetWidget = targetAnchor.f1357b;
                        if (!(targetAnchor == null || targetWidget == widget.mo2086u())) {
                            mo2122e(widgetsToSolve, targetWidget);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo2124g() {
        int size = this.f1483k.size();
        for (int i = 0; i < size; i++) {
            mo2123f(this.f1483k.get(i));
        }
    }

    /* renamed from: f */
    public final void mo2123f(C0291f widget) {
        C0286e targetAnchor;
        int end;
        C0286e targetAnchor2;
        int end2;
        int end3 = 0;
        if (widget.f1413b0 && !widget.mo2035L()) {
            C0286e eVar = widget.f1439u;
            boolean bottomSide = false;
            boolean rightSide = eVar.f1359d != null;
            if (rightSide) {
                targetAnchor = eVar.f1359d;
            } else {
                targetAnchor = widget.f1437s.f1359d;
            }
            if (targetAnchor != null) {
                C0291f fVar = targetAnchor.f1357b;
                if (!fVar.f1415c0) {
                    mo2123f(fVar);
                }
                C0286e.C0290d dVar = targetAnchor.f1358c;
                if (dVar == C0286e.C0290d.RIGHT) {
                    C0291f fVar2 = targetAnchor.f1357b;
                    end3 = fVar2.f1392I + fVar2.mo2022D();
                } else if (dVar == C0286e.C0290d.LEFT) {
                    end3 = targetAnchor.f1357b.f1392I;
                }
            }
            if (rightSide) {
                end = end3 - widget.f1439u.mo2004d();
            } else {
                end = end3 + widget.f1437s.mo2004d() + widget.mo2022D();
            }
            widget.mo2056f0(end - widget.mo2022D(), end);
            C0286e eVar2 = widget.f1441w;
            if (eVar2.f1359d != null) {
                C0286e targetAnchor3 = eVar2.f1359d;
                C0291f fVar3 = targetAnchor3.f1357b;
                if (!fVar3.f1415c0) {
                    mo2123f(fVar3);
                }
                C0291f fVar4 = targetAnchor3.f1357b;
                int start = (fVar4.f1393J + fVar4.f1400Q) - widget.f1400Q;
                widget.mo2084t0(start, widget.f1389F + start);
                widget.f1415c0 = true;
                return;
            }
            C0286e eVar3 = widget.f1440v;
            if (eVar3.f1359d != null) {
                bottomSide = true;
            }
            if (bottomSide) {
                targetAnchor2 = eVar3.f1359d;
            } else {
                targetAnchor2 = widget.f1438t.f1359d;
            }
            if (targetAnchor2 != null) {
                C0291f fVar5 = targetAnchor2.f1357b;
                if (!fVar5.f1415c0) {
                    mo2123f(fVar5);
                }
                C0286e.C0290d dVar2 = targetAnchor2.f1358c;
                if (dVar2 == C0286e.C0290d.BOTTOM) {
                    C0291f fVar6 = targetAnchor2.f1357b;
                    end = fVar6.f1393J + fVar6.mo2079r();
                } else if (dVar2 == C0286e.C0290d.TOP) {
                    end = targetAnchor2.f1357b.f1393J;
                }
            }
            if (bottomSide) {
                end2 = end - widget.f1440v.mo2004d();
            } else {
                end2 = end + widget.f1438t.mo2004d() + widget.mo2079r();
            }
            widget.mo2084t0(end2 - widget.mo2079r(), end2);
            widget.f1415c0 = true;
        }
    }
}
