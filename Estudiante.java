public class Estudiante{

    static int carne;
    public Estudiante(int carne){
        this.carne = carne;
    }

    public static void comerSinHambre(boolean hambriento){
        if(hambriento){
            int hamburguesas =2;
        }
        System.out.println("a"+carne+""+hamburguesas);
    }
    public static void main(String[]args){
        System.out.println("ss");
        comerSinHambre(false);
    }

}