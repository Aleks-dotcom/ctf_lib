package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.p010j.C0118p;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p040n.C0489h;

/* renamed from: a.b.p.j0 */
public class C0162j0 implements C0118p {

    /* renamed from: G */
    public static Method f901G;

    /* renamed from: H */
    public static Method f902H;

    /* renamed from: I */
    public static Method f903I;

    /* renamed from: A */
    public final C0165c f904A;

    /* renamed from: B */
    public final Handler f905B;

    /* renamed from: C */
    public final Rect f906C;

    /* renamed from: D */
    public Rect f907D;

    /* renamed from: E */
    public boolean f908E;

    /* renamed from: F */
    public PopupWindow f909F;

    /* renamed from: b */
    public Context f910b;

    /* renamed from: c */
    public ListAdapter f911c;

    /* renamed from: d */
    public C0147f0 f912d;

    /* renamed from: e */
    public int f913e;

    /* renamed from: f */
    public int f914f;

    /* renamed from: g */
    public int f915g;

    /* renamed from: h */
    public int f916h;

    /* renamed from: i */
    public int f917i;

    /* renamed from: j */
    public boolean f918j;

    /* renamed from: k */
    public boolean f919k;

    /* renamed from: l */
    public boolean f920l;

    /* renamed from: m */
    public int f921m;

    /* renamed from: n */
    public boolean f922n;

    /* renamed from: o */
    public boolean f923o;

    /* renamed from: p */
    public int f924p;

    /* renamed from: q */
    public View f925q;

    /* renamed from: r */
    public int f926r;

    /* renamed from: s */
    public DataSetObserver f927s;

    /* renamed from: t */
    public View f928t;

    /* renamed from: u */
    public Drawable f929u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f930v;

    /* renamed from: w */
    public AdapterView.OnItemSelectedListener f931w;

    /* renamed from: x */
    public final C0169g f932x;

    /* renamed from: y */
    public final C0168f f933y;

    /* renamed from: z */
    public final C0167e f934z;

