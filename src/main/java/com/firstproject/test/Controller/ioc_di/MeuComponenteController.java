package com.firstproject.test.Controller.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ioc_di")
public class MeuComponenteController {
    
    @Autowired
    MeuComponente meuComponente;

    @GetMapping
    public String RetornandoComponent(){
        return meuComponente.GetTest();
    }
}
