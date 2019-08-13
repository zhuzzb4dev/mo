package ga.zhuzimo.moserver.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration

public class Swagger2Config {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).forCodeGeneration(true)
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("ga.zhuzimo.moserver"))
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("接口列表")
                //版本号
                .version("1.0")
                //描述
                .description("对外服务一览")
                .build();
    }
}
