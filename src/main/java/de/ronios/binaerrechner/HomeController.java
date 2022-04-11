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
    private BinZahl binZahl;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("binZahl", binZahl);
        return "index";
    }
    @PostMapping("/result")
    public String index(@ModelAttribute BinZahl binZahl, Model model){
        model.addAttribute("binZahl", binZahl);
        return "result";
    }
}
