package lista.funcionarios.funcionariosLista.response;

import lista.funcionarios.funcionariosLista.doMain.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionarioResponseList {

    private List<Funcionario> funcionarioList;



}
