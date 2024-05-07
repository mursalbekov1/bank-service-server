package com.example.bankserviceserver.gatling;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.http.HttpDsl;

public class Steps {
    public static ChainBuilder usersReq = CoreDsl.exec(
            HttpDsl.http("account")
                    .get("/listUser")
                    .check(HttpDsl.status().is(200))
    );
}