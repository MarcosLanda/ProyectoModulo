package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "TBPROVIDER" )
@Getter @Setter @ToString @EqualsAndHashCode
public class ProveedoresEntity {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_proveedores")
    @SequenceGenerator(name = "seq_proveedores", sequenceName = "seq_preveedores", allocationSize = 1)
    private Long id;

    @Column(name = "NOMBRE")
    private String name;

    @Column(name = "NUMERO")
    private String phone;

    @Column(name = "DIRECCION")
    private String address;

    @Column(name = "CORREO")
    private String email;

    @Column(name = "CODIGO")
    private String code;

    @Column(name = "ESTATUS")
    private String status;

    @Column(name = "COMENTARIOS")
    private String Comments;
}
