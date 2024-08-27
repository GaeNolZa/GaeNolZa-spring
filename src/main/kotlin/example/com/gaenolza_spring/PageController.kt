package example.com.gaenolza_spring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PageController {

    @GetMapping("/")
    fun redirectToHome(): String {
        return "redirect:/home"  // "/"로 접근 시 "/home"으로 리다이렉션
    }

    @GetMapping("/home")
    fun home(): String {
        return "home.html"  // 명시적으로 home.html 반환
    }

    @GetMapping("/about")
    fun about(): String {
        return "about.html"  // 명시적으로 about.html 반환
    }

    @GetMapping("/services")
    fun services(): String {
        return "services.html"  // 명시적으로 services.html 반환
    }

    @GetMapping("/contact")
    fun contact(): String {
        return "contact.html"  // 명시적으로 contact.html 반환
    }
}