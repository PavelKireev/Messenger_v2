package com.bachelor.messenger_v2.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.bachelor.messenger_v2.db.entity")
@ComponentScan("com.bachelor.messenger_v2")
@EnableJpaRepositories("com.bachelor.messenger_v2.db.repository")
public class DataConfiguration {
}
