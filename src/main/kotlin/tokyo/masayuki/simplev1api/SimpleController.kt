package tokyo.masayuki.simplev1api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api")
class SimpleController {
    @GetMapping("/test")
    fun getSimple(): SimpleResponse {
        return SimpleResponse("test response")
    }
}