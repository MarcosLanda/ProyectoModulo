package MarcosLandaverde_20240139.ProyectoModulo_MarcosLandaverde_20240139;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProyectoModuloMarcosLandaverde20240139Application.class);
	}

}
