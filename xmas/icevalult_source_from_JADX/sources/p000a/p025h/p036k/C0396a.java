package p000a.p025h.p036k;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: a.h.k.a */
public final class C0396a {

    /* renamed from: d */
    public static final C0403d f1940d;

    /* renamed from: e */
    public static final String f1941e = Character.toString(8206);

    /* renamed from: f */
    public static final String f1942f = Character.toString(8207);

    /* renamed from: g */
    public static final C0396a f1943g;

    /* renamed from: h */
    public static final C0396a f1944h;

    /* renamed from: a */
    public final boolean f1945a;

    /* renamed from: b */
    public final int f1946b;

    /* renamed from: c */
    public final C0403d f1947c;

    static {
        C0403d dVar = C0404e.f1972c;
        f1940d = dVar;
        f1943g = new C0396a(false, 2, dVar);
        f1944h = new C0396a(true, 2, dVar);
    }

    /* renamed from: a.h.k.a$a */
    public static final class C0397a {

        /* renamed from: a */
        public boolean f1948a;

        /* renamed from: b */
        public int f1949b;

        /* renamed from: c */
        public C0403d f1950c;

        public C0397a() {
            mo2372c(C0396a.m2003e(Locale.getDefault()));
        }

        /* renamed from: c */
        public final void mo2372c(boolean isRtlContext) {
            this.f1948a = isRtlContext;
            this.f1950c = C0396a.f1940d;
            this.f1949b = 2;
        }

        /* renamed from: b */
        public static C0396a m2009b(boolean isRtlContext) {
            return isRtlContext ? C0396a.f1944h : C0396a.f1943g;
        }

        /* renamed from: a */
        public C0396a mo2371a() {
            if (this.f1949b == 2 && this.f1950c == C0396a.f1940d) {
                return m2009b(this.f1948a);
            }
            return new C0396a(this.f1948a, this.f1949b, this.f1950c);
        }
    }

    /* renamed from: c */
    public static C0396a m2002c() {
        return new C0397a().mo2371a();
    }

    public C0396a(boolean isRtlContext, int flags, C0403d heuristic) {
        this.f1945a = isRtlContext;
        this.f1946b = flags;
        this.f1947c = heuristic;
    }

    /* renamed from: d */
    public boolean mo2366d() {
        return (this.f1946b & 2) != 0;
    }

    /* renamed from: f */
    public final String mo2367f(CharSequence str, C0403d heuristic) {
        boolean isRtl = heuristic.mo2405a(str, 0, str.length());
        if (!this.f1945a && (isRtl || m2001b(str) == 1)) {
            return f1941e;
        }
        if (!this.f1945a) {
            return "";
        }
        if (!isRtl || m2001b(str) == -1) {
            return f1942f;
        }
        return "";
    }

    /* renamed from: g */
    public final String mo2368g(CharSequence str, C0403d heuristic) {
        boolean isRtl = heuristic.mo2405a(str, 0, str.length());
        if (!this.f1945a && (isRtl || m2000a(str) == 1)) {
            return f1941e;
        }
        if (!this.f1945a) {
            return "";
        }
        if (!isRtl || m2000a(str) == -1) {
            return f1942f;
        }
        return "";
    }

    /* renamed from: i */
    public CharSequence mo2370i(CharSequence str, C0403d heuristic, boolean isolate) {
        if (str == null) {
            return null;
        }
        boolean isRtl = heuristic.mo2405a(str, 0, str.length());
        SpannableStringBuilder result = new SpannableStringBuilder();
        if (mo2366d() && isolate) {
            result.append(mo2368g(str, isRtl ? C0404e.f1971b : C0404e.f1970a));
        }
        if (isRtl != this.f1945a) {
            result.append(isRtl ? (char) 8235 : 8234);
            result.append(str);
            result.append(8236);
        } else {
            result.append(str);
        }
        if (isolate) {
            result.append(mo2367f(str, isRtl ? C0404e.f1971b : C0404e.f1970a));
        }
        return result;
    }

