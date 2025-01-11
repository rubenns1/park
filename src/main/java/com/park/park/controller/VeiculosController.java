package com.park.park.controller;

import com.park.park.model.Veiculos;
import com.park.park.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VeiculosController {

    @Autowired
    private VeiculosRepository veiculosRepository;

    @RequestMapping("/formEstacionar")
    public String veiculosController(){
        return "formEstacionar";
    }

    @RequestMapping("/")
    public ModelAndView modelAndView(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Veiculos> veiculos = veiculosRepository.findAll();
        modelAndView.addObject("veiculo", veiculos);
        return modelAndView;
    }

    @RequestMapping(value = "/formEstacionar", method = RequestMethod.POST)
    public String veiculosController(Veiculos veiculos) {
        veiculosRepository.save(veiculos);
        return "redirect:/";
    }
}
