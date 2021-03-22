package com.company;

/**
 * @autor: dma
 * El  15 de mar. de 2021.
  **/
public class Pizza {
    private String masa, tipoSalsa;
    private boolean relleno, salsa, cebolla, sinGluten, extraQueso, piña, champiñones, jamon;
    private int tamaño;
    static final int FAMILIAR = 1;
    static final int MEDIANA = 2;
    static final int PEQUEÑA = 3;

    public Pizza(String masa, String tipoSalsa, boolean relleno, boolean salsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon, int tamaño) {
        this.masa = masa;
        this.tipoSalsa = tipoSalsa;
        this.relleno = relleno;
        this.salsa = salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
        this.tamaño = tamaño;
    }

    public Pizza() {

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa +
                ", tipoSalsa='" + tipoSalsa +
                ", relleno=" + relleno +
                ", salsa=" + salsa +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                ", piña=" + piña +
                ", champiñones=" + champiñones +
                ", jamon=" + jamon +
                ", tamaño=" + tamaño;
    }


    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public String getMasa() {
        return masa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public boolean isJamon() {
        return jamon;
    }

    public int getFAMILIAR() {
        return FAMILIAR;
    }

    public int getMEDIANA() {
        return MEDIANA;
    }

    public int getPEQUEÑA() {
        return PEQUEÑA;
    }

}