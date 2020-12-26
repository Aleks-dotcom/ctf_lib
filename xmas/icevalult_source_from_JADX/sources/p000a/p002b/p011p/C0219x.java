package p000a.p002b.p011p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p000a.p025h.p037l.C0419h;

/* renamed from: a.b.p.x */
public final class C0219x {

    /* renamed from: a */
    public TextView f1082a;

    /* renamed from: b */
    public TextClassifier f1083b;

    public C0219x(TextView textView) {
        C0419h.m2060c(textView);
        this.f1082a = textView;
    }

    /* renamed from: b */
    public void mo1516b(TextClassifier textClassifier) {
        this.f1083b = textClassifier;
    }

    /* renamed from: a */
    public TextClassifier mo1515a() {
        TextClassifier textClassifier = this.f1083b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager tcm = (TextClassificationManager) this.f1082a.getContext().getSystemService(TextClassificationManager.class);
        if (tcm != null) {
            return tcm.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
