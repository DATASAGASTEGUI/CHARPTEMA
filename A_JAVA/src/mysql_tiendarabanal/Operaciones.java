package mysql_tiendarabanal;

import java.util.List;

 
public interface Operaciones {
    
     public List<Cliente> getArrayListCliente();        //Read
     public boolean insertarCliente(Cliente cliente);   //Create
     public byte existeCliente(Cliente cliente);        //Read
     public boolean eliminarCliente(Cliente cliente);    //Delete
     public boolean actualizarCliente(Cliente cliente);  //Update
     public double obtenerPrecioMaximo();               //Si un error en la sentencia debería devolver -1              //
     public List<Integer> obtenerArrayListCodigoCliente();
     public Cliente buscarCliente(int idCliente);
}
