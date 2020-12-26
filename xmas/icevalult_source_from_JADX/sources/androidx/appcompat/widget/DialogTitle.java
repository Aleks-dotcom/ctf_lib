package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import p000a.p002b.C0012j;
import p000a.p002b.p011p.C0227z;

public class DialogTitle extends C0227z {
    public DialogTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int lineCount;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray a = getContext().obtainStyledAttributes((AttributeSet) null, C0012j.f215u2, 16842817, 16973892);
            int textSize = a.getDimensionPixelSize(C0012j.f220v2, 0);
            if (textSize != 0) {
                setTextSize(0, (float) textSize);
            }
            a.recycle();
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
