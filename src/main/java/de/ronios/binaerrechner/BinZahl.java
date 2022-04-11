package de.ronios.binaerrechner;

import org.springframework.stereotype.Service;

@Service
public class BinZahl {
    private String zahlInBin;

    public String getZahlInBin() {
        return zahlInBin;
    }

    public void setZahlInBin(String zahlInBin) {
        this.zahlInBin = zahlInBin;
    }
}
