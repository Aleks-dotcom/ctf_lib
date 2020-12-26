package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p002b.C0012j;
import p000a.p002b.p003k.C0042g;
import p000a.p002b.p011p.C0158i0;
import p000a.p025h.p038m.C0460r;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f2891A;

    /* renamed from: B */
    public int f2892B = 0;

    /* renamed from: C */
    public Drawable f2893C;

    /* renamed from: D */
    public ImageView f2894D;

    /* renamed from: E */
    public TextView f2895E;

    /* renamed from: F */
    public TextView f2896F;

    /* renamed from: G */
    public View f2897G;

    /* renamed from: H */
    public ListAdapter f2898H;

    /* renamed from: I */
    public int f2899I = -1;

    /* renamed from: J */
    public int f2900J;

    /* renamed from: K */
    public int f2901K;

    /* renamed from: L */
    public int f2902L;

    /* renamed from: M */
    public int f2903M;

    /* renamed from: N */
    public int f2904N;

    /* renamed from: O */
    public int f2905O;

    /* renamed from: P */
    public boolean f2906P;

    /* renamed from: Q */
    public int f2907Q = 0;

    /* renamed from: R */
    public Handler f2908R;

    /* renamed from: S */
    public final View.OnClickListener f2909S = new C0765a();

    /* renamed from: a */
    public final Context f2910a;

    /* renamed from: b */
    public final C0042g f2911b;

    /* renamed from: c */
    public final Window f2912c;

    /* renamed from: d */
    public final int f2913d;

    /* renamed from: e */
    public CharSequence f2914e;

    /* renamed from: f */
    public CharSequence f2915f;

    /* renamed from: g */
    public ListView f2916g;

    /* renamed from: h */
    public View f2917h;

    /* renamed from: i */
    public int f2918i;

    /* renamed from: j */
    public int f2919j;

    /* renamed from: k */
    public int f2920k;

    /* renamed from: l */
    public int f2921l;

    /* renamed from: m */
    public int f2922m;

    /* renamed from: n */
    public boolean f2923n = false;

    /* renamed from: o */
    public Button f2924o;

    /* renamed from: p */
    public CharSequence f2925p;

    /* renamed from: q */
    public Message f2926q;

    /* renamed from: r */
    public Drawable f2927r;

    /* renamed from: s */
    public Button f2928s;

    /* renamed from: t */
    public CharSequence f2929t;

    /* renamed from: u */
    public Message f2930u;

    /* renamed from: v */
    public Drawable f2931v;

    /* renamed from: w */
    public Button f2932w;

    /* renamed from: x */
    public CharSequence f2933x;

    /* renamed from: y */
    public Message f2934y;

    /* renamed from: z */
    public Drawable f2935z;

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0765a implements View.OnClickListener {
        public C0765a() {
        }

        public void onClick(View v) {
            Message m;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (v == alertController.f2924o && (message3 = alertController.f2926q) != null) {
                m = Message.obtain(message3);
            } else if (v == alertController.f2928s && (message2 = alertController.f2930u) != null) {
                m = Message.obtain(message2);
            } else if (v != alertController.f2932w || (message = alertController.f2934y) == null) {
                m = null;
            } else {
                m = Message.obtain(message);
            }
            if (m != null) {
                m.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f2908R.obtainMessage(1, alertController2.f2911b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    public static final class C0776g extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f3002a;

        public C0776g(DialogInterface dialog) {
            this.f3002a = new WeakReference<>(dialog);
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) this.f3002a.get(), msg.what);
            } else if (i == 1) {
                ((DialogInterface) msg.obj).dismiss();
            }
        }
    }

    /* renamed from: z */
    public static boolean m3725z(Context context) {
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0003a.alertDialogCenterButtons, outValue, true);
        if (outValue.data != 0) {
            return true;
        }
        return false;
    }

    public AlertController(Context context, C0042g di, Window window) {
        this.f2910a = context;
        this.f2911b = di;
        this.f2912c = window;
        this.f2908R = new C0776g(di);
        TypedArray a = context.obtainStyledAttributes((AttributeSet) null, C0012j.f20D, C0003a.alertDialogStyle, 0);
        this.f2900J = a.getResourceId(C0012j.f24E, 0);
        this.f2901K = a.getResourceId(C0012j.f32G, 0);
        this.f2902L = a.getResourceId(C0012j.f40I, 0);
        this.f2903M = a.getResourceId(C0012j.f44J, 0);
        this.f2904N = a.getResourceId(C0012j.f52L, 0);
        this.f2905O = a.getResourceId(C0012j.f36H, 0);
        this.f2906P = a.getBoolean(C0012j.f48K, true);
        this.f2913d = a.getDimensionPixelSize(C0012j.f28F, 0);
        a.recycle();
        di.mo213e(1);
    }

    /* renamed from: a */
    public static boolean m3723a(View v) {
        if (v.onCheckIsTextEditor()) {
            return true;
        }
        if (!(v instanceof ViewGroup)) {
            return false;
        }
        ViewGroup vg = (ViewGroup) v;
        int i = vg.getChildCount();
        while (i > 0) {
            i--;
            if (m3723a(vg.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo3835e() {
        this.f2911b.setContentView(mo3839j());
        mo3854y();
    }

    /* renamed from: j */
    public final int mo3839j() {
        int i = this.f2901K;
        if (i == 0) {
            return this.f2900J;
        }
        if (this.f2907Q == 1) {
            return i;
        }
        return this.f2900J;
    }

    /* renamed from: q */
    public void mo3846q(CharSequence title) {
        this.f2914e = title;
        TextView textView = this.f2895E;
        if (textView != null) {
            textView.setText(title);
        }
    }

    /* renamed from: l */
    public void mo3841l(View customTitleView) {
        this.f2897G = customTitleView;
    }

    /* renamed from: o */
    public void mo3844o(CharSequence message) {
        this.f2915f = message;
        TextView textView = this.f2896F;
        if (textView != null) {
            textView.setText(message);
        }
    }

    /* renamed from: r */
    public void mo3847r(int layoutResId) {
        this.f2917h = null;
        this.f2918i = layoutResId;
        this.f2923n = false;
    }

    /* renamed from: s */
    public void mo3848s(View view) {
        this.f2917h = view;
        this.f2918i = 0;
        this.f2923n = false;
    }

    /* renamed from: t */
    public void mo3849t(View view, int viewSpacingLeft, int viewSpacingTop, int viewSpacingRight, int viewSpacingBottom) {
        this.f2917h = view;
        this.f2918i = 0;
        this.f2923n = true;
        this.f2919j = viewSpacingLeft;
        this.f2920k = viewSpacingTop;
        this.f2921l = viewSpacingRight;
        this.f2922m = viewSpacingBottom;
    }

    /* renamed from: k */
    public void mo3840k(int whichButton, CharSequence text, DialogInterface.OnClickListener listener, Message msg, Drawable icon) {
        if (msg == null && listener != null) {
            msg = this.f2908R.obtainMessage(whichButton, listener);
        }
        if (whichButton == -3) {
            this.f2933x = text;
            this.f2934y = msg;
            this.f2935z = icon;
        } else if (whichButton == -2) {
            this.f2929t = text;
            this.f2930u = msg;
            this.f2931v = icon;
        } else if (whichButton == -1) {
            this.f2925p = text;
            this.f2926q = msg;
            this.f2927r = icon;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void mo3842m(int resId) {
        this.f2893C = null;
        this.f2892B = resId;
        ImageView imageView = this.f2894D;
        if (imageView == null) {
            return;
        }
        if (resId != 0) {
            imageView.setVisibility(0);
            this.f2894D.setImageResource(this.f2892B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: n */
    public void mo3843n(Drawable icon) {
        this.f2893C = icon;
        this.f2892B = 0;
        ImageView imageView = this.f2894D;
        if (imageView == null) {
            return;
        }
        if (icon != null) {
            imageView.setVisibility(0);
            this.f2894D.setImageDrawable(icon);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: c */
    public int mo3833c(int attrId) {
        TypedValue out = new TypedValue();
        this.f2910a.getTheme().resolveAttribute(attrId, out, true);
        return out.resourceId;
    }

    /* renamed from: d */
    public ListView mo3834d() {
        return this.f2916g;
    }

    /* renamed from: g */
    public boolean mo3836g(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.f2891A;
        return nestedScrollView != null && nestedScrollView.mo4543q(event);
    }

    /* renamed from: h */
    public boolean mo3837h(int keyCode, KeyEvent event) {
        NestedScrollView nestedScrollView = this.f2891A;
        return nestedScrollView != null && nestedScrollView.mo4543q(event);
    }

    /* renamed from: i */
    public final ViewGroup mo3838i(View customPanel, View defaultPanel) {
        if (customPanel == null) {
            if (defaultPanel instanceof ViewStub) {
                defaultPanel = ((ViewStub) defaultPanel).inflate();
            }
            return (ViewGroup) defaultPanel;
        }
        if (defaultPanel != null) {
            ViewParent parent = defaultPanel.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(defaultPanel);
            }
        }
        if (customPanel instanceof ViewStub) {
            customPanel = ((ViewStub) customPanel).inflate();
        }
        return (ViewGroup) customPanel;
    }

    /* renamed from: y */
    public final void mo3854y() {
        ListAdapter listAdapter;
        View parentPanel = this.f2912c.findViewById(C0008f.parentPanel);
        int i = C0008f.topPanel;
        View defaultTopPanel = parentPanel.findViewById(i);
        int i2 = C0008f.contentPanel;
        View defaultContentPanel = parentPanel.findViewById(i2);
        int i3 = C0008f.buttonPanel;
        View defaultButtonPanel = parentPanel.findViewById(i3);
        ViewGroup customPanel = (ViewGroup) parentPanel.findViewById(C0008f.customPanel);
        mo3852w(customPanel);
        View customTopPanel = customPanel.findViewById(i);
        View customContentPanel = customPanel.findViewById(i2);
        View customButtonPanel = customPanel.findViewById(i3);
        ViewGroup topPanel = mo3838i(customTopPanel, defaultTopPanel);
        ViewGroup contentPanel = mo3838i(customContentPanel, defaultContentPanel);
        ViewGroup buttonPanel = mo3838i(customButtonPanel, defaultButtonPanel);
        mo3851v(contentPanel);
        mo3850u(buttonPanel);
        mo3853x(topPanel);
        boolean hasCustomPanel = (customPanel == null || customPanel.getVisibility() == 8) ? false : true;
        boolean hasTopPanel = (topPanel == null || topPanel.getVisibility() == 8) ? false : true;
        boolean hasButtonPanel = (buttonPanel == null || buttonPanel.getVisibility() == 8) ? false : true;
        if (hasButtonPanel) {
        } else if (contentPanel != null) {
            View spacer = contentPanel.findViewById(C0008f.textSpacerNoButtons);
            if (spacer != null) {
                View view = parentPanel;
                spacer.setVisibility(0);
            }
        }
        if (hasTopPanel) {
            NestedScrollView nestedScrollView = this.f2891A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View divider = null;
            if (!(this.f2915f == null && this.f2916g == null)) {
                divider = topPanel.findViewById(C0008f.titleDividerNoCustom);
            }
            if (divider != null) {
                divider.setVisibility(0);
            }
        } else if (contentPanel != null) {
            View spacer2 = contentPanel.findViewById(C0008f.textSpacerNoTitle);
            if (spacer2 != null) {
                spacer2.setVisibility(0);
            }
        }
        ListView listView = this.f2916g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo3855a(hasTopPanel, hasButtonPanel);
        }
        if (!hasCustomPanel) {
            View content = this.f2916g;
            if (content == null) {
                content = this.f2891A;
            }
            if (content != null) {
                View view2 = customTopPanel;
                mo3845p(contentPanel, content, (hasTopPanel ? 1 : 0) | (hasButtonPanel ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f2916g;
        if (listView2 != null && (listAdapter = this.f2898H) != null) {
            listView2.setAdapter(listAdapter);
            int checkedItem = this.f2899I;
            if (checkedItem > -1) {
                listView2.setItemChecked(checkedItem, true);
                listView2.setSelection(checkedItem);
            }
        }
    }

    /* renamed from: p */
    public final void mo3845p(ViewGroup contentPanel, View content, int indicators, int mask) {
        View indicatorUp = this.f2912c.findViewById(C0008f.scrollIndicatorUp);
        View indicatorDown = this.f2912c.findViewById(C0008f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0460r.m2283p0(content, indicators, mask);
            if (indicatorUp != null) {
                contentPanel.removeView(indicatorUp);
            }
            if (indicatorDown != null) {
                contentPanel.removeView(indicatorDown);
                return;
            }
            return;
        }
        if (indicatorUp != null && (indicators & 1) == 0) {
            contentPanel.removeView(indicatorUp);
            indicatorUp = null;
        }
        if (indicatorDown != null && (indicators & 2) == 0) {
            contentPanel.removeView(indicatorDown);
            indicatorDown = null;
        }
        if (indicatorUp != null || indicatorDown != null) {
            View top = indicatorUp;
            View bottom = indicatorDown;
            if (this.f2915f != null) {
                this.f2891A.setOnScrollChangeListener(new C0766b(this, top, bottom));
                this.f2891A.post(new C0767c(top, bottom));
                return;
            }
            ListView listView = this.f2916g;
            if (listView != null) {
                listView.setOnScrollListener(new C0768d(this, top, bottom));
                this.f2916g.post(new C0769e(top, bottom));
                return;
            }
            if (top != null) {
                contentPanel.removeView(top);
            }
            if (bottom != null) {
                contentPanel.removeView(bottom);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public class C0766b implements NestedScrollView.C0834b {

        /* renamed from: a */
        public final /* synthetic */ View f2939a;

        /* renamed from: b */
        public final /* synthetic */ View f2940b;

        public C0766b(AlertController this$0, View view, View view2) {
            this.f2939a = view;
            this.f2940b = view2;
        }

        /* renamed from: a */
        public void mo3857a(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
            AlertController.m3724f(v, this.f2939a, this.f2940b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public class C0767c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2941b;

        /* renamed from: c */
        public final /* synthetic */ View f2942c;

        public C0767c(View view, View view2) {
            this.f2941b = view;
            this.f2942c = view2;
        }

        public void run() {
            AlertController.m3724f(AlertController.this.f2891A, this.f2941b, this.f2942c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public class C0768d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f2944a;

        /* renamed from: b */
        public final /* synthetic */ View f2945b;

        public C0768d(AlertController this$0, View view, View view2) {
            this.f2944a = view;
            this.f2945b = view2;
        }

        public void onScrollStateChanged(AbsListView view, int scrollState) {
        }

        public void onScroll(AbsListView v, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            AlertController.m3724f(v, this.f2944a, this.f2945b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    public class C0769e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f2946b;

        /* renamed from: c */
        public final /* synthetic */ View f2947c;

        public C0769e(View view, View view2) {
            this.f2946b = view;
            this.f2947c = view2;
        }

        public void run() {
            AlertController.m3724f(AlertController.this.f2916g, this.f2946b, this.f2947c);
        }
    }

    /* renamed from: w */
    public final void mo3852w(ViewGroup customPanel) {
        View customView;
        boolean hasCustomView = false;
        if (this.f2917h != null) {
            customView = this.f2917h;
        } else if (this.f2918i != 0) {
            customView = LayoutInflater.from(this.f2910a).inflate(this.f2918i, customPanel, false);
        } else {
            customView = null;
        }
        if (customView != null) {
            hasCustomView = true;
        }
        if (!hasCustomView || !m3723a(customView)) {
            this.f2912c.setFlags(131072, 131072);
        }
        if (hasCustomView) {
            FrameLayout custom = (FrameLayout) this.f2912c.findViewById(C0008f.custom);
            custom.addView(customView, new ViewGroup.LayoutParams(-1, -1));
            if (this.f2923n) {
                custom.setPadding(this.f2919j, this.f2920k, this.f2921l, this.f2922m);
            }
            if (this.f2916g != null) {
                ((C0158i0.C0159a) customPanel.getLayoutParams()).f890a = 0.0f;
                return;
            }
            return;
        }
        customPanel.setVisibility(8);
    }

    /* renamed from: x */
    public final void mo3853x(ViewGroup topPanel) {
        if (this.f2897G != null) {
            topPanel.addView(this.f2897G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2912c.findViewById(C0008f.title_template).setVisibility(8);
            return;
        }
        this.f2894D = (ImageView) this.f2912c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f2914e)) || !this.f2906P) {
            this.f2912c.findViewById(C0008f.title_template).setVisibility(8);
            this.f2894D.setVisibility(8);
            topPanel.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f2912c.findViewById(C0008f.alertTitle);
        this.f2895E = textView;
        textView.setText(this.f2914e);
        int i = this.f2892B;
        if (i != 0) {
            this.f2894D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f2893C;
        if (drawable != null) {
            this.f2894D.setImageDrawable(drawable);
            return;
        }
        this.f2895E.setPadding(this.f2894D.getPaddingLeft(), this.f2894D.getPaddingTop(), this.f2894D.getPaddingRight(), this.f2894D.getPaddingBottom());
        this.f2894D.setVisibility(8);
    }

    /* renamed from: v */
    public final void mo3851v(ViewGroup contentPanel) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2912c.findViewById(C0008f.scrollView);
        this.f2891A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f2891A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) contentPanel.findViewById(16908299);
        this.f2896F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f2915f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f2891A.removeView(this.f2896F);
            if (this.f2916g != null) {
                ViewGroup scrollParent = (ViewGroup) this.f2891A.getParent();
                int childIndex = scrollParent.indexOfChild(this.f2891A);
                scrollParent.removeViewAt(childIndex);
                scrollParent.addView(this.f2916g, childIndex, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            contentPanel.setVisibility(8);
        }
    }

    /* renamed from: f */
    public static void m3724f(View v, View upIndicator, View downIndicator) {
        int i = 0;
        if (upIndicator != null) {
            upIndicator.setVisibility(v.canScrollVertically(-1) ? 0 : 4);
        }
        if (downIndicator != null) {
            if (!v.canScrollVertically(1)) {
                i = 4;
            }
            downIndicator.setVisibility(i);
        }
    }

    /* renamed from: u */
    public final void mo3850u(ViewGroup buttonPanel) {
        int whichButtons = 0;
        Button button = (Button) buttonPanel.findViewById(16908313);
        this.f2924o = button;
        button.setOnClickListener(this.f2909S);
        boolean hasButtons = false;
        if (!TextUtils.isEmpty(this.f2925p) || this.f2927r != null) {
            this.f2924o.setText(this.f2925p);
            Drawable drawable = this.f2927r;
            if (drawable != null) {
                int i = this.f2913d;
                drawable.setBounds(0, 0, i, i);
                this.f2924o.setCompoundDrawables(this.f2927r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2924o.setVisibility(0);
            whichButtons = 0 | 1;
        } else {
            this.f2924o.setVisibility(8);
        }
        Button button2 = (Button) buttonPanel.findViewById(16908314);
        this.f2928s = button2;
        button2.setOnClickListener(this.f2909S);
        if (!TextUtils.isEmpty(this.f2929t) || this.f2931v != null) {
            this.f2928s.setText(this.f2929t);
            Drawable drawable2 = this.f2931v;
            if (drawable2 != null) {
                int i2 = this.f2913d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f2928s.setCompoundDrawables(this.f2931v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2928s.setVisibility(0);
            whichButtons |= 2;
        } else {
            this.f2928s.setVisibility(8);
        }
        Button button3 = (Button) buttonPanel.findViewById(16908315);
        this.f2932w = button3;
        button3.setOnClickListener(this.f2909S);
        if (!TextUtils.isEmpty(this.f2933x) || this.f2935z != null) {
            this.f2932w.setText(this.f2933x);
            Drawable drawable3 = this.f2927r;
            if (drawable3 != null) {
                int i3 = this.f2913d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f2924o.setCompoundDrawables(this.f2927r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f2932w.setVisibility(0);
            whichButtons |= 4;
        } else {
            this.f2932w.setVisibility(8);
        }
        if (m3725z(this.f2910a)) {
            if (whichButtons == 1) {
                mo3832b(this.f2924o);
            } else if (whichButtons == 2) {
                mo3832b(this.f2928s);
            } else if (whichButtons == 4) {
                mo3832b(this.f2932w);
            }
        }
        if (whichButtons != 0) {
            hasButtons = true;
        }
        if (!hasButtons) {
            buttonPanel.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo3832b(Button button) {
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) button.getLayoutParams();
        params.gravity = 1;
        params.weight = 0.5f;
        button.setLayoutParams(params);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        public final int f2936b;

        /* renamed from: c */
        public final int f2937c;

        public RecycleListView(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray ta = context.obtainStyledAttributes(attrs, C0012j.f86T1);
            this.f2937c = ta.getDimensionPixelOffset(C0012j.f90U1, -1);
            this.f2936b = ta.getDimensionPixelOffset(C0012j.f94V1, -1);
        }

        /* renamed from: a */
        public void mo3855a(boolean hasTitle, boolean hasButtons) {
            if (!hasButtons || !hasTitle) {
                setPadding(getPaddingLeft(), hasTitle ? getPaddingTop() : this.f2936b, getPaddingRight(), hasButtons ? getPaddingBottom() : this.f2937c);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0770f {

        /* renamed from: A */
        public int f2949A;

        /* renamed from: B */
        public int f2950B;

        /* renamed from: C */
        public int f2951C;

        /* renamed from: D */
        public int f2952D;

        /* renamed from: E */
        public boolean f2953E = false;

        /* renamed from: F */
        public boolean[] f2954F;

        /* renamed from: G */
        public boolean f2955G;

        /* renamed from: H */
        public boolean f2956H;

        /* renamed from: I */
        public int f2957I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f2958J;

        /* renamed from: K */
        public Cursor f2959K;

        /* renamed from: L */
        public String f2960L;

        /* renamed from: M */
        public String f2961M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f2962N;

        /* renamed from: O */
        public C0775e f2963O;

        /* renamed from: a */
        public final Context f2964a;

        /* renamed from: b */
        public final LayoutInflater f2965b;

        /* renamed from: c */
        public int f2966c = 0;

        /* renamed from: d */
        public Drawable f2967d;

        /* renamed from: e */
        public int f2968e = 0;

        /* renamed from: f */
        public CharSequence f2969f;

        /* renamed from: g */
        public View f2970g;

        /* renamed from: h */
        public CharSequence f2971h;

        /* renamed from: i */
        public CharSequence f2972i;

        /* renamed from: j */
        public Drawable f2973j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f2974k;

        /* renamed from: l */
        public CharSequence f2975l;

        /* renamed from: m */
        public Drawable f2976m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f2977n;

        /* renamed from: o */
        public CharSequence f2978o;

        /* renamed from: p */
        public Drawable f2979p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f2980q;

        /* renamed from: r */
        public boolean f2981r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f2982s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f2983t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f2984u;

        /* renamed from: v */
        public CharSequence[] f2985v;

        /* renamed from: w */
        public ListAdapter f2986w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f2987x;

        /* renamed from: y */
        public int f2988y;

        /* renamed from: z */
        public View f2989z;

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0775e {
            /* renamed from: a */
            void mo3869a(ListView listView);
        }

        public C0770f(Context context) {
            this.f2964a = context;
            this.f2981r = true;
            this.f2965b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo3862a(AlertController dialog) {
            View view = this.f2970g;
            if (view != null) {
                dialog.mo3841l(view);
            } else {
                CharSequence charSequence = this.f2969f;
                if (charSequence != null) {
                    dialog.mo3846q(charSequence);
                }
                Drawable drawable = this.f2967d;
                if (drawable != null) {
                    dialog.mo3843n(drawable);
                }
                int i = this.f2966c;
                if (i != 0) {
                    dialog.mo3842m(i);
                }
                int i2 = this.f2968e;
                if (i2 != 0) {
                    dialog.mo3842m(dialog.mo3833c(i2));
                }
            }
            CharSequence charSequence2 = this.f2971h;
            if (charSequence2 != null) {
                dialog.mo3844o(charSequence2);
            }
            CharSequence charSequence3 = this.f2972i;
            if (!(charSequence3 == null && this.f2973j == null)) {
                dialog.mo3840k(-1, charSequence3, this.f2974k, (Message) null, this.f2973j);
            }
            CharSequence charSequence4 = this.f2975l;
            if (!(charSequence4 == null && this.f2976m == null)) {
                dialog.mo3840k(-2, charSequence4, this.f2977n, (Message) null, this.f2976m);
            }
            CharSequence charSequence5 = this.f2978o;
            if (!(charSequence5 == null && this.f2979p == null)) {
                dialog.mo3840k(-3, charSequence5, this.f2980q, (Message) null, this.f2979p);
            }
            if (!(this.f2985v == null && this.f2959K == null && this.f2986w == null)) {
                mo3863b(dialog);
            }
            View view2 = this.f2989z;
            if (view2 == null) {
                int i3 = this.f2988y;
                if (i3 != 0) {
                    dialog.mo3847r(i3);
                }
            } else if (this.f2953E) {
                dialog.mo3849t(view2, this.f2949A, this.f2950B, this.f2951C, this.f2952D);
            } else {
                dialog.mo3848s(view2);
            }
        }

        /* renamed from: b */
        public final void mo3863b(AlertController dialog) {
            ListAdapter adapter;
            int layout;
            RecycleListView listView = (RecycleListView) this.f2965b.inflate(dialog.f2902L, (ViewGroup) null);
            if (!this.f2955G) {
                if (this.f2956H) {
                    layout = dialog.f2904N;
                } else {
                    layout = dialog.f2905O;
                }
                if (this.f2959K != null) {
                    adapter = new SimpleCursorAdapter(this.f2964a, layout, this.f2959K, new String[]{this.f2960L}, new int[]{16908308});
                } else if (this.f2986w != null) {
                    adapter = this.f2986w;
                } else {
                    adapter = new C0777h(this.f2964a, layout, 16908308, this.f2985v);
                }
            } else if (this.f2959K == null) {
                adapter = new C0771a(this.f2964a, dialog.f2903M, 16908308, this.f2985v, listView);
            } else {
                adapter = new C0772b(this.f2964a, this.f2959K, false, listView, dialog);
            }
            C0775e eVar = this.f2963O;
            if (eVar != null) {
                eVar.mo3869a(listView);
            }
            dialog.f2898H = adapter;
            dialog.f2899I = this.f2957I;
            if (this.f2987x != null) {
                listView.setOnItemClickListener(new C0773c(dialog));
            } else if (this.f2958J != null) {
                listView.setOnItemClickListener(new C0774d(listView, dialog));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2962N;
            if (onItemSelectedListener != null) {
                listView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f2956H) {
                listView.setChoiceMode(1);
            } else if (this.f2955G) {
                listView.setChoiceMode(2);
            }
            dialog.f2916g = listView;
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        public class C0771a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            public final /* synthetic */ RecycleListView f2990b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0771a(Context x0, int x1, int x2, CharSequence[] x3, RecycleListView recycleListView) {
                super(x0, x1, x2, x3);
                this.f2990b = recycleListView;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                boolean[] zArr = C0770f.this.f2954F;
                if (zArr != null && zArr[position]) {
                    this.f2990b.setItemChecked(position, true);
                }
                return view;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        public class C0772b extends CursorAdapter {

            /* renamed from: b */
            public final int f2992b;

            /* renamed from: c */
            public final int f2993c;

            /* renamed from: d */
            public final /* synthetic */ RecycleListView f2994d;

            /* renamed from: e */
            public final /* synthetic */ AlertController f2995e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0772b(Context x0, Cursor x1, boolean x2, RecycleListView recycleListView, AlertController alertController) {
                super(x0, x1, x2);
                this.f2994d = recycleListView;
                this.f2995e = alertController;
                Cursor cursor = getCursor();
                this.f2992b = cursor.getColumnIndexOrThrow(C0770f.this.f2960L);
                this.f2993c = cursor.getColumnIndexOrThrow(C0770f.this.f2961M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f2992b));
                RecycleListView recycleListView = this.f2994d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f2993c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return C0770f.this.f2965b.inflate(this.f2995e.f2903M, parent, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        public class C0773c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final /* synthetic */ AlertController f2997b;

            public C0773c(AlertController alertController) {
                this.f2997b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                C0770f.this.f2987x.onClick(this.f2997b.f2911b, position);
                if (!C0770f.this.f2956H) {
                    this.f2997b.f2911b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        public class C0774d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            public final /* synthetic */ RecycleListView f2999b;

            /* renamed from: c */
            public final /* synthetic */ AlertController f3000c;

            public C0774d(RecycleListView recycleListView, AlertController alertController) {
                this.f2999b = recycleListView;
                this.f3000c = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                boolean[] zArr = C0770f.this.f2954F;
                if (zArr != null) {
                    zArr[position] = this.f2999b.isItemChecked(position);
                }
                C0770f.this.f2958J.onClick(this.f3000c.f2911b, position, this.f2999b.isItemChecked(position));
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    public static class C0777h extends ArrayAdapter<CharSequence> {
        public C0777h(Context context, int resource, int textViewResourceId, CharSequence[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        public boolean hasStableIds() {
            return true;
        }

        public long getItemId(int position) {
            return (long) position;
        }
    }
}
