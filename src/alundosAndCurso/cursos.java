package alundosAndCurso;

public class cursos {
    alunosCurso alunao;
    private String time;

    public  cursos(alunosCurso alunao) {
        this.alunao = alunao;
    }

    enum NIvelCurso{
        Basico, intermediario, avançado


    }

    public void cursoIngles(){
        this.time = "02:00";

    System.out.println("eae " +alunao.getName()+ " voce esta matriculano no curso de ingles" );
    System.out.println("seu tempo de curso é " + time);
        System.out.println("you is in nivel " + NIvelCurso.avançado);

    }
    public void cursoEspanhol(){
        this.time = "01:00";
        System.out.println("eae " +alunao.getName()+ " voce esta matriculano no curso de espanhol" );
        System.out.println("your time cursor " + time);
        System.out.println("you is in nivel " + NIvelCurso.intermediario);
    }


    public void cursoRussia(){
        this.time = "03:00";
        System.out.println("eae " +alunao.getName()+ " voce esta matriculano no curso da Russia" );
        System.out.println(" your time cursos "  + time);
        System.out.println("you is in nivel " + NIvelCurso.Basico);
    }

}
