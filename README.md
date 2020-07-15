# 基本信息
+ 名称：图书馆管理系统
+ 框架：Spring + MyBatis + SpringMVC，其中MyBatis与Spring整合，后期考虑用SpringBoot（原因是现在还没开始学习SpringBoot）
+ 语言：Java、HTML5、JavaScript、CSS
+ 数据库：MySQL，后期将研究研究加入MongoDB和Redis，因为还没学习Spring和MyBatis怎么联动操作这两个数据库。
## 目前已用的技术点
+ 密码加密：<br/>
&#8195;&#8195;采用了加盐哈希算法，盐值用随机数模块从20个英文字母（大小写）和0~9数字内任取10个字符组成盐值，在设置密码时，将盐值加入到密码后面，然后进行哈希算法，哈希算法使用SHA1方式，生成后随盐值一同写入数据库。
验证密码时，取出数据库内对应盐值，与用户输入的密码组合后进行哈希算法计算，与数据库内的哈希值进行对比。

+ Dao层<br/>
&#8195;&#8195;用接口方式与mapper操作数据库，变量别名采用@Param注释。

#pull代码后需要做的事
+ pull代码后，需要在src/main/resources内加入properties文件夹，文件夹内加入jdbc.properties文件来配置数据库信息。或修改conf/applicationContext.xml内context:property-placeholder标签指向的properties文件位置，并检查druid中配置信息。
+ MySQL驱动为：com.mysql.cj.jdbc.Driver
#版本信息
1、完善了Dao层内ID相关的数据库操作。<br/>
2、完善了ID相关Service层的业务代码，并完成测试。
    