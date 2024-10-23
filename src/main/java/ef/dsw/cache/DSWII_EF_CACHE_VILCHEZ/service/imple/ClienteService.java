package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.imple;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Cliente;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository.ClienteRepository;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository.ContactoRepository;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    @Cacheable(value="clienteNombre" ,key= "#nombre")
    @Override
    public List<Cliente> obtenerClientesPorNombre(String nombre) {
        return clienteRepository.obtenerClientesPorNombre(nombre);
    }
}
