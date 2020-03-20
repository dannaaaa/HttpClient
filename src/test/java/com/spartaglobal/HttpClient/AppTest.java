package com.spartaglobal.HttpClient;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

//    public static void main(String[] args) throws IOException {
//        HttpClient client = HttpClient.newHttpClient();
//
//        Files.lines(Path.of("urls.txt"))
//                .map(LinkValidatorSync::validateKink)
//                .forEach(System.out::println);
//    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
