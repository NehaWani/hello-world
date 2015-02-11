package hello

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.{RequestMapping,RestController}

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author sithu
 * @since 1.0
 * modifiedBy NehaWani
 * modifiedDate 02-10-2015
 */
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}

@RestController
class HelloWorld
{
	@RequestMapping(Array{"/"})
	def sayHello():String =
	{
		"Hello World from Neha!!!"
	}
}