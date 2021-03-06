package io.xream.x7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import x7.EnableTransactionManagementReadable;
import x7.EnableX7Repository;

/**
 *
 * Demo
 *
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableTransactionManagementReadable
@EnableX7Repository
public class App {
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class);
    }
}
