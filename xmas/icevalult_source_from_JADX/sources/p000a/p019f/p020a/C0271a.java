package p000a.p019f.p020a;

import java.util.Arrays;
import p000a.p019f.p020a.C0280i;

/* renamed from: a.f.a.a */
public class C0271a {

    /* renamed from: a */
    public int f1254a = 0;

    /* renamed from: b */
    public final C0272b f1255b;

    /* renamed from: c */
    public final C0273c f1256c;

    /* renamed from: d */
    public int f1257d = 8;

    /* renamed from: e */
    public C0280i f1258e = null;

    /* renamed from: f */
    public int[] f1259f = new int[8];

    /* renamed from: g */
    public int[] f1260g = new int[8];

    /* renamed from: h */
    public float[] f1261h = new float[8];

    /* renamed from: i */
    public int f1262i = -1;

    /* renamed from: j */
    public int f1263j = -1;

    /* renamed from: k */
    public boolean f1264k = false;

    public C0271a(C0272b arrayRow, C0273c cache) {
        this.f1255b = arrayRow;
        this.f1256c = cache;
    }

    /* renamed from: l */
    public final void mo1921l(C0280i variable, float value) {
        if (value == 0.0f) {
            mo1922m(variable, true);
        } else if (this.f1262i == -1) {
            this.f1262i = 0;
            this.f1261h[0] = value;
            this.f1259f[0] = variable.f1321b;
            this.f1260g[0] = -1;
            variable.f1329j++;
            variable.mo1986a(this.f1255b);
            this.f1254a++;
            if (!this.f1264k) {
                int i = this.f1263j + 1;
                this.f1263j = i;
                int[] iArr = this.f1259f;
                if (i >= iArr.length) {
                    this.f1264k = true;
                    this.f1263j = iArr.length - 1;
                }
            }
        } else {
            int current = this.f1262i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f1254a) {
                int[] iArr2 = this.f1259f;
                int i2 = iArr2[current];
                int i3 = variable.f1321b;
                if (i2 == i3) {
                    this.f1261h[current] = value;
                    return;
                }
                if (iArr2[current] < i3) {
                    previous = current;
                }
                current = this.f1260g[current];
                counter++;
            }
            int i4 = this.f1263j;
            int availableIndice = i4 + 1;
            if (this.f1264k) {
                int[] iArr3 = this.f1259f;
                if (iArr3[i4] == -1) {
                    availableIndice = this.f1263j;
                } else {
                    availableIndice = iArr3.length;
                }
            }
            int[] iArr4 = this.f1259f;
            if (availableIndice >= iArr4.length && this.f1254a < iArr4.length) {
                int i5 = 0;
                while (true) {
                    int[] iArr5 = this.f1259f;
                    if (i5 >= iArr5.length) {
                        break;
                    } else if (iArr5[i5] == -1) {
                        availableIndice = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            int[] iArr6 = this.f1259f;
            if (availableIndice >= iArr6.length) {
                availableIndice = iArr6.length;
                int i6 = this.f1257d * 2;
                this.f1257d = i6;
                this.f1264k = false;
                this.f1263j = availableIndice - 1;
                this.f1261h = Arrays.copyOf(this.f1261h, i6);
                this.f1259f = Arrays.copyOf(this.f1259f, this.f1257d);
                this.f1260g = Arrays.copyOf(this.f1260g, this.f1257d);
            }
            this.f1259f[availableIndice] = variable.f1321b;
            this.f1261h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr7 = this.f1260g;
                iArr7[availableIndice] = iArr7[previous];
                iArr7[previous] = availableIndice;
            } else {
                this.f1260g[availableIndice] = this.f1262i;
                this.f1262i = availableIndice;
            }
            variable.f1329j++;
            variable.mo1986a(this.f1255b);
            int i7 = this.f1254a + 1;
            this.f1254a = i7;
            if (!this.f1264k) {
                this.f1263j++;
            }
            int[] iArr8 = this.f1259f;
            if (i7 >= iArr8.length) {
                this.f1264k = true;
            }
            if (this.f1263j >= iArr8.length) {
                this.f1264k = true;
                this.f1263j = iArr8.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final void mo1910a(C0280i variable, float value, boolean removeFromDefinition) {
        if (value != 0.0f) {
            if (this.f1262i == -1) {
                this.f1262i = 0;
                this.f1261h[0] = value;
                this.f1259f[0] = variable.f1321b;
                this.f1260g[0] = -1;
                variable.f1329j++;
                variable.mo1986a(this.f1255b);
                this.f1254a++;
                if (!this.f1264k) {
                    int i = this.f1263j + 1;
                    this.f1263j = i;
                    int[] iArr = this.f1259f;
                    if (i >= iArr.length) {
                        this.f1264k = true;
                        this.f1263j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int current = this.f1262i;
            int previous = -1;
            int counter = 0;
            while (current != -1 && counter < this.f1254a) {
                int[] iArr2 = this.f1259f;
                int idx = iArr2[current];
                int i2 = variable.f1321b;
                if (idx == i2) {
                    float[] fArr = this.f1261h;
                    fArr[current] = fArr[current] + value;
                    if (fArr[current] == 0.0f) {
                        if (current == this.f1262i) {
                            this.f1262i = this.f1260g[current];
                        } else {
                            int[] iArr3 = this.f1260g;
                            iArr3[previous] = iArr3[current];
                        }
                        if (removeFromDefinition) {
                            variable.mo1987c(this.f1255b);
                        }
                        if (this.f1264k) {
                            this.f1263j = current;
                        }
                        variable.f1329j--;
                        this.f1254a--;
                        return;
                    }
                    return;
                }
                if (iArr2[current] < i2) {
                    previous = current;
                }
                current = this.f1260g[current];
                counter++;
            }
            int i3 = this.f1263j;
            int availableIndice = i3 + 1;
            if (this.f1264k) {
                int[] iArr4 = this.f1259f;
                if (iArr4[i3] == -1) {
                    availableIndice = this.f1263j;
                } else {
                    availableIndice = iArr4.length;
                }
            }
            int[] iArr5 = this.f1259f;
            if (availableIndice >= iArr5.length && this.f1254a < iArr5.length) {
                int i4 = 0;
                while (true) {
                    int[] iArr6 = this.f1259f;
                    if (i4 >= iArr6.length) {
                        break;
                    } else if (iArr6[i4] == -1) {
                        availableIndice = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            int[] iArr7 = this.f1259f;
            if (availableIndice >= iArr7.length) {
                availableIndice = iArr7.length;
                int i5 = this.f1257d * 2;
                this.f1257d = i5;
                this.f1264k = false;
                this.f1263j = availableIndice - 1;
                this.f1261h = Arrays.copyOf(this.f1261h, i5);
                this.f1259f = Arrays.copyOf(this.f1259f, this.f1257d);
                this.f1260g = Arrays.copyOf(this.f1260g, this.f1257d);
            }
            this.f1259f[availableIndice] = variable.f1321b;
            this.f1261h[availableIndice] = value;
            if (previous != -1) {
                int[] iArr8 = this.f1260g;
                iArr8[availableIndice] = iArr8[previous];
                iArr8[previous] = availableIndice;
            } else {
                this.f1260g[availableIndice] = this.f1262i;
                this.f1262i = availableIndice;
            }
            variable.f1329j++;
            variable.mo1986a(this.f1255b);
            this.f1254a++;
            if (!this.f1264k) {
                this.f1263j++;
            }
            int i6 = this.f1263j;
            int[] iArr9 = this.f1259f;
            if (i6 >= iArr9.length) {
                this.f1264k = true;
                this.f1263j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: m */
    public final float mo1922m(C0280i variable, boolean removeFromDefinition) {
        if (this.f1258e == variable) {
            this.f1258e = null;
        }
        if (this.f1262i == -1) {
            return 0.0f;
        }
        int current = this.f1262i;
        int previous = -1;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            if (this.f1259f[current] == variable.f1321b) {
                if (current == this.f1262i) {
                    this.f1262i = this.f1260g[current];
                } else {
                    int[] iArr = this.f1260g;
                    iArr[previous] = iArr[current];
                }
                if (removeFromDefinition) {
                    variable.mo1987c(this.f1255b);
                }
                variable.f1329j--;
                this.f1254a--;
                this.f1259f[current] = -1;
                if (this.f1264k) {
                    this.f1263j = current;
                }
                return this.f1261h[current];
            }
            previous = current;
            current = this.f1260g[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void mo1912c() {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            C0280i variable = this.f1256c.f1272c[this.f1259f[current]];
            if (variable != null) {
                variable.mo1987c(this.f1255b);
            }
            current = this.f1260g[current];
            counter++;
        }
        this.f1262i = -1;
        this.f1263j = -1;
        this.f1264k = false;
        this.f1254a = 0;
    }

    /* renamed from: d */
    public final boolean mo1913d(C0280i variable) {
        if (this.f1262i == -1) {
            return false;
        }
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            if (this.f1259f[current] == variable.f1321b) {
                return true;
            }
            current = this.f1260g[current];
            counter++;
        }
        return false;
    }

    /* renamed from: j */
    public void mo1919j() {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            float[] fArr = this.f1261h;
            fArr[current] = fArr[current] * -1.0f;
            current = this.f1260g[current];
            counter++;
        }
    }

    /* renamed from: e */
    public void mo1914e(float amount) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            float[] fArr = this.f1261h;
            fArr[current] = fArr[current] / amount;
            current = this.f1260g[current];
            counter++;
        }
    }

    /* renamed from: k */
    public final boolean mo1920k(C0280i variable, C0275e system) {
        return variable.f1329j <= 1;
    }

    /* renamed from: b */
    public C0280i mo1911b(C0275e system) {
        float f;
        C0275e eVar = system;
        C0280i restrictedCandidate = null;
        C0280i unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            float[] fArr = this.f1261h;
            float amount = fArr[current];
            C0280i variable = this.f1256c.f1272c[this.f1259f[current]];
            if (amount < 0.0f) {
                if (amount > (-0.001f)) {
                    fArr[current] = 0.0f;
                    amount = 0.0f;
                    variable.mo1987c(this.f1255b);
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
            } else if (amount < 0.001f) {
                f = 0.0f;
                fArr[current] = 0.0f;
                amount = 0.0f;
                variable.mo1987c(this.f1255b);
            } else {
                f = 0.0f;
            }
            if (amount != f) {
                if (variable.f1326g == C0280i.C0281a.UNRESTRICTED) {
                    if (unrestrictedCandidate == null) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = mo1920k(variable, eVar);
                    } else if (unrestrictedCandidateAmount > amount) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = mo1920k(variable, eVar);
                    } else if (!unrestrictedCandidateIsNew && mo1920k(variable, eVar)) {
                        unrestrictedCandidate = variable;
                        unrestrictedCandidateAmount = amount;
                        unrestrictedCandidateIsNew = true;
                    }
                } else if (unrestrictedCandidate == null && amount < 0.0f) {
                    if (restrictedCandidate == null) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = mo1920k(variable, eVar);
                    } else if (restrictedCandidateAmount > amount) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = mo1920k(variable, eVar);
                    } else if (!restrictedCandidateIsNew && mo1920k(variable, eVar)) {
                        restrictedCandidate = variable;
                        restrictedCandidateAmount = amount;
                        restrictedCandidateIsNew = true;
                    }
                }
            }
            current = this.f1260g[current];
            counter++;
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    /* renamed from: n */
    public final void mo1923n(C0272b self, C0272b definition, boolean removeFromDefinition) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            int i = this.f1259f[current];
            C0280i iVar = definition.f1265a;
            if (i == iVar.f1321b) {
                float value = this.f1261h[current];
                mo1922m(iVar, removeFromDefinition);
                C0271a definitionVariables = definition.f1268d;
                int definitionCurrent = definitionVariables.f1262i;
                int definitionCounter = 0;
                while (definitionCurrent != -1 && definitionCounter < definitionVariables.f1254a) {
                    mo1910a(this.f1256c.f1272c[definitionVariables.f1259f[definitionCurrent]], definitionVariables.f1261h[definitionCurrent] * value, removeFromDefinition);
                    definitionCurrent = definitionVariables.f1260g[definitionCurrent];
                    definitionCounter++;
                }
                self.f1266b += definition.f1266b * value;
                if (removeFromDefinition) {
                    definition.f1265a.mo1987c(self);
                }
                current = this.f1262i;
                counter = 0;
            } else {
                current = this.f1260g[current];
                counter++;
            }
        }
    }

    /* renamed from: o */
    public void mo1924o(C0272b self, C0272b[] rows) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            C0280i variable = this.f1256c.f1272c[this.f1259f[current]];
            if (variable.f1322c != -1) {
                float value = this.f1261h[current];
                mo1922m(variable, true);
                C0272b definition = rows[variable.f1322c];
                if (!definition.f1269e) {
                    C0271a definitionVariables = definition.f1268d;
                    int definitionCurrent = definitionVariables.f1262i;
                    int definitionCounter = 0;
                    while (definitionCurrent != -1 && definitionCounter < definitionVariables.f1254a) {
                        mo1910a(this.f1256c.f1272c[definitionVariables.f1259f[definitionCurrent]], definitionVariables.f1261h[definitionCurrent] * value, true);
                        definitionCurrent = definitionVariables.f1260g[definitionCurrent];
                        definitionCounter++;
                    }
                }
                self.f1266b += definition.f1266b * value;
                definition.f1265a.mo1987c(self);
                current = this.f1262i;
                counter = 0;
            } else {
                current = this.f1260g[current];
                counter++;
            }
        }
    }

    /* renamed from: g */
    public C0280i mo1916g(boolean[] avoid, C0280i exclude) {
        C0280i.C0281a aVar;
        int current = this.f1262i;
        int counter = 0;
        C0280i pivot = null;
        float value = 0.0f;
        while (current != -1 && counter < this.f1254a) {
            float[] fArr = this.f1261h;
            if (fArr[current] < 0.0f) {
                C0280i v = this.f1256c.f1272c[this.f1259f[current]];
                if ((avoid == null || !avoid[v.f1321b]) && v != exclude && ((aVar = v.f1326g) == C0280i.C0281a.SLACK || aVar == C0280i.C0281a.ERROR)) {
                    float currentValue = fArr[current];
                    if (currentValue < value) {
                        value = currentValue;
                        pivot = v;
                    }
                }
            }
            current = this.f1260g[current];
            counter++;
        }
        return pivot;
    }

    /* renamed from: h */
    public final C0280i mo1917h(int index) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            if (counter == index) {
                return this.f1256c.f1272c[this.f1259f[current]];
            }
            current = this.f1260g[current];
            counter++;
        }
        return null;
    }

    /* renamed from: i */
    public final float mo1918i(int index) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            if (counter == index) {
                return this.f1261h[current];
            }
            current = this.f1260g[current];
            counter++;
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final float mo1915f(C0280i v) {
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            if (this.f1259f[current] == v.f1321b) {
                return this.f1261h[current];
            }
            current = this.f1260g[current];
            counter++;
        }
        return 0.0f;
    }

    public String toString() {
        String result = "";
        int current = this.f1262i;
        int counter = 0;
        while (current != -1 && counter < this.f1254a) {
            result = ((result + " -> ") + this.f1261h[current] + " : ") + this.f1256c.f1272c[this.f1259f[current]];
            current = this.f1260g[current];
            counter++;
        }
        return result;
    }
}
