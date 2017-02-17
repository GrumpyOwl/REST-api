package marta.rest.service;

import org.springframework.stereotype.Service;

import java.io.*;

/**
 * Created by marta on 29/12/16.
 */
@Service
public class XMLParserService {

    public void parse() throws FileNotFoundException {
        File file = new File("/test.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        OutputStream fileOutputStream = new ByteArrayOutputStream();

    }
}
