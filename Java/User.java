package Java;

class User extends Account{
  String userId;
  Integer age;

 public User(String userId,  Integer age, String name, String document){
  super(name, document);
  this.userId = userId;
  this.age = age;
 } 

  
}
