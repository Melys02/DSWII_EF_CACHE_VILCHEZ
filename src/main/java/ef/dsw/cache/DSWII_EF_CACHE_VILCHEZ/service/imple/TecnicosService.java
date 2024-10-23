package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.imple;

import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Cliente;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model.Tecnico;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.repository.TecnicoRepository;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.IClienteService;
import ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.service.ITecnicosService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TecnicosService implements ITecnicosService {
    private final TecnicoRepository tecnicoRepository;
    @Cacheable(value="tecnicoEspe" ,key= "#especialidad")

    @Override
    public List<Tecnico> obtenerTecnicosPorEspecialidad(String especialidad) {
        return tecnicoRepository.obtenerTecnicosPorEspecialidad(especialidad);
    }


}
