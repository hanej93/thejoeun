package day0319.list2;

public class Student {
    private String name;
    private int age;
    private int kor;
    private int eng;
    private int math;

    //생성자
    public Student(String name, int age, int kor, int eng, int math) {
        this.name = name;
        this.age= age;
        this.kor= kor;
        this.eng= eng;
        this.math= math;
    }

    //setter 구현
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.name = age;
    }
    public void setKor(String kor) {
        this.name = kor;
    }
    public void setEng(String eng) {
        this.name = eng;
    }
    public void setMath(String math) {
        this.name = math;
    }

    //getter 구현
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "\n\n\n\n이름 :" + name + "\n나이 : " + age + "\n국어성적 : " + kor + "\n영어성적 : " + eng + "\n수학성적 : " + math;
    }

}