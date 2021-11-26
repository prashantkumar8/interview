package acko.testing.acko.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class NotificationRestHelper {

    private static  String url="https://run.mocky.io/v3/fd99c100-f88a-4d70-aaf7-393dbbd5d99f";

    public boolean sendAlert(Map<String,Object> data) {
        RestTemplate restTemplate=new RestTemplate();
//        restTemplate.exchange(url, HttpMethod.POST,);
        return true;
    }

}
