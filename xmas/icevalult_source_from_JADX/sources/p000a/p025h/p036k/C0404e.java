package p000a.p025h.p036k;

import java.util.Locale;

/* renamed from: a.h.k.e */
public final class C0404e {

    /* renamed from: a */
    public static final C0403d f1970a = new C0409e((C0407c) null, false);

    /* renamed from: b */
    public static final C0403d f1971b = new C0409e((C0407c) null, true);

    /* renamed from: c */
    public static final C0403d f1972c;

    /* renamed from: d */
    public static final C0403d f1973d;

    /* renamed from: a.h.k.e$c */
    public interface C0407c {
        /* renamed from: a */
        int mo2406a(CharSequence charSequence, int i, int i2);
    }

    static {
        C0406b bVar = C0406b.f1976a;
        f1972c = new C0409e(bVar, false);
        f1973d = new C0409e(bVar, true);
        new C0409e(C0405a.f1974b, false);
        C0410f fVar = C0410f.f1979b;
    }

    /* renamed from: a */
    public static int m2035a(int directionality) {
        if (directionality == 0) {
            return 1;
        }
        if (directionality == 1 || directionality == 2) {
            return 0;
        }
        return 2;
    }

    /* renamed from: b */
    public static int m2036b(int directionality) {
        if (directionality != 0) {
            if (directionality == 1 || directionality == 2) {
                return 0;
            }
            switch (directionality) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    /* renamed from: a.h.k.e$d */
    public static abstract class C0408d implements C0403d {

        /* renamed from: a */
        public final C0407c f1977a;

        /* renamed from: b */
        public abstract boolean mo2407b();

        public C0408d(C0407c algorithm) {
            this.f1977a = algorithm;
        }

        /* renamed from: a */
        public boolean mo2405a(CharSequence cs, int start, int count) {
            if (cs == null || start < 0 || count < 0 || cs.length() - count < start) {
                throw new IllegalArgumentException();
            } else if (this.f1977a == null) {
                return mo2407b();
            } else {
                return mo2408c(cs, start, count);
            }
        }

        /* renamed from: c */
        public final boolean mo2408c(CharSequence cs, int start, int count) {
            int a = this.f1977a.mo2406a(cs, start, count);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo2407b();
            }
            return false;
        }
    }

    /* renamed from: a.h.k.e$e */
    public static class C0409e extends C0408d {

        /* renamed from: b */
        public final boolean f1978b;

        public C0409e(C0407c algorithm, boolean defaultIsRtl) {
            super(algorithm);
            this.f1978b = defaultIsRtl;
        }

        /* renamed from: b */
        public boolean mo2407b() {
            return this.f1978b;
        }
    }

    /* renamed from: a.h.k.e$b */
    public static class C0406b implements C0407c {

        /* renamed from: a */
        public static final C0406b f1976a = new C0406b();

        /* renamed from: a */
        public int mo2406a(CharSequence cs, int start, int count) {
            int result = 2;
            int e = start + count;
            for (int i = start; i < e && result == 2; i++) {
                result = C0404e.m2036b(Character.getDirectionality(cs.charAt(i)));
            }
            return result;
        }
    }

    /* renamed from: a.h.k.e$a */
    public static class C0405a implements C0407c {

        /* renamed from: b */
        public static final C0405a f1974b = new C0405a(true);

        /* renamed from: a */
        public final boolean f1975a;

        /* renamed from: a */
        public int mo2406a(CharSequence cs, int start, int count) {
            boolean haveUnlookedFor = false;
            int e = start + count;
            for (int i = start; i < e; i++) {
                int a = C0404e.m2035a(Character.getDirectionality(cs.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                    } else if (!this.f1975a) {
                        return 1;
                    } else {
                        haveUnlookedFor = true;
                    }
                } else if (this.f1975a) {
                    return 0;
                } else {
                    haveUnlookedFor = true;
                }
            }
            if (haveUnlookedFor) {
                return this.f1975a ? 1 : 0;
            }
            return 2;
        }

        public C0405a(boolean lookForRtl) {
            this.f1975a = lookForRtl;
        }
    }

    /* renamed from: a.h.k.e$f */
    public static class C0410f extends C0408d {

        /* renamed from: b */
        public static final C0410f f1979b = new C0410f();

        public C0410f() {
            super((C0407c) null);
        }

        /* renamed from: b */
        public boolean mo2407b() {
            return C0411f.m2046b(Locale.getDefault()) == 1;
        }
    }
}
