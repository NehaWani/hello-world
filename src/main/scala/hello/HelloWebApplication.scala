package hello

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author Neha Wani
 * @since 1.0
 */

@EnableAutoConfiguration
object HelloWebApplication {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloConfig]);
  }
}