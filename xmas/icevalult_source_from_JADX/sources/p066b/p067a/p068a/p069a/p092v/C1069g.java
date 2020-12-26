package p066b.p067a.p068a.p069a.p092v;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p000a.p025h.p037l.C0415d;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p055o.p056d.C0638h;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.C0946g;
import p066b.p067a.p068a.p069a.C0976h;
import p066b.p067a.p068a.p069a.C0986i;

/* renamed from: b.a.a.a.v.g */
public final class C1069g<S> extends C1090m<S> {

    /* renamed from: j0 */
    public static final Object f4493j0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: k0 */
    public static final Object f4494k0 = "NAVIGATION_PREV_TAG";

    /* renamed from: l0 */
    public static final Object f4495l0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: m0 */
    public static final Object f4496m0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: Z */
    public int f4497Z;

    /* renamed from: a0 */
    public C1066d<S> f4498a0;

    /* renamed from: b0 */
    public C1061a f4499b0;

    /* renamed from: c0 */
    public C1083i f4500c0;

    /* renamed from: d0 */
    public C1080k f4501d0;

    /* renamed from: e0 */
    public C1065c f4502e0;

    /* renamed from: f0 */
    public RecyclerView f4503f0;

    /* renamed from: g0 */
    public RecyclerView f4504g0;

    /* renamed from: h0 */
    public View f4505h0;

    /* renamed from: i0 */
    public View f4506i0;

    /* renamed from: b.a.a.a.v.g$k */
    public enum C1080k {
        DAY,
        YEAR
    }

    /* renamed from: b.a.a.a.v.g$l */
    public interface C1081l {
        /* renamed from: a */
        void mo6228a(long j);
    }

