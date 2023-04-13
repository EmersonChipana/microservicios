package arquitectura.software.mscustomer.service


import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("ms-account")
interface AccountService {

    @GetMapping("/account/test")
    fun getTest(): String

    @GetMapping("/account/list")
    fun getAccounts(): List<String>

}