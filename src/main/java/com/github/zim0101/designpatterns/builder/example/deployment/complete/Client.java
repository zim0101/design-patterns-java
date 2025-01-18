package com.github.zim0101.designpatterns.builder.example.deployment.complete;

import com.github.zim0101.designpatterns.builder.example.deployment.components.*;

import java.util.List;


class Deployment {
    private final DeploymentConfiguration configuration;

    public Deployment(DeploymentConfiguration configuration) {
        this.configuration = configuration;
    }

    public void deploy() {
        System.out.println("Deploying application with configuration: " + configuration);
    }
}

public class Client {
    public static void main(String[] args) {
        DeploymentConfigurationBuilder builder = new DevelopmentDeploymentConfigurationBuilder();
        DeploymentDirector director = new DeploymentDirector(builder);
        DeploymentConfiguration configuration = director.constructDevelopmentDeploymentConfiguration();

        Deployment deployment = new Deployment(configuration);
        deployment.deploy();

        builder = new StagingDeploymentConfigurationBuilder();
        director = new DeploymentDirector(builder);
        configuration = director.constructStagingDeploymentConfiguration();

        deployment = new Deployment(configuration);
        deployment.deploy();

        builder = new ProductionDeploymentConfigurationBuilder();
        director = new DeploymentDirector(builder);
        configuration = director.constructProductionDeploymentConfiguration();

        deployment = new Deployment(configuration);
        deployment.deploy();

        // Custom deployment configuration for production
        ProductionDeploymentConfigurationBuilder productionDeploymentConfigurationBuilder =
                new ProductionDeploymentConfigurationBuilder();
        productionDeploymentConfigurationBuilder
                .environment(DeploymentEnvironment.PRODUCTION)
                .region(Region.US_WEST_2)
                .maxInstances(10)
                .minInstances(5)
                .autoScalingEnabled(true)
                .networkPolicy(NetworkPolicy.OPEN)
                .loggingLevels(List.of(LoggingLevel.INFO, LoggingLevel.WARN, LoggingLevel.ERROR))
                .storageType(StorageType.ARCHIVE);

        DeploymentConfiguration configuration2 = productionDeploymentConfigurationBuilder.build();
        Deployment deployment2 = new Deployment(configuration2);
        deployment2.deploy();

    }
}
