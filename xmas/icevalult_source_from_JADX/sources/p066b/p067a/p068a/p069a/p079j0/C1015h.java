package p066b.p067a.p068a.p069a.p079j0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p000a.p002b.p004l.p005a.C0053a;
import p066b.p067a.p068a.p069a.C0938e;
import p066b.p067a.p068a.p069a.C0986i;

/* renamed from: b.a.a.a.j0.h */
public class C1015h extends C1011e {

    /* renamed from: d */
    public final TextWatcher f4092d = new C1016a();

    /* renamed from: e */
    public final TextInputLayout.C1180f f4093e = new C1017b();

    /* renamed from: f */
    public final TextInputLayout.C1181g f4094f = new C1018c(this);

    /* renamed from: b.a.a.a.j0.h$a */
    public class C1016a implements TextWatcher {
        public C1016a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            C1015h hVar = C1015h.this;
            hVar.f4065c.setChecked(!hVar.mo5838f());
        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: b.a.a.a.j0.h$b */
    public class C1017b implements TextInputLayout.C1180f {
        public C1017b() {
        }

        /* renamed from: a */
        public void mo5762a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C1015h hVar = C1015h.this;
            hVar.f4065c.setChecked(true ^ hVar.mo5838f());
            editText.removeTextChangedListener(C1015h.this.f4092d);
            editText.addTextChangedListener(C1015h.this.f4092d);
        }
    }

    /* renamed from: b.a.a.a.j0.h$c */
    public class C1018c implements TextInputLayout.C1181g {
        public C1018c(C1015h this$0) {
        }

        /* renamed from: a */
        public void mo5842a(TextInputLayout textInputLayout, int previousIcon) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && previousIcon == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public C1015h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    public void mo5755a() {
        this.f4063a.setEndIconDrawable(C0053a.m277d(this.f4064b, C0938e.design_password_eye));
        TextInputLayout textInputLayout = this.f4063a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C0986i.password_toggle_content_description));
        this.f4063a.setEndIconOnClickListener(new C1019d());
        this.f4063a.mo7010c(this.f4093e);
        this.f4063a.mo7012d(this.f4094f);
    }

    /* renamed from: b.a.a.a.j0.h$d */
    public class C1019d implements View.OnClickListener {
        public C1019d() {
        }

        public void onClick(View v) {
            EditText editText = C1015h.this.f4063a.getEditText();
            if (editText != null) {
                int selection = editText.getSelectionEnd();
                if (C1015h.this.mo5838f()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selection >= 0) {
                    editText.setSelection(selection);
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo5838f() {
        EditText editText = this.f4063a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
