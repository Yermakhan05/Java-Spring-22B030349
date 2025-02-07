package kz.spring.sis2.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task4")
public class SISController {
    private final SessionService sessionService;
    private final PrototypeService prototypeService;
    private final RequestService requestService;
    private final SingletonService singletonService;


    public SISController(SessionService sessionService, PrototypeService prototypeService, RequestService requestService, SingletonService singletonService) {
        this.sessionService = sessionService;
        this.prototypeService = prototypeService;
        this.requestService = requestService;
        this.singletonService = singletonService;
    }

    @GetMapping("/session")
    public String session() {
        return sessionService.getCreatedAt();
    }

    @GetMapping("prototype")
    public String prototype() {
        return prototypeService.getCreatedAt();
    }
    @GetMapping("/request")
    public String request() {
        return requestService.getCreatedAt();
    }
    @GetMapping("/singleton")
    public String singleton() {
        return singletonService.getCreatedAt();
    }
}
