package prgram6CaHap02;

public class Person  {
  String name;
  int age;
  String show() {
	  return "사람[이름 : " + name + ", 나이 : " + age + "]";
  }
  String getPersonName() {
	  return name;
	  
  }
  int getPersonage() {
	  return age;
  }
  public Person(String name, int age) {
	  this.name = name;
	  
	  this.age = age;
  }
}
