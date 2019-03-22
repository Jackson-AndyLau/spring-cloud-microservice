
# spring-cloud-microservice

- 第一章：微服务理论概述
  - 1、深入理解 REST 与 RPC
  - 2、微服务架构基本理论概述
- 第二章：Spring Cloud 基础模块构建
  - 1、Spring Cloud 基本理论概述
  - 2、Spring Cloud 进阶--Rest 微服务基础模块构建
1. 项目1
2. 项目2
3. 项目3
- [] 计划任务
- [x] 完成任务

# 第一章：微服务理论概述
## 1、深入理解 REST 与 RPC  
&#8195;&#8195;在进行微服务进阶之前，首先来认识 <kbd>**Dubbo**</kbd> 与 <kbd>**Spring Cloud**</kbd>，前段时间在社区中看到有不少的开发工作者都用 Dubbo 与 Spring Cloud 进行比较，为什么会导致这么多人使用这两个框架进行比较呢，归根一点，就是 Dubbo 使用 RPC 进行通信 ,而 Spring Cloud 使用了 REST 方式。

RPC 工作原理：  
《上工作原理图》

REST 工作原理：  
&#8195;&#8195;表述性状态传递是一组架构约束条件和原则。满足这些约束条件和原则的应用程序或设计就是 RESTful。需要注意的是，<kbd>**REST 是设计风格而不是标准**</kbd>。REST 通常基于使用 HTTP、URI、和XML（标准通用标记语言下的一个子集）以及HTML（标准通用标记语言下的一个应用）这些现有的广泛流行的协议和标准。  
&#8195;&#8195;<kbd>**REST 定义了一组体系架构原则**</kbd>，可以根据这些原则设计以系统资源为中心的 Web 服务，包括使用不同语言编写的客户端如何通过 HTTP 处理和传输资源状态。 如何考虑使用它的 Web 服务的数量，REST 近年来已经成为最主要的 Web 服务设计模式。 事实上，REST 对 Web 的影响非常大，由于其使用相当方便，已经普遍地取代了基于 SOAP 和 WSDL 的接口设计。

