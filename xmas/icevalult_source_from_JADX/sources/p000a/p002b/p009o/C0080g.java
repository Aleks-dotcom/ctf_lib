package p000a.p002b.p009o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.p010j.C0102i;
import p000a.p002b.p009o.p010j.C0104j;
import p000a.p002b.p011p.C0145e0;
import p000a.p002b.p011p.C0218w0;
import p000a.p025h.p031g.p032a.C0376a;
import p000a.p025h.p038m.C0441b;
import p000a.p025h.p038m.C0449g;

/* renamed from: a.b.o.g */
public class C0080g extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f511e;

    /* renamed from: f */
    public static final Class<?>[] f512f;

    /* renamed from: a */
    public final Object[] f513a;

    /* renamed from: b */
    public final Object[] f514b;

    /* renamed from: c */
    public Context f515c;

    /* renamed from: d */
    public Object f516d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f511e = r0
            f512f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p009o.C0080g.<clinit>():void");
    }

    public C0080g(Context context) {
        super(context);
        this.f515c = context;
        Object[] objArr = {context};
        this.f513a = objArr;
        this.f514b = objArr;
    }

    public void inflate(int menuRes, Menu menu) {
        if (!(menu instanceof C0376a)) {
            super.inflate(menuRes, menu);
            return;
        }
        XmlResourceParser parser = null;
        try {
            parser = this.f515c.getResources().getLayout(menuRes);
            mo448c(parser, Xml.asAttributeSet(parser), menu);
            if (parser != null) {
                parser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (parser != null) {
                parser.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo448c(XmlPullParser parser, AttributeSet attrs, Menu menu) {
        C0082b menuState = new C0082b(menu);
        int eventType = parser.getEventType();
        boolean lookingForEndOfUnknownTag = false;
        String unknownTagName = null;
        while (true) {
            if (eventType != 2) {
                eventType = parser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String tagName = parser.getName();
                if (tagName.equals("menu")) {
                    eventType = parser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + tagName);
                }
            }
        }
        boolean reachedEndOfMenu = false;
        while (!reachedEndOfMenu) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String tagName2 = parser.getName();
                        if (lookingForEndOfUnknownTag && tagName2.equals(unknownTagName)) {
                            lookingForEndOfUnknownTag = false;
                            unknownTagName = null;
                        } else if (tagName2.equals("group")) {
                            menuState.mo458h();
                        } else if (tagName2.equals("item")) {
                            if (!menuState.mo454d()) {
                                C0441b bVar = menuState.f520A;
                                if (bVar == null || !bVar.mo816a()) {
                                    menuState.mo451a();
                                } else {
                                    menuState.mo452b();
                                }
                            }
                        } else if (tagName2.equals("menu")) {
                            reachedEndOfMenu = true;
                        }
                    }
                } else if (!lookingForEndOfUnknownTag) {
                    String tagName3 = parser.getName();
                    if (tagName3.equals("group")) {
                        menuState.mo456f(attrs);
                    } else if (tagName3.equals("item")) {
                        menuState.mo457g(attrs);
                    } else if (tagName3.equals("menu")) {
                        mo448c(parser, attrs, menuState.mo452b());
                    } else {
                        lookingForEndOfUnknownTag = true;
                        unknownTagName = tagName3;
                    }
                }
                eventType = parser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* renamed from: b */
    public Object mo447b() {
        if (this.f516d == null) {
            this.f516d = mo446a(this.f515c);
        }
        return this.f516d;
    }

    /* renamed from: a */
    public final Object mo446a(Object owner) {
        if (!(owner instanceof Activity) && (owner instanceof ContextWrapper)) {
            return mo446a(((ContextWrapper) owner).getBaseContext());
        }
        return owner;
    }

    /* renamed from: a.b.o.g$a */
    public static class C0081a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f517c = {MenuItem.class};

        /* renamed from: a */
        public Object f518a;

        /* renamed from: b */
        public Method f519b;

        public C0081a(Object realOwner, String methodName) {
            this.f518a = realOwner;
            Class<?> c = realOwner.getClass();
            try {
                this.f519b = c.getMethod(methodName, f517c);
            } catch (Exception e) {
                InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + methodName + " in class " + c.getName());
                ex.initCause(e);
                throw ex;
            }
        }

        public boolean onMenuItemClick(MenuItem item) {
            try {
                if (this.f519b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f519b.invoke(this.f518a, new Object[]{item})).booleanValue();
                }
                this.f519b.invoke(this.f518a, new Object[]{item});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a.b.o.g$b */
    public class C0082b {

        /* renamed from: A */
        public C0441b f520A;

        /* renamed from: B */
        public CharSequence f521B;

        /* renamed from: C */
        public CharSequence f522C;

        /* renamed from: D */
        public ColorStateList f523D = null;

        /* renamed from: E */
        public PorterDuff.Mode f524E = null;

        /* renamed from: a */
        public Menu f526a;

        /* renamed from: b */
        public int f527b;

        /* renamed from: c */
        public int f528c;

        /* renamed from: d */
        public int f529d;

        /* renamed from: e */
        public int f530e;

        /* renamed from: f */
        public boolean f531f;

        /* renamed from: g */
        public boolean f532g;

        /* renamed from: h */
        public boolean f533h;

        /* renamed from: i */
        public int f534i;

        /* renamed from: j */
        public int f535j;

        /* renamed from: k */
        public CharSequence f536k;

        /* renamed from: l */
        public CharSequence f537l;

        /* renamed from: m */
        public int f538m;

        /* renamed from: n */
        public char f539n;

        /* renamed from: o */
        public int f540o;

        /* renamed from: p */
        public char f541p;

        /* renamed from: q */
        public int f542q;

        /* renamed from: r */
        public int f543r;

        /* renamed from: s */
        public boolean f544s;

        /* renamed from: t */
        public boolean f545t;

        /* renamed from: u */
        public boolean f546u;

        /* renamed from: v */
        public int f547v;

        /* renamed from: w */
        public int f548w;

        /* renamed from: x */
        public String f549x;

        /* renamed from: y */
        public String f550y;

        /* renamed from: z */
        public String f551z;

        public C0082b(Menu menu) {
            this.f526a = menu;
            mo458h();
        }

        /* renamed from: h */
        public void mo458h() {
            this.f527b = 0;
            this.f528c = 0;
            this.f529d = 0;
            this.f530e = 0;
            this.f531f = true;
            this.f532g = true;
        }

        /* renamed from: f */
        public void mo456f(AttributeSet attrs) {
            TypedArray a = C0080g.this.f515c.obtainStyledAttributes(attrs, C0012j.f144g1);
            this.f527b = a.getResourceId(C0012j.f154i1, 0);
            this.f528c = a.getInt(C0012j.f164k1, 0);
            this.f529d = a.getInt(C0012j.f169l1, 0);
            this.f530e = a.getInt(C0012j.f174m1, 0);
            this.f531f = a.getBoolean(C0012j.f159j1, true);
            this.f532g = a.getBoolean(C0012j.f149h1, true);
            a.recycle();
        }

        /* renamed from: g */
        public void mo457g(AttributeSet attrs) {
            C0218w0 a = C0218w0.m1092t(C0080g.this.f515c, attrs, C0012j.f179n1);
            this.f534i = a.mo1509n(C0012j.f194q1, 0);
            this.f535j = (-65536 & a.mo1506k(C0012j.f209t1, this.f528c)) | (65535 & a.mo1506k(C0012j.f214u1, this.f529d));
            this.f536k = a.mo1511p(C0012j.f219v1);
            this.f537l = a.mo1511p(C0012j.f224w1);
            this.f538m = a.mo1509n(C0012j.f184o1, 0);
            this.f539n = mo453c(a.mo1510o(C0012j.f228x1));
            this.f540o = a.mo1506k(C0012j.f26E1, 4096);
            this.f541p = mo453c(a.mo1510o(C0012j.f232y1));
            this.f542q = a.mo1506k(C0012j.f42I1, 4096);
            int i = C0012j.f236z1;
            if (a.mo1513r(i)) {
                this.f543r = a.mo1496a(i, false) ? 1 : 0;
            } else {
                this.f543r = this.f530e;
            }
            this.f544s = a.mo1496a(C0012j.f199r1, false);
            this.f545t = a.mo1496a(C0012j.f204s1, this.f531f);
            this.f546u = a.mo1496a(C0012j.f189p1, this.f532g);
            this.f547v = a.mo1506k(C0012j.f46J1, -1);
            this.f551z = a.mo1510o(C0012j.f10A1);
            this.f548w = a.mo1509n(C0012j.f14B1, 0);
            this.f549x = a.mo1510o(C0012j.f22D1);
            String o = a.mo1510o(C0012j.f18C1);
            this.f550y = o;
            boolean hasActionProvider = o != null;
            if (hasActionProvider && this.f548w == 0 && this.f549x == null) {
                this.f520A = (C0441b) mo455e(o, C0080g.f512f, C0080g.this.f514b);
            } else {
                if (hasActionProvider) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f520A = null;
            }
            this.f521B = a.mo1511p(C0012j.f30F1);
            this.f522C = a.mo1511p(C0012j.f50K1);
            int i2 = C0012j.f38H1;
            if (a.mo1513r(i2)) {
                this.f524E = C0145e0.m827d(a.mo1506k(i2, -1), this.f524E);
            } else {
                this.f524E = null;
            }
            int i3 = C0012j.f34G1;
            if (a.mo1513r(i3)) {
                this.f523D = a.mo1498c(i3);
            } else {
                this.f523D = null;
            }
            a.mo1514v();
            this.f533h = false;
        }

        /* renamed from: c */
        public final char mo453c(String shortcutString) {
            if (shortcutString == null) {
                return 0;
            }
            return shortcutString.charAt(0);
        }

        /* renamed from: i */
        public final void mo459i(MenuItem item) {
            item.setChecked(this.f544s).setVisible(this.f545t).setEnabled(this.f546u).setCheckable(this.f543r >= 1).setTitleCondensed(this.f537l).setIcon(this.f538m);
            int i = this.f547v;
            if (i >= 0) {
                item.setShowAsAction(i);
            }
            if (this.f551z != null) {
                if (!C0080g.this.f515c.isRestricted()) {
                    item.setOnMenuItemClickListener(new C0081a(C0080g.this.mo447b(), this.f551z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (item instanceof C0102i) {
                C0102i iVar = (C0102i) item;
            }
            if (this.f543r >= 2) {
                if (item instanceof C0102i) {
                    ((C0102i) item).mo752t(true);
                } else if (item instanceof C0104j) {
                    ((C0104j) item).mo782h(true);
                }
            }
            boolean actionViewSpecified = false;
            String str = this.f549x;
            if (str != null) {
                item.setActionView((View) mo455e(str, C0080g.f511e, C0080g.this.f513a));
                actionViewSpecified = true;
            }
            int i2 = this.f548w;
            if (i2 > 0) {
                if (!actionViewSpecified) {
                    item.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C0441b bVar = this.f520A;
            if (bVar != null) {
                C0449g.m2186a(item, bVar);
            }
            C0449g.m2188c(item, this.f521B);
            C0449g.m2192g(item, this.f522C);
            C0449g.m2187b(item, this.f539n, this.f540o);
            C0449g.m2191f(item, this.f541p, this.f542q);
            PorterDuff.Mode mode = this.f524E;
            if (mode != null) {
                C0449g.m2190e(item, mode);
            }
            ColorStateList colorStateList = this.f523D;
            if (colorStateList != null) {
                C0449g.m2189d(item, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo451a() {
            this.f533h = true;
            mo459i(this.f526a.add(this.f527b, this.f534i, this.f535j, this.f536k));
        }

        /* renamed from: b */
        public SubMenu mo452b() {
            this.f533h = true;
            SubMenu subMenu = this.f526a.addSubMenu(this.f527b, this.f534i, this.f535j, this.f536k);
            mo459i(subMenu.getItem());
            return subMenu;
        }

        /* renamed from: d */
        public boolean mo454d() {
            return this.f533h;
        }

        /* renamed from: e */
        public final <T> T mo455e(String className, Class<?>[] constructorSignature, Object[] arguments) {
            try {
                Constructor<?> constructor = Class.forName(className, false, C0080g.this.f515c.getClassLoader()).getConstructor(constructorSignature);
                constructor.setAccessible(true);
                return constructor.newInstance(arguments);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + className, e);
                return null;
            }
        }
    }
}
