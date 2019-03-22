
# spring-cloud-microservice
- 第一章：微服务理论概述
  - 1、深入理解 REST 与 RPC
  - 2、微服务架构基本理论概述
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

&#8195;&#8195;接下来对微服务架构基本理论进行了解，包括微服务架构的基本概念、定义极其本质？微服务架构的未来发展趋势？传统开发模式和微服务之间有什么区别？SOA 和 微服务 之间有什么区别？如何让微服务实战落地？微服务架构中常见的6种设计模式？微服务架构的优缺点？

原文连接：[《 微服务架构基本理论概述 》](https://blog.csdn.net/Hello_World_QWP/article/details/84929469)


# 第二章：Spring Cloud 基础模块构建

# 第三章：Spring Cloud Eureka
接入Eureka注册中心以及Eureka集群

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
