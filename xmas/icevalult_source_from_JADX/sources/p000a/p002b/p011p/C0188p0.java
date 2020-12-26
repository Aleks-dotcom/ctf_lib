package p000a.p002b.p011p;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import p000a.p002b.C0003a;
import p000a.p002b.p003k.C0013a;
import p000a.p002b.p009o.C0072a;
import p000a.p002b.p011p.C0158i0;

/* renamed from: a.b.p.p0 */
public class C0188p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public Runnable f981b;

    /* renamed from: c */
    public C0191c f982c;

    /* renamed from: d */
    public C0158i0 f983d;

    /* renamed from: e */
    public Spinner f984e;

    /* renamed from: f */
    public boolean f985f;

    /* renamed from: g */
    public int f986g;

    /* renamed from: h */
    public int f987h;

    /* renamed from: i */
    public int f988i;

    /* renamed from: j */
    public int f989j;

    static {
        new DecelerateInterpolator();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean canCollapse = true;
        boolean lockedExpanded = widthMode == 1073741824;
        setFillViewport(lockedExpanded);
        int childCount = this.f983d.getChildCount();
        if (childCount <= 1 || !(widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            this.f986g = -1;
        } else {
            if (childCount > 2) {
                this.f986g = (int) (((float) View.MeasureSpec.getSize(widthMeasureSpec)) * 0.4f);
            } else {
                this.f986g = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            }
            this.f986g = Math.min(this.f986g, this.f987h);
        }
        int heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f988i, 1073741824);
        if (lockedExpanded || !this.f985f) {
            canCollapse = false;
        }
        if (canCollapse) {
            this.f983d.measure(0, heightMeasureSpec2);
            if (this.f983d.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                mo1347e();
            } else {
                mo1348f();
            }
        } else {
            mo1348f();
        }
        int oldWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec2);
        int newWidth = getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            setTabSelected(this.f989j);
        }
    }

    /* renamed from: d */
    public final boolean mo1346d() {
        Spinner spinner = this.f984e;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f985f = allowCollapse;
    }

    /* renamed from: e */
    public final void mo1347e() {
        if (!mo1346d()) {
            if (this.f984e == null) {
                this.f984e = mo1344b();
            }
            removeView(this.f983d);
            addView(this.f984e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f984e.getAdapter() == null) {
                this.f984e.setAdapter(new C0190b());
            }
            Runnable runnable = this.f981b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f981b = null;
            }
            this.f984e.setSelection(this.f989j);
        }
    }

    /* renamed from: f */
    public final boolean mo1348f() {
        if (!mo1346d()) {
            return false;
        }
        removeView(this.f984e);
        addView(this.f983d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f984e.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int position) {
        this.f989j = position;
        int tabCount = this.f983d.getChildCount();
        int i = 0;
        while (i < tabCount) {
            View child = this.f983d.getChildAt(i);
            boolean isSelected = i == position;
            child.setSelected(isSelected);
            if (isSelected) {
                mo1343a(position);
            }
            i++;
        }
        Spinner spinner = this.f984e;
        if (spinner != null && position >= 0) {
            spinner.setSelection(position);
        }
    }

    public void setContentHeight(int contentHeight) {
        this.f988i = contentHeight;
        requestLayout();
    }

    /* renamed from: b */
    public final Spinner mo1344b() {
        Spinner spinner = new C0206w(getContext(), (AttributeSet) null, C0003a.actionDropDownStyle);
        spinner.setLayoutParams(new C0158i0.C0159a(-2, -1));
        spinner.setOnItemSelectedListener(this);
        return spinner;
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        C0072a abp = C0072a.m362b(getContext());
        setContentHeight(abp.mo409f());
        this.f987h = abp.mo408e();
    }

    /* renamed from: a */
    public void mo1343a(int position) {
        View tabView = this.f983d.getChildAt(position);
        Runnable runnable = this.f981b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C0189a aVar = new C0189a(tabView);
        this.f981b = aVar;
        post(aVar);
    }

    /* renamed from: a.b.p.p0$a */
    public class C0189a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f990b;

        public C0189a(View view) {
            this.f990b = view;
        }

        public void run() {
            C0188p0.this.smoothScrollTo(this.f990b.getLeft() - ((C0188p0.this.getWidth() - this.f990b.getWidth()) / 2), 0);
            C0188p0.this.f981b = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f981b;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f981b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: c */
    public C0192d mo1345c(C0013a.C0016c tab, boolean forAdapter) {
        C0192d tabView = new C0192d(getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable((Drawable) null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f988i));
        } else {
            tabView.setFocusable(true);
            if (this.f982c == null) {
                this.f982c = new C0191c();
            }
            tabView.setOnClickListener(this.f982c);
        }
        return tabView;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        ((C0192d) view).mo1365b().mo29e();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: a.b.p.p0$d */
    public class C0192d extends LinearLayout {

        /* renamed from: b */
        public final int[] f994b;

        /* renamed from: c */
        public C0013a.C0016c f995c;

        /* renamed from: d */
        public TextView f996d;

        /* renamed from: e */
        public ImageView f997e;

        /* renamed from: f */
        public View f998f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0192d(android.content.Context r6, p000a.p002b.p003k.C0013a.C0016c r7, boolean r8) {
            /*
                r4 = this;
                p000a.p002b.p011p.C0188p0.this = r5
                int r5 = p000a.p002b.C0003a.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f994b = r1
                r4.f995c = r7
                a.b.p.w0 r5 = p000a.p002b.p011p.C0218w0.m1093u(r6, r0, r1, r5, r3)
                boolean r0 = r5.mo1513r(r3)
                if (r0 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r0 = r5.mo1502g(r3)
                r4.setBackgroundDrawable(r0)
            L_0x0026:
                r5.mo1514v()
                if (r8 == 0) goto L_0x0031
                r0 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r0)
            L_0x0031:
                r4.mo1366c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0188p0.C0192d.<init>(a.b.p.p0, android.content.Context, a.b.k.a$c, boolean):void");
        }

        /* renamed from: a */
        public void mo1364a(C0013a.C0016c tab) {
            this.f995c = tab;
            mo1366c();
        }

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            super.onInitializeAccessibilityNodeInfo(info);
            info.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int i;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (C0188p0.this.f986g > 0 && getMeasuredWidth() > (i = C0188p0.this.f986g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            }
        }

        /* renamed from: c */
        public void mo1366c() {
            C0013a.C0016c tab = this.f995c;
            View custom = tab.mo26b();
            CharSequence charSequence = null;
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f998f = custom;
                TextView textView = this.f996d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f997e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f997e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f998f;
            if (view != null) {
                removeView(view);
                this.f998f = null;
            }
            Drawable icon = tab.mo27c();
            CharSequence text = tab.mo28d();
            if (icon != null) {
                if (this.f997e == null) {
                    ImageView iconView = new C0185o(getContext());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
                    lp.gravity = 16;
                    iconView.setLayoutParams(lp);
                    addView(iconView, 0);
                    this.f997e = iconView;
                }
                this.f997e.setImageDrawable(icon);
                this.f997e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f997e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f997e.setImageDrawable((Drawable) null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (hasText) {
                if (this.f996d == null) {
                    TextView textView2 = new C0227z(getContext(), (AttributeSet) null, C0003a.actionBarTabTextStyle);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-2, -2);
                    lp2.gravity = 16;
                    textView2.setLayoutParams(lp2);
                    addView(textView2);
                    this.f996d = textView2;
                }
                this.f996d.setText(text);
                this.f996d.setVisibility(0);
            } else {
                TextView textView3 = this.f996d;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    this.f996d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f997e;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.mo25a());
            }
            if (!hasText) {
                charSequence = tab.mo25a();
            }
            C0226y0.m1184a(this, charSequence);
        }

        /* renamed from: b */
        public C0013a.C0016c mo1365b() {
            return this.f995c;
        }
    }

    /* renamed from: a.b.p.p0$b */
    public class C0190b extends BaseAdapter {
        public C0190b() {
        }

        public int getCount() {
            return C0188p0.this.f983d.getChildCount();
        }

        public Object getItem(int position) {
            return ((C0192d) C0188p0.this.f983d.getChildAt(position)).mo1365b();
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return C0188p0.this.mo1345c((C0013a.C0016c) getItem(position), true);
            }
            ((C0192d) convertView).mo1364a((C0013a.C0016c) getItem(position));
            return convertView;
        }
    }

    /* renamed from: a.b.p.p0$c */
    public class C0191c implements View.OnClickListener {
        public C0191c() {
        }

        public void onClick(View view) {
            ((C0192d) view).mo1365b().mo29e();
            int tabCount = C0188p0.this.f983d.getChildCount();
            for (int i = 0; i < tabCount; i++) {
                View child = C0188p0.this.f983d.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
}
