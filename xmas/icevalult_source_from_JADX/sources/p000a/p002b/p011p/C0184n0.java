package p000a.p002b.p011p;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: a.b.p.n0 */
public class C0184n0 extends Resources {

    /* renamed from: a */
    public final Resources f967a;

    public C0184n0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f967a = resources;
    }

    public CharSequence getText(int id) {
        return this.f967a.getText(id);
    }

    public CharSequence getQuantityText(int id, int quantity) {
        return this.f967a.getQuantityText(id, quantity);
    }

    public String getString(int id) {
        return this.f967a.getString(id);
    }

    public String getString(int id, Object... formatArgs) {
        return this.f967a.getString(id, formatArgs);
    }

    public String getQuantityString(int id, int quantity, Object... formatArgs) {
        return this.f967a.getQuantityString(id, quantity, formatArgs);
    }

    public String getQuantityString(int id, int quantity) {
        return this.f967a.getQuantityString(id, quantity);
    }

    public CharSequence getText(int id, CharSequence def) {
        return this.f967a.getText(id, def);
    }

    public CharSequence[] getTextArray(int id) {
        return this.f967a.getTextArray(id);
    }

    public String[] getStringArray(int id) {
        return this.f967a.getStringArray(id);
    }

    public int[] getIntArray(int id) {
        return this.f967a.getIntArray(id);
    }

    public TypedArray obtainTypedArray(int id) {
        return this.f967a.obtainTypedArray(id);
    }

    public float getDimension(int id) {
        return this.f967a.getDimension(id);
    }

    public int getDimensionPixelOffset(int id) {
        return this.f967a.getDimensionPixelOffset(id);
    }

    public int getDimensionPixelSize(int id) {
        return this.f967a.getDimensionPixelSize(id);
    }

    public float getFraction(int id, int base, int pbase) {
        return this.f967a.getFraction(id, base, pbase);
    }

    public Drawable getDrawable(int id) {
        return this.f967a.getDrawable(id);
    }

    public Drawable getDrawable(int id, Resources.Theme theme) {
        return this.f967a.getDrawable(id, theme);
    }

    public Drawable getDrawableForDensity(int id, int density) {
        return this.f967a.getDrawableForDensity(id, density);
    }

    public Drawable getDrawableForDensity(int id, int density, Resources.Theme theme) {
        return this.f967a.getDrawableForDensity(id, density, theme);
    }

    public Movie getMovie(int id) {
        return this.f967a.getMovie(id);
    }

    public int getColor(int id) {
        return this.f967a.getColor(id);
    }

    public ColorStateList getColorStateList(int id) {
        return this.f967a.getColorStateList(id);
    }

    public boolean getBoolean(int id) {
        return this.f967a.getBoolean(id);
    }

    public int getInteger(int id) {
        return this.f967a.getInteger(id);
    }

    public XmlResourceParser getLayout(int id) {
        return this.f967a.getLayout(id);
    }

    public XmlResourceParser getAnimation(int id) {
        return this.f967a.getAnimation(id);
    }

    public XmlResourceParser getXml(int id) {
        return this.f967a.getXml(id);
    }

    public InputStream openRawResource(int id) {
        return this.f967a.openRawResource(id);
    }

    public InputStream openRawResource(int id, TypedValue value) {
        return this.f967a.openRawResource(id, value);
    }

    public AssetFileDescriptor openRawResourceFd(int id) {
        return this.f967a.openRawResourceFd(id);
    }

    public void getValue(int id, TypedValue outValue, boolean resolveRefs) {
        this.f967a.getValue(id, outValue, resolveRefs);
    }

    public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) {
        this.f967a.getValueForDensity(id, density, outValue, resolveRefs);
    }

    public void getValue(String name, TypedValue outValue, boolean resolveRefs) {
        this.f967a.getValue(name, outValue, resolveRefs);
    }

    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return this.f967a.obtainAttributes(set, attrs);
    }

    public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.f967a;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f967a.getDisplayMetrics();
    }

    public Configuration getConfiguration() {
        return this.f967a.getConfiguration();
    }

    public int getIdentifier(String name, String defType, String defPackage) {
        return this.f967a.getIdentifier(name, defType, defPackage);
    }

    public String getResourceName(int resid) {
        return this.f967a.getResourceName(resid);
    }

    public String getResourcePackageName(int resid) {
        return this.f967a.getResourcePackageName(resid);
    }

    public String getResourceTypeName(int resid) {
        return this.f967a.getResourceTypeName(resid);
    }

    public String getResourceEntryName(int resid) {
        return this.f967a.getResourceEntryName(resid);
    }

    public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) {
        this.f967a.parseBundleExtras(parser, outBundle);
    }

    public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) {
        this.f967a.parseBundleExtra(tagName, attrs, outBundle);
    }
}
