package Deutsch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class Config {
    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://35.226.23.157/mybase");
        dataSource.setUsername("spring");
        dataSource.setPassword("yavkin85");
        return dataSource;
    }
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory()
    {
        LocalEntityManagerFactoryBean entityManagerFactory=new LocalEntityManagerFactoryBean();
        entityManagerFactory.setPersistenceUnitName("DeutschUnit");
        return entityManagerFactory;
    }
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory)
    {
       JpaTransactionManager transactionManager=new JpaTransactionManager();
       transactionManager.setEntityManagerFactory(entityManagerFactory);
       return transactionManager;
    }
}
