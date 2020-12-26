package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p031g.p032a.C0377b;
import p000a.p025h.p038m.C0441b;

/* renamed from: a.b.o.j.a */
public class C0086a implements C0377b {

    /* renamed from: a */
    public final int f562a;

    /* renamed from: b */
    public final int f563b;

    /* renamed from: c */
    public final int f564c;

    /* renamed from: d */
    public CharSequence f565d;

    /* renamed from: e */
    public CharSequence f566e;

    /* renamed from: f */
    public Intent f567f;

    /* renamed from: g */
    public char f568g;

    /* renamed from: h */
    public int f569h = 4096;

    /* renamed from: i */
    public char f570i;

    /* renamed from: j */
    public int f571j = 4096;

    /* renamed from: k */
    public Drawable f572k;

    /* renamed from: l */
    public Context f573l;

    /* renamed from: m */
    public CharSequence f574m;

    /* renamed from: n */
    public CharSequence f575n;

    /* renamed from: o */
    public ColorStateList f576o = null;

    /* renamed from: p */
    public PorterDuff.Mode f577p = null;

    /* renamed from: q */
    public boolean f578q = false;

    /* renamed from: r */
    public boolean f579r = false;

    /* renamed from: s */
    public int f580s = 16;

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo489d(i);
        throw null;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo490e(view);
        throw null;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo492f(i);
        return this;
    }

    public C0086a(Context context, int group, int id, int categoryOrder, int ordering, CharSequence title) {
        this.f573l = context;
        this.f562a = id;
        this.f563b = group;
        this.f564c = ordering;
        this.f565d = title;
    }

    public char getAlphabeticShortcut() {
        return this.f570i;
    }

    public int getAlphabeticModifiers() {
        return this.f571j;
    }

    public int getGroupId() {
        return this.f563b;
    }

    public Drawable getIcon() {
        return this.f572k;
    }

    public Intent getIntent() {
        return this.f567f;
    }

    public int getItemId() {
        return this.f562a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f568g;
    }

    public int getNumericModifiers() {
        return this.f569h;
    }

    public int getOrder() {
        return this.f564c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f565d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f566e;
        return charSequence != null ? charSequence : this.f565d;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f580s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f580s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f580s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f580s & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f570i = Character.toLowerCase(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f570i = Character.toLowerCase(alphaChar);
        this.f571j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f580s = (this.f580s & true) | checkable ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean checked) {
        this.f580s = (this.f580s & -3) | (checked ? 2 : 0);
        return this;
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f580s = (this.f580s & -17) | (enabled ? 16 : 0);
        return this;
    }

    public MenuItem setIcon(Drawable icon) {
        this.f572k = icon;
        mo487c();
        return this;
    }

    public MenuItem setIcon(int iconRes) {
        this.f572k = C0339a.m1777c(this.f573l, iconRes);
        mo487c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f567f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f568g = numericChar;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f568g = numericChar;
        this.f569h = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f568g = numericChar;
        this.f570i = Character.toLowerCase(alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f568g = numericChar;
        this.f569h = KeyEvent.normalizeMetaState(numericModifiers);
        this.f570i = Character.toLowerCase(alphaChar);
        this.f571j = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setTitle(CharSequence title) {
        this.f565d = title;
        return this;
    }

    public MenuItem setTitle(int title) {
        this.f565d = this.f573l.getResources().getString(title);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f566e = title;
        return this;
    }

    public MenuItem setVisible(boolean visible) {
        int i = 8;
        int i2 = this.f580s & 8;
        if (visible) {
            i = 0;
        }
        this.f580s = i2 | i;
        return this;
    }

    public void setShowAsAction(int show) {
    }

    /* renamed from: e */
    public C0377b mo490e(View actionView) {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public C0377b mo489d(int resId) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0441b mo485a() {
        return null;
    }

    /* renamed from: b */
    public C0377b mo486b(C0441b actionProvider) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public C0377b mo492f(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    public C0377b setContentDescription(CharSequence contentDescription) {
        this.f574m = contentDescription;
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f574m;
    }

    public C0377b setTooltipText(CharSequence tooltipText) {
        this.f575n = tooltipText;
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f575n;
    }

    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f576o = iconTintList;
        this.f578q = true;
        mo487c();
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f576o;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f577p = iconTintMode;
        this.f579r = true;
        mo487c();
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f577p;
    }

    /* renamed from: c */
    public final void mo487c() {
        Drawable drawable = this.f572k;
        if (drawable == null) {
            return;
        }
        if (this.f578q || this.f579r) {
            Drawable r = C0370a.m1948r(drawable);
            this.f572k = r;
            Drawable mutate = r.mutate();
            this.f572k = mutate;
            if (this.f578q) {
                C0370a.m1945o(mutate, this.f576o);
            }
            if (this.f579r) {
                C0370a.m1946p(this.f572k, this.f577p);
            }
        }
    }
}