    /* renamed from: v0 */
    public void mo4677v0(Bundle bundle) {
        super.mo4677v0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f4497Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f4498a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4499b0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4500c0);
    }

    /* renamed from: Z */
    public void mo4619Z(Bundle bundle) {
        super.mo4619Z(bundle);
        Bundle activeBundle = bundle == null ? mo4656n() : bundle;
        this.f4497Z = activeBundle.getInt("THEME_RES_ID_KEY");
        this.f4498a0 = (C1066d) activeBundle.getParcelable("GRID_SELECTOR_KEY");
        this.f4499b0 = (C1061a) activeBundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f4500c0 = (C1083i) activeBundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: d0 */
    public View mo4628d0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int orientation;
        int layout;
        ContextThemeWrapper themedContext = new ContextThemeWrapper(mo4663p(), this.f4497Z);
        this.f4502e0 = new C1065c(themedContext);
        LayoutInflater themedInflater = layoutInflater.cloneInContext(themedContext);
        C1083i earliestMonth = this.f4499b0.mo6195j();
        if (C1082h.m5778l1(themedContext)) {
            layout = C0976h.mtrl_calendar_vertical;
            orientation = 1;
        } else {
            layout = C0976h.mtrl_calendar_horizontal;
            orientation = 0;
        }
        View root = themedInflater.inflate(layout, viewGroup, false);
        GridView daysHeader = (GridView) root.findViewById(C0943f.mtrl_calendar_days_of_week);
        C0460r.m2257c0(daysHeader, new C1071b(this));
        daysHeader.setAdapter(new C1068f());
        daysHeader.setNumColumns(earliestMonth.f4531f);
        daysHeader.setEnabled(false);
        this.f4504g0 = (RecyclerView) root.findViewById(C0943f.mtrl_calendar_months);
        GridView gridView = daysHeader;
        this.f4504g0.setLayoutManager(new C1072c(mo4663p(), orientation, false, orientation));
        this.f4504g0.setTag(f4493j0);
        C1086k monthsPagerAdapter = new C1086k(themedContext, this.f4498a0, this.f4499b0, new C1073d());
        this.f4504g0.setAdapter(monthsPagerAdapter);
        int columns = themedContext.getResources().getInteger(C0946g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(C0943f.mtrl_calendar_year_selector_frame);
        this.f4503f0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f4503f0.setLayoutManager(new GridLayoutManager((Context) themedContext, columns, 1, false));
            this.f4503f0.setAdapter(new C1094p(this));
            this.f4503f0.addItemDecoration(mo6221t1());
        }
        if (root.findViewById(C0943f.month_navigation_fragment_toggle) != null) {
            mo6220s1(root, monthsPagerAdapter);
        }
        if (!C1082h.m5778l1(themedContext)) {
            new C0638h().mo3388b(this.f4504g0);
        }
        this.f4504g0.scrollToPosition(monthsPagerAdapter.mo6265x(this.f4500c0));
        return root;
    }

    /* renamed from: b.a.a.a.v.g$b */
    public class C1071b extends C0420a {
        public C1071b(C1069g this$0) {
        }

        /* renamed from: g */
        public void mo2424g(View view, C0424c accessibilityNodeInfoCompat) {
            super.mo2424g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo2461X((Object) null);
        }
    }

    /* renamed from: b.a.a.a.v.g$c */
    public class C1072c extends C1091n {

        /* renamed from: I */
        public final /* synthetic */ int f4509I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1072c(Context context, int orientation, boolean reverseLayout, int i) {
            super(context, orientation, reverseLayout);
            this.f4509I = i;
        }

        /* renamed from: M1 */
        public void mo4768M1(RecyclerView.C0856a0 state, int[] ints) {
            if (this.f4509I == 0) {
                ints[0] = C1069g.this.f4504g0.getWidth();
                ints[1] = C1069g.this.f4504g0.getWidth();
                return;
            }
            ints[0] = C1069g.this.f4504g0.getHeight();
            ints[1] = C1069g.this.f4504g0.getHeight();
        }
    }

    /* renamed from: b.a.a.a.v.g$d */
    public class C1073d implements C1081l {
        public C1073d() {
        }

        /* renamed from: a */
        public void mo6228a(long day) {
            if (C1069g.this.f4499b0.mo6190f().mo6202e(day)) {
                C1069g.this.f4498a0.mo6207b(day);
                Iterator it = C1069g.this.f4546Y.iterator();
                while (it.hasNext()) {
                    ((C1089l) it.next()).mo6269a(C1069g.this.f4498a0.mo6206a());
                }
                C1069g.this.f4504g0.getAdapter().mo5094h();
                if (C1069g.this.f4503f0 != null) {
                    C1069g.this.f4503f0.getAdapter().mo5094h();
                }
            }
        }
    }

    /* renamed from: b.a.a.a.v.g$e */
    public class C1074e extends RecyclerView.C0875n {

        /* renamed from: a */
        public final Calendar f4512a = C1093o.m5823k();

        /* renamed from: b */
        public final Calendar f4513b = C1093o.m5823k();

        public C1074e() {
        }

        /* renamed from: g */
        public void mo5130g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0856a0 state) {
            int firstHighlightPosition;
            Iterator<C0415d<Long, Long>> it;
            C0415d dVar;
            GridLayoutManager layoutManager;
            C1094p adapter;
            int i;
            if ((recyclerView.getAdapter() instanceof C1094p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C1094p adapter2 = (C1094p) recyclerView.getAdapter();
                GridLayoutManager layoutManager2 = (GridLayoutManager) recyclerView.getLayoutManager();
                Iterator<C0415d<Long, Long>> it2 = C1069g.this.f4498a0.mo6208c().iterator();
                while (it2.hasNext()) {
                    C0415d next = it2.next();
                    F f = next.f1983a;
                    if (f == null) {
                        GridLayoutManager gridLayoutManager = layoutManager2;
                        Iterator<C0415d<Long, Long>> it3 = it2;
                        C0415d dVar2 = next;
                    } else if (next.f1984b != null) {
                        this.f4512a.setTimeInMillis(((Long) f).longValue());
                        this.f4513b.setTimeInMillis(((Long) next.f1984b).longValue());
                        int firstHighlightPosition2 = adapter2.mo6271w(this.f4512a.get(1));
                        int lastHighlightPosition = adapter2.mo6271w(this.f4513b.get(1));
                        View firstView = layoutManager2.mo4754C(firstHighlightPosition2);
                        View lastView = layoutManager2.mo4754C(lastHighlightPosition);
                        int firstRow = firstHighlightPosition2 / layoutManager2.mo4722X2();
                        int lastRow = lastHighlightPosition / layoutManager2.mo4722X2();
                        int row = firstRow;
                        while (row <= lastRow) {
                            View viewInRow = layoutManager2.mo4754C(layoutManager2.mo4722X2() * row);
                            if (viewInRow == null) {
                                adapter = adapter2;
                                layoutManager = layoutManager2;
                                it = it2;
                                dVar = next;
                                firstHighlightPosition = firstHighlightPosition2;
                            } else {
                                int top = viewInRow.getTop() + C1069g.this.f4502e0.f4484d.mo6204c();
                                adapter = adapter2;
                                int bottom = viewInRow.getBottom() - C1069g.this.f4502e0.f4484d.mo6203b();
                                int left = row == firstRow ? firstView.getLeft() + (firstView.getWidth() / 2) : 0;
                                if (row == lastRow) {
                                    i = lastView.getLeft() + (lastView.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                int right = i;
                                layoutManager = layoutManager2;
                                int i2 = left;
                                it = it2;
                                int right2 = right;
                                dVar = next;
                                int i3 = right2;
                                firstHighlightPosition = firstHighlightPosition2;
                                canvas.drawRect((float) left, (float) top, (float) right2, (float) bottom, C1069g.this.f4502e0.f4488h);
                            }
                            row++;
                            adapter2 = adapter;
                            layoutManager2 = layoutManager;
                            next = dVar;
                            it2 = it;
                            firstHighlightPosition2 = firstHighlightPosition;
                        }
                        GridLayoutManager gridLayoutManager2 = layoutManager2;
                        Iterator<C0415d<Long, Long>> it4 = it2;
                        C0415d dVar3 = next;
                        int i4 = firstHighlightPosition2;
                    }
                }
            }
        }
    }

    /* renamed from: t1 */
    public final RecyclerView.C0875n mo6221t1() {
        return new C1074e();
    }

    /* renamed from: w1 */
    public C1083i mo6224w1() {
        return this.f4500c0;
    }

    /* renamed from: u1 */
    public C1061a mo6222u1() {
        return this.f4499b0;
    }

    /* renamed from: B1 */
    public void mo6217B1(C1083i moveTo) {
        C1086k adapter = (C1086k) this.f4504g0.getAdapter();
        int moveToPosition = adapter.mo6265x(moveTo);
        int distance = moveToPosition - adapter.mo6265x(this.f4500c0);
        boolean isForward = true;
        boolean jump = Math.abs(distance) > 3;
        if (distance <= 0) {
            isForward = false;
        }
        this.f4500c0 = moveTo;
        if (jump && isForward) {
            this.f4504g0.scrollToPosition(moveToPosition - 3);
            mo6216A1(moveToPosition);
        } else if (jump) {
            this.f4504g0.scrollToPosition(moveToPosition + 3);
            mo6216A1(moveToPosition);
        } else {
            mo6216A1(moveToPosition);
        }
    }

    /* renamed from: x1 */
    public C1066d<S> mo6225x1() {
        return this.f4498a0;
    }

    /* renamed from: v1 */
    public C1065c mo6223v1() {
        return this.f4502e0;
    }

    /* renamed from: y1 */
    public static int m5755y1(Context context) {
        return context.getResources().getDimensionPixelSize(C0928d.mtrl_calendar_day_height);
    }

    /* renamed from: C1 */
    public void mo6218C1(C1080k selector) {
        this.f4501d0 = selector;
        if (selector == C1080k.YEAR) {
            this.f4503f0.getLayoutManager().mo4813x1(((C1094p) this.f4503f0.getAdapter()).mo6271w(this.f4500c0.f4530e));
            this.f4505h0.setVisibility(0);
            this.f4506i0.setVisibility(8);
        } else if (selector == C1080k.DAY) {
            this.f4505h0.setVisibility(8);
            this.f4506i0.setVisibility(0);
            mo6217B1(this.f4500c0);
        }
    }

    /* renamed from: D1 */
    public void mo6219D1() {
        C1080k kVar = this.f4501d0;
        C1080k kVar2 = C1080k.YEAR;
        if (kVar == kVar2) {
            mo6218C1(C1080k.DAY);
        } else if (kVar == C1080k.DAY) {
            mo6218C1(kVar2);
        }
    }

    /* renamed from: s1 */
    public final void mo6220s1(View root, C1086k monthsPagerAdapter) {
        MaterialButton monthDropSelect = (MaterialButton) root.findViewById(C0943f.month_navigation_fragment_toggle);
        monthDropSelect.setTag(f4496m0);
        C0460r.m2257c0(monthDropSelect, new C1075f());
        MaterialButton monthPrev = (MaterialButton) root.findViewById(C0943f.month_navigation_previous);
        monthPrev.setTag(f4494k0);
        MaterialButton monthNext = (MaterialButton) root.findViewById(C0943f.month_navigation_next);
        monthNext.setTag(f4495l0);
        this.f4505h0 = root.findViewById(C0943f.mtrl_calendar_year_selector_frame);
        this.f4506i0 = root.findViewById(C0943f.mtrl_calendar_day_selector_frame);
        mo6218C1(C1080k.DAY);
        monthDropSelect.setText(this.f4500c0.mo6239j());
        this.f4504g0.addOnScrollListener(new C1076g(monthsPagerAdapter, monthDropSelect));
        monthDropSelect.setOnClickListener(new C1077h());
        monthNext.setOnClickListener(new C1078i(monthsPagerAdapter));
        monthPrev.setOnClickListener(new C1079j(monthsPagerAdapter));
    }

    /* renamed from: b.a.a.a.v.g$f */
    public class C1075f extends C0420a {
        public C1075f() {
        }

        /* renamed from: g */
        public void mo2424g(View view, C0424c accessibilityNodeInfoCompat) {
            String str;
            super.mo2424g(view, accessibilityNodeInfoCompat);
            if (C1069g.this.f4506i0.getVisibility() == 0) {
                str = C1069g.this.mo4586I(C0986i.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C1069g.this.mo4586I(C0986i.mtrl_picker_toggle_to_day_selection);
            }
            accessibilityNodeInfoCompat.mo2478g0(str);
        }
    }

    /* renamed from: b.a.a.a.v.g$g */
    public class C1076g extends RecyclerView.C0885t {

        /* renamed from: a */
        public final /* synthetic */ C1086k f4516a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f4517b;

        public C1076g(C1086k kVar, MaterialButton materialButton) {
            this.f4516a = kVar;
            this.f4517b = materialButton;
        }

        /* renamed from: b */
        public void mo3291b(RecyclerView recyclerView, int dx, int dy) {
            int currentItem;
            if (dx < 0) {
                currentItem = C1069g.this.mo6226z1().mo4781Z1();
            } else {
                currentItem = C1069g.this.mo6226z1().mo4786c2();
            }
            C1083i unused = C1069g.this.f4500c0 = this.f4516a.mo6263v(currentItem);
            this.f4517b.setText(this.f4516a.mo6264w(currentItem));
        }

        /* renamed from: a */
        public void mo3396a(RecyclerView recyclerView, int newState) {
            if (newState == 0) {
                CharSequence announcementText = this.f4517b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(announcementText);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }
    }

    /* renamed from: b.a.a.a.v.g$h */
    public class C1077h implements View.OnClickListener {
        public C1077h() {
        }

        public void onClick(View view) {
            C1069g.this.mo6219D1();
        }
    }

    /* renamed from: b.a.a.a.v.g$i */
    public class C1078i implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C1086k f4520b;

        public C1078i(C1086k kVar) {
            this.f4520b = kVar;
        }

        public void onClick(View view) {
            int currentItem = C1069g.this.mo6226z1().mo4781Z1();
            if (currentItem + 1 < C1069g.this.f4504g0.getAdapter().mo5089c()) {
                C1069g.this.mo6217B1(this.f4520b.mo6263v(currentItem + 1));
            }
        }
    }

    /* renamed from: b.a.a.a.v.g$j */
    public class C1079j implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ C1086k f4522b;

        public C1079j(C1086k kVar) {
            this.f4522b = kVar;
        }

        public void onClick(View view) {
            int currentItem = C1069g.this.mo6226z1().mo4786c2();
            if (currentItem - 1 >= 0) {
                C1069g.this.mo6217B1(this.f4522b.mo6263v(currentItem - 1));
            }
        }
    }

    /* renamed from: b.a.a.a.v.g$a */
    public class C1070a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f4507b;

        public C1070a(int i) {
            this.f4507b = i;
        }

        public void run() {
            C1069g.this.f4504g0.smoothScrollToPosition(this.f4507b);
        }
    }

    /* renamed from: A1 */
    public final void mo6216A1(int position) {
        this.f4504g0.post(new C1070a(position));
    }

    /* renamed from: z1 */
    public LinearLayoutManager mo6226z1() {
        return (LinearLayoutManager) this.f4504g0.getLayoutManager();
    }
}
