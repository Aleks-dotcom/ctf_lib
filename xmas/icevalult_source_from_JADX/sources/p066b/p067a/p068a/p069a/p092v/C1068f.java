package p066b.p067a.p068a.p069a.p092v;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: b.a.a.a.v.f */
public class C1068f extends BaseAdapter {

    /* renamed from: e */
    public static final int f4489e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: b */
    public final Calendar f4490b;

    /* renamed from: c */
    public final int f4491c;

    /* renamed from: d */
    public final int f4492d;

    public C1068f() {
        Calendar k = C1093o.m5823k();
        this.f4490b = k;
        this.f4491c = k.getMaximum(7);
        this.f4492d = k.getFirstDayOfWeek();
    }

    /* renamed from: a */
    public Integer getItem(int position) {
        if (position >= this.f4491c) {
            return null;
        }
        return Integer.valueOf(mo6211b(position));
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getCount() {
        return this.f4491c;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0017
            android.content.Context r2 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = p066b.p067a.p068a.p069a.C0976h.mtrl_calendar_day_of_week
            android.view.View r3 = r2.inflate(r3, r11, r1)
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r2 = r8.f4490b
            int r3 = r8.mo6211b(r9)
            r4 = 7
            r2.set(r4, r3)
            java.util.Calendar r2 = r8.f4490b
            int r3 = f4489e
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r2 = r2.getDisplayName(r4, r3, r5)
            r0.setText(r2)
            android.content.Context r2 = r11.getContext()
            int r3 = p066b.p067a.p068a.p069a.C0986i.mtrl_picker_day_of_week_column_header
            java.lang.String r2 = r2.getString(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.Calendar r5 = r8.f4490b
            r6 = 2
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r4 = r5.getDisplayName(r4, r6, r7)
            r3[r1] = r4
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.setContentDescription(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p092v.C1068f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: b */
    public final int mo6211b(int position) {
        int dayConstant = this.f4492d + position;
        int i = this.f4491c;
        if (dayConstant > i) {
            return dayConstant - i;
        }
        return dayConstant;
    }
}
