package p066b.p067a.p068a.p069a.p081l;

import android.util.Property;
import android.view.ViewGroup;
import p066b.p067a.p068a.p069a.C0943f;

/* renamed from: b.a.a.a.l.d */
public class C1026d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f4318a = new C1026d("childrenAlpha");

    public C1026d(String name) {
        super(Float.class, name);
    }

    /* renamed from: a */
    public Float get(ViewGroup object) {
        Float alpha = (Float) object.getTag(C0943f.mtrl_internal_children_alpha_tag);
        if (alpha != null) {
            return alpha;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup object, Float value) {
        float alpha = value.floatValue();
        object.setTag(C0943f.mtrl_internal_children_alpha_tag, Float.valueOf(alpha));
        int count = object.getChildCount();
        for (int i = 0; i < count; i++) {
            object.getChildAt(i).setAlpha(alpha);
        }
    }
}
