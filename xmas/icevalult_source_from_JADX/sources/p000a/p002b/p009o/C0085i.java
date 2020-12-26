package p000a.p002b.p009o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: a.b.o.i */
public class C0085i implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f561b;

    public C0085i(Window.Callback wrapped) {
        if (wrapped != null) {
            this.f561b = wrapped;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return this.f561b.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return this.f561b.dispatchKeyShortcutEvent(event);
    }

    public boolean dispatchTouchEvent(MotionEvent event) {
        return this.f561b.dispatchTouchEvent(event);
    }

    public boolean dispatchTrackballEvent(MotionEvent event) {
        return this.f561b.dispatchTrackballEvent(event);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        return this.f561b.dispatchGenericMotionEvent(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return this.f561b.dispatchPopulateAccessibilityEvent(event);
    }

    public View onCreatePanelView(int featureId) {
        return this.f561b.onCreatePanelView(featureId);
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return this.f561b.onCreatePanelMenu(featureId, menu);
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return this.f561b.onPreparePanel(featureId, view, menu);
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return this.f561b.onMenuOpened(featureId, menu);
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        return this.f561b.onMenuItemSelected(featureId, item);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
        this.f561b.onWindowAttributesChanged(attrs);
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        this.f561b.onWindowFocusChanged(hasFocus);
    }

    public void onAttachedToWindow() {
        this.f561b.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f561b.onDetachedFromWindow();
    }

    public void onPanelClosed(int featureId, Menu menu) {
        this.f561b.onPanelClosed(featureId, menu);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f561b.onSearchRequested(searchEvent);
    }

    public boolean onSearchRequested() {
        return this.f561b.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f561b.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
        return this.f561b.onWindowStartingActionMode(callback, type);
    }

    public void onActionModeStarted(ActionMode mode) {
        this.f561b.onActionModeStarted(mode);
    }

    public void onActionModeFinished(ActionMode mode) {
        this.f561b.onActionModeFinished(mode);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        this.f561b.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    public void onPointerCaptureChanged(boolean hasCapture) {
        this.f561b.onPointerCaptureChanged(hasCapture);
    }

    /* renamed from: a */
    public final Window.Callback mo469a() {
        return this.f561b;
    }
}
