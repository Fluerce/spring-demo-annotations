# spring-demo-annotations
 Part two of a Spring framework Udemy Course created by Chad Darby
 
## Notes

### Day 2

annotation - meta data of a class

xml config for applicationContext
- read spring configuration file
- get the bean from spring container
- call a method on the bean
- close the context

if @Component has no explicit bean ID, it will just copy the class name in a camelcase format

Spring AutoWiring - will look for a class that matches the property, class or interface.

Autowiring injection types
- Constructor Injection
- Setter Injection
- Field Injection

Try to be consistent with autowiring injection type.

@Component
@Scope
@Autowired
@Qualifiers
@PostConstruct
@PreDestroy
@Value
