package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Tecnico;

import java.util.List;

public interface ITecnicosService {
    List<Tecnico> obtenerTecnicosPorEspecialidad(String especialidad);

}
