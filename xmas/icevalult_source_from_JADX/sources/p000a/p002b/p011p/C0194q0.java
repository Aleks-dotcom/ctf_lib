package p000a.p002b.p011p;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p025h.p027e.C0339a;
import p000a.p041i.p042a.C0500c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.p.q0 */
public class C0194q0 extends C0500c implements View.OnClickListener {

    /* renamed from: m */
    public final SearchView f1002m;

    /* renamed from: n */
    public final SearchableInfo f1003n;

    /* renamed from: o */
    public final Context f1004o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f1005p;

    /* renamed from: q */
    public final int f1006q;

    /* renamed from: r */
    public boolean f1007r = false;

    /* renamed from: s */
    public int f1008s = 1;

    /* renamed from: t */
    public ColorStateList f1009t;

    /* renamed from: u */
    public int f1010u = -1;

    /* renamed from: v */
    public int f1011v = -1;

    /* renamed from: w */
    public int f1012w = -1;

    /* renamed from: x */
    public int f1013x = -1;

    /* renamed from: y */
    public int f1014y = -1;

    /* renamed from: z */
    public int f1015z = -1;

    public C0194q0(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        SearchManager searchManager = (SearchManager) this.f2105e.getSystemService("search");
        this.f1002m = searchView;
        this.f1003n = searchable;
        this.f1006q = searchView.getSuggestionCommitIconResId();
        this.f1004o = context;
        this.f1005p = outsideDrawablesCache;
    }

