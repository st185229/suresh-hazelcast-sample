package ncr.hazelcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@RestController
@EnableCaching
public class HazelcastApplication {
    public static void main(String[] args) {
        SpringApplication.run(HazelcastApplication.class, args);
    }
}
