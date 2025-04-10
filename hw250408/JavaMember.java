package hw250408;

public class JavaMember {
    public static void main(String[] args) {
       
        Member member = new Member("홍수찬", "hong", "password123", 30);
        
        System.out.println("이름: " + member.getName());
        System.out.println("아이디: " + member.getId());
        System.out.println("암호: " + member.getPassword());
        System.out.println("나이: " + member.getAge());

        
        member.setName("김수철");
        member.setId("kim");
        member.setPassword("newpassword456");
        member.setAge(25);

        System.out.println("변경된 이름: " + member.getName());
        System.out.println("변경된 아이디: " + member.getId());
        System.out.println("변경된 암호: " + member.getPassword());
        System.out.println("변경된 나이: " + member.getAge());
    }
}
