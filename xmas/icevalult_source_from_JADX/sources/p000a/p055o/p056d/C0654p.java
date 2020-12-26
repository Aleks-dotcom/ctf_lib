package p000a.p055o.p056d;

import androidx.recyclerview.widget.RecyclerView;
import p000a.p018e.C0261d;
import p000a.p018e.C0269g;
import p000a.p025h.p037l.C0416e;
import p000a.p025h.p037l.C0417f;

/* renamed from: a.o.d.p */
public class C0654p {

    /* renamed from: a */
    public final C0269g<RecyclerView.C0862d0, C0655a> f2587a = new C0269g<>();

    /* renamed from: b */
    public final C0261d<RecyclerView.C0862d0> f2588b = new C0261d<>();

    /* renamed from: a.o.d.p$b */
    public interface C0656b {
        /* renamed from: a */
        void mo3426a(RecyclerView.C0862d0 d0Var, RecyclerView.C0870l.C0873c cVar, RecyclerView.C0870l.C0873c cVar2);

        /* renamed from: b */
        void mo3427b(RecyclerView.C0862d0 d0Var);

        /* renamed from: c */
        void mo3428c(RecyclerView.C0862d0 d0Var, RecyclerView.C0870l.C0873c cVar, RecyclerView.C0870l.C0873c cVar2);

        /* renamed from: d */
        void mo3429d(RecyclerView.C0862d0 d0Var, RecyclerView.C0870l.C0873c cVar, RecyclerView.C0870l.C0873c cVar2);
    }

    /* renamed from: f */
    public void mo3414f() {
        this.f2587a.clear();
        this.f2588b.mo1784b();
    }

    /* renamed from: e */
    public void mo3413e(RecyclerView.C0862d0 holder, RecyclerView.C0870l.C0873c info) {
        C0655a record = this.f2587a.get(holder);
        if (record == null) {
            record = C0655a.m3296b();
            this.f2587a.put(holder, record);
        }
        record.f2591b = info;
        record.f2590a |= 4;
    }

    /* renamed from: h */
    public boolean mo3416h(RecyclerView.C0862d0 holder) {
        C0655a record = this.f2587a.get(holder);
        return (record == null || (record.f2590a & 1) == 0) ? false : true;
    }

    /* renamed from: n */
    public RecyclerView.C0870l.C0873c mo3422n(RecyclerView.C0862d0 vh) {
        return mo3420l(vh, 4);
    }

    /* renamed from: m */
    public RecyclerView.C0870l.C0873c mo3421m(RecyclerView.C0862d0 vh) {
        return mo3420l(vh, 8);
    }

    /* renamed from: l */
    public final RecyclerView.C0870l.C0873c mo3420l(RecyclerView.C0862d0 vh, int flag) {
        C0655a record;
        RecyclerView.C0870l.C0873c info;
        int index = this.f2587a.mo1876f(vh);
        if (index >= 0 && (record = this.f2587a.mo1887m(index)) != null) {
            int i = record.f2590a;
            if ((i & flag) != 0) {
                int i2 = (~flag) & i;
                record.f2590a = i2;
                if (flag == 4) {
                    info = record.f2591b;
                } else if (flag == 8) {
                    info = record.f2592c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i2 & 12) == 0) {
                    this.f2587a.mo1885k(index);
                    C0655a.m3297c(record);
                }
                return info;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo3411c(long key, RecyclerView.C0862d0 holder) {
        this.f2588b.mo1793j(key, holder);
    }

    /* renamed from: a */
    public void mo3409a(RecyclerView.C0862d0 holder, RecyclerView.C0870l.C0873c info) {
        C0655a record = this.f2587a.get(holder);
        if (record == null) {
            record = C0655a.m3296b();
            this.f2587a.put(holder, record);
        }
        record.f2590a |= 2;
        record.f2591b = info;
    }

    /* renamed from: i */
    public boolean mo3417i(RecyclerView.C0862d0 viewHolder) {
        C0655a record = this.f2587a.get(viewHolder);
        return (record == null || (record.f2590a & 4) == 0) ? false : true;
    }

    /* renamed from: g */
    public RecyclerView.C0862d0 mo3415g(long key) {
        return this.f2588b.mo1789f(key);
    }

    /* renamed from: d */
    public void mo3412d(RecyclerView.C0862d0 holder, RecyclerView.C0870l.C0873c info) {
        C0655a record = this.f2587a.get(holder);
        if (record == null) {
            record = C0655a.m3296b();
            this.f2587a.put(holder, record);
        }
        record.f2592c = info;
        record.f2590a |= 8;
    }

    /* renamed from: b */
    public void mo3410b(RecyclerView.C0862d0 holder) {
        C0655a record = this.f2587a.get(holder);
        if (record == null) {
            record = C0655a.m3296b();
            this.f2587a.put(holder, record);
        }
        record.f2590a |= 1;
    }

    /* renamed from: p */
    public void mo3424p(RecyclerView.C0862d0 holder) {
        C0655a record = this.f2587a.get(holder);
        if (record != null) {
            record.f2590a &= -2;
        }
    }

    /* renamed from: o */
    public void mo3423o(C0656b callback) {
        for (int index = this.f2587a.size() - 1; index >= 0; index--) {
            RecyclerView.C0862d0 viewHolder = this.f2587a.mo1882i(index);
            C0655a record = this.f2587a.mo1885k(index);
            int i = record.f2590a;
            if ((i & 3) == 3) {
                callback.mo3427b(viewHolder);
            } else if ((i & 1) != 0) {
                RecyclerView.C0870l.C0873c cVar = record.f2591b;
                if (cVar == null) {
                    callback.mo3427b(viewHolder);
                } else {
                    callback.mo3426a(viewHolder, cVar, record.f2592c);
                }
            } else if ((i & 14) == 14) {
                callback.mo3429d(viewHolder, record.f2591b, record.f2592c);
            } else if ((i & 12) == 12) {
                callback.mo3428c(viewHolder, record.f2591b, record.f2592c);
            } else if ((i & 4) != 0) {
                callback.mo3426a(viewHolder, record.f2591b, (RecyclerView.C0870l.C0873c) null);
            } else if ((i & 8) != 0) {
                callback.mo3429d(viewHolder, record.f2591b, record.f2592c);
            }
            C0655a.m3297c(record);
        }
    }

    /* renamed from: q */
    public void mo3425q(RecyclerView.C0862d0 holder) {
        int i = this.f2588b.mo1796m() - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (holder == this.f2588b.mo1797n(i)) {
                this.f2588b.mo1795l(i);
                break;
            } else {
                i--;
            }
        }
        C0655a info = this.f2587a.remove(holder);
        if (info != null) {
            C0655a.m3297c(info);
        }
    }

    /* renamed from: j */
    public void mo3418j() {
        C0655a.m3295a();
    }

    /* renamed from: k */
    public void mo3419k(RecyclerView.C0862d0 viewHolder) {
        mo3424p(viewHolder);
    }

    /* renamed from: a.o.d.p$a */
    public static class C0655a {

        /* renamed from: d */
        public static C0416e<C0655a> f2589d = new C0417f(20);

        /* renamed from: a */
        public int f2590a;

        /* renamed from: b */
        public RecyclerView.C0870l.C0873c f2591b;

        /* renamed from: c */
        public RecyclerView.C0870l.C0873c f2592c;

        /* renamed from: b */
        public static C0655a m3296b() {
            C0655a record = f2589d.mo2417b();
            return record == null ? new C0655a() : record;
        }

        /* renamed from: c */
        public static void m3297c(C0655a record) {
            record.f2590a = 0;
            record.f2591b = null;
            record.f2592c = null;
            f2589d.mo2416a(record);
        }

        /* renamed from: a */
        public static void m3295a() {
            do {
            } while (f2589d.mo2417b() != null);
        }
    }
}
