package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Repositories;

import MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139.Entities.ProveedoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepositories  extends JpaRepository<ProveedoresEntity, Long> {
}
