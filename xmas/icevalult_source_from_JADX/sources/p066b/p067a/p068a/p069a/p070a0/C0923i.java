package p066b.p067a.p068a.p069a.p070a0;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: b.a.a.a.a0.i */
public class C0923i extends ImageButton {

    /* renamed from: b */
    public int f3846b;

    public void setVisibility(int visibility) {
        mo5526b(visibility, true);
    }

    /* renamed from: b */
    public final void mo5526b(int visibility, boolean fromUser) {
        super.setVisibility(visibility);
        if (fromUser) {
            this.f3846b = visibility;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3846b;
    }
}
