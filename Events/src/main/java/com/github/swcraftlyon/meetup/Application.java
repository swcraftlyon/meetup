package com.github.swcraftlyon.meetup;

import org.slf4j.Logger;
import ratpack.server.RatpackServer;

import static ratpack.jackson.Jackson.json;

public class Application {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(Application.class);

    public static void main(String... args) throws Exception {
        RatpackServer ratpackServer = RatpackServer.start(server -> server
          .handlers(chain -> chain
            .get("events", ctx -> ctx.render(json(new Event("Dépassons le kata"))))
          )
        );
        logger.info("Events are on " +
          ratpackServer.getScheme() +
          "://" + ratpackServer.getBindHost() +
          ":" + ratpackServer.getBindPort() +
          "/events");
    }
}
