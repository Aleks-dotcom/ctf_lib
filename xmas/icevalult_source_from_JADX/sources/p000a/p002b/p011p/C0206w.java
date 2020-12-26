package p000a.p002b.p011p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p000a.p002b.C0003a;
import p000a.p002b.p003k.C0017b;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p009o.p010j.C0118p;
import p000a.p025h.p038m.C0459q;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.p.w */
public class C0206w extends Spinner implements C0459q {

    /* renamed from: j */
    public static final int[] f1051j = {16843505};

    /* renamed from: b */
    public final C0144e f1052b;

    /* renamed from: c */
    public final Context f1053c;

    /* renamed from: d */
    public C0154h0 f1054d;

    /* renamed from: e */
    public SpinnerAdapter f1055e;

    /* renamed from: f */
    public final boolean f1056f;

    /* renamed from: g */
    public C0217g f1057g;

    /* renamed from: h */
    public int f1058h;

    /* renamed from: i */
    public final Rect f1059i;

    /* renamed from: a.b.p.w$g */
    public interface C0217g {
        /* renamed from: a */
        boolean mo1458a();

        /* renamed from: b */
        void mo1459b(Drawable drawable);

        /* renamed from: c */
        CharSequence mo1460c();

        /* renamed from: d */
        void mo1461d(int i);

        void dismiss();

        /* renamed from: e */
        int mo1463e();

        /* renamed from: g */
        void mo1464g(int i, int i2);

        /* renamed from: i */
        void mo1465i(CharSequence charSequence);

        /* renamed from: k */
        int mo1466k();

        /* renamed from: m */
        void mo1467m(int i);

        /* renamed from: n */
        Drawable mo1468n();

        /* renamed from: o */
        void mo1469o(ListAdapter listAdapter);

        /* renamed from: p */
        void mo1471p(int i);
    }

