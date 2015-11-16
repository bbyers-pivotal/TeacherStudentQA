package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HomeController {

    @RequestMapping('/')
    def home() {
        return 'home'
    }

    @RequestMapping('/kill')
    def killIt() {
    	System.exit(0)
    }
}
