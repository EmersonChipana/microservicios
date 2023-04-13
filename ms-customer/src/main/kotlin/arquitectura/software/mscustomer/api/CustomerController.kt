package arquitectura.software.mscustomer.api

import arquitectura.software.mscustomer.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController @Autowired constructor(private val accountService: AccountService) {

    @Value("\${server.port}")
    lateinit var port:String

    @GetMapping("/test")
    fun getTest(): String{
        val result = accountService.getTest()
        return "Server port: $port -> $result"
    }

    @GetMapping("/list")
    fun getList(): List<String>{
        return listOf("Emerson", "Daniel", "Pedro") + accountService.getAccounts()
    }

}