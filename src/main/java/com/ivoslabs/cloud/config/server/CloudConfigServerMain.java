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
            // if the 'app.root' system property is null, 
            // the application will set the execution directory as the app.root,
            // so in this directory Spring will try to find the application properties
            System.setProperty("app.root", new File(".").getPath());
        }
        
        SpringApplication.run(CloudConfigServerMain.class);
    }

}
