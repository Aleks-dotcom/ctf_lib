package p000a.p055o.p056d;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p025h.p037l.C0416e;
import p000a.p025h.p037l.C0417f;
import p000a.p055o.p056d.C0639i;

/* renamed from: a.o.d.a */
public class C0610a implements C0639i.C0640a {

    /* renamed from: a */
    public C0416e<C0612b> f2427a;

    /* renamed from: b */
    public final ArrayList<C0612b> f2428b;

    /* renamed from: c */
    public final ArrayList<C0612b> f2429c;

    /* renamed from: d */
    public final C0611a f2430d;

    /* renamed from: e */
    public Runnable f2431e;

    /* renamed from: f */
    public final boolean f2432f;

    /* renamed from: g */
    public final C0639i f2433g;

    /* renamed from: h */
    public int f2434h;

    /* renamed from: a.o.d.a$a */
    public interface C0611a {
        /* renamed from: a */
        void mo3178a(int i, int i2);

        /* renamed from: b */
        void mo3179b(C0612b bVar);

        /* renamed from: c */
        void mo3180c(C0612b bVar);

        /* renamed from: d */
        void mo3181d(int i, int i2);

        /* renamed from: e */
        RecyclerView.C0862d0 mo3182e(int i);

        /* renamed from: f */
        void mo3183f(int i, int i2, Object obj);

        /* renamed from: g */
        void mo3184g(int i, int i2);

        /* renamed from: h */
        void mo3185h(int i, int i2);
    }

    public C0610a(C0611a callback) {
        this(callback, false);
    }

    public C0610a(C0611a callback, boolean disableRecycler) {
        this.f2427a = new C0417f(30);
        this.f2428b = new ArrayList<>();
        this.f2429c = new ArrayList<>();
        this.f2434h = 0;
        this.f2430d = callback;
        this.f2432f = disableRecycler;
        this.f2433g = new C0639i(this);
    }

    /* renamed from: u */
    public void mo3176u() {
        mo3175t(this.f2428b);
        mo3175t(this.f2429c);
        this.f2434h = 0;
    }

