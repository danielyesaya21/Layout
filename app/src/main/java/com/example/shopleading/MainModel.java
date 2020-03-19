package com.example.shopleading;

public class MainModel {
    Integer langLogo;
    String langSatu;
    String langDua;
    String langTiga;
    String langEmpat;
    String langLima;


    public MainModel(Integer langLogo, String langSatu,String langDua, String langTiga, String langEmpat,String langLima ){

        this.langLogo = langLogo;
        this.langSatu = langSatu;
        this.langDua = langDua;
        this.langTiga  = langTiga;
        this.langEmpat = langEmpat;
        this.langLima = langLima;


    }


    public Integer getLangLogo() {
        return langLogo;
    }

    public String getLangSatu() {
        return langSatu;
    }

    public String getLangDua() {
        return langDua;
    }

    public String getLangTiga() {
        return langTiga;
    }

    public String getLangEmpat() {
        return langEmpat;
    }

    public String getLangLima() {
        return langLima;
    }

}


