package p066b.p067a.p068a.p069a.p081l;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: b.a.a.a.l.e */
public class C1027e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f4319b = new C1027e();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f4320a = new WeakHashMap<>();

    public C1027e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable object) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(object.getAlpha());
        }
        if (this.f4320a.containsKey(object)) {
            return this.f4320a.get(object);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable object, Integer value) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f4320a.put(object, value);
        }
        object.setAlpha(value.intValue());
    }
}
