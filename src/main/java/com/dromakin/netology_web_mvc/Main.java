/*
 * File:     Main
 * Package:  com.dromakin.netology_web_mvc
 * Project:  netology_web_mvc
 *
 * Created by dromakin as 27.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.27
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_web_mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws LifecycleException, IOException {
        final var tomcat = new Tomcat();
        final var baseDir = Files.createTempDirectory("tomcat");
        baseDir.toFile().deleteOnExit();
        tomcat.setBaseDir(baseDir.toAbsolutePath().toString());

        final var connector = new Connector();
        connector.setPort(9999);
        tomcat.setConnector(connector);

        tomcat.getHost().setAppBase(".");
        tomcat.addWebapp("", ".");

        tomcat.start();
        tomcat.getServer().await();
    }
}