    /* renamed from: h */
    public CharSequence mo2369h(CharSequence str) {
        return mo2370i(str, this.f1947c, true);
    }

    /* renamed from: e */
    public static boolean m2003e(Locale locale) {
        return C0411f.m2046b(locale) == 1;
    }

    /* renamed from: b */
    public static int m2001b(CharSequence str) {
        return new C0398b(str, false).mo2376e();
    }

    /* renamed from: a */
    public static int m2000a(CharSequence str) {
        return new C0398b(str, false).mo2375d();
    }

    /* renamed from: a.h.k.a$b */
    public static class C0398b {

        /* renamed from: f */
        public static final byte[] f1951f = new byte[1792];

        /* renamed from: a */
        public final CharSequence f1952a;

        /* renamed from: b */
        public final boolean f1953b;

        /* renamed from: c */
        public final int f1954c;

        /* renamed from: d */
        public int f1955d;

        /* renamed from: e */
        public char f1956e;

        static {
            for (int i = 0; i < 1792; i++) {
                f1951f[i] = Character.getDirectionality(i);
            }
        }

        public C0398b(CharSequence text, boolean isHtml) {
            this.f1952a = text;
            this.f1953b = isHtml;
            this.f1954c = text.length();
        }

        /* renamed from: d */
        public int mo2375d() {
            this.f1955d = 0;
            int embeddingLevel = 0;
            int embeddingLevelDir = 0;
            int firstNonEmptyEmbeddingLevel = 0;
            while (this.f1955d < this.f1954c && firstNonEmptyEmbeddingLevel == 0) {
                byte b = mo2374b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (embeddingLevel == 0) {
                            return 1;
                        }
                        firstNonEmptyEmbeddingLevel = embeddingLevel;
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                embeddingLevel++;
                                embeddingLevelDir = -1;
                                break;
                            case 16:
                            case 17:
                                embeddingLevel++;
                                embeddingLevelDir = 1;
                                break;
                            case 18:
                                embeddingLevel--;
                                embeddingLevelDir = 0;
                                break;
                            default:
                                firstNonEmptyEmbeddingLevel = embeddingLevel;
                                break;
                        }
                    }
                } else if (embeddingLevel == 0) {
                    return -1;
                } else {
                    firstNonEmptyEmbeddingLevel = embeddingLevel;
                }
            }
            if (firstNonEmptyEmbeddingLevel == 0) {
                return 0;
            }
            if (embeddingLevelDir != 0) {
                return embeddingLevelDir;
            }
            while (this.f1955d > 0) {
                switch (mo2373a()) {
                    case 14:
                    case 15:
                        if (firstNonEmptyEmbeddingLevel != embeddingLevel) {
                            embeddingLevel--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (firstNonEmptyEmbeddingLevel != embeddingLevel) {
                            embeddingLevel--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        embeddingLevel++;
                        break;
                }
            }
            return 0;
        }

        /* renamed from: e */
        public int mo2376e() {
            this.f1955d = this.f1954c;
            int embeddingLevel = 0;
            int lastNonEmptyEmbeddingLevel = 0;
            while (this.f1955d > 0) {
                byte a = mo2373a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (embeddingLevel == 0) {
                            return 1;
                        }
                        if (lastNonEmptyEmbeddingLevel == 0) {
                            lastNonEmptyEmbeddingLevel = embeddingLevel;
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (lastNonEmptyEmbeddingLevel != embeddingLevel) {
                                    embeddingLevel--;
                                    break;
                                } else {
                                    return -1;
                                }
                            case 16:
                            case 17:
                                if (lastNonEmptyEmbeddingLevel != embeddingLevel) {
                                    embeddingLevel--;
                                    break;
                                } else {
                                    return 1;
                                }
                            case 18:
                                embeddingLevel++;
                                break;
                            default:
                                if (lastNonEmptyEmbeddingLevel != 0) {
                                    break;
                                } else {
                                    lastNonEmptyEmbeddingLevel = embeddingLevel;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (embeddingLevel == 0) {
                    return -1;
                } else {
                    if (lastNonEmptyEmbeddingLevel == 0) {
                        lastNonEmptyEmbeddingLevel = embeddingLevel;
                    }
                }
            }
            return 0;
        }

        /* renamed from: c */
        public static byte m2012c(char c) {
            return c < 1792 ? f1951f[c] : Character.getDirectionality(c);
        }

        /* renamed from: b */
        public byte mo2374b() {
            char charAt = this.f1952a.charAt(this.f1955d);
            this.f1956e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePoint = Character.codePointAt(this.f1952a, this.f1955d);
                this.f1955d += Character.charCount(codePoint);
                return Character.getDirectionality(codePoint);
            }
            this.f1955d++;
            byte dirType = m2012c(this.f1956e);
            if (!this.f1953b) {
                return dirType;
            }
            char c = this.f1956e;
            if (c == '<') {
                return mo2380i();
            }
            if (c == '&') {
                return mo2378g();
            }
            return dirType;
        }

        /* renamed from: a */
        public byte mo2373a() {
            char charAt = this.f1952a.charAt(this.f1955d - 1);
            this.f1956e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePoint = Character.codePointBefore(this.f1952a, this.f1955d);
                this.f1955d -= Character.charCount(codePoint);
                return Character.getDirectionality(codePoint);
            }
            this.f1955d--;
            byte dirType = m2012c(this.f1956e);
            if (!this.f1953b) {
                return dirType;
            }
            char c = this.f1956e;
            if (c == '>') {
                return mo2379h();
            }
            if (c == ';') {
                return mo2377f();
            }
            return dirType;
        }

        /* renamed from: i */
        public final byte mo2380i() {
            char charAt;
            int initialCharIndex = this.f1955d;
            while (true) {
                int i = this.f1955d;
                if (i < this.f1954c) {
                    CharSequence charSequence = this.f1952a;
                    this.f1955d = i + 1;
                    char charAt2 = charSequence.charAt(i);
                    this.f1956e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char quote = this.f1956e;
                        do {
                            int i2 = this.f1955d;
                            if (i2 >= this.f1954c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f1952a;
                            this.f1955d = i2 + 1;
                            charAt = charSequence2.charAt(i2);
                            this.f1956e = charAt;
                        } while (charAt != quote);
                    }
                } else {
                    this.f1955d = initialCharIndex;
                    this.f1956e = '<';
                    return 13;
                }
            }
        }

        /* renamed from: h */
        public final byte mo2379h() {
            char charAt;
            int initialCharIndex = this.f1955d;
            while (true) {
                int i = this.f1955d;
                if (i <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1952a;
                int i2 = i - 1;
                this.f1955d = i2;
                char charAt2 = charSequence.charAt(i2);
                this.f1956e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char quote = this.f1956e;
                    do {
                        int i3 = this.f1955d;
                        if (i3 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f1952a;
                        int i4 = i3 - 1;
                        this.f1955d = i4;
                        charAt = charSequence2.charAt(i4);
                        this.f1956e = charAt;
                    } while (charAt != quote);
                }
            }
            this.f1955d = initialCharIndex;
            this.f1956e = '>';
            return 13;
        }

        /* renamed from: g */
        public final byte mo2378g() {
            char charAt;
            do {
                int i = this.f1955d;
                if (i >= this.f1954c) {
                    return 12;
                }
                CharSequence charSequence = this.f1952a;
                this.f1955d = i + 1;
                charAt = charSequence.charAt(i);
                this.f1956e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: f */
        public final byte mo2377f() {
            char charAt;
            int initialCharIndex = this.f1955d;
            do {
                int i = this.f1955d;
                if (i <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1952a;
                int i2 = i - 1;
                this.f1955d = i2;
                charAt = charSequence.charAt(i2);
                this.f1956e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f1955d = initialCharIndex;
            this.f1956e = ';';
            return 13;
        }
    }
}
