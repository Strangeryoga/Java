* Basics of Java

1. Explain JDK, JRE and JVM?
2. Why Java is platform independent?
3. Why java is not 100% Object oriented?
4. Explain the Features of java?
5. What is local variable and global variable?
6. What is static block and non-static block?
7. What is class loading operation and object loading operation?
8. What is this and super keyword?
9. What are constructors in java?
10. What is class and Objects?

* Questions related to main method In Java

11. Why main method is a static method?
12. Can we overload the main method?
13. Can we override the main method?
14. Can we write static public void main(String[] args)?
15. Why does main method have String array as an argument?
16. Can we make main method as final?
17. Can we have a class without main method?
18. Can we execute the class without the main method?
19. Can we create a method inside main method?
20. Can we make main method as private?
21. Can we call main method explicitly?
22. Can we return any value from main method?

* Object Oriented Programming

23. What are the main features of OOPs in java?
24. What is Polymorphism?
25. What is Inheritance in java?
26. What is Encapsulation in java?
27. What is Abstraction and how many ways it can be achieved?
28. What is this and super calling statement?
29. What is constructor chaining statement?
30. Explain the difference between method overloading & method
    overriding?

31. What is constructor overloading?
32. Is it possible to override constructor?
33. What is diamond problem in inheritance?
34. What is Compile time polymorphism and how it is different from
    run time polymorphism?

35. What do you understand by upcasting and downcasting?
36. What is variable shadowing and method shadowing?
37. Difference between abstract class & interface?
38. Can we write main method inside an interface in Java?
39. How we can achieve multiple inheritance by using interface
    concept?

40. What are the access modifiers ?
41. What is marker interface?
    Inbuilt Classes

42. What is Object class and its methods?
43. What is array and String?
44. When we will get ArrayIndexOutOfBoundsException and
    NegativeArraySizeException?

45. What is difference between " equals() " and " == " in java?
    Ans. equals() – it is a method present in Object class which is used to
    compare the address of two objects. It can be overridden and can be used
    to compare the state of the object.
    (==) Equality Operator – It is an operator used to compare address of 2
    object.

46. What is String and explain atleast 6 inbuilt methods of String?
47. Why String is immutable?
48. String class can be inherited by any other class?
49. Why String class is final?
50. What is String vs String buffer vs String builder?
    String Buffer: -
    It is a final class extending object class and implementing
    CharSequence, Serializable and Appendable interfaces.
    • String Buffer is a ‘mutable’ class, we can modify the values present
      inside the created object.
    • String Buffer is synchronized and it is thread safe.
      String Builder: -
    • It is a final class extending object class and implementing
      CharSequence, Serializable and Appendable interfaces.
    • StringBuilder is unsynchronized and it is thread unsafe.

* Exception & Exception Handling

51. Difference between Error and Exception?
52. Explain Java Exception Hierarchy?
53. What is checked exception and unchecked exception and its
    examples?

54. What is difference between throw and throws keyword in java?
55. How to write custom exceptions in java and why we need custom
    exception?

56. Without having catch block, is it possible to have only try block and
    finally block?

57. Why we need finally block?
58. What is the purpose of printStackTrace()?
59. Is it possible to keep any statements in between try , catch and
    finally block?

60. Is it possible to only include a try block without the catch and finally
    block?


* Collection and Map

61. What is the advantages of Collection over Array?
62. What is Collection and its hierarchy?
63. What is List and Explain its implementation classes?
64. Difference between Arraylist & LinkedList vs Vector?
65. What is doubly-linked list concept?
66. Why we go with Set and what is the difference between List & Set?
67. Difference between Hashset & LinkedHashset?
68. Explain Treeset?
69. What is Queue and explain its implementation classes?
70. What is Iterator and why we use?
71. Difference between Iterator & ListIterator?
72. What is Map and explain its implementation classes?
73. Difference between Hashmap vs LinkedHashmap?
74. What is Treemap?
75. If we use duplicate key with some value in map what will happen?
76. Why hashMap does not comes under collection?
    Ans. Collection has a method add(Object o). Map can not have such method
    because it need key-value pair. There are other reasons also such as Map
    supports keySet, valueSet etc. Collection classes does not have such
    views. Due to such big differences, Collection interface was not used in
    Map interface, and it was built in separate hierarchy.

* Advanced Questions

77. What is multi-threading?
    Ans. Multithreading in Java is a process of executing multiple threads
    simultaneously.
    A thread is a lightweight sub-process, the smallest unit of processing.
    Multiprocessing and multithreading, both are used to achieve
    multitasking.
    However, we use multithreading than multiprocessing because threads
    use a shared memory area. They don't allocate separate memory area so
    saves memory, and context-switching between the threads takes less
    time than process.

78. What is difference between Thread and runnable?
    Ans. 
    Thread
    • Thread is a class. It is used to create a thread.
    • It has multiple methods including start() and run()
    • Each thread creates a unique object and gets associated with it.
    Runnable
    • Runnable is a functional interface which is used to create a thread.
    • It has only abstract method run()
    • Multiple threads share the same objects.

79. What is Synchronization?
    Ans - Synchronization in java is the capability to control the access of
    multiple threads to any shared resource.
    Java Synchronization is better option where we want to allow only one
    thread to access the shared resource.
    The synchronization is mainly used to
    1. To prevent thread interference.
    2. To prevent consistency problem.

80. What is difference between sleep() and wait()?
    Ans. Wait() - The thread releases ownership of this monitor and waits
    until another thread notifies threads waiting on this object's monitor to
    wake up either through a call to the notify() method or the notifyAll()
    method. The thread then waits until it can re-obtain ownership of the
    monitor and resumes execution.
    Sleep() - This method causes the currently executing thread to sleep
    (temporarily cease execution) for the specified number of milliseconds.
    The thread does not lose ownership of any monitors. It sends the current
    thread into the “Not Runnable” state for a specified amount of time.

81. Difference between final and finally and finalize ?
82. Define System.out.println() ?
83. What is Destructor?
84. What is dynamic method dispatch?
85. What is copy constructor?

86. What is file handling?
    Ans. File Handing in java comes under IO operations. Java IO
    package java.io classes are specially provided for file handling in java.
    Some of the common file handling operations are:
    • Create file
    • Delete file
    • Read file
    • Write file
    • Change file permissions