package dev.tiltrikt.messaging.repository;

import dev.tiltrikt.messaging.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;
import java.util.UUID;

@RepositoryRestResource(path = "v1")
public interface UserRepository extends Repository<User, UUID> {

  @NotNull User save(@NotNull User entity);

  @NotNull Optional<User> findById(@NotNull UUID id);
}
