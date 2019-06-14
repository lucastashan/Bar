public class Pessoa{
    private String name;
    private int cpf, age;
    private Gender gender;

    public Pessoa(String name, int cpf, int age, Gender gender){
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.gender = gender;
    }

    public Gender getGender(){
        return gender;
    }
    
    public int getCpf(){
        return cpf;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}