package jc.myprojects.gui;

import jc.myprojects.WicketApplication;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest
{
   private WicketTester tester;

   @Before
   public void setUp(){
      tester = new WicketTester(new WicketApplication());
   }

   @Test
   public void homepageRendersSuccessfully(){
      //start and render the test page
      tester.startPage(HomePage.class);
      //assert rendered page class
      tester.assertRenderedPage(HomePage.class);
      tester.assertLabel("helloMessage", "Hello WicketWorld!");
   }
}
