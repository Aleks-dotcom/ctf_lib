package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000a.p002b.C0003a;
import p000a.p002b.C0009g;
import p000a.p002b.p009o.C0072a;
import p000a.p002b.p009o.p010j.C0087b;
import p000a.p002b.p009o.p010j.C0098g;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0111l;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p009o.p010j.C0115n;
import p000a.p002b.p009o.p010j.C0118p;
import p000a.p002b.p009o.p010j.C0122r;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0441b;

/* renamed from: a.b.p.c */
public class C0131c extends C0087b implements C0441b.C0442a {

    /* renamed from: A */
    public C0133b f795A;

    /* renamed from: B */
    public final C0138f f796B = new C0138f();

    /* renamed from: C */
    public int f797C;

    /* renamed from: j */
    public C0135d f798j;

    /* renamed from: k */
    public Drawable f799k;

    /* renamed from: l */
    public boolean f800l;

    /* renamed from: m */
    public boolean f801m;

    /* renamed from: n */
    public boolean f802n;

    /* renamed from: o */
    public int f803o;

    /* renamed from: p */
    public int f804p;

    /* renamed from: q */
    public int f805q;

    /* renamed from: r */
    public boolean f806r;

    /* renamed from: s */
    public boolean f807s;

    /* renamed from: t */
    public boolean f808t;

    /* renamed from: u */
    public boolean f809u;

    /* renamed from: v */
    public int f810v;

    /* renamed from: w */
    public final SparseBooleanArray f811w = new SparseBooleanArray();

    /* renamed from: x */
    public C0137e f812x;

    /* renamed from: y */
    public C0132a f813y;

    /* renamed from: z */
    public C0134c f814z;

    public C0131c(Context context) {
        super(context, C0009g.abc_action_menu_layout, C0009g.abc_action_menu_item_layout);
    }

    /* renamed from: i */
    public void mo552i(Context context, C0098g menu) {
        super.mo552i(context, menu);
        Resources res = context.getResources();
        C0072a abp = C0072a.m362b(context);
        if (!this.f802n) {
            this.f801m = abp.mo411h();
        }
        if (!this.f808t) {
            this.f803o = abp.mo406c();
        }
        if (!this.f806r) {
            this.f805q = abp.mo407d();
        }
        int width = this.f803o;
        if (this.f801m) {
            if (this.f798j == null) {
                C0135d dVar = new C0135d(this.f581b);
                this.f798j = dVar;
                if (this.f800l) {
                    dVar.setImageDrawable(this.f799k);
                    this.f799k = null;
                    this.f800l = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f798j.measure(spec, spec);
            }
            width -= this.f798j.getMeasuredWidth();
        } else {
            this.f798j = null;
        }
        this.f804p = width;
        this.f810v = (int) (res.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: E */
    public void mo953E(Configuration newConfig) {
        if (!this.f806r) {
            this.f805q = C0072a.m362b(this.f582c).mo407d();
        }
        C0098g gVar = this.f583d;
        if (gVar != null) {
            gVar.mo624K(true);
        }
    }

    /* renamed from: I */
    public void mo957I(boolean reserveOverflow) {
        this.f801m = reserveOverflow;
        this.f802n = true;
    }

    /* renamed from: F */
    public void mo954F(boolean isExclusive) {
        this.f809u = isExclusive;
    }

    /* renamed from: H */
    public void mo956H(Drawable icon) {
        C0135d dVar = this.f798j;
        if (dVar != null) {
            dVar.setImageDrawable(icon);
            return;
        }
        this.f800l = true;
        this.f799k = icon;
    }

    /* renamed from: z */
    public Drawable mo961z() {
        C0135d dVar = this.f798j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f800l) {
            return this.f799k;
        }
        return null;
    }

    /* renamed from: o */
    public C0115n mo558o(ViewGroup root) {
        C0115n oldMenuView = this.f588i;
        C0115n result = super.mo558o(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    /* renamed from: n */
    public View mo557n(C0102i item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.mo726j()) {
            actionView = super.mo557n(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.mo1136o(lp));
        }
        return actionView;
    }

    /* renamed from: f */
    public void mo550f(C0102i item, C0115n.C0116a itemView) {
        itemView.mo849e(item, 0);
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker((ActionMenuView) this.f588i);
        if (this.f795A == null) {
            this.f795A = new C0133b();
        }
        actionItemView.setPopupCallback(this.f795A);
    }

    /* renamed from: q */
    public boolean mo560q(int childIndex, C0102i item) {
        return item.mo728l();
    }

    /* renamed from: h */
    public void mo551h(boolean cleared) {
        C0115n nVar;
        super.mo551h(cleared);
        ((View) this.f588i).requestLayout();
        C0098g gVar = this.f583d;
        if (gVar != null) {
            ArrayList<C0102i> s = gVar.mo681s();
            int count = s.size();
            for (int i = 0; i < count; i++) {
                C0441b provider = s.get(i).mo485a();
                if (provider != null) {
                    provider.mo2524i(this);
                }
            }
        }
        C0098g gVar2 = this.f583d;
        ArrayList<C0102i> z = gVar2 != null ? gVar2.mo694z() : null;
        boolean hasOverflow = false;
        if (this.f801m && z != null) {
            int count2 = z.size();
            boolean z2 = false;
            if (count2 == 1) {
                hasOverflow = !z.get(0).isActionViewExpanded();
            } else {
                if (count2 > 0) {
                    z2 = true;
                }
                hasOverflow = z2;
            }
        }
        if (hasOverflow) {
            if (this.f798j == null) {
                this.f798j = new C0135d(this.f581b);
            }
            ViewGroup parent = (ViewGroup) this.f798j.getParent();
            if (parent != this.f588i) {
                if (parent != null) {
                    parent.removeView(this.f798j);
                }
                ActionMenuView menuView = (ActionMenuView) this.f588i;
                menuView.addView(this.f798j, menuView.mo4011F());
            }
        } else {
            C0135d dVar = this.f798j;
            if (dVar != null && dVar.getParent() == (nVar = this.f588i)) {
                ((ViewGroup) nVar).removeView(this.f798j);
            }
        }
        ((ActionMenuView) this.f588i).setOverflowReserved(this.f801m);
    }

    /* renamed from: l */
    public boolean mo555l(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.f798j) {
            return false;
        }
        return super.mo555l(parent, childIndex);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.Menu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo549e(p000a.p002b.p009o.p010j.C0122r r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            android.view.Menu r2 = r0.mo881e0()
            a.b.o.j.g r3 = r7.f583d
            if (r2 == r3) goto L_0x0019
            android.view.Menu r2 = r0.mo881e0()
            r0 = r2
            a.b.o.j.r r0 = (p000a.p002b.p009o.p010j.C0122r) r0
            goto L_0x0009
        L_0x0019:
            android.view.MenuItem r2 = r0.getItem()
            android.view.View r2 = r7.mo960y(r2)
            if (r2 != 0) goto L_0x0024
            return r1
        L_0x0024:
            android.view.MenuItem r1 = r8.getItem()
            r1.getItemId()
            r1 = 0
            int r3 = r8.size()
            r4 = 0
        L_0x0031:
            if (r4 >= r3) goto L_0x0048
            android.view.MenuItem r5 = r8.getItem(r4)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x0045
            android.graphics.drawable.Drawable r6 = r5.getIcon()
            if (r6 == 0) goto L_0x0045
            r1 = 1
            goto L_0x0048
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x0048:
            a.b.p.c$a r4 = new a.b.p.c$a
            android.content.Context r5 = r7.f582c
            r4.<init>(r5, r8, r2)
            r7.f813y = r4
            r4.mo838g(r1)
            a.b.p.c$a r4 = r7.f813y
            r4.mo842k()
            super.mo549e(r8)
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0131c.mo549e(a.b.o.j.r):boolean");
    }

    /* renamed from: y */
    public final View mo960y(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.f588i;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);
            if ((child instanceof C0115n.C0116a) && ((C0115n.C0116a) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: J */
    public boolean mo958J() {
        C0098g gVar;
        if (!this.f801m || mo952D() || (gVar = this.f583d) == null || this.f588i == null || this.f814z != null || gVar.mo694z().isEmpty()) {
            return false;
        }
        C0134c cVar = new C0134c(new C0137e(this.f582c, this.f583d, this.f798j, true));
        this.f814z = cVar;
        ((View) this.f588i).post(cVar);
        super.mo549e((C0122r) null);
        return true;
    }

    /* renamed from: A */
    public boolean mo949A() {
        C0115n nVar;
        C0134c cVar = this.f814z;
        if (cVar == null || (nVar = this.f588i) == null) {
            C0111l popup = this.f812x;
            if (popup == null) {
                return false;
            }
            popup.mo833b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f814z = null;
        return true;
    }

    /* renamed from: x */
    public boolean mo959x() {
        return mo949A() | mo950B();
    }

    /* renamed from: B */
    public boolean mo950B() {
        C0132a aVar = this.f813y;
        if (aVar == null) {
            return false;
        }
        aVar.mo833b();
        return true;
    }

    /* renamed from: D */
    public boolean mo952D() {
        C0137e eVar = this.f812x;
        return eVar != null && eVar.mo835d();
    }

    /* renamed from: C */
    public boolean mo951C() {
        return this.f814z != null || mo952D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x0162  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo575g() {
        /*
            r24 = this;
            r0 = r24
            a.b.o.j.g r1 = r0.f583d
            if (r1 == 0) goto L_0x000f
            java.util.ArrayList r1 = r1.mo618E()
            int r2 = r1.size()
            goto L_0x0011
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.f805q
            int r4 = r0.f804p
            r5 = 0
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            a.b.o.j.n r7 = r0.f588i
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0023:
            if (r12 >= r2) goto L_0x004c
            java.lang.Object r13 = r1.get(r12)
            a.b.o.j.i r13 = (p000a.p002b.p009o.p010j.C0102i) r13
            boolean r14 = r13.mo731o()
            if (r14 == 0) goto L_0x0034
            int r8 = r8 + 1
            goto L_0x003e
        L_0x0034:
            boolean r14 = r13.mo730n()
            if (r14 == 0) goto L_0x003d
            int r9 = r9 + 1
            goto L_0x003e
        L_0x003d:
            r11 = 1
        L_0x003e:
            boolean r14 = r0.f809u
            if (r14 == 0) goto L_0x0049
            boolean r14 = r13.isActionViewExpanded()
            if (r14 == 0) goto L_0x0049
            r3 = 0
        L_0x0049:
            int r12 = r12 + 1
            goto L_0x0023
        L_0x004c:
            boolean r12 = r0.f801m
            if (r12 == 0) goto L_0x0058
            if (r11 != 0) goto L_0x0056
            int r12 = r8 + r9
            if (r12 <= r3) goto L_0x0058
        L_0x0056:
            int r3 = r3 + -1
        L_0x0058:
            int r3 = r3 - r8
            android.util.SparseBooleanArray r12 = r0.f811w
            r12.clear()
            r13 = 0
            r14 = 0
            boolean r15 = r0.f807s
            if (r15 == 0) goto L_0x006e
            int r15 = r0.f810v
            int r14 = r4 / r15
            int r16 = r4 % r15
            int r17 = r16 / r14
            int r13 = r15 + r17
        L_0x006e:
            r15 = 0
        L_0x006f:
            if (r15 >= r2) goto L_0x017e
            java.lang.Object r17 = r1.get(r15)
            r5 = r17
            a.b.o.j.i r5 = (p000a.p002b.p009o.p010j.C0102i) r5
            boolean r17 = r5.mo731o()
            r19 = r2
            r2 = 0
            if (r17 == 0) goto L_0x00bb
            android.view.View r2 = r0.mo557n(r5, r2, r7)
            r17 = r8
            boolean r8 = r0.f807s
            if (r8 == 0) goto L_0x0094
            r8 = 0
            int r20 = androidx.appcompat.widget.ActionMenuView.m3817L(r2, r13, r14, r6, r8)
            int r14 = r14 - r20
            goto L_0x0097
        L_0x0094:
            r2.measure(r6, r6)
        L_0x0097:
            int r8 = r2.getMeasuredWidth()
            int r4 = r4 - r8
            if (r10 != 0) goto L_0x009f
            r10 = r8
        L_0x009f:
            r20 = r2
            int r2 = r5.getGroupId()
            if (r2 == 0) goto L_0x00ae
            r21 = r4
            r4 = 1
            r12.put(r2, r4)
            goto L_0x00b1
        L_0x00ae:
            r21 = r4
            r4 = 1
        L_0x00b1:
            r5.mo754u(r4)
            r22 = r1
            r4 = r21
            r0 = 0
            goto L_0x0171
        L_0x00bb:
            r17 = r8
            boolean r8 = r5.mo730n()
            if (r8 == 0) goto L_0x0169
            int r8 = r5.getGroupId()
            boolean r20 = r12.get(r8)
            if (r3 > 0) goto L_0x00cf
            if (r20 == 0) goto L_0x00d9
        L_0x00cf:
            if (r4 <= 0) goto L_0x00d9
            boolean r2 = r0.f807s
            if (r2 == 0) goto L_0x00d7
            if (r14 <= 0) goto L_0x00d9
        L_0x00d7:
            r2 = 1
            goto L_0x00da
        L_0x00d9:
            r2 = 0
        L_0x00da:
            if (r2 == 0) goto L_0x011c
            r22 = r2
            r2 = 0
            android.view.View r2 = r0.mo557n(r5, r2, r7)
            r21 = r3
            boolean r3 = r0.f807s
            if (r3 == 0) goto L_0x00f7
            r3 = 0
            int r23 = androidx.appcompat.widget.ActionMenuView.m3817L(r2, r13, r14, r6, r3)
            int r14 = r14 - r23
            if (r23 != 0) goto L_0x00f4
            r3 = 0
            goto L_0x00f6
        L_0x00f4:
            r3 = r22
        L_0x00f6:
            goto L_0x00fc
        L_0x00f7:
            r2.measure(r6, r6)
            r3 = r22
        L_0x00fc:
            int r22 = r2.getMeasuredWidth()
            int r4 = r4 - r22
            if (r10 != 0) goto L_0x0106
            r10 = r22
        L_0x0106:
            r23 = r2
            boolean r2 = r0.f807s
            if (r2 == 0) goto L_0x0113
            if (r4 < 0) goto L_0x0110
            r2 = 1
            goto L_0x0111
        L_0x0110:
            r2 = 0
        L_0x0111:
            r2 = r2 & r3
            goto L_0x0120
        L_0x0113:
            int r2 = r4 + r10
            if (r2 <= 0) goto L_0x0119
            r2 = 1
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            r2 = r2 & r3
            goto L_0x0120
        L_0x011c:
            r22 = r2
            r21 = r3
        L_0x0120:
            if (r2 == 0) goto L_0x012b
            if (r8 == 0) goto L_0x012b
            r3 = 1
            r12.put(r8, r3)
            r22 = r1
            goto L_0x015e
        L_0x012b:
            if (r20 == 0) goto L_0x015c
            r3 = 0
            r12.put(r8, r3)
            r3 = 0
        L_0x0132:
            if (r3 >= r15) goto L_0x0157
            java.lang.Object r18 = r1.get(r3)
            r0 = r18
            a.b.o.j.i r0 = (p000a.p002b.p009o.p010j.C0102i) r0
            r22 = r1
            int r1 = r0.getGroupId()
            if (r1 != r8) goto L_0x0150
            boolean r1 = r0.mo728l()
            if (r1 == 0) goto L_0x014c
            int r21 = r21 + 1
        L_0x014c:
            r1 = 0
            r0.mo754u(r1)
        L_0x0150:
            int r3 = r3 + 1
            r0 = r24
            r1 = r22
            goto L_0x0132
        L_0x0157:
            r22 = r1
            r3 = r21
            goto L_0x0160
        L_0x015c:
            r22 = r1
        L_0x015e:
            r3 = r21
        L_0x0160:
            if (r2 == 0) goto L_0x0164
            int r3 = r3 + -1
        L_0x0164:
            r5.mo754u(r2)
            r0 = 0
            goto L_0x0171
        L_0x0169:
            r22 = r1
            r21 = r3
            r0 = 0
            r5.mo754u(r0)
        L_0x0171:
            int r15 = r15 + 1
            r0 = r24
            r8 = r17
            r2 = r19
            r1 = r22
            r5 = 0
            goto L_0x006f
        L_0x017e:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p011p.C0131c.mo575g():boolean");
    }

    /* renamed from: b */
    public void mo546b(C0098g menu, boolean allMenusAreClosing) {
        mo959x();
        super.mo546b(menu, allMenusAreClosing);
    }

    /* renamed from: G */
    public void mo955G(ActionMenuView menuView) {
        this.f588i = menuView;
        menuView.mo847d(this.f583d);
    }

    /* renamed from: a.b.p.c$d */
    public class C0135d extends C0185o implements ActionMenuView.C0787a {
        public C0135d(Context context) {
            super(context, (AttributeSet) null, C0003a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0226y0.m1184a(this, getContentDescription());
            setOnTouchListener(new C0136a(this, C0131c.this));
        }

        /* renamed from: a.b.p.c$d$a */
        public class C0136a extends C0154h0 {
            public C0136a(View src, C0131c cVar) {
                super(src);
            }

            /* renamed from: b */
            public C0118p mo968b() {
                C0137e eVar = C0131c.this.f812x;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo834c();
            }

            /* renamed from: c */
            public boolean mo969c() {
                C0131c.this.mo958J();
                return true;
            }

            /* renamed from: d */
            public boolean mo970d() {
                C0131c cVar = C0131c.this;
                if (cVar.f814z != null) {
                    return false;
                }
                cVar.mo949A();
                return true;
            }
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0131c.this.mo958J();
            return true;
        }

        /* renamed from: a */
        public boolean mo964a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo965b() {
            return false;
        }

        public boolean setFrame(int l, int t, int r, int b) {
            boolean changed = super.setFrame(l, t, r, b);
            Drawable d = getDrawable();
            Drawable bg = getBackground();
            if (!(d == null || bg == null)) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0370a.m1942l(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    /* renamed from: a.b.p.c$e */
    public class C0137e extends C0111l {
        public C0137e(Context context, C0098g menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, C0003a.actionOverflowMenuStyle);
            mo839h(8388613);
            mo841j(C0131c.this.f796B);
        }

        /* renamed from: e */
        public void mo836e() {
            if (C0131c.this.f583d != null) {
                C0131c.this.f583d.close();
            }
            C0131c.this.f812x = null;
            super.mo836e();
        }
    }

    /* renamed from: a.b.p.c$a */
    public class C0132a extends C0111l {
        public C0132a(Context context, C0122r subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, C0003a.actionOverflowMenuStyle);
            if (!((C0102i) subMenu.getItem()).mo728l()) {
                View view = C0131c.this.f798j;
                mo837f(view == null ? (View) C0131c.this.f588i : view);
            }
            mo841j(C0131c.this.f796B);
        }

        /* renamed from: e */
        public void mo836e() {
            C0131c cVar = C0131c.this;
            cVar.f813y = null;
            cVar.f797C = 0;
            super.mo836e();
        }
    }

    /* renamed from: a.b.p.c$f */
    public class C0138f implements C0113m.C0114a {
        public C0138f() {
        }

        /* renamed from: c */
        public boolean mo179c(C0098g subMenu) {
            if (subMenu == null) {
                return false;
            }
            C0131c.this.f797C = ((C0122r) subMenu).getItem().getItemId();
            C0113m.C0114a cb = C0131c.this.mo556m();
            if (cb != null) {
                return cb.mo179c(subMenu);
            }
            return false;
        }

        /* renamed from: b */
        public void mo178b(C0098g menu, boolean allMenusAreClosing) {
            if (menu instanceof C0122r) {
                menu.mo617D().mo660e(false);
            }
            C0113m.C0114a cb = C0131c.this.mo556m();
            if (cb != null) {
                cb.mo178b(menu, allMenusAreClosing);
            }
        }
    }

    /* renamed from: a.b.p.c$c */
    public class C0134c implements Runnable {

        /* renamed from: b */
        public C0137e f817b;

        public C0134c(C0137e popup) {
            this.f817b = popup;
        }

        public void run() {
            if (C0131c.this.f583d != null) {
                C0131c.this.f583d.mo658d();
            }
            View menuView = (View) C0131c.this.f588i;
            if (!(menuView == null || menuView.getWindowToken() == null || !this.f817b.mo844m())) {
                C0131c.this.f812x = this.f817b;
            }
            C0131c.this.f814z = null;
        }
    }

    /* renamed from: a.b.p.c$b */
    public class C0133b extends ActionMenuItemView.C0780b {
        public C0133b() {
        }

        /* renamed from: a */
        public C0118p mo962a() {
            C0132a aVar = C0131c.this.f813y;
            if (aVar != null) {
                return aVar.mo834c();
            }
            return null;
        }
    }
}
