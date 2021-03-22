package com.company;

/**
 * @autor: dma
 * El  15 de mar. de 2021.
 **/

/**
 * Clase
 */
public class Builder {
    Pizza _pizza;

    public Pizza build(){
        return this._pizza;
    }


    /**
     * metodos
     */
    public Builder() {
        _pizza= new Pizza();
    }



    public Builder setTipoMasa (String masa){
        _pizza.setMasa(masa);
        return this;
    }

    public Builder setTamaño(int tamaño){
        _pizza.setTamaño(tamaño);
        return this;
    }
    public Builder setTipoSalsa (String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }
    public Builder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }
    public Builder setSalsa (boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public Builder setCebolla (boolean cebolla){
        _pizza.setRelleno(cebolla);
        return this;
    }
    public Builder setSinGluten (boolean gluten){
        _pizza.setSinGluten(gluten);
        return this;
    }
    public Builder setExtraQueso (boolean queso){
        _pizza.setExtraQueso(queso);
        return this;
    }
    public Builder setPiña (boolean piña){
        _pizza.setPiña(piña);
        return this;
    }
    public Builder setChampiñones (boolean champis){
        _pizza.setChampiñones(champis);
        return this;
    }
    public Builder setJamon (boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
}