package WSIZ.KLASY;

import java.time.LocalDate;

public class Budynek {
    public Budynek(String nazwa, int rokb, int liczbapieter) {
        this.nazwa = nazwa;
        this.rokb = rokb;
        this.liczbapieter = liczbapieter;
    }

    String nazwa;
    int rokb;
    int liczbapieter;
    public void wysw(){
        System.out.println("Budynek nazywa się : "+nazwa + " , jego rok budowy to : "+rokb+" oraz posiada następujaca liczbe pieter : "+liczbapieter);
    }

}
