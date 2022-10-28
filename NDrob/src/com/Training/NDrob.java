package com.Training;

public class NDrob {
    private int numer, denom;

    public NDrob() {
        numer = 1;
        denom = 1;
    }

    public NDrob(int numer, int denom) {
        this.numer = numer;
        if (denom != 0)
            this.denom = denom;
        else
            this.denom = 1;
    }

    @Override
    public String toString() {
        return numer + "/" + denom;
    }
    public void printDrob() {
        System.out.println(numer + "/" + denom);
    }
    public void multyOnKoeff(int koeff) {
        numer *= koeff;
        if (koeff != 0)
            denom *= koeff;
    }
    public NDrob multy(NDrob secondFactor) {
        NDrob result = new NDrob();
        result.numer = numer * secondFactor.numer;
        result.denom = denom * secondFactor.denom;
        return result;
    }
    public NDrob del(NDrob secondFactor) {
        NDrob result = new NDrob();
        result.numer = numer * secondFactor.denom;
        result.denom = denom * secondFactor.numer;
        return result;
    }
    public NDrob sum(NDrob secondFactor) {
        NDrob result = new NDrob();
        result.numer = numer + secondFactor.numer;
        result.denom = denom;
        return result;
    }
    public NDrob sub(NDrob secondFactor) {
        NDrob result = new NDrob();
        result.numer = numer - secondFactor.numer;
        result.denom = denom;
        return result;
    }
}
