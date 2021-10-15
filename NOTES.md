#项目笔记
##随手记
###1. 经验
###2. 技术
####1. 强制类型转换
1. 父子类转换
   A implements B
   (A)B
   B = new B
2. 工具类  
   BeanUtils.copyProperties(userInfo, userInfoEntity);
   
####2. MySql Datestamp自动更新时间  
```
alter table t_user_session modify column update_time TIMESTAMP not null  DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT'修改时间';
```
####3. MySql过段时间后连接超时
```
spring:
   datasource:
      druid:
         keep-alive: true
         validation-query: SELECT 1 FROM DUAL
         test-while-idle: true
         test-on-borrow: true
         test-on-return: false
         borrow-connection-timeout: 60
```
####4. Mysql外网连接时卡顿
```
添加skip-name-resolve以后跳过反向DNS解析。
```
###3. 规范
####1. 强制类型转换

###4. 其他