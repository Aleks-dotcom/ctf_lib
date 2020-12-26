package p000a.p002b.p009o.p010j;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p000a.p002b.C0010h;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p031g.p032a.C0377b;
import p000a.p025h.p038m.C0441b;

/* renamed from: a.b.o.j.i */
public final class C0102i implements C0377b {

    /* renamed from: A */
    public View f677A;

    /* renamed from: B */
    public C0441b f678B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f679C;

    /* renamed from: D */
    public boolean f680D = false;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f681E;

    /* renamed from: a */
    public final int f682a;

    /* renamed from: b */
    public final int f683b;

    /* renamed from: c */
    public final int f684c;

    /* renamed from: d */
    public final int f685d;

    /* renamed from: e */
    public CharSequence f686e;

    /* renamed from: f */
    public CharSequence f687f;

    /* renamed from: g */
    public Intent f688g;

    /* renamed from: h */
    public char f689h;

    /* renamed from: i */
    public int f690i = 4096;

    /* renamed from: j */
    public char f691j;

    /* renamed from: k */
    public int f692k = 4096;

    /* renamed from: l */
    public Drawable f693l;

    /* renamed from: m */
    public int f694m = 0;

    /* renamed from: n */
    public C0098g f695n;

    /* renamed from: o */
    public C0122r f696o;

    /* renamed from: p */
    public Runnable f697p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f698q;

    /* renamed from: r */
    public CharSequence f699r;

    /* renamed from: s */
    public CharSequence f700s;

    /* renamed from: t */
    public ColorStateList f701t = null;

    /* renamed from: u */
    public PorterDuff.Mode f702u = null;

    /* renamed from: v */
    public boolean f703v = false;

    /* renamed from: w */
    public boolean f704w = false;

    /* renamed from: x */
    public boolean f705x = false;

    /* renamed from: y */
    public int f706y = 16;

    /* renamed from: z */
    public int f707z = 0;

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        mo732p(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo733q(view);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        mo756w(i);
        return this;
    }

    public C0102i(C0098g menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.f695n = menu;
        this.f682a = id;
        this.f683b = group;
        this.f684c = categoryOrder;
        this.f685d = ordering;
        this.f686e = title;
        this.f707z = showAsAction;
    }

    /* renamed from: k */
    public boolean mo727k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f698q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0098g gVar = this.f695n;
        if (gVar.mo665h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f697p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f688g != null) {
            try {
                this.f695n.mo689u().startActivity(this.f688g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0441b bVar = this.f678B;
        if (bVar == null || !bVar.mo818e()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f706y & 16) != 0;
    }

    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.f706y |= 16;
        } else {
            this.f706y &= -17;
        }
        this.f695n.mo624K(false);
        return this;
    }

    public int getGroupId() {
        return this.f683b;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f682a;
    }

    public int getOrder() {
        return this.f684c;
    }

    /* renamed from: f */
    public int mo705f() {
        return this.f685d;
    }

    public Intent getIntent() {
        return this.f688g;
    }

