package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.C0976h;
import p066b.p067a.p068a.p069a.p092v.C1069g;

/* renamed from: b.a.a.a.v.k */
public class C1086k extends RecyclerView.C0865g<C1088b> {

    /* renamed from: c */
    public final C1061a f4538c;

    /* renamed from: d */
    public final C1066d<?> f4539d;

    /* renamed from: e */
    public final C1069g.C1081l f4540e;

    /* renamed from: f */
    public final int f4541f;

    public C1086k(Context context, C1066d<?> dateSelector, C1061a calendarConstraints, C1069g.C1081l onDayClickListener) {
        C1083i firstPage = calendarConstraints.mo6195j();
        C1083i lastPage = calendarConstraints.mo6191g();
        C1083i currentPage = calendarConstraints.mo6194i();
        if (firstPage.compareTo(currentPage) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (currentPage.compareTo(lastPage) <= 0) {
            this.f4541f = (C1085j.f4533f * C1069g.m5755y1(context)) + (C1082h.m5778l1(context) ? C1069g.m5755y1(context) : 0);
            this.f4538c = calendarConstraints;
            this.f4539d = dateSelector;
            this.f4540e = onDayClickListener;
            mo5105s(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: b.a.a.a.v.k$b */
    public static class C1088b extends RecyclerView.C0862d0 {

        /* renamed from: t */
        public final TextView f4544t;

        /* renamed from: u */
        public final MaterialCalendarGridView f4545u;

        public C1088b(LinearLayout container, boolean showLabel) {
            super(container);
            TextView textView = (TextView) container.findViewById(C0943f.month_title);
            this.f4544t = textView;
            C0460r.m2259d0(textView, true);
            this.f4545u = (MaterialCalendarGridView) container.findViewById(C0943f.month_grid);
            if (!showLabel) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: z */
    public C1088b mo5098l(ViewGroup viewGroup, int viewType) {
        LinearLayout container = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0976h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C1082h.m5778l1(viewGroup.getContext())) {
            return new C1088b(container, false);
        }
        container.setLayoutParams(new RecyclerView.C0881p(-1, this.f4541f));
        return new C1088b(container, true);
    }

    /* renamed from: y */
    public void mo5096j(C1088b viewHolder, int position) {
        C1083i month = this.f4538c.mo6195j().mo6241l(position);
        viewHolder.f4544t.setText(month.mo6239j());
        MaterialCalendarGridView monthGrid = (MaterialCalendarGridView) viewHolder.f4545u.findViewById(C0943f.month_grid);
        if (monthGrid.getAdapter() == null || !month.equals(monthGrid.getAdapter().f4534b)) {
            C1085j monthAdapter = new C1085j(month, this.f4539d, this.f4538c);
            monthGrid.setNumColumns(month.f4531f);
            monthGrid.setAdapter((ListAdapter) monthAdapter);
        } else {
            monthGrid.getAdapter().notifyDataSetChanged();
        }
        monthGrid.setOnItemClickListener(new C1087a(monthGrid));
    }

    /* renamed from: b.a.a.a.v.k$a */
    public class C1087a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        public final /* synthetic */ MaterialCalendarGridView f4542b;

        public C1087a(MaterialCalendarGridView materialCalendarGridView) {
            this.f4542b = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            if (this.f4542b.getAdapter().mo6262j(position)) {
                C1086k.this.f4540e.mo6228a(this.f4542b.getAdapter().getItem(position).longValue());
            }
        }
    }

    /* renamed from: d */
    public long mo5090d(int position) {
        return this.f4538c.mo6195j().mo6241l(position).mo6240k();
    }

    /* renamed from: c */
    public int mo5089c() {
        return this.f4538c.mo6192h();
    }

    /* renamed from: w */
    public CharSequence mo6264w(int position) {
        return mo6263v(position).mo6239j();
    }

    /* renamed from: v */
    public C1083i mo6263v(int position) {
        return this.f4538c.mo6195j().mo6241l(position);
    }

    /* renamed from: x */
    public int mo6265x(C1083i month) {
        return this.f4538c.mo6195j().mo6242m(month);
    }
}
