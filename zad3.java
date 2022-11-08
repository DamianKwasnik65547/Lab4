package WSIZ.KLASY;

public class zad3 {
    String rodzaj,gatunek;
    int liczba2x,x;

public zad3 klon(){
    zad3 klon =new zad3();
    klon.rodzaj=rodzaj;
    klon.gatunek=gatunek;
    klon.liczba2x=liczba2x;
    klon.x=x;
    return klon;
}
}
