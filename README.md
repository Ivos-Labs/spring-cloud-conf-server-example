
**Configuration**

 - conf directory
 
   `conf` this directory must be located in the application root path, contains the application.properties and the `props` 
   directory that contains all client properties  

 - Application Properties
   
   `conf/application.properties`
   
   this file contains the port, username, and a password of the spring cloud config server 
 
 - Properties directory
 
   `conf/props`
 
   this directory contains all client properties
 
   example  `conf/props/application-spring_cloud_conf_web_example`


**To run using an IDE**

   All configuration files are included in the directory src/test/resources/root/ that emulates a root path

 - Starter class
   
   `src/test/java/com.ivoslabs.cloud.config.server.Starter`
   
   this class emulates the root path using the directory src/test/resources/root/ and runs the application
 

**Build**

 -  

 ```
   mvn clean package -P dev
 ```
 
 ```
   
   `after build maven will creat the folder target\springCloudConfigServer with the following elements`


 ```
	springCloudConfigServer
	├───src
	└───target
	    └───springCloudConfigServer
	        ├───conf
	        │   ├──props
	        │   │  ├──application-example.properties
	        │   │  ...
	        │   │
	        │   └──application.properties
	        │   
	        └───spring-cloud-config-server.jar
 ```


 
