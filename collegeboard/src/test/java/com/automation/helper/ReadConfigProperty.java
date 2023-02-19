package com.automation.helper;

import java.io.InputStream;

public class ReadConfigProperty {

    public static void main(String[] args) {

        InputStream input = ReadConfigProperty.class.getClassLoader()
                .getResourceAsStream(
                        "/resource/config.properties");

        if (input != null) {
            System.out.println(input);
        } else {
            System.out.println("NULL");
        }

    }

}
