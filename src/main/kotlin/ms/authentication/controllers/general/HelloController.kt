package ms.authentication.controllers.general

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/general/hello")
class HelloController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"
    }
}