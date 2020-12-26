package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: b.a.a.a.v.j */
public class C1085j extends BaseAdapter {

    /* renamed from: f */
    public static final int f4533f = C1093o.m5823k().getMaximum(4);

    /* renamed from: b */
    public final C1083i f4534b;

    /* renamed from: c */
    public final C1066d<?> f4535c;

    /* renamed from: d */
    public C1065c f4536d;

    /* renamed from: e */
    public final C1061a f4537e;

    public C1085j(C1083i month, C1066d<?> dateSelector, C1061a calendarConstraints) {
        this.f4534b = month;
        this.f4535c = dateSelector;
        this.f4537e = calendarConstraints;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: c */
    public Long getItem(int position) {
        if (position < this.f4534b.mo6236h() || position > mo6259h()) {
            return null;
        }
        return Long.valueOf(this.f4534b.mo6238i(mo6261i(position)));
    }

    public long getItemId(int position) {
        return (long) (position / this.f4534b.f4531f);
    }

    public int getCount() {
        return this.f4534b.f4532g + mo6249b();
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            android.content.Context r0 = r14.getContext()
            r11.mo6252e(r0)
            r0 = r13
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r13 != 0) goto L_0x001e
            android.content.Context r2 = r14.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = p066b.p067a.p068a.p069a.C0976h.mtrl_calendar_day
            android.view.View r3 = r2.inflate(r3, r14, r1)
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r2 = r11.mo6249b()
            int r2 = r12 - r2
            r3 = 1
            if (r2 < 0) goto L_0x0062
            b.a.a.a.v.i r4 = r11.f4534b
            int r5 = r4.f4532g
            if (r2 < r5) goto L_0x002e
            goto L_0x0062
        L_0x002e:
            int r5 = r2 + 1
            r0.setTag(r4)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            r0.setText(r4)
            b.a.a.a.v.i r4 = r11.f4534b
            long r6 = r4.mo6238i(r5)
            b.a.a.a.v.i r4 = r11.f4534b
            int r4 = r4.f4530e
            b.a.a.a.v.i r8 = p066b.p067a.p068a.p069a.p092v.C1083i.m5780n()
            int r8 = r8.f4530e
            if (r4 != r8) goto L_0x0054
            java.lang.String r4 = p066b.p067a.p068a.p069a.p092v.C1067e.m5742a(r6)
            r0.setContentDescription(r4)
            goto L_0x005b
        L_0x0054:
            java.lang.String r4 = p066b.p067a.p068a.p069a.p092v.C1067e.m5744c(r6)
            r0.setContentDescription(r4)
        L_0x005b:
            r0.setVisibility(r1)
            r0.setEnabled(r3)
            goto L_0x006a
        L_0x0062:
            r4 = 8
            r0.setVisibility(r4)
            r0.setEnabled(r1)
        L_0x006a:
            java.lang.Long r4 = r11.getItem(r12)
            if (r4 != 0) goto L_0x0071
            return r0
        L_0x0071:
            b.a.a.a.v.a r5 = r11.f4537e
            b.a.a.a.v.a$b r5 = r5.mo6190f()
            long r6 = r4.longValue()
            boolean r5 = r5.mo6202e(r6)
            if (r5 == 0) goto L_0x00d7
            r0.setEnabled(r3)
            b.a.a.a.v.d<?> r1 = r11.f4535c
            java.util.Collection r1 = r1.mo6209d()
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r1.next()
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            long r7 = r4.longValue()
            long r7 = p066b.p067a.p068a.p069a.p092v.C1093o.m5813a(r7)
            long r9 = p066b.p067a.p068a.p069a.p092v.C1093o.m5813a(r5)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x00b6
            b.a.a.a.v.c r1 = r11.f4536d
            b.a.a.a.v.b r1 = r1.f4482b
            r1.mo6205d(r0)
            return r0
        L_0x00b6:
            goto L_0x008e
        L_0x00b7:
            java.util.Calendar r1 = p066b.p067a.p068a.p069a.p092v.C1093o.m5821i()
            long r5 = r1.getTimeInMillis()
            long r7 = r4.longValue()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00cf
            b.a.a.a.v.c r1 = r11.f4536d
            b.a.a.a.v.b r1 = r1.f4483c
            r1.mo6205d(r0)
            return r0
        L_0x00cf:
            b.a.a.a.v.c r1 = r11.f4536d
            b.a.a.a.v.b r1 = r1.f4481a
            r1.mo6205d(r0)
            return r0
        L_0x00d7:
            r0.setEnabled(r1)
            b.a.a.a.v.c r1 = r11.f4536d
            b.a.a.a.v.b r1 = r1.f4487g
            r1.mo6205d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p092v.C1085j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: e */
    public final void mo6252e(Context context) {
        if (this.f4536d == null) {
            this.f4536d = new C1065c(context);
        }
    }

    /* renamed from: b */
    public int mo6249b() {
        return this.f4534b.mo6236h();
    }

    /* renamed from: h */
    public int mo6259h() {
        return (this.f4534b.mo6236h() + this.f4534b.f4532g) - 1;
    }

    /* renamed from: i */
    public int mo6261i(int position) {
        return (position - this.f4534b.mo6236h()) + 1;
    }

    /* renamed from: a */
    public int mo6248a(int day) {
        return mo6249b() + (day - 1);
    }

    /* renamed from: j */
    public boolean mo6262j(int position) {
        return position >= mo6249b() && position <= mo6259h();
    }

    /* renamed from: f */
    public boolean mo6253f(int position) {
        return position % this.f4534b.f4531f == 0;
    }

    /* renamed from: g */
    public boolean mo6254g(int position) {
        return (position + 1) % this.f4534b.f4531f == 0;
    }
}
