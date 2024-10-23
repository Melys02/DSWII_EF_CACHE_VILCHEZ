package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> obtenerClientesPorNombre(String nombre);
}
