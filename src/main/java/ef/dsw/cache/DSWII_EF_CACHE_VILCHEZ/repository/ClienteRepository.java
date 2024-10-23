package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository {
    @Query(value = "SELECT * FROM Cliente WHERE nombre = :nombre",
            nativeQuery = true)
    List<Cliente> obtenerClientesPorNombre(@Param("nombre") String nombre);
}
