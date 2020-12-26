package p000a.p002b.p009o.p010j;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import p000a.p002b.C0009g;
import p000a.p002b.p003k.C0017b;
import p000a.p002b.p009o.p010j.C0113m;

/* renamed from: a.b.o.j.h */
public class C0101h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0113m.C0114a {

    /* renamed from: b */
    public C0098g f673b;

    /* renamed from: c */
    public C0017b f674c;

    /* renamed from: d */
    public C0095e f675d;

    /* renamed from: e */
    public C0113m.C0114a f676e;

    public C0101h(C0098g menu) {
        this.f673b = menu;
    }

    /* renamed from: d */
    public void mo697d(IBinder windowToken) {
        C0098g menu = this.f673b;
        C0017b.C0018a builder = new C0017b.C0018a(menu.mo689u());
        C0095e eVar = new C0095e(builder.mo36b(), C0009g.abc_list_menu_item_layout);
        this.f675d = eVar;
        eVar.mo548d(this);
        this.f673b.mo651b(this.f675d);
        builder.mo37c(this.f675d.mo596a(), this);
        View headerView = menu.mo693y();
        if (headerView != null) {
            builder.mo38d(headerView);
        } else {
            builder.mo39e(menu.mo691w());
            builder.mo42h(menu.mo692x());
        }
        builder.mo40f(this);
        C0017b a = builder.mo35a();
        this.f674c = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f674c.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f674c.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f674c.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f674c.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f673b.mo660e(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f673b.performShortcut(keyCode, event, 0);
    }

    /* renamed from: a */
    public void mo696a() {
        C0017b bVar = this.f674c;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialog) {
        this.f675d.mo546b(this.f673b, true);
    }

    /* renamed from: b */
    public void mo178b(C0098g menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f673b) {
            mo696a();
        }
        C0113m.C0114a aVar = this.f676e;
        if (aVar != null) {
            aVar.mo178b(menu, allMenusAreClosing);
        }
    }

    /* renamed from: c */
    public boolean mo179c(C0098g subMenu) {
        C0113m.C0114a aVar = this.f676e;
        if (aVar != null) {
            return aVar.mo179c(subMenu);
        }
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        this.f673b.mo625L((C0102i) this.f675d.mo596a().getItem(which), 0);
    }
}
