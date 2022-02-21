 ## Spring Framework	

 If you want to use Spring 5.2+ very well, you need to learn from RxJava->Reactor->NIO->Netty->Reactor netty.

Why Spring ?
* Java has a lot of libraries and features to work with. For accomplishing a thing there are many different libraries and ways.
* A framework reduces the boilerplate code to work with anything. Also framework implements design patterns which avoids the mistake done while implementing logic
* Spring has modules designed for specific purpose : for example with Spring boot it takes minutes to develop an application , Spring MVC for web , You want security use Spring Security module , Spring JPA for txn management , Spring REST for developing REST service , Spring web flux for reactive programming and the list goes on
* The point is it makes a developer life easy as we know where to look to accomplish a particular task
———————————————————————————————————————————————————————

 - [x] What is Inversion of Control : 
* Transferring the control of managing beans or part of the program from the user to a container. 
* IOC enables framework to manage custom code like creating objects 
———————————————————————————————————————————————————————
- [x] Dependency Injection :
* This is a pattern we can use to implement IOC , we transfer the control to container for injecting object’s dependencies .
* Container looks at the dependencies required for a bean to be created and injects them
———————————————————————————————————————————————————————
- [x] IOC Container :
*  A container which creates and manages all the beans defined by the user . User can define beans in a xml file or in java code and IOC container is responsible for managing their lifecycle
* Provides loose coupling 
* Makes developer life easier as they can concentrate on the logic 
* 2 types of IOC Containers 
    * Bean Factory : This is a simple container and provides features like DI 
    * Bean factory is lightweight and loads bean only when getBean is called
    * Does not support AOP and txn and i18n
    * Does not register post processors automatically 
    * Application Context : Advanced version of bean factory , extends Bean factory
    * Loads all beans at startup 
    * Supports i18n , AOP and other enterprise app features
    * Registers post processors automatically
———————————————————————————————————————————————————————

Spring core basics : 

- [x] Beans : 
* Spring Beans are objects which are created and managed by a IOC container . These are not objects created by user . But a user defines them and IOC container takes responsibility of creating beans
* Bean name : Default : className with first letter as lowercase 
* @Component , @Contoller , @Service , @Bean , @Qualifier are some annotations to create beans
* If @Bean used on method , Spring uses method name as bean name , Can also do @Component(“beanName”)(also applicable for other annotations)
* @Qualifier to differentiate between beans 
* Scope : We can define the scope of beans to control how they are instantiated 
    * singleton : single bean instance every time
    * prototype : new bean instance every time
    * request : new bean for every http request 
    * session : new bean for every web session
    * global-session :  new bean for every global http session 
* Life cycle of beans :
    * Init-method(xml) / afterpropertiesSet(implementing InitializingBean) : called after bean is initialised(callback)
    * destroy-method/ destory(implementing Disposable bean) : called when bean is destroyed 
* getBean() in Spring : used to get bean from the IOC container 
    * Calling only getBean() : gives object and has to be cast to appropriate type by user
    * Calling getBean(“name , ”A.class) : better approach , gives the bean with the name and type defined
    * Calling getBean(A.class) : gives bean of required type but can throw NoUniqueBean in case of multiple beans of same type
    * Calling getBean(“name”,”constructor param” ) : can be done for prototype beans
    * It is recommended to not call getBean and we should rely on it injected by spring 

———————————————————————————————————————————————————————
- [x] Bean Annotations :
    * @ComponentScan : scans packages for bean and registers them to containers , basePackages/basePackageClasses can be used to specify the packages to scan for beans. If no arg is specified then it scans package from where this annotation is present. Can use repeated annotation 
        * Filter types : There are 5 types of filter 
        * Annotation : includes or excludes all classes with the mentioned annotation 
        * ASSIGNABLE_TYPE : The ASSIGNABLE_TYPE filters all classes during the component scan that either extend the class or implement the interface of the specified type
        * REGEX: this filter checks if the classname matches the given regex pattern
        * ASPECTJ: When we want to use expressions to pick out a complex subset of classes, we need to use the FilterType ASPECTJ.
        * CUSTOM: We can also define our custom filters , have to implement TypeFilter
    * @Component :  Classes annotated with this means they are spring beans and are intitalized during startup
    * @Service :  This is used to denote the class is a service layer . Rest same as @Component
    * @Repository : This is used to denote a database layer. Also One advantage of using this annotation is that it has automatic persistence exception translation enabled. When using a persistence framework, such as Hibernate, native exceptions thrown within classes annotated with @Repository will be automatically translated into subclasses of Spring's DataAccessExeption.
    * @Controller : tells the Spring Framework that this class serves as a controller in Spring MVC:
    * @Configuration: To define beans is java class . Same as xml file where we define beans
    * @Autowired : To inject dependencies  . Can be marked on fields , constructor and setters .
    * @RequestParam: to extract query parameters, form parameters and even files from the request 
        * We can say @RequestParam(name = “id”) or @RequestParam(“id”) or @RequestParam(value = “id”)
        * By default , params are required , we can set to required = false , can give defaultvalue = “somethings” and can map to Map or list 
    * @Value : for injecting property value into beans 
———————————————————————————————————————————————————————

- [x] BeanPostProcessor: allows for custom modifications of new bean instances craeted by spring framework
* Two callbacks : postProcessBeforeInitialization and postProcessAfterInitialization 
* Called for every bean created 
* Application context automatically registers bean post processors
* Bean created -> values set and dependencies injected -> call setter methods -> postProcessBeforeInitialization -> init methods -> postProcessAfterInitialization -> destroy

