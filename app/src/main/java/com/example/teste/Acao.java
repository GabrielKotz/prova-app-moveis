package com.example.teste;

public class Acao {
    private double lpa;
    private double pl;
    private double roe;
    private double vpa;
    private double pvp;

    public Acao(double lpa, double pl, double roe, double vpa, double pvp) {
        this.lpa = lpa;
        this.pl = pl;
        this.roe = roe;
        this.vpa = vpa;
        this.pvp = pvp;
    }

    public double getLpa() {
        return lpa;
    }

    public void setLpa(double lpa) {
        this.lpa = lpa;
    }

    public double getPl() {
        return pl;
    }

    public void setPl(double pl) {
        this.pl = pl;
    }

    public double getRoe() {
        return roe;
    }

    public void setRoe(double roe) {
        this.roe = roe;
    }

    public double getVpa() {
        return vpa;
    }

    public void setVpa(double vpa) {
        this.vpa = vpa;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
