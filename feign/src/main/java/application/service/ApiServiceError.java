package application.service;

import org.springframework.stereotype.Component;

@Component//添加到Spring容器内
public class ApiServiceError implements  ApiService {
    @Override
    public String index() {
        return "服务发生故障";
    }
}
