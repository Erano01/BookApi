package org.springframework.boot.test.autoconfigure.jdbc;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestDatabaseAutoConfiguration}
 */
public class TestDatabaseAutoConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'testDatabaseAutoConfiguration'
   */
  public static BeanDefinition getTestDatabaseAutoConfigurationBeanDefinition() {
    Class<?> beanType = TestDatabaseAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(TestDatabaseAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'embeddedDataSourceBeanFactoryPostProcessor'
   */
  public static BeanDefinition getEmbeddedDataSourceBeanFactoryPostProcessorBeanDefinition() {
    Class<?> beanType = TestDatabaseAutoConfiguration.EmbeddedDataSourceBeanFactoryPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<TestDatabaseAutoConfiguration.EmbeddedDataSourceBeanFactoryPostProcessor>forFactoryMethod(TestDatabaseAutoConfiguration.class, "embeddedDataSourceBeanFactoryPostProcessor").withGenerator(TestDatabaseAutoConfiguration::embeddedDataSourceBeanFactoryPostProcessor));
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link TestDatabaseAutoConfiguration.EmbeddedDataSourceFactoryBean}
   */
  public static class EmbeddedDataSourceFactoryBean__BeanDefinitions {
    /**
     * Get the bean definition for 'dataSource'
     */
    public static BeanDefinition getDataSourceBeanDefinition() {
      Class<?> beanType = TestDatabaseAutoConfiguration.EmbeddedDataSourceFactoryBean.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(TestDatabaseAutoConfiguration.EmbeddedDataSourceFactoryBean::new);
      return beanDefinition;
    }
  }
}
