# Java Exercises


## Exercise 1: 

```java
    @GET
    @Produces("text/plain")
    public String sayHello() {

        return "Hello from JAX-RS";
    }
```

## Expected output
![alt text](https://github.com/Aymen-Moulehi/Learning-REST-API-Web-Services-using-JAX-RS/blob/master/src/main/resources/Screenshot%20from%202023-02-19%2013-48-47.png?raw=true)

## Exercise 2: 

```java


    @Path("firstName={firstNameValue}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWithFirstName(@PathParam(value = "firstNameValue") String firstName) {
        if(firstName != null)
            return "Hello from " + firstName;
        return "First Name contain a null value";

    }

```

## Expected output
![alt text](https://github.com/Aymen-Moulehi/Learning-REST-API-Web-Services-using-JAX-RS/blob/master/src/main/resources/Screenshot%20from%202023-02-19%2013-49-16.png?raw=true)

## Exercise 3: 

```java
    @Path("firstName={firstNameValue}&lastName={lastNameValue}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloWithFirstNameAndLastName(
            @PathParam(value = "firstNameValue") String firstName,
            @PathParam(value = "lastNameValue") String lastName) {
        if(firstName != null && lastName != null)
            return "Hello from "+firstName+" "+lastName;
        return "First Name or Last Name contain a null value";

    }

```

## Expected output
![alt text](https://user-images.githubusercontent.com/75182456/219950741-85597db5-f4ef-4736-b3d0-18815f2cc484.png)
