package ru.deft.Glava4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import ru.deft.Glava2.Instrumentalist;
import ru.deft.Glava2.Juggler;
import ru.deft.Glava2.Performer;
import ru.deft.Glava2.Poem;
import ru.deft.Glava2.PoeticJuggler;
import ru.deft.Glava2.Sonnet29;
import ru.deft.Glava5.Audience;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by s.golitsyn
 */

@Configuration
public class SpringIdolConfig {
    @Bean
    Performer duke() {
        return new Juggler();
    }

    @Bean
    Performer duke15() {
        return new Juggler(15);
    }

    @Bean
    Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }

    @Bean
    Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    Audience audience() {
        return new Audience();
    }

    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter vendorAdapter, Properties hibernateProperties) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan(new String("ru.deft"));

        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties);
        return em;
    }

    @Bean
    public HibernateJpaVendorAdapter vendorAdapter() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(true);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL");
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        fillDataSource(dataSource);
        return dataSource;
    }

    private void fillDataSource(DriverManagerDataSource dataSource) {
        Properties dbProps = new Properties();
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/javastudy";
        String driverClassName = "com.mysql.jdbc.Driver";
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
    }

    @Bean
    public static Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL");
        hibernateProperties.put("hibernate.show_sql", true);
        hibernateProperties.put("hibernate.generate_statistics", false);
        hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.put("hibernate.use_sql_comments", false);
        hibernateProperties.put("hibernate.connection.autocommit", false);
        return hibernateProperties;
    }
}
