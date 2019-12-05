package ms.authentication

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("ms.authentication")
                .mainClass(Application.javaClass)
                .start()
    }
}