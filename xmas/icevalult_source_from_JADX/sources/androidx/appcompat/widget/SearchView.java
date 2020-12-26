package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p002b.C0003a;
import p000a.p002b.C0006d;
import p000a.p002b.C0008f;
import p000a.p002b.C0009g;
import p000a.p002b.C0010h;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.C0075c;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0141d;
import p000a.p002b.p011p.C0158i0;
import p000a.p002b.p011p.C0194q0;
import p000a.p002b.p011p.C0218w0;
import p000a.p002b.p011p.C0226y0;
import p000a.p025h.p038m.C0460r;
import p000a.p041i.p042a.C0495a;
import p000a.p043j.p044a.C0501a;

public class SearchView extends C0158i0 implements C0075c {

    /* renamed from: r0 */
    public static final C0804k f3125r0 = new C0804k();

    /* renamed from: A */
    public Rect f3126A;

    /* renamed from: B */
    public Rect f3127B;

    /* renamed from: C */
    public int[] f3128C;

    /* renamed from: D */
    public int[] f3129D;

    /* renamed from: E */
    public final ImageView f3130E;

    /* renamed from: F */
    public final Drawable f3131F;

    /* renamed from: G */
    public final int f3132G;

    /* renamed from: H */
    public final int f3133H;

    /* renamed from: I */
    public final Intent f3134I;

    /* renamed from: J */
    public final Intent f3135J;

    /* renamed from: K */
    public final CharSequence f3136K;

    /* renamed from: L */
    public C0806m f3137L;

    /* renamed from: M */
    public C0805l f3138M;

    /* renamed from: N */
    public View.OnFocusChangeListener f3139N;

    /* renamed from: O */
    public C0807n f3140O;

    /* renamed from: P */
    public View.OnClickListener f3141P;

    /* renamed from: Q */
    public boolean f3142Q;

    /* renamed from: R */
    public boolean f3143R;

    /* renamed from: S */
    public C0495a f3144S;

    /* renamed from: T */
    public boolean f3145T;

    /* renamed from: U */
    public CharSequence f3146U;

    /* renamed from: V */
    public boolean f3147V;

    /* renamed from: W */
    public boolean f3148W;

    /* renamed from: a0 */
    public int f3149a0;

    /* renamed from: b0 */
    public boolean f3150b0;

    /* renamed from: c0 */
    public CharSequence f3151c0;

    /* renamed from: d0 */
    public CharSequence f3152d0;

    /* renamed from: e0 */
    public boolean f3153e0;

    /* renamed from: f0 */
    public int f3154f0;

    /* renamed from: g0 */
    public SearchableInfo f3155g0;

    /* renamed from: h0 */
    public Bundle f3156h0;

    /* renamed from: i0 */
    public final Runnable f3157i0;

    /* renamed from: j0 */
    public Runnable f3158j0;

    /* renamed from: k0 */
    public final WeakHashMap<String, Drawable.ConstantState> f3159k0;

    /* renamed from: l0 */
    public final View.OnClickListener f3160l0;

    /* renamed from: m0 */
    public View.OnKeyListener f3161m0;

    /* renamed from: n0 */
    public final TextView.OnEditorActionListener f3162n0;

    /* renamed from: o0 */
    public final AdapterView.OnItemClickListener f3163o0;

    /* renamed from: p0 */
    public final AdapterView.OnItemSelectedListener f3164p0;

    /* renamed from: q */
    public final SearchAutoComplete f3165q;

    /* renamed from: q0 */
    public TextWatcher f3166q0;

    /* renamed from: r */
    public final View f3167r;

    /* renamed from: s */
    public final View f3168s;

    /* renamed from: t */
    public final View f3169t;

    /* renamed from: u */
    public final ImageView f3170u;

    /* renamed from: v */
    public final ImageView f3171v;

    /* renamed from: w */
    public final ImageView f3172w;

    /* renamed from: x */
    public final ImageView f3173x;

    /* renamed from: y */
    public final View f3174y;

