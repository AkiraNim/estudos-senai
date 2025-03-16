
package atividadesSenaiJavaAula04;

public class Aluno {
    private String studentName, status;
    private float grade1, grade2, grade3, grade4, finalGrade;
    private int age;

    public String getStudentName() {
        return studentName;
    }
    public String getStatus() {
        return status;
    }
    public float getGrade1() {
        return grade1;
    }
    public float getGrade2() {
        return grade2;
    }
    public float getGrade3() {
        return grade3;
    }
    public float getGrade4() {
        return grade4;
    }
    public float getFinalGrade() {
        return finalGrade;
    }
    public int getAge() {
        return age;
    }
            
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGrade1(float grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(float grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    public void setGrade4(float grade4) {
        this.grade4 = grade4;
    }

    public void setFinalGrade(float finalGrade) {
        this.finalGrade = finalGrade;
    }
   
    public void setAge(int age) {
        this.age = age;
    }
    
    public void nomeAluno(String studentName){
        this.setStudentName(studentName);
    }
    public void notaAluno(){
        this.setFinalGrade((this.getGrade1()+this.getGrade2()+this.getGrade3()+this.getGrade4())/4);
    }
    public void recuperacao(){
        String status;
        if(this.getFinalGrade()==5){
            status="Recuperação, estude pois ainda tem saida.";
            this.setStatus(status);
        }
        else if(this.getFinalGrade()>=7){
            status="Você passou, parabens!";
            this.setStatus(status);
        }
        else{
            status="Voce perdeu de ano, espero que seja simpatico o suficiente pra passar no conselho :)";
            this.setStatus(status);
        }
    }
}
