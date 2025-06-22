// 부모 클래스: 학생
public class Student {
    protected String name;  // private → protected로 변경 (자식 클래스 접근 가능)

    public Student(String name) {
        this.name = name;
    }

    void intro() {
        System.out.println("안녕하세요! 저는 " + name + "입니다.");
    }
}
