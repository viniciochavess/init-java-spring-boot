package com.firstproject.test.Controller;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping("/list")
    public String ProductsList(){
        return "Retornando uma lista de produto";
    }

    @GetMapping("/{id}")
    public String ProductsPathParams(@PathVariable String id){
        return("selecinou o produto do id:" +id);

    }

    @GetMapping("")
        public String ProductsQueryParans(@RequestParam Map<String, String> ParamsAll){
            return("Todos os Query Params: " + ParamsAll.entrySet());
        }

    @PostMapping("")
        public String ProductsBodyParams(@RequestBody Map<String,String> ParamsAll){
            return ("Request body:" + ParamsAll.entrySet());
        }

    @PostMapping("/header")
        public String ProductsHeaderParams(@RequestHeader Map<String,String> ParamsAll){
            return ("Request Header: " + ParamsAll.entrySet());
        }

    @GetMapping("/response")
        public ResponseEntity<Object> ProductResponseEntity(){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("acessou");
        }
    
}
