package p066b.p067a.p068a.p069a.p092v;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;
import p066b.p067a.p068a.p069a.C0976h;
import p066b.p067a.p068a.p069a.C0986i;
import p066b.p067a.p068a.p069a.p092v.C1069g;

/* renamed from: b.a.a.a.v.p */
public class C1094p extends RecyclerView.C0865g<C1096b> {

    /* renamed from: c */
    public final C1069g<?> f4547c;

    /* renamed from: b.a.a.a.v.p$b */
    public static class C1096b extends RecyclerView.C0862d0 {

        /* renamed from: t */
        public final TextView f4550t;

        public C1096b(TextView view) {
            super(view);
            this.f4550t = view;
        }
    }

    public C1094p(C1069g<?> materialCalendar) {
        this.f4547c = materialCalendar;
    }

    /* renamed from: z */
    public C1096b mo5098l(ViewGroup viewGroup, int viewType) {
        return new C1096b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0976h.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: y */
    public void mo5096j(C1096b viewHolder, int position) {
        int year = mo6272x(position);
        String navigateYear = viewHolder.f4550t.getContext().getString(C0986i.mtrl_picker_navigate_to_year_description);
        viewHolder.f4550t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(year)}));
        viewHolder.f4550t.setContentDescription(String.format(navigateYear, new Object[]{Integer.valueOf(year)}));
        C1065c styles = this.f4547c.mo6223v1();
        Calendar calendar = C1093o.m5821i();
        C1064b style = calendar.get(1) == year ? styles.f4486f : styles.f4484d;
        for (Long day : this.f4547c.mo6225x1().mo6209d()) {
            calendar.setTimeInMillis(day.longValue());
            if (calendar.get(1) == year) {
                style = styles.f4485e;
            }
        }
        style.mo6205d(viewHolder.f4550t);
        viewHolder.f4550t.setOnClickListener(mo6270v(year));
    }

    /* renamed from: b.a.a.a.v.p$a */
    public class C1095a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ int f4548b;

        public C1095a(int i) {
            this.f4548b = i;
        }

        public void onClick(View view) {
            C1094p.this.f4547c.mo6217B1(C1083i.m5779g(this.f4548b, C1094p.this.f4547c.mo6224w1().f4529d));
            C1094p.this.f4547c.mo6218C1(C1069g.C1080k.DAY);
        }
    }

    /* renamed from: v */
    public final View.OnClickListener mo6270v(int year) {
        return new C1095a(year);
    }

    /* renamed from: c */
    public int mo5089c() {
        return this.f4547c.mo6222u1().mo6196k();
    }

    /* renamed from: w */
    public int mo6271w(int year) {
        return year - this.f4547c.mo6222u1().mo6195j().f4530e;
    }

    /* renamed from: x */
    public int mo6272x(int position) {
        return this.f4547c.mo6222u1().mo6195j().f4530e + position;
    }
}
