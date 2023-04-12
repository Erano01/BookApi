package org.springframework.boot.autoconfigure.liquibase;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LiquibaseProperties}
 */
public class LiquibaseProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'liquibaseProperties'
   */
  public static BeanDefinition getLiquibasePropertiesBeanDefinition() {
    Class<?> beanType = LiquibaseProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(LiquibaseProperties::new);
    return beanDefinition;
  }
}
