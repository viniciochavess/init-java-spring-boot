package com.firstproject.test.Controller.ioc_di;


import org.springframework.stereotype.Service;

@Service
public class MeuComponente {
    public String GetTest(){
        return("Retornando GetTestComponent");
    }
}
