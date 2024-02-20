package com.ug5b.soal1;

public class Voucher {
    private String kode;
    private long nominal;

    public void setNominal(long nominal) {
        if (nominal <= 0) {
            this.kode = "VC";
        } else {
            this.kode = "VC" + nominal;
        }
        this.nominal = nominal;
    }

    public String getKode() {
        return kode;
    }

    public void buatVoucher() {
        System.out.println("Voucher berhasil dibuat. Kode voucher: " + kode);
    }

    public int getNominal() {
        return 0;
    }
}