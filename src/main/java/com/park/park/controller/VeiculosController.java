package com.park.park.controller;

import com.park.park.model.Veiculos;
import com.park.park.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;

import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class VeiculosController {

    @Autowired
    private VeiculosRepository veiculosRepository;

    @RequestMapping("/vagas")
    public String veiculosController(){
        return "vagas";
    }

    @RequestMapping("/")
    public ModelAndView modelAndView() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Veiculos> veiculos = veiculosRepository.findAll();
        modelAndView.addObject("veiculo", veiculos);
        return modelAndView;
    }

    @RequestMapping(value = "/vagas", method = RequestMethod.POST)
    public String veiculosController(Veiculos veiculos) {
        veiculosRepository.save(veiculos);
        return "redirect:/vagas";
    }
}
