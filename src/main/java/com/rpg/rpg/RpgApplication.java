package com.rpg.rpg;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class RpgApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RpgApplication.class, args); 
        }
        
        @EventListener({ApplicationReadyEvent.class})
        void applicationReadyEvent() {
            System.out.println("Application started ... launching browser now");
            goBrowseApp("http://localhost:8080/#/home");
        }

        public static void goBrowseApp(String url) {
            if(Desktop.isDesktopSupported()){
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            }else{
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        @Configuration
        @EnableSwagger2
        public class SwaggerConfig {                                    
            @Bean
            public Docket api() { 
                return new Docket(DocumentationType.SWAGGER_2)  
                  .select()                                  
                  .apis(RequestHandlerSelectors.any())              
                  .paths(PathSelectors.any())                          
                  .build();                                           
            }
        }
        
}
