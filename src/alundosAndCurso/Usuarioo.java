package alundosAndCurso;

public class Usuarioo {
    public static void main(String[] args) {
        alunosCurso usuarioCurso = new alunosCurso("Kalleo",17,82996499, "espanhol");

            cursos Cursos = new cursos(usuarioCurso);



        if (usuarioCurso.getNameCursor().equalsIgnoreCase("ingles")) {

           Cursos.cursoIngles();

        }
        if (usuarioCurso.getNameCursor().equalsIgnoreCase("espanhol")) {

            Cursos.cursoEspanhol();

        }
        if (usuarioCurso.getNameCursor().equalsIgnoreCase("russia")) {

            Cursos.cursoRussia();

        }

    }
}

