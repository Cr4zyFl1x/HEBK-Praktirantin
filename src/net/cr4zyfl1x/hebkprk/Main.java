package net.cr4zyfl1x.hebkprk;

public class Main {

    public static void main(String[] args) {

        Ente e = new Ente();

        // Aufwand (Zeit):
        // 10 Enten: 1 ms
        // 100 Enten: 3 ms
        // 10000 Enten: 47 ms
        // 1000000 Enten: 2069 ms

        // Aufwand (Vergl. & Anweisungen)
        // 1 Ente: 6 (4 Anweisungen, 2 Vergleiche)
        // 5 Enten: 14 (8 Anweisungn, 6 Vergleiche)
        // 10 Enten: 24 (13 Anweisungen, 11 Vergleiche)
        // 100 Enten: 204 (103 Anweisungen, 101 Vergleiche)
        // n Enten:

        e.ente(100);
    }
}
