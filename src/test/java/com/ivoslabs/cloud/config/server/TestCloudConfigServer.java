/**
 * 
 */
package com.ivoslabs.cloud.config.server;

import java.net.URISyntaxException;

/**
 *
 * @since 1.0.0
 * @author imperezivan
 *
 */
public class TestCloudConfigServer {

    public static void main(String[] args) {
        try {
            // emulate root path with resources
            System.setProperty("app.root", Thread.currentThread().getContextClassLoader().getResource("root/").toURI().getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        
        
        CloudConfigServerMain.main(null);
        
    }
}
