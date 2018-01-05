package mydocker.test;

import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weisen.yang@hand-china.com
 * @Date 2017/12/25 10:35
 * @name
 * @description
 */
@RestController
@RequestMapping("test/")
public class HelloWordController {

    @RequestMapping(value = "/helloWord")
    public ResponseEntity helloWord(){
        Map<String, Object> map = new HashMap<>();
        map.put("param", "Hello Word!");
        return ResponseEntity.ok(map);
    }
    @RequestMapping(value = "/message")
    public ResponseEntity getMessage(){
        Map<String, Object> map = new HashMap<>();
        map.put("param", "message");
        return ResponseEntity.ok(map);
    }
}
