package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import p000a.p002b.C0003a;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p011p.C0158i0;
import p000a.p002b.p011p.C0226y0;
import p000a.p025h.p027e.p028c.C0351f;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p040n.C0490i;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0938e;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.C0976h;
import p066b.p067a.p068a.p069a.p070a0.C0914d;

public class NavigationMenuItemView extends C0914d implements C0115n.C0116a {

    /* renamed from: G */
    public static final int[] f4846G = {16842912};

    /* renamed from: A */
    public FrameLayout f4847A;

    /* renamed from: B */
    public C0102i f4848B;

    /* renamed from: C */
    public ColorStateList f4849C;

    /* renamed from: D */
    public boolean f4850D;

    /* renamed from: E */
    public Drawable f4851E;

    /* renamed from: F */
    public final C0420a f4852F;

    /* renamed from: w */
    public int f4853w;

    /* renamed from: x */
    public boolean f4854x;

    /* renamed from: y */
    public boolean f4855y;

    /* renamed from: z */
    public final CheckedTextView f4856z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C1174a extends C0420a {
        public C1174a() {
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            super.mo2424g(host, info);
            info.mo2457T(NavigationMenuItemView.this.f4855y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C1174a aVar = new C1174a();
        this.f4852F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0976h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0928d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0943f.design_menu_item_text);
        this.f4856z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0460r.m2257c0(checkedTextView, aVar);
    }

    /* renamed from: e */
    public void mo849e(C0102i itemData, int menuType) {
        this.f4848B = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0460r.m2263f0(this, mo6962C());
        }
        setCheckable(itemData.isCheckable());
        setChecked(itemData.isChecked());
        setEnabled(itemData.isEnabled());
        setTitle(itemData.getTitle());
        setIcon(itemData.getIcon());
        setActionView(itemData.getActionView());
        setContentDescription(itemData.getContentDescription());
        C0226y0.m1184a(this, itemData.getTooltipText());
        mo6961B();
    }

    /* renamed from: D */
    public final boolean mo6963D() {
        return this.f4848B.getTitle() == null && this.f4848B.getIcon() == null && this.f4848B.getActionView() != null;
    }

    /* renamed from: B */
    public final void mo6961B() {
        if (mo6963D()) {
            this.f4856z.setVisibility(8);
            FrameLayout frameLayout = this.f4847A;
            if (frameLayout != null) {
                C0158i0.C0159a params = (C0158i0.C0159a) frameLayout.getLayoutParams();
                params.width = -1;
                this.f4847A.setLayoutParams(params);
                return;
            }
            return;
        }
        this.f4856z.setVisibility(0);
        FrameLayout frameLayout2 = this.f4847A;
        if (frameLayout2 != null) {
            C0158i0.C0159a params2 = (C0158i0.C0159a) frameLayout2.getLayoutParams();
            params2.width = -2;
            this.f4847A.setLayoutParams(params2);
        }
    }

    private void setActionView(View actionView) {
        if (actionView != null) {
            if (this.f4847A == null) {
                this.f4847A = (FrameLayout) ((ViewStub) findViewById(C0943f.design_menu_item_action_area_stub)).inflate();
            }
            this.f4847A.removeAllViews();
            this.f4847A.addView(actionView);
        }
    }

    /* renamed from: C */
    public final StateListDrawable mo6962C() {
        TypedValue value = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0003a.f7v, value, true)) {
            return null;
        }
        StateListDrawable drawable = new StateListDrawable();
        drawable.addState(f4846G, new ColorDrawable(value.data));
        drawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return drawable;
    }

    public C0102i getItemData() {
        return this.f4848B;
    }

    public void setTitle(CharSequence title) {
        this.f4856z.setText(title);
    }

    public void setCheckable(boolean checkable) {
        refreshDrawableState();
        if (this.f4855y != checkable) {
            this.f4855y = checkable;
            this.f4852F.mo2429l(this.f4856z, 2048);
        }
    }

    public void setChecked(boolean checked) {
        refreshDrawableState();
        this.f4856z.setChecked(checked);
    }

    public void setIcon(Drawable icon) {
        if (icon != null) {
            if (this.f4850D) {
                Drawable.ConstantState state = icon.getConstantState();
                icon = C0370a.m1948r(state == null ? icon : state.newDrawable()).mutate();
                C0370a.m1945o(icon, this.f4849C);
            }
            int i = this.f4853w;
            icon.setBounds(0, 0, i, i);
        } else if (this.f4854x) {
            if (this.f4851E == null) {
                Drawable a = C0351f.m1824a(getResources(), C0938e.navigation_empty_icon, getContext().getTheme());
                this.f4851E = a;
                if (a != null) {
                    int i2 = this.f4853w;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            icon = this.f4851E;
        }
        C0490i.m2434i(this.f4856z, icon, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconSize(int iconSize) {
        this.f4853w = iconSize;
    }

    /* renamed from: c */
    public boolean mo848c() {
        return false;
    }

    public int[] onCreateDrawableState(int extraSpace) {
        int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        C0102i iVar = this.f4848B;
        if (iVar != null && iVar.isCheckable() && this.f4848B.isChecked()) {
            ViewGroup.mergeDrawableStates(drawableState, f4846G);
        }
        return drawableState;
    }

    public void setIconTintList(ColorStateList tintList) {
        this.f4849C = tintList;
        this.f4850D = tintList != null;
        C0102i iVar = this.f4848B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setTextAppearance(int textAppearance) {
        C0490i.m2439n(this.f4856z, textAppearance);
    }

    public void setTextColor(ColorStateList colors) {
        this.f4856z.setTextColor(colors);
    }

    public void setNeedsEmptyIcon(boolean needsEmptyIcon) {
        this.f4854x = needsEmptyIcon;
    }

    public void setHorizontalPadding(int padding) {
        setPadding(padding, 0, padding, 0);
    }

    public void setIconPadding(int padding) {
        this.f4856z.setCompoundDrawablePadding(padding);
    }

    public void setMaxLines(int maxLines) {
        this.f4856z.setMaxLines(maxLines);
    }
}
