package jc.myprojects;

import jc.myprojects.gui.HomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
@ComponentScan
public class WicketApplication extends WebApplication {

   public static void main(String[] args) {
      SpringApplication.run(WicketApplication.class, args);
   }

   @Override
   public Class<? extends WebPage> getHomePage() {
      return HomePage.class;
   }

}
