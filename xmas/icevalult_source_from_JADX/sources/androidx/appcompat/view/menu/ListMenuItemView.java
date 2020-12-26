package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p002b.C0009g;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p011p.C0218w0;
import p000a.p025h.p038m.C0460r;

public class ListMenuItemView extends LinearLayout implements C0115n.C0116a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0102i f3022b;

    /* renamed from: c */
    public ImageView f3023c;

    /* renamed from: d */
    public RadioButton f3024d;

    /* renamed from: e */
    public TextView f3025e;

    /* renamed from: f */
    public CheckBox f3026f;

    /* renamed from: g */
    public TextView f3027g;

    /* renamed from: h */
    public ImageView f3028h;

    /* renamed from: i */
    public ImageView f3029i;

    /* renamed from: j */
    public LinearLayout f3030j;

    /* renamed from: k */
    public Drawable f3031k;

    /* renamed from: l */
    public int f3032l;

    /* renamed from: m */
    public Context f3033m;

    /* renamed from: n */
    public boolean f3034n;

    /* renamed from: o */
    public Drawable f3035o;

    /* renamed from: p */
    public boolean f3036p;

    /* renamed from: q */
    public LayoutInflater f3037q;

    /* renamed from: r */
    public boolean f3038r;

    public ListMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        C0218w0 a = C0218w0.m1093u(getContext(), attrs, C0012j.f54L1, defStyleAttr, 0);
        this.f3031k = a.mo1502g(C0012j.f62N1);
        this.f3032l = a.mo1509n(C0012j.f58M1, -1);
        this.f3034n = a.mo1496a(C0012j.f66O1, false);
        this.f3033m = context;
        this.f3035o = a.mo1502g(C0012j.f70P1);
        TypedArray b = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0003a.dropDownListViewStyle, 0);
        this.f3036p = b.hasValue(0);
        a.mo1514v();
        b.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C0460r.m2263f0(this, this.f3031k);
        TextView textView = (TextView) findViewById(C0008f.title);
        this.f3025e = textView;
        int i = this.f3032l;
        if (i != -1) {
            textView.setTextAppearance(this.f3033m, i);
        }
        this.f3027g = (TextView) findViewById(C0008f.shortcut);
        ImageView imageView = (ImageView) findViewById(C0008f.submenuarrow);
        this.f3028h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3035o);
        }
        this.f3029i = (ImageView) findViewById(C0008f.group_divider);
        this.f3030j = (LinearLayout) findViewById(C0008f.content);
    }

    /* renamed from: e */
    public void mo849e(C0102i itemData, int menuType) {
        this.f3022b = itemData;
        setVisibility(itemData.isVisible() ? 0 : 8);
        setTitle(itemData.mo721i(this));
        setCheckable(itemData.isCheckable());
        mo3915h(itemData.mo701A(), itemData.mo706g());
        setIcon(itemData.getIcon());
        setEnabled(itemData.isEnabled());
        setSubMenuArrowVisible(itemData.hasSubMenu());
        setContentDescription(itemData.getContentDescription());
    }

    /* renamed from: a */
    public final void mo3909a(View v) {
        mo3911b(v, -1);
    }

    /* renamed from: b */
    public final void mo3911b(View v, int index) {
        LinearLayout linearLayout = this.f3030j;
        if (linearLayout != null) {
            linearLayout.addView(v, index);
        } else {
            addView(v, index);
        }
    }

    public void setForceShowIcon(boolean forceShow) {
        this.f3038r = forceShow;
        this.f3034n = forceShow;
    }

    public void setTitle(CharSequence title) {
        if (title != null) {
            this.f3025e.setText(title);
            if (this.f3025e.getVisibility() != 0) {
                this.f3025e.setVisibility(0);
            }
        } else if (this.f3025e.getVisibility() != 8) {
            this.f3025e.setVisibility(8);
        }
    }

    public C0102i getItemData() {
        return this.f3022b;
    }

    public void setCheckable(boolean checkable) {
        CompoundButton otherCompoundButton;
        CompoundButton compoundButton;
        if (checkable || this.f3024d != null || this.f3026f != null) {
            if (this.f3022b.mo729m()) {
                if (this.f3024d == null) {
                    mo3914g();
                }
                compoundButton = this.f3024d;
                otherCompoundButton = this.f3026f;
            } else {
                if (this.f3026f == null) {
                    mo3912d();
                }
                compoundButton = this.f3026f;
                otherCompoundButton = this.f3024d;
            }
            if (checkable) {
                compoundButton.setChecked(this.f3022b.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (otherCompoundButton != null && otherCompoundButton.getVisibility() != 8) {
                    otherCompoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f3026f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f3024d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean checked) {
        CompoundButton compoundButton;
        if (this.f3022b.mo729m()) {
            if (this.f3024d == null) {
                mo3914g();
            }
            compoundButton = this.f3024d;
        } else {
            if (this.f3026f == null) {
                mo3912d();
            }
            compoundButton = this.f3026f;
        }
        compoundButton.setChecked(checked);
    }

    private void setSubMenuArrowVisible(boolean hasSubmenu) {
        ImageView imageView = this.f3028h;
        if (imageView != null) {
            imageView.setVisibility(hasSubmenu ? 0 : 8);
        }
    }

    /* renamed from: h */
    public void mo3915h(boolean showShortcut, char shortcutKey) {
        int newVisibility = (!showShortcut || !this.f3022b.mo701A()) ? 8 : 0;
        if (newVisibility == 0) {
            this.f3027g.setText(this.f3022b.mo719h());
        }
        if (this.f3027g.getVisibility() != newVisibility) {
            this.f3027g.setVisibility(newVisibility);
        }
    }

    public void setIcon(Drawable icon) {
        boolean showIcon = this.f3022b.mo759z() || this.f3038r;
        if (showIcon || this.f3034n) {
            ImageView imageView = this.f3023c;
            if (imageView != null || icon != null || this.f3034n) {
                if (imageView == null) {
                    mo3913f();
                }
                if (icon != null || this.f3034n) {
                    this.f3023c.setImageDrawable(showIcon ? icon : null);
                    if (this.f3023c.getVisibility() != 0) {
                        this.f3023c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f3023c.setVisibility(8);
            }
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f3023c != null && this.f3034n) {
            ViewGroup.LayoutParams lp = getLayoutParams();
            LinearLayout.LayoutParams iconLp = (LinearLayout.LayoutParams) this.f3023c.getLayoutParams();
            int i = lp.height;
            if (i > 0 && iconLp.width <= 0) {
                iconLp.width = i;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* renamed from: f */
    public final void mo3913f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0009g.abc_list_menu_item_icon, this, false);
        this.f3023c = imageView;
        mo3911b(imageView, 0);
    }

    /* renamed from: g */
    public final void mo3914g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0009g.abc_list_menu_item_radio, this, false);
        this.f3024d = radioButton;
        mo3909a(radioButton);
    }

    /* renamed from: d */
    public final void mo3912d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0009g.abc_list_menu_item_checkbox, this, false);
        this.f3026f = checkBox;
        mo3909a(checkBox);
    }

    /* renamed from: c */
    public boolean mo848c() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.f3037q == null) {
            this.f3037q = LayoutInflater.from(getContext());
        }
        return this.f3037q;
    }

    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        ImageView imageView = this.f3029i;
        if (imageView != null) {
            imageView.setVisibility((this.f3036p || !groupDividerEnabled) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3029i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) this.f3029i.getLayoutParams();
            rect.top += this.f3029i.getHeight() + lp.topMargin + lp.bottomMargin;
        }
    }
}
