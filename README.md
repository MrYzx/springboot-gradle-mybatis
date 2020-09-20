# springboot-gradle-mybatis
springboot + gradle + mybatis + thymeleaf 整合 【gradle 是单模块的】

# 项目介绍
###框架中使用的模块有  ：springboot + mybatis + thymeleaf  + gradle

## 在整合中遇到哦的问题有
##1.Whitelabel Error Page
  解决：thymeleaf 中的 地址配置路径错误
    thymeleaf:
      cache: false
      content-type: text/html
      encoding: UTF-8
      mode: HTML5
      prefix: classpath:/templates/views/
      suffix: .html
  
##2.org.apache.ibatis.binding.BindingException: Invalid bound statement (not found)
  mybatis 中的 xml 配置文件中的id 的名字和 Mapper 文件中的名称不一致

##3.Failed to configure a DataSource: 'url' attribute is not specified and no embedd
  @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

##4.Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
  mybatis-spring-1.3.2中取消了自动注入SqlSessionFactory 和 SqlSessionTemplate，
  所以会报出Property ‘sqlSessionFactory’ or ‘sqlSessionTemplate’ are required错误。
  那就想办法不要@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})自动注入，所以必须把application.properties配置文件改为application.yml
  修改主类配置为  ： @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

##5.项目中的依赖信息
    dependencies {
        implementation 'com.alibaba:druid-spring-boot-starter:1.1.9'
        implementation 'org.springframework.boot:spring-boot-starter-logging'
        implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
        implementation 'org.springframework.boot:spring-boot-starter-web'
        implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.3'
        runtimeOnly 'mysql:mysql-connector-java'
        testImplementation('org.springframework.boot:spring-boot-starter-test') {
            exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
        }
    }
