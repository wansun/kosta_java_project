package step1;
class Animal{
   public void eat() {
      System.out.println("먹다");
   }
}
class Person extends Animal{
   //메서드 오버라이딩 : 부모 메서드를 자신에 맞게 수정 
   public void eat() {
      System.out.println("사람이 수저로 먹다");
   }
}
class Car{} //Animal 계층 구조에 없는 클래스 
public class TestPolymorphism1 {
   public static void main(String[] args) {
      //일반적으로 객체는 자신의 클래스명을 타입으로 한다 
      Animal a=new Animal();
      //아래 코드는 컴파일 에러, 객체와 타입이 다르다 
      //Car c=new Animal();
      //아래는 가능하다. 자식 객체를 부모 타입의 변수에 참조가능
      Animal a2=new Person();
      a.eat();
      a2.eat();//오버라이딩된 Person의 eat메서드가 실행된다 
      
   }
}
