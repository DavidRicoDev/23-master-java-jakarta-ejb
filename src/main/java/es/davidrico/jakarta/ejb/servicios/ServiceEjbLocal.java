package es.davidrico.jakarta.ejb.servicios;

import jakarta.ejb.Local;
import es.davidrico.jakarta.ejb.modelos.Producto;

import java.util.List;

@Local
public interface ServiceEjbLocal {
    String saludar(String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}
