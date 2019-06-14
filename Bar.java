import java.util.List;
import java.util.LinkedList;

public class Bar{
    private List<Pessoa> lista = new LinkedList<Pessoa>();

    public void entrar(String name, int cpf, int age, Gender gender){
        lista.add(new Pessoa(name,cpf,age,gender));
    }

    public void pessoasNoBar(){
        System.out.println("Pessoas no bar");
        for(Pessoa p:lista){
            System.out.println(p.getName());
        }
    }

    public boolean pessoaCpf(int cpf){
        for(Pessoa p:lista){
            if(p.getCpf()==cpf) return true;
        }
        return false;
    }

    public void sair(int cpf){
        for (Pessoa p : lista) {
            if(p.getCpf() == cpf) {
                lista.remove(p);
                return;
            }
        }
    }

    public String distribGenero(){
        int h = 0;
        for (Pessoa p : lista) {
            if(p.getGender().equals(Gender.MALE)){
                h++;
            }
        }
        double total = lista.size();
        return (h/total)*100 + "% homens e " + ((total-h)/total)*100 + "% mulheres";
    }

    public void print(){
        for ( Pessoa p : lista) {
            System.out.println(p.getName()+" "+p.getCpf()+" "+p.getAge()+" "+p.getGender());
        }
    }
}