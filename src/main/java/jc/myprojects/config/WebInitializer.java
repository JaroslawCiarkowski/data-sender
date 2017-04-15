package jc.myprojects.config;

import org.apache.wicket.protocol.http.WicketFilter;
import org.apache.wicket.spring.SpringWebApplicationFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class WebInitializer implements ServletContextInitializer {

   private static final String APPLICATION_BEAN_PARAM = "applicationBean";

   private static final String WICKET_FILTER_PARAM = "applicationBean";

   private static final String APPLICATION_BEAN_NAME = "wicketApplication";

   private static final String MAPPING = "/*";

   @Override
   public void onStartup(ServletContext sc) throws ServletException {
      FilterRegistration filter = sc.addFilter(WICKET_FILTER_PARAM, WicketFilter.class);
      filter.setInitParameter(WicketFilter.APP_FACT_PARAM, SpringWebApplicationFactory.class.getName());
      filter.setInitParameter(APPLICATION_BEAN_PARAM, APPLICATION_BEAN_NAME);
      filter.setInitParameter(WicketFilter.FILTER_MAPPING_PARAM, MAPPING);
      filter.addMappingForUrlPatterns(null, false, MAPPING);
   }

}