    /* renamed from: z */
    public C0810p f3175z;

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0805l {
        /* renamed from: a */
        boolean mo4150a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0806m {
        /* renamed from: a */
        boolean mo4151a(String str);

        /* renamed from: b */
        boolean mo4152b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0807n {
        /* renamed from: a */
        boolean mo4153a(int i);

        /* renamed from: b */
        boolean mo4154b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public class C0795b implements Runnable {
        public C0795b() {
        }

        public void run() {
            SearchView.this.mo4085f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public class C0796c implements Runnable {
        public C0796c() {
        }

        public void run() {
            C0495a aVar = SearchView.this.f3144S;
            if (aVar instanceof C0194q0) {
                aVar.mo1379c((Cursor) null);
            }
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attrs) {
        this(context, attrs, C0003a.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3126A = new Rect();
        this.f3127B = new Rect();
        this.f3128C = new int[2];
        this.f3129D = new int[2];
        this.f3157i0 = new C0795b();
        this.f3158j0 = new C0796c();
        this.f3159k0 = new WeakHashMap<>();
        C0799f fVar = new C0799f();
        this.f3160l0 = fVar;
        this.f3161m0 = new C0800g();
        C0801h hVar = new C0801h();
        this.f3162n0 = hVar;
        C0802i iVar = new C0802i();
        this.f3163o0 = iVar;
        C0803j jVar = new C0803j();
        this.f3164p0 = jVar;
        this.f3166q0 = new C0794a();
        C0218w0 a = C0218w0.m1093u(context, attrs, C0012j.f98W1, defStyleAttr, 0);
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(a.mo1509n(C0012j.f145g2, C0009g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0008f.search_src_text);
        this.f3165q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3167r = findViewById(C0008f.search_edit_frame);
        View findViewById = findViewById(C0008f.search_plate);
        this.f3168s = findViewById;
        View findViewById2 = findViewById(C0008f.submit_area);
        this.f3169t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0008f.search_button);
        this.f3170u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0008f.search_go_btn);
        this.f3171v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0008f.search_close_btn);
        this.f3172w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0008f.search_voice_btn);
        this.f3173x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0008f.search_mag_icon);
        this.f3130E = imageView5;
        LayoutInflater layoutInflater = inflater;
        C0460r.m2263f0(findViewById, a.mo1502g(C0012j.f150h2));
        C0460r.m2263f0(findViewById2, a.mo1502g(C0012j.f170l2));
        int i = C0012j.f165k2;
        imageView.setImageDrawable(a.mo1502g(i));
        imageView2.setImageDrawable(a.mo1502g(C0012j.f135e2));
        imageView3.setImageDrawable(a.mo1502g(C0012j.f120b2));
        imageView4.setImageDrawable(a.mo1502g(C0012j.f180n2));
        imageView5.setImageDrawable(a.mo1502g(i));
        this.f3131F = a.mo1502g(C0012j.f160j2);
        C0226y0.m1184a(imageView, getResources().getString(C0010h.abc_searchview_description_search));
        this.f3132G = a.mo1509n(C0012j.f175m2, C0009g.abc_search_dropdown_item_icons_2line);
        this.f3133H = a.mo1509n(C0012j.f125c2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f3166q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f3161m0);
        searchAutoComplete.setOnFocusChangeListener(new C0797d());
        setIconifiedByDefault(a.mo1496a(C0012j.f140f2, true));
        int maxWidth = a.mo1501f(C0012j.f106Y1, -1);
        if (maxWidth != -1) {
            setMaxWidth(maxWidth);
        }
        this.f3136K = a.mo1511p(C0012j.f130d2);
        this.f3146U = a.mo1511p(C0012j.f155i2);
        int imeOptions = a.mo1506k(C0012j.f115a2, -1);
        if (imeOptions != -1) {
            setImeOptions(imeOptions);
        }
        int inputType = a.mo1506k(C0012j.f110Z1, -1);
        if (inputType != -1) {
            setInputType(inputType);
        }
        setFocusable(a.mo1496a(C0012j.f102X1, true));
        a.mo1514v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f3134I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3135J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f3174y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0798e());
        }
        mo4098k0(this.f3142Q);
        mo4086g0();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public class C0797d implements View.OnFocusChangeListener {
        public C0797d() {
        }

        public void onFocusChange(View v, boolean hasFocus) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f3139N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, hasFocus);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    public class C0798e implements View.OnLayoutChangeListener {
        public C0798e() {
        }

        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            SearchView.this.mo4055B();
        }
    }

    public int getSuggestionRowLayout() {
        return this.f3132G;
    }

    public int getSuggestionCommitIconResId() {
        return this.f3133H;
    }

    public void setSearchableInfo(SearchableInfo searchable) {
        this.f3155g0 = searchable;
        if (searchable != null) {
            mo4095h0();
            mo4086g0();
        }
        boolean K = mo4064K();
        this.f3150b0 = K;
        if (K) {
            this.f3165q.setPrivateImeOptions("nm");
        }
        mo4098k0(mo4065L());
    }

    public void setAppSearchData(Bundle appSearchData) {
        this.f3156h0 = appSearchData;
    }

    public void setImeOptions(int imeOptions) {
        this.f3165q.setImeOptions(imeOptions);
    }

    public int getImeOptions() {
        return this.f3165q.getImeOptions();
    }

    public void setInputType(int inputType) {
        this.f3165q.setInputType(inputType);
    }

    public int getInputType() {
        return this.f3165q.getInputType();
    }

    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (this.f3148W || !isFocusable()) {
            return false;
        }
        if (mo4065L()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        boolean result = this.f3165q.requestFocus(direction, previouslyFocusedRect);
        if (result) {
            mo4098k0(false);
        }
        return result;
    }

    public void clearFocus() {
        this.f3148W = true;
        super.clearFocus();
        this.f3165q.clearFocus();
        this.f3165q.setImeVisibility(false);
        this.f3148W = false;
    }

    public void setOnQueryTextListener(C0806m listener) {
        this.f3137L = listener;
    }

    public void setOnCloseListener(C0805l listener) {
        this.f3138M = listener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
        this.f3139N = listener;
    }

    public void setOnSuggestionListener(C0807n listener) {
        this.f3140O = listener;
    }

    public void setOnSearchClickListener(View.OnClickListener listener) {
        this.f3141P = listener;
    }

    public CharSequence getQuery() {
        return this.f3165q.getText();
    }

    /* renamed from: d0 */
    public void mo4083d0(CharSequence query, boolean submit) {
        this.f3165q.setText(query);
        if (query != null) {
            SearchAutoComplete searchAutoComplete = this.f3165q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3152d0 = query;
        }
        if (submit && !TextUtils.isEmpty(query)) {
            mo4075W();
        }
    }

    public void setQueryHint(CharSequence hint) {
        this.f3146U = hint;
        mo4086g0();
    }

    public CharSequence getQueryHint() {
        if (this.f3146U != null) {
            return this.f3146U;
        }
        SearchableInfo searchableInfo = this.f3155g0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f3136K;
        }
        return getContext().getText(this.f3155g0.getHintId());
    }

