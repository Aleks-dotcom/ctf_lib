package p000a.p062s;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p018e.C0256a;

/* renamed from: a.s.a */
public abstract class C0754a {

    /* renamed from: a */
    public final C0256a<String, Method> f2857a;

    /* renamed from: b */
    public final C0256a<String, Method> f2858b;

    /* renamed from: c */
    public final C0256a<String, Class> f2859c;

    /* renamed from: A */
    public abstract void mo3782A(byte[] bArr);

    /* renamed from: C */
    public abstract void mo3784C(CharSequence charSequence);

    /* renamed from: E */
    public abstract void mo3786E(int i);

    /* renamed from: G */
    public abstract void mo3788G(Parcelable parcelable);

    /* renamed from: I */
    public abstract void mo3790I(String str);

    /* renamed from: a */
    public abstract void mo3796a();

    /* renamed from: b */
    public abstract C0754a mo3797b();

    /* renamed from: g */
    public abstract boolean mo3802g();

    /* renamed from: i */
    public abstract byte[] mo3804i();

    /* renamed from: k */
    public abstract CharSequence mo3806k();

    /* renamed from: m */
    public abstract boolean mo3808m(int i);

    /* renamed from: o */
    public abstract int mo3810o();

    /* renamed from: q */
    public abstract <T extends Parcelable> T mo3812q();

    /* renamed from: s */
    public abstract String mo3814s();

    /* renamed from: w */
    public abstract void mo3818w(int i);

    /* renamed from: y */
    public abstract void mo3820y(boolean z);

    public C0754a(C0256a<String, Method> readCache, C0256a<String, Method> writeCache, C0256a<String, Class> parcelizerCache) {
        this.f2857a = readCache;
        this.f2858b = writeCache;
        this.f2859c = parcelizerCache;
    }

    /* renamed from: f */
    public boolean mo3801f() {
        return false;
    }

    /* renamed from: x */
    public void mo3819x(boolean allowSerialization, boolean ignoreParcelables) {
    }

    /* renamed from: z */
    public void mo3821z(boolean val, int fieldId) {
        mo3818w(fieldId);
        mo3820y(val);
    }

    /* renamed from: B */
    public void mo3783B(byte[] b, int fieldId) {
        mo3818w(fieldId);
        mo3782A(b);
    }

    /* renamed from: D */
    public void mo3785D(CharSequence val, int fieldId) {
        mo3818w(fieldId);
        mo3784C(val);
    }

    /* renamed from: F */
    public void mo3787F(int val, int fieldId) {
        mo3818w(fieldId);
        mo3786E(val);
    }

    /* renamed from: J */
    public void mo3791J(String val, int fieldId) {
        mo3818w(fieldId);
        mo3790I(val);
    }

    /* renamed from: H */
    public void mo3789H(Parcelable p, int fieldId) {
        mo3818w(fieldId);
        mo3788G(p);
    }

    /* renamed from: h */
    public boolean mo3803h(boolean def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3802g();
    }

    /* renamed from: p */
    public int mo3811p(int def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3810o();
    }

    /* renamed from: t */
    public String mo3815t(String def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3814s();
    }

    /* renamed from: j */
    public byte[] mo3805j(byte[] def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3804i();
    }

    /* renamed from: r */
    public <T extends Parcelable> T mo3813r(T def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3812q();
    }

    /* renamed from: l */
    public CharSequence mo3807l(CharSequence def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3806k();
    }

    /* renamed from: M */
    public void mo3794M(C0756c p, int fieldId) {
        mo3818w(fieldId);
        mo3793L(p);
    }

    /* renamed from: L */
    public void mo3793L(C0756c p) {
        if (p == null) {
            mo3790I((String) null);
            return;
        }
        mo3795N(p);
        C0754a subParcel = mo3797b();
        mo3792K(p, subParcel);
        subParcel.mo3796a();
    }

    /* renamed from: N */
    public final void mo3795N(C0756c p) {
        try {
            mo3790I(mo3798c(p.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: v */
    public <T extends C0756c> T mo3817v(T def, int fieldId) {
        if (!mo3808m(fieldId)) {
            return def;
        }
        return mo3816u();
    }

    /* renamed from: u */
    public <T extends C0756c> T mo3816u() {
        String name = mo3814s();
        if (name == null) {
            return null;
        }
        return mo3809n(name, mo3797b());
    }

    /* renamed from: n */
    public <T extends C0756c> T mo3809n(String parcelCls, C0754a versionedParcel) {
        try {
            return (C0756c) mo3799d(parcelCls).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: K */
    public <T extends C0756c> void mo3792K(T val, C0754a versionedParcel) {
        try {
            mo3800e(val.getClass()).invoke((Object) null, new Object[]{val, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: d */
    public final Method mo3799d(String parcelCls) {
        Class<C0754a> cls = C0754a.class;
        Method m = this.f2857a.get(parcelCls);
        if (m != null) {
            return m;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Method m2 = Class.forName(parcelCls, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f2857a.put(parcelCls, m2);
        return m2;
    }

    /* renamed from: e */
    public final Method mo3800e(Class baseCls) {
        Method m = this.f2858b.get(baseCls.getName());
        if (m != null) {
            return m;
        }
        Class cls = mo3798c(baseCls);
        long currentTimeMillis = System.currentTimeMillis();
        Method m2 = cls.getDeclaredMethod("write", new Class[]{baseCls, C0754a.class});
        this.f2858b.put(baseCls.getName(), m2);
        return m2;
    }

    /* renamed from: c */
    public final Class mo3798c(Class<? extends C0756c> cls) {
        Class ret = this.f2859c.get(cls.getName());
        if (ret != null) {
            return ret;
        }
        Class ret2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f2859c.put(cls.getName(), ret2);
        return ret2;
    }
}
