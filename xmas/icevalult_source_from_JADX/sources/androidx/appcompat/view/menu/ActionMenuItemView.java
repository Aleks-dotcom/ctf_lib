package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p009o.p010j.C0118p;
import p000a.p002b.p011p.C0154h0;
import p000a.p002b.p011p.C0226y0;
import p000a.p002b.p011p.C0227z;

public class ActionMenuItemView extends C0227z implements C0115n.C0116a, View.OnClickListener, ActionMenuView.C0787a {

    /* renamed from: f */
    public C0102i f3007f;

    /* renamed from: g */
    public CharSequence f3008g;

    /* renamed from: h */
    public Drawable f3009h;

    /* renamed from: i */
    public C0098g.C0100b f3010i;

    /* renamed from: j */
    public C0154h0 f3011j;

    /* renamed from: k */
    public C0780b f3012k;

    /* renamed from: l */
    public boolean f3013l;

    /* renamed from: m */
    public boolean f3014m;

    /* renamed from: n */
    public int f3015n;

    /* renamed from: o */
    public int f3016o;

    /* renamed from: p */
    public int f3017p;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0780b {
        /* renamed from: a */
        public abstract C0118p mo962a();
    }

    public ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res = context.getResources();
        this.f3013l = mo3892g();
        TypedArray a = context.obtainStyledAttributes(attrs, C0012j.f217v, defStyle, 0);
        this.f3015n = a.getDimensionPixelSize(C0012j.f222w, 0);
        a.recycle();
        this.f3017p = (int) ((32.0f * res.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f3016o = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f3013l = mo3892g();
        mo3893h();
    }

    /* renamed from: g */
    public final boolean mo3892g() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        return widthDp >= 480 || (widthDp >= 640 && config.screenHeightDp >= 480) || config.orientation == 2;
    }

    public void setPadding(int l, int t, int r, int b) {
        this.f3016o = l;
        super.setPadding(l, t, r, b);
    }

    public C0102i getItemData() {
        return this.f3007f;
    }

    /* renamed from: e */
    public void mo849e(C0102i itemData, int menuType) {
        this.f3007f = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.mo721i(this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.f3011j == null) {
            this.f3011j = new C0779a();
        }
    }

    public boolean onTouchEvent(MotionEvent e) {
        C0154h0 h0Var;
        if (!this.f3007f.hasSubMenu() || (h0Var = this.f3011j) == null || !h0Var.onTouch(this, e)) {
            return super.onTouchEvent(e);
        }
        return true;
    }

    public void onClick(View v) {
        C0098g.C0100b bVar = this.f3010i;
        if (bVar != null) {
            bVar.mo695b(this.f3007f);
        }
    }

    public void setItemInvoker(C0098g.C0100b invoker) {
        this.f3010i = invoker;
    }

    public void setPopupCallback(C0780b popupCallback) {
        this.f3012k = popupCallback;
    }

    /* renamed from: c */
    public boolean mo848c() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.f3014m != expandedFormat) {
            this.f3014m = expandedFormat;
            C0102i iVar = this.f3007f;
            if (iVar != null) {
                iVar.mo703c();
            }
        }
    }

    /* renamed from: h */
    public final void mo3893h() {
        boolean z = true;
        boolean visible = !TextUtils.isEmpty(this.f3008g);
        if (this.f3009h != null && (!this.f3007f.mo702B() || (!this.f3013l && !this.f3014m))) {
            z = false;
        }
        boolean visible2 = visible & z;
        CharSequence charSequence = null;
        setText(visible2 ? this.f3008g : null);
        CharSequence contentDescription = this.f3007f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f3007f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f3007f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f3007f.getTitle();
            }
            C0226y0.m1184a(this, charSequence);
            return;
        }
        C0226y0.m1184a(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.f3009h = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i = this.f3017p;
            if (width > i) {
                float scale = ((float) i) / ((float) width);
                width = this.f3017p;
                height = (int) (((float) height) * scale);
            }
            if (height > i) {
                float scale2 = ((float) i) / ((float) height);
                height = this.f3017p;
                width = (int) (((float) width) * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, (Drawable) null, (Drawable) null, (Drawable) null);
        mo3893h();
    }

    /* renamed from: f */
    public boolean mo3891f() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f3008g = title;
        mo3893h();
    }

    /* renamed from: a */
    public boolean mo964a() {
        return mo3891f() && this.f3007f.getIcon() == null;
    }

    /* renamed from: b */
    public boolean mo965b() {
        return mo3891f();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        boolean textVisible = mo3891f();
        if (textVisible && (i = this.f3016o) >= 0) {
            super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        int targetWidth = widthMode == Integer.MIN_VALUE ? Math.min(widthSize, this.f3015n) : this.f3015n;
        if (widthMode != 1073741824 && this.f3015n > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.f3009h != null) {
            super.setPadding((getMeasuredWidth() - this.f3009h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0779a extends C0154h0 {
        public C0779a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0118p mo968b() {
            C0780b bVar = ActionMenuItemView.this.f3012k;
            if (bVar != null) {
                return bVar.mo962a();
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo969c() {
            C0118p popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0098g.C0100b bVar = actionMenuItemView.f3010i;
            if (bVar == null || !bVar.mo695b(actionMenuItemView.f3007f) || (popup = mo968b()) == null || !popup.mo572a()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState((Parcelable) null);
    }
}
