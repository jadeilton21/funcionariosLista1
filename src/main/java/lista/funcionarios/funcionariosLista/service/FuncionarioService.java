package lista.funcionarios.funcionariosLista.service;

import lista.funcionarios.funcionariosLista.doMain.Funcionario;
import lista.funcionarios.funcionariosLista.openCliente.FuncionarioCliente;
import lista.funcionarios.funcionariosLista.response.FuncionarioResponseList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioCliente funcionarioCliente;


    public FuncionarioService(FuncionarioCliente funcionarioCliente){

        this.funcionarioCliente = funcionarioCliente;

    }



    public List<Funcionario> getFuncionarioFromLibriary() {

        FuncionarioResponseList response = this.funcionarioCliente.getFuncionario();

        return response.getFuncionarioList();
    }
}
