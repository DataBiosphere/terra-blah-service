package bio.terra.blah.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "blah.sam")
public record SamConfiguration(String basePath) {}
