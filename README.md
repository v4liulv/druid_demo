# 结合SpringBoot和mybatis连接Apache Druid示例

## Druid安装部署

这里测试代码使用当服务器部署，请参考[官方部署文档](http://www.apache-druid.cn/GettingStarted/chapter-3.html)

## Druid使用到的数据源

示例程序用到的数据源rollup-tutorial同样也是来自[官方文档](http://www.apache-druid.cn/Tutorials/chapter-5.html)

## 总结

满足上面两个条件，调整application-dev.properties中的spring.datasource.url为您本地的Druid服务器地址即可
 
