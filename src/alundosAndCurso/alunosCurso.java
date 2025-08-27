package alundosAndCurso;

public class alunosCurso {
        private String name;
        private int age;
        private int registration;
        private String NameCursor;




    public  alunosCurso(String name, int age, int registration, String NameCursor ){
            this.name = name;
            this.age = age;
            this.registration = registration;
            this.NameCursor = NameCursor;




        }
    public String getNameCursor() {
        return NameCursor;
    }

    public void setNameCursor(String nameCursor) {
        NameCursor = nameCursor;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }
}
