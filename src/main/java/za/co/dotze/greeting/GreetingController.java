package za.co.dotze.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author - Christiaan Dotze <christiaan@dotze.co.za>
 * @Since - 04 Oct 2019
 */
@RestController
public class GreetingController {
    private final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/", method = GET)
    public String defaultPage() {
        return "/greeting";
    }

    @RequestMapping(value = "/greeting", method = GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "People") final String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
