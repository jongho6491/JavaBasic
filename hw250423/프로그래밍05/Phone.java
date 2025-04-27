package prgram6CaHap05;

public class Phone {
     protected String owner;
     void talk() {
    	 System.out.println(owner + "가 통화 중");
     }
     public Phone(String owner) {
    	 this.owner = owner;
     }
}
