package p000a.p002b.p009o.p010j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.MenuPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p025h.p027e.C0339a;
import p000a.p025h.p031g.p032a.C0376a;
import p000a.p025h.p038m.C0441b;
import p000a.p025h.p038m.C0469s;

/* renamed from: a.b.o.j.g */
public class C0098g implements C0376a {

    /* renamed from: A */
    public static final int[] f646A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f647a;

    /* renamed from: b */
    public final Resources f648b;

    /* renamed from: c */
    public boolean f649c;

    /* renamed from: d */
    public boolean f650d;

    /* renamed from: e */
    public C0099a f651e;

    /* renamed from: f */
    public ArrayList<C0102i> f652f;

    /* renamed from: g */
    public ArrayList<C0102i> f653g;

    /* renamed from: h */
    public boolean f654h;

    /* renamed from: i */
    public ArrayList<C0102i> f655i;

    /* renamed from: j */
    public ArrayList<C0102i> f656j;

    /* renamed from: k */
    public boolean f657k;

    /* renamed from: l */
    public int f658l = 0;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f659m;

    /* renamed from: n */
    public CharSequence f660n;

    /* renamed from: o */
    public Drawable f661o;

    /* renamed from: p */
    public View f662p;

    /* renamed from: q */
    public boolean f663q = false;

    /* renamed from: r */
    public boolean f664r = false;

    /* renamed from: s */
    public boolean f665s = false;

    /* renamed from: t */
    public boolean f666t = false;

    /* renamed from: u */
    public boolean f667u = false;

    /* renamed from: v */
    public ArrayList<C0102i> f668v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<C0113m>> f669w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    public C0102i f670x;

    /* renamed from: y */
    public boolean f671y = false;

    /* renamed from: z */
    public boolean f672z;

    /* renamed from: a.b.o.j.g$a */
    public interface C0099a {
        /* renamed from: a */
        void mo138a(C0098g gVar);

        /* renamed from: b */
        boolean mo140b(C0098g gVar, MenuItem menuItem);
    }

    /* renamed from: a.b.o.j.g$b */
    public interface C0100b {
        /* renamed from: b */
        boolean mo695b(C0102i iVar);
    }

    public C0098g(Context context) {
        this.f647a = context;
        this.f648b = context.getResources();
        this.f652f = new ArrayList<>();
        this.f653g = new ArrayList<>();
        this.f654h = true;
        this.f655i = new ArrayList<>();
        this.f656j = new ArrayList<>();
        this.f657k = true;
        mo652b0(true);
    }

    /* renamed from: S */
    public C0098g mo632S(int defaultShowAsAction) {
        this.f658l = defaultShowAsAction;
        return this;
    }

    /* renamed from: b */
    public void mo651b(C0113m presenter) {
        mo653c(presenter, this.f647a);
    }

    /* renamed from: c */
    public void mo653c(C0113m presenter, Context menuContext) {
        this.f669w.add(new WeakReference(presenter));
        presenter.mo552i(menuContext, this);
        this.f657k = true;
    }

