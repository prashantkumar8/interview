package acko.testing.acko.util;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class NotificationRestHelper {

    private static  String url="https://run.mocky.io/v3/fd99c100-f88a-4d70-aaf7-393dbbd5d99f";

    public boolean sendAlert(Map<String,Object> data) {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity entity = new HttpEntity(data,headers);
        ResponseEntity<Object> responseEntity=restTemplate.exchange(url, HttpMethod.POST,entity,Object.class);
        return true;
    }

}
