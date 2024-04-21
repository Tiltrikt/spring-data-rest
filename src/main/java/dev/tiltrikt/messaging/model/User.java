package dev.tiltrikt.messaging.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@Table(name = "users")
@NoArgsConstructor(force = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class User {

  @Id
  @NotNull
  @GeneratedValue
  UUID id;

  @NotNull
  String userInfo;
}
