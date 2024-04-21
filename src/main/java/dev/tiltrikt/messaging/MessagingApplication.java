package dev.tiltrikt.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
    "dev.tiltrikt.messaging",
})
public class MessagingApplication {

  public static void main(String[] args) {
    SpringApplication.run(MessagingApplication.class, args);
  }
}
