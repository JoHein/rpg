package com.rpg.rpg;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

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
}
