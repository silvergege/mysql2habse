package com.example.mysql2hbase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.mysql2hbase.mapper")
public class Mysql2hbaseApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args) {
		SpringApplication.run(Mysql2hbaseApplication.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setPort(9082);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Mysql2hbaseApplication.class);
    }
}
