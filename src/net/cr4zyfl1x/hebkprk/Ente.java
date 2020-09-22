package net.cr4zyfl1x.hebkprk;

public class Ente {
    int ver = 0;
    int anw = 0;

    public void ente(int pAnzahl) {
        anw++;
        for (int j = 1; j <= pAnzahl; j++) {
            ver++;
            System.out.println("Ente");
            anw++;
        }
        ver += 1;
        anw += 2;


        // Nicht mitgezählt
        System.out.println("Es waren " + anw + " Anweisungen");
        System.out.println("Es waren " + ver + " Vergleiche");
    }
}
