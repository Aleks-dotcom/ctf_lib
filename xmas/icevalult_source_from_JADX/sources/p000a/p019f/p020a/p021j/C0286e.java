package p000a.p019f.p020a.p021j;

import p000a.p019f.p020a.C0273c;
import p000a.p019f.p020a.C0280i;

/* renamed from: a.f.a.j.e */
public class C0286e {

    /* renamed from: a */
    public C0301m f1356a = new C0301m(this);

    /* renamed from: b */
    public final C0291f f1357b;

    /* renamed from: c */
    public final C0290d f1358c;

    /* renamed from: d */
    public C0286e f1359d;

    /* renamed from: e */
    public int f1360e = 0;

    /* renamed from: f */
    public int f1361f = -1;

    /* renamed from: g */
    public C0289c f1362g = C0289c.NONE;

    /* renamed from: h */
    public int f1363h;

    /* renamed from: i */
    public C0280i f1364i;

    /* renamed from: a.f.a.j.e$b */
    public enum C0288b {
        RELAXED,
        STRICT
    }

    /* renamed from: a.f.a.j.e$c */
    public enum C0289c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: a.f.a.j.e$d */
    public enum C0290d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: f */
    public C0301m mo2006f() {
        return this.f1356a;
    }

    public C0286e(C0291f owner, C0290d type) {
        C0288b bVar = C0288b.RELAXED;
        this.f1363h = 0;
        this.f1357b = owner;
        this.f1358c = type;
    }

    /* renamed from: g */
    public C0280i mo2007g() {
        return this.f1364i;
    }

    /* renamed from: n */
    public void mo2014n(C0273c cache) {
        C0280i iVar = this.f1364i;
        if (iVar == null) {
            this.f1364i = new C0280i(C0280i.C0281a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo1988d();
        }
    }

    /* renamed from: e */
    public C0291f mo2005e() {
        return this.f1357b;
    }

    /* renamed from: j */
    public C0290d mo2010j() {
        return this.f1358c;
    }

    /* renamed from: d */
    public int mo2004d() {
        C0286e eVar;
        if (this.f1357b.mo2020C() == 8) {
            return 0;
        }
        if (this.f1361f <= -1 || (eVar = this.f1359d) == null || eVar.f1357b.mo2020C() != 8) {
            return this.f1360e;
        }
        return this.f1361f;
    }

    /* renamed from: h */
    public C0289c mo2008h() {
        return this.f1362g;
    }

    /* renamed from: i */
    public C0286e mo2009i() {
        return this.f1359d;
    }

    /* renamed from: c */
    public int mo2003c() {
        return this.f1363h;
    }

    /* renamed from: m */
    public void mo2013m() {
        this.f1359d = null;
        this.f1360e = 0;
        this.f1361f = -1;
        this.f1362g = C0289c.STRONG;
        this.f1363h = 0;
        C0288b bVar = C0288b.RELAXED;
        this.f1356a.mo2132e();
    }

    /* renamed from: b */
    public boolean mo2002b(C0286e toAnchor, int margin, C0289c strength, int creator) {
        return mo2001a(toAnchor, margin, -1, strength, creator, false);
    }

    /* renamed from: a */
    public boolean mo2001a(C0286e toAnchor, int margin, int goneMargin, C0289c strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.f1359d = null;
            this.f1360e = 0;
            this.f1361f = -1;
            this.f1362g = C0289c.NONE;
            this.f1363h = 2;
            return true;
        } else if (!forceConnection && !mo2012l(toAnchor)) {
            return false;
        } else {
            this.f1359d = toAnchor;
            if (margin > 0) {
                this.f1360e = margin;
            } else {
                this.f1360e = 0;
            }
            this.f1361f = goneMargin;
            this.f1362g = strength;
            this.f1363h = creator;
            return true;
        }
    }

    /* renamed from: k */
    public boolean mo2011k() {
        return this.f1359d != null;
    }

    /* renamed from: l */
    public boolean mo2012l(C0286e anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        C0290d target = anchor.mo2010j();
        C0290d dVar = this.f1358c;
        if (target != dVar) {
            switch (C0287a.f1365a[dVar.ordinal()]) {
                case 1:
                    if (target == C0290d.BASELINE || target == C0290d.CENTER_X || target == C0290d.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean isCompatible2 = target == C0290d.LEFT || target == C0290d.RIGHT;
                    if (!(anchor.mo2005e() instanceof C0296i)) {
                        return isCompatible2;
                    }
                    if (isCompatible2 || target == C0290d.CENTER_X) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 4:
                case 5:
                    boolean isCompatible3 = target == C0290d.TOP || target == C0290d.BOTTOM;
                    if (!(anchor.mo2005e() instanceof C0296i)) {
                        return isCompatible3;
                    }
                    if (isCompatible3 || target == C0290d.CENTER_Y) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f1358c.name());
            }
        } else if (dVar != C0290d.BASELINE || (anchor.mo2005e().mo2032I() && mo2005e().mo2032I())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a.f.a.j.e$a */
    public static /* synthetic */ class C0287a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1365a;

        static {
            int[] iArr = new int[C0290d.values().length];
            f1365a = iArr;
            try {
                iArr[C0290d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1365a[C0290d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1365a[C0290d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f1365a[C0290d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f1365a[C0290d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f1365a[C0290d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f1365a[C0290d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f1365a[C0290d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f1365a[C0290d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public String toString() {
        return this.f1357b.mo2071n() + ":" + this.f1358c.toString();
    }
}
