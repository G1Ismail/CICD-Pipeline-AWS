package SevenP.Consultant.cicd_pipeline_aws.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@RequestMapping("/api")
@RestController
public class TestController {


    @GetMapping
    public ResponseEntity<Map<String, String>> healthCheck(){
        return ResponseEntity.ok().body(Map.of("App Zustand", "funktionert ohne Probleme, ..."));
    }

    @GetMapping("/api")
    public ResponseEntity<Map<String,String>> methode1(){
        return ResponseEntity.ok().body(Map.of("Testing", "fertig"));
    }
}
