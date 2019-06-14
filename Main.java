
public class Main{
    public static void main(String[] args){

        Bar barDoXico = new Bar();

        //barDoXico.pessoasNoBar();
        barDoXico.entrar("Lucas",156416,21,Gender.MALE);
        barDoXico.entrar("joão",216416,11,Gender.MALE);
        barDoXico.entrar("Luiza",143216,21,Gender.FEMALE);
        //barDoXico.pessoasNoBar();
        barDoXico.entrar("Larissa",156786,21,Gender.FEMALE);
        barDoXico.entrar("Luizinho",1531216,21,Gender.MALE);
        barDoXico.entrar("Douglas",1831346,41,Gender.MALE);
        //barDoXico.pessoasNoBar();
        //System.out.println(barDoXico.pessoaCpf(321321));
        //System.out.println(barDoXico.pessoaCpf(156786));
        System.out.println(barDoXico.distribGenero());
        barDoXico.sair(216416);
        barDoXico.sair(216411);
        barDoXico.sair(1831346);


        barDoXico.print();
    }
}