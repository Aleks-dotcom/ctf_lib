package p000a.p002b.p006m.p007a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import p000a.p025h.p029f.p030j.C0370a;

/* renamed from: a.b.m.a.b */
public class C0063b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public C0066c f423b;

    /* renamed from: c */
    public Rect f424c;

    /* renamed from: d */
    public Drawable f425d;

    /* renamed from: e */
    public Drawable f426e;

    /* renamed from: f */
    public int f427f = 255;

    /* renamed from: g */
    public boolean f428g;

    /* renamed from: h */
    public int f429h = -1;

    /* renamed from: i */
    public boolean f430i;

    /* renamed from: j */
    public Runnable f431j;

    /* renamed from: k */
    public long f432k;

    /* renamed from: l */
    public long f433l;

    /* renamed from: m */
    public C0065b f434m;

    /* renamed from: b */
    public C0066c mo267b() {
        throw null;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f425d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f426e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f423b.getChangingConfigurations();
    }

    /* renamed from: e */
    public final boolean mo306e() {
        if (!isAutoMirrored() || C0370a.m1936f(this) != 1) {
            return false;
        }
        return true;
    }

    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f423b.mo355l();
        if (r != null) {
            padding.set(r);
            result = (((r.left | r.top) | r.bottom) | r.right) != 0;
        } else {
            Drawable drawable = this.f425d;
            if (drawable != null) {
                result = drawable.getPadding(padding);
            } else {
                result = super.getPadding(padding);
            }
        }
        if (mo306e()) {
            int left = padding.left;
            padding.left = padding.right;
            padding.right = left;
        }
        return result;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f425d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int alpha) {
        if (!this.f428g || this.f427f != alpha) {
            this.f428g = true;
            this.f427f = alpha;
            Drawable drawable = this.f425d;
            if (drawable == null) {
                return;
            }
            if (this.f432k == 0) {
                drawable.setAlpha(alpha);
            } else {
                mo300a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f427f;
    }

    public void setDither(boolean dither) {
        C0066c cVar = this.f423b;
        if (cVar.f469x != dither) {
            cVar.f469x = dither;
            Drawable drawable = this.f425d;
            if (drawable != null) {
                drawable.setDither(dither);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0066c cVar = this.f423b;
        cVar.f441E = true;
        if (cVar.f440D != colorFilter) {
            cVar.f440D = colorFilter;
            Drawable drawable = this.f425d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList tint) {
        C0066c cVar = this.f423b;
        cVar.f444H = true;
        if (cVar.f442F != tint) {
            cVar.f442F = tint;
            C0370a.m1945o(this.f425d, tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        C0066c cVar = this.f423b;
        cVar.f445I = true;
        if (cVar.f443G != tintMode) {
            cVar.f443G = tintMode;
            C0370a.m1946p(this.f425d, tintMode);
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f426e;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f425d;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    public void setAutoMirrored(boolean mirrored) {
        C0066c cVar = this.f423b;
        if (cVar.f439C != mirrored) {
            cVar.f439C = mirrored;
            Drawable drawable = this.f425d;
            if (drawable != null) {
                C0370a.m1940j(drawable, mirrored);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f423b.f439C;
    }

    public void jumpToCurrentState() {
        boolean changed = false;
        Drawable drawable = this.f426e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f426e = null;
            changed = true;
        }
        Drawable drawable2 = this.f425d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f428g) {
                this.f425d.setAlpha(this.f427f);
            }
        }
        if (this.f433l != 0) {
            this.f433l = 0;
            changed = true;
        }
        if (this.f432k != 0) {
            this.f432k = 0;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f425d;
        if (drawable != null) {
            C0370a.m1941k(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f424c;
        if (rect == null) {
            this.f424c = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f425d;
        if (drawable != null) {
            C0370a.m1942l(drawable, left, top, right, bottom);
        }
    }

    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f424c;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f426e;
        if (drawable != null) {
            return drawable.setState(state);
        }
        Drawable drawable2 = this.f425d;
        if (drawable2 != null) {
            return drawable2.setState(state);
        }
        return false;
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f426e;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        Drawable drawable2 = this.f425d;
        if (drawable2 != null) {
            return drawable2.setLevel(level);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f423b.mo365w(layoutDirection, mo302c());
    }

    public int getIntrinsicWidth() {
        if (this.f423b.mo360q()) {
            return this.f423b.mo356m();
        }
        Drawable drawable = this.f425d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f423b.mo360q()) {
            return this.f423b.mo352i();
        }
        Drawable drawable = this.f425d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f423b.mo360q()) {
            return this.f423b.mo354k();
        }
        Drawable drawable = this.f425d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f423b.mo360q()) {
            return this.f423b.mo353j();
        }
        Drawable drawable = this.f425d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable who) {
        C0066c cVar = this.f423b;
        if (cVar != null) {
            cVar.mo359p();
        }
        if (who == this.f425d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f425d && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f425d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        Drawable drawable = this.f426e;
        if (drawable != null) {
            drawable.setVisible(visible, restart);
        }
        Drawable drawable2 = this.f425d;
        if (drawable2 != null) {
            drawable2.setVisible(visible, restart);
        }
        return changed;
    }

    public int getOpacity() {
        Drawable drawable = this.f425d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f423b.mo357n();
    }

    /* renamed from: c */
    public int mo302c() {
        return this.f429h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo307g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f429h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.m.a.b$c r0 = r9.f423b
            int r0 = r0.f438B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x0030
            android.graphics.drawable.Drawable r0 = r9.f426e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f425d
            if (r0 == 0) goto L_0x002a
            r9.f426e = r0
            a.b.m.a.b$c r0 = r9.f423b
            int r0 = r0.f438B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f433l = r0
            goto L_0x0037
        L_0x002a:
            r9.f426e = r4
            r9.f433l = r5
            goto L_0x0037
        L_0x0030:
            android.graphics.drawable.Drawable r0 = r9.f425d
            if (r0 == 0) goto L_0x0037
            r0.setVisible(r1, r1)
        L_0x0037:
            if (r10 < 0) goto L_0x0057
            a.b.m.a.b$c r0 = r9.f423b
            int r1 = r0.f453h
            if (r10 >= r1) goto L_0x0057
            android.graphics.drawable.Drawable r0 = r0.mo349g(r10)
            r9.f425d = r0
            r9.f429h = r10
            if (r0 == 0) goto L_0x0056
            a.b.m.a.b$c r1 = r9.f423b
            int r1 = r1.f437A
            if (r1 <= 0) goto L_0x0053
            long r7 = (long) r1
            long r7 = r7 + r2
            r9.f432k = r7
        L_0x0053:
            r9.mo304d(r0)
        L_0x0056:
            goto L_0x005c
        L_0x0057:
            r9.f425d = r4
            r0 = -1
            r9.f429h = r0
        L_0x005c:
            long r0 = r9.f432k
            r4 = 1
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            long r0 = r9.f433l
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x007b
        L_0x0069:
            java.lang.Runnable r0 = r9.f431j
            if (r0 != 0) goto L_0x0075
            a.b.m.a.b$a r0 = new a.b.m.a.b$a
            r0.<init>()
            r9.f431j = r0
            goto L_0x0078
        L_0x0075:
            r9.unscheduleSelf(r0)
        L_0x0078:
            r9.mo300a(r4)
        L_0x007b:
            r9.invalidateSelf()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p002b.p006m.p007a.C0063b.mo307g(int):boolean");
    }

    /* renamed from: a.b.m.a.b$a */
    public class C0064a implements Runnable {
        public C0064a() {
        }

        public void run() {
            C0063b.this.mo300a(true);
            C0063b.this.invalidateSelf();
        }
    }

    /* renamed from: d */
    public final void mo304d(Drawable d) {
        if (this.f434m == null) {
            this.f434m = new C0065b();
        }
        C0065b bVar = this.f434m;
        bVar.mo338b(d.getCallback());
        d.setCallback(bVar);
        try {
            if (this.f423b.f437A <= 0 && this.f428g) {
                d.setAlpha(this.f427f);
            }
            C0066c cVar = this.f423b;
            if (cVar.f441E) {
                d.setColorFilter(cVar.f440D);
            } else {
                if (cVar.f444H) {
                    C0370a.m1945o(d, cVar.f442F);
                }
                C0066c cVar2 = this.f423b;
                if (cVar2.f445I) {
                    C0370a.m1946p(d, cVar2.f443G);
                }
            }
            d.setVisible(isVisible(), true);
            d.setDither(this.f423b.f469x);
            d.setState(getState());
            d.setLevel(getLevel());
            d.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                d.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                d.setAutoMirrored(this.f423b.f439C);
            }
            Rect hotspotBounds = this.f424c;
            if (i >= 21 && hotspotBounds != null) {
                d.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d.setCallback(this.f434m.mo337a());
        }
    }

    /* renamed from: a */
    public void mo300a(boolean schedule) {
        this.f428g = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f425d;
        if (drawable != null) {
            long j = this.f432k;
            if (j != 0) {
                if (j <= now) {
                    drawable.setAlpha(this.f427f);
                    this.f432k = 0;
                } else {
                    drawable.setAlpha(((255 - (((int) ((j - now) * 255)) / this.f423b.f437A)) * this.f427f) / 255);
                    animating = true;
                }
            }
        } else {
            this.f432k = 0;
        }
        Drawable drawable2 = this.f426e;
        if (drawable2 != null) {
            long j2 = this.f433l;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable2.setVisible(false, false);
                    this.f426e = null;
                    this.f433l = 0;
                } else {
                    drawable2.setAlpha((this.f427f * (((int) ((j2 - now) * 255)) / this.f423b.f438B)) / 255);
                    animating = true;
                }
            }
        } else {
            this.f433l = 0;
        }
        if (schedule && animating) {
            scheduleSelf(this.f431j, 16 + now);
        }
    }

    public Drawable getCurrent() {
        return this.f425d;
    }

    /* renamed from: i */
    public final void mo320i(Resources res) {
        this.f423b.mo367y(res);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f423b.mo343b(theme);
    }

    public boolean canApplyTheme() {
        return this.f423b.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f423b.mo344c()) {
            return null;
        }
        this.f423b.f449d = getChangingConfigurations();
        return this.f423b;
    }

    public Drawable mutate() {
        if (!this.f430i && super.mutate() == this) {
            C0066c clone = mo267b();
            clone.mo294r();
            mo268h(clone);
            this.f430i = true;
        }
        return this;
    }

    /* renamed from: a.b.m.a.b$c */
    public static abstract class C0066c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f437A = 0;

        /* renamed from: B */
        public int f438B = 0;

        /* renamed from: C */
        public boolean f439C;

        /* renamed from: D */
        public ColorFilter f440D;

        /* renamed from: E */
        public boolean f441E;

        /* renamed from: F */
        public ColorStateList f442F;

        /* renamed from: G */
        public PorterDuff.Mode f443G;

        /* renamed from: H */
        public boolean f444H;

        /* renamed from: I */
        public boolean f445I;

        /* renamed from: a */
        public final C0063b f446a;

        /* renamed from: b */
        public Resources f447b;

        /* renamed from: c */
        public int f448c = 160;

        /* renamed from: d */
        public int f449d;

        /* renamed from: e */
        public int f450e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f451f;

        /* renamed from: g */
        public Drawable[] f452g;

        /* renamed from: h */
        public int f453h;

        /* renamed from: i */
        public boolean f454i = false;

        /* renamed from: j */
        public boolean f455j;

        /* renamed from: k */
        public Rect f456k;

        /* renamed from: l */
        public boolean f457l = false;

        /* renamed from: m */
        public boolean f458m;

        /* renamed from: n */
        public int f459n;

        /* renamed from: o */
        public int f460o;

        /* renamed from: p */
        public int f461p;

        /* renamed from: q */
        public int f462q;

        /* renamed from: r */
        public boolean f463r;

        /* renamed from: s */
        public int f464s;

        /* renamed from: t */
        public boolean f465t;

        /* renamed from: u */
        public boolean f466u;

        /* renamed from: v */
        public boolean f467v;

        /* renamed from: w */
        public boolean f468w;

        /* renamed from: x */
        public boolean f469x = true;

        /* renamed from: y */
        public boolean f470y;

        /* renamed from: z */
        public int f471z;

        /* renamed from: r */
        public abstract void mo294r();

        public C0066c(C0066c orig, C0063b owner, Resources res) {
            this.f446a = owner;
            this.f447b = res != null ? res : orig != null ? orig.f447b : null;
            int f = C0063b.m316f(res, orig != null ? orig.f448c : 0);
            this.f448c = f;
            if (orig != null) {
                this.f449d = orig.f449d;
                this.f450e = orig.f450e;
                this.f467v = true;
                this.f468w = true;
                this.f454i = orig.f454i;
                this.f457l = orig.f457l;
                this.f469x = orig.f469x;
                this.f470y = orig.f470y;
                this.f471z = orig.f471z;
                this.f437A = orig.f437A;
                this.f438B = orig.f438B;
                this.f439C = orig.f439C;
                this.f440D = orig.f440D;
                this.f441E = orig.f441E;
                this.f442F = orig.f442F;
                this.f443G = orig.f443G;
                this.f444H = orig.f444H;
                this.f445I = orig.f445I;
                if (orig.f448c == f) {
                    if (orig.f455j) {
                        this.f456k = new Rect(orig.f456k);
                        this.f455j = true;
                    }
                    if (orig.f458m) {
                        this.f459n = orig.f459n;
                        this.f460o = orig.f460o;
                        this.f461p = orig.f461p;
                        this.f462q = orig.f462q;
                        this.f458m = true;
                    }
                }
                if (orig.f463r) {
                    this.f464s = orig.f464s;
                    this.f463r = true;
                }
                if (orig.f465t) {
                    this.f466u = orig.f466u;
                    this.f465t = true;
                }
                Drawable[] origDr = orig.f452g;
                this.f452g = new Drawable[origDr.length];
                this.f453h = orig.f453h;
                SparseArray<Drawable.ConstantState> origDf = orig.f451f;
                if (origDf != null) {
                    this.f451f = origDf.clone();
                } else {
                    this.f451f = new SparseArray<>(this.f453h);
                }
                int count = this.f453h;
                for (int i = 0; i < count; i++) {
                    if (origDr[i] != null) {
                        Drawable.ConstantState cs = origDr[i].getConstantState();
                        if (cs != null) {
                            this.f451f.put(i, cs);
                        } else {
                            this.f452g[i] = origDr[i];
                        }
                    }
                }
                return;
            }
            this.f452g = new Drawable[10];
            this.f453h = 0;
        }

        public int getChangingConfigurations() {
            return this.f449d | this.f450e;
        }

        /* renamed from: a */
        public final int mo342a(Drawable dr) {
            int pos = this.f453h;
            if (pos >= this.f452g.length) {
                mo358o(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f446a);
            this.f452g[pos] = dr;
            this.f453h++;
            this.f450e |= dr.getChangingConfigurations();
            mo359p();
            this.f456k = null;
            this.f455j = false;
            this.f458m = false;
            this.f467v = false;
            return pos;
        }

        /* renamed from: p */
        public void mo359p() {
            this.f463r = false;
            this.f465t = false;
        }

        /* renamed from: f */
        public final int mo348f() {
            return this.f452g.length;
        }

        /* renamed from: e */
        public final void mo347e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f451f;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    this.f452g[this.f451f.keyAt(keyIndex)] = mo361s(this.f451f.valueAt(keyIndex).newDrawable(this.f447b));
                }
                this.f451f = null;
            }
        }

        /* renamed from: s */
        public final Drawable mo361s(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.f471z);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f446a);
            return child2;
        }

        /* renamed from: h */
        public final int mo351h() {
            return this.f453h;
        }

        /* renamed from: g */
        public final Drawable mo349g(int index) {
            int keyIndex;
            Drawable result = this.f452g[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f451f;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable prepared = mo361s(this.f451f.valueAt(keyIndex).newDrawable(this.f447b));
            this.f452g[index] = prepared;
            this.f451f.removeAt(keyIndex);
            if (this.f451f.size() == 0) {
                this.f451f = null;
            }
            return prepared;
        }

        /* renamed from: w */
        public final boolean mo365w(int layoutDirection, int currentIndex) {
            boolean changed = false;
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            for (int i = 0; i < count; i++) {
                if (drawables[i] != null) {
                    boolean childChanged = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        childChanged = drawables[i].setLayoutDirection(layoutDirection);
                    }
                    if (i == currentIndex) {
                        changed = childChanged;
                    }
                }
            }
            this.f471z = layoutDirection;
            return changed;
        }

        /* renamed from: y */
        public final void mo367y(Resources res) {
            if (res != null) {
                this.f447b = res;
                int targetDensity = C0063b.m316f(res, this.f448c);
                int sourceDensity = this.f448c;
                this.f448c = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.f458m = false;
                    this.f455j = false;
                }
            }
        }

        /* renamed from: b */
        public final void mo343b(Resources.Theme theme) {
            if (theme != null) {
                mo347e();
                int count = this.f453h;
                Drawable[] drawables = this.f452g;
                for (int i = 0; i < count; i++) {
                    if (drawables[i] != null && drawables[i].canApplyTheme()) {
                        drawables[i].applyTheme(theme);
                        this.f450e |= drawables[i].getChangingConfigurations();
                    }
                }
                mo367y(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            for (int i = 0; i < count; i++) {
                Drawable d = drawables[i];
                if (d == null) {
                    Drawable.ConstantState future = this.f451f.get(i);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                } else if (d.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: x */
        public final void mo366x(boolean variable) {
            this.f454i = variable;
        }

        /* renamed from: l */
        public final Rect mo355l() {
            if (this.f454i) {
                return null;
            }
            Rect r = this.f456k;
            if (r != null || this.f455j) {
                return r;
            }
            mo347e();
            Rect r2 = null;
            Rect t = new Rect();
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getPadding(t)) {
                    if (r2 == null) {
                        r2 = new Rect(0, 0, 0, 0);
                    }
                    int i2 = t.left;
                    if (i2 > r2.left) {
                        r2.left = i2;
                    }
                    int i3 = t.top;
                    if (i3 > r2.top) {
                        r2.top = i3;
                    }
                    int i4 = t.right;
                    if (i4 > r2.right) {
                        r2.right = i4;
                    }
                    int i5 = t.bottom;
                    if (i5 > r2.bottom) {
                        r2.bottom = i5;
                    }
                }
            }
            this.f455j = true;
            this.f456k = r2;
            return r2;
        }

        /* renamed from: t */
        public final void mo362t(boolean constant) {
            this.f457l = constant;
        }

        /* renamed from: q */
        public final boolean mo360q() {
            return this.f457l;
        }

        /* renamed from: m */
        public final int mo356m() {
            if (!this.f458m) {
                mo346d();
            }
            return this.f459n;
        }

        /* renamed from: i */
        public final int mo352i() {
            if (!this.f458m) {
                mo346d();
            }
            return this.f460o;
        }

        /* renamed from: k */
        public final int mo354k() {
            if (!this.f458m) {
                mo346d();
            }
            return this.f461p;
        }

        /* renamed from: j */
        public final int mo353j() {
            if (!this.f458m) {
                mo346d();
            }
            return this.f462q;
        }

        /* renamed from: d */
        public void mo346d() {
            this.f458m = true;
            mo347e();
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            this.f460o = -1;
            this.f459n = -1;
            this.f462q = 0;
            this.f461p = 0;
            for (int i = 0; i < count; i++) {
                Drawable dr = drawables[i];
                int s = dr.getIntrinsicWidth();
                if (s > this.f459n) {
                    this.f459n = s;
                }
                int s2 = dr.getIntrinsicHeight();
                if (s2 > this.f460o) {
                    this.f460o = s2;
                }
                int s3 = dr.getMinimumWidth();
                if (s3 > this.f461p) {
                    this.f461p = s3;
                }
                int s4 = dr.getMinimumHeight();
                if (s4 > this.f462q) {
                    this.f462q = s4;
                }
            }
        }

        /* renamed from: u */
        public final void mo363u(int duration) {
            this.f437A = duration;
        }

        /* renamed from: v */
        public final void mo364v(int duration) {
            this.f438B = duration;
        }

        /* renamed from: n */
        public final int mo357n() {
            if (this.f463r) {
                return this.f464s;
            }
            mo347e();
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            int op = count > 0 ? drawables[0].getOpacity() : -2;
            for (int i = 1; i < count; i++) {
                op = Drawable.resolveOpacity(op, drawables[i].getOpacity());
            }
            this.f464s = op;
            this.f463r = true;
            return op;
        }

        /* renamed from: o */
        public void mo358o(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f452g, 0, newDrawables, 0, oldSize);
            this.f452g = newDrawables;
        }

        /* renamed from: c */
        public synchronized boolean mo344c() {
            if (this.f467v) {
                return this.f468w;
            }
            mo347e();
            this.f467v = true;
            int count = this.f453h;
            Drawable[] drawables = this.f452g;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getConstantState() == null) {
                    this.f468w = false;
                    return false;
                }
            }
            this.f468w = true;
            return true;
        }
    }

    /* renamed from: h */
    public void mo268h(C0066c state) {
        this.f423b = state;
        int i = this.f429h;
        if (i >= 0) {
            Drawable g = state.mo349g(i);
            this.f425d = g;
            if (g != null) {
                mo304d(g);
            }
        }
        this.f426e = null;
    }

    /* renamed from: a.b.m.a.b$b */
    public static class C0065b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f436b;

        /* renamed from: b */
        public C0065b mo338b(Drawable.Callback callback) {
            this.f436b = callback;
            return this;
        }

        /* renamed from: a */
        public Drawable.Callback mo337a() {
            Drawable.Callback callback = this.f436b;
            this.f436b = null;
            return callback;
        }

        public void invalidateDrawable(Drawable who) {
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f436b;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f436b;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    /* renamed from: f */
    public static int m316f(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
