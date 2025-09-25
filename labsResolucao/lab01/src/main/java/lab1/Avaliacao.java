package lab1;

public class Avaliacao {
    private int matricula;
    private int presenca = 12;
    private float nota1;
    private float nota2;
    private float sub;
    public static float notaMinima = 6; //altera para todos objetos
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getPresenca() {
        return presenca;
    }
    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getSub() {
        return sub;
    }
    public void setSub(float sub) {
        this.sub = sub;
    }
    public static float getNotaMinima() {
        return notaMinima;
    }
    public static void setNotaMinima(float notaMinima) {
        Avaliacao.notaMinima = notaMinima;
    }

    public float media()
    {   
        return Math.max( ((nota1+nota2)/2) , (Math.max(nota1, nota2) + sub)/2  );   
    }

    public boolean aprovado()
    {
        return (presenca > 12 && this.media() >= notaMinima);
    }

}
