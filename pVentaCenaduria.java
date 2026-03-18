import java.util.Scanner;
public class pVentaCenaduria {

    public static void main(String[] args){
        int nPlatillo=0, cPlatillo=0, subtotal=0, pUnitario = 0; 
        double des=0;
        String estudiante, platillo="";
        Scanner scan = new Scanner(System.in);
        //Menu
        System.out.println("+++Menu Cenaduría+++");
        System.out.println("1. Tostada de Lomo ($65).");
        System.out.println("2. Sopitos ($50)");
        System.out.println("3. Enchiladas ($70)");
        System.out.println("4. Pozole ($85)");
        System.out.print("Elige el número de platillo (1-4):");
        nPlatillo = scan.nextInt();
        System.out.print("Cantidad de platillos:");
        cPlatillo = scan.nextInt();
        System.out.print("¿Eres estudiante? (Si/No):");
        estudiante = scan.next();
       

        switch (nPlatillo) {
            case 1:
                System.out.println("1. Tostada de Lomo ($65).");
                pUnitario=65;
                subtotal = cPlatillo*pUnitario;
                platillo = "Tostada de Lomo";
                break;
            case 2:
                System.out.println("2. Sopitos ($50).");
                pUnitario=50;
                subtotal = cPlatillo*pUnitario;
                platillo = "Sopitos";
                break;
            case 3:
                System.out.println("3. Enchiladas ($70).");
                pUnitario=70;
                subtotal = cPlatillo*pUnitario;
                platillo = "Enchiladas";
                break;
            case 4:
                System.out.println("4. Pozole ($85).");
                pUnitario=85;
                subtotal = cPlatillo*pUnitario;
                platillo = "Pozole";
                break;
            default:
                System.out.println("Error número equivocado...");
                break;
        }
      
        if(estudiante.equals("Si")) //|| estudiante=="si" || estudiante=="sI" || estudiante=="SI")
        {
            des = subtotal*0.10;
        }else{
            des = 0;
        }
        
        System.out.println();
        System.out.println("***Ticket de Venta***");
        System.out.println("Platillo:" + platillo);
        System.out.println("Cantidad:" + cPlatillo);
        System.out.println("Precio Unitario:" + pUnitario);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Descuento Estudiante (10%):" + des);
        System.out.println("Total a Pagar:" + (subtotal-des));


        /*--- TICKET DE VENTA ---
Platillo: Plato de Pozole
Cantidad: 2
Precio Unitario: $85.00
Subtotal: $170.00
Descuento Estudiante (10%): -$17.00
TOTAL A PAGAR: $153.00
-----------------------  */
        

    }
}
