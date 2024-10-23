package ef.dsw.cache.DSWII_EF_CACHE_VILCHEZ.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContacto;
    private String descContacto;
    private int nroContacto;
    private String refContacto;

}