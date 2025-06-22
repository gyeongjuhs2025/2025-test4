public class Class2 extends Student {
    String clip;
    // 생성자에서 이름 전달
    public Class2(String name) {
        super(name);  // 부모 클래스의 생성자 호출
    }

    void clip활동하다() {
        System.out.println(name + " 학생이 " + clip + " 활동에 참여하고 있습니다.");
    } 
}
