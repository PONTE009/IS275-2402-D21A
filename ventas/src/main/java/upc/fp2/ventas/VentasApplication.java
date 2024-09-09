package upc.fp2.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import upc.fp2.ventas.entity.Cliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class VentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentasApplication.class, args);

	/*	List<Cliente> listaCliente = new ArrayList<>();

		Cliente objCliente = new Cliente();
		objCliente.setClienteId(1L);
		objCliente.setPrimerNombre("Williams");
		objCliente.setSegundoNombre("Sandro");
		objCliente.setApellidoPaterno("Ponte");
		objCliente.setApellidoMaterno("Ramirez");
		objCliente.setCorreo("ponteramirezsandro@gmail.com");

		Cliente objCliente1 = new Cliente();
		objCliente1.setClienteId(1L);
		objCliente1.setPrimerNombre("Julio");
		objCliente1.setSegundoNombre("César");
		objCliente1.setApellidoPaterno("Lopez");
		objCliente1.setApellidoMaterno("Aguilar");
		objCliente1.setCorreo("juliocesaraguilar@gmail.com");

		Cliente objCliente2 = new Cliente();
		objCliente2.setClienteId(1L);
		objCliente2.setPrimerNombre("Julio");
		objCliente2.setSegundoNombre("César");
		objCliente2.setApellidoPaterno("Lopez");
		objCliente2.setApellidoMaterno("Aguilar");
		objCliente2.setCorreo("juliocesaraguilar@gmail.com");

		listaCliente.add(objCliente);
		listaCliente.add(objCliente1);
		listaCliente.add(objCliente2);

		for (Cliente item: listaCliente){
			System.out.println("Imprimiendo elemento: " + item.getPrimerNombre());
		}

		Iterator<Cliente> iterador = listaCliente.iterator();
		while (iterador.hasNext()) {
			Cliente item = iterador.next();
			System.out.println(item);
			if (item.getPrimerNombre().equals("Julio")) {
				iterador.remove();
			}
		}*/
	}

}
