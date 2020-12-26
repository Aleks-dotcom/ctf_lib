package p000a.p002b.p009o.p010j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p025h.p031g.p032a.C0376a;

/* renamed from: a.b.o.j.o */
public class C0117o extends C0088c implements Menu {

    /* renamed from: d */
    public final C0376a f733d;

    public C0117o(Context context, C0376a object) {
        super(context);
        if (object != null) {
            this.f733d = object;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence title) {
        return mo561c(this.f733d.add(title));
    }

    public MenuItem add(int titleRes) {
        return mo561c(this.f733d.add(titleRes));
    }

    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return mo561c(this.f733d.add(groupId, itemId, order, title));
    }

    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return mo561c(this.f733d.add(groupId, itemId, order, titleRes));
    }

    public SubMenu addSubMenu(CharSequence title) {
        return mo562d(this.f733d.addSubMenu(title));
    }

    public SubMenu addSubMenu(int titleRes) {
        return mo562d(this.f733d.addSubMenu(titleRes));
    }

    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return mo562d(this.f733d.addSubMenu(groupId, itemId, order, title));
    }

    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return mo562d(this.f733d.addSubMenu(groupId, itemId, order, titleRes));
    }

    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] menuItemArr = outSpecificItems;
        MenuItem[] items = null;
        if (menuItemArr != null) {
            items = new MenuItem[menuItemArr.length];
        }
        int result = this.f733d.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                menuItemArr[i] = mo561c(items[i]);
            }
        }
        return result;
    }

    public void removeItem(int id) {
        mo565g(id);
        this.f733d.removeItem(id);
    }

    public void removeGroup(int groupId) {
        mo564f(groupId);
        this.f733d.removeGroup(groupId);
    }

    public void clear() {
        mo563e();
        this.f733d.clear();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        this.f733d.setGroupCheckable(group, checkable, exclusive);
    }

    public void setGroupVisible(int group, boolean visible) {
        this.f733d.setGroupVisible(group, visible);
    }

    public void setGroupEnabled(int group, boolean enabled) {
        this.f733d.setGroupEnabled(group, enabled);
    }

    public boolean hasVisibleItems() {
        return this.f733d.hasVisibleItems();
    }

    public MenuItem findItem(int id) {
        return mo561c(this.f733d.findItem(id));
    }

    public int size() {
        return this.f733d.size();
    }

    public MenuItem getItem(int index) {
        return mo561c(this.f733d.getItem(index));
    }

    public void close() {
        this.f733d.close();
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return this.f733d.performShortcut(keyCode, event, flags);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return this.f733d.isShortcutKey(keyCode, event);
    }

    public boolean performIdentifierAction(int id, int flags) {
        return this.f733d.performIdentifierAction(id, flags);
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f733d.setQwertyMode(isQwerty);
    }
}
