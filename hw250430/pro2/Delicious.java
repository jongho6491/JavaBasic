package hw250430.pro2;

// Edible과 Sweetable을 통합한 Delicious 인터페이스 정의
public interface Delicious extends Edible, Sweetable {
  // 두 인터페이스의 메서드를 모두 가지므로 추가적인 메서드는 필요 없다.
}