package lista.funcionarios.funcionariosLista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FuncionariosListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionariosListaApplication.class, args);
	}




}
