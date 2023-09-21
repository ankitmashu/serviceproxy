package com.example.serviceproxy.proxy;

import io.vertx.core.AbstractVerticle;
import io.vertx.serviceproxy.ServiceBinder;

public class ProxyVerticle extends AbstractVerticle {


  @Override
  public void start() throws Exception {
    ProxyInterface proxyInterface = new ProxyInterfaceImpl();
    new ServiceBinder(vertx).setAddress("com-example-serviceproxy-proxy").register(ProxyInterface.class,proxyInterface);
  }

  @Override
  public void stop() throws Exception {
    super.stop();
  }
}
