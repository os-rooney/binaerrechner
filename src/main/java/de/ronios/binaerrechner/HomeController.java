package de.ronios.binaerrechner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    private final ConvertNum convertNum;

    @Autowired
    HomeController(ConvertNum convertNum){
        this.convertNum = convertNum;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("binZahl", new BinZahl());
        return "index";
    }
    @PostMapping("/")
    public String index(@Valid @ModelAttribute BinZahl binZahl, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "index";
        }
        model.addAttribute("binZahl", convertNum.binToDec(binZahl.getZahlInBin()));
        return "result";
    }
}
