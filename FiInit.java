package com.xworkz.fi.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FiInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
  @Override
  protected Class<?>[] getRootConfigClasses(){
	  System.out.println("running getRootConfigClasses ");
	  Class<?>[] ref= {FiConfiguration.class};
	  System.out.println("getRootConfigClass" + Arrays.toString(ref));
	  return ref;
  }
  @Override
  protected Class<?>[]getServletConfigClasses(){
	  System.out.println("running getServletConfigClasses");
	  Class<?>[] ref1 = {FiConfiguration.class};
	  System.out.println("getServletConfigClass" + Arrays.toString(ref1));
	  return ref1;
  }
  
 
  
	  
  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
      System.out.println("running configureDefaultSevletHandling");
      configurer.enable();
  }
@Override
protected String[] getServletMappings() {
	System.out.println("running getServletConfigClasses");
	  String[] ref2 = {"/"};
	  System.out.println("getServletConfigClass" + Arrays.toString(ref2));
	  return ref2;

	
}
  

}
