package upc.fp2.ventas;

import upc.fp2.ventas.entity.Cliente;
import upc.fp2.ventas.entity.Vendedor;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {


        try{
             System.out.println("Ingreso a la sección de try");
//             throw new Exception("Esto es una excepción controlada");
             throw new ArrayIndexOutOfBoundsException("Esto es una excepción controlada");

        }
       /* catch (Exception ex){
            System.out.println("Ingreso a la sección de catch");
        }*/
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Ingreso a la sección de catch ArrayIndexOutOfBoundsException");
        }
        catch (NullPointerException ex){
            System.out.println("Ingreso a la sección de catch NullPointerException");
        }
        finally {
            System.out.println("Ingreso a la sección de finally");
        }









    /*    LocalDateTime fechaActual = LocalDateTime.now();

        Vendedor objVendor = new Vendedor();

        objVendor.setPrimerNombre("Williams");
        objVendor.setSegundoNombre("Sandro");
        objVendor.setApellidoPaterno("Ponte");
        objVendor.setApellidoMaterno("Ramirez");
        objVendor.setCorreo("ponteramirezsandro@gmail.com");
        objVendor.setActivo(true);
        objVendor.setFechaRegistro(fechaActual);

        objVendor.setVendedorId(1L);
        objVendor.setUsuario("pciswpon");
        objVendor.setClave("123456");

        Vendedor objVendor2 = new Vendedor(1L,"123456","pciswpon",1L,"Sandro", "Williams", "Ponte", "Ramirez", "ponteramirezsandro@gmail.com", true,fechaActual);


        Cliente objCliente = new Cliente();
        objCliente.setPrimerNombre("Ermer");
        objCliente.setSegundoNombre("Edwin");
        objCliente.setApellidoPaterno("Melendez");
        objCliente.setApellidoMaterno("Espinoza");
        objCliente.setCorreo("Ermer@gmail.com");
        objCliente.setActivo(true);
        objCliente.setFechaRegistro(fechaActual);

        objCliente.setClienteId(1L);
        objCliente.setDireccion("pcisermer");*/

    }
}
