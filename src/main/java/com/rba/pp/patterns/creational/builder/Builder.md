### UTILITY

- Reduces the complex object creation


- Helps implement an object build order


- Helps avoid using the 'telescopic constructor pattern' (anti-pattern)
  - public House(String foundation, String structure) {...}
  - public House(String foundation, String structure, String roof){...}
  - public House(String foundation, String structure, String roof, boolean painted){...}
  - ...


### HOW TO?
#### Product
- Class that represents the product to create.

#### Builder
- Interface to build the parts of a product.

#### ConcreteBuilder
- Concrete classes that implement Builder

#### Director  
- Class that directs a builder to perform the steps in the order

### MORE
@Builder implements the pattern easily
