package org.springframework.boot.autoconfigure.liquibase;

import java.lang.Class;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LiquibaseAutoConfiguration}
 */
public class LiquibaseAutoConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'liquibaseAutoConfiguration'
   */
  public static BeanDefinition getLiquibaseAutoConfigurationBeanDefinition() {
    Class<?> beanType = LiquibaseAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(LiquibaseAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'liquibaseDefaultDdlModeProvider'.
   */
  private static BeanInstanceSupplier<LiquibaseSchemaManagementProvider> getLiquibaseDefaultDdlModeProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LiquibaseSchemaManagementProvider>forFactoryMethod(LiquibaseAutoConfiguration.class, "liquibaseDefaultDdlModeProvider", ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LiquibaseAutoConfiguration.class).liquibaseDefaultDdlModeProvider(args.get(0)));
  }

  /**
   * Get the bean definition for 'liquibaseDefaultDdlModeProvider'
   */
  public static BeanDefinition getLiquibaseDefaultDdlModeProviderBeanDefinition() {
    Class<?> beanType = LiquibaseSchemaManagementProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getLiquibaseDefaultDdlModeProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link LiquibaseAutoConfiguration.LiquibaseConfiguration}
   */
  public static class LiquibaseConfiguration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration$LiquibaseConfiguration'.
     */
    private static BeanInstanceSupplier<LiquibaseAutoConfiguration.LiquibaseConfiguration> getLiquibaseConfigurationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<LiquibaseAutoConfiguration.LiquibaseConfiguration>forConstructor(LiquibaseProperties.class)
              .withGenerator((registeredBean, args) -> new LiquibaseAutoConfiguration.LiquibaseConfiguration(args.get(0)));
    }

    /**
     * Get the bean definition for 'liquibaseConfiguration'
     */
    public static BeanDefinition getLiquibaseConfigurationBeanDefinition() {
      Class<?> beanType = LiquibaseAutoConfiguration.LiquibaseConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getLiquibaseConfigurationInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'liquibase'.
     */
    private static BeanInstanceSupplier<SpringLiquibase> getLiquibaseInstanceSupplier() {
      return BeanInstanceSupplier.<SpringLiquibase>forFactoryMethod(LiquibaseAutoConfiguration.LiquibaseConfiguration.class, "liquibase", ObjectProvider.class, ObjectProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(LiquibaseAutoConfiguration.LiquibaseConfiguration.class).liquibase(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'liquibase'
     */
    public static BeanDefinition getLiquibaseBeanDefinition() {
      Class<?> beanType = SpringLiquibase.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getLiquibaseInstanceSupplier());
      return beanDefinition;
    }
  }
}
