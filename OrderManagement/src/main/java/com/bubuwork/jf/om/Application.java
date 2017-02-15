package com.bubuwork.jf.om;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{
  
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).run(args);
  }
}
