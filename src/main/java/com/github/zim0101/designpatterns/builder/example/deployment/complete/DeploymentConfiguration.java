package com.github.zim0101.designpatterns.builder.example.deployment.complete;

import com.github.zim0101.designpatterns.builder.example.deployment.components.*;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class DeploymentConfiguration {
    private DeploymentEnvironment environment;
    private Region region;
    private int maxInstances;
    private int minInstances;
    private boolean autoScalingEnabled;
    private NetworkPolicy networkPolicy;
    private List<LoggingLevel> loggingLevels;
    private StorageType storageType;

    // Package Private constructor
    DeploymentConfiguration(DeploymentEnvironment environment,
                            Region region,
                            int maxInstances,
                            int minInstances,
                            boolean autoScalingEnabled,
                            NetworkPolicy networkPolicy,
                            List<LoggingLevel> loggingLevels,
                            StorageType storageType) {
        this.environment = environment;
        this.region = region;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.autoScalingEnabled = autoScalingEnabled;
        this.networkPolicy = networkPolicy;
        this.loggingLevels = loggingLevels;
        this.storageType = storageType;
    }
}
