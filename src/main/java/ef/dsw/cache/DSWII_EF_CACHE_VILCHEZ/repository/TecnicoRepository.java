package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
    @Query(value = "SELECT * FROM Tecnico WHERE especialidad = :especialidad",
            nativeQuery = true)
    List<Tecnico> obtenerTecnicosPorEspecialidad(@Param("especialidad") String especialidad);
}
