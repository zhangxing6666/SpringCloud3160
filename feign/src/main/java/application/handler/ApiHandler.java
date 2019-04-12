package application.handler;

import application.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiHandler {
    @Resource
    private ApiService apiService;

    @RequestMapping("/")
    public String index(){
        return apiService.index();
    }
}