    static {
        Class cls = Boolean.TYPE;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            try {
                f901G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{cls});
            } catch (NoSuchMethodException e) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f903I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException e2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f902H = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, cls});
            } catch (NoSuchMethodException e3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0162j0(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public C0162j0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.f913e = -2;
        this.f914f = -2;
        this.f917i = 1002;
        this.f921m = 0;
        this.f922n = false;
        this.f923o = false;
        this.f924p = Integer.MAX_VALUE;
        this.f926r = 0;
        this.f932x = new C0169g();
        this.f933y = new C0168f();
        this.f934z = new C0167e();
        this.f904A = new C0165c();
        this.f906C = new Rect();
        this.f910b = context;
        this.f905B = new Handler(context.getMainLooper());
        TypedArray a = context.obtainStyledAttributes(attrs, C0012j.f129d1, defStyleAttr, defStyleRes);
        this.f915g = a.getDimensionPixelOffset(C0012j.f134e1, 0);
        int dimensionPixelOffset = a.getDimensionPixelOffset(C0012j.f139f1, 0);
        this.f916h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f918j = true;
        }
        a.recycle();
        C0193q qVar = new C0193q(context, attrs, defStyleAttr, defStyleRes);
        this.f909F = qVar;
        qVar.setInputMethodMode(1);
    }

    /* renamed from: o */
    public void mo1200o(ListAdapter adapter) {
        DataSetObserver dataSetObserver = this.f927s;
        if (dataSetObserver == null) {
            this.f927s = new C0166d();
        } else {
            ListAdapter listAdapter = this.f911c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f911c = adapter;
        if (adapter != null) {
            adapter.registerDataSetObserver(this.f927s);
        }
        C0147f0 f0Var = this.f912d;
        if (f0Var != null) {
            f0Var.setAdapter(this.f911c);
        }
    }

    /* renamed from: K */
    public void mo1191K(int position) {
        this.f926r = position;
    }

    /* renamed from: F */
    public void mo1186F(boolean modal) {
        this.f908E = modal;
        this.f909F.setFocusable(modal);
    }

    /* renamed from: x */
    public boolean mo1208x() {
        return this.f908E;
    }

    /* renamed from: n */
    public Drawable mo1199n() {
        return this.f909F.getBackground();
    }

    /* renamed from: b */
    public void mo1194b(Drawable d) {
        this.f909F.setBackgroundDrawable(d);
    }

    /* renamed from: A */
    public void mo1181A(int animationStyle) {
        this.f909F.setAnimationStyle(animationStyle);
    }

    /* renamed from: t */
    public View mo1204t() {
        return this.f928t;
    }

    /* renamed from: z */
    public void mo1210z(View anchor) {
        this.f928t = anchor;
    }

    /* renamed from: e */
    public int mo1196e() {
        return this.f915g;
    }

    /* renamed from: d */
    public void mo1195d(int offset) {
        this.f915g = offset;
    }

    /* renamed from: k */
    public int mo1197k() {
        if (!this.f918j) {
            return 0;
        }
        return this.f916h;
    }

    /* renamed from: m */
    public void mo1198m(int offset) {
        this.f916h = offset;
        this.f918j = true;
    }

    /* renamed from: D */
    public void mo1184D(Rect bounds) {
        this.f907D = bounds != null ? new Rect(bounds) : null;
    }

    /* renamed from: C */
    public void mo1183C(int gravity) {
        this.f921m = gravity;
    }

    /* renamed from: v */
    public int mo1206v() {
        return this.f914f;
    }

    /* renamed from: M */
    public void mo1193M(int width) {
        this.f914f = width;
    }

    /* renamed from: B */
    public void mo1182B(int width) {
        Drawable popupBackground = this.f909F.getBackground();
        if (popupBackground != null) {
            popupBackground.getPadding(this.f906C);
            Rect rect = this.f906C;
            this.f914f = rect.left + rect.right + width;
            return;
        }
        mo1193M(width);
    }

    /* renamed from: H */
    public void mo1188H(AdapterView.OnItemClickListener clickListener) {
        this.f930v = clickListener;
    }

    /* renamed from: j */
    public void mo576j() {
        int widthSpec;
        int heightSpec;
        int widthSpec2;
        int heightSpec2;
        int height = mo1201q();
        boolean noInputMethod = mo1207w();
        C0489h.m2424b(this.f909F, this.f917i);
        boolean z = true;
        if (!this.f909F.isShowing()) {
            int widthSpec3 = this.f914f;
            if (widthSpec3 == -1) {
                widthSpec = -1;
            } else if (widthSpec3 == -2) {
                widthSpec = mo1204t().getWidth();
            } else {
                widthSpec = this.f914f;
            }
            int i = this.f913e;
            if (i == -1) {
                heightSpec = -1;
            } else if (i == -2) {
                heightSpec = height;
            } else {
                heightSpec = this.f913e;
            }
            this.f909F.setWidth(widthSpec);
            this.f909F.setHeight(heightSpec);
            mo1190J(true);
            this.f909F.setOutsideTouchable(!this.f923o && !this.f922n);
            this.f909F.setTouchInterceptor(this.f933y);
            if (this.f920l) {
                C0489h.m2423a(this.f909F, this.f919k);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f903I;
                if (method != null) {
                    try {
                        method.invoke(this.f909F, new Object[]{this.f907D});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f909F.setEpicenterBounds(this.f907D);
            }
            C0489h.m2425c(this.f909F, mo1204t(), this.f915g, this.f916h, this.f921m);
            this.f912d.setSelection(-1);
            if (!this.f908E || this.f912d.isInTouchMode()) {
                mo1202r();
            }
            if (!this.f908E) {
                this.f905B.post(this.f904A);
            }
        } else if (C0460r.m2234I(mo1204t())) {
            int widthSpec4 = this.f914f;
            if (widthSpec4 == -1) {
                widthSpec2 = -1;
            } else if (widthSpec4 == -2) {
                widthSpec2 = mo1204t().getWidth();
            } else {
                widthSpec2 = this.f914f;
            }
            int i2 = this.f913e;
            if (i2 == -1) {
                heightSpec2 = noInputMethod ? height : -1;
                if (noInputMethod) {
                    this.f909F.setWidth(this.f914f == -1 ? -1 : 0);
                    this.f909F.setHeight(0);
                } else {
                    this.f909F.setWidth(this.f914f == -1 ? -1 : 0);
                    this.f909F.setHeight(-1);
                }
            } else {
                heightSpec2 = i2 == -2 ? height : this.f913e;
            }
            PopupWindow popupWindow = this.f909F;
            if (this.f923o || this.f922n) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f909F.update(mo1204t(), this.f915g, this.f916h, widthSpec2 < 0 ? -1 : widthSpec2, heightSpec2 < 0 ? -1 : heightSpec2);
        }
    }

    public void dismiss() {
        this.f909F.dismiss();
        mo1209y();
        this.f909F.setContentView((View) null);
        this.f912d = null;
        this.f905B.removeCallbacks(this.f932x);
    }

    /* renamed from: G */
    public void mo1187G(PopupWindow.OnDismissListener listener) {
        this.f909F.setOnDismissListener(listener);
    }

    /* renamed from: y */
    public final void mo1209y() {
        View view = this.f925q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f925q);
            }
        }
    }

    /* renamed from: E */
    public void mo1185E(int mode) {
        this.f909F.setInputMethodMode(mode);
    }

    /* renamed from: L */
    public void mo1192L(int position) {
        C0147f0 list = this.f912d;
        if (mo572a() && list != null) {
            list.setListSelectionHidden(false);
            list.setSelection(position);
            if (list.getChoiceMode() != 0) {
                list.setItemChecked(position, true);
            }
        }
    }

    /* renamed from: r */
    public void mo1202r() {
        C0147f0 list = this.f912d;
        if (list != null) {
            list.setListSelectionHidden(true);
            list.requestLayout();
        }
    }

    /* renamed from: a */
    public boolean mo572a() {
        return this.f909F.isShowing();
    }

    /* renamed from: w */
    public boolean mo1207w() {
        return this.f909F.getInputMethodMode() == 2;
    }

    /* renamed from: f */
    public ListView mo574f() {
        return this.f912d;
    }

    /* renamed from: s */
    public C0147f0 mo1203s(Context context, boolean hijackFocus) {
        return new C0147f0(context, hijackFocus);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: a.b.p.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: a.b.p.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: a.b.p.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1201q() {
        /*
            r15 = this;
            r0 = 0
            a.b.p.f0 r1 = r15.f912d
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x00bf
            android.content.Context r1 = r15.f910b
            a.b.p.j0$a r5 = new a.b.p.j0$a
            r5.<init>()
            boolean r5 = r15.f908E
            r5 = r5 ^ r4
            a.b.p.f0 r5 = r15.mo1203s(r1, r5)
            r15.f912d = r5
            android.graphics.drawable.Drawable r6 = r15.f929u
            if (r6 == 0) goto L_0x001f
            r5.setSelector(r6)
        L_0x001f:
            a.b.p.f0 r5 = r15.f912d
            android.widget.ListAdapter r6 = r15.f911c
            r5.setAdapter(r6)
            a.b.p.f0 r5 = r15.f912d
            android.widget.AdapterView$OnItemClickListener r6 = r15.f930v
            r5.setOnItemClickListener(r6)
            a.b.p.f0 r5 = r15.f912d
            r5.setFocusable(r4)
            a.b.p.f0 r5 = r15.f912d
            r5.setFocusableInTouchMode(r4)
            a.b.p.f0 r5 = r15.f912d
            a.b.p.j0$b r6 = new a.b.p.j0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            a.b.p.f0 r5 = r15.f912d
            a.b.p.j0$e r6 = r15.f934z
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r15.f931w
            if (r5 == 0) goto L_0x0051
            a.b.p.f0 r6 = r15.f912d
            r6.setOnItemSelectedListener(r5)
        L_0x0051:
            a.b.p.f0 r5 = r15.f912d
            android.view.View r6 = r15.f925q
            if (r6 == 0) goto L_0x00b9
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r1)
            r7.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r2, r3, r9)
            int r9 = r15.f926r
            if (r9 == 0) goto L_0x008c
            if (r9 == r4) goto L_0x0085
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Invalid hint position "
            r9.append(r10)
            int r10 = r15.f926r
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "ListPopupWindow"
            android.util.Log.e(r10, r9)
            goto L_0x0093
        L_0x0085:
            r7.addView(r5, r8)
            r7.addView(r6)
            goto L_0x0093
        L_0x008c:
            r7.addView(r6)
            r7.addView(r5, r8)
        L_0x0093:
            int r9 = r15.f914f
            if (r9 < 0) goto L_0x009c
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r15.f914f
            goto L_0x009e
        L_0x009c:
            r9 = 0
            r10 = 0
        L_0x009e:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r12 = 0
            r6.measure(r11, r3)
            android.view.ViewGroup$LayoutParams r13 = r6.getLayoutParams()
            r8 = r13
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            int r13 = r6.getMeasuredHeight()
            int r14 = r8.topMargin
            int r13 = r13 + r14
            int r14 = r8.bottomMargin
            int r13 = r13 + r14
            r5 = r7
            r0 = r13
        L_0x00b9:
            android.widget.PopupWindow r7 = r15.f909F
            r7.setContentView(r5)
            goto L_0x00de
        L_0x00bf:
            android.widget.PopupWindow r1 = r15.f909F
            android.view.View r1 = r1.getContentView()
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r1 = r15.f925q
            if (r1 == 0) goto L_0x00de
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r1.getMeasuredHeight()
            int r8 = r6.topMargin
            int r7 = r7 + r8
            int r8 = r6.bottomMargin
            int r0 = r7 + r8
        L_0x00de:
            android.widget.PopupWindow r1 = r15.f909F
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L_0x00fa
            android.graphics.Rect r6 = r15.f906C
            r1.getPadding(r6)
            android.graphics.Rect r6 = r15.f906C
            int r7 = r6.top
            int r6 = r6.bottom
            int r6 = r6 + r7
            boolean r8 = r15.f918j
            if (r8 != 0) goto L_0x0100
            int r7 = -r7
            r15.f916h = r7
            goto L_0x0100
        L_0x00fa:
            android.graphics.Rect r6 = r15.f906C
            r6.setEmpty()
            r6 = 0
        L_0x0100:
            android.widget.PopupWindow r7 = r15.f909F
            int r7 = r7.getInputMethodMode()
            r8 = 2
            if (r7 != r8) goto L_0x010a
            r3 = 1
        L_0x010a:
            android.view.View r4 = r15.mo1204t()
            int r7 = r15.f916h
            int r4 = r15.mo1205u(r4, r7, r3)
            boolean r7 = r15.f922n
            if (r7 != 0) goto L_0x0180
            int r7 = r15.f913e
            if (r7 != r2) goto L_0x011d
            goto L_0x0180
        L_0x011d:
            int r7 = r15.f914f
            r8 = -2
            if (r7 == r8) goto L_0x0144
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r2) goto L_0x012b
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            goto L_0x015f
        L_0x012b:
            android.content.Context r2 = r15.f910b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r7 = r15.f906C
            int r9 = r7.left
            int r7 = r7.right
            int r9 = r9 + r7
            int r2 = r2 - r9
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            goto L_0x015f
        L_0x0144:
            android.content.Context r2 = r15.f910b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r7 = r15.f906C
            int r8 = r7.left
            int r7 = r7.right
            int r8 = r8 + r7
            int r2 = r2 - r8
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
        L_0x015f:
            a.b.p.f0 r7 = r15.f912d
            r9 = 0
            r10 = -1
            int r11 = r4 - r0
            r12 = -1
            r8 = r2
            int r7 = r7.mo1055d(r8, r9, r10, r11, r12)
            if (r7 <= 0) goto L_0x017d
            a.b.p.f0 r8 = r15.f912d
            int r8 = r8.getPaddingTop()
            a.b.p.f0 r9 = r15.f912d
            int r9 = r9.getPaddingBottom()
            int r8 = r8 + r9
            int r9 = r6 + r8
            int r0 = r0 + r9
        L_0x017d:
            int r8 = r7 + r0
            return r8
        L_0x0180:
            int r2 = r4 + r6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0162j0.mo1201q():int");
    }

    /* renamed from: a.b.p.j0$a */
    public class C0163a implements Runnable {
        public C0163a() {
        }

        public void run() {
            View view = C0162j0.this.mo1204t();
            if (view != null && view.getWindowToken() != null) {
                C0162j0.this.mo576j();
            }
        }
    }

    /* renamed from: a.b.p.j0$b */
    public class C0164b implements AdapterView.OnItemSelectedListener {
        public C0164b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            C0147f0 dropDownList;
            if (position != -1 && (dropDownList = C0162j0.this.f912d) != null) {
                dropDownList.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: I */
    public void mo1189I(boolean overlapAnchor) {
        this.f920l = true;
        this.f919k = overlapAnchor;
    }

    /* renamed from: a.b.p.j0$d */
    public class C0166d extends DataSetObserver {
        public C0166d() {
        }

        public void onChanged() {
            if (C0162j0.this.mo572a()) {
                C0162j0.this.mo576j();
            }
        }

        public void onInvalidated() {
            C0162j0.this.dismiss();
        }
    }

    /* renamed from: a.b.p.j0$c */
    public class C0165c implements Runnable {
        public C0165c() {
        }

        public void run() {
            C0162j0.this.mo1202r();
        }
    }

    /* renamed from: a.b.p.j0$g */
    public class C0169g implements Runnable {
        public C0169g() {
        }

        public void run() {
            C0147f0 f0Var = C0162j0.this.f912d;
            if (f0Var != null && C0460r.m2234I(f0Var) && C0162j0.this.f912d.getCount() > C0162j0.this.f912d.getChildCount()) {
                int childCount = C0162j0.this.f912d.getChildCount();
                C0162j0 j0Var = C0162j0.this;
                if (childCount <= j0Var.f924p) {
                    j0Var.f909F.setInputMethodMode(2);
                    C0162j0.this.mo576j();
                }
            }
        }
    }

    /* renamed from: a.b.p.j0$f */
    public class C0168f implements View.OnTouchListener {
        public C0168f() {
        }

        public boolean onTouch(View v, MotionEvent event) {
            PopupWindow popupWindow;
            int action = event.getAction();
            int x = (int) event.getX();
            int y = (int) event.getY();
            if (action == 0 && (popupWindow = C0162j0.this.f909F) != null && popupWindow.isShowing() && x >= 0 && x < C0162j0.this.f909F.getWidth() && y >= 0 && y < C0162j0.this.f909F.getHeight()) {
                C0162j0 j0Var = C0162j0.this;
                j0Var.f905B.postDelayed(j0Var.f932x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0162j0 j0Var2 = C0162j0.this;
                j0Var2.f905B.removeCallbacks(j0Var2.f932x);
                return false;
            }
        }
    }

    /* renamed from: a.b.p.j0$e */
    public class C0167e implements AbsListView.OnScrollListener {
        public C0167e() {
        }

        public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
            if (scrollState == 1 && !C0162j0.this.mo1207w() && C0162j0.this.f909F.getContentView() != null) {
                C0162j0 j0Var = C0162j0.this;
                j0Var.f905B.removeCallbacks(j0Var.f932x);
                C0162j0.this.f932x.run();
            }
        }
    }

    /* renamed from: J */
    public final void mo1190J(boolean clip) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f901G;
            if (method != null) {
                try {
                    method.invoke(this.f909F, new Object[]{Boolean.valueOf(clip)});
                } catch (Exception e) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f909F.setIsClippedToScreen(clip);
        }
    }

    /* renamed from: u */
    public final int mo1205u(View anchor, int yOffset, boolean ignoreBottomDecorations) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f909F.getMaxAvailableHeight(anchor, yOffset, ignoreBottomDecorations);
        }
        Method method = f902H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f909F, new Object[]{anchor, Integer.valueOf(yOffset), Boolean.valueOf(ignoreBottomDecorations)})).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f909F.getMaxAvailableHeight(anchor, yOffset);
    }
}
