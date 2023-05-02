package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.LivroRepository;

@Controller
public class LivroController {

    @Autowired
    @RequestMapping("/livro")
    public String list(){
        return "WEB-INF/list.jsp";
    }
    
}
