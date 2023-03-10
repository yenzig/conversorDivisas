
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {

        byte select=0;
        byte option=0;
        double dolar=18.5;
        double euro=19.0;
        double libraUk=21.90;
        double yenJpns=0.13;
        double wongSthK=0.014;

        do{
            select=Byte.parseByte(JOptionPane.showInputDialog("CONVERSOR DE DIVISAS\n"
                                                                +"1.Convertir Pesos Mex. A Dólares\n"
                                                                +"2.Convertir Pesos Mex. A Euros\n"
                                                                +"3.Convertir Pesos Mex. A Libras UK\n"
                                                                +"4.Convertir Pesos Mex. A Yen Japones\n"
                                                                +"5.Convertir Pesos Mex. A Wong Sth. Korea\n"
                                                                +"6.SALIR "));

            switch (select){

                case 1:
                    option=Byte.parseByte(JOptionPane.showInputDialog("Convertir Pesos Mex. A Dólares EU. [Presione: 1]\n"+" Convertir Dólares EU. A Pesos Mex. [Presione: 2]"));

                    if(option==2){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Dolares:"));
                        JOptionPane.showMessageDialog(null,"Pesos Mex: "+amaunt*dolar);
                    }else if(option==1){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Pesos:"));
                        JOptionPane.showMessageDialog(null,"Dolares EU : "+amaunt/dolar);
                    }else   JOptionPane.showMessageDialog(null,"!!! OPCION NO PERMITIDA");
                    break;

                case 2:
                    option=Byte.parseByte(JOptionPane.showInputDialog("Convertir Pesos Mex. A Euros [Presione: 1]\n"+" Convertir Euros A Pesos Mex. [Presione: 2]"));

                    if(option==2){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Euros:"));
                        JOptionPane.showMessageDialog(null,"Pesos Mex: "+ amaunt*euro);
                    }else if(option==1){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Pesos:"));
                        JOptionPane.showMessageDialog(null,"Euros : " + amaunt/euro);
                    }else   JOptionPane.showMessageDialog(null,"!!! OPCION NO PERMITIDA");
                    break;

                case 3:
                    option=Byte.parseByte(JOptionPane.showInputDialog("Convertir Pesos Mex. A Libra Esterlina UK. [Presione: 1]\n"+" Convertir Libra Esterlina UK. A Pesos Mex. [Presione: 2]"));

                    if(option==2){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Libras UK:"));
                        JOptionPane.showMessageDialog(null,"Pesos Mex: "+ amaunt*libraUk);
                    }else if(option==1){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Pesos:"));
                        JOptionPane.showMessageDialog(null,"Libras UK: " + amaunt/libraUk);
                    }else   JOptionPane.showMessageDialog(null,"!!! OPCION NO PERMITIDA");
                    break;

                case 4:
                    option=Byte.parseByte(JOptionPane.showInputDialog("Convertir Pesos Mex. A Yen Japones [Presione: 1]\n"+" Convertir Yen Japones A Pesos Mex. [Presione: 2]"));

                    if(option==2){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Yen Japones:"));
                        JOptionPane.showMessageDialog(null,"Pesos Mex: "+ amaunt*yenJpns);
                    }else if(option==1){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Pesos:"));
                        JOptionPane.showMessageDialog(null,"Yen Japones: " + amaunt/yenJpns);
                    }else   JOptionPane.showMessageDialog(null,"!!! OPCION NO PERMITIDA");
                    break;

                case 5:
                    option=Byte.parseByte(JOptionPane.showInputDialog("Convertir Pesos Mex. A Wong Sth. Korea [Presione: 1]\n"+" Convertir Wong Sth. Korea A Pesos Mex. [Presione: 2]"));

                    if(option==2){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Wong Sth. Korea:"));
                        JOptionPane.showMessageDialog(null,"Pesos Mex: "+ amaunt*wongSthK);
                    }else if(option==1){
                        double amaunt;
                        amaunt=Double.parseDouble(JOptionPane.showInputDialog("Pesos Mex:"));
                        JOptionPane.showMessageDialog(null,"Wong Sth. Korea: " + amaunt/wongSthK);
                    }else   JOptionPane.showMessageDialog(null,"!!! OPCION NO PERMITIDA");
                    break;
                case 6:
                    select=6;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opcion No Valida");
                    break;
            }
        }while (select!=6);
        System.exit(0);





    }




}