    /* renamed from: x */
    public void mo1400x(int refineWhat) {
        this.f1008s = refineWhat;
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: d */
    public Cursor mo1380d(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.f1002m.getVisibility() != 0 || this.f1002m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = mo1399v(this.f1003n, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo1377B(mo2665b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo1377B(mo2665b());
    }

    /* renamed from: B */
    public final void mo1377B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: c */
    public void mo1379c(Cursor c) {
        if (this.f1007r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c != null) {
                c.close();
                return;
            }
            return;
        }
        try {
            super.mo1379c(c);
            if (c != null) {
                this.f1010u = c.getColumnIndex("suggest_text_1");
                this.f1011v = c.getColumnIndex("suggest_text_2");
                this.f1012w = c.getColumnIndex("suggest_text_2_url");
                this.f1013x = c.getColumnIndex("suggest_icon_1");
                this.f1014y = c.getColumnIndex("suggest_icon_2");
                this.f1015z = c.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: h */
    public View mo1384h(Context context, Cursor cursor, ViewGroup parent) {
        View v = super.mo1384h(context, cursor, parent);
        v.setTag(new C0195a(v));
        ((ImageView) v.findViewById(C0008f.edit_query)).setImageResource(this.f1006q);
        return v;
    }

    /* renamed from: a.b.p.q0$a */
    public static final class C0195a {

        /* renamed from: a */
        public final TextView f1016a;

        /* renamed from: b */
        public final TextView f1017b;

        /* renamed from: c */
        public final ImageView f1018c;

        /* renamed from: d */
        public final ImageView f1019d;

        /* renamed from: e */
        public final ImageView f1020e;

        public C0195a(View v) {
            this.f1016a = (TextView) v.findViewById(16908308);
            this.f1017b = (TextView) v.findViewById(16908309);
            this.f1018c = (ImageView) v.findViewById(16908295);
            this.f1019d = (ImageView) v.findViewById(16908296);
            this.f1020e = (ImageView) v.findViewById(C0008f.edit_query);
        }
    }

    /* renamed from: e */
    public void mo1381e(View view, Context context, Cursor cursor) {
        CharSequence text2;
        C0195a views = (C0195a) view.getTag();
        int flags = 0;
        int i = this.f1015z;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f1016a != null) {
            mo1402z(views.f1016a, m1011w(cursor, this.f1010u));
        }
        if (views.f1017b != null) {
            CharSequence text22 = m1011w(cursor, this.f1012w);
            if (text22 != null) {
                text2 = mo1387l(text22);
            } else {
                text2 = m1011w(cursor, this.f1011v);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f1016a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f1016a.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f1016a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f1016a.setMaxLines(1);
                }
            }
            mo1402z(views.f1017b, text2);
        }
        ImageView imageView = views.f1018c;
        if (imageView != null) {
            mo1401y(imageView, mo1397t(cursor), 4);
        }
        ImageView imageView2 = views.f1019d;
        if (imageView2 != null) {
            mo1401y(imageView2, mo1398u(cursor), 8);
        }
        int i2 = this.f1008s;
        if (i2 == 2 || (i2 == 1 && (flags & 1) != 0)) {
            views.f1020e.setVisibility(0);
            views.f1020e.setTag(views.f1016a.getText());
            views.f1020e.setOnClickListener(this);
            return;
        }
        views.f1020e.setVisibility(8);
    }

    public void onClick(View v) {
        Object tag = v.getTag();
        if (tag instanceof CharSequence) {
            this.f1002m.mo4073U((CharSequence) tag);
        }
    }

    /* renamed from: l */
    public final CharSequence mo1387l(CharSequence url) {
        if (this.f1009t == null) {
            TypedValue colorValue = new TypedValue();
            this.f2105e.getTheme().resolveAttribute(C0003a.textColorSearchUrl, colorValue, true);
            this.f1009t = this.f2105e.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1009t, (ColorStateList) null), 0, url.length(), 33);
        return text;
    }

    /* renamed from: z */
    public final void mo1402z(TextView v, CharSequence text) {
        v.setText(text);
        if (TextUtils.isEmpty(text)) {
            v.setVisibility(8);
        } else {
            v.setVisibility(0);
        }
    }

    /* renamed from: t */
    public final Drawable mo1397t(Cursor cursor) {
        int i = this.f1013x;
        if (i == -1) {
            return null;
        }
        Drawable drawable = mo1396s(cursor.getString(i));
        if (drawable != null) {
            return drawable;
        }
        return mo1393p(cursor);
    }

    /* renamed from: u */
    public final Drawable mo1398u(Cursor cursor) {
        int i = this.f1014y;
        if (i == -1) {
            return null;
        }
        return mo1396s(cursor.getString(i));
    }

    /* renamed from: y */
    public final void mo1401y(ImageView v, Drawable drawable, int nullVisibility) {
        v.setImageDrawable(drawable);
        if (drawable == null) {
            v.setVisibility(nullVisibility);
            return;
        }
        v.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    public CharSequence mo1378a(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = m1010o(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.f1003n.shouldRewriteQueryFromData() && (data = m1010o(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.f1003n.shouldRewriteQueryFromText() || (text1 = m1010o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = mo1384h(this.f2105e, this.f2104d, parent);
            if (v != null) {
                ((C0195a) v.getTag()).f1016a.setText(e.toString());
            }
            return v;
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = mo2667g(this.f2105e, this.f2104d, parent);
            if (v != null) {
                ((C0195a) v.getTag()).f1016a.setText(e.toString());
            }
            return v;
        }
    }

    /* renamed from: s */
    public final Drawable mo1396s(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.f1004o.getPackageName() + "/" + resourceId;
            Drawable drawable = mo1386k(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = C0339a.m1777c(this.f1004o, resourceId);
            mo1376A(drawableUri, drawable2);
            return drawable2;
        } catch (NumberFormatException e) {
            Drawable drawable3 = mo1386k(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Drawable drawable4 = mo1394q(Uri.parse(drawableId));
            mo1376A(drawableId, drawable4);
            return drawable4;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }

    /* renamed from: q */
    public final Drawable mo1394q(Uri uri) {
        InputStream stream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return mo1395r(uri);
            }
            stream = this.f1004o.getContentResolver().openInputStream(uri);
            if (stream != null) {
                Drawable createFromStream = Drawable.createFromStream(stream, (String) null);
                try {
                    stream.close();
                } catch (IOException ex) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                }
                return createFromStream;
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (Resources.NotFoundException e) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                stream.close();
            } catch (IOException ex2) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex2);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final Drawable mo1386k(String resourceUri) {
        Drawable.ConstantState cached = this.f1005p.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    /* renamed from: A */
    public final void mo1376A(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.f1005p.put(resourceUri, drawable.getConstantState());
        }
    }

    /* renamed from: p */
    public final Drawable mo1393p(Cursor cursor) {
        Drawable drawable = mo1389n(this.f1003n.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return this.f2105e.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: n */
    public final Drawable mo1389n(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.f1005p.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.f1005p.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.f1004o.getResources());
        }
        Drawable drawable = mo1388m(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.f1005p.put(componentIconKey, toCache);
        return drawable;
    }

    /* renamed from: m */
    public final Drawable mo1388m(ComponentName component) {
        PackageManager pm = this.f2105e.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            Drawable drawable = pm.getDrawable(component.getPackageName(), iconId, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    /* renamed from: o */
    public static String m1010o(Cursor cursor, String columnName) {
        return m1011w(cursor, cursor.getColumnIndex(columnName));
    }

    /* renamed from: w */
    public static String m1011w(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: r */
    public Drawable mo1395r(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r = this.f2105e.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: v */
    public Cursor mo1399v(SearchableInfo searchable, String query, int limit) {
        String authority;
        String[] selArgs;
        if (searchable == null || (authority = searchable.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query("").fragment("");
        String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        String selection = searchable.getSuggestSelection();
        if (selection != null) {
            selArgs = new String[]{query};
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        return this.f2105e.getContentResolver().query(uriBuilder.build(), (String[]) null, selection, selArgs, (String) null);
    }
}
