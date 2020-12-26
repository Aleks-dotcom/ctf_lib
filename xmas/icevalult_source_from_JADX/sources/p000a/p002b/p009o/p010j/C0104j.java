package p000a.p002b.p009o.p010j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p002b.p009o.C0075c;
import p000a.p025h.p031g.p032a.C0377b;
import p000a.p025h.p038m.C0441b;

/* renamed from: a.b.o.j.j */
public class C0104j extends C0088c implements MenuItem {

    /* renamed from: d */
    public final C0377b f709d;

    /* renamed from: e */
    public Method f710e;

    public C0104j(Context context, C0377b object) {
        super(context);
        if (object != null) {
            this.f709d = object;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public int getItemId() {
        return this.f709d.getItemId();
    }

    public int getGroupId() {
        return this.f709d.getGroupId();
    }

    public int getOrder() {
        return this.f709d.getOrder();
    }

    public MenuItem setTitle(CharSequence title) {
        this.f709d.setTitle(title);
        return this;
    }

    public MenuItem setTitle(int title) {
        this.f709d.setTitle(title);
        return this;
    }

    public CharSequence getTitle() {
        return this.f709d.getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f709d.setTitleCondensed(title);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return this.f709d.getTitleCondensed();
    }

    public MenuItem setIcon(Drawable icon) {
        this.f709d.setIcon(icon);
        return this;
    }

    public MenuItem setIcon(int iconRes) {
        this.f709d.setIcon(iconRes);
        return this;
    }

    public Drawable getIcon() {
        return this.f709d.getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        this.f709d.setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return this.f709d.getIntent();
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f709d.setShortcut(numericChar, alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f709d.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f709d.setNumericShortcut(numericChar);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f709d.setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    public char getNumericShortcut() {
        return this.f709d.getNumericShortcut();
    }

    public int getNumericModifiers() {
        return this.f709d.getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f709d.setAlphabeticShortcut(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f709d.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f709d.getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return this.f709d.getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f709d.setCheckable(checkable);
        return this;
    }

    public boolean isCheckable() {
        return this.f709d.isCheckable();
    }

    public MenuItem setChecked(boolean checked) {
        this.f709d.setChecked(checked);
        return this;
    }

    public boolean isChecked() {
        return this.f709d.isChecked();
    }

    public MenuItem setVisible(boolean visible) {
        return this.f709d.setVisible(visible);
    }

    public boolean isVisible() {
        return this.f709d.isVisible();
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f709d.setEnabled(enabled);
        return this;
    }

    public boolean isEnabled() {
        return this.f709d.isEnabled();
    }

    public boolean hasSubMenu() {
        return this.f709d.hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return mo562d(this.f709d.getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        this.f709d.setOnMenuItemClickListener(menuItemClickListener != null ? new C0109e(menuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f709d.getMenuInfo();
    }

    public void setShowAsAction(int actionEnum) {
        this.f709d.setShowAsAction(actionEnum);
    }

    public MenuItem setShowAsActionFlags(int actionEnum) {
        this.f709d.setShowAsActionFlags(actionEnum);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0107c(view);
        }
        this.f709d.setActionView(view);
        return this;
    }

    public MenuItem setActionView(int resId) {
        this.f709d.setActionView(resId);
        View actionView = this.f709d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f709d.setActionView((View) new C0107c(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = this.f709d.getActionView();
        if (actionView instanceof C0107c) {
            return ((C0107c) actionView).mo825b();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider provider) {
        C0105a actionProviderWrapper;
        if (Build.VERSION.SDK_INT >= 16) {
            actionProviderWrapper = new C0106b(this, this.f589a, provider);
        } else {
            actionProviderWrapper = new C0105a(this.f589a, provider);
        }
        this.f709d.mo486b(provider != null ? actionProviderWrapper : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        C0441b provider = this.f709d.mo485a();
        if (provider instanceof C0105a) {
            return ((C0105a) provider).f711b;
        }
        return null;
    }

    public boolean expandActionView() {
        return this.f709d.expandActionView();
    }

    public boolean collapseActionView() {
        return this.f709d.collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return this.f709d.isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f709d.setOnActionExpandListener(listener != null ? new C0108d(listener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence contentDescription) {
        this.f709d.setContentDescription(contentDescription);
        return this;
    }

    public CharSequence getContentDescription() {
        return this.f709d.getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence tooltipText) {
        this.f709d.setTooltipText(tooltipText);
        return this;
    }

    public CharSequence getTooltipText() {
        return this.f709d.getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList tint) {
        this.f709d.setIconTintList(tint);
        return this;
    }

    public ColorStateList getIconTintList() {
        return this.f709d.getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        this.f709d.setIconTintMode(tintMode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f709d.getIconTintMode();
    }

    /* renamed from: h */
    public void mo782h(boolean checkable) {
        try {
            if (this.f710e == null) {
                this.f710e = this.f709d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f710e.invoke(this.f709d, new Object[]{Boolean.valueOf(checkable)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* renamed from: a.b.o.j.j$e */
    public class C0109e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f717a;

        public C0109e(MenuItem.OnMenuItemClickListener object) {
            this.f717a = object;
        }

        public boolean onMenuItemClick(MenuItem item) {
            return this.f717a.onMenuItemClick(C0104j.this.mo561c(item));
        }
    }

    /* renamed from: a.b.o.j.j$d */
    public class C0108d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f715a;

        public C0108d(MenuItem.OnActionExpandListener object) {
            this.f715a = object;
        }

        public boolean onMenuItemActionExpand(MenuItem item) {
            return this.f715a.onMenuItemActionExpand(C0104j.this.mo561c(item));
        }

        public boolean onMenuItemActionCollapse(MenuItem item) {
            return this.f715a.onMenuItemActionCollapse(C0104j.this.mo561c(item));
        }
    }

    /* renamed from: a.b.o.j.j$a */
    public class C0105a extends C0441b {

        /* renamed from: b */
        public final ActionProvider f711b;

        public C0105a(Context context, ActionProvider inner) {
            super(context);
            this.f711b = inner;
        }

        /* renamed from: c */
        public View mo817c() {
            return this.f711b.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo818e() {
            return this.f711b.onPerformDefaultAction();
        }

        /* renamed from: a */
        public boolean mo816a() {
            return this.f711b.hasSubMenu();
        }

        /* renamed from: f */
        public void mo819f(SubMenu subMenu) {
            this.f711b.onPrepareSubMenu(C0104j.this.mo562d(subMenu));
        }
    }

    /* renamed from: a.b.o.j.j$b */
    public class C0106b extends C0105a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public C0441b.C0443b f713d;

        public C0106b(C0104j jVar, Context context, ActionProvider inner) {
            super(context, inner);
        }

        /* renamed from: d */
        public View mo821d(MenuItem forItem) {
            return this.f711b.onCreateActionView(forItem);
        }

        /* renamed from: g */
        public boolean mo822g() {
            return this.f711b.overridesItemVisibility();
        }

        /* renamed from: b */
        public boolean mo820b() {
            return this.f711b.isVisible();
        }

        /* renamed from: j */
        public void mo823j(C0441b.C0443b listener) {
            this.f713d = listener;
            this.f711b.setVisibilityListener(listener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            C0441b.C0443b bVar = this.f713d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(isVisible);
            }
        }
    }

    /* renamed from: a.b.o.j.j$c */
    public static class C0107c extends FrameLayout implements C0075c {

        /* renamed from: b */
        public final CollapsibleActionView f714b;

        public C0107c(View actionView) {
            super(actionView.getContext());
            this.f714b = (CollapsibleActionView) actionView;
            addView(actionView);
        }

        /* renamed from: a */
        public void mo415a() {
            this.f714b.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo416f() {
            this.f714b.onActionViewCollapsed();
        }

        /* renamed from: b */
        public View mo825b() {
            return (View) this.f714b;
        }
    }
}
