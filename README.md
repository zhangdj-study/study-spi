SPI全称Service Provider Interface，是Java提供的一套用来被第三方实现或者扩展的API，它可以用来启用框架扩展和替换组件。


要使用Java SPI，需要遵循如下约定：
1、当服务提供者提供了接口的一种具体实现后，在resources文件夹下的META-INF/services目录下创建一个以“接口全限定名”为命名的文件，内容为实现类的全限定名；
2、接口实现类所在的jar包放在主程序的classpath中；
3、主程序通过java.util.ServiceLoder动态装载实现模块，它通过扫描META-INF/services目录下的配置文件找到实现类的全限定名，把类加载到JVM；（通过反射，实例化接口的实现类，解耦）
4、SPI的实现类必须携带一个不带参数的构造方法；
