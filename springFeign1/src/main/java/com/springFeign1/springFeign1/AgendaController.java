package com.springFeign1.springFeign1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class AgendaController {

        @GetMapping
    public Contato retornaContato(){
        return Contato.builder()
                .id(1L)
                .nome("Luciana")
                .telefone("999-999")
                .build();
    }
}
