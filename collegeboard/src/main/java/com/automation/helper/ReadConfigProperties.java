package com.automation.helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperties {

    public static void main(String[] args) {

        InputStream input = ReadConfigProperties.class.getClassLoader()
                .getResourceAsStream("resource/config.properties");
        if (input != null) {
            System.out.println(input);
        } else {
            System.out.println("NULL");
        }

        Properties prop = new Properties();

    }

}
