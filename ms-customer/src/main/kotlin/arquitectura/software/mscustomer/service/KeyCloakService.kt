package arquitectura.software.mscustomer.service

import org.springframework.cloud.openfeign.FeignClient


@FeignClient("token", url = "http://localhost:8080/realms/software/protocol/openid-connect/token")
interface KeyCloakService {

}