package zetcodepostgresthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zetcodepostgresthymeleaf.bean.City;
import zetcodepostgresthymeleaf.service.ICityService;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model){

        List<City> cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";

    }

}
