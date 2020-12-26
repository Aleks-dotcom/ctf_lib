package p000a.p041i.p042a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: a.i.a.b */
public class C0498b extends Filter {

    /* renamed from: a */
    public C0499a f2112a;

    /* renamed from: a.i.a.b$a */
    public interface C0499a {
        /* renamed from: a */
        CharSequence mo1378a(Cursor cursor);

        /* renamed from: b */
        Cursor mo2665b();

        /* renamed from: c */
        void mo1379c(Cursor cursor);

        /* renamed from: d */
        Cursor mo1380d(CharSequence charSequence);
    }

    public C0498b(C0499a client) {
        this.f2112a = client;
    }

    public CharSequence convertResultToString(Object resultValue) {
        return this.f2112a.mo1378a((Cursor) resultValue);
    }

    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = this.f2112a.mo1380d(constraint);
        Filter.FilterResults results = new Filter.FilterResults();
        if (cursor != null) {
            results.count = cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    public void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = this.f2112a.mo2665b();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            this.f2112a.mo1379c((Cursor) obj);
        }
    }
}
