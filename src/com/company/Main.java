package com.company;


/**
 * @autor: dma
 */

public class Main {

    private Main() {
    }

    public static void main(String[] args) {
/*
    Pizza margarita = new Pizza();
    margarita.setCebolla(true);
    margarita.setChampiñones(true);
    margarita.setExtraQueso(true);
    margarita.setMasa("Fina");
    margarita.setJamon(true);
    margarita.setPiña(true);
    margarita.setSinGluten(false);
    margarita.setRelleno(false);
    margarita.setTamaño(Pizza.FAMILIAR);
    }
    Pizza hawaiana = new Pizza("Masa pan","Tomate",true,true,false,true,true,false,true,true,Pizza.MEDIANA);

 */
    Pizza base = new Builder().setTipoMasa("Pan")
                .setTamaño(2)
                .build();
    Pizza hawaiana = new Builder().setTipoMasa("fina")
                .setTamaño(Pizza.FAMILIAR)
                .setCebolla(false)
                .setChampiñones(true)
                .setExtraQueso(true)
                .setPiña(true)
                .setJamon(true)
                .build();

        System.out.println(base);
        System.out.println(hawaiana);
    }


}