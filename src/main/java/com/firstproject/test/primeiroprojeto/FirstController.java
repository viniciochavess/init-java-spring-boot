package com.firstproject.test.primeiroprojeto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




@RestController
@RequestMapping("/products")
public class FirstController {

    @GetMapping("")
    public String product(){
        
       
      
        return "Tipo do return GET";
    }
    
}
