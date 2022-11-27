package passion.project.demo.responsehandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus code, Object responseObj) {

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", code.value());
        map.put("message", message);
        map.put("data", responseObj);



        return new ResponseEntity<Object>(map,code);
    }
}