    /* renamed from: O */
    public void mo628O(C0113m presenter) {
        Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            C0113m item = (C0113m) ref.get();
            if (item == null || item == presenter) {
                this.f669w.remove(ref);
            }
        }
    }

    /* renamed from: i */
    public final void mo667i(boolean cleared) {
        if (!this.f669w.isEmpty()) {
            mo659d0();
            Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                C0113m presenter = (C0113m) ref.get();
                if (presenter == null) {
                    this.f669w.remove(ref);
                } else {
                    presenter.mo551h(cleared);
                }
            }
            mo654c0();
        }
    }

    /* renamed from: j */
    public final boolean mo669j(C0122r subMenu, C0113m preferredPresenter) {
        if (this.f669w.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.mo549e(subMenu);
        }
        Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            C0113m presenter = (C0113m) ref.get();
            if (presenter == null) {
                this.f669w.remove(ref);
            } else if (!result) {
                result = presenter.mo549e(subMenu);
            }
        }
        return result;
    }

    /* renamed from: Q */
    public void mo630Q(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i = 0; i < itemCount; i++) {
            MenuItem item = getItem(i);
            View v = item.getActionView();
            if (!(v == null || v.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0122r) item.getSubMenu()).mo630Q(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(mo688t(), viewStates);
        }
    }

    /* renamed from: P */
    public void mo629P(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(mo688t());
            int itemCount = size();
            for (int i = 0; i < itemCount; i++) {
                MenuItem item = getItem(i);
                View v = item.getActionView();
                if (!(v == null || v.getId() == -1)) {
                    v.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    ((C0122r) item.getSubMenu()).mo629P(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    /* renamed from: t */
    public String mo688t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: R */
    public void mo631R(C0099a cb) {
        this.f651e = cb;
    }

    /* renamed from: a */
    public MenuItem mo640a(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = m513B(categoryOrder);
        C0102i item = mo663g(group, id, categoryOrder, ordering, title, this.f658l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f659m;
        if (contextMenuInfo != null) {
            item.mo755v(contextMenuInfo);
        }
        ArrayList<C0102i> arrayList = this.f652f;
        arrayList.add(m514n(arrayList, ordering), item);
        mo624K(true);
        return item;
    }

    /* renamed from: g */
    public final C0102i mo663g(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new C0102i(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    public MenuItem add(CharSequence title) {
        return mo640a(0, 0, 0, title);
    }

    public MenuItem add(int titleRes) {
        return mo640a(0, 0, 0, this.f648b.getString(titleRes));
    }

    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return mo640a(group, id, categoryOrder, title);
    }

    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return mo640a(group, id, categoryOrder, this.f648b.getString(title));
    }

    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f648b.getString(titleRes));
    }

    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        C0102i item = (C0102i) mo640a(group, id, categoryOrder, title);
        C0122r subMenu = new C0122r(this.f647a, this, item);
        item.mo757x(subMenu);
        return subMenu;
    }

    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, (CharSequence) this.f648b.getString(title));
    }

    public void setGroupDividerEnabled(boolean enabled) {
        this.f671y = enabled;
    }

    /* renamed from: F */
    public boolean mo619F() {
        return this.f671y;
    }

    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i;
        Intent[] intentArr = specifics;
        PackageManager pm = this.f647a.getPackageManager();
        int N = 0;
        Intent intent2 = intent;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, intentArr, intent2, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i2 = 0; i2 < N; i2++) {
            ResolveInfo ri = lri.get(i2);
            int i3 = ri.specificIndex;
            Intent rintent = new Intent(i3 < 0 ? intent2 : intentArr[i3]);
            ActivityInfo activityInfo = ri.activityInfo;
            rintent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem item = add(group, id, categoryOrder, ri.loadLabel(pm)).setIcon(ri.loadIcon(pm)).setIntent(rintent);
            if (outSpecificItems != null && (i = ri.specificIndex) >= 0) {
                outSpecificItems[i] = item;
            }
        }
        int i4 = group;
        int i5 = id;
        int i6 = categoryOrder;
        return N;
    }

    public void removeItem(int id) {
        mo627N(mo673o(id), true);
    }

    public void removeGroup(int group) {
        int i = mo671l(group);
        if (i >= 0) {
            int maxRemovable = this.f652f.size() - i;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f652f.get(i).getGroupId() != group) {
                    mo624K(true);
                } else {
                    mo627N(i, false);
                    numRemoved = numRemoved2;
                }
            }
            mo624K(true);
        }
    }

    /* renamed from: N */
    public final void mo627N(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f652f.size()) {
            this.f652f.remove(index);
            if (updateChildrenOnMenuViews) {
                mo624K(true);
            }
        }
    }

    public void clear() {
        C0102i iVar = this.f670x;
        if (iVar != null) {
            mo661f(iVar);
        }
        this.f652f.clear();
        mo624K(true);
    }

    /* renamed from: T */
    public void mo633T(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f652f.size();
        mo659d0();
        for (int i = 0; i < N; i++) {
            C0102i curItem = this.f652f.get(i);
            if (curItem.getGroupId() == group && curItem.mo729m() && curItem.isCheckable()) {
                curItem.mo735s(curItem == item);
            }
        }
        mo654c0();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f652f.size();
        for (int i = 0; i < N; i++) {
            C0102i item = this.f652f.get(i);
            if (item.getGroupId() == group) {
                item.mo752t(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    public void setGroupVisible(int group, boolean visible) {
        int N = this.f652f.size();
        boolean changedAtLeastOneItem = false;
        for (int i = 0; i < N; i++) {
            C0102i item = this.f652f.get(i);
            if (item.getGroupId() == group && item.mo758y(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            mo624K(true);
        }
    }

    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f652f.size();
        for (int i = 0; i < N; i++) {
            C0102i item = this.f652f.get(i);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f672z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f652f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i = 0; i < size; i++) {
            C0102i item = this.f652f.get(i);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = item.getSubMenu().findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    /* renamed from: o */
    public int mo673o(int id) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f652f.get(i).getItemId() == id) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public int mo671l(int group) {
        return mo672m(group, 0);
    }

    /* renamed from: m */
    public int mo672m(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i < size; i++) {
            if (this.f652f.get(i).getGroupId() == group) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.f652f.size();
    }

    public MenuItem getItem(int index) {
        return this.f652f.get(index);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return mo674p(keyCode, event) != null;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f649c = isQwerty;
        mo624K(false);
    }

    /* renamed from: B */
    public static int m513B(int categoryOrder) {
        int index = (-65536 & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = f646A;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: G */
    public boolean mo620G() {
        return this.f649c;
    }

    /* renamed from: b0 */
    public final void mo652b0(boolean shortcutsVisible) {
        boolean z = true;
        if (!shortcutsVisible || this.f648b.getConfiguration().keyboard == 1 || !C0469s.m2337e(ViewConfiguration.get(this.f647a), this.f647a)) {
            z = false;
        }
        this.f650d = z;
    }

    /* renamed from: H */
    public boolean mo621H() {
        return this.f650d;
    }

    /* renamed from: C */
    public Resources mo616C() {
        return this.f648b;
    }

    /* renamed from: u */
    public Context mo689u() {
        return this.f647a;
    }

    /* renamed from: h */
    public boolean mo665h(C0098g menu, MenuItem item) {
        C0099a aVar = this.f651e;
        return aVar != null && aVar.mo140b(menu, item);
    }

    /* renamed from: d */
    public void mo658d() {
        C0099a aVar = this.f651e;
        if (aVar != null) {
            aVar.mo138a(this);
        }
    }

    /* renamed from: n */
    public static int m514n(ArrayList<C0102i> items, int ordering) {
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).mo705f() <= ordering) {
                return i + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        C0102i item = mo674p(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = mo625L(item, flags);
        }
        if ((flags & 2) != 0) {
            mo660e(true);
        }
        return handled;
    }

    /* renamed from: q */
    public void mo677q(List<C0102i> items, int keyCode, KeyEvent event) {
        List<C0102i> list = items;
        int i = keyCode;
        KeyEvent keyEvent = event;
        boolean qwerty = mo620G();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(possibleChars) || i == 67) {
            int N = this.f652f.size();
            for (int i2 = 0; i2 < N; i2++) {
                C0102i item = this.f652f.get(i2);
                if (item.hasSubMenu()) {
                    ((C0098g) item.getSubMenu()).mo677q(list, i, keyEvent);
                }
                char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
                if (((modifierState & 69647) == (69647 & (qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers()))) && shortcutChar != 0) {
                    char[] cArr = possibleChars.meta;
                    if (shortcutChar != cArr[0] && shortcutChar != cArr[2]) {
                        if (qwerty && shortcutChar == 8) {
                            if (i != 67) {
                            }
                        }
                    }
                    if (item.isEnabled()) {
                        list.add(item);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public C0102i mo674p(int keyCode, KeyEvent event) {
        char shortcutChar;
        ArrayList<C0102i> arrayList = this.f668v;
        arrayList.clear();
        mo677q(arrayList, keyCode, event);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean qwerty = mo620G();
        for (int i = 0; i < size; i++) {
            C0102i item = arrayList.get(i);
            if (qwerty) {
                shortcutChar = item.getAlphabeticShortcut();
            } else {
                shortcutChar = item.getNumericShortcut();
            }
            char[] cArr = possibleChars.meta;
            if ((shortcutChar == cArr[0] && (metaState & 2) == 0) || ((shortcutChar == cArr[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == 8 && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int id, int flags) {
        return mo625L(findItem(id), flags);
    }

    /* renamed from: L */
    public boolean mo625L(MenuItem item, int flags) {
        return mo626M(item, (C0113m) null, flags);
    }

    /* renamed from: M */
    public boolean mo626M(MenuItem item, C0113m preferredPresenter, int flags) {
        C0102i itemImpl = (C0102i) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.mo727k();
        C0441b provider = itemImpl.mo485a();
        boolean providerHasSubMenu = provider != null && provider.mo816a();
        if (itemImpl.mo726j()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                mo660e(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                mo660e(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.mo757x(new C0122r(mo689u(), this, itemImpl));
            }
            C0122r subMenu = (C0122r) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.mo819f(subMenu);
            }
            invoked |= mo669j(subMenu, preferredPresenter);
            if (!invoked) {
                mo660e(true);
            }
        } else if ((flags & 1) == 0) {
            mo660e(true);
        }
        return invoked;
    }

    /* renamed from: e */
    public final void mo660e(boolean closeAllMenus) {
        if (!this.f667u) {
            this.f667u = true;
            Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                C0113m presenter = (C0113m) ref.get();
                if (presenter == null) {
                    this.f669w.remove(ref);
                } else {
                    presenter.mo546b(this, closeAllMenus);
                }
            }
            this.f667u = false;
        }
    }

    public void close() {
        mo660e(true);
    }

    /* renamed from: K */
    public void mo624K(boolean structureChanged) {
        if (!this.f663q) {
            if (structureChanged) {
                this.f654h = true;
                this.f657k = true;
            }
            mo667i(structureChanged);
            return;
        }
        this.f664r = true;
        if (structureChanged) {
            this.f665s = true;
        }
    }

    /* renamed from: d0 */
    public void mo659d0() {
        if (!this.f663q) {
            this.f663q = true;
            this.f664r = false;
            this.f665s = false;
        }
    }

    /* renamed from: c0 */
    public void mo654c0() {
        this.f663q = false;
        if (this.f664r) {
            this.f664r = false;
            mo624K(this.f665s);
        }
    }

    /* renamed from: J */
    public void mo623J(C0102i item) {
        this.f654h = true;
        mo624K(true);
    }

    /* renamed from: I */
    public void mo622I(C0102i item) {
        this.f657k = true;
        mo624K(true);
    }

    /* renamed from: E */
    public ArrayList<C0102i> mo618E() {
        if (!this.f654h) {
            return this.f653g;
        }
        this.f653g.clear();
        int itemsSize = this.f652f.size();
        for (int i = 0; i < itemsSize; i++) {
            C0102i item = this.f652f.get(i);
            if (item.isVisible()) {
                this.f653g.add(item);
            }
        }
        this.f654h = false;
        this.f657k = true;
        return this.f653g;
    }

    /* renamed from: r */
    public void mo678r() {
        ArrayList<C0102i> E = mo618E();
        if (this.f657k) {
            boolean flagged = false;
            Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                C0113m presenter = (C0113m) ref.get();
                if (presenter == null) {
                    this.f669w.remove(ref);
                } else {
                    flagged |= presenter.mo575g();
                }
            }
            if (flagged) {
                this.f655i.clear();
                this.f656j.clear();
                int itemsSize = E.size();
                for (int i = 0; i < itemsSize; i++) {
                    C0102i item = E.get(i);
                    if (item.mo728l()) {
                        this.f655i.add(item);
                    } else {
                        this.f656j.add(item);
                    }
                }
            } else {
                this.f655i.clear();
                this.f656j.clear();
                this.f656j.addAll(mo618E());
            }
            this.f657k = false;
        }
    }

    /* renamed from: s */
    public ArrayList<C0102i> mo681s() {
        mo678r();
        return this.f655i;
    }

    /* renamed from: z */
    public ArrayList<C0102i> mo694z() {
        mo678r();
        return this.f656j;
    }

    public void clearHeader() {
        this.f661o = null;
        this.f660n = null;
        this.f662p = null;
        mo624K(false);
    }

    /* renamed from: W */
    public final void mo636W(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r = mo616C();
        if (view != null) {
            this.f662p = view;
            this.f660n = null;
            this.f661o = null;
        } else {
            if (titleRes > 0) {
                this.f660n = r.getText(titleRes);
            } else if (title != null) {
                this.f660n = title;
            }
            if (iconRes > 0) {
                this.f661o = C0339a.m1777c(mo689u(), iconRes);
            } else if (icon != null) {
                this.f661o = icon;
            }
            this.f662p = null;
        }
        mo624K(false);
    }

    /* renamed from: Y */
    public C0098g mo638Y(CharSequence title) {
        mo636W(0, title, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: X */
    public C0098g mo637X(int titleRes) {
        mo636W(titleRes, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: V */
    public C0098g mo635V(Drawable icon) {
        mo636W(0, (CharSequence) null, 0, icon, (View) null);
        return this;
    }

    /* renamed from: U */
    public C0098g mo634U(int iconRes) {
        mo636W(0, (CharSequence) null, iconRes, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: Z */
    public C0098g mo639Z(View view) {
        mo636W(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: x */
    public CharSequence mo692x() {
        return this.f660n;
    }

    /* renamed from: w */
    public Drawable mo691w() {
        return this.f661o;
    }

    /* renamed from: y */
    public View mo693y() {
        return this.f662p;
    }

    /* renamed from: D */
    public C0098g mo617D() {
        return this;
    }

    /* renamed from: A */
    public boolean mo615A() {
        return this.f666t;
    }

    /* renamed from: k */
    public boolean mo670k(C0102i item) {
        if (this.f669w.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        mo659d0();
        Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            C0113m presenter = (C0113m) ref.get();
            if (presenter == null) {
                this.f669w.remove(ref);
            } else {
                boolean c = presenter.mo547c(this, item);
                expanded = c;
                if (c) {
                    break;
                }
            }
        }
        mo654c0();
        if (expanded) {
            this.f670x = item;
        }
        return expanded;
    }

    /* renamed from: f */
    public boolean mo661f(C0102i item) {
        if (this.f669w.isEmpty() || this.f670x != item) {
            return false;
        }
        boolean collapsed = false;
        mo659d0();
        Iterator<WeakReference<C0113m>> it = this.f669w.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            C0113m presenter = (C0113m) ref.get();
            if (presenter == null) {
                this.f669w.remove(ref);
            } else {
                boolean k = presenter.mo554k(this, item);
                collapsed = k;
                if (k) {
                    break;
                }
            }
        }
        mo654c0();
        if (collapsed) {
            this.f670x = null;
        }
        return collapsed;
    }

    /* renamed from: v */
    public C0102i mo690v() {
        return this.f670x;
    }

    /* renamed from: a0 */
    public void mo641a0(boolean override) {
        this.f672z = override;
    }
}
