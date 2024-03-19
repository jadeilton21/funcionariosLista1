package lista.funcionarios.funcionariosLista.controllers;


import lista.funcionarios.funcionariosLista.doMain.Funcionario;
import lista.funcionarios.funcionariosLista.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioControllers {


    private final FuncionarioService funcionarioService;



    public ResponseEntity<List<Funcionario>> getFuncionario(){

        List<Funcionario> funcionarios =this.funcionarioService.getFuncionarioFromLibriary();
        return ResponseEntity.ok().body(funcionarios);
    }


}
