package helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import testBase.BaseClass;

import java.util.Random;

public class GenerateTestData extends BaseClass {
    private static final Logger log= LogManager.getLogger(GenerateTestData.class);

    public String getSaltString()
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String GenerateName() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = null;
        for (int x = 1; x <= 10; x++) {
            generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
            log.info("Generated String is:-"+generatedString);
        }
        return generatedString;
    }
}