    public C0206w(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.spinnerStyle);
    }

    public C0206w(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public C0206w(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r2 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0206w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1059i = r0
            int[] r0 = p000a.p002b.C0012j.f185o2
            r1 = 0
            a.b.p.w0 r0 = p000a.p002b.p011p.C0218w0.m1093u(r7, r8, r0, r9, r1)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r6)
            r6.f1052b = r2
            if (r11 == 0) goto L_0x0022
            a.b.o.d r2 = new a.b.o.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1053c = r2
            goto L_0x0034
        L_0x0022:
            int r2 = p000a.p002b.C0012j.f210t2
            int r2 = r0.mo1509n(r2, r1)
            if (r2 == 0) goto L_0x0032
            a.b.o.d r3 = new a.b.o.d
            r3.<init>((android.content.Context) r7, (int) r2)
            r6.f1053c = r3
            goto L_0x0034
        L_0x0032:
            r6.f1053c = r7
        L_0x0034:
            r2 = -1
            if (r10 != r2) goto L_0x0064
            r2 = 0
            int[] r3 = f1051j     // Catch:{ Exception -> 0x0052 }
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r3, r9, r1)     // Catch:{ Exception -> 0x0052 }
            r2 = r3
            boolean r3 = r2.hasValue(r1)     // Catch:{ Exception -> 0x0052 }
            if (r3 == 0) goto L_0x004a
            int r3 = r2.getInt(r1, r1)     // Catch:{ Exception -> 0x0052 }
            r10 = r3
        L_0x004a:
            if (r2 == 0) goto L_0x0064
        L_0x004c:
            r2.recycle()
            goto L_0x0064
        L_0x0050:
            r1 = move-exception
            goto L_0x005e
        L_0x0052:
            r3 = move-exception
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0064
            goto L_0x004c
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.recycle()
        L_0x0063:
            throw r1
        L_0x0064:
            r2 = 1
            if (r10 == 0) goto L_0x00a1
            if (r10 == r2) goto L_0x006a
            goto L_0x00b2
        L_0x006a:
            a.b.p.w$e r3 = new a.b.p.w$e
            android.content.Context r4 = r6.f1053c
            r3.<init>(r4, r8, r9)
            android.content.Context r4 = r6.f1053c
            int[] r5 = p000a.p002b.C0012j.f185o2
            a.b.p.w0 r1 = p000a.p002b.p011p.C0218w0.m1093u(r4, r8, r5, r9, r1)
            int r4 = p000a.p002b.C0012j.f205s2
            r5 = -2
            int r4 = r1.mo1508m(r4, r5)
            r6.f1058h = r4
            int r4 = p000a.p002b.C0012j.f195q2
            android.graphics.drawable.Drawable r4 = r1.mo1502g(r4)
            r3.mo1194b(r4)
            int r4 = p000a.p002b.C0012j.f200r2
            java.lang.String r4 = r0.mo1510o(r4)
            r3.mo1465i(r4)
            r1.mo1514v()
            r6.f1057g = r3
            a.b.p.w$a r4 = new a.b.p.w$a
            r4.<init>(r6, r3)
            r6.f1054d = r4
            goto L_0x00b2
        L_0x00a1:
            a.b.p.w$c r1 = new a.b.p.w$c
            r1.<init>()
            r6.f1057g = r1
            int r3 = p000a.p002b.C0012j.f200r2
            java.lang.String r3 = r0.mo1510o(r3)
            r1.mo1465i(r3)
        L_0x00b2:
            int r1 = p000a.p002b.C0012j.f190p2
            java.lang.CharSequence[] r1 = r0.mo1512q(r1)
            if (r1 == 0) goto L_0x00ca
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r7, r4, r1)
            int r4 = p000a.p002b.C0009g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r4)
            r6.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00ca:
            r0.mo1514v()
            r6.f1056f = r2
            android.widget.SpinnerAdapter r2 = r6.f1055e
            if (r2 == 0) goto L_0x00d9
            r6.setAdapter((android.widget.SpinnerAdapter) r2)
            r2 = 0
            r6.f1055e = r2
        L_0x00d9:
            a.b.p.e r2 = r6.f1052b
            r2.mo1026e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0206w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a.b.p.w$a */
    public class C0207a extends C0154h0 {

        /* renamed from: k */
        public final /* synthetic */ C0211e f1060k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0207a(View src, C0211e eVar) {
            super(src);
            this.f1060k = eVar;
        }

        /* renamed from: b */
        public C0118p mo968b() {
            return this.f1060k;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo969c() {
            if (C0206w.this.getInternalPopup().mo1458a()) {
                return true;
            }
            C0206w.this.mo1432b();
            return true;
        }
    }

    public Context getPopupContext() {
        return this.f1053c;
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            gVar.mo1459b(background);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(background);
        }
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(C0053a.m277d(getPopupContext(), resId));
    }

    public Drawable getPopupBackground() {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            return gVar.mo1468n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int pixels) {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            gVar.mo1467m(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(pixels);
        }
    }

    public int getDropDownVerticalOffset() {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            return gVar.mo1466k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int pixels) {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            gVar.mo1471p(pixels);
            this.f1057g.mo1461d(pixels);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(pixels);
        }
    }

    public int getDropDownHorizontalOffset() {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            return gVar.mo1463e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int pixels) {
        if (this.f1057g != null) {
            this.f1058h = pixels;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(pixels);
        }
    }

    public int getDropDownWidth() {
        if (this.f1057g != null) {
            return this.f1058h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f1056f) {
            this.f1055e = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f1057g != null) {
            Context popupContext = this.f1053c;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f1057g.mo1469o(new C0210d(adapter, popupContext.getTheme()));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0217g gVar = this.f1057g;
        if (gVar != null && gVar.mo1458a()) {
            this.f1057g.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        C0154h0 h0Var = this.f1054d;
        if (h0Var == null || !h0Var.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f1057g != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1431a(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        C0217g gVar = this.f1057g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1458a()) {
            return true;
        }
        mo1432b();
        return true;
    }

    public void setPrompt(CharSequence prompt) {
        C0217g gVar = this.f1057g;
        if (gVar != null) {
            gVar.mo1465i(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    public CharSequence getPrompt() {
        C0217g gVar = this.f1057g;
        return gVar != null ? gVar.mo1460c() : super.getPrompt();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            eVar.mo1028g(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            eVar.mo1027f(background);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            eVar.mo1030i(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            return eVar.mo1024c();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            eVar.mo1031j(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            return eVar.mo1025d();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0144e eVar = this.f1052b;
        if (eVar != null) {
            eVar.mo1023b();
        }
    }

    /* renamed from: a */
    public int mo1431a(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, getSelectedItemPosition());
        int end = Math.min(adapter.getCount(), start + 15);
        for (int i = Math.max(0, start - (15 - (end - start))); i < end; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.f1059i);
        Rect rect = this.f1059i;
        return width + rect.left + rect.right;
    }

    public final C0217g getInternalPopup() {
        return this.f1057g;
    }

    /* renamed from: b */
    public void mo1432b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1057g.mo1464g(getTextDirection(), getTextAlignment());
        } else {
            this.f1057g.mo1464g(-1, -1);
        }
    }

    public Parcelable onSaveInstanceState() {
        C0215f ss = new C0215f(super.onSaveInstanceState());
        C0217g gVar = this.f1057g;
        ss.f1078b = gVar != null && gVar.mo1458a();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        ViewTreeObserver vto;
        C0215f ss = (C0215f) state;
        super.onRestoreInstanceState(ss.getSuperState());
        if (ss.f1078b && (vto = getViewTreeObserver()) != null) {
            vto.addOnGlobalLayoutListener(new C0208b());
        }
    }

    /* renamed from: a.b.p.w$b */
    public class C0208b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0208b() {
        }

        public void onGlobalLayout() {
            if (!C0206w.this.getInternalPopup().mo1458a()) {
                C0206w.this.mo1432b();
            }
            ViewTreeObserver vto = C0206w.this.getViewTreeObserver();
            if (vto == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                vto.removeOnGlobalLayoutListener(this);
            } else {
                vto.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: a.b.p.w$f */
    public static class C0215f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0215f> CREATOR = new C0216a();

        /* renamed from: b */
        public boolean f1078b;

        public C0215f(Parcelable superState) {
            super(superState);
        }

        public C0215f(Parcel in) {
            super(in);
            this.f1078b = in.readByte() != 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeByte(this.f1078b ? (byte) 1 : 0);
        }

        /* renamed from: a.b.p.w$f$a */
        public static class C0216a implements Parcelable.Creator<C0215f> {
            /* renamed from: a */
            public C0215f createFromParcel(Parcel in) {
                return new C0215f(in);
            }

            /* renamed from: b */
            public C0215f[] newArray(int size) {
                return new C0215f[size];
            }
        }
    }

    /* renamed from: a.b.p.w$d */
    public static class C0210d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        public SpinnerAdapter f1067b;

        /* renamed from: c */
        public ListAdapter f1068c;

        public C0210d(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f1067b = adapter;
            if (adapter instanceof ListAdapter) {
                this.f1068c = (ListAdapter) adapter;
            }
            if (dropDownTheme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                    themedAdapter.setDropDownViewTheme(dropDownTheme);
                }
            } else if (adapter instanceof C0199s0) {
                C0199s0 themedAdapter2 = (C0199s0) adapter;
                if (themedAdapter2.getDropDownViewTheme() == null) {
                    themedAdapter2.setDropDownViewTheme(dropDownTheme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f1067b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f1068c;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f1068c;
            if (adapter != null) {
                return adapter.isEnabled(position);
            }
            return true;
        }

        public int getItemViewType(int position) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: a.b.p.w$c */
    public class C0209c implements C0217g, DialogInterface.OnClickListener {

        /* renamed from: b */
        public C0017b f1063b;

        /* renamed from: c */
        public ListAdapter f1064c;

        /* renamed from: d */
        public CharSequence f1065d;

        public C0209c() {
        }

        public void dismiss() {
            C0017b bVar = this.f1063b;
            if (bVar != null) {
                bVar.dismiss();
                this.f1063b = null;
            }
        }

        /* renamed from: a */
        public boolean mo1458a() {
            C0017b bVar = this.f1063b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: o */
        public void mo1469o(ListAdapter adapter) {
            this.f1064c = adapter;
        }

        /* renamed from: i */
        public void mo1465i(CharSequence hintText) {
            this.f1065d = hintText;
        }

        /* renamed from: c */
        public CharSequence mo1460c() {
            return this.f1065d;
        }

        /* renamed from: g */
        public void mo1464g(int textDirection, int textAlignment) {
            if (this.f1064c != null) {
                C0017b.C0018a builder = new C0017b.C0018a(C0206w.this.getPopupContext());
                CharSequence charSequence = this.f1065d;
                if (charSequence != null) {
                    builder.mo42h(charSequence);
                }
                builder.mo41g(this.f1064c, C0206w.this.getSelectedItemPosition(), this);
                C0017b a = builder.mo35a();
                this.f1063b = a;
                ListView listView = a.mo30h();
                if (Build.VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(textDirection);
                    listView.setTextAlignment(textAlignment);
                }
                this.f1063b.show();
            }
        }

        public void onClick(DialogInterface dialog, int which) {
            C0206w.this.setSelection(which);
            if (C0206w.this.getOnItemClickListener() != null) {
                C0206w.this.performItemClick((View) null, which, this.f1064c.getItemId(which));
            }
            dismiss();
        }

        /* renamed from: b */
        public void mo1459b(Drawable bg) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1467m(int px) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public void mo1461d(int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: n */
        public Drawable mo1468n() {
            return null;
        }

        /* renamed from: k */
        public int mo1466k() {
            return 0;
        }

        /* renamed from: e */
        public int mo1463e() {
            return 0;
        }

        /* renamed from: p */
        public void mo1471p(int px) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: a.b.p.w$e */
    public class C0211e extends C0162j0 implements C0217g {

        /* renamed from: J */
        public CharSequence f1069J;

        /* renamed from: K */
        public ListAdapter f1070K;

        /* renamed from: L */
        public final Rect f1071L = new Rect();

        /* renamed from: M */
        public int f1072M;

        public C0211e(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            mo1210z(C0206w.this);
            mo1186F(true);
            mo1191K(0);
            mo1188H(new C0212a(C0206w.this));
        }

        /* renamed from: a.b.p.w$e$a */
        public class C0212a implements AdapterView.OnItemClickListener {
            public C0212a(C0206w wVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                C0206w.this.setSelection(position);
                if (C0206w.this.getOnItemClickListener() != null) {
                    C0211e eVar = C0211e.this;
                    C0206w.this.performItemClick(v, position, eVar.f1070K.getItemId(position));
                }
                C0211e.this.dismiss();
            }
        }

        /* renamed from: o */
        public void mo1200o(ListAdapter adapter) {
            super.mo1200o(adapter);
            this.f1070K = adapter;
        }

        /* renamed from: c */
        public CharSequence mo1460c() {
            return this.f1069J;
        }

        /* renamed from: i */
        public void mo1465i(CharSequence hintText) {
            this.f1069J = hintText;
        }

        /* renamed from: O */
        public void mo1485O() {
            int hOffset;
            Drawable background = mo1199n();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(C0206w.this.f1059i);
                hOffset2 = C0140c1.m788b(C0206w.this) ? C0206w.this.f1059i.right : -C0206w.this.f1059i.left;
            } else {
                Rect rect = C0206w.this.f1059i;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = C0206w.this.getPaddingLeft();
            int spinnerPaddingRight = C0206w.this.getPaddingRight();
            int spinnerWidth = C0206w.this.getWidth();
            C0206w wVar = C0206w.this;
            int i = wVar.f1058h;
            if (i == -2) {
                int contentWidth = wVar.mo1431a((SpinnerAdapter) this.f1070K, mo1199n());
                int i2 = C0206w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0206w.this.f1059i;
                int contentWidthLimit = (i2 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                mo1182B(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i == -1) {
                mo1182B((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                mo1182B(i);
            }
            if (C0140c1.m788b(C0206w.this)) {
                hOffset = hOffset2 + (((spinnerWidth - spinnerPaddingRight) - mo1206v()) - mo1486P());
            } else {
                hOffset = hOffset2 + mo1486P() + spinnerPaddingLeft;
            }
            mo1195d(hOffset);
        }

        /* renamed from: g */
        public void mo1464g(int textDirection, int textAlignment) {
            ViewTreeObserver vto;
            boolean wasShowing = mo572a();
            mo1485O();
            mo1185E(2);
            super.mo576j();
            ListView listView = mo574f();
            listView.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(textDirection);
                listView.setTextAlignment(textAlignment);
            }
            mo1192L(C0206w.this.getSelectedItemPosition());
            if (!wasShowing && (vto = C0206w.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new C0213b();
                vto.addOnGlobalLayoutListener(layoutListener);
                mo1187G(new C0214c(layoutListener));
            }
        }

        /* renamed from: a.b.p.w$e$b */
        public class C0213b implements ViewTreeObserver.OnGlobalLayoutListener {
            public C0213b() {
            }

            public void onGlobalLayout() {
                C0211e eVar = C0211e.this;
                if (!eVar.mo1487Q(C0206w.this)) {
                    C0211e.this.dismiss();
                    return;
                }
                C0211e.this.mo1485O();
                C0211e.super.mo576j();
            }
        }

        /* renamed from: a.b.p.w$e$c */
        public class C0214c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1076b;

            public C0214c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1076b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver vto = C0206w.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f1076b);
                }
            }
        }

        /* renamed from: Q */
        public boolean mo1487Q(View view) {
            return C0460r.m2234I(view) && view.getGlobalVisibleRect(this.f1071L);
        }

        /* renamed from: p */
        public void mo1471p(int px) {
            this.f1072M = px;
        }

        /* renamed from: P */
        public int mo1486P() {
            return this.f1072M;
        }
    }
}
