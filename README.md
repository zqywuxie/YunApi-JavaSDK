<p align="center">
<img src="https://wuxie-image.oss-cn-chengdu.aliyuncs.com/2023/09/19/logo.svg"/>
</p>
<h1 align="center"> 云Api免费开放平台-SDK</h1>
<div align="center">
    <img alt="Maven" src="https://raster.shields.io/badge/Maven-3.8.1-red.svg"/>
   <img alt="SpringBoot" src="https://raster.shields.io/badge/SpringBoot-2.67+-green.svg"/>
  <a href="https://github.com/qimu666/qi-api-sdk" target="_blank"><img src='https://img.shields.io/github/forks/zqywuxie/Study_Partner_backed' alt='GitHub forks' class="no-zoom"></a>
  <a href="https://github.com/qimu666/qi-api-sdk" target="_blank"><img src='https://img.shields.io/github/stars/zqywuxie/Study_Partner_backed' alt='GitHub stars' class="no-zoom"></a>
</div>


> ​				**开发者工具包，帮助开发者快速搭建客户端进行接口请求**
>
> 前端代码：[zqywuxie/YunApiFrontend: 云API开放平台前端 (github.com)](https://github.com/zqywuxie/YunApiFrontend)
>
> 后端代码：[zqywuxie/YunApiBackend: 云API开放平台后端 (github.com)](https://github.com/zqywuxie/YunApiBackend)

# 项目目录结构

```text
+---client 客户端
+---config 配置
+---exception 全局异常
+---model 模型
|   +---enums
|   +---params 请求参数类
|   +---request 请求类
|   \---response 响应类
+---service 业务处理
|   \---impl
\---utils 工具

```

# 开始使用

## 1. 将SDK下载到本地进行解压IDEA打开，然后使用maven进行注入到本地仓库

![image-20231016093607376](https://wuxie-image.oss-cn-chengdu.aliyuncs.com/2023/09/19/image-20231016093607376.png)

## 2.在项目中引入依赖

```xml
<dependency>
    <groupId>com.wuxie.yunapi</groupId>
    <artifactId>yunapi-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

## 3.前往云Api开放平台获得开发者密钥 （AK/SK）

## 4.根据密钥进行初始化ApiClient客户端

- 方法一：手动实例化客户端

```java
String accessKey = "你的 accessKey";
String secretKey = "你的 secretKey";
ApiClient client = new ApiClient(accessKey, secretKey);
```

- 方法二：配置文件自动注入

  -  yml

  ```yml
  yunapi:
    client:
      access-key: xxx
      serect-key: xxx
  ```

  - properties

  ```properties
  yunapi.client.access-key=
  yunapi.client.serect-key=
  ```

  

## 5.使用API服务

直接使用Spring的自动注入

```java
@Resource
private ApiService apiservice;
```



## 6.请求示例

- 手动创建客户端

```java
    try {
        APIClient apiClient = new APIClient("xx", "xx");
        LoveTalkResponse loveTalkResponse = apiService.loveTalk(apiClient);
        System.out.println(loveTalkResponse);
    } catch (BusinessException e) {
        log.error(e.getMessage());
    }
```

- 自动注入

```java
    try {
        LoveTalkResponse loveTalkResponse = apiService.loveTalk();
        System.out.println(loveTalkResponse);
    } catch (BusinessException e) {
        log.error(e.getMessage());
    }
```

