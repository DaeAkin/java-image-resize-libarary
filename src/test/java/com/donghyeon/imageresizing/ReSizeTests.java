package com.donghyeon.imageresizing;

import com.donghyeon.util.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReSizeTests {
    private static String resourcePath = "/Users/donghyeonmin/imageresizing/src/main/resources/";

    @Test
    public void Crop64x64Test() {
        try {
            InputStream fs = new FileInputStream(resourcePath + "test.jpg");

            byte[] bytes = IOUtils.toByteArray(fs); // apache commons io

            FileUtils.reSizeImage(resourcePath, "test.jpg", bytes, 64, 64, null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Crop64x64Test2() {

        try {
            InputStream fs = new FileInputStream(resourcePath + "test.jpg");

            byte[] bytes = IOUtils.toByteArray(fs); // apache commons io

            FileUtils.reSizeImage(resourcePath,"test.jpg", bytes,64,64,"/Users/donghyeonmin1/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
