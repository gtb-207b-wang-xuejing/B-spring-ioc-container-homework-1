package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

//    private final GreetingService greetingService;

    @Autowired
    private ObjectFactory<GreetingService> prototypeBeanObjectFactory;

/*    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

 */

    @GetMapping("/greet")
    public String greet() {
        return prototypeBeanObjectFactory.getObject().sayHi();
        //return greetingService.sayHi();
    }

}
