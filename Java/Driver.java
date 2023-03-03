package Java;

class Driver extends Account{
  String userId;
  Integer age;

 public Driver(String userId,  Integer age, String name, String document){
  super(name, document);
  this.userId = userId;
  this.age = age;
 } 
}