package eu.noelvaes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

   @Test
   public final void testSayHello() {
      HelloWorld hello = new HelloWorld();
      String answer = hello.sayHello();
      assertEquals("Hello World",answer);
   }
}
