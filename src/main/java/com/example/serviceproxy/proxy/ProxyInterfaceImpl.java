package com.example.serviceproxy.proxy;

public class ProxyInterfaceImpl implements ProxyInterface{
  @Override
  public void checking(){
    System.out.println("Checking");
  }

  @Override
  public void abc() {
    System.out.println("hi");
  }
}
