package org.springframework.boot.autoconfigure.h2;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link H2ConsoleProperties}
 */
public class H2ConsoleProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'h2ConsoleProperties'
   */
  public static BeanDefinition getHConsolePropertiesBeanDefinition() {
    Class<?> beanType = H2ConsoleProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(H2ConsoleProperties::new);
    return beanDefinition;
  }
}
