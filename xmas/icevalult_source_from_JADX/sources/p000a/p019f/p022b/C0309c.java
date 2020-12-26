package p000a.p019f.p022b;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p019f.p022b.C0312d;

/* renamed from: a.f.b.c */
public class C0309c {

    /* renamed from: b */
    public static final int[] f1528b = {0, 4, 8};

    /* renamed from: c */
    public static SparseIntArray f1529c;

    /* renamed from: a */
    public HashMap<Integer, C0311b> f1530a = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1529c = sparseIntArray;
        sparseIntArray.append(C0317h.f1699g1, 25);
        f1529c.append(C0317h.f1702h1, 26);
        f1529c.append(C0317h.f1708j1, 29);
        f1529c.append(C0317h.f1711k1, 30);
        f1529c.append(C0317h.f1726p1, 36);
        f1529c.append(C0317h.f1723o1, 35);
        f1529c.append(C0317h.f1656O0, 4);
        f1529c.append(C0317h.f1654N0, 3);
        f1529c.append(C0317h.f1650L0, 1);
        f1529c.append(C0317h.f1750x1, 6);
        f1529c.append(C0317h.f1753y1, 7);
        f1529c.append(C0317h.f1670V0, 17);
        f1529c.append(C0317h.f1672W0, 18);
        f1529c.append(C0317h.f1674X0, 19);
        f1529c.append(C0317h.f1707j0, 27);
        f1529c.append(C0317h.f1714l1, 32);
        f1529c.append(C0317h.f1717m1, 33);
        f1529c.append(C0317h.f1668U0, 10);
        f1529c.append(C0317h.f1666T0, 9);
        f1529c.append(C0317h.f1627B1, 13);
        f1529c.append(C0317h.f1636E1, 16);
        f1529c.append(C0317h.f1630C1, 14);
        f1529c.append(C0317h.f1756z1, 11);
        f1529c.append(C0317h.f1633D1, 15);
        f1529c.append(C0317h.f1624A1, 12);
        f1529c.append(C0317h.f1735s1, 40);
        f1529c.append(C0317h.f1693e1, 39);
        f1529c.append(C0317h.f1690d1, 41);
        f1529c.append(C0317h.f1732r1, 42);
        f1529c.append(C0317h.f1687c1, 20);
        f1529c.append(C0317h.f1729q1, 37);
        f1529c.append(C0317h.f1664S0, 5);
        f1529c.append(C0317h.f1696f1, 75);
        f1529c.append(C0317h.f1720n1, 75);
        f1529c.append(C0317h.f1705i1, 75);
        f1529c.append(C0317h.f1652M0, 75);
        f1529c.append(C0317h.f1648K0, 75);
        f1529c.append(C0317h.f1722o0, 24);
        f1529c.append(C0317h.f1728q0, 28);
        f1529c.append(C0317h.f1629C0, 31);
        f1529c.append(C0317h.f1632D0, 8);
        f1529c.append(C0317h.f1725p0, 34);
        f1529c.append(C0317h.f1731r0, 2);
        f1529c.append(C0317h.f1716m0, 23);
        f1529c.append(C0317h.f1719n0, 21);
        f1529c.append(C0317h.f1713l0, 22);
        f1529c.append(C0317h.f1734s0, 43);
        f1529c.append(C0317h.f1638F0, 44);
        f1529c.append(C0317h.f1623A0, 45);
        f1529c.append(C0317h.f1626B0, 46);
        f1529c.append(C0317h.f1755z0, 60);
        f1529c.append(C0317h.f1749x0, 47);
        f1529c.append(C0317h.f1752y0, 48);
        f1529c.append(C0317h.f1737t0, 49);
        f1529c.append(C0317h.f1740u0, 50);
        f1529c.append(C0317h.f1743v0, 51);
        f1529c.append(C0317h.f1746w0, 52);
        f1529c.append(C0317h.f1635E0, 53);
        f1529c.append(C0317h.f1738t1, 54);
        f1529c.append(C0317h.f1676Y0, 55);
        f1529c.append(C0317h.f1741u1, 56);
        f1529c.append(C0317h.f1678Z0, 57);
        f1529c.append(C0317h.f1744v1, 58);
        f1529c.append(C0317h.f1681a1, 59);
        f1529c.append(C0317h.f1658P0, 61);
        f1529c.append(C0317h.f1662R0, 62);
        f1529c.append(C0317h.f1660Q0, 63);
        f1529c.append(C0317h.f1710k0, 38);
        f1529c.append(C0317h.f1747w1, 69);
        f1529c.append(C0317h.f1684b1, 70);
        f1529c.append(C0317h.f1644I0, 71);
        f1529c.append(C0317h.f1642H0, 72);
        f1529c.append(C0317h.f1646J0, 73);
        f1529c.append(C0317h.f1640G0, 74);
    }

    /* renamed from: a.f.b.c$b */
    public static class C0311b {

        /* renamed from: A */
        public int f1531A;

        /* renamed from: B */
        public int f1532B;

        /* renamed from: C */
        public int f1533C;

        /* renamed from: D */
        public int f1534D;

        /* renamed from: E */
        public int f1535E;

        /* renamed from: F */
        public int f1536F;

        /* renamed from: G */
        public int f1537G;

        /* renamed from: H */
        public int f1538H;

        /* renamed from: I */
        public int f1539I;

        /* renamed from: J */
        public int f1540J;

        /* renamed from: K */
        public int f1541K;

        /* renamed from: L */
        public int f1542L;

        /* renamed from: M */
        public int f1543M;

        /* renamed from: N */
        public int f1544N;

        /* renamed from: O */
        public int f1545O;

        /* renamed from: P */
        public int f1546P;

        /* renamed from: Q */
        public float f1547Q;

        /* renamed from: R */
        public float f1548R;

        /* renamed from: S */
        public int f1549S;

        /* renamed from: T */
        public int f1550T;

        /* renamed from: U */
        public float f1551U;

        /* renamed from: V */
        public boolean f1552V;

        /* renamed from: W */
        public float f1553W;

        /* renamed from: X */
        public float f1554X;

        /* renamed from: Y */
        public float f1555Y;

        /* renamed from: Z */
        public float f1556Z;

        /* renamed from: a */
        public boolean f1557a;

        /* renamed from: a0 */
        public float f1558a0;

        /* renamed from: b */
        public int f1559b;

        /* renamed from: b0 */
        public float f1560b0;

        /* renamed from: c */
        public int f1561c;

        /* renamed from: c0 */
        public float f1562c0;

        /* renamed from: d */
        public int f1563d;

        /* renamed from: d0 */
        public float f1564d0;

        /* renamed from: e */
        public int f1565e;

        /* renamed from: e0 */
        public float f1566e0;

        /* renamed from: f */
        public int f1567f;

        /* renamed from: f0 */
        public float f1568f0;

        /* renamed from: g */
        public float f1569g;

        /* renamed from: g0 */
        public float f1570g0;

        /* renamed from: h */
        public int f1571h;

        /* renamed from: h0 */
        public boolean f1572h0;

        /* renamed from: i */
        public int f1573i;

        /* renamed from: i0 */
        public boolean f1574i0;

        /* renamed from: j */
        public int f1575j;

        /* renamed from: j0 */
        public int f1576j0;

        /* renamed from: k */
        public int f1577k;

        /* renamed from: k0 */
        public int f1578k0;

        /* renamed from: l */
        public int f1579l;

        /* renamed from: l0 */
        public int f1580l0;

        /* renamed from: m */
        public int f1581m;

        /* renamed from: m0 */
        public int f1582m0;

        /* renamed from: n */
        public int f1583n;

        /* renamed from: n0 */
        public int f1584n0;

        /* renamed from: o */
        public int f1585o;

        /* renamed from: o0 */
        public int f1586o0;

        /* renamed from: p */
        public int f1587p;

        /* renamed from: p0 */
        public float f1588p0;

        /* renamed from: q */
        public int f1589q;

        /* renamed from: q0 */
        public float f1590q0;

        /* renamed from: r */
        public int f1591r;

        /* renamed from: r0 */
        public boolean f1592r0;

        /* renamed from: s */
        public int f1593s;

        /* renamed from: s0 */
        public int f1594s0;

        /* renamed from: t */
        public int f1595t;

        /* renamed from: t0 */
        public int f1596t0;

        /* renamed from: u */
        public float f1597u;

        /* renamed from: u0 */
        public int[] f1598u0;

        /* renamed from: v */
        public float f1599v;

        /* renamed from: v0 */
        public String f1600v0;

        /* renamed from: w */
        public String f1601w;

        /* renamed from: x */
        public int f1602x;

        /* renamed from: y */
        public int f1603y;

        /* renamed from: z */
        public float f1604z;

        public C0311b() {
            this.f1557a = false;
            this.f1565e = -1;
            this.f1567f = -1;
            this.f1569g = -1.0f;
            this.f1571h = -1;
            this.f1573i = -1;
            this.f1575j = -1;
            this.f1577k = -1;
            this.f1579l = -1;
            this.f1581m = -1;
            this.f1583n = -1;
            this.f1585o = -1;
            this.f1587p = -1;
            this.f1589q = -1;
            this.f1591r = -1;
            this.f1593s = -1;
            this.f1595t = -1;
            this.f1597u = 0.5f;
            this.f1599v = 0.5f;
            this.f1601w = null;
            this.f1602x = -1;
            this.f1603y = 0;
            this.f1604z = 0.0f;
            this.f1531A = -1;
            this.f1532B = -1;
            this.f1533C = -1;
            this.f1534D = -1;
            this.f1535E = -1;
            this.f1536F = -1;
            this.f1537G = -1;
            this.f1538H = -1;
            this.f1539I = -1;
            this.f1540J = 0;
            this.f1541K = -1;
            this.f1542L = -1;
            this.f1543M = -1;
            this.f1544N = -1;
            this.f1545O = -1;
            this.f1546P = -1;
            this.f1547Q = 0.0f;
            this.f1548R = 0.0f;
            this.f1549S = 0;
            this.f1550T = 0;
            this.f1551U = 1.0f;
            this.f1552V = false;
            this.f1553W = 0.0f;
            this.f1554X = 0.0f;
            this.f1555Y = 0.0f;
            this.f1556Z = 0.0f;
            this.f1558a0 = 1.0f;
            this.f1560b0 = 1.0f;
            this.f1562c0 = Float.NaN;
            this.f1564d0 = Float.NaN;
            this.f1566e0 = 0.0f;
            this.f1568f0 = 0.0f;
            this.f1570g0 = 0.0f;
            this.f1572h0 = false;
            this.f1574i0 = false;
            this.f1576j0 = 0;
            this.f1578k0 = 0;
            this.f1580l0 = -1;
            this.f1582m0 = -1;
            this.f1584n0 = -1;
            this.f1586o0 = -1;
            this.f1588p0 = 1.0f;
            this.f1590q0 = 1.0f;
            this.f1592r0 = false;
            this.f1594s0 = -1;
            this.f1596t0 = -1;
        }

        /* renamed from: d */
        public C0311b clone() {
            C0311b clone = new C0311b();
            clone.f1557a = this.f1557a;
            clone.f1559b = this.f1559b;
            clone.f1561c = this.f1561c;
            clone.f1565e = this.f1565e;
            clone.f1567f = this.f1567f;
            clone.f1569g = this.f1569g;
            clone.f1571h = this.f1571h;
            clone.f1573i = this.f1573i;
            clone.f1575j = this.f1575j;
            clone.f1577k = this.f1577k;
            clone.f1579l = this.f1579l;
            clone.f1581m = this.f1581m;
            clone.f1583n = this.f1583n;
            clone.f1585o = this.f1585o;
            clone.f1587p = this.f1587p;
            clone.f1589q = this.f1589q;
            clone.f1591r = this.f1591r;
            clone.f1593s = this.f1593s;
            clone.f1595t = this.f1595t;
            clone.f1597u = this.f1597u;
            clone.f1599v = this.f1599v;
            clone.f1601w = this.f1601w;
            clone.f1531A = this.f1531A;
            clone.f1532B = this.f1532B;
            clone.f1597u = this.f1597u;
            clone.f1597u = this.f1597u;
            clone.f1597u = this.f1597u;
            clone.f1597u = this.f1597u;
            clone.f1597u = this.f1597u;
            clone.f1533C = this.f1533C;
            clone.f1534D = this.f1534D;
            clone.f1535E = this.f1535E;
            clone.f1536F = this.f1536F;
            clone.f1537G = this.f1537G;
            clone.f1538H = this.f1538H;
            clone.f1539I = this.f1539I;
            clone.f1540J = this.f1540J;
            clone.f1541K = this.f1541K;
            clone.f1542L = this.f1542L;
            clone.f1543M = this.f1543M;
            clone.f1544N = this.f1544N;
            clone.f1545O = this.f1545O;
            clone.f1546P = this.f1546P;
            clone.f1547Q = this.f1547Q;
            clone.f1548R = this.f1548R;
            clone.f1549S = this.f1549S;
            clone.f1550T = this.f1550T;
            clone.f1551U = this.f1551U;
            clone.f1552V = this.f1552V;
            clone.f1553W = this.f1553W;
            clone.f1554X = this.f1554X;
            clone.f1555Y = this.f1555Y;
            clone.f1556Z = this.f1556Z;
            clone.f1558a0 = this.f1558a0;
            clone.f1560b0 = this.f1560b0;
            clone.f1562c0 = this.f1562c0;
            clone.f1564d0 = this.f1564d0;
            clone.f1566e0 = this.f1566e0;
            clone.f1568f0 = this.f1568f0;
            clone.f1570g0 = this.f1570g0;
            clone.f1572h0 = this.f1572h0;
            clone.f1574i0 = this.f1574i0;
            clone.f1576j0 = this.f1576j0;
            clone.f1578k0 = this.f1578k0;
            clone.f1580l0 = this.f1580l0;
            clone.f1582m0 = this.f1582m0;
            clone.f1584n0 = this.f1584n0;
            clone.f1586o0 = this.f1586o0;
            clone.f1588p0 = this.f1588p0;
            clone.f1590q0 = this.f1590q0;
            clone.f1594s0 = this.f1594s0;
            clone.f1596t0 = this.f1596t0;
            int[] iArr = this.f1598u0;
            if (iArr != null) {
                clone.f1598u0 = Arrays.copyOf(iArr, iArr.length);
            }
            clone.f1602x = this.f1602x;
            clone.f1603y = this.f1603y;
            clone.f1604z = this.f1604z;
            clone.f1592r0 = this.f1592r0;
            return clone;
        }

        /* renamed from: g */
        public final void mo2185g(C0308b helper, int viewId, C0312d.C0313a param) {
            mo2184f(viewId, param);
            if (helper instanceof C0307a) {
                this.f1596t0 = 1;
                C0307a barrier = (C0307a) helper;
                this.f1594s0 = barrier.getType();
                this.f1598u0 = barrier.getReferencedIds();
            }
        }

        /* renamed from: f */
        public final void mo2184f(int viewId, C0312d.C0313a param) {
            mo2183e(viewId, param);
            this.f1551U = param.f1606m0;
            this.f1554X = param.f1609p0;
            this.f1555Y = param.f1610q0;
            this.f1556Z = param.f1611r0;
            this.f1558a0 = param.f1612s0;
            this.f1560b0 = param.f1613t0;
            this.f1562c0 = param.f1614u0;
            this.f1564d0 = param.f1615v0;
            this.f1566e0 = param.f1616w0;
            this.f1568f0 = param.f1617x0;
            this.f1570g0 = param.f1618y0;
            this.f1553W = param.f1608o0;
            this.f1552V = param.f1607n0;
        }

        /* renamed from: e */
        public final void mo2183e(int viewId, ConstraintLayout.C0820a param) {
            this.f1563d = viewId;
            this.f1571h = param.f3304d;
            this.f1573i = param.f3306e;
            this.f1575j = param.f3308f;
            this.f1577k = param.f3310g;
            this.f1579l = param.f3312h;
            this.f1581m = param.f3314i;
            this.f1583n = param.f3316j;
            this.f1585o = param.f3318k;
            this.f1587p = param.f3320l;
            this.f1589q = param.f3325p;
            this.f1591r = param.f3326q;
            this.f1593s = param.f3327r;
            this.f1595t = param.f3328s;
            this.f1597u = param.f3335z;
            this.f1599v = param.f3272A;
            this.f1601w = param.f3273B;
            this.f1602x = param.f3322m;
            this.f1603y = param.f3323n;
            this.f1604z = param.f3324o;
            this.f1531A = param.f3287P;
            this.f1532B = param.f3288Q;
            this.f1533C = param.f3289R;
            this.f1569g = param.f3302c;
            this.f1565e = param.f3298a;
            this.f1567f = param.f3300b;
            this.f1559b = param.width;
            this.f1561c = param.height;
            this.f1534D = param.leftMargin;
            this.f1535E = param.rightMargin;
            this.f1536F = param.topMargin;
            this.f1537G = param.bottomMargin;
            this.f1547Q = param.f3276E;
            this.f1548R = param.f3275D;
            this.f1550T = param.f3278G;
            this.f1549S = param.f3277F;
            boolean z = param.f3290S;
            this.f1572h0 = z;
            this.f1574i0 = param.f3291T;
            this.f1576j0 = param.f3279H;
            this.f1578k0 = param.f3280I;
            this.f1572h0 = z;
            this.f1580l0 = param.f3283L;
            this.f1582m0 = param.f3284M;
            this.f1584n0 = param.f3281J;
            this.f1586o0 = param.f3282K;
            this.f1588p0 = param.f3285N;
            this.f1590q0 = param.f3286O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f1538H = param.getMarginEnd();
                this.f1539I = param.getMarginStart();
            }
        }

        /* renamed from: c */
        public void mo2180c(ConstraintLayout.C0820a param) {
            param.f3304d = this.f1571h;
            param.f3306e = this.f1573i;
            param.f3308f = this.f1575j;
            param.f3310g = this.f1577k;
            param.f3312h = this.f1579l;
            param.f3314i = this.f1581m;
            param.f3316j = this.f1583n;
            param.f3318k = this.f1585o;
            param.f3320l = this.f1587p;
            param.f3325p = this.f1589q;
            param.f3326q = this.f1591r;
            param.f3327r = this.f1593s;
            param.f3328s = this.f1595t;
            param.leftMargin = this.f1534D;
            param.rightMargin = this.f1535E;
            param.topMargin = this.f1536F;
            param.bottomMargin = this.f1537G;
            param.f3333x = this.f1546P;
            param.f3334y = this.f1545O;
            param.f3335z = this.f1597u;
            param.f3272A = this.f1599v;
            param.f3322m = this.f1602x;
            param.f3323n = this.f1603y;
            param.f3324o = this.f1604z;
            param.f3273B = this.f1601w;
            param.f3287P = this.f1531A;
            param.f3288Q = this.f1532B;
            param.f3276E = this.f1547Q;
            param.f3275D = this.f1548R;
            param.f3278G = this.f1550T;
            param.f3277F = this.f1549S;
            param.f3290S = this.f1572h0;
            param.f3291T = this.f1574i0;
            param.f3279H = this.f1576j0;
            param.f3280I = this.f1578k0;
            param.f3283L = this.f1580l0;
            param.f3284M = this.f1582m0;
            param.f3281J = this.f1584n0;
            param.f3282K = this.f1586o0;
            param.f3285N = this.f1588p0;
            param.f3286O = this.f1590q0;
            param.f3289R = this.f1533C;
            param.f3302c = this.f1569g;
            param.f3298a = this.f1565e;
            param.f3300b = this.f1567f;
            param.width = this.f1559b;
            param.height = this.f1561c;
            if (Build.VERSION.SDK_INT >= 17) {
                param.setMarginStart(this.f1539I);
                param.setMarginEnd(this.f1538H);
            }
            param.mo4340a();
        }
    }

    /* renamed from: b */
    public void mo2175b(C0312d constraints) {
        int count = constraints.getChildCount();
        this.f1530a.clear();
        int i = 0;
        while (i < count) {
            View view = constraints.getChildAt(i);
            C0312d.C0313a param = (C0312d.C0313a) view.getLayoutParams();
            int id = view.getId();
            if (id != -1) {
                if (!this.f1530a.containsKey(Integer.valueOf(id))) {
                    this.f1530a.put(Integer.valueOf(id), new C0311b());
                }
                C0311b constraint = this.f1530a.get(Integer.valueOf(id));
                if (view instanceof C0308b) {
                    constraint.mo2185g((C0308b) view, id, param);
                }
                constraint.mo2184f(id, param);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo2174a(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f1530a.keySet());
        int i = 0;
        while (i < count) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (id != -1) {
                if (this.f1530a.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    C0311b constraint = this.f1530a.get(Integer.valueOf(id));
                    if (view instanceof C0307a) {
                        constraint.f1596t0 = 1;
                    }
                    int i2 = constraint.f1596t0;
                    if (i2 != -1 && i2 == 1) {
                        C0307a barrier = (C0307a) view;
                        barrier.setId(id);
                        barrier.setType(constraint.f1594s0);
                        barrier.setAllowsGoneWidget(constraint.f1592r0);
                        int[] iArr = constraint.f1598u0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = constraint.f1600v0;
                            if (str != null) {
                                int[] c = mo2176c(barrier, str);
                                constraint.f1598u0 = c;
                                barrier.setReferencedIds(c);
                            }
                        }
                    }
                    ConstraintLayout.C0820a param = (ConstraintLayout.C0820a) view.getLayoutParams();
                    constraint.mo2180c(param);
                    view.setLayoutParams(param);
                    view.setVisibility(constraint.f1540J);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 17) {
                        view.setAlpha(constraint.f1551U);
                        view.setRotation(constraint.f1554X);
                        view.setRotationX(constraint.f1555Y);
                        view.setRotationY(constraint.f1556Z);
                        view.setScaleX(constraint.f1558a0);
                        view.setScaleY(constraint.f1560b0);
                        if (!Float.isNaN(constraint.f1562c0)) {
                            view.setPivotX(constraint.f1562c0);
                        }
                        if (!Float.isNaN(constraint.f1564d0)) {
                            view.setPivotY(constraint.f1564d0);
                        }
                        view.setTranslationX(constraint.f1566e0);
                        view.setTranslationY(constraint.f1568f0);
                        if (i3 >= 21) {
                            view.setTranslationZ(constraint.f1570g0);
                            if (constraint.f1552V) {
                                view.setElevation(constraint.f1553W);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            C0311b constraint2 = this.f1530a.get(id2);
            int i4 = constraint2.f1596t0;
            if (i4 != -1 && i4 == 1) {
                C0307a barrier2 = new C0307a(constraintLayout.getContext());
                barrier2.setId(id2.intValue());
                int[] iArr2 = constraint2.f1598u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = constraint2.f1600v0;
                    if (str2 != null) {
                        int[] c2 = mo2176c(barrier2, str2);
                        constraint2.f1598u0 = c2;
                        barrier2.setReferencedIds(c2);
                    }
                }
                barrier2.setType(constraint2.f1594s0);
                ConstraintLayout.C0820a param2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2168f();
                constraint2.mo2180c(param2);
                constraintLayout.addView(barrier2, param2);
            }
            if (constraint2.f1557a) {
                C0314e g = new C0314e(constraintLayout.getContext());
                g.setId(id2.intValue());
                ConstraintLayout.C0820a param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.mo2180c(param3);
                constraintLayout.addView(g, param3);
            }
        }
    }

    /* renamed from: e */
    public void mo2178e(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    String document = parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    C0311b constraint = mo2177d(context, Xml.asAttributeSet(parser));
                    if (tagName.equalsIgnoreCase("Guideline")) {
                        constraint.f1557a = true;
                    }
                    this.f1530a.put(Integer.valueOf(constraint.f1563d), constraint);
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    public static int m1711f(TypedArray a, int index, int def) {
        int ret = a.getResourceId(index, def);
        if (ret == -1) {
            return a.getInt(index, -1);
        }
        return ret;
    }

    /* renamed from: d */
    public final C0311b mo2177d(Context context, AttributeSet attrs) {
        C0311b c = new C0311b();
        TypedArray a = context.obtainStyledAttributes(attrs, C0317h.f1704i0);
        mo2179g(c, a);
        a.recycle();
        return c;
    }

    /* renamed from: g */
    public final void mo2179g(C0311b c, TypedArray a) {
        int N = a.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            int i2 = f1529c.get(attr);
            switch (i2) {
                case 1:
                    c.f1587p = m1711f(a, attr, c.f1587p);
                    break;
                case 2:
                    c.f1537G = a.getDimensionPixelSize(attr, c.f1537G);
                    break;
                case 3:
                    c.f1585o = m1711f(a, attr, c.f1585o);
                    break;
                case 4:
                    c.f1583n = m1711f(a, attr, c.f1583n);
                    break;
                case 5:
                    c.f1601w = a.getString(attr);
                    break;
                case 6:
                    c.f1531A = a.getDimensionPixelOffset(attr, c.f1531A);
                    break;
                case 7:
                    c.f1532B = a.getDimensionPixelOffset(attr, c.f1532B);
                    break;
                case 8:
                    c.f1538H = a.getDimensionPixelSize(attr, c.f1538H);
                    break;
                case 9:
                    c.f1595t = m1711f(a, attr, c.f1595t);
                    break;
                case 10:
                    c.f1593s = m1711f(a, attr, c.f1593s);
                    break;
                case 11:
                    c.f1544N = a.getDimensionPixelSize(attr, c.f1544N);
                    break;
                case 12:
                    c.f1545O = a.getDimensionPixelSize(attr, c.f1545O);
                    break;
                case 13:
                    c.f1541K = a.getDimensionPixelSize(attr, c.f1541K);
                    break;
                case 14:
                    c.f1543M = a.getDimensionPixelSize(attr, c.f1543M);
                    break;
                case 15:
                    c.f1546P = a.getDimensionPixelSize(attr, c.f1546P);
                    break;
                case 16:
                    c.f1542L = a.getDimensionPixelSize(attr, c.f1542L);
                    break;
                case 17:
                    c.f1565e = a.getDimensionPixelOffset(attr, c.f1565e);
                    break;
                case 18:
                    c.f1567f = a.getDimensionPixelOffset(attr, c.f1567f);
                    break;
                case 19:
                    c.f1569g = a.getFloat(attr, c.f1569g);
                    break;
                case 20:
                    c.f1597u = a.getFloat(attr, c.f1597u);
                    break;
                case 21:
                    c.f1561c = a.getLayoutDimension(attr, c.f1561c);
                    break;
                case 22:
                    int i3 = a.getInt(attr, c.f1540J);
                    c.f1540J = i3;
                    c.f1540J = f1528b[i3];
                    break;
                case 23:
                    c.f1559b = a.getLayoutDimension(attr, c.f1559b);
                    break;
                case 24:
                    c.f1534D = a.getDimensionPixelSize(attr, c.f1534D);
                    break;
                case 25:
                    c.f1571h = m1711f(a, attr, c.f1571h);
                    break;
                case 26:
                    c.f1573i = m1711f(a, attr, c.f1573i);
                    break;
                case 27:
                    c.f1533C = a.getInt(attr, c.f1533C);
                    break;
                case 28:
                    c.f1535E = a.getDimensionPixelSize(attr, c.f1535E);
                    break;
                case 29:
                    c.f1575j = m1711f(a, attr, c.f1575j);
                    break;
                case 30:
                    c.f1577k = m1711f(a, attr, c.f1577k);
                    break;
                case 31:
                    c.f1539I = a.getDimensionPixelSize(attr, c.f1539I);
                    break;
                case 32:
                    c.f1589q = m1711f(a, attr, c.f1589q);
                    break;
                case 33:
                    c.f1591r = m1711f(a, attr, c.f1591r);
                    break;
                case 34:
                    c.f1536F = a.getDimensionPixelSize(attr, c.f1536F);
                    break;
                case 35:
                    c.f1581m = m1711f(a, attr, c.f1581m);
                    break;
                case 36:
                    c.f1579l = m1711f(a, attr, c.f1579l);
                    break;
                case 37:
                    c.f1599v = a.getFloat(attr, c.f1599v);
                    break;
                case 38:
                    c.f1563d = a.getResourceId(attr, c.f1563d);
                    break;
                case 39:
                    c.f1548R = a.getFloat(attr, c.f1548R);
                    break;
                case 40:
                    c.f1547Q = a.getFloat(attr, c.f1547Q);
                    break;
                case 41:
                    c.f1549S = a.getInt(attr, c.f1549S);
                    break;
                case 42:
                    c.f1550T = a.getInt(attr, c.f1550T);
                    break;
                case 43:
                    c.f1551U = a.getFloat(attr, c.f1551U);
                    break;
                case 44:
                    c.f1552V = true;
                    c.f1553W = a.getDimension(attr, c.f1553W);
                    break;
                case 45:
                    c.f1555Y = a.getFloat(attr, c.f1555Y);
                    break;
                case 46:
                    c.f1556Z = a.getFloat(attr, c.f1556Z);
                    break;
                case 47:
                    c.f1558a0 = a.getFloat(attr, c.f1558a0);
                    break;
                case 48:
                    c.f1560b0 = a.getFloat(attr, c.f1560b0);
                    break;
                case 49:
                    c.f1562c0 = a.getFloat(attr, c.f1562c0);
                    break;
                case 50:
                    c.f1564d0 = a.getFloat(attr, c.f1564d0);
                    break;
                case 51:
                    c.f1566e0 = a.getDimension(attr, c.f1566e0);
                    break;
                case 52:
                    c.f1568f0 = a.getDimension(attr, c.f1568f0);
                    break;
                case 53:
                    c.f1570g0 = a.getDimension(attr, c.f1570g0);
                    break;
                default:
                    switch (i2) {
                        case C0317h.f1714l1 /*60*/:
                            c.f1554X = a.getFloat(attr, c.f1554X);
                            break;
                        case C0317h.f1717m1 /*61*/:
                            c.f1602x = m1711f(a, attr, c.f1602x);
                            break;
                        case C0317h.f1720n1 /*62*/:
                            c.f1603y = a.getDimensionPixelSize(attr, c.f1603y);
                            break;
                        case C0317h.f1723o1 /*63*/:
                            c.f1604z = a.getFloat(attr, c.f1604z);
                            break;
                        default:
                            switch (i2) {
                                case C0317h.f1741u1 /*69*/:
                                    c.f1588p0 = a.getFloat(attr, 1.0f);
                                    break;
                                case C0317h.f1744v1 /*70*/:
                                    c.f1590q0 = a.getFloat(attr, 1.0f);
                                    break;
                                case C0317h.f1747w1 /*71*/:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case C0317h.f1750x1 /*72*/:
                                    c.f1594s0 = a.getInt(attr, c.f1594s0);
                                    break;
                                case C0317h.f1753y1 /*73*/:
                                    c.f1600v0 = a.getString(attr);
                                    break;
                                case C0317h.f1756z1 /*74*/:
                                    c.f1592r0 = a.getBoolean(attr, c.f1592r0);
                                    break;
                                case C0317h.f1624A1 /*75*/:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f1529c.get(attr));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f1529c.get(attr));
                                    break;
                            }
                    }
            }
        }
    }

    /* renamed from: c */
    public final int[] mo2176c(View view, String referenceIdString) {
        Object value;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] tags = new int[split.length];
        int count = 0;
        int i = 0;
        while (i < split.length) {
            String idString = split[i].trim();
            int tag = 0;
            try {
                tag = C0316g.class.getField(idString).getInt((Object) null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = context.getResources().getIdentifier(idString, "id", context.getPackageName());
            }
            if (tag == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) view.getParent()).mo4303c(0, idString)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            tags[count] = tag;
            i++;
            count++;
        }
        if (count != split.length) {
            return Arrays.copyOf(tags, count);
        }
        return tags;
    }
}
