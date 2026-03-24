package org.example.springtiente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @GetMapping("/currency")
    public String getCurrency(@RequestParam(name = "usd",defaultValue = "0") String usd, Model model) {
            int vnd = Integer.parseInt(usd) * 27000;
            model.addAttribute("vnd", vnd);
        return "index";

    }
}
