package com.example.bankserviceserver.gatling;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class GatlingTest extends Simulation {
    private final HttpProtocolBuilder httpProtocolBuilder = HttpDsl.http.baseUrl("http://localhost:8086");

    public GatlingTest () {
        this.setUp(
                Scenario.usersScen.injectOpen(
                        CoreDsl.constantUsersPerSec(30).during(5)
                )
        ).protocols(httpProtocolBuilder);
    }
}

