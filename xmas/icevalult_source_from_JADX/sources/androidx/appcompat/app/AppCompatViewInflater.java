package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p000a.p002b.C0012j;
import p000a.p002b.p009o.C0076d;
import p000a.p002b.p011p.C0129b0;
import p000a.p002b.p011p.C0141d;
import p000a.p002b.p011p.C0146f;
import p000a.p002b.p011p.C0150g;
import p000a.p002b.p011p.C0153h;
import p000a.p002b.p011p.C0170k;
import p000a.p002b.p011p.C0175m;
import p000a.p002b.p011p.C0185o;
import p000a.p002b.p011p.C0187p;
import p000a.p002b.p011p.C0198s;
import p000a.p002b.p011p.C0200t;
import p000a.p002b.p011p.C0201t0;
import p000a.p002b.p011p.C0202u;
import p000a.p002b.p011p.C0206w;
import p000a.p002b.p011p.C0227z;
import p000a.p018e.C0256a;
import p000a.p025h.p038m.C0460r;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new C0256a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    public final View createView(View parent, String name, Context context, AttributeSet attrs, boolean inheritContext, boolean readAndroidTheme, boolean readAppTheme, boolean wrapContext) {
        View view;
        Context originalContext = context;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = themifyContext(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = C0201t0.m1044b(context);
        }
        char c = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (name.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view = createTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 1:
                view = createImageView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 2:
                view = createButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 3:
                view = createEditText(context, attrs);
                verifyNotNull(view, name);
                break;
            case 4:
                view = createSpinner(context, attrs);
                verifyNotNull(view, name);
                break;
            case 5:
                view = createImageButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 6:
                view = createCheckBox(context, attrs);
                verifyNotNull(view, name);
                break;
            case 7:
                view = createRadioButton(context, attrs);
                verifyNotNull(view, name);
                break;
            case 8:
                view = createCheckedTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 9:
                view = createAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 10:
                view = createMultiAutoCompleteTextView(context, attrs);
                verifyNotNull(view, name);
                break;
            case 11:
                view = createRatingBar(context, attrs);
                verifyNotNull(view, name);
                break;
            case 12:
                view = createSeekBar(context, attrs);
                verifyNotNull(view, name);
                break;
            case 13:
                view = createToggleButton(context, attrs);
                verifyNotNull(view, name);
                break;
            default:
                view = createView(context, name, attrs);
                break;
        }
        if (view == null && originalContext != context) {
            view = createViewFromTag(context, name, attrs);
        }
        if (view != null) {
            checkOnClickListener(view, attrs);
        }
        return view;
    }

    public C0227z createTextView(Context context, AttributeSet attrs) {
        return new C0227z(context, attrs);
    }

    public C0185o createImageView(Context context, AttributeSet attrs) {
        return new C0185o(context, attrs);
    }

    public C0146f createButton(Context context, AttributeSet attrs) {
        return new C0146f(context, attrs);
    }

    public C0170k createEditText(Context context, AttributeSet attrs) {
        return new C0170k(context, attrs);
    }

    public C0206w createSpinner(Context context, AttributeSet attrs) {
        return new C0206w(context, attrs);
    }

    public C0175m createImageButton(Context context, AttributeSet attrs) {
        return new C0175m(context, attrs);
    }

    public C0150g createCheckBox(Context context, AttributeSet attrs) {
        return new C0150g(context, attrs);
    }

    public C0198s createRadioButton(Context context, AttributeSet attrs) {
        return new C0198s(context, attrs);
    }

    public C0153h createCheckedTextView(Context context, AttributeSet attrs) {
        return new C0153h(context, attrs);
    }

    public C0141d createAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new C0141d(context, attrs);
    }

    public C0187p createMultiAutoCompleteTextView(Context context, AttributeSet attrs) {
        return new C0187p(context, attrs);
    }

    public C0200t createRatingBar(Context context, AttributeSet attrs) {
        return new C0200t(context, attrs);
    }

    public C0202u createSeekBar(Context context, AttributeSet attrs) {
        return new C0202u(context, attrs);
    }

    public C0129b0 createToggleButton(Context context, AttributeSet attrs) {
        return new C0129b0(context, attrs);
    }

    private void verifyNotNull(View view, String name) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }

    public View createView(Context context, String name, AttributeSet attrs) {
        return null;
    }

    private View createViewFromTag(Context context, String name, AttributeSet attrs) {
        if (name.equals("view")) {
            name = attrs.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attrs;
            if (-1 == name.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i < strArr.length) {
                        View view = createViewByPrefix(context, name, strArr[i]);
                        if (view != null) {
                            return view;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix = createViewByPrefix(context, name, (String) null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix;
            }
        } catch (Exception e) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private void checkOnClickListener(View view, AttributeSet attrs) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C0460r.m2230E(view)) {
            TypedArray a = context.obtainStyledAttributes(attrs, sOnClickAttrs);
            String handlerName = a.getString(0);
            if (handlerName != null) {
                view.setOnClickListener(new C0778a(view, handlerName));
            }
            a.recycle();
        }
    }

    private View createViewByPrefix(Context context, String name, String prefix) {
        String str;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends U> constructor = map.get(name);
        if (constructor == null) {
            if (prefix != null) {
                try {
                    str = prefix + name;
                } catch (Exception e) {
                    return null;
                }
            } else {
                str = name;
            }
            constructor = Class.forName(str, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            map.put(name, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private static Context themifyContext(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a = context.obtainStyledAttributes(attrs, C0012j.f171l3, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a.getResourceId(C0012j.f176m3, 0);
        }
        if (useAppTheme && themeId == 0 && (themeId = a.getResourceId(C0012j.f181n3, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        a.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof C0076d) || ((C0076d) context).mo419b() != themeId) {
            return new C0076d(context, themeId);
        }
        return context;
    }

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class C0778a implements View.OnClickListener {

        /* renamed from: b */
        public final View f3003b;

        /* renamed from: c */
        public final String f3004c;

        /* renamed from: d */
        public Method f3005d;

        /* renamed from: e */
        public Context f3006e;

        public C0778a(View hostView, String methodName) {
            this.f3003b = hostView;
            this.f3004c = methodName;
        }

        public void onClick(View v) {
            if (this.f3005d == null) {
                mo3889a(this.f3003b.getContext(), this.f3004c);
            }
            try {
                this.f3005d.invoke(this.f3006e, new Object[]{v});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: a */
        public final void mo3889a(Context context, String name) {
            String idText;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f3004c, new Class[]{View.class})) != null) {
                        this.f3005d = method;
                        this.f3006e = context;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f3003b.getId();
            if (id == -1) {
                idText = "";
            } else {
                idText = " with id '" + this.f3003b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f3004c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f3003b.getClass() + idText);
        }
    }
}
