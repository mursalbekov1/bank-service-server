package com.example.bankserviceserver.gatling;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;

public class Scenario {
    public static ScenarioBuilder usersScen = CoreDsl.scenario("get users scen")
            .exec(Steps.usersReq);
}
