package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import p000a.p025h.p037l.C0415d;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.p092v.C1065c;
import p066b.p067a.p068a.p069a.p092v.C1066d;
import p066b.p067a.p068a.p069a.p092v.C1082h;
import p066b.p067a.p068a.p069a.p092v.C1085j;
import p066b.p067a.p068a.p069a.p092v.C1093o;

public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f4800b;

    public MaterialCalendarGridView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f4800b = C1093o.m5823k();
        if (C1082h.m5778l1(getContext())) {
            setNextFocusLeftId(C0943f.cancel_button);
            setNextFocusRightId(C0943f.confirm_button);
        }
        C0460r.m2257c0(this, new C1162a(this));
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    public class C1162a extends C0420a {
        public C1162a(MaterialCalendarGridView this$0) {
        }

        /* renamed from: g */
        public void mo2424g(View view, C0424c accessibilityNodeInfoCompat) {
            super.mo2424g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo2461X((Object) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public void setSelection(int position) {
        if (position < getAdapter().mo6249b()) {
            super.setSelection(getAdapter().mo6249b());
        } else {
            super.setSelection(position);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (!super.onKeyDown(keyCode, event)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo6249b()) {
            return true;
        }
        if (19 != keyCode) {
            return false;
        }
        setSelection(getAdapter().mo6249b());
        return true;
    }

    /* renamed from: b */
    public C1085j getAdapter() {
        return (C1085j) super.getAdapter();
    }

    public final void setAdapter(ListAdapter adapter) {
        if (adapter instanceof C1085j) {
            super.setAdapter(adapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C1085j.class.getCanonicalName()}));
        }
    }

    public final void onDraw(Canvas canvas) {
        int rangeHighlightStart;
        int firstHighlightPosition;
        int lastHighlightPosition;
        int rangeHighlightEnd;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C1085j monthAdapter = getAdapter();
        C1066d<?> dVar = monthAdapter.f4535c;
        C1065c calendarStyle = monthAdapter.f4536d;
        Long firstOfMonth = monthAdapter.getItem(monthAdapter.mo6249b());
        Long lastOfMonth = monthAdapter.getItem(monthAdapter.mo6259h());
        Iterator<C0415d<Long, Long>> it = dVar.mo6208c().iterator();
        while (it.hasNext()) {
            C0415d next = it.next();
            F f = next.f1983a;
            if (f == null) {
                C1066d<?> dVar2 = dVar;
                Long l = firstOfMonth;
                Long l2 = lastOfMonth;
                Iterator<C0415d<Long, Long>> it2 = it;
                C0415d dVar3 = next;
                materialCalendarGridView = this;
            } else if (next.f1984b == null) {
                continue;
            } else {
                long startItem = ((Long) f).longValue();
                long endItem = ((Long) next.f1984b).longValue();
                if (!m6211d(firstOfMonth, lastOfMonth, Long.valueOf(startItem), Long.valueOf(endItem))) {
                    if (startItem < firstOfMonth.longValue()) {
                        firstHighlightPosition = monthAdapter.mo6249b();
                        if (monthAdapter.mo6253f(firstHighlightPosition)) {
                            rangeHighlightStart = 0;
                        } else {
                            rangeHighlightStart = materialCalendarGridView.getChildAt(firstHighlightPosition - 1).getRight();
                        }
                    } else {
                        materialCalendarGridView.f4800b.setTimeInMillis(startItem);
                        firstHighlightPosition = monthAdapter.mo6248a(materialCalendarGridView.f4800b.get(5));
                        rangeHighlightStart = m6210c(materialCalendarGridView.getChildAt(firstHighlightPosition));
                    }
                    if (endItem > lastOfMonth.longValue()) {
                        lastHighlightPosition = monthAdapter.mo6259h();
                        if (monthAdapter.mo6254g(lastHighlightPosition)) {
                            i = getWidth();
                        } else {
                            i = materialCalendarGridView.getChildAt(lastHighlightPosition).getRight();
                        }
                        rangeHighlightEnd = i;
                    } else {
                        materialCalendarGridView.f4800b.setTimeInMillis(endItem);
                        lastHighlightPosition = monthAdapter.mo6248a(materialCalendarGridView.f4800b.get(5));
                        rangeHighlightEnd = m6210c(materialCalendarGridView.getChildAt(lastHighlightPosition));
                    }
                    Long firstOfMonth2 = firstOfMonth;
                    Long lastOfMonth2 = lastOfMonth;
                    int firstRow = (int) monthAdapter.getItemId(firstHighlightPosition);
                    Iterator<C0415d<Long, Long>> it3 = it;
                    C0415d dVar4 = next;
                    int lastRow = (int) monthAdapter.getItemId(lastHighlightPosition);
                    int row = firstRow;
                    while (row <= lastRow) {
                        C1085j monthAdapter2 = monthAdapter;
                        int firstPositionInRow = row * getNumColumns();
                        C1066d<?> dVar5 = dVar;
                        int lastPositionInRow = (firstPositionInRow + getNumColumns()) - 1;
                        View firstView = materialCalendarGridView.getChildAt(firstPositionInRow);
                        int top = firstView.getTop() + calendarStyle.f4481a.mo6204c();
                        Iterator<C0415d<Long, Long>> it4 = it3;
                        int bottom = firstView.getBottom() - calendarStyle.f4481a.mo6203b();
                        int left = firstPositionInRow > firstHighlightPosition ? 0 : rangeHighlightStart;
                        int right = lastHighlightPosition > lastPositionInRow ? getWidth() : rangeHighlightEnd;
                        int i2 = firstPositionInRow;
                        int left2 = left;
                        int left3 = lastPositionInRow;
                        float f2 = (float) left2;
                        int i3 = left2;
                        float f3 = (float) top;
                        int i4 = top;
                        int right2 = right;
                        int i5 = right2;
                        int i6 = bottom;
                        canvas.drawRect(f2, f3, (float) right2, (float) bottom, calendarStyle.f4488h);
                        row++;
                        materialCalendarGridView = this;
                        monthAdapter = monthAdapter2;
                        dVar = dVar5;
                        it3 = it4;
                        firstRow = firstRow;
                    }
                    C1066d<?> dVar6 = dVar;
                    Iterator<C0415d<Long, Long>> it5 = it3;
                    int i7 = firstRow;
                    materialCalendarGridView = this;
                    firstOfMonth = firstOfMonth2;
                    lastOfMonth = lastOfMonth2;
                    it = it5;
                } else {
                    return;
                }
            }
        }
    }

    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        if (gainFocus) {
            mo6815a(direction, previouslyFocusedRect);
        } else {
            super.onFocusChanged(false, direction, previouslyFocusedRect);
        }
    }

    /* renamed from: a */
    public final void mo6815a(int direction, Rect previouslyFocusedRect) {
        if (direction == 33) {
            setSelection(getAdapter().mo6259h());
        } else if (direction == 130) {
            setSelection(getAdapter().mo6249b());
        } else {
            super.onFocusChanged(true, direction, previouslyFocusedRect);
        }
    }

    /* renamed from: d */
    public static boolean m6211d(Long firstOfMonth, Long lastOfMonth, Long startDay, Long endDay) {
        if (firstOfMonth == null || lastOfMonth == null || startDay == null || endDay == null || startDay.longValue() > lastOfMonth.longValue() || endDay.longValue() < firstOfMonth.longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m6210c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
