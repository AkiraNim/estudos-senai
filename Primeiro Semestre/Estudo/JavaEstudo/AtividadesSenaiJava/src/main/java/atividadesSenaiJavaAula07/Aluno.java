
package atividadesSenaiJavaAula07;

public class Aluno {
    private String studentName, status;
    private float grade1, grade2, finalGrade;
    
    
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public void setGrade1(float grade1){
        this.grade1=grade1;
    }
    public void setGrade2(float grade2){
        this.grade2=grade2;
    }
    public void setFinalGrade(float finalGrade){
        this.finalGrade=finalGrade;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
    public String getStatus(){
        return this.status;
    }
    public float getGrade1(){
        return this.grade1;
    }
    public float getGrade2(){
        return this.grade2;
    }
    public float getFinalGrade(){
        return this.finalGrade;
    }
    
    public void nomeAluno(String studentName){
        this.setStudentName(studentName);
    }
    public void notaAluno(){
        this.setFinalGrade((this.getGrade1()+this.getGrade2())/2);
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
