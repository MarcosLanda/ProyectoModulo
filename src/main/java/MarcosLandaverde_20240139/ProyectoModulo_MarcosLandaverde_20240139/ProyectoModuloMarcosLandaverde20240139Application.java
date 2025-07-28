package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoModuloMarcosLandaverde20240139Application {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(entry ->
					System.setProperty(entry.getKey(), entry.getValue())
				);
		SpringApplication.run(ProyectoModuloMarcosLandaverde20240139Application.class, args);
	}

}