    public void setIconifiedByDefault(boolean iconified) {
        if (this.f3142Q != iconified) {
            this.f3142Q = iconified;
            mo4098k0(iconified);
            mo4086g0();
        }
    }

    public void setIconified(boolean iconify) {
        if (iconify) {
            mo4070R();
        } else {
            mo4074V();
        }
    }

    /* renamed from: L */
    public boolean mo4065L() {
        return this.f3143R;
    }

    public void setSubmitButtonEnabled(boolean enabled) {
        this.f3145T = enabled;
        mo4098k0(mo4065L());
    }

    public void setQueryRefinementEnabled(boolean enable) {
        this.f3147V = enable;
        C0495a aVar = this.f3144S;
        if (aVar instanceof C0194q0) {
            ((C0194q0) aVar).mo1400x(enable ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(C0495a adapter) {
        this.f3144S = adapter;
        this.f3165q.setAdapter(adapter);
    }

    public C0495a getSuggestionsAdapter() {
        return this.f3144S;
    }

    public void setMaxWidth(int maxpixels) {
        this.f3149a0 = maxpixels;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f3149a0;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        if (mo4065L()) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int width = View.MeasureSpec.getSize(widthMeasureSpec);
        if (widthMode == Integer.MIN_VALUE) {
            int i2 = this.f3149a0;
            width = i2 > 0 ? Math.min(i2, width) : Math.min(getPreferredWidth(), width);
        } else if (widthMode == 0) {
            int i3 = this.f3149a0;
            if (i3 <= 0) {
                i3 = getPreferredWidth();
            }
            width = i3;
        } else if (widthMode == 1073741824 && (i = this.f3149a0) > 0) {
            width = Math.min(i, width);
        }
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int height = View.MeasureSpec.getSize(heightMeasureSpec);
        if (heightMode == Integer.MIN_VALUE) {
            height = Math.min(getPreferredHeight(), height);
        } else if (heightMode == 0) {
            height = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            mo4062I(this.f3165q, this.f3126A);
            Rect rect = this.f3127B;
            Rect rect2 = this.f3126A;
            rect.set(rect2.left, 0, rect2.right, bottom - top);
            C0810p pVar = this.f3175z;
            if (pVar == null) {
                C0810p pVar2 = new C0810p(this.f3127B, this.f3126A, this.f3165q);
                this.f3175z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo4162a(this.f3127B, this.f3126A);
        }
    }

    /* renamed from: I */
    public final void mo4062I(View view, Rect rect) {
        view.getLocationInWindow(this.f3128C);
        getLocationInWindow(this.f3129D);
        int[] iArr = this.f3128C;
        int i = iArr[1];
        int[] iArr2 = this.f3129D;
        int top = i - iArr2[1];
        int left = iArr[0] - iArr2[0];
        rect.set(left, top, view.getWidth() + left, view.getHeight() + top);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0006d.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0006d.abc_search_view_preferred_height);
    }

    /* renamed from: k0 */
    public final void mo4098k0(boolean collapsed) {
        int iconVisibility;
        this.f3143R = collapsed;
        int i = 8;
        boolean z = false;
        int visCollapsed = collapsed ? 0 : 8;
        boolean hasText = !TextUtils.isEmpty(this.f3165q.getText());
        this.f3170u.setVisibility(visCollapsed);
        mo4097j0(hasText);
        View view = this.f3167r;
        if (!collapsed) {
            i = 0;
        }
        view.setVisibility(i);
        if (this.f3130E.getDrawable() == null || this.f3142Q) {
            iconVisibility = 8;
        } else {
            iconVisibility = 0;
        }
        this.f3130E.setVisibility(iconVisibility);
        mo4084e0();
        if (!hasText) {
            z = true;
        }
        mo4099l0(z);
        mo4096i0();
    }

    /* renamed from: K */
    public final boolean mo4064K() {
        SearchableInfo searchableInfo = this.f3155g0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent testIntent = null;
            if (this.f3155g0.getVoiceSearchLaunchWebSearch()) {
                testIntent = this.f3134I;
            } else if (this.f3155g0.getVoiceSearchLaunchRecognizer()) {
                testIntent = this.f3135J;
            }
            if (testIntent == null || getContext().getPackageManager().resolveActivity(testIntent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean mo4066N() {
        return (this.f3145T || this.f3150b0) && !mo4065L();
    }

    /* renamed from: j0 */
    public final void mo4097j0(boolean hasText) {
        int visibility = 8;
        if (this.f3145T && mo4066N() && hasFocus() && (hasText || !this.f3150b0)) {
            visibility = 0;
        }
        this.f3171v.setVisibility(visibility);
    }

    /* renamed from: i0 */
    public final void mo4096i0() {
        int visibility = 8;
        if (mo4066N() && (this.f3171v.getVisibility() == 0 || this.f3173x.getVisibility() == 0)) {
            visibility = 0;
        }
        this.f3169t.setVisibility(visibility);
    }

    /* renamed from: e0 */
    public final void mo4084e0() {
        boolean showClose = true;
        boolean hasText = !TextUtils.isEmpty(this.f3165q.getText());
        int i = 0;
        if (!hasText && (!this.f3142Q || this.f3153e0)) {
            showClose = false;
        }
        ImageView imageView = this.f3172w;
        if (!showClose) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable closeButtonImg = this.f3172w.getDrawable();
        if (closeButtonImg != null) {
            closeButtonImg.setState(hasText ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: b0 */
    public final void mo4080b0() {
        post(this.f3157i0);
    }

    /* renamed from: f0 */
    public void mo4085f0() {
        int[] stateSet = this.f3165q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable searchPlateBg = this.f3168s.getBackground();
        if (searchPlateBg != null) {
            searchPlateBg.setState(stateSet);
        }
        Drawable submitAreaBg = this.f3169t.getBackground();
        if (submitAreaBg != null) {
            submitAreaBg.setState(stateSet);
        }
        invalidate();
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f3157i0);
        post(this.f3158j0);
        super.onDetachedFromWindow();
    }

    /* renamed from: U */
    public void mo4073U(CharSequence queryText) {
        setQuery(queryText);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    public class C0799f implements View.OnClickListener {
        public C0799f() {
        }

        public void onClick(View v) {
            SearchView searchView = SearchView.this;
            if (v == searchView.f3170u) {
                searchView.mo4074V();
            } else if (v == searchView.f3172w) {
                searchView.mo4070R();
            } else if (v == searchView.f3171v) {
                searchView.mo4075W();
            } else if (v == searchView.f3173x) {
                searchView.mo4079a0();
            } else if (v == searchView.f3165q) {
                searchView.mo4061H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    public class C0800g implements View.OnKeyListener {
        public C0800g() {
        }

        public boolean onKey(View v, int keyCode, KeyEvent event) {
            SearchView searchView = SearchView.this;
            if (searchView.f3155g0 == null) {
                return false;
            }
            if (searchView.f3165q.isPopupShowing() && SearchView.this.f3165q.getListSelection() != -1) {
                return SearchView.this.mo4076X(v, keyCode, event);
            }
            if (SearchView.this.f3165q.mo4121a() || !event.hasNoModifiers() || event.getAction() != 1 || keyCode != 66) {
                return false;
            }
            v.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo4068P(0, (String) null, searchView2.f3165q.getText().toString());
            return true;
        }
    }

    /* renamed from: X */
    public boolean mo4076X(View v, int keyCode, KeyEvent event) {
        int selPoint;
        if (this.f3155g0 != null && this.f3144S != null && event.getAction() == 0 && event.hasNoModifiers()) {
            if (keyCode == 66 || keyCode == 84 || keyCode == 61) {
                return mo4071S(this.f3165q.getListSelection(), 0, (String) null);
            }
            if (keyCode == 21 || keyCode == 22) {
                if (keyCode == 21) {
                    selPoint = 0;
                } else {
                    selPoint = this.f3165q.length();
                }
                this.f3165q.setSelection(selPoint);
                this.f3165q.setListSelection(0);
                this.f3165q.clearListSelection();
                f3125r0.mo4149c(this.f3165q, true);
                return true;
            } else if (keyCode != 19 || this.f3165q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final CharSequence mo4063J(CharSequence hintText) {
        if (!this.f3142Q || this.f3131F == null) {
            return hintText;
        }
        int textSize = (int) (((double) this.f3165q.getTextSize()) * 1.25d);
        this.f3131F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder ssb = new SpannableStringBuilder("   ");
        ssb.setSpan(new ImageSpan(this.f3131F), 1, 2, 33);
        ssb.append(hintText);
        return ssb;
    }

    /* renamed from: g0 */
    public final void mo4086g0() {
        CharSequence hint = getQueryHint();
        this.f3165q.setHint(mo4063J(hint == null ? "" : hint));
    }

    /* renamed from: h0 */
    public final void mo4095h0() {
        this.f3165q.setThreshold(this.f3155g0.getSuggestThreshold());
        this.f3165q.setImeOptions(this.f3155g0.getImeOptions());
        int inputType = this.f3155g0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3155g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f3165q.setInputType(inputType);
        C0495a aVar = this.f3144S;
        if (aVar != null) {
            aVar.mo1379c((Cursor) null);
        }
        if (this.f3155g0.getSuggestAuthority() != null) {
            C0194q0 q0Var = new C0194q0(getContext(), this, this.f3155g0, this.f3159k0);
            this.f3144S = q0Var;
            this.f3165q.setAdapter(q0Var);
            C0194q0 q0Var2 = (C0194q0) this.f3144S;
            if (this.f3147V) {
                i = 2;
            }
            q0Var2.mo1400x(i);
        }
    }

    /* renamed from: l0 */
    public final void mo4099l0(boolean empty) {
        int visibility = 8;
        if (this.f3150b0 && !mo4065L() && empty) {
            visibility = 0;
            this.f3171v.setVisibility(8);
        }
        this.f3173x.setVisibility(visibility);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    public class C0801h implements TextView.OnEditorActionListener {
        public C0801h() {
        }

        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            SearchView.this.mo4075W();
            return true;
        }
    }

    /* renamed from: Y */
    public void mo4077Y(CharSequence newText) {
        CharSequence text = this.f3165q.getText();
        this.f3152d0 = text;
        boolean z = true;
        boolean hasText = !TextUtils.isEmpty(text);
        mo4097j0(hasText);
        if (hasText) {
            z = false;
        }
        mo4099l0(z);
        mo4084e0();
        mo4096i0();
        if (this.f3137L != null && !TextUtils.equals(newText, this.f3151c0)) {
            this.f3137L.mo4152b(newText.toString());
        }
        this.f3151c0 = newText.toString();
    }

    /* renamed from: W */
    public void mo4075W() {
        CharSequence query = this.f3165q.getText();
        if (query != null && TextUtils.getTrimmedLength(query) > 0) {
            C0806m mVar = this.f3137L;
            if (mVar == null || !mVar.mo4151a(query.toString())) {
                if (this.f3155g0 != null) {
                    mo4068P(0, (String) null, query.toString());
                }
                this.f3165q.setImeVisibility(false);
                mo4060G();
            }
        }
    }

    /* renamed from: G */
    public final void mo4060G() {
        this.f3165q.dismissDropDown();
    }

    /* renamed from: R */
    public void mo4070R() {
        if (!TextUtils.isEmpty(this.f3165q.getText())) {
            this.f3165q.setText("");
            this.f3165q.requestFocus();
            this.f3165q.setImeVisibility(true);
        } else if (this.f3142Q) {
            C0805l lVar = this.f3138M;
            if (lVar == null || !lVar.mo4150a()) {
                clearFocus();
                mo4098k0(true);
            }
        }
    }

    /* renamed from: V */
    public void mo4074V() {
        mo4098k0(false);
        this.f3165q.requestFocus();
        this.f3165q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f3141P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: a0 */
    public void mo4079a0() {
        if (this.f3155g0 != null) {
            SearchableInfo searchable = this.f3155g0;
            try {
                if (searchable.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(mo4059F(this.f3134I, searchable));
                } else if (searchable.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(mo4058E(this.f3135J, searchable));
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: Z */
    public void mo4078Z() {
        mo4098k0(mo4065L());
        mo4080b0();
        if (this.f3165q.hasFocus()) {
            mo4061H();
        }
    }

    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        mo4080b0();
    }

    /* renamed from: f */
    public void mo416f() {
        mo4083d0("", false);
        clearFocus();
        mo4098k0(true);
        this.f3165q.setImeOptions(this.f3154f0);
        this.f3153e0 = false;
    }

    /* renamed from: a */
    public void mo415a() {
        if (!this.f3153e0) {
            this.f3153e0 = true;
            int imeOptions = this.f3165q.getImeOptions();
            this.f3154f0 = imeOptions;
            this.f3165q.setImeOptions(imeOptions | 33554432);
            this.f3165q.setText("");
            setIconified(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0808o extends C0501a {
        public static final Parcelable.Creator<C0808o> CREATOR = new C0809a();

        /* renamed from: d */
        public boolean f3194d;

        public C0808o(Parcelable superState) {
            super(superState);
        }

        public C0808o(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f3194d = ((Boolean) source.readValue((ClassLoader) null)).booleanValue();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeValue(Boolean.valueOf(this.f3194d));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3194d + "}";
        }

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        public static class C0809a implements Parcelable.ClassLoaderCreator<C0808o> {
            /* renamed from: b */
            public C0808o createFromParcel(Parcel in, ClassLoader loader) {
                return new C0808o(in, loader);
            }

            /* renamed from: a */
            public C0808o createFromParcel(Parcel in) {
                return new C0808o(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C0808o[] newArray(int size) {
                return new C0808o[size];
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0808o ss = new C0808o(super.onSaveInstanceState());
        ss.f3194d = mo4065L();
        return ss;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C0808o)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0808o ss = (C0808o) state;
        super.onRestoreInstanceState(ss.mo2682f());
        mo4098k0(ss.f3194d);
        requestLayout();
    }

    /* renamed from: B */
    public void mo4055B() {
        int offset;
        if (this.f3174y.getWidth() > 1) {
            Resources res = getContext().getResources();
            int anchorPadding = this.f3168s.getPaddingLeft();
            Rect dropDownPadding = new Rect();
            boolean isLayoutRtl = C0140c1.m788b(this);
            int iconOffset = this.f3142Q ? res.getDimensionPixelSize(C0006d.abc_dropdownitem_icon_width) + res.getDimensionPixelSize(C0006d.abc_dropdownitem_text_padding_left) : 0;
            this.f3165q.getDropDownBackground().getPadding(dropDownPadding);
            if (isLayoutRtl) {
                offset = -dropDownPadding.left;
            } else {
                offset = anchorPadding - (dropDownPadding.left + iconOffset);
            }
            this.f3165q.setDropDownHorizontalOffset(offset);
            this.f3165q.setDropDownWidth((((this.f3174y.getWidth() + dropDownPadding.left) + dropDownPadding.right) + iconOffset) - anchorPadding);
        }
    }

    /* renamed from: S */
    public boolean mo4071S(int position, int actionKey, String actionMsg) {
        C0807n nVar = this.f3140O;
        if (nVar != null && nVar.mo4154b(position)) {
            return false;
        }
        mo4069Q(position, 0, (String) null);
        this.f3165q.setImeVisibility(false);
        mo4060G();
        return true;
    }

    /* renamed from: T */
    public boolean mo4072T(int position) {
        C0807n nVar = this.f3140O;
        if (nVar != null && nVar.mo4153a(position)) {
            return false;
        }
        mo4081c0(position);
        return true;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    public class C0802i implements AdapterView.OnItemClickListener {
        public C0802i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.mo4071S(position, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    public class C0803j implements AdapterView.OnItemSelectedListener {
        public C0803j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
            SearchView.this.mo4072T(position);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: c0 */
    public final void mo4081c0(int position) {
        CharSequence oldQuery = this.f3165q.getText();
        Cursor c = this.f3144S.mo2665b();
        if (c != null) {
            if (c.moveToPosition(position)) {
                CharSequence newQuery = this.f3144S.mo1378a(c);
                if (newQuery != null) {
                    setQuery(newQuery);
                } else {
                    setQuery(oldQuery);
                }
            } else {
                setQuery(oldQuery);
            }
        }
    }

    /* renamed from: Q */
    public final boolean mo4069Q(int position, int actionKey, String actionMsg) {
        Cursor c = this.f3144S.mo2665b();
        if (c == null || !c.moveToPosition(position)) {
            return false;
        }
        mo4067O(mo4057D(c, actionKey, actionMsg));
        return true;
    }

    /* renamed from: O */
    public final void mo4067O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException ex) {
                Log.e("SearchView", "Failed launch activity: " + intent, ex);
            }
        }
    }

    private void setQuery(CharSequence query) {
        this.f3165q.setText(query);
        this.f3165q.setSelection(TextUtils.isEmpty(query) ? 0 : query.length());
    }

    /* renamed from: P */
    public void mo4068P(int actionKey, String actionMsg, String query) {
        getContext().startActivity(mo4056C("android.intent.action.SEARCH", (Uri) null, (String) null, query, actionKey, actionMsg));
    }

    /* renamed from: C */
    public final Intent mo4056C(String action, Uri data, String extraData, String query, int actionKey, String actionMsg) {
        Intent intent = new Intent(action);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.f3152d0);
        if (query != null) {
            intent.putExtra("query", query);
        }
        if (extraData != null) {
            intent.putExtra("intent_extra_data_key", extraData);
        }
        Bundle bundle = this.f3156h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (actionKey != 0) {
            intent.putExtra("action_key", actionKey);
            intent.putExtra("action_msg", actionMsg);
        }
        intent.setComponent(this.f3155g0.getSearchActivity());
        return intent;
    }

    /* renamed from: F */
    public final Intent mo4059F(Intent baseIntent, SearchableInfo searchable) {
        String str;
        Intent voiceIntent = new Intent(baseIntent);
        ComponentName searchActivity = searchable.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        return voiceIntent;
    }

    /* renamed from: E */
    public final Intent mo4058E(Intent baseIntent, SearchableInfo searchable) {
        String str;
        ComponentName searchActivity = searchable.getSearchActivity();
        Intent queryIntent = new Intent("android.intent.action.SEARCH");
        queryIntent.setComponent(searchActivity);
        PendingIntent pending = PendingIntent.getActivity(getContext(), 0, queryIntent, 1073741824);
        Bundle queryExtras = new Bundle();
        Bundle bundle = this.f3156h0;
        if (bundle != null) {
            queryExtras.putParcelable("app_data", bundle);
        }
        Intent voiceIntent = new Intent(baseIntent);
        String languageModel = "free_form";
        String prompt = null;
        String language = null;
        int maxResults = 1;
        Resources resources = getResources();
        if (searchable.getVoiceLanguageModeId() != 0) {
            languageModel = resources.getString(searchable.getVoiceLanguageModeId());
        }
        if (searchable.getVoicePromptTextId() != 0) {
            prompt = resources.getString(searchable.getVoicePromptTextId());
        }
        if (searchable.getVoiceLanguageId() != 0) {
            language = resources.getString(searchable.getVoiceLanguageId());
        }
        if (searchable.getVoiceMaxResults() != 0) {
            maxResults = searchable.getVoiceMaxResults();
        }
        voiceIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", languageModel);
        voiceIntent.putExtra("android.speech.extra.PROMPT", prompt);
        voiceIntent.putExtra("android.speech.extra.LANGUAGE", language);
        voiceIntent.putExtra("android.speech.extra.MAX_RESULTS", maxResults);
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        voiceIntent.putExtra("calling_package", str);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pending);
        voiceIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", queryExtras);
        return voiceIntent;
    }

    /* renamed from: D */
    public final Intent mo4057D(Cursor c, int actionKey, String actionMsg) {
        int rowNum;
        String data;
        String id;
        try {
            String action = C0194q0.m1010o(c, "suggest_intent_action");
            if (action == null) {
                action = this.f3155g0.getSuggestIntentAction();
            }
            if (action == null) {
                action = "android.intent.action.SEARCH";
            }
            String data2 = C0194q0.m1010o(c, "suggest_intent_data");
            if (data2 == null) {
                data2 = this.f3155g0.getSuggestIntentData();
            }
            if (data2 == null || (id = C0194q0.m1010o(c, "suggest_intent_data_id")) == null) {
                data = data2;
            } else {
                data = data2 + "/" + Uri.encode(id);
            }
            return mo4056C(action, data == null ? null : Uri.parse(data), C0194q0.m1010o(c, "suggest_intent_extra_data"), C0194q0.m1010o(c, "suggest_intent_query"), actionKey, actionMsg);
        } catch (RuntimeException e) {
            try {
                rowNum = c.getPosition();
            } catch (RuntimeException e2) {
                rowNum = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + rowNum + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: H */
    public void mo4061H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3165q.refreshAutoCompleteResults();
            return;
        }
        C0804k kVar = f3125r0;
        kVar.mo4148b(this.f3165q);
        kVar.mo4147a(this.f3165q);
    }

    /* renamed from: M */
    public static boolean m3852M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public class C0794a implements TextWatcher {
        public C0794a() {
        }

        public void beforeTextChanged(CharSequence s, int start, int before, int after) {
        }

        public void onTextChanged(CharSequence s, int start, int before, int after) {
            SearchView.this.mo4077Y(s);
        }

        public void afterTextChanged(Editable s) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    public static class C0810p extends TouchDelegate {

        /* renamed from: a */
        public final View f3195a;

        /* renamed from: b */
        public final Rect f3196b = new Rect();

        /* renamed from: c */
        public final Rect f3197c = new Rect();

        /* renamed from: d */
        public final Rect f3198d = new Rect();

        /* renamed from: e */
        public final int f3199e;

        /* renamed from: f */
        public boolean f3200f;

        public C0810p(Rect targetBounds, Rect actualBounds, View delegateView) {
            super(targetBounds, delegateView);
            this.f3199e = ViewConfiguration.get(delegateView.getContext()).getScaledTouchSlop();
            mo4162a(targetBounds, actualBounds);
            this.f3195a = delegateView;
        }

        /* renamed from: a */
        public void mo4162a(Rect desiredBounds, Rect actualBounds) {
            this.f3196b.set(desiredBounds);
            this.f3198d.set(desiredBounds);
            Rect rect = this.f3198d;
            int i = this.f3199e;
            rect.inset(-i, -i);
            this.f3197c.set(actualBounds);
        }

        public boolean onTouchEvent(MotionEvent event) {
            int x = (int) event.getX();
            int y = (int) event.getY();
            boolean sendToDelegate = false;
            boolean hit = true;
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    sendToDelegate = this.f3200f;
                    if (sendToDelegate && !this.f3198d.contains(x, y)) {
                        hit = false;
                    }
                } else if (action == 3) {
                    sendToDelegate = this.f3200f;
                    this.f3200f = false;
                }
            } else if (this.f3196b.contains(x, y)) {
                this.f3200f = true;
                sendToDelegate = true;
            }
            if (!sendToDelegate) {
                return false;
            }
            if (!hit || this.f3197c.contains(x, y)) {
                Rect rect = this.f3197c;
                event.setLocation((float) (x - rect.left), (float) (y - rect.top));
            } else {
                event.setLocation((float) (this.f3195a.getWidth() / 2), (float) (this.f3195a.getHeight() / 2));
            }
            return this.f3195a.dispatchTouchEvent(event);
        }
    }

    public static class SearchAutoComplete extends C0141d {

        /* renamed from: e */
        public int f3176e;

        /* renamed from: f */
        public SearchView f3177f;

        /* renamed from: g */
        public boolean f3178g;

        /* renamed from: h */
        public final Runnable f3179h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class C0793a implements Runnable {
            public C0793a() {
            }

            public void run() {
                SearchAutoComplete.this.mo4122b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attrs) {
            this(context, attrs, C0003a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            this.f3179h = new C0793a();
            this.f3176e = getThreshold();
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void setSearchView(SearchView searchView) {
            this.f3177f = searchView;
        }

        public void setThreshold(int threshold) {
            super.setThreshold(threshold);
            this.f3176e = threshold;
        }

        /* renamed from: a */
        public boolean mo4121a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void replaceText(CharSequence text) {
        }

        public void performCompletion() {
        }

        public void onWindowFocusChanged(boolean hasWindowFocus) {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus && this.f3177f.hasFocus() && getVisibility() == 0) {
                this.f3178g = true;
                if (SearchView.m3852M(getContext())) {
                    SearchView.f3125r0.mo4149c(this, true);
                }
            }
        }

        public void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
            this.f3177f.mo4078Z();
        }

        public boolean enoughToFilter() {
            return this.f3176e <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int keyCode, KeyEvent event) {
            if (keyCode == 4) {
                if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState state = getKeyDispatcherState();
                    if (state != null) {
                        state.startTracking(event, this);
                    }
                    return true;
                } else if (event.getAction() == 1) {
                    KeyEvent.DispatcherState state2 = getKeyDispatcherState();
                    if (state2 != null) {
                        state2.handleUpEvent(event);
                    }
                    if (event.isTracking() && !event.isCanceled()) {
                        this.f3177f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(keyCode, event);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration config = getResources().getConfiguration();
            int widthDp = config.screenWidthDp;
            int heightDp = config.screenHeightDp;
            if (widthDp >= 960 && heightDp >= 720 && config.orientation == 2) {
                return 256;
            }
            if (widthDp >= 600) {
                return 192;
            }
            if (widthDp < 640 || heightDp < 480) {
                return 160;
            }
            return 192;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection ic = super.onCreateInputConnection(editorInfo);
            if (this.f3178g) {
                removeCallbacks(this.f3179h);
                post(this.f3179h);
            }
            return ic;
        }

        /* renamed from: b */
        public void mo4122b() {
            if (this.f3178g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3178g = false;
            }
        }

        public void setImeVisibility(boolean visible) {
            InputMethodManager imm = (InputMethodManager) getContext().getSystemService("input_method");
            if (!visible) {
                this.f3178g = false;
                removeCallbacks(this.f3179h);
                imm.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (imm.isActive(this)) {
                this.f3178g = false;
                removeCallbacks(this.f3179h);
                imm.showSoftInput(this, 0);
            } else {
                this.f3178g = true;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public static class C0804k {

        /* renamed from: a */
        public Method f3191a;

        /* renamed from: b */
        public Method f3192b;

        /* renamed from: c */
        public Method f3193c;

        public C0804k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3191a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3192b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f3193c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        }

        /* renamed from: b */
        public void mo4148b(AutoCompleteTextView view) {
            Method method = this.f3191a;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: a */
        public void mo4147a(AutoCompleteTextView view) {
            Method method = this.f3192b;
            if (method != null) {
                try {
                    method.invoke(view, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: c */
        public void mo4149c(AutoCompleteTextView view, boolean visible) {
            Method method = this.f3193c;
            if (method != null) {
                try {
                    method.invoke(view, new Object[]{Boolean.valueOf(visible)});
                } catch (Exception e) {
                }
            }
        }
    }
}
