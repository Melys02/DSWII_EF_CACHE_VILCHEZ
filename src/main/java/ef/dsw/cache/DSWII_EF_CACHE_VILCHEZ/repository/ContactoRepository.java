package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

    @Query(value = "SELECT * FROM Contacto WHERE nroContacto = :nroContacto",
            nativeQuery = true)
    List<Contacto> obtenerContactosPorNumero(@Param("nroContacto") int nroContacto);
}
