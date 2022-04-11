package de.ronios.binaerrechner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @Autowired
    private ConvertNum convertNum;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("binZahl", new BinZahl());
        return "index";
    }
    @PostMapping("/result")
    public String index(@ModelAttribute BinZahl binZahl, Model model){
        model.addAttribute("binZahl", convertNum.binToDec(binZahl.getZahlInBin()));
        return "result";
    }
}
