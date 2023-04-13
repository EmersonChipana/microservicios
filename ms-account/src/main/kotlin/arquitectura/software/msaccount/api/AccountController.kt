package arquitectura.software.msaccount.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController {
    @Value("\${server.port}")
    lateinit var port:String

    @GetMapping("/test")
    fun getTest(): String{
        return "Server port: $port"
    }

    @GetMapping("/list")
    fun getAccounts(): List<String>{
        return listOf("asd4q4waq", "489asd5q4", "976645asd")
    }
}