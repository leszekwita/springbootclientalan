package radzik.michal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import radzik.michal.domain.MessageDto;

/**
 * Created by Michal on 2016-12-08.
 */
@RestController
public class APIClientController {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/getRemoteText")
    @ResponseBody
    String getText() {

        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:11700/api/text", String.class);

        return response.getBody();
    }

    @RequestMapping("/getRemoteMessage")
    @ResponseBody
    MessageDto getRemoteMessage() {

        ResponseEntity<MessageDto> response = restTemplate.getForEntity("http://localhost:11700/api/message", MessageDto.class);

        return response.getBody();
    }

}
