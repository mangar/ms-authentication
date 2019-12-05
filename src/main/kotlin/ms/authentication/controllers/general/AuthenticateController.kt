package ms.authentication.controllers.general

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/general/authenticate")
class AuthenticateController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Authenticate"
    }

    @Get("/logout")
    @Produces(MediaType.TEXT_PLAIN)
    fun logout(): String {
        return "Logout"
    }


}