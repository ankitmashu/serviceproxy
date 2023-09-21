package com.example.serviceproxy.proxy;

import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Vertx;

@VertxGen
@ProxyGen
public interface ProxyInterface {
  @GenIgnore
  static ProxyInterface createProxy(Vertx vertx, String address){
    return new ProxyInterfaceVertxEBProxy(vertx,address);
  }
  void checking();
  void abc();
}
