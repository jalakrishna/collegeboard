package com.automation.helper;

import java.io.InputStream;

public class ReadConfigProperties {

    public static void main(String[] args) {

        InputStream input = ReadConfigProperties.class.getClassLoader()
                .getResourceAsStream("resource/config.properties");
        if (input != null) {
            System.out.println(input);
        } else {
            System.out.println("NULL");
        }

    }

}
