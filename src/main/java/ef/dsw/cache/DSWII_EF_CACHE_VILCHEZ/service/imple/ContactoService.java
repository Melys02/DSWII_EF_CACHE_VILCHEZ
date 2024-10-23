package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.imple;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Contacto;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository.ContactoRepository;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.IContactoService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContactoService implements IContactoService {

    private final ContactoRepository contactoRepository;
    @Cacheable(value="contactosNumero" ,key= "#numero")
    @Override
    public List<Contacto> obtenerContactosPorNumero(int nroContacto) {
        return contactoRepository.obtenerContactosPorNumero(nroContacto);
    }
}
