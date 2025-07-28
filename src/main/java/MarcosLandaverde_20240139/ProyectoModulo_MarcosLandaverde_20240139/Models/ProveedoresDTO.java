package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class ProveedoresDTO {


    private Long id;

    @NotNull(message = "El nombre es obligatorio")
    private String name;
    @Size(min = 8, message = "El numero debe debe contener 9 caracteres")
    private String phone;
    private String address;
    private String email;
    private String code;
    private String status;
    private String Comments;

}
