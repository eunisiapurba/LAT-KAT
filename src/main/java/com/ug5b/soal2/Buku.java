package com.ug5b.soal2;

public class Buku {
    private String kode;
    static int nextNum;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;
    public Buku(String argJudul, String argPenulis, long argHarga, int argStok) {
        nextNum++;
        this.judul = argJudul;
        this.penulis = argPenulis;
        this.harga = (argHarga <= 0) ? 0 : argHarga;
        this.stok = (argStok <= 0) ? 0 : argStok;
        this.kode = generateKode();
    }

    private String generateKode() {
        int currentNum = nextNum;
        return "NV" + String.format("24510"+ currentNum);
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
