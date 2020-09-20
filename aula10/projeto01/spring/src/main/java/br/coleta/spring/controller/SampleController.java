package br.coleta.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exemplo")
public class SampleController {


    @GetMapping("/hello")
    public ResponseEntity <String> getHello()
    {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/version")
    public ResponseEntity <String> getVersao()
    {
        return ResponseEntity.ok("Versão 0.0.1");
    }

    
}
