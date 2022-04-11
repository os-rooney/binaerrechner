package de.ronios.binaerrechner;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;

@Service
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
