package p000a.p062s;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p000a.p018e.C0256a;

/* renamed from: a.s.b */
public class C0755b extends C0754a {

    /* renamed from: d */
    public final SparseIntArray f2860d;

    /* renamed from: e */
    public final Parcel f2861e;

    /* renamed from: f */
    public final int f2862f;

    /* renamed from: g */
    public final int f2863g;

    /* renamed from: h */
    public final String f2864h;

    /* renamed from: i */
    public int f2865i;

    /* renamed from: j */
    public int f2866j;

    /* renamed from: k */
    public int f2867k;

    public C0755b(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), "", new C0256a(), new C0256a(), new C0256a());
    }

    public C0755b(Parcel p, int offset, int end, String prefix, C0256a<String, Method> readCache, C0256a<String, Method> writeCache, C0256a<String, Class> parcelizerCache) {
        super(readCache, writeCache, parcelizerCache);
        this.f2860d = new SparseIntArray();
        this.f2865i = -1;
        this.f2866j = 0;
        this.f2867k = -1;
        this.f2861e = p;
        this.f2862f = offset;
        this.f2863g = end;
        this.f2866j = offset;
        this.f2864h = prefix;
    }

    /* renamed from: m */
    public boolean mo3808m(int fieldId) {
        while (this.f2866j < this.f2863g) {
            int i = this.f2867k;
            if (i == fieldId) {
                return true;
            }
            if (String.valueOf(i).compareTo(String.valueOf(fieldId)) > 0) {
                return false;
            }
            this.f2861e.setDataPosition(this.f2866j);
            int size = this.f2861e.readInt();
            this.f2867k = this.f2861e.readInt();
            this.f2866j += size;
        }
        if (this.f2867k == fieldId) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public void mo3818w(int fieldId) {
        mo3796a();
        this.f2865i = fieldId;
        this.f2860d.put(fieldId, this.f2861e.dataPosition());
        mo3786E(0);
        mo3786E(fieldId);
    }

    /* renamed from: a */
    public void mo3796a() {
        int i = this.f2865i;
        if (i >= 0) {
            int currentFieldPosition = this.f2860d.get(i);
            int position = this.f2861e.dataPosition();
            this.f2861e.setDataPosition(currentFieldPosition);
            this.f2861e.writeInt(position - currentFieldPosition);
            this.f2861e.setDataPosition(position);
        }
    }

    /* renamed from: b */
    public C0754a mo3797b() {
        Parcel parcel = this.f2861e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2866j;
        if (i == this.f2862f) {
            i = this.f2863g;
        }
        int i2 = i;
        return new C0755b(parcel, dataPosition, i2, this.f2864h + "  ", this.f2857a, this.f2858b, this.f2859c);
    }

    /* renamed from: A */
    public void mo3782A(byte[] b) {
        if (b != null) {
            this.f2861e.writeInt(b.length);
            this.f2861e.writeByteArray(b);
            return;
        }
        this.f2861e.writeInt(-1);
    }

    /* renamed from: E */
    public void mo3786E(int val) {
        this.f2861e.writeInt(val);
    }

    /* renamed from: I */
    public void mo3790I(String val) {
        this.f2861e.writeString(val);
    }

    /* renamed from: G */
    public void mo3788G(Parcelable p) {
        this.f2861e.writeParcelable(p, 0);
    }

    /* renamed from: y */
    public void mo3820y(boolean val) {
        this.f2861e.writeInt(val);
    }

    /* renamed from: C */
    public void mo3784C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2861e, 0);
    }

    /* renamed from: k */
    public CharSequence mo3806k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2861e);
    }

    /* renamed from: o */
    public int mo3810o() {
        return this.f2861e.readInt();
    }

    /* renamed from: s */
    public String mo3814s() {
        return this.f2861e.readString();
    }

    /* renamed from: i */
    public byte[] mo3804i() {
        int len = this.f2861e.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f2861e.readByteArray(bytes);
        return bytes;
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo3812q() {
        return this.f2861e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: g */
    public boolean mo3802g() {
        return this.f2861e.readInt() != 0;
    }
}
