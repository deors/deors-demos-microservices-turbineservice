package deors.demos.microservices.turbineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream
public class TurbineserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineserviceApplication.class, args);
    }
}
