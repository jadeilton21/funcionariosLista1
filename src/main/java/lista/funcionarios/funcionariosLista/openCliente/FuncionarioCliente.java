package lista.funcionarios.funcionariosLista.openCliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "",url = "")
public interface FuncionarioCliente {
    @GetMapping
    FuncionarioResponseList getFuncionario(){

    }

}
