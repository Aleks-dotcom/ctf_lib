package p066b.p067a.p068a.p069a.p081l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: b.a.a.a.l.f */
public class C1028f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f4321a = new Matrix();

    public C1028f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: b */
    public void set(ImageView object, Matrix value) {
        object.setImageMatrix(value);
    }

    /* renamed from: a */
    public Matrix get(ImageView object) {
        this.f4321a.set(object.getImageMatrix());
        return this.f4321a;
    }
}
