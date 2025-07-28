package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Services;

import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Entities.ProveedoresEntity;
import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Models.ProveedoresDTO;
import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Repositories.ProveedoresRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProveedoresServices {

    @Autowired
     private ProveedoresRepositories ProveedoresRepository;

    public List<ProveedoresDTO> getAllProveedores() {
        List<ProveedoresEntity> proveedores = ProveedoresRepository.findAll();
        return proveedores.stream()
                .map(this::convertirAProveedoresDTO)
                .collect(Collectors.toList());
    }

    private ProveedoresDTO convertirAProveedoresDTO(ProveedoresEntity proveedores){
        ProveedoresDTO dto = new ProveedoresDTO();
        dto.setId(proveedores.getId());
        dto.setName(proveedores.getName());
        dto.setCode(proveedores.getCode());
        dto.setEmail(proveedores.getEmail());
        dto.setAddress(proveedores.getAddress());
        dto.setComments(proveedores.getComments());
        dto.setPhone(proveedores.getPhone());
        dto.setStatus(proveedores.getStatus());
        dto.setStatus(proveedores.getStatus());
        return dto;
    }


    public List<ProveedoresDTO> getallProveedores() {
        //Retornamos la lista de ProveedoresDTO
        return List.of();
    }
}
