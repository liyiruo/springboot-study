
## 从全局配置文件里引入数据
### 一次引入一个
@Value 支持简单数据类型  支持计算表达式  不支持复杂数据类型
    @Value("${emp.name})
    @Value("#{2*8})
### 一次引入一批
@ConfigurationProperties（prefix="emp"）
## 从局部配置文件引入数据
@PropertySource(value={"classpath: emp.properties"}) 

## 配置xml 文件
@ImportResource  使用xml配置

### 将xml配置文件加载到容器中
@ImportResource（locations={"classpath: spring01.xml"})


