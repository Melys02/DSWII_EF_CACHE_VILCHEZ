package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Contacto;

import java.util.List;

public interface IContactoService {

    List<Contacto> obtenerContactosPorNumero(int nroContacto);

}
