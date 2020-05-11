package com.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class CasoControllador {
    @Autowired
    CasoService casoService;


    @GetMapping("/aggregate/{anno}/allowDiskUse/{flag}")
    public void agregate(@PathVariable("anno") int anno,@PathVariable("flag") String flag) throws IOException {
        casoService.agregate(anno,flag);
    }


    @GetMapping("/insertar/{hasta}")
    public void insertar(@PathVariable("hasta") int hasta) throws IOException {
        casoService.insertar(hasta);
    }
}
