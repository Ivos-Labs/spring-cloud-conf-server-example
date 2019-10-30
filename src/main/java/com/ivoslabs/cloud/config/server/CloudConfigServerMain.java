/**
 * 
 */
package com.ivoslabs.cloud.config.server;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

/**
 * cloud-config-server main class
 * 
 * @author imperezivan
 *
 */
@SpringBootApplication
@EnableConfigServer
@PropertySource("file:${app.root}/conf/application.properties")
public class CloudConfigServerMain {

    public static void main(String[] arguments) {
	if (System.getProperty("app.root") == null) {
	    System.setProperty("app.root", new File(".").getPath());
	}
	SpringApplication.run(CloudConfigServerMain.class);
    }

}