    /* renamed from: s */
    public void mo3174s() {
        this.f2433g.mo3341b(this.f2428b);
        int count = this.f2428b.size();
        for (int i = 0; i < count; i++) {
            C0612b op = this.f2428b.get(i);
            int i2 = op.f2435a;
            if (i2 == 1) {
                mo3158c(op);
            } else if (i2 == 2) {
                mo3161f(op);
            } else if (i2 == 4) {
                mo3162g(op);
            } else if (i2 == 8) {
                mo3159d(op);
            }
            Runnable runnable = this.f2431e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2428b.clear();
    }

    /* renamed from: i */
    public void mo3164i() {
        int count = this.f2429c.size();
        for (int i = 0; i < count; i++) {
            this.f2430d.mo3179b(this.f2429c.get(i));
        }
        mo3175t(this.f2429c);
        this.f2434h = 0;
    }

    /* renamed from: d */
    public final void mo3159d(C0612b op) {
        mo3173r(op);
    }

    /* renamed from: f */
    public final void mo3161f(C0612b op) {
        int tmpStart = op.f2436b;
        int tmpCount = 0;
        int tmpEnd = op.f2436b + op.f2438d;
        int type = -1;
        int position = op.f2436b;
        while (position < tmpEnd) {
            boolean typeChanged = false;
            if (this.f2430d.mo3182e(position) != null || mo3163h(position)) {
                if (type == 0) {
                    mo3166k(mo3156a(2, tmpStart, tmpCount, (Object) null));
                    typeChanged = true;
                }
                type = 1;
            } else {
                if (type == 1) {
                    mo3173r(mo3156a(2, tmpStart, tmpCount, (Object) null));
                    typeChanged = true;
                }
                type = 0;
            }
            if (typeChanged) {
                position -= tmpCount;
                tmpEnd -= tmpCount;
                tmpCount = 1;
            } else {
                tmpCount++;
            }
            position++;
        }
        if (tmpCount != op.f2438d) {
            mo3157b(op);
            op = mo3156a(2, tmpStart, tmpCount, (Object) null);
        }
        if (type == 0) {
            mo3166k(op);
        } else {
            mo3173r(op);
        }
    }

    /* renamed from: g */
    public final void mo3162g(C0612b op) {
        int tmpStart = op.f2436b;
        int tmpCount = 0;
        int tmpEnd = op.f2436b + op.f2438d;
        int type = -1;
        for (int position = op.f2436b; position < tmpEnd; position++) {
            if (this.f2430d.mo3182e(position) != null || mo3163h(position)) {
                if (type == 0) {
                    mo3166k(mo3156a(4, tmpStart, tmpCount, op.f2437c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 1;
            } else {
                if (type == 1) {
                    mo3173r(mo3156a(4, tmpStart, tmpCount, op.f2437c));
                    tmpCount = 0;
                    tmpStart = position;
                }
                type = 0;
            }
            tmpCount++;
        }
        if (tmpCount != op.f2438d) {
            Object payload = op.f2437c;
            mo3157b(op);
            op = mo3156a(4, tmpStart, tmpCount, payload);
        }
        if (type == 0) {
            mo3166k(op);
        } else {
            mo3173r(op);
        }
    }

    /* renamed from: k */
    public final void mo3166k(C0612b op) {
        int positionMultiplier;
        int i = op.f2435a;
        if (i == 1 || i == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int tmpStart = mo3177v(op.f2436b, i);
        int tmpCnt = 1;
        int offsetPositionForPartial = op.f2436b;
        int i2 = op.f2435a;
        if (i2 == 2) {
            positionMultiplier = 0;
        } else if (i2 == 4) {
            positionMultiplier = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + op);
        }
        for (int p = 1; p < op.f2438d; p++) {
            int updatedPos = mo3177v(op.f2436b + (positionMultiplier * p), op.f2435a);
            boolean continuous = false;
            int i3 = op.f2435a;
            boolean z = false;
            if (i3 == 2) {
                if (updatedPos == tmpStart) {
                    z = true;
                }
                continuous = z;
            } else if (i3 == 4) {
                if (updatedPos == tmpStart + 1) {
                    z = true;
                }
                continuous = z;
            }
            if (continuous) {
                tmpCnt++;
            } else {
                C0612b tmp = mo3156a(i3, tmpStart, tmpCnt, op.f2437c);
                mo3167l(tmp, offsetPositionForPartial);
                mo3157b(tmp);
                if (op.f2435a == 4) {
                    offsetPositionForPartial += tmpCnt;
                }
                tmpStart = updatedPos;
                tmpCnt = 1;
            }
        }
        Object payload = op.f2437c;
        mo3157b(op);
        if (tmpCnt > 0) {
            C0612b tmp2 = mo3156a(op.f2435a, tmpStart, tmpCnt, payload);
            mo3167l(tmp2, offsetPositionForPartial);
            mo3157b(tmp2);
        }
    }

    /* renamed from: l */
    public void mo3167l(C0612b op, int offsetStart) {
        this.f2430d.mo3180c(op);
        int i = op.f2435a;
        if (i == 2) {
            this.f2430d.mo3184g(offsetStart, op.f2438d);
        } else if (i == 4) {
            this.f2430d.mo3183f(offsetStart, op.f2438d, op.f2437c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: v */
    public final int mo3177v(int pos, int cmd) {
        int end;
        int start;
        for (int i = this.f2429c.size() - 1; i >= 0; i--) {
            C0612b postponed = this.f2429c.get(i);
            int i2 = postponed.f2435a;
            if (i2 == 8) {
                int i3 = postponed.f2436b;
                int i4 = postponed.f2438d;
                if (i3 < i4) {
                    start = postponed.f2436b;
                    end = postponed.f2438d;
                } else {
                    start = postponed.f2438d;
                    end = postponed.f2436b;
                }
                if (pos < start || pos > end) {
                    if (pos < i3) {
                        if (cmd == 1) {
                            postponed.f2436b = i3 + 1;
                            postponed.f2438d = i4 + 1;
                        } else if (cmd == 2) {
                            postponed.f2436b = i3 - 1;
                            postponed.f2438d = i4 - 1;
                        }
                    }
                } else if (start == i3) {
                    if (cmd == 1) {
                        postponed.f2438d = i4 + 1;
                    } else if (cmd == 2) {
                        postponed.f2438d = i4 - 1;
                    }
                    pos++;
                } else {
                    if (cmd == 1) {
                        postponed.f2436b = i3 + 1;
                    } else if (cmd == 2) {
                        postponed.f2436b = i3 - 1;
                    }
                    pos--;
                }
            } else {
                int i5 = postponed.f2436b;
                if (i5 <= pos) {
                    if (i2 == 1) {
                        pos -= postponed.f2438d;
                    } else if (i2 == 2) {
                        pos += postponed.f2438d;
                    }
                } else if (cmd == 1) {
                    postponed.f2436b = i5 + 1;
                } else if (cmd == 2) {
                    postponed.f2436b = i5 - 1;
                }
            }
        }
        for (int i6 = this.f2429c.size() - 1; i6 >= 0; i6--) {
            C0612b op = this.f2429c.get(i6);
            if (op.f2435a == 8) {
                int i7 = op.f2438d;
                if (i7 == op.f2436b || i7 < 0) {
                    this.f2429c.remove(i6);
                    mo3157b(op);
                }
            } else if (op.f2438d <= 0) {
                this.f2429c.remove(i6);
                mo3157b(op);
            }
        }
        return pos;
    }

    /* renamed from: h */
    public final boolean mo3163h(int position) {
        int count = this.f2429c.size();
        for (int i = 0; i < count; i++) {
            C0612b op = this.f2429c.get(i);
            int i2 = op.f2435a;
            if (i2 == 8) {
                if (mo3169n(op.f2438d, i + 1) == position) {
                    return true;
                }
            } else if (i2 == 1) {
                int end = op.f2436b + op.f2438d;
                for (int pos = op.f2436b; pos < end; pos++) {
                    if (mo3169n(pos, i + 1) == position) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo3158c(C0612b op) {
        mo3173r(op);
    }

    /* renamed from: r */
    public final void mo3173r(C0612b op) {
        this.f2429c.add(op);
        int i = op.f2435a;
        if (i == 1) {
            this.f2430d.mo3181d(op.f2436b, op.f2438d);
        } else if (i == 2) {
            this.f2430d.mo3185h(op.f2436b, op.f2438d);
        } else if (i == 4) {
            this.f2430d.mo3183f(op.f2436b, op.f2438d, op.f2437c);
        } else if (i == 8) {
            this.f2430d.mo3178a(op.f2436b, op.f2438d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + op);
        }
    }

    /* renamed from: p */
    public boolean mo3171p() {
        return this.f2428b.size() > 0;
    }

    /* renamed from: o */
    public boolean mo3170o(int updateTypes) {
        return (this.f2434h & updateTypes) != 0;
    }

    /* renamed from: m */
    public int mo3168m(int position) {
        return mo3169n(position, 0);
    }

    /* renamed from: n */
    public int mo3169n(int position, int firstPostponedItem) {
        int count = this.f2429c.size();
        for (int i = firstPostponedItem; i < count; i++) {
            C0612b op = this.f2429c.get(i);
            int i2 = op.f2435a;
            if (i2 == 8) {
                int i3 = op.f2436b;
                if (i3 == position) {
                    position = op.f2438d;
                } else {
                    if (i3 < position) {
                        position--;
                    }
                    if (op.f2438d <= position) {
                        position++;
                    }
                }
            } else {
                int i4 = op.f2436b;
                if (i4 > position) {
                    continue;
                } else if (i2 == 2) {
                    int i5 = op.f2438d;
                    if (position < i4 + i5) {
                        return -1;
                    }
                    position -= i5;
                } else if (i2 == 1) {
                    position += op.f2438d;
                }
            }
        }
        return position;
    }

    /* renamed from: j */
    public void mo3165j() {
        mo3164i();
        int count = this.f2428b.size();
        for (int i = 0; i < count; i++) {
            C0612b op = this.f2428b.get(i);
            int i2 = op.f2435a;
            if (i2 == 1) {
                this.f2430d.mo3179b(op);
                this.f2430d.mo3181d(op.f2436b, op.f2438d);
            } else if (i2 == 2) {
                this.f2430d.mo3179b(op);
                this.f2430d.mo3184g(op.f2436b, op.f2438d);
            } else if (i2 == 4) {
                this.f2430d.mo3179b(op);
                this.f2430d.mo3183f(op.f2436b, op.f2438d, op.f2437c);
            } else if (i2 == 8) {
                this.f2430d.mo3179b(op);
                this.f2430d.mo3178a(op.f2436b, op.f2438d);
            }
            Runnable runnable = this.f2431e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo3175t(this.f2428b);
        this.f2434h = 0;
    }

    /* renamed from: e */
    public int mo3160e(int position) {
        int size = this.f2428b.size();
        for (int i = 0; i < size; i++) {
            C0612b op = this.f2428b.get(i);
            int i2 = op.f2435a;
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = op.f2436b;
                    if (i3 <= position) {
                        int i4 = op.f2438d;
                        if (i3 + i4 > position) {
                            return -1;
                        }
                        position -= i4;
                    } else {
                        continue;
                    }
                } else if (i2 == 8) {
                    int i5 = op.f2436b;
                    if (i5 == position) {
                        position = op.f2438d;
                    } else {
                        if (i5 < position) {
                            position--;
                        }
                        if (op.f2438d <= position) {
                            position++;
                        }
                    }
                }
            } else if (op.f2436b <= position) {
                position += op.f2438d;
            }
        }
        return position;
    }

    /* renamed from: q */
    public boolean mo3172q() {
        return !this.f2429c.isEmpty() && !this.f2428b.isEmpty();
    }

    /* renamed from: a.o.d.a$b */
    public static class C0612b {

        /* renamed from: a */
        public int f2435a;

        /* renamed from: b */
        public int f2436b;

        /* renamed from: c */
        public Object f2437c;

        /* renamed from: d */
        public int f2438d;

        public C0612b(int cmd, int positionStart, int itemCount, Object payload) {
            this.f2435a = cmd;
            this.f2436b = positionStart;
            this.f2438d = itemCount;
            this.f2437c = payload;
        }

        /* renamed from: a */
        public String mo3186a() {
            int i = this.f2435a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo3186a() + ",s:" + this.f2436b + "c:" + this.f2438d + ",p:" + this.f2437c + "]";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            C0612b op = (C0612b) o;
            int i = this.f2435a;
            if (i != op.f2435a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2438d - this.f2436b) == 1 && this.f2438d == op.f2436b && this.f2436b == op.f2438d) {
                return true;
            }
            if (this.f2438d != op.f2438d || this.f2436b != op.f2436b) {
                return false;
            }
            Object obj = this.f2437c;
            if (obj != null) {
                if (!obj.equals(op.f2437c)) {
                    return false;
                }
            } else if (op.f2437c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2435a * 31) + this.f2436b) * 31) + this.f2438d;
        }
    }

    /* renamed from: a */
    public C0612b mo3156a(int cmd, int positionStart, int itemCount, Object payload) {
        C0612b op = this.f2427a.mo2417b();
        if (op == null) {
            return new C0612b(cmd, positionStart, itemCount, payload);
        }
        op.f2435a = cmd;
        op.f2436b = positionStart;
        op.f2438d = itemCount;
        op.f2437c = payload;
        return op;
    }

    /* renamed from: b */
    public void mo3157b(C0612b op) {
        if (!this.f2432f) {
            op.f2437c = null;
            this.f2427a.mo2416a(op);
        }
    }

    /* renamed from: t */
    public void mo3175t(List<C0612b> ops) {
        int count = ops.size();
        for (int i = 0; i < count; i++) {
            mo3157b(ops.get(i));
        }
        ops.clear();
    }
}
