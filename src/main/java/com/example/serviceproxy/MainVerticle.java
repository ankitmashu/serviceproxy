package com.example.serviceproxy;

import com.example.serviceproxy.proxy.ProxyInterface;
import com.example.serviceproxy.proxy.ProxyVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    /*vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(8888, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 8888");
      } else {
        startPromise.fail(http.cause());
      }
    });*/

    Vertx vertx1 = Vertx.vertx();
    vertx1.deployVerticle(new ProxyVerticle(), res->{
      if(res.succeeded()){
        ProxyInterface proxyInterface = ProxyInterface.createProxy(vertx1,"com-example-serviceproxy-proxy");
        proxyInterface.checking();
        proxyInterface.abc();
        System.out.println("Hua Success");
      }
    });

  }
}
