package marta.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * Created by marta on 29/12/16.
 */
@RestController
public class FileJsonParserController {

    @RequestMapping(value="/parse/string", method = RequestMethod.POST)
    public ResponseEntity<String> parseString( String stringXML) throws FileNotFoundException {
        File  file = new File("/test.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        OutputStream fileOutputStream = new ByteArrayOutputStream();



        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }

    @RequestMapping(value="/parse/string", method = RequestMethod.POST)
    public ResponseEntity<String> parseFile(@RequestParam(value="file") MultipartFile fileXML){



        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }
}
