package de.ronios.binaerrechner;

import javax.validation.constraints.NotEmpty;

public class BinZahl {
    @NotEmpty
    private String zahlInBin;

    public String getZahlInBin() {
        return zahlInBin;
    }

    public void setZahlInBin(String zahlInBin) {
        this.zahlInBin = zahlInBin;
    }
}
