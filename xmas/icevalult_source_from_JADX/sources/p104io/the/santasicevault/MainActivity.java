package p104io.the.santasicevault;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import p000a.p002b.p003k.C0019c;
import p097c.p098a.p099a.C1117a;
import p097c.p098a.p099a.p100b.C1118a;
import p097c.p098a.p099a.p103e.C1122a;

/* renamed from: io.the.santasicevault.MainActivity */
public class MainActivity extends C0019c {

    /* renamed from: s */
    public EditText f4966s;

    /* renamed from: t */
    public final C1122a f4967t = new C1122a();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        this.f4966s = (EditText) findViewById(R.id.et);
        ((Button) findViewById(R.id.btn)).setOnClickListener(new C1117a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void mo7193F(View view) {
        if (new C1118a().mo6370a(getApplicationContext(), this.f4966s.getText().toString()).equals("\\83>yTRHm:|fh3::h<bjhc3CJ")) {
            Toast.makeText(this, "You got it!", 0).show();
        } else {
            Toast.makeText(this, "Sorry. Try again.", 0).show();
        }
    }

    public void onStart() {
        super.onStart();
        this.f4967t.mo6372a(getApplicationContext());
    }

    public void onStop() {
        this.f4967t.mo6373b(getApplicationContext());
        super.onStop();
    }
}
