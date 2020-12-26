package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p000a.p002b.p009o.p010j.C0097f;
import p000a.p002b.p009o.p010j.C0098g;

/* renamed from: a.b.p.l0 */
public class C0173l0 extends C0162j0 implements C0171k0 {

    /* renamed from: K */
    public static Method f945K;

    /* renamed from: J */
    public C0171k0 f946J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f945K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0173l0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: s */
    public C0147f0 mo1203s(Context context, boolean hijackFocus) {
        C0174a view = new C0174a(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    /* renamed from: N */
    public void mo1230N(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f909F.setEnterTransition((Transition) enterTransition);
        }
    }

    /* renamed from: O */
    public void mo1231O(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f909F.setExitTransition((Transition) exitTransition);
        }
    }

    /* renamed from: P */
    public void mo1232P(C0171k0 hoverListener) {
        this.f946J = hoverListener;
    }

    /* renamed from: Q */
    public void mo1233Q(boolean touchModal) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f945K;
            if (method != null) {
                try {
                    method.invoke(this.f909F, new Object[]{Boolean.valueOf(touchModal)});
                } catch (Exception e) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f909F.setTouchModal(touchModal);
        }
    }

    /* renamed from: h */
    public void mo592h(C0098g menu, MenuItem item) {
        C0171k0 k0Var = this.f946J;
        if (k0Var != null) {
            k0Var.mo592h(menu, item);
        }
    }

    /* renamed from: l */
    public void mo593l(C0098g menu, MenuItem item) {
        C0171k0 k0Var = this.f946J;
        if (k0Var != null) {
            k0Var.mo593l(menu, item);
        }
    }

    /* renamed from: a.b.p.l0$a */
    public static class C0174a extends C0147f0 {

        /* renamed from: p */
        public final int f947p;

        /* renamed from: q */
        public final int f948q;

        /* renamed from: r */
        public C0171k0 f949r;

        /* renamed from: s */
        public MenuItem f950s;

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public C0174a(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            Configuration config = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != config.getLayoutDirection()) {
                this.f947p = 22;
                this.f948q = 21;
                return;
            }
            this.f947p = 21;
            this.f948q = 22;
        }

        public void setHoverListener(C0171k0 hoverListener) {
            this.f949r = hoverListener;
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.f947p) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (selectedItem == null || keyCode != this.f948q) {
                return super.onKeyDown(keyCode, event);
            } else {
                setSelection(-1);
                ((C0097f) getAdapter()).mo607b().mo660e(false);
                return true;
            }
        }

        /* JADX WARNING: type inference failed for: r3v3, types: [android.widget.ListAdapter] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onHoverEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                a.b.p.k0 r0 = r7.f949r
                if (r0 == 0) goto L_0x005f
                android.widget.ListAdapter r0 = r7.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x001b
                r1 = r0
                android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
                int r2 = r1.getHeadersCount()
                android.widget.ListAdapter r3 = r1.getWrappedAdapter()
                r1 = r3
                a.b.o.j.f r1 = (p000a.p002b.p009o.p010j.C0097f) r1
                goto L_0x001f
            L_0x001b:
                r2 = 0
                r1 = r0
                a.b.o.j.f r1 = (p000a.p002b.p009o.p010j.C0097f) r1
            L_0x001f:
                r3 = 0
                int r4 = r8.getAction()
                r5 = 10
                if (r4 == r5) goto L_0x0047
                float r4 = r8.getX()
                int r4 = (int) r4
                float r5 = r8.getY()
                int r5 = (int) r5
                int r4 = r7.pointToPosition(r4, r5)
                r5 = -1
                if (r4 == r5) goto L_0x0047
                int r5 = r4 - r2
                if (r5 < 0) goto L_0x0047
                int r6 = r1.getCount()
                if (r5 >= r6) goto L_0x0047
                a.b.o.j.i r3 = r1.getItem(r5)
            L_0x0047:
                android.view.MenuItem r4 = r7.f950s
                if (r4 == r3) goto L_0x005f
                a.b.o.j.g r5 = r1.mo607b()
                if (r4 == 0) goto L_0x0056
                a.b.p.k0 r6 = r7.f949r
                r6.mo593l(r5, r4)
            L_0x0056:
                r7.f950s = r3
                if (r3 == 0) goto L_0x005f
                a.b.p.k0 r6 = r7.f949r
                r6.mo592h(r5, r3)
            L_0x005f:
                boolean r0 = super.onHoverEvent(r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0173l0.C0174a.onHoverEvent(android.view.MotionEvent):boolean");
        }
    }
}
