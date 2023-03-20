package persistencia;

import domain.Cliente;
import java.util.List;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    
    public void crear(Cliente cliente){
        clienteJpa.create(cliente);
    }
    
    public Cliente encontrarCliente (Cliente cliente){
        return clienteJpa.findCliente(cliente.getIdCliente());
    }
    
    public List<Cliente> listarClientes(){
        return clienteJpa.findClienteEntities();
    }
    
    public void actualizarCliente(Cliente cliente) throws Exception{
        clienteJpa.edit(cliente);
    }
    
    public void eliminarCliente(Cliente cliente) throws NonexistentEntityException{
        clienteJpa.destroy(cliente.getIdCliente());
    }
    
}
