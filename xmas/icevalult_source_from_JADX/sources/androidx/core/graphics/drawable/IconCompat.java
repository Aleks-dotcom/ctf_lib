package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j */
    public static final PorterDuff.Mode f3389j = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3390a = -1;

    /* renamed from: b */
    public Object f3391b;

    /* renamed from: c */
    public byte[] f3392c = null;

    /* renamed from: d */
    public Parcelable f3393d = null;

    /* renamed from: e */
    public int f3394e = 0;

    /* renamed from: f */
    public int f3395f = 0;

    /* renamed from: g */
    public ColorStateList f3396g = null;

    /* renamed from: h */
    public PorterDuff.Mode f3397h = f3389j;

    /* renamed from: i */
    public String f3398i = null;

    /* renamed from: c */
    public String mo4479c() {
        int i = this.f3390a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m4082d((Icon) this.f3391b);
        }
        if (i == 2) {
            return ((String) this.f3391b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: a */
    public int mo4478a() {
        int i = this.f3390a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m4081b((Icon) this.f3391b);
        }
        if (i == 2) {
            return this.f3394e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != 5) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f3390a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f3391b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f3390a
            java.lang.String r1 = m4083g(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.f3390a
            r2 = 1
            if (r1 == r2) goto L_0x007b
            r3 = 2
            if (r1 == r3) goto L_0x0053
            r2 = 3
            if (r1 == r2) goto L_0x003a
            r2 = 4
            if (r1 == r2) goto L_0x002f
            r2 = 5
            if (r1 == r2) goto L_0x007b
            goto L_0x009c
        L_0x002f:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f3391b
            r0.append(r1)
            goto L_0x009c
        L_0x003a:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f3394e
            r0.append(r1)
            int r1 = r4.f3395f
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f3395f
            r0.append(r1)
            goto L_0x009c
        L_0x0053:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo4479c()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo4478a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009c
        L_0x007b:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f3391b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f3391b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
            r0.append(r1)
        L_0x009c:
            android.content.res.ColorStateList r1 = r4.f3396g
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f3396g
            r0.append(r1)
        L_0x00aa:
            android.graphics.PorterDuff$Mode r1 = r4.f3397h
            android.graphics.PorterDuff$Mode r2 = f3389j
            if (r1 == r2) goto L_0x00ba
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f3397h
            r0.append(r1)
        L_0x00ba:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: f */
    public void mo4481f(boolean isStream) {
        this.f3398i = this.f3397h.name();
        int i = this.f3390a;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f3392c = ((String) this.f3391b).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.f3392c = (byte[]) this.f3391b;
                    return;
                } else if (i == 4) {
                    this.f3392c = this.f3391b.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (isStream) {
                ByteArrayOutputStream data = new ByteArrayOutputStream();
                ((Bitmap) this.f3391b).compress(Bitmap.CompressFormat.PNG, 90, data);
                this.f3392c = data.toByteArray();
                return;
            }
            this.f3393d = (Parcelable) this.f3391b;
        } else if (!isStream) {
            this.f3393d = (Parcelable) this.f3391b;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: e */
    public void mo4480e() {
        this.f3397h = PorterDuff.Mode.valueOf(this.f3398i);
        int i = this.f3390a;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f3391b = this.f3392c;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f3391b = new String(this.f3392c, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f3393d;
            if (parcelable != null) {
                this.f3391b = parcelable;
                return;
            }
            byte[] bArr = this.f3392c;
            this.f3391b = bArr;
            this.f3390a = 3;
            this.f3394e = 0;
            this.f3395f = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f3393d;
        if (parcelable2 != null) {
            this.f3391b = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* renamed from: g */
    public static String m4083g(int x) {
        if (x == 1) {
            return "BITMAP";
        }
        if (x == 2) {
            return "RESOURCE";
        }
        if (x == 3) {
            return "DATA";
        }
        if (x == 4) {
            return "URI";
        }
        if (x != 5) {
            return "UNKNOWN";
        }
        return "BITMAP_MASKABLE";
    }

    /* renamed from: d */
    public static String m4082d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: b */
    public static int m4081b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
