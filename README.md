This project demonstrates that the java compiler will not fail the same way whether the compilation fails: 
1. because of 1 _unwrapped_ repeatable annotation   
or
2. because of 2 _wrapped_ repeatable annotations  
or 
3. because of 2 _unwrapped repeatable annotations

In case 1 and 2, despite the compilation failure, `MyEntity_.java` will be generated by `hibernate-jpamodelgen` annotation processor.
In case 3, the compilation failure will prevent any annotation processor from running, leading to the absence of `MyEntity_.java`.

You can verify the different behaviour yourself by checking out one of the 3 branches (1 branch per case) then running `./mvnw clean package`.
