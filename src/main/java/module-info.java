module spring.boot.jpms.sample
{
    // This is required for @SpringBootApplication,
    // which is kindof a big deal for a Spring Boot
    // application.
    requires spring.boot.autoconfigure;

    // This is required in order to start the Spring
    // Boot application via SpringApplication::run.
    requires spring.boot;

    // This is necessary due to the way Spring Boot
    // scans classes. The application will not start
    // without this.
    opens com.denalidtx.samples.jpms.springboot to spring.core;

    // This is necessary due to the way Spring Boot
    // uses reflection to load classes. The application
    // will not start without this.
    exports com.denalidtx.samples.jpms.springboot to spring.beans, spring.context;

}