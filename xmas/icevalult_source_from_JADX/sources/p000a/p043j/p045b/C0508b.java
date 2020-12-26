package p000a.p043j.p045b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: a.j.b.b */
public class C0508b {

    /* renamed from: a.j.b.b$a */
    public interface C0509a<T> {
        /* renamed from: a */
        void mo2723a(T t, Rect rect);
    }

    /* renamed from: a.j.b.b$b */
    public interface C0510b<T, V> {
        /* renamed from: a */
        int mo2725a(T t);

        /* renamed from: b */
        V mo2726b(T t, int i);
    }

    /* renamed from: d */
    public static <L, T> T m2517d(L focusables, C0510b<L, T> collectionAdapter, C0509a<T> adapter, T focused, int direction, boolean isLayoutRtl, boolean wrap) {
        int count = collectionAdapter.mo2725a(focusables);
        ArrayList<T> sortedFocusables = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            sortedFocusables.add(collectionAdapter.mo2726b(focusables, i));
        }
        Collections.sort(sortedFocusables, new C0511c<>(isLayoutRtl, adapter));
        if (direction == 1) {
            return m2519f(focused, sortedFocusables, wrap);
        }
        if (direction == 2) {
            return m2518e(focused, sortedFocusables, wrap);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    public static <T> T m2518e(T focused, ArrayList<T> focusables, boolean wrap) {
        int count = focusables.size();
        int position = (focused == null ? -1 : focusables.lastIndexOf(focused)) + 1;
        if (position < count) {
            return focusables.get(position);
        }
        if (!wrap || count <= 0) {
            return null;
        }
        return focusables.get(0);
    }

    /* renamed from: f */
    public static <T> T m2519f(T focused, ArrayList<T> focusables, boolean wrap) {
        int count = focusables.size();
        int position = (focused == null ? count : focusables.indexOf(focused)) - 1;
        if (position >= 0) {
            return focusables.get(position);
        }
        if (!wrap || count <= 0) {
            return null;
        }
        return focusables.get(count - 1);
    }

    /* renamed from: a.j.b.b$c */
    public static class C0511c<T> implements Comparator<T> {

        /* renamed from: a */
        public final Rect f2132a = new Rect();

        /* renamed from: b */
        public final Rect f2133b = new Rect();

        /* renamed from: c */
        public final boolean f2134c;

        /* renamed from: d */
        public final C0509a<T> f2135d;

        public C0511c(boolean isLayoutRtl, C0509a<T> adapter) {
            this.f2134c = isLayoutRtl;
            this.f2135d = adapter;
        }

        public int compare(T first, T second) {
            Rect firstRect = this.f2132a;
            Rect secondRect = this.f2133b;
            this.f2135d.mo2723a(first, firstRect);
            this.f2135d.mo2723a(second, secondRect);
            int i = firstRect.top;
            int i2 = secondRect.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = firstRect.left;
            int i4 = secondRect.left;
            if (i3 < i4) {
                if (this.f2134c) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = firstRect.bottom;
                int i6 = secondRect.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = firstRect.right;
                int i8 = secondRect.right;
                if (i7 < i8) {
                    if (this.f2134c) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f2134c) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f2134c) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: c */
    public static <L, T> T m2516c(L focusables, C0510b<L, T> collectionAdapter, C0509a<T> adapter, T focused, Rect focusedRect, int direction) {
        Rect bestCandidateRect = new Rect(focusedRect);
        if (direction == 17) {
            bestCandidateRect.offset(focusedRect.width() + 1, 0);
        } else if (direction == 33) {
            bestCandidateRect.offset(0, focusedRect.height() + 1);
        } else if (direction == 66) {
            bestCandidateRect.offset(-(focusedRect.width() + 1), 0);
        } else if (direction == 130) {
            bestCandidateRect.offset(0, -(focusedRect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T closest = null;
        int count = collectionAdapter.mo2725a(focusables);
        Rect focusableRect = new Rect();
        for (int i = 0; i < count; i++) {
            T focusable = collectionAdapter.mo2726b(focusables, i);
            if (focusable != focused) {
                adapter.mo2723a(focusable, focusableRect);
                if (m2521h(direction, focusedRect, focusableRect, bestCandidateRect)) {
                    bestCandidateRect.set(focusableRect);
                    closest = focusable;
                }
            }
        }
        return closest;
    }

    /* renamed from: h */
    public static boolean m2521h(int direction, Rect source, Rect candidate, Rect currentBest) {
        if (!m2522i(source, candidate, direction)) {
            return false;
        }
        if (!m2522i(source, currentBest, direction) || m2514a(direction, source, candidate, currentBest)) {
            return true;
        }
        if (!m2514a(direction, source, currentBest, candidate) && m2520g(m2524k(direction, source, candidate), m2528o(direction, source, candidate)) < m2520g(m2524k(direction, source, currentBest), m2528o(direction, source, currentBest))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m2514a(int direction, Rect source, Rect rect1, Rect rect2) {
        boolean rect1InSrcBeam = m2515b(direction, source, rect1);
        if (m2515b(direction, source, rect2) || !rect1InSrcBeam) {
            return false;
        }
        if (m2523j(direction, source, rect2) && direction != 17 && direction != 66 && m2524k(direction, source, rect1) >= m2526m(direction, source, rect2)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static int m2520g(int majorAxisDistance, int minorAxisDistance) {
        return (majorAxisDistance * 13 * majorAxisDistance) + (minorAxisDistance * minorAxisDistance);
    }

    /* renamed from: i */
    public static boolean m2522i(Rect srcRect, Rect destRect, int direction) {
        if (direction == 17) {
            int i = srcRect.right;
            int i2 = destRect.right;
            if ((i > i2 || srcRect.left >= i2) && srcRect.left > destRect.left) {
                return true;
            }
            return false;
        } else if (direction == 33) {
            int i3 = srcRect.bottom;
            int i4 = destRect.bottom;
            if ((i3 > i4 || srcRect.top >= i4) && srcRect.top > destRect.top) {
                return true;
            }
            return false;
        } else if (direction == 66) {
            int i5 = srcRect.left;
            int i6 = destRect.left;
            if ((i5 < i6 || srcRect.right <= i6) && srcRect.right < destRect.right) {
                return true;
            }
            return false;
        } else if (direction == 130) {
            int i7 = srcRect.top;
            int i8 = destRect.top;
            return (i7 < i8 || srcRect.bottom <= i8) && srcRect.bottom < destRect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: b */
    public static boolean m2515b(int direction, Rect rect1, Rect rect2) {
        if (direction != 17) {
            if (direction != 33) {
                if (direction != 66) {
                    if (direction != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect1.left || rect2.left > rect1.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect1.top || rect2.top > rect1.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m2523j(int direction, Rect src, Rect dest) {
        if (direction != 17) {
            if (direction != 33) {
                if (direction != 66) {
                    if (direction != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (src.bottom <= dest.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (src.right <= dest.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (src.top >= dest.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (src.left >= dest.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public static int m2524k(int direction, Rect source, Rect dest) {
        return Math.max(0, m2525l(direction, source, dest));
    }

    /* renamed from: l */
    public static int m2525l(int direction, Rect source, Rect dest) {
        if (direction == 17) {
            return source.left - dest.right;
        }
        if (direction == 33) {
            return source.top - dest.bottom;
        }
        if (direction == 66) {
            return dest.left - source.right;
        }
        if (direction == 130) {
            return dest.top - source.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: m */
    public static int m2526m(int direction, Rect source, Rect dest) {
        return Math.max(1, m2527n(direction, source, dest));
    }

    /* renamed from: n */
    public static int m2527n(int direction, Rect source, Rect dest) {
        if (direction == 17) {
            return source.left - dest.left;
        }
        if (direction == 33) {
            return source.top - dest.top;
        }
        if (direction == 66) {
            return dest.right - source.right;
        }
        if (direction == 130) {
            return dest.bottom - source.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: o */
    public static int m2528o(int direction, Rect source, Rect dest) {
        if (direction != 17) {
            if (direction != 33) {
                if (direction != 66) {
                    if (direction != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((source.left + (source.width() / 2)) - (dest.left + (dest.width() / 2)));
        }
        return Math.abs((source.top + (source.height() / 2)) - (dest.top + (dest.height() / 2)));
    }
}