原文地址：[《 REST 与  RPC 的区别 》](https://blog.csdn.net/Hello_World_QWP/article/details/84929381)

## 2、微服务架构基本理论概述
&#8195;&#8195;接下来本节主要对微服务架构基本理论进行了解，包括微服务架构的基本概念、定义极其本质？微服务架构的未来发展趋势？传统开发模式和微服务之间有什么区别？SOA 和 微服务 之间有什么区别？如何让微服务实战落地？微服务架构中常见的6种设计模式？微服务架构的优缺点？

原文连接：[《 微服务架构基本理论概述 》](https://blog.csdn.net/Hello_World_QWP/article/details/84929469)  
推荐阅读：[《微服务与微服务架构的主要思想和原则》](https://blog.csdn.net/Hello_World_QWP/article/details/84929615)  

# 第二章：Spring Cloud 基础模块构建  
## 1、Spring Cloud 基本理论概述  
&#8195;&#8195;万丈高楼平地起，但还有种说法叫：“万事开头难”，不管使用什么技术，就算是行业老司机，也得乖乖的从基本理论概述开始。通过本节，您将理解什么是 Spring Cloud ？Spring Cloud 和 Spring Boot 之间的关系或者说是联系？Dubbo 与 Spring Cloud ?再原文连接的末尾，作为福利，博主倾力收集了三个关注度极高的 Dubbo 相关的问题。  

原文连接：[《Spring Cloud 基本理论概述》](https://blog.csdn.net/Hello_World_QWP/article/details/84928416)  

## 2、Spring Cloud 进阶--Rest 微服务基础模块构建  
&#8195;&#8195;在前面章节进行了微服务架构风格、微服务框架以及微服务相关的理论体系的简介与介绍，本节将是微服务实践的开始，本节主要为完成 Rest 微服务基础模块的建设，包括：  
- 整体微服务项目的顶级（父级项目，主要为实现配置共享与版本统一管理，以及插件和资源的加载管理）项目，项目名为  “  microservice ”；  
- 整体微服务项目的公共子模块，供其它子模块引用，达到通用的目的，例如：定义配置、工具、实体，枚举等，每个微服务模块无需再重复定义，直接引用即可，项目名为 “ microservice-api ” ；  
- 微服务提供者子模块，服务名为 “ microservice-provider-8001 ”；  
- 微服务消费者子模块，服务名为 “ microservice-consumer-80 ”；  

微服务提供者模块创建完成后，工程总览，如下图：  
《缺少工程图》  

微服务消费者模块创建完成后，项目概览如下图：
《缺少工程图》  

原文连接：[《 Rest 微服务基础模块构建 》](https://blog.csdn.net/Hello_World_QWP/article/details/85912927)  

# 第三章：Spring Cloud Eureka  
## 1、Eureka 基本理论概述
&#8195;&#8195;Spring Cloud 封装了 Netflix 公司开发的 Eureka 模块来实现服务注册和发现，<kbd>**Eureka 采用了 C-S 的设计架构**</kbd>。Eureka Server 作为服务注册功能的服务器，它是服务注册中心。  
&#8195;&#8195;而系统中的其他微服务，使用 Eureka 的客户端连接到 Eureka Server 并维持心跳连接。这样系统的维护人员就可以通过 Eureka Server 来监控系统中各个微服务是否正常运行。包括 Spring Cloud 的一些其他服务模块（比如Zuul）就可以通过Eureka Server来发现系统中的其他微服务，并执行相关的逻辑。  
Eureka 基本架构图：  
 《架构图》  
&#8195;&#8195;本节主要对 Spring Cloud Eureka 进行了一个基本的介绍，包括什么是 Eureka ？Eureka 基本架构分析？Eureka 的两个总要组件？以及使用 Eureka 的三大解决？  

原文连接：[《 Eureka 基本理论概述 》](https://blog.csdn.net/Hello_World_QWP/article/details/85246850)  

## 2、Eureka 与 zookeeper 的区别、原理及各自优缺点  
&#8195;&#8195;在微服务的开发过程中，如果使用的是 Dubbo 那就必须使用到 Zookeeper ，在使用 Spring Cloud Eureka 时，自然其功能更强大得多。博主也不得不感叹，Spring Cloud Eureka 后来者居上呀，Dubbo 早在几年前停止了维护，在其停止了维护的几年里正是互联网发展的大好时期，Eureka 借机快速发展，夺得了一大片市场，可以说已经超越了 Dubbo 了，17年的时候，阿里巴巴又突然宣布重启对 Dubbo 的维护，在其重启的发布会上，其主导维护者也表示，将希望加入 Eureka 的生态，呃。。。好吧。  
&#8195;&#8195;废话过多，进入正题。为什么要用 Eureka 与 Zookeeper 进行比较呢，因为两者都有类似的起到服务注册中心的作用，通过本节 Eureka 与 Zookeeper 进行更深入的了解。  

原文连接：[《Eureka 与 zookeeper 的区别、原理及各自优缺点》](https://blog.csdn.net/Hello_World_QWP/article/details/85247142)  

## 3、Spring Cloud 进阶--Rest微服务加入Eureka服务注册与服务发现（单机版）  
&#8195;&#8195;在上一章节中，主要对 “ 微服务基础模块 ” 进行创建，并在 [《 Eureka 基本理论概述 》](https://blog.csdn.net/Hello_World_QWP/article/details/85246850)  中对 Eureka 进行了介绍，本节主要在微服务基础模块之上再加入 Eureka 实现单机版的注册与发现Eureka服务，Eureka 项目子模块包括：  
- 新增服务发现与注册中心模块，服务名称为 “ microservice-config-eureka-7001 ”；
- 修改的微服提供者模块，服务名称 “ microservice-provider-8001 ”；
- 修改的微服务消费者模块，服务名称 “ microservice-consumer-80 ”；  

Eureka 微服务子模块注册中心项目创建完成后，项目工程概览如下图：  
《工程图》

原文连接：[《 Rest 微服务加入 Eureka（单机） 》](https://blog.csdn.net/Hello_World_QWP/article/details/85913125)  

## 4、Spring Cloud 进阶--Rest微服务加入Eureka服务注册与服务发现（集群版）
&#8195;&#8195;在上一章节中，主要对 [《 Rest 微服务加入 Eureka（单机） 》](https://blog.csdn.net/Hello_World_QWP/article/details/85913125) 进行了详细的介绍，本节主要对Eureka的集群模式进行详细的介绍，虽然非常的简单，不喜勿喷呀。主要包括如下内容：  
- 注册中心一号服务器，服务名称 “ microservice-eureka-7001  ”；
- 注册中心二号服务器，服务名称 “ microservice-eureka-7002 ”；
- 注册中心三号服务器，服务名称 “ microservice-eureka-7003 ”；
- 修改的微服务提供者模块，服务名称 “ microservice-provider-8001 ”；  

原文连接：[《 Rest 微服务加入 Eureka（集群） 》](https://blog.csdn.net/Hello_World_QWP/article/details/87979010)

# 第四章：Netflix/Ribbon 
接入Ribbon负载均衡客户端组件

# 第五章：OpenFeign/Feign
接入Feign负载均衡客户端组件（通过接口方式调用Rest服务）

# 第六章：Netflix/Hystrix
接入Hystrix断路器，实现服务的熔断与降级
接入Hystrix-Dashboard，实现微服务监控

# 第七章：Netflix/Zuul
接入zuul，实现服务的代理、路由、过滤

# 第八章：Spring Cloud Config
接入config，实现服务端的配置
接入config，实现客户端的配置
接入config，分布式配置中心实战示例
