package de.ronios.binaerrechner;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class BinZahl {
    @NotBlank
    @Pattern(regexp = "[0-1]{4}", message = "Sie dürfen nur eine 4 stellige Zahl eingeben, die nur aus nullen und einsen besteht.")
    private String zahlInBin;

    public String getZahlInBin() {
        return zahlInBin;
    }

    public void setZahlInBin(String zahlInBin) {
        this.zahlInBin = zahlInBin;
    }
}
