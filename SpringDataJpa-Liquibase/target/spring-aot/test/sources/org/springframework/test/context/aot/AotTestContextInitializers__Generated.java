package org.springframework.test.context.aot;

import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import me.erano.com.AppTest__TestContext001_ApplicationContextInitializer;
import me.erano.com.MySQLIntegrationTest__TestContext002_ApplicationContextInitializer;
import me.erano.com.SpringbootJpaTestSlice__TestContext003_ApplicationContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("me.erano.com.AppTest", () -> new AppTest__TestContext001_ApplicationContextInitializer());
    map.put("me.erano.com.MySQLIntegrationTest", () -> new MySQLIntegrationTest__TestContext002_ApplicationContextInitializer());
    map.put("me.erano.com.SpringbootJpaTestSlice", () -> new SpringbootJpaTestSlice__TestContext003_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("me.erano.com.AppTest", AppTest__TestContext001_ApplicationContextInitializer.class);
    map.put("me.erano.com.MySQLIntegrationTest", MySQLIntegrationTest__TestContext002_ApplicationContextInitializer.class);
    map.put("me.erano.com.SpringbootJpaTestSlice", SpringbootJpaTestSlice__TestContext003_ApplicationContextInitializer.class);
    return map;
  }
}
