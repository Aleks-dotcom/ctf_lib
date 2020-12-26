package p000a.p041i.p042a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000a.p041i.p042a.C0498b;

/* renamed from: a.i.a.a */
public abstract class C0495a extends BaseAdapter implements Filterable, C0498b.C0499a {

    /* renamed from: b */
    public boolean f2102b;

    /* renamed from: c */
    public boolean f2103c;

    /* renamed from: d */
    public Cursor f2104d;

    /* renamed from: e */
    public Context f2105e;

    /* renamed from: f */
    public int f2106f;

    /* renamed from: g */
    public C0496a f2107g;

    /* renamed from: h */
    public DataSetObserver f2108h;

    /* renamed from: i */
    public C0498b f2109i;

    /* renamed from: a */
    public abstract CharSequence mo1378a(Cursor cursor);

    /* renamed from: e */
    public abstract void mo1381e(View view, Context context, Cursor cursor);

    /* renamed from: g */
    public abstract View mo2667g(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: h */
    public abstract View mo1384h(Context context, Cursor cursor, ViewGroup viewGroup);

    public C0495a(Context context, Cursor c, boolean autoRequery) {
        mo2666f(context, c, autoRequery ? 1 : 2);
    }

    /* renamed from: f */
    public void mo2666f(Context context, Cursor c, int flags) {
        boolean z = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f2103c = true;
        } else {
            this.f2103c = false;
        }
        if (c != null) {
            z = true;
        }
        boolean cursorPresent = z;
        this.f2104d = c;
        this.f2102b = cursorPresent;
        this.f2105e = context;
        this.f2106f = cursorPresent ? c.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f2107g = new C0496a();
            this.f2108h = new C0497b();
        } else {
            this.f2107g = null;
            this.f2108h = null;
        }
        if (cursorPresent) {
            C0496a aVar = this.f2107g;
            if (aVar != null) {
                c.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2108h;
            if (dataSetObserver != null) {
                c.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: b */
    public Cursor mo2665b() {
        return this.f2104d;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f2102b || (cursor = this.f2104d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f2102b || (cursor = this.f2104d) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f2104d;
    }

    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f2102b || (cursor = this.f2104d) == null || !cursor.moveToPosition(position)) {
            return 0;
        }
        return this.f2104d.getLong(this.f2106f);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f2102b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2104d.moveToPosition(position)) {
            if (convertView == null) {
                v = mo1384h(this.f2105e, this.f2104d, parent);
            } else {
                v = convertView;
            }
            mo1381e(v, this.f2105e, this.f2104d);
            return v;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f2102b) {
            return null;
        }
        this.f2104d.moveToPosition(position);
        if (convertView == null) {
            v = mo2667g(this.f2105e, this.f2104d, parent);
        } else {
            v = convertView;
        }
        mo1381e(v, this.f2105e, this.f2104d);
        return v;
    }

    /* renamed from: c */
    public void mo1379c(Cursor cursor) {
        Cursor old = mo2673j(cursor);
        if (old != null) {
            old.close();
        }
    }

    /* renamed from: j */
    public Cursor mo2673j(Cursor newCursor) {
        if (newCursor == this.f2104d) {
            return null;
        }
        Cursor oldCursor = this.f2104d;
        if (oldCursor != null) {
            C0496a aVar = this.f2107g;
            if (aVar != null) {
                oldCursor.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2108h;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2104d = newCursor;
        if (newCursor != null) {
            C0496a aVar2 = this.f2107g;
            if (aVar2 != null) {
                newCursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2108h;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2106f = newCursor.getColumnIndexOrThrow("_id");
            this.f2102b = true;
            notifyDataSetChanged();
        } else {
            this.f2106f = -1;
            this.f2102b = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    public Filter getFilter() {
        if (this.f2109i == null) {
            this.f2109i = new C0498b(this);
        }
        return this.f2109i;
    }

    /* renamed from: i */
    public void mo2672i() {
        Cursor cursor;
        if (this.f2103c && (cursor = this.f2104d) != null && !cursor.isClosed()) {
            this.f2102b = this.f2104d.requery();
        }
    }

    /* renamed from: a.i.a.a$a */
    public class C0496a extends ContentObserver {
        public C0496a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean selfChange) {
            C0495a.this.mo2672i();
        }
    }

    /* renamed from: a.i.a.a$b */
    public class C0497b extends DataSetObserver {
        public C0497b() {
        }

        public void onChanged() {
            C0495a aVar = C0495a.this;
            aVar.f2102b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0495a aVar = C0495a.this;
            aVar.f2102b = false;
            aVar.notifyDataSetInvalidated();
        }
    }
}
