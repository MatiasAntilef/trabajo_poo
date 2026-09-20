import classes.Alimento;
import classes.Fruta;
import classes.Verdura;
import controller.Biblioteca;

void main() {
    Biblioteca b = new Biblioteca();
    int op=0;
    boolean flag = true;
    Fruta fruta;
    Verdura verdura;


    while(flag){
        Scanner sc = new Scanner(System.in);

        System.out.println("----Menu----");
        System.out.println("1.-Agregar alimento\n2.-Listar alimentos\n3.-Buscar alimento\n4.-Salir");
        System.out.println("------------");

        try{
            op=sc.nextInt();
            sc.nextLine();

            if(op==1){

                System.out.println("Ingrese codigo");
                String codigo = sc.nextLine();

                System.out.println("Ingrese precio base");
                double precioBase = sc.nextDouble();

                System.out.println("El alimento es una fruta o una verdura?\n1.-Fruta\n2.-Verdura");
                try{

                    op=sc.nextInt();
                    sc.nextLine();

                    if(op==1){
                        System.out.println("Ingrese país de origen: ");
                        String paisDeOrigen = sc.nextLine();

                        System.out.println("Ingrese temporada de cultivo");
                        String temporadaDeCultivo = sc.nextLine();

                        fruta = new Fruta(codigo, precioBase, paisDeOrigen, temporadaDeCultivo);
                        b.agregar(fruta);

                    } else if (op==2) {
                        System.out.println("Son organicas? (true/false)");
                        Boolean sonOrganicas = sc.nextBoolean();

                        sc.nextLine();

                        System.out.println("Ingrese contenido nutricional");
                        String contenidoNutricional = sc.nextLine();

                        verdura = new Verdura(codigo, precioBase,sonOrganicas , contenidoNutricional);
                        b.agregar(verdura);
                    }else {
                        System.out.println("Ingrese una opción válida");
                    }

                }catch (Exception e){
                    System.out.println(e);
                }

            }else if(op ==2){
                b.listar();

            }else if(op==3){
                System.out.println("Ingrese el codigo del alimento que busca");
                String buscarCodigo = sc.nextLine();

                String alimentoBuscado=b.buscarALimento(buscarCodigo);

                System.out.println(alimentoBuscado);




            }else if(op==4){
                flag=false;
            }
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }




}
