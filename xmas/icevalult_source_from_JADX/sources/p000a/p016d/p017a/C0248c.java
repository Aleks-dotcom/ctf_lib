package p000a.p016d.p017a;

import android.content.res.ColorStateList;

/* renamed from: a.d.a.c */
public class C0248c implements C0252f {
    /* renamed from: m */
    public void mo1688m(C0251e cardView, float radius) {
        mo1689n(cardView).mo1709h(radius);
    }

    /* renamed from: l */
    public void mo1675l() {
    }

    /* renamed from: k */
    public void mo1687k(C0251e cardView, float maxElevation) {
        mo1689n(cardView).mo1706g(maxElevation, cardView.mo1695c(), cardView.mo1698f());
        mo1690o(cardView);
    }

    /* renamed from: a */
    public float mo1677a(C0251e cardView) {
        return mo1689n(cardView).mo1701c();
    }

    /* renamed from: g */
    public float mo1683g(C0251e cardView) {
        return mo1678b(cardView) * 2.0f;
    }

    /* renamed from: e */
    public float mo1681e(C0251e cardView) {
        return mo1678b(cardView) * 2.0f;
    }

    /* renamed from: b */
    public float mo1678b(C0251e cardView) {
        return mo1689n(cardView).mo1702d();
    }

    /* renamed from: j */
    public void mo1686j(C0251e cardView, float elevation) {
        cardView.mo1694b().setElevation(elevation);
    }

    /* renamed from: f */
    public float mo1682f(C0251e cardView) {
        return cardView.mo1694b().getElevation();
    }

    /* renamed from: o */
    public void mo1690o(C0251e cardView) {
        if (!cardView.mo1695c()) {
            cardView.mo1693a(0, 0, 0, 0);
            return;
        }
        float elevation = mo1677a(cardView);
        float radius = mo1678b(cardView);
        int hPadding = (int) Math.ceil((double) C0254h.m1289c(elevation, radius, cardView.mo1698f()));
        int vPadding = (int) Math.ceil((double) C0254h.m1290d(elevation, radius, cardView.mo1698f()));
        cardView.mo1693a(hPadding, vPadding, hPadding, vPadding);
    }

    /* renamed from: h */
    public void mo1684h(C0251e cardView) {
        mo1687k(cardView, mo1677a(cardView));
    }

    /* renamed from: c */
    public void mo1679c(C0251e cardView) {
        mo1687k(cardView, mo1677a(cardView));
    }

    /* renamed from: d */
    public void mo1680d(C0251e cardView, ColorStateList color) {
        mo1689n(cardView).mo1705f(color);
    }

    /* renamed from: i */
    public ColorStateList mo1685i(C0251e cardView) {
        return mo1689n(cardView).mo1700b();
    }

    /* renamed from: n */
    public final C0253g mo1689n(C0251e cardView) {
        return (C0253g) cardView.mo1696d();
    }
}
