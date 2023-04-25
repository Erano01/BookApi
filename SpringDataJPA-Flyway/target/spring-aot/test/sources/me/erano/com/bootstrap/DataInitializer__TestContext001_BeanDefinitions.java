package me.erano.com.bootstrap;

import java.lang.Class;
import me.erano.com.repo.AuthorUuidRepository;
import me.erano.com.repo.BookRepository;
import me.erano.com.repo.BookUuidRepository;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataInitializer}
 */
public class DataInitializer__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'dataInitializer'.
   */
  private static BeanInstanceSupplier<DataInitializer> getDataInitializerInstanceSupplier() {
    return BeanInstanceSupplier.<DataInitializer>forConstructor(BookRepository.class, AuthorUuidRepository.class, BookUuidRepository.class)
            .withGenerator((registeredBean, args) -> new DataInitializer(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'dataInitializer'
   */
  public static BeanDefinition getDataInitializerBeanDefinition() {
    Class<?> beanType = DataInitializer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDataInitializerInstanceSupplier());
    return beanDefinition;
  }
}
