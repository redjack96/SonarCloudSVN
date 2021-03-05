package com.giacomo.rossi;

import java.io.IOException;
import java.util.logging.*;

public class HelloSonar {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Globale");
        logger.log(new LogRecord(Level.INFO, "Hello Sonar!"));
        myLogger();
    }


    public static void myLogger(){
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("C:\\Giacomo\\Universita\\ISW2\\SonarCloudSVN\\SonarCloudSVN\\log\\MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("My first log");

        } catch (SecurityException e) {
            logger.log(Level.SEVERE, "context", e);
        } catch (IOException e) {
            logger.log(Level.WARNING, "context", e);
        }

        logger.info("Hi How r u?");
    }
}
