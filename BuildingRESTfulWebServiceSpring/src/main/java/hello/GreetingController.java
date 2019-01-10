package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


// co robi tutuj atomic ma to cos wspolego ze wspolbeznoscia ?

// https://docs.oracle.com/javase/tutorial/essential/concurrency/atomicvars.html

@RestController
public class GreetingController {

private static final String template ="Hello, %s!";
private static final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")

    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) {

        return  new Greeting(counter.incrementAndGet(),
        String.format(template, name));
    }


}
