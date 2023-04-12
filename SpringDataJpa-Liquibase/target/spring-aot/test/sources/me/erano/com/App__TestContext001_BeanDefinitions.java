package me.erano.com;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link App}
 */
public class App__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'app'
   */
  public static BeanDefinition getAppBeanDefinition() {
    Class<?> beanType = App.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(App.class);
    beanDefinition.setInstanceSupplier(App$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
