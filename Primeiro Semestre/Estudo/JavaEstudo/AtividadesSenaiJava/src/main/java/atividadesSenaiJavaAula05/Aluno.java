package atividadesSenaiJavaAula05;

public class Aluno {
	private String studentName;
	private float grade1;
	private float grade2;
	private float grade3;
	private float arithmeticOdd;
	private int age;
        
        public void setStudentName(String name){
            this.studentName=name;
        }
        public void setGrade1(float grade1){
            this.grade1 = grade1;
        }
        public void setGrade2(float grade2){
            this.grade2 = grade2;
        }
        public void setGrade3(float grade3){
            this.grade3 = grade3;
        }
        public void setArithmeticOdd(float arithmeticOdd){
            this.arithmeticOdd = arithmeticOdd;
        }
        public void setAge(int age){
            this.age = age;
        }
        
        public String getStudentName(){
            return this.studentName;
        }
        public float getGrade1(){
            return this.grade1;
        }
        public float getGrade2(){
            return this.grade2;
        }
        public float getGrade3(){
            return this.grade3;
        }
        public float getArithmeticOdd(){
            return this.arithmeticOdd;
        }
        public int getAge(){
            return this.age;
        }
	
        public void nomeAluno(String name){
            this.setStudentName(name);
        }
        public void notaAluno(float grade1, float grade2, float grade3){
            this.setGrade1(grade1);
            this.setGrade2(grade2);
            this.setGrade3(grade3);
            this.setGrade3(grade3);
            this.setArithmeticOdd((this.getGrade1()+this.getGrade2()+this.getGrade3())/3);
        }
}
