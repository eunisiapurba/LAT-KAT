package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo;

    public SmartCard() {
        this.nama = "";
        this.saldo = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSaldo(long saldo) {
        if (saldo >= 0) { // Mengubah kondisi menjadi >= 0 agar saldo tidak pernah negatif
            this.saldo = saldo;
        }
    }

    public long getSaldo() {
        return saldo;
    }

    public void topUp(Voucher vch) {
        String kodeVoucher = vch.getKode();
        if (kodeVoucher.startsWith("VC") && kodeVoucher.length() > 2) { // Menggunakan startsWith untuk pengecekan awalan kode voucher
            try {
                long nominal = Long.parseLong(kodeVoucher.substring(2));
                saldo += nominal;
                System.out.println("Top up berhasil. Saldo sekarang: " + saldo);
            } catch (NumberFormatException e) {
                System.out.println("Top up gagal. Kode voucher tidak valid.");
            }
        } else {
            System.out.println("Top up gagal. Kode voucher tidak valid.");
        }
    }
}
