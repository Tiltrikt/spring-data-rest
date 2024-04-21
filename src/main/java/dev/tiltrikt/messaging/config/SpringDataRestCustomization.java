package dev.tiltrikt.messaging.config;

import dev.tiltrikt.messaging.model.User;
import dev.tiltrikt.messaging.repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;



@Component
public class SpringDataRestCustomization implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration,
                                                   CorsRegistry cors) {

    repositoryRestConfiguration.exposeIdsFor(User.class);

    repositoryRestConfiguration.getExposureConfiguration().forDomainType(User.class)
        .withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PATCH, HttpMethod.PUT));
  }
}
