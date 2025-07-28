package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Controller;

import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Models.ProveedoresDTO;
import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Services.ProveedoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ProveedoresController {

    @Autowired
    private ProveedoresServices acceso;

    //En esta linea de codigo hacemos que llamar a la lista de DTO Proveedores, para que luego se retornada a un getAllProveedores

    public List<ProveedoresDTO> datosProveedores() {
        return acceso.getallProveedores();
    }
}
