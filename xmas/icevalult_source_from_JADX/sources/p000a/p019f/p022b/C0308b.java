package p000a.p019f.p022b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import p000a.p019f.p020a.p021j.C0298j;

/* renamed from: a.f.b.b */
public abstract class C0308b extends View {

    /* renamed from: b */
    public int[] f1522b = new int[32];

    /* renamed from: c */
    public int f1523c;

    /* renamed from: d */
    public Context f1524d;

    /* renamed from: e */
    public C0298j f1525e;

    /* renamed from: f */
    public boolean f1526f = false;

    /* renamed from: g */
    public String f1527g;

    public C0308b(Context context) {
        super(context);
        this.f1524d = context;
        mo2160b((AttributeSet) null);
    }

    /* renamed from: b */
    public void mo2160b(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0317h.f1679a);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0317h.f1706j) {
                    String string = a.getString(attr);
                    this.f1527g = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1522b, this.f1523c);
    }

    public void setReferencedIds(int[] ids) {
        this.f1523c = 0;
        for (int tag : ids) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int tag, Object value) {
        int i = this.f1523c + 1;
        int[] iArr = this.f1522b;
        if (i > iArr.length) {
            this.f1522b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1522b;
        int i2 = this.f1523c;
        iArr2[i2] = tag;
        this.f1523c = i2 + 1;
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f1526f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: f */
    public void mo2168f() {
        if (this.f1525e != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof ConstraintLayout.C0820a) {
                ((ConstraintLayout.C0820a) params).f3319k0 = this.f1525e;
            }
        }
    }

    /* renamed from: a */
    public final void mo2164a(String idString) {
        Object value;
        if (idString != null && this.f1524d != null) {
            String idString2 = idString.trim();
            int tag = 0;
            try {
                tag = C0316g.class.getField(idString2).getInt((Object) null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = this.f1524d.getResources().getIdentifier(idString2, "id", this.f1524d.getPackageName());
            }
            if (tag == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) getParent()).mo4303c(0, idString2)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            if (tag != 0) {
                setTag(tag, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + idString2 + "\"");
        }
    }

    private void setIds(String idList) {
        if (idList != null) {
            int begin = 0;
            while (true) {
                int end = idList.indexOf(44, begin);
                if (end == -1) {
                    mo2164a(idList.substring(begin));
                    return;
                } else {
                    mo2164a(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    /* renamed from: e */
    public void mo2167e(ConstraintLayout container) {
        if (isInEditMode()) {
            setIds(this.f1527g);
        }
        C0298j jVar = this.f1525e;
        if (jVar != null) {
            jVar.mo2131J0();
            for (int i = 0; i < this.f1523c; i++) {
                View view = container.mo4307e(this.f1522b[i]);
                if (view != null) {
                    this.f1525e.mo2130I0(container.mo4308f(view));
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2165c(ConstraintLayout container) {
    }

    /* renamed from: d */
    public void mo2166d(ConstraintLayout container) {
    }
}
