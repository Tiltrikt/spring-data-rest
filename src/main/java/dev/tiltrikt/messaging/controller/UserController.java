//package dev.tiltrikt.messaging.controller;
//
//import dev.tiltrikt.messaging.model.User;
//import dev.tiltrikt.messaging.repository.UserRepository;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import lombok.extern.slf4j.Slf4j;
//import org.jetbrains.annotations.NotNull;
//import org.springframework.data.rest.core.AggregateReference;
//import org.springframework.data.rest.webmvc.RepositoryRestController;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.swing.text.html.parser.Entity;
//
//@Slf4j
//@RepositoryRestController
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//public class UserController {
//
//  @NotNull UserRepository userRepository;
//
//  @GetMapping("v1/register/email/check")
//  ResponseEntity<?> getByGmail() {
//    log.info("getByGmail");
//    return ResponseEntity.ok(null);
//  }
//}
