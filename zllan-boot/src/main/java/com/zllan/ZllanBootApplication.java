package com.zllan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZllanBootApplication {
	public static void main(String[] args) {
		ServletWebServerApplicationContext run = (ServletWebServerApplicationContext)SpringApplication.run(ZllanBootApplication.class, args);
		TomcatWebServer webServer = (TomcatWebServer)run.getWebServer();
		String address = webServer.getTomcat().getServer().getAddress();
		int port = webServer.getTomcat().getServer().getPort();
	}
}
