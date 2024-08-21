There are 3 types of design patterns:
1. [Creational]({{< relref "#creational" >}})
2. [Structural]({{< relref "#structural" >}})
3. [Behavioural]({{< relref "#behavioural" >}})

# Creational Pattern {{#creational}}

These patterns provide various **object creation** mechanisms, which increase flexibility and reuse of existing code. (Refactoring Guru)

Importance of Creational Design patterns (geeksforgeeks): 
1. Creational patterns become more important as the system evolve and rely more on composition than inheritance. This is because, there is an emphasis on shifting away from hardcoding a fixed set of behaviours to defining smaller set of fundamental behaviours, that can be composed into any number of more complex ones.
2. Creating objects with different behaviours requires more than simply instantiating a class. 
3. Delegation of object creation to another object

When to use Creational Design Patterns (geeksforgeeks)
1. Complex Object Creation: when creating an object requires multiple steps or configuration of various parameters.
2. Promoting Reusability: creating object creation component that can be reused across different parts of the code or even in different projects, enhancing modularity and maintainability. 
3. Reducing Coupling: reduce the coupling between client code and classes being instantiated, making the system more flexible and adaptable to changes.
4. Singleton Requirements: when there is exactly one instance of a class is needed, or a need for global point of access, use Singleton.
5. Step-by-Step Construction: use builder pattern for creating objects that has many steps. 

Advantages of Creational Design Patterns (geeksforgeeks)
1. Increase Flexibility & Adaptability
2. Reusability
3. Centralised Control
4. Increase Scalability 
5. Promote of Good Design Practices

Disadvantages of Creational Design Patterns (geeksforgeeks)
1. Increase Complexity in codebase
2. Overhead: Using certain creational patterns, such as the Abstract Factory or Prototype pattern, may introduce overhead due to the creation of a large number of classes and interfaces.
3. Dependency on patterns: Over-reliance on patterns can make the codebase dependent on a specific pattern, making it challenging to adapt to changes or switch to alternative solutions. 
4. Readability & Understanding: The use of pattern can make the code less readable and harder to understand, especially for developers who are not familiar with the pattern being employed

# Structural Pattern {{#structural}}

These patterns explain how to assemble objects and classes into larger **structures** whike keeping structures flexible and efficient. (Refactoring Guru)

Importance of Structural Design Patterns (geeksforgeeks)
1. This patterns are useful for making independently developed class libraries work together.
2. Use to describe ways to compose objects to realise new functionality
3. Adds flexibility of object composition which enables object to change the composition at run-time.

When to use Structural Design Patterns (geeksforgeeks)
1. Adapting to Interfaces: when you need to make exisitng classes work with others without modifying their source code.
2. Organising Object Relationships: use when you need to add new functionalities to objects by composing them in a flexible and reusable way, avoiding the need for subclassing.
3. Simplifying Complex Systems: patterns like the Facade pattern can be used to provide a simplified and unified interface to a set of interfaces in a subsystem. 
4. Managing Object Lifecycle: Proxy Pattern is helpful when you need to control access to an object, either for security purposes, to delay object creation, or to manage the object's lifecycle.
5. Hierarchical Class Structures: Composite pattern is suitable when dealing with hierarhcial class structures when clients need to treat individual objects and compositions of object uniformly.

Advantages of Structural Design Patterns (geeksforgeeks)
1. Flexibility & Adaptability: patterns make it easier to adapt to changing requirements without modifying existing code
2. Code Reusability: Components can be reused in different contexts, reducing redundancy and improving maintainability
3. Improved Scalability
4. Simplified Integration
5. Easier Maintenance
6. Solves Recurring Design Problems

Disadvantages of Structural Design Patterns (geeksforgeeks)
1. Complexity
2. Overhead
3. Maintenance Challenges: Changes to the structure of classes or relationships between objects may become more challenging when structural patterns are heavily relied upon. Modifying the structure may require updates to multiple components
4. Limited Applicability: Not all structural patterns are universally applicable. The suitability of a pattern depends on the specific requirements of the system, and using a pattern in the wrong context may lead to unnecessary complexity.

# Behavioural Pattern {{#behavioural}}

These patterns are concerned with algorithms and the assignment of responsibilities between objects. (Refactoring Guru)

Importance of Behavioural Design Patterns (geeksforgeeks)
1. Patterns characterise complex control flow that's difficult to follow at run-time
2. Patterns shift focus away from flow of control to let you concentrate just on the way objects are interconnected
3. Uses inheritance to distribute behaviour between classes.

When to use Behavioural Design Patterns (geeksforgeeks)
1. Communication Between Objects: use this patterns when you want to define how objects communicate, collaborate, and interact with each other in a flexible and reusable way.
2. Encapsulation of Behaviour: apply behavioural patterns to encapsulate algorithms, strategies or behaviours, allowing them to vary independently from the objects that use them. This promotes code reusability and maintainability.
3. Dynamic Behaviour Changes: Use behavioural patterns when you need to allow for dynamic changes in an object's behaviours at runtime without altering its code. This is particularly relevant for systems that require flexibility in behaviour.
4. State-Dependent Behaviour: State pattern is suitable when an object's behaviour depends on its internal state, and the object needs to change its behaviour dynamically as its state changes. 
5. Interactions Between Objects: Behavioural patterns are valuable when you want to model and manage interactions between objects in a way that is clear, modular and easy to understand.

Advantages of Behavioural Design Patterns (geeksforgeeks)
1. Flexibility & Adaptability: patterns enhance flexibility by allowing objects to interact in a more dynamic and adaptable way. This makes it easier to modify or extend the behaviour of a system without altering existing code.
2. Code Reusability: enabling of reuse of same behaviours across different parts of the system.
3. Separation of Concerns: These patterns contribute to the separation of concerns by dividing the responsibilities of different classes, making the codebase more modular and easier to understand.
4. Encapsulation of Algorithms: encapsulation of algorithms, strategies, or behaviour in standalone objects, making it possible to modify or extend the behaviour without affecting the client code.
5. Ease of Maintenance: With well-defined roles and responsibilities for objects, behavioural patterns contribute to easier maintenance. Changes to the behaviour can be localised, reducing the impact on the rest of the code.

Disadvantages of Behavioural Design Patterns (geeksforgeeks)
1. Increase Complexity: 
2. Over-Engineering: There is a rick of over-engineering when applying behavioural patterns where simpler solutions would suffice. Overuse of patterns may result in code that is more complex than necessary
3. Limited Applicability: Not all patterns are universally applicable. The suitability of a pattern depends on the specific requirements of the system,and using a pattern in the wrong context may lead to unnecessary complexity.
4. Code Readability
5. Scalability Concerns: As the complexity of a system increases, the scalability of a certian patterns may become a concern. 


---
**References**
- [The Catalog of Design Patterns](https://refactoring.guru/design-patterns/catalog)
- [Types of Software Design Patterns](https://www.geeksforgeeks.org/types-of-design-patterns/#types-of-design-patterns)

