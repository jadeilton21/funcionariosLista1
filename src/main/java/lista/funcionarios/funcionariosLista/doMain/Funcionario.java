package lista.funcionarios.funcionariosLista.doMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Funcionario {
 

    private String nome;
    private String sobreNome;
    private String email;
    private String idade;
    private String funcao;
    private String cidade;

}
