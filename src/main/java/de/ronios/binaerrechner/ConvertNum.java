package de.ronios.binaerrechner;

import org.springframework.stereotype.Service;

@Service
public class ConvertNum {
    public int binToDec(String bin){
        return Integer.parseInt(bin, 2);
    }
}
