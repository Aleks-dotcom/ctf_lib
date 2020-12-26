package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatViewInflater;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p000a.p002b.p011p.C0146f;
import p000a.p002b.p011p.C0150g;
import p000a.p002b.p011p.C0198s;
import p000a.p002b.p011p.C0227z;
import p066b.p067a.p068a.p069a.p072c0.C0927a;
import p066b.p067a.p068a.p069a.p087r.C1046a;

@Keep
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int floatingToolbarItemBackgroundResId = -1;

    public C0146f createButton(Context context, AttributeSet attrs) {
        if (shouldInflateAppCompatButton(context, attrs)) {
            return new C0146f(context, attrs);
        }
        return new MaterialButton(context, attrs);
    }

    public boolean shouldInflateAppCompatButton(Context context, AttributeSet attrs) {
        int i = Build.VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (floatingToolbarItemBackgroundResId == -1) {
            floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = floatingToolbarItemBackgroundResId;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attrs.getAttributeCount(); i3++) {
                if (attrs.getAttributeNameResource(i3) == 16842964 && floatingToolbarItemBackgroundResId == attrs.getAttributeListValue(i3, (String[]) null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C0150g createCheckBox(Context context, AttributeSet attrs) {
        return new C1046a(context, attrs);
    }

    public C0198s createRadioButton(Context context, AttributeSet attrs) {
        return new C0927a(context, attrs);
    }

    public C0227z createTextView(Context context, AttributeSet attrs) {
        return new MaterialTextView(context, attrs);
    }
}
