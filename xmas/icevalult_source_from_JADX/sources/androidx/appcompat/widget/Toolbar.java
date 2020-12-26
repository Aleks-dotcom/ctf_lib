package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p002b.C0003a;
import p000a.p002b.C0012j;
import p000a.p002b.p003k.C0013a;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p009o.C0075c;
import p000a.p002b.p009o.C0080g;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0122r;
import p000a.p002b.p011p.C0131c;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0142d0;
import p000a.p002b.p011p.C0175m;
import p000a.p002b.p011p.C0185o;
import p000a.p002b.p011p.C0186o0;
import p000a.p002b.p011p.C0218w0;
import p000a.p002b.p011p.C0220x0;
import p000a.p002b.p011p.C0227z;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0448f;
import p000a.p025h.p038m.C0460r;
import p000a.p043j.p044a.C0501a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f3201A;

    /* renamed from: B */
    public ColorStateList f3202B;

    /* renamed from: C */
    public boolean f3203C;

    /* renamed from: D */
    public boolean f3204D;

    /* renamed from: E */
    public final ArrayList<View> f3205E;

    /* renamed from: F */
    public final ArrayList<View> f3206F;

    /* renamed from: G */
    public final int[] f3207G;

    /* renamed from: H */
    public C0816f f3208H;

    /* renamed from: I */
    public final ActionMenuView.C0791e f3209I;

    /* renamed from: J */
    public C0220x0 f3210J;

    /* renamed from: K */
    public C0131c f3211K;

    /* renamed from: L */
    public C0814d f3212L;

    /* renamed from: M */
    public C0113m.C0114a f3213M;

    /* renamed from: N */
    public C0098g.C0099a f3214N;

    /* renamed from: O */
    public boolean f3215O;

    /* renamed from: P */
    public final Runnable f3216P;

    /* renamed from: b */
    public ActionMenuView f3217b;

    /* renamed from: c */
    public TextView f3218c;

    /* renamed from: d */
    public TextView f3219d;

    /* renamed from: e */
    public ImageButton f3220e;

    /* renamed from: f */
    public ImageView f3221f;

    /* renamed from: g */
    public Drawable f3222g;

    /* renamed from: h */
    public CharSequence f3223h;

    /* renamed from: i */
    public ImageButton f3224i;

    /* renamed from: j */
    public View f3225j;

    /* renamed from: k */
    public Context f3226k;

    /* renamed from: l */
    public int f3227l;

    /* renamed from: m */
    public int f3228m;

    /* renamed from: n */
    public int f3229n;

    /* renamed from: o */
    public int f3230o;

    /* renamed from: p */
    public int f3231p;

    /* renamed from: q */
    public int f3232q;

    /* renamed from: r */
    public int f3233r;

    /* renamed from: s */
    public int f3234s;

    /* renamed from: t */
    public int f3235t;

    /* renamed from: u */
    public C0186o0 f3236u;

    /* renamed from: v */
    public int f3237v;

    /* renamed from: w */
    public int f3238w;

    /* renamed from: x */
    public int f3239x;

    /* renamed from: y */
    public CharSequence f3240y;

    /* renamed from: z */
    public CharSequence f3241z;

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0816f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0811a implements ActionMenuView.C0791e {
        public C0811a() {
        }

        public boolean onMenuItemClick(MenuItem item) {
            C0816f fVar = Toolbar.this.f3208H;
            if (fVar != null) {
                return fVar.onMenuItemClick(item);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0812b implements Runnable {
        public C0812b() {
        }

        public void run() {
            Toolbar.this.mo4177N();
        }
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.f4L);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3239x = 8388627;
        this.f3205E = new ArrayList<>();
        this.f3206F = new ArrayList<>();
        this.f3207G = new int[2];
        this.f3209I = new C0811a();
        this.f3216P = new C0812b();
        C0218w0 a = C0218w0.m1093u(getContext(), attrs, C0012j.f39H2, defStyleAttr, 0);
        this.f3228m = a.mo1509n(C0012j.f161j3, 0);
        this.f3229n = a.mo1509n(C0012j.f116a3, 0);
        this.f3239x = a.mo1507l(C0012j.f43I2, this.f3239x);
        this.f3230o = a.mo1507l(C0012j.f47J2, 48);
        int titleMargin = a.mo1500e(C0012j.f131d3, 0);
        int i = C0012j.f156i3;
        titleMargin = a.mo1513r(i) ? a.mo1500e(i, titleMargin) : titleMargin;
        this.f3235t = titleMargin;
        this.f3234s = titleMargin;
        this.f3233r = titleMargin;
        this.f3232q = titleMargin;
        int marginStart = a.mo1500e(C0012j.f146g3, -1);
        if (marginStart >= 0) {
            this.f3232q = marginStart;
        }
        int marginEnd = a.mo1500e(C0012j.f141f3, -1);
        if (marginEnd >= 0) {
            this.f3233r = marginEnd;
        }
        int marginTop = a.mo1500e(C0012j.f151h3, -1);
        if (marginTop >= 0) {
            this.f3234s = marginTop;
        }
        int marginBottom = a.mo1500e(C0012j.f136e3, -1);
        if (marginBottom >= 0) {
            this.f3235t = marginBottom;
        }
        this.f3231p = a.mo1501f(C0012j.f91U2, -1);
        int contentInsetStart = a.mo1500e(C0012j.f75Q2, RecyclerView.UNDEFINED_DURATION);
        int contentInsetEnd = a.mo1500e(C0012j.f59M2, RecyclerView.UNDEFINED_DURATION);
        int contentInsetLeft = a.mo1501f(C0012j.f67O2, 0);
        int contentInsetRight = a.mo1501f(C0012j.f71P2, 0);
        mo4219h();
        this.f3236u.mo1334e(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.f3236u.mo1336g(contentInsetStart, contentInsetEnd);
        }
        this.f3237v = a.mo1500e(C0012j.f79R2, RecyclerView.UNDEFINED_DURATION);
        this.f3238w = a.mo1500e(C0012j.f63N2, RecyclerView.UNDEFINED_DURATION);
        this.f3222g = a.mo1502g(C0012j.f55L2);
        this.f3223h = a.mo1511p(C0012j.f51K2);
        CharSequence title = a.mo1511p(C0012j.f126c3);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a.mo1511p(C0012j.f111Z2);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.f3226k = getContext();
        int i2 = titleMargin;
        setPopupTheme(a.mo1509n(C0012j.f107Y2, 0));
        Drawable navIcon = a.mo1502g(C0012j.f103X2);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a.mo1511p(C0012j.f99W2);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable drawable = navIcon;
        Drawable logo = a.mo1502g(C0012j.f83S2);
        if (logo != null) {
            setLogo(logo);
        }
        Drawable drawable2 = logo;
        CharSequence logoDesc = a.mo1511p(C0012j.f87T2);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        CharSequence charSequence = logoDesc;
        int i3 = C0012j.f166k3;
        if (a.mo1513r(i3)) {
            setTitleTextColor(a.mo1498c(i3));
        }
        int i4 = C0012j.f121b3;
        if (a.mo1513r(i4)) {
            setSubtitleTextColor(a.mo1498c(i4));
        }
        int i5 = C0012j.f95V2;
        if (a.mo1513r(i5)) {
            CharSequence charSequence2 = navDesc;
            mo4274x(a.mo1509n(i5, 0));
        }
        a.mo1514v();
    }

    public void setPopupTheme(int resId) {
        if (this.f3227l != resId) {
            this.f3227l = resId;
            if (resId == 0) {
                this.f3226k = getContext();
            } else {
                this.f3226k = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f3227l;
    }

    public int getTitleMarginStart() {
        return this.f3232q;
    }

    public void setTitleMarginStart(int margin) {
        this.f3232q = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f3234s;
    }

    public void setTitleMarginTop(int margin) {
        this.f3234s = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f3233r;
    }

    public void setTitleMarginEnd(int margin) {
        this.f3233r = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f3235t;
    }

    public void setTitleMarginBottom(int margin) {
        this.f3235t = margin;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(layoutDirection);
        }
        mo4219h();
        C0186o0 o0Var = this.f3236u;
        boolean z = true;
        if (layoutDirection != 1) {
            z = false;
        }
        o0Var.mo1335f(z);
    }

    public void setLogo(int resId) {
        setLogo(C0053a.m277d(getContext(), resId));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3217b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4182d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f3217b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo4016K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo4182d():boolean");
    }

    /* renamed from: A */
    public boolean mo4164A() {
        ActionMenuView actionMenuView = this.f3217b;
        return actionMenuView != null && actionMenuView.mo4015J();
    }

    /* renamed from: z */
    public boolean mo4276z() {
        ActionMenuView actionMenuView = this.f3217b;
        return actionMenuView != null && actionMenuView.mo4014I();
    }

    /* renamed from: N */
    public boolean mo4177N() {
        ActionMenuView actionMenuView = this.f3217b;
        return actionMenuView != null && actionMenuView.mo4020P();
    }

    /* renamed from: w */
    public boolean mo4273w() {
        ActionMenuView actionMenuView = this.f3217b;
        return actionMenuView != null && actionMenuView.mo4013H();
    }

    /* renamed from: I */
    public void mo4172I(C0098g menu, C0131c outerPresenter) {
        if (menu != null || this.f3217b != null) {
            mo4222k();
            C0098g oldMenu = this.f3217b.mo4018N();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.mo628O(this.f3211K);
                    oldMenu.mo628O(this.f3212L);
                }
                if (this.f3212L == null) {
                    this.f3212L = new C0814d();
                }
                outerPresenter.mo954F(true);
                if (menu != null) {
                    menu.mo653c(outerPresenter, this.f3226k);
                    menu.mo653c(this.f3212L, this.f3226k);
                } else {
                    outerPresenter.mo552i(this.f3226k, (C0098g) null);
                    this.f3212L.mo552i(this.f3226k, (C0098g) null);
                    outerPresenter.mo551h(true);
                    this.f3212L.mo551h(true);
                }
                this.f3217b.setPopupTheme(this.f3227l);
                this.f3217b.setPresenter(outerPresenter);
                this.f3211K = outerPresenter;
            }
        }
    }

    /* renamed from: f */
    public void mo4184f() {
        ActionMenuView actionMenuView = this.f3217b;
        if (actionMenuView != null) {
            actionMenuView.mo4007B();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo4220i();
            if (!mo4275y(this.f3221f)) {
                mo4180c(this.f3221f, true);
            }
        } else {
            ImageView imageView = this.f3221f;
            if (imageView != null && mo4275y(imageView)) {
                removeView(this.f3221f);
                this.f3206F.remove(this.f3221f);
            }
        }
        ImageView imageView2 = this.f3221f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3221f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int resId) {
        setLogoDescription(getContext().getText(resId));
    }

    public void setLogoDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            mo4220i();
        }
        ImageView imageView = this.f3221f;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3221f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: i */
    public final void mo4220i() {
        if (this.f3221f == null) {
            this.f3221f = new C0185o(getContext());
        }
    }

    /* renamed from: v */
    public boolean mo4272v() {
        C0814d dVar = this.f3212L;
        return (dVar == null || dVar.f3246c == null) ? false : true;
    }

    /* renamed from: e */
    public void mo4183e() {
        C0814d dVar = this.f3212L;
        C0102i item = dVar == null ? null : dVar.f3246c;
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f3240y;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f3218c == null) {
                Context context = getContext();
                C0227z zVar = new C0227z(context);
                this.f3218c = zVar;
                zVar.setSingleLine();
                this.f3218c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3228m;
                if (i != 0) {
                    this.f3218c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3201A;
                if (colorStateList != null) {
                    this.f3218c.setTextColor(colorStateList);
                }
            }
            if (!mo4275y(this.f3218c)) {
                mo4180c(this.f3218c, true);
            }
        } else {
            TextView textView = this.f3218c;
            if (textView != null && mo4275y(textView)) {
                removeView(this.f3218c);
                this.f3206F.remove(this.f3218c);
            }
        }
        TextView textView2 = this.f3218c;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.f3240y = title;
    }

    public CharSequence getSubtitle() {
        return this.f3241z;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f3219d == null) {
                Context context = getContext();
                C0227z zVar = new C0227z(context);
                this.f3219d = zVar;
                zVar.setSingleLine();
                this.f3219d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3229n;
                if (i != 0) {
                    this.f3219d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3202B;
                if (colorStateList != null) {
                    this.f3219d.setTextColor(colorStateList);
                }
            }
            if (!mo4275y(this.f3219d)) {
                mo4180c(this.f3219d, true);
            }
        } else {
            TextView textView = this.f3219d;
            if (textView != null && mo4275y(textView)) {
                removeView(this.f3219d);
                this.f3206F.remove(this.f3219d);
            }
        }
        TextView textView2 = this.f3219d;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.f3241z = subtitle;
    }

    /* renamed from: K */
    public void mo4174K(Context context, int resId) {
        this.f3228m = resId;
        TextView textView = this.f3218c;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    /* renamed from: J */
    public void mo4173J(Context context, int resId) {
        this.f3229n = resId;
        TextView textView = this.f3219d;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        setTitleTextColor(ColorStateList.valueOf(color));
    }

    public void setTitleTextColor(ColorStateList color) {
        this.f3201A = color;
        TextView textView = this.f3218c;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        setSubtitleTextColor(ColorStateList.valueOf(color));
    }

    public void setSubtitleTextColor(ColorStateList color) {
        this.f3202B = color;
        TextView textView = this.f3219d;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3220e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int resId) {
        setNavigationContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setNavigationContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            mo4223l();
        }
        ImageButton imageButton = this.f3220e;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(C0053a.m277d(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            mo4223l();
            if (!mo4275y(this.f3220e)) {
                mo4180c(this.f3220e, true);
            }
        } else {
            ImageButton imageButton = this.f3220e;
            if (imageButton != null && mo4275y(imageButton)) {
                removeView(this.f3220e);
                this.f3206F.remove(this.f3220e);
            }
        }
        ImageButton imageButton2 = this.f3220e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3220e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        mo4223l();
        this.f3220e.setOnClickListener(listener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f3224i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int resId) {
        setCollapseContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setCollapseContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            mo4185g();
        }
        ImageButton imageButton = this.f3224i;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f3224i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int resId) {
        setCollapseIcon(C0053a.m277d(getContext(), resId));
    }

    public void setCollapseIcon(Drawable icon) {
        if (icon != null) {
            mo4185g();
            this.f3224i.setImageDrawable(icon);
            return;
        }
        ImageButton imageButton = this.f3224i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f3222g);
        }
    }

    public Menu getMenu() {
        mo4221j();
        return this.f3217b.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        mo4221j();
        this.f3217b.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        mo4221j();
        return this.f3217b.getOverflowIcon();
    }

    /* renamed from: j */
    public final void mo4221j() {
        mo4222k();
        if (this.f3217b.mo4018N() == null) {
            C0098g menu = (C0098g) this.f3217b.getMenu();
            if (this.f3212L == null) {
                this.f3212L = new C0814d();
            }
            this.f3217b.setExpandedActionViewsExclusive(true);
            menu.mo653c(this.f3212L, this.f3226k);
        }
    }

    /* renamed from: k */
    public final void mo4222k() {
        if (this.f3217b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3217b = actionMenuView;
            actionMenuView.setPopupTheme(this.f3227l);
            this.f3217b.setOnMenuItemClickListener(this.f3209I);
            this.f3217b.mo4019O(this.f3213M, this.f3214N);
            C0815e lp = generateDefaultLayoutParams();
            lp.f238a = 8388613 | (this.f3230o & 112);
            this.f3217b.setLayoutParams(lp);
            mo4180c(this.f3217b, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0080g(getContext());
    }

    /* renamed from: x */
    public void mo4274x(int resId) {
        getMenuInflater().inflate(resId, getMenu());
    }

    public void setOnMenuItemClickListener(C0816f listener) {
        this.f3208H = listener;
    }

    /* renamed from: H */
    public void mo4171H(int contentInsetStart, int contentInsetEnd) {
        mo4219h();
        this.f3236u.mo1336g(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        C0186o0 o0Var = this.f3236u;
        if (o0Var != null) {
            return o0Var.mo1333d();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C0186o0 o0Var = this.f3236u;
        if (o0Var != null) {
            return o0Var.mo1330a();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        C0186o0 o0Var = this.f3236u;
        if (o0Var != null) {
            return o0Var.mo1331b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0186o0 o0Var = this.f3236u;
        if (o0Var != null) {
            return o0Var.mo1332c();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f3237v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = RecyclerView.UNDEFINED_DURATION;
        }
        if (insetStartWithNavigation != this.f3237v) {
            this.f3237v = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.f3238w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = RecyclerView.UNDEFINED_DURATION;
        }
        if (insetEndWithActions != this.f3238w) {
            this.f3238w = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f3237v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f3217b;
        if (actionMenuView != null) {
            C0098g mb = actionMenuView.mo4018N();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.f3238w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C0460r.m2292v(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0460r.m2292v(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: l */
    public final void mo4223l() {
        if (this.f3220e == null) {
            this.f3220e = new C0175m(getContext(), (AttributeSet) null, C0003a.toolbarNavigationButtonStyle);
            C0815e lp = generateDefaultLayoutParams();
            lp.f238a = 8388611 | (this.f3230o & 112);
            this.f3220e.setLayoutParams(lp);
        }
    }

    /* renamed from: g */
    public void mo4185g() {
        if (this.f3224i == null) {
            C0175m mVar = new C0175m(getContext(), (AttributeSet) null, C0003a.toolbarNavigationButtonStyle);
            this.f3224i = mVar;
            mVar.setImageDrawable(this.f3222g);
            this.f3224i.setContentDescription(this.f3223h);
            C0815e lp = generateDefaultLayoutParams();
            lp.f238a = 8388611 | (this.f3230o & 112);
            lp.f3248b = 2;
            this.f3224i.setLayoutParams(lp);
            this.f3224i.setOnClickListener(new C0813c());
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0813c implements View.OnClickListener {
        public C0813c() {
        }

        public void onClick(View v) {
            Toolbar.this.mo4183e();
        }
    }

    /* renamed from: c */
    public final void mo4180c(View v, boolean allowHide) {
        C0815e lp;
        ViewGroup.LayoutParams vlp = v.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (C0815e) vlp;
        }
        lp.f3248b = 1;
        if (!allowHide || this.f3225j == null) {
            addView(v, lp);
            return;
        }
        v.setLayoutParams(lp);
        this.f3206F.add(v);
    }

    public Parcelable onSaveInstanceState() {
        C0102i iVar;
        C0817g state = new C0817g(super.onSaveInstanceState());
        C0814d dVar = this.f3212L;
        if (!(dVar == null || (iVar = dVar.f3246c) == null)) {
            state.f3249d = iVar.getItemId();
        }
        state.f3250e = mo4164A();
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof C0817g)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0817g ss = (C0817g) state;
        super.onRestoreInstanceState(ss.mo2682f());
        ActionMenuView actionMenuView = this.f3217b;
        Menu menu = actionMenuView != null ? actionMenuView.mo4018N() : null;
        int i = ss.f3249d;
        if (!(i == 0 || this.f3212L == null || menu == null || (item = menu.findItem(i)) == null)) {
            item.expandActionView();
        }
        if (ss.f3250e) {
            mo4169F();
        }
    }

    /* renamed from: F */
    public final void mo4169F() {
        removeCallbacks(this.f3216P);
        post(this.f3216P);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3216P);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f3203C = false;
        }
        if (!this.f3203C) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f3203C = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f3203C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f3204D = false;
        }
        if (!this.f3204D) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f3204D = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f3204D = false;
        }
        return true;
    }

    /* renamed from: E */
    public final void mo4168E(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightMode != 0 ? Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint) : heightConstraint, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    /* renamed from: D */
    public final int mo4167D(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int hMargins = Math.max(0, leftDiff) + Math.max(0, rightDiff);
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width), ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height));
        return child.getMeasuredWidth() + hMargins;
    }

    /* renamed from: L */
    public final boolean mo4175L() {
        if (!this.f3215O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (mo4176M(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int marginEndIndex;
        int marginStartIndex;
        int marginStartIndex2;
        int menuWidth;
        int titleHeight;
        int childCount;
        int childState;
        int height = 0;
        int childState2 = 0;
        int[] collapsingMargins = this.f3207G;
        if (C0140c1.m788b(this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (mo4176M(this.f3220e)) {
            mo4168E(this.f3220e, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f3231p);
            navWidth = this.f3220e.getMeasuredWidth() + mo4238s(this.f3220e);
            height = Math.max(0, this.f3220e.getMeasuredHeight() + mo4270t(this.f3220e));
            childState2 = View.combineMeasuredStates(0, this.f3220e.getMeasuredState());
        }
        if (mo4176M(this.f3224i)) {
            mo4168E(this.f3224i, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f3231p);
            navWidth = this.f3224i.getMeasuredWidth() + mo4238s(this.f3224i);
            height = Math.max(height, this.f3224i.getMeasuredHeight() + mo4270t(this.f3224i));
            childState2 = View.combineMeasuredStates(childState2, this.f3224i.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (mo4176M(this.f3217b)) {
            char c = marginStartIndex;
            marginStartIndex2 = 0;
            mo4168E(this.f3217b, widthMeasureSpec, width, heightMeasureSpec, 0, this.f3231p);
            int menuWidth2 = this.f3217b.getMeasuredWidth() + mo4238s(this.f3217b);
            height = Math.max(height, this.f3217b.getMeasuredHeight() + mo4270t(this.f3217b));
            childState2 = View.combineMeasuredStates(childState2, this.f3217b.getMeasuredState());
            menuWidth = menuWidth2;
        } else {
            marginStartIndex2 = 0;
            menuWidth = 0;
        }
        int contentInsetEnd = getCurrentContentInsetEnd();
        int width2 = width + Math.max(contentInsetEnd, menuWidth);
        collapsingMargins[marginEndIndex] = Math.max(marginStartIndex2, contentInsetEnd - menuWidth);
        if (mo4176M(this.f3225j)) {
            int i = contentInsetEnd;
            int i2 = menuWidth;
            width2 += mo4167D(this.f3225j, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.f3225j.getMeasuredHeight() + mo4270t(this.f3225j));
            childState2 = View.combineMeasuredStates(childState2, this.f3225j.getMeasuredState());
        } else {
            int i3 = menuWidth;
        }
        if (mo4176M(this.f3221f)) {
            width2 += mo4167D(this.f3221f, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            height = Math.max(height, this.f3221f.getMeasuredHeight() + mo4270t(this.f3221f));
            childState2 = View.combineMeasuredStates(childState2, this.f3221f.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int childState3 = childState2;
        int height2 = height;
        int width3 = width2;
        int i4 = 0;
        while (i4 < childCount2) {
            View child = getChildAt(i4);
            C0815e lp = (C0815e) child.getLayoutParams();
            if (lp.f3248b != 0) {
                View view = child;
                childState = childState3;
                childCount = childCount2;
            } else if (!mo4176M(child)) {
                childState = childState3;
                childCount = childCount2;
            } else {
                C0815e eVar = lp;
                View child2 = child;
                childCount = childCount2;
                width3 += mo4167D(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                View child3 = child2;
                height2 = Math.max(height2, child2.getMeasuredHeight() + mo4270t(child3));
                childState3 = View.combineMeasuredStates(childState3, child3.getMeasuredState());
                i4++;
                childCount2 = childCount;
            }
            childState3 = childState;
            i4++;
            childCount2 = childCount;
        }
        int childState4 = childState3;
        int i5 = childCount2;
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.f3234s + this.f3235t;
        int titleHorizMargins = this.f3232q + this.f3233r;
        if (mo4176M(this.f3218c)) {
            int D = mo4167D(this.f3218c, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f3218c.getMeasuredWidth() + mo4238s(this.f3218c);
            titleHeight2 = this.f3218c.getMeasuredHeight() + mo4270t(this.f3218c);
            childState4 = View.combineMeasuredStates(childState4, this.f3218c.getMeasuredState());
        }
        if (mo4176M(this.f3219d)) {
            titleWidth = Math.max(titleWidth, mo4167D(this.f3219d, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f3219d.getMeasuredHeight() + mo4270t(this.f3219d);
            childState4 = View.combineMeasuredStates(childState4, this.f3219d.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(width3 + titleWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, -16777216 & childState4), mo4175L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(height2, titleHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState4 << 16));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (r0.f3218c.getMeasuredWidth() <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r34, int r35, int r36, int r37, int r38) {
        /*
            r33 = this;
            r0 = r33
            int r1 = p000a.p025h.p038m.C0460r.m2292v(r33)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r33.getWidth()
            int r5 = r33.getHeight()
            int r6 = r33.getPaddingLeft()
            int r7 = r33.getPaddingRight()
            int r8 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            r10 = r6
            int r11 = r4 - r7
            int[] r12 = r0.f3207G
            r12[r2] = r3
            r12[r3] = r3
            int r13 = p000a.p025h.p038m.C0460r.m2293w(r33)
            if (r13 < 0) goto L_0x003b
            int r14 = r38 - r36
            int r14 = java.lang.Math.min(r13, r14)
            goto L_0x003c
        L_0x003b:
            r14 = 0
        L_0x003c:
            android.widget.ImageButton r15 = r0.f3220e
            boolean r15 = r0.mo4176M(r15)
            if (r15 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r15 = r0.f3220e
            int r11 = r0.mo4166C(r15, r11, r12, r14)
            goto L_0x0053
        L_0x004d:
            android.widget.ImageButton r15 = r0.f3220e
            int r10 = r0.mo4165B(r15, r10, r12, r14)
        L_0x0053:
            android.widget.ImageButton r15 = r0.f3224i
            boolean r15 = r0.mo4176M(r15)
            if (r15 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x0064
            android.widget.ImageButton r15 = r0.f3224i
            int r11 = r0.mo4166C(r15, r11, r12, r14)
            goto L_0x006a
        L_0x0064:
            android.widget.ImageButton r15 = r0.f3224i
            int r10 = r0.mo4165B(r15, r10, r12, r14)
        L_0x006a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3217b
            boolean r15 = r0.mo4176M(r15)
            if (r15 == 0) goto L_0x0081
            if (r1 == 0) goto L_0x007b
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3217b
            int r10 = r0.mo4165B(r15, r10, r12, r14)
            goto L_0x0081
        L_0x007b:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f3217b
            int r11 = r0.mo4166C(r15, r11, r12, r14)
        L_0x0081:
            int r15 = r33.getCurrentContentInsetLeft()
            int r16 = r33.getCurrentContentInsetRight()
            int r2 = r15 - r10
            int r2 = java.lang.Math.max(r3, r2)
            r12[r3] = r2
            int r2 = r4 - r7
            int r2 = r2 - r11
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r12[r17] = r2
            int r2 = java.lang.Math.max(r10, r15)
            int r10 = r4 - r7
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r11, r10)
            android.view.View r11 = r0.f3225j
            boolean r11 = r0.mo4176M(r11)
            if (r11 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00bb
            android.view.View r11 = r0.f3225j
            int r10 = r0.mo4166C(r11, r10, r12, r14)
            goto L_0x00c1
        L_0x00bb:
            android.view.View r11 = r0.f3225j
            int r2 = r0.mo4165B(r11, r2, r12, r14)
        L_0x00c1:
            android.widget.ImageView r11 = r0.f3221f
            boolean r11 = r0.mo4176M(r11)
            if (r11 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00d2
            android.widget.ImageView r11 = r0.f3221f
            int r10 = r0.mo4166C(r11, r10, r12, r14)
            goto L_0x00d8
        L_0x00d2:
            android.widget.ImageView r11 = r0.f3221f
            int r2 = r0.mo4165B(r11, r2, r12, r14)
        L_0x00d8:
            android.widget.TextView r11 = r0.f3218c
            boolean r11 = r0.mo4176M(r11)
            android.widget.TextView r3 = r0.f3219d
            boolean r3 = r0.mo4176M(r3)
            r19 = 0
            if (r11 == 0) goto L_0x0105
            r20 = r13
            android.widget.TextView r13 = r0.f3218c
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r13 = (androidx.appcompat.widget.Toolbar.C0815e) r13
            r21 = r15
            int r15 = r13.topMargin
            r22 = r7
            android.widget.TextView r7 = r0.f3218c
            int r7 = r7.getMeasuredHeight()
            int r15 = r15 + r7
            int r7 = r13.bottomMargin
            int r15 = r15 + r7
            int r19 = r19 + r15
            goto L_0x010b
        L_0x0105:
            r22 = r7
            r20 = r13
            r21 = r15
        L_0x010b:
            if (r3 == 0) goto L_0x0123
            android.widget.TextView r7 = r0.f3219d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0815e) r7
            int r13 = r7.topMargin
            android.widget.TextView r15 = r0.f3219d
            int r15 = r15.getMeasuredHeight()
            int r13 = r13 + r15
            int r15 = r7.bottomMargin
            int r13 = r13 + r15
            int r19 = r19 + r13
        L_0x0123:
            if (r11 != 0) goto L_0x0136
            if (r3 == 0) goto L_0x0128
            goto L_0x0136
        L_0x0128:
            r27 = r1
            r25 = r4
            r30 = r5
            r26 = r6
            r29 = r8
            r28 = r14
            goto L_0x02d6
        L_0x0136:
            if (r11 == 0) goto L_0x013b
            android.widget.TextView r7 = r0.f3218c
            goto L_0x013d
        L_0x013b:
            android.widget.TextView r7 = r0.f3219d
        L_0x013d:
            if (r3 == 0) goto L_0x0142
            android.widget.TextView r13 = r0.f3219d
            goto L_0x0144
        L_0x0142:
            android.widget.TextView r13 = r0.f3218c
        L_0x0144:
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0815e) r15
            android.view.ViewGroup$LayoutParams r23 = r13.getLayoutParams()
            r24 = r7
            r7 = r23
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0815e) r7
            if (r11 == 0) goto L_0x0161
            r23 = r13
            android.widget.TextView r13 = r0.f3218c
            int r13 = r13.getMeasuredWidth()
            if (r13 > 0) goto L_0x016d
            goto L_0x0163
        L_0x0161:
            r23 = r13
        L_0x0163:
            if (r3 == 0) goto L_0x016f
            android.widget.TextView r13 = r0.f3219d
            int r13 = r13.getMeasuredWidth()
            if (r13 <= 0) goto L_0x016f
        L_0x016d:
            r13 = 1
            goto L_0x0170
        L_0x016f:
            r13 = 0
        L_0x0170:
            r25 = r4
            int r4 = r0.f3239x
            r4 = r4 & 112(0x70, float:1.57E-43)
            r26 = r6
            r6 = 48
            if (r4 == r6) goto L_0x01c2
            r6 = 80
            if (r4 == r6) goto L_0x01b3
            int r4 = r5 - r8
            int r4 = r4 - r9
            int r6 = r4 - r19
            int r6 = r6 / 2
            r27 = r4
            int r4 = r15.topMargin
            r28 = r14
            int r14 = r0.f3234s
            r29 = r2
            int r2 = r4 + r14
            if (r6 >= r2) goto L_0x0198
            int r6 = r4 + r14
            goto L_0x01b0
        L_0x0198:
            int r2 = r5 - r9
            int r2 = r2 - r19
            int r2 = r2 - r6
            int r2 = r2 - r8
            int r4 = r15.bottomMargin
            int r14 = r0.f3235t
            int r4 = r4 + r14
            if (r2 >= r4) goto L_0x01b0
            int r4 = r7.bottomMargin
            int r4 = r4 + r14
            int r4 = r4 - r2
            int r4 = r6 - r4
            r14 = 0
            int r6 = java.lang.Math.max(r14, r4)
        L_0x01b0:
            int r2 = r8 + r6
            goto L_0x01d1
        L_0x01b3:
            r29 = r2
            r28 = r14
            int r2 = r5 - r9
            int r4 = r7.bottomMargin
            int r2 = r2 - r4
            int r4 = r0.f3235t
            int r2 = r2 - r4
            int r2 = r2 - r19
            goto L_0x01d1
        L_0x01c2:
            r29 = r2
            r28 = r14
            int r2 = r33.getPaddingTop()
            int r4 = r15.topMargin
            int r2 = r2 + r4
            int r4 = r0.f3234s
            int r2 = r2 + r4
        L_0x01d1:
            if (r1 == 0) goto L_0x0257
            if (r13 == 0) goto L_0x01d8
            int r4 = r0.f3232q
            goto L_0x01d9
        L_0x01d8:
            r4 = 0
        L_0x01d9:
            r6 = 1
            r14 = r12[r6]
            int r4 = r4 - r14
            r14 = 0
            int r17 = java.lang.Math.max(r14, r4)
            int r10 = r10 - r17
            r27 = r1
            int r1 = -r4
            int r1 = java.lang.Math.max(r14, r1)
            r12[r6] = r1
            r1 = r10
            r6 = r10
            if (r11 == 0) goto L_0x021c
            android.widget.TextView r14 = r0.f3218c
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r14 = (androidx.appcompat.widget.Toolbar.C0815e) r14
            r18 = r4
            android.widget.TextView r4 = r0.f3218c
            int r4 = r4.getMeasuredWidth()
            int r4 = r1 - r4
            r30 = r5
            android.widget.TextView r5 = r0.f3218c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r2
            r31 = r7
            android.widget.TextView r7 = r0.f3218c
            r7.layout(r4, r2, r1, r5)
            int r7 = r0.f3233r
            int r1 = r4 - r7
            int r7 = r14.bottomMargin
            int r2 = r5 + r7
            goto L_0x0222
        L_0x021c:
            r18 = r4
            r30 = r5
            r31 = r7
        L_0x0222:
            if (r3 == 0) goto L_0x024a
            android.widget.TextView r4 = r0.f3219d
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0815e) r4
            int r5 = r4.topMargin
            int r2 = r2 + r5
            android.widget.TextView r5 = r0.f3219d
            int r5 = r5.getMeasuredWidth()
            int r5 = r6 - r5
            android.widget.TextView r7 = r0.f3219d
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            android.widget.TextView r14 = r0.f3219d
            r14.layout(r5, r2, r6, r7)
            int r14 = r0.f3233r
            int r6 = r6 - r14
            int r14 = r4.bottomMargin
            int r2 = r7 + r14
        L_0x024a:
            if (r13 == 0) goto L_0x0251
            int r4 = java.lang.Math.min(r1, r6)
            r10 = r4
        L_0x0251:
            r2 = r29
            r29 = r8
            goto L_0x02d6
        L_0x0257:
            r27 = r1
            r30 = r5
            r31 = r7
            if (r13 == 0) goto L_0x0262
            int r14 = r0.f3232q
            goto L_0x0263
        L_0x0262:
            r14 = 0
        L_0x0263:
            r1 = 0
            r4 = r12[r1]
            int r14 = r14 - r4
            int r4 = java.lang.Math.max(r1, r14)
            int r4 = r29 + r4
            int r5 = -r14
            int r5 = java.lang.Math.max(r1, r5)
            r12[r1] = r5
            r1 = r4
            r5 = r4
            if (r11 == 0) goto L_0x02a0
            android.widget.TextView r6 = r0.f3218c
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r6 = (androidx.appcompat.widget.Toolbar.C0815e) r6
            android.widget.TextView r7 = r0.f3218c
            int r7 = r7.getMeasuredWidth()
            int r7 = r7 + r1
            r18 = r4
            android.widget.TextView r4 = r0.f3218c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r2
            r29 = r8
            android.widget.TextView r8 = r0.f3218c
            r8.layout(r1, r2, r7, r4)
            int r8 = r0.f3233r
            int r1 = r7 + r8
            int r8 = r6.bottomMargin
            int r2 = r4 + r8
            goto L_0x02a4
        L_0x02a0:
            r18 = r4
            r29 = r8
        L_0x02a4:
            if (r3 == 0) goto L_0x02cc
            android.widget.TextView r4 = r0.f3219d
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0815e) r4
            int r6 = r4.topMargin
            int r2 = r2 + r6
            android.widget.TextView r6 = r0.f3219d
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 + r5
            android.widget.TextView r7 = r0.f3219d
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            android.widget.TextView r8 = r0.f3219d
            r8.layout(r5, r2, r6, r7)
            int r8 = r0.f3233r
            int r5 = r6 + r8
            int r8 = r4.bottomMargin
            int r2 = r7 + r8
        L_0x02cc:
            if (r13 == 0) goto L_0x02d4
            int r4 = java.lang.Math.max(r1, r5)
            r2 = r4
            goto L_0x02d6
        L_0x02d4:
            r2 = r18
        L_0x02d6:
            java.util.ArrayList<android.view.View> r1 = r0.f3205E
            r4 = 3
            r0.mo4179b(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.f3205E
            int r1 = r1.size()
            r4 = 0
        L_0x02e3:
            if (r4 >= r1) goto L_0x02f6
            java.util.ArrayList<android.view.View> r5 = r0.f3205E
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            r6 = r28
            int r2 = r0.mo4165B(r5, r2, r12, r6)
            int r4 = r4 + 1
            goto L_0x02e3
        L_0x02f6:
            r6 = r28
            java.util.ArrayList<android.view.View> r4 = r0.f3205E
            r5 = 5
            r0.mo4179b(r4, r5)
            java.util.ArrayList<android.view.View> r4 = r0.f3205E
            int r4 = r4.size()
            r5 = 0
        L_0x0305:
            if (r5 >= r4) goto L_0x0316
            java.util.ArrayList<android.view.View> r7 = r0.f3205E
            java.lang.Object r7 = r7.get(r5)
            android.view.View r7 = (android.view.View) r7
            int r10 = r0.mo4166C(r7, r10, r12, r6)
            int r5 = r5 + 1
            goto L_0x0305
        L_0x0316:
            java.util.ArrayList<android.view.View> r5 = r0.f3205E
            r7 = 1
            r0.mo4179b(r5, r7)
            java.util.ArrayList<android.view.View> r5 = r0.f3205E
            int r5 = r0.mo4271u(r5, r12)
            int r7 = r25 - r26
            int r7 = r7 - r22
            int r7 = r7 / 2
            int r7 = r26 + r7
            int r8 = r5 / 2
            int r13 = r7 - r8
            int r14 = r13 + r5
            if (r13 >= r2) goto L_0x0334
            r13 = r2
            goto L_0x0339
        L_0x0334:
            if (r14 <= r10) goto L_0x0339
            int r15 = r14 - r10
            int r13 = r13 - r15
        L_0x0339:
            java.util.ArrayList<android.view.View> r15 = r0.f3205E
            int r15 = r15.size()
            r17 = 0
            r32 = r17
            r17 = r1
            r1 = r32
        L_0x0347:
            if (r1 >= r15) goto L_0x035c
            r18 = r2
            java.util.ArrayList<android.view.View> r2 = r0.f3205E
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            int r13 = r0.mo4165B(r2, r13, r12, r6)
            int r1 = r1 + 1
            r2 = r18
            goto L_0x0347
        L_0x035c:
            java.util.ArrayList<android.view.View> r1 = r0.f3205E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: u */
    public final int mo4271u(List<View> views, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = views.size();
        for (int i = 0; i < count; i++) {
            View v = views.get(i);
            C0815e lp = (C0815e) v.getLayoutParams();
            int l = lp.leftMargin - collapseLeft;
            int r = lp.rightMargin - collapseRight;
            int leftMargin = Math.max(0, l);
            int rightMargin = Math.max(0, r);
            collapseLeft = Math.max(0, -l);
            collapseRight = Math.max(0, -r);
            width += v.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    /* renamed from: B */
    public final int mo4165B(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        C0815e lp = (C0815e) child.getLayoutParams();
        int l = lp.leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l);
        collapsingMargins[0] = Math.max(0, -l);
        int top = mo4236q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + lp.rightMargin + childWidth;
    }

    /* renamed from: C */
    public final int mo4166C(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        C0815e lp = (C0815e) child.getLayoutParams();
        int r = lp.rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r);
        collapsingMargins[1] = Math.max(0, -r);
        int top = mo4236q(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (lp.leftMargin + childWidth);
    }

    /* renamed from: q */
    public final int mo4236q(View child, int alignmentHeight) {
        C0815e lp = (C0815e) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        int r = mo4237r(lp.f238a);
        if (r == 48) {
            return getPaddingTop() - alignmentOffset;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - childHeight) - lp.bottomMargin) - alignmentOffset;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int spaceAbove = (((height - paddingTop) - paddingBottom) - childHeight) / 2;
        if (spaceAbove < lp.topMargin) {
            spaceAbove = lp.topMargin;
        } else {
            int spaceBelow = (((height - paddingBottom) - childHeight) - spaceAbove) - paddingTop;
            int i = lp.bottomMargin;
            if (spaceBelow < i) {
                spaceAbove = Math.max(0, spaceAbove - (i - spaceBelow));
            }
        }
        return paddingTop + spaceAbove;
    }

    /* renamed from: r */
    public final int mo4237r(int gravity) {
        int vgrav = gravity & 112;
        if (vgrav == 16 || vgrav == 48 || vgrav == 80) {
            return vgrav;
        }
        return this.f3239x & 112;
    }

    /* renamed from: b */
    public final void mo4179b(List<View> views, int gravity) {
        boolean z = true;
        if (C0460r.m2292v(this) != 1) {
            z = false;
        }
        boolean isRtl = z;
        int childCount = getChildCount();
        int absGrav = C0444c.m2174b(gravity, C0460r.m2292v(this));
        views.clear();
        if (isRtl) {
            for (int i = childCount - 1; i >= 0; i--) {
                View child = getChildAt(i);
                C0815e lp = (C0815e) child.getLayoutParams();
                if (lp.f3248b == 0 && mo4176M(child) && mo4235p(lp.f238a) == absGrav) {
                    views.add(child);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View child2 = getChildAt(i2);
            C0815e lp2 = (C0815e) child2.getLayoutParams();
            if (lp2.f3248b == 0 && mo4176M(child2) && mo4235p(lp2.f238a) == absGrav) {
                views.add(child2);
            }
        }
    }

    /* renamed from: p */
    public final int mo4235p(int gravity) {
        int ld = C0460r.m2292v(this);
        int hGrav = C0444c.m2174b(gravity, ld) & 7;
        if (hGrav == 1 || hGrav == 3 || hGrav == 5) {
            return hGrav;
        }
        if (ld == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: M */
    public final boolean mo4176M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: s */
    public final int mo4238s(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return C0448f.m2185b(mlp) + C0448f.m2184a(mlp);
    }

    /* renamed from: t */
    public final int mo4270t(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    /* renamed from: n */
    public C0815e generateLayoutParams(AttributeSet attrs) {
        return new C0815e(getContext(), attrs);
    }

    /* renamed from: o */
    public C0815e generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof C0815e) {
            return new C0815e((C0815e) p);
        }
        if (p instanceof C0013a.C0014a) {
            return new C0815e((C0013a.C0014a) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new C0815e((ViewGroup.MarginLayoutParams) p);
        }
        return new C0815e(p);
    }

    /* renamed from: m */
    public C0815e generateDefaultLayoutParams() {
        return new C0815e(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof C0815e);
    }

    public C0142d0 getWrapper() {
        if (this.f3210J == null) {
            this.f3210J = new C0220x0(this, true);
        }
        return this.f3210J;
    }

    /* renamed from: G */
    public void mo4170G() {
        for (int i = getChildCount() - 1; i >= 0; i--) {
            View child = getChildAt(i);
            if (!(((C0815e) child.getLayoutParams()).f3248b == 2 || child == this.f3217b)) {
                removeViewAt(i);
                this.f3206F.add(child);
            }
        }
    }

    /* renamed from: a */
    public void mo4178a() {
        for (int i = this.f3206F.size() - 1; i >= 0; i--) {
            addView(this.f3206F.get(i));
        }
        this.f3206F.clear();
    }

    /* renamed from: y */
    public final boolean mo4275y(View child) {
        return child.getParent() == this || this.f3206F.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.f3215O = collapsible;
        requestLayout();
    }

    /* renamed from: h */
    public final void mo4219h() {
        if (this.f3236u == null) {
            this.f3236u = new C0186o0();
        }
    }

    public final TextView getTitleTextView() {
        return this.f3218c;
    }

    public final TextView getSubtitleTextView() {
        return this.f3219d;
    }

    public C0131c getOuterActionMenuPresenter() {
        return this.f3211K;
    }

    public Context getPopupContext() {
        return this.f3226k;
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0815e extends C0013a.C0014a {

        /* renamed from: b */
        public int f3248b = 0;

        public C0815e(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0815e(int width, int height) {
            super(width, height);
            this.f238a = 8388627;
        }

        public C0815e(C0815e source) {
            super((C0013a.C0014a) source);
            this.f3248b = source.f3248b;
        }

        public C0815e(C0013a.C0014a source) {
            super(source);
        }

        public C0815e(ViewGroup.MarginLayoutParams source) {
            super((ViewGroup.LayoutParams) source);
            mo4279a(source);
        }

        public C0815e(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: a */
        public void mo4279a(ViewGroup.MarginLayoutParams source) {
            this.leftMargin = source.leftMargin;
            this.topMargin = source.topMargin;
            this.rightMargin = source.rightMargin;
            this.bottomMargin = source.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0817g extends C0501a {
        public static final Parcelable.Creator<C0817g> CREATOR = new C0818a();

        /* renamed from: d */
        public int f3249d;

        /* renamed from: e */
        public boolean f3250e;

        public C0817g(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f3249d = source.readInt();
            this.f3250e = source.readInt() != 0;
        }

        public C0817g(Parcelable superState) {
            super(superState);
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f3249d);
            out.writeInt(this.f3250e ? 1 : 0);
        }

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public static class C0818a implements Parcelable.ClassLoaderCreator<C0817g> {
            /* renamed from: b */
            public C0817g createFromParcel(Parcel in, ClassLoader loader) {
                return new C0817g(in, loader);
            }

            /* renamed from: a */
            public C0817g createFromParcel(Parcel in) {
                return new C0817g(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C0817g[] newArray(int size) {
                return new C0817g[size];
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0814d implements C0113m {

        /* renamed from: b */
        public C0098g f3245b;

        /* renamed from: c */
        public C0102i f3246c;

        public C0814d() {
        }

        /* renamed from: i */
        public void mo552i(Context context, C0098g menu) {
            C0102i iVar;
            C0098g gVar = this.f3245b;
            if (!(gVar == null || (iVar = this.f3246c) == null)) {
                gVar.mo661f(iVar);
            }
            this.f3245b = menu;
        }

        /* renamed from: h */
        public void mo551h(boolean cleared) {
            if (this.f3246c != null) {
                boolean found = false;
                C0098g gVar = this.f3245b;
                if (gVar != null) {
                    int count = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        } else if (this.f3245b.getItem(i) == this.f3246c) {
                            found = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!found) {
                    mo554k(this.f3245b, this.f3246c);
                }
            }
        }

        /* renamed from: e */
        public boolean mo549e(C0122r subMenu) {
            return false;
        }

        /* renamed from: b */
        public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        }

        /* renamed from: g */
        public boolean mo575g() {
            return false;
        }

        /* renamed from: c */
        public boolean mo547c(C0098g menu, C0102i item) {
            Toolbar.this.mo4185g();
            ViewParent collapseButtonParent = Toolbar.this.f3224i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (collapseButtonParent != toolbar) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup) collapseButtonParent).removeView(toolbar.f3224i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3224i);
            }
            Toolbar.this.f3225j = item.getActionView();
            this.f3246c = item;
            ViewParent expandedActionParent = Toolbar.this.f3225j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (expandedActionParent != toolbar3) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup) expandedActionParent).removeView(toolbar3.f3225j);
                }
                C0815e lp = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lp.f238a = 8388611 | (toolbar4.f3230o & 112);
                lp.f3248b = 2;
                toolbar4.f3225j.setLayoutParams(lp);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3225j);
            }
            Toolbar.this.mo4170G();
            Toolbar.this.requestLayout();
            item.mo734r(true);
            View view = Toolbar.this.f3225j;
            if (view instanceof C0075c) {
                ((C0075c) view).mo415a();
            }
            return true;
        }

        /* renamed from: k */
        public boolean mo554k(C0098g menu, C0102i item) {
            View view = Toolbar.this.f3225j;
            if (view instanceof C0075c) {
                ((C0075c) view).mo416f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3225j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3224i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3225j = null;
            toolbar3.mo4178a();
            this.f3246c = null;
            Toolbar.this.requestLayout();
            item.mo734r(false);
            return true;
        }
    }
}
