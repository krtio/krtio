package com.example.Spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController {

    @GetMapping("/api/map")
    public String getMapLocation(@RequestParam double latitude, @RequestParam double longitude) {
        // 여기서 필요한 로직을 구현
        return "위도: " + latitude + ", 경도: " + longitude;
    }
}