    public MenuItem setIntent(Intent intent) {
        this.f688g = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f691j;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.f691j == alphaChar) {
            return this;
        }
        this.f691j = Character.toLowerCase(alphaChar);
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.f691j == alphaChar && this.f692k == alphaModifiers) {
            return this;
        }
        this.f691j = Character.toLowerCase(alphaChar);
        this.f692k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f695n.mo624K(false);
        return this;
    }

    public int getAlphabeticModifiers() {
        return this.f692k;
    }

    public char getNumericShortcut() {
        return this.f689h;
    }

    public int getNumericModifiers() {
        return this.f690i;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f689h == numericChar) {
            return this;
        }
        this.f689h = numericChar;
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f689h == numericChar && this.f690i == numericModifiers) {
            return this;
        }
        this.f689h = numericChar;
        this.f690i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f689h = numericChar;
        this.f691j = Character.toLowerCase(alphaChar);
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f689h = numericChar;
        this.f690i = KeyEvent.normalizeMetaState(numericModifiers);
        this.f691j = Character.toLowerCase(alphaChar);
        this.f692k = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f695n.mo624K(false);
        return this;
    }

    /* renamed from: g */
    public char mo706g() {
        return this.f695n.mo620G() ? this.f691j : this.f689h;
    }

    /* renamed from: h */
    public String mo719h() {
        char shortcut = mo706g();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.f695n.mo689u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f695n.mo689u()).hasPermanentMenuKey()) {
            sb.append(res.getString(C0010h.abc_prepend_shortcut_label));
        }
        int modifiers = this.f695n.mo620G() ? this.f692k : this.f690i;
        m576d(sb, modifiers, 65536, res.getString(C0010h.abc_menu_meta_shortcut_label));
        m576d(sb, modifiers, 4096, res.getString(C0010h.abc_menu_ctrl_shortcut_label));
        m576d(sb, modifiers, 2, res.getString(C0010h.abc_menu_alt_shortcut_label));
        m576d(sb, modifiers, 1, res.getString(C0010h.abc_menu_shift_shortcut_label));
        m576d(sb, modifiers, 4, res.getString(C0010h.abc_menu_sym_shortcut_label));
        m576d(sb, modifiers, 8, res.getString(C0010h.abc_menu_function_shortcut_label));
        if (shortcut == 8) {
            sb.append(res.getString(C0010h.abc_menu_delete_shortcut_label));
        } else if (shortcut == 10) {
            sb.append(res.getString(C0010h.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(res.getString(C0010h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m576d(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    /* renamed from: A */
    public boolean mo701A() {
        return this.f695n.mo621H() && mo706g() != 0;
    }

    public SubMenu getSubMenu() {
        return this.f696o;
    }

    public boolean hasSubMenu() {
        return this.f696o != null;
    }

    /* renamed from: x */
    public void mo757x(C0122r subMenu) {
        this.f696o = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f686e;
    }

    /* renamed from: i */
    public CharSequence mo721i(C0115n.C0116a itemView) {
        if (itemView == null || !itemView.mo848c()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence title) {
        this.f686e = title;
        this.f695n.mo624K(false);
        C0122r rVar = this.f696o;
        if (rVar != null) {
            rVar.setHeaderTitle(title);
        }
        return this;
    }

    public MenuItem setTitle(int title) {
        setTitle((CharSequence) this.f695n.mo689u().getString(title));
        return this;
    }

    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f687f;
        if (ctitle == null) {
            ctitle = this.f686e;
        }
        if (Build.VERSION.SDK_INT >= 18 || ctitle == null || (ctitle instanceof String)) {
            return ctitle;
        }
        return ctitle.toString();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f687f = title;
        if (title == null) {
            CharSequence title2 = this.f686e;
        }
        this.f695n.mo624K(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f693l;
        if (drawable != null) {
            return mo704e(drawable);
        }
        if (this.f694m == 0) {
            return null;
        }
        Drawable icon = C0053a.m277d(this.f695n.mo689u(), this.f694m);
        this.f694m = 0;
        this.f693l = icon;
        return mo704e(icon);
    }

    public MenuItem setIcon(Drawable icon) {
        this.f694m = 0;
        this.f693l = icon;
        this.f705x = true;
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setIcon(int iconResId) {
        this.f693l = null;
        this.f694m = iconResId;
        this.f705x = true;
        this.f695n.mo624K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f701t = iconTintList;
        this.f703v = true;
        this.f705x = true;
        this.f695n.mo624K(false);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f701t;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f702u = iconTintMode;
        this.f704w = true;
        this.f705x = true;
        this.f695n.mo624K(false);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f702u;
    }

    /* renamed from: e */
    public final Drawable mo704e(Drawable icon) {
        if (icon != null && this.f705x && (this.f703v || this.f704w)) {
            icon = C0370a.m1948r(icon).mutate();
            if (this.f703v) {
                C0370a.m1945o(icon, this.f701t);
            }
            if (this.f704w) {
                C0370a.m1946p(icon, this.f702u);
            }
            this.f705x = false;
        }
        return icon;
    }

    public boolean isCheckable() {
        return (this.f706y & 1) == 1;
    }

    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.f706y;
        boolean z = (this.f706y & true) | checkable;
        this.f706y = z ? 1 : 0;
        if (oldFlags != z) {
            this.f695n.mo624K(false);
        }
        return this;
    }

    /* renamed from: t */
    public void mo752t(boolean exclusive) {
        this.f706y = (this.f706y & -5) | (exclusive ? 4 : 0);
    }

    /* renamed from: m */
    public boolean mo729m() {
        return (this.f706y & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f706y & 2) == 2;
    }

    public MenuItem setChecked(boolean checked) {
        if ((this.f706y & 4) != 0) {
            this.f695n.mo633T(this);
        } else {
            mo735s(checked);
        }
        return this;
    }

    /* renamed from: s */
    public void mo735s(boolean checked) {
        int oldFlags = this.f706y;
        int i = (this.f706y & -3) | (checked ? 2 : 0);
        this.f706y = i;
        if (oldFlags != i) {
            this.f695n.mo624K(false);
        }
    }

    public boolean isVisible() {
        C0441b bVar = this.f678B;
        if (bVar == null || !bVar.mo822g()) {
            if ((this.f706y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f706y & 8) != 0 || !this.f678B.mo820b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: y */
    public boolean mo758y(boolean shown) {
        int oldFlags = this.f706y;
        int i = (this.f706y & -9) | (shown ? 0 : 8);
        this.f706y = i;
        if (oldFlags != i) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean shown) {
        if (mo758y(shown)) {
            this.f695n.mo623J(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.f698q = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f686e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: v */
    public void mo755v(ContextMenu.ContextMenuInfo menuInfo) {
        this.f681E = menuInfo;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f681E;
    }

    /* renamed from: c */
    public void mo703c() {
        this.f695n.mo622I(this);
    }

    /* renamed from: z */
    public boolean mo759z() {
        return this.f695n.mo615A();
    }

    /* renamed from: l */
    public boolean mo728l() {
        return (this.f706y & 32) == 32;
    }

    /* renamed from: n */
    public boolean mo730n() {
        return (this.f707z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo731o() {
        return (this.f707z & 2) == 2;
    }

    /* renamed from: u */
    public void mo754u(boolean isActionButton) {
        if (isActionButton) {
            this.f706y |= 32;
        } else {
            this.f706y &= -33;
        }
    }

    /* renamed from: B */
    public boolean mo702B() {
        return (this.f707z & 4) == 4;
    }

    public void setShowAsAction(int actionEnum) {
        int i = actionEnum & 3;
        if (i == 0 || i == 1 || i == 2) {
            this.f707z = actionEnum;
            this.f695n.mo622I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* renamed from: q */
    public C0377b mo733q(View view) {
        int i;
        this.f677A = view;
        this.f678B = null;
        if (view != null && view.getId() == -1 && (i = this.f682a) > 0) {
            view.setId(i);
        }
        this.f695n.mo622I(this);
        return this;
    }

    /* renamed from: p */
    public C0377b mo732p(int resId) {
        Context context = this.f695n.mo689u();
        mo733q(LayoutInflater.from(context).inflate(resId, new LinearLayout(context), false));
        return this;
    }

    public View getActionView() {
        View view = this.f677A;
        if (view != null) {
            return view;
        }
        C0441b bVar = this.f678B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo821d(this);
        this.f677A = d;
        return d;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: a */
    public C0441b mo485a() {
        return this.f678B;
    }

    /* renamed from: b */
    public C0377b mo486b(C0441b actionProvider) {
        C0441b bVar = this.f678B;
        if (bVar != null) {
            bVar.mo2523h();
        }
        this.f677A = null;
        this.f678B = actionProvider;
        this.f695n.mo624K(true);
        C0441b bVar2 = this.f678B;
        if (bVar2 != null) {
            bVar2.mo823j(new C0103a());
        }
        return this;
    }

    /* renamed from: a.b.o.j.i$a */
    public class C0103a implements C0441b.C0443b {
        public C0103a() {
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            C0102i iVar = C0102i.this;
            iVar.f695n.mo623J(iVar);
        }
    }

    /* renamed from: w */
    public C0377b mo756w(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    public boolean expandActionView() {
        if (!mo726j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f679C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f695n.mo670k(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.f707z & 8) == 0) {
            return false;
        }
        if (this.f677A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f679C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f695n.mo661f(this);
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo726j() {
        C0441b bVar;
        if ((this.f707z & 8) == 0) {
            return false;
        }
        if (this.f677A == null && (bVar = this.f678B) != null) {
            this.f677A = bVar.mo821d(this);
        }
        if (this.f677A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo734r(boolean isExpanded) {
        this.f680D = isExpanded;
        this.f695n.mo624K(false);
    }

    public boolean isActionViewExpanded() {
        return this.f680D;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f679C = listener;
        return this;
    }

    public C0377b setContentDescription(CharSequence contentDescription) {
        this.f699r = contentDescription;
        this.f695n.mo624K(false);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f699r;
    }

    public C0377b setTooltipText(CharSequence tooltipText) {
        this.f700s = tooltipText;
        this.f695n.mo624K(false);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f700s;
    }
}
