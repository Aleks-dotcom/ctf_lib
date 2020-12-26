package p000a.p058q;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: a.q.i */
public class C0695i {
    /* renamed from: a */
    public static PropertyValuesHolder m3402a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C0693h(property, path), new float[]{0.0f, 1.0f});
    }
}
