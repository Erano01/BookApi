package org.springframework.boot.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataSourceConfiguration}
 */
public class DataSourceConfiguration__TestContext003_BeanDefinitions {
  /**
   * Bean definitions for {@link DataSourceConfiguration.Hikari}
   */
  public static class Hikari__BeanDefinitions {
    /**
     * Get the bean definition for 'hikari'
     */
    public static BeanDefinition getHikariBeanDefinition() {
      Class<?> beanType = DataSourceConfiguration.Hikari.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(DataSourceConfiguration.Hikari::new);
      return beanDefinition;
    }
  }
}
