package taller1;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        String PALABRA1 = JOptionPane.showInputDialog(null, "INSERTE PALABRA 1");// PEDIMOS PALABRAS
        String PALABRA2 = JOptionPane.showInputDialog(null, "INSERTE PALABRA 2");
        String PALABRA3 = JOptionPane.showInputDialog(null, "INSERTE PALABRA 3");
        String PALABRA4 = JOptionPane.showInputDialog(null, "INSERTE PALABRA 4");
        String PALABRA5 = JOptionPane.showInputDialog(null, "INSERTE PALABRA 5");

        char[] pal1 = PALABRA1.toCharArray(); // CONVERTIMOS EN CHAR
        char[] pal2 = PALABRA2.toCharArray();
        char[] pal3 = PALABRA3.toCharArray();
        char[] pal4 = PALABRA4.toCharArray();
        char[] pal5 = PALABRA5.toCharArray();

        System.out.print("PALABRA 1: ");// IMPRIME PALABRAS
        for (int i = 0; i < pal1.length; i++) {
            System.out.print(pal1[i]);
        }
        System.out.println(" ");
        System.out.print("PALABRA 2: ");
        for (int i = 0; i < pal2.length; i++) {
            System.out.print(pal2[i]);
        }
        System.out.println(" ");
        System.out.print("PALABRA 3: ");
        for (int i = 0; i < pal3.length; i++) {
            System.out.print(pal3[i]);
        }
        System.out.println(" ");
        System.out.print("PALABRA 4: ");
        for (int i = 0; i < pal4.length; i++) {
            System.out.print(pal4[i]);
        }
        System.out.println(" ");
        System.out.print("PALABRA 5: ");
        for (int i = 0; i < pal5.length; i++) {
            System.out.print(pal5[i]);
        }
        System.out.println(" ");

        boolean pall1 = false;
        boolean pall2 = false;
        boolean pall3 = false;
        boolean pall4 = false;
        boolean pall5 = false;

        for (int i = 0; i < pal1.length; i++) { // COMPARA LETRAS DE PRIMERA PALABRA CON LAS SIGUIENTES PALABRAS

            for (int j = 0; j < pal2.length; j++) {
                if (pal1[i] == pal2[j] && !pall2) {
                    JOptionPane.showMessageDialog(null, PALABRA1 + " COMBINA CON " + PALABRA2 + " EN LA " + pal1[i]);
                    System.out.println(PALABRA1 + " COMBINA CON " + PALABRA2 + " EN LA " + pal1[i]);

                    pal1[i] = ' ';
                    pal2[j] = ' ';
                    pall2 = true;
                    break;

                }

            }
            for (int j = 0; j < pal3.length; j++) {
                if (pal1[i] == pal3[j] && !pall3) {
                    JOptionPane.showMessageDialog(null, PALABRA1 + " COMBINA CON " + PALABRA3 + " EN LA " + pal1[i]);
                    System.out.println(PALABRA1 + " COMBINA CON " + PALABRA3 + " EN LA " + pal1[i]);

                    pal1[i] = ' ';
                    pal3[j] = ' ';
                    pall3 = true;
                    break;
                }
            }
            for (int j = 0; j < pal4.length; j++) {
                if (pal1[i] == pal4[j] && !pall4) {
                    JOptionPane.showMessageDialog(null, PALABRA1 + " COMBINA CON " + PALABRA4 + " EN LA " + pal1[i]);
                    System.out.println(PALABRA1 + " COMBINA CON " + PALABRA4 + " EN LA " + pal1[i]);

                    pal1[i] = ' ';
                    pal4[j] = ' ';
                    pall4 = true;
                    break;

                }
            }
            for (int j = 0; j < pal5.length; j++) {
                if (pal1[i] == pal5[j] && !pall5) {
                    JOptionPane.showMessageDialog(null, PALABRA1 + " COMBINA CON " + PALABRA5 + " EN LA " + pal1[i]);
                    System.out.println(PALABRA1 + " COMBINA CON " + PALABRA4 + " EN LA " + pal1[i]);

                    pal1[i] = ' ';
                    pal5[j] = ' ';
                    pall5 = true;
                    break;

                }
            }
        }

        for (int i = 0; i < pal2.length; i++) { // COMPARA LETRAS DE SEGUNDA PALABRA CON LAS SIGUIENTES PALABRAS

            for (int j = 0; j < pal1.length; j++) {
                if (pal2[i] == pal1[j] && !pall1) {
                    JOptionPane.showMessageDialog(null, PALABRA2 + " COMBINA CON " + PALABRA1 + " EN LA " + pal2[i]);
                    System.out.println(PALABRA2 + " COMBINA CON " + PALABRA2 + " EN LA " + pal2[i]);

                    pal2[i] = ' ';
                    pal1[j] = ' ';
                    pall1 = true;
                    break;

                }

            }
            for (int j = 0; j < pal3.length; j++) {
                if (pal2[i] == pal3[j] && !pall3) {
                    JOptionPane.showMessageDialog(null, PALABRA2 + " COMBINA CON " + PALABRA3 + " EN LA " + pal2[i]);
                    System.out.println(PALABRA2 + " COMBINA CON " + PALABRA3 + " EN LA " + pal2[i]);

                    pal2[i] = ' ';
                    pal3[j] = ' ';
                    pall3 = true;
                    break;

                }
            }
            for (int j = 0; j < pal4.length; j++) {
                if (pal2[i] == pal4[j] && !pall4) {
                    JOptionPane.showMessageDialog(null, PALABRA2 + " COMBINA CON " + PALABRA4 + " EN LA " + pal2[i]);
                    System.out.println(PALABRA2 + " COMBINA CON " + PALABRA4 + " EN LA " + pal2[i]);

                    pal2[i] = ' ';
                    pal4[j] = ' ';
                    pall4 = true;
                    break;

                }
            }
            for (int j = 0; j < pal5.length; j++) {
                if (pal2[i] == pal5[j] && !pall5) {
                    JOptionPane.showMessageDialog(null, PALABRA2 + " COMBINA CON " + PALABRA5 + " EN LA " + pal2[i]);
                    System.out.println(PALABRA2 + " COMBINA CON " + PALABRA5 + " EN LA " + pal2[i]);

                    pal2[i] = ' ';
                    pal5[j] = ' ';
                    pall5 = true;
                    break;

                }
            }
        }
        for (int i = 0; i < pal3.length; i++) { // COMPARA LETRAS DE PRIMERA PALABRA CON LAS SIGUIENTES PALABRAS

            for (int j = 0; j < pal2.length; j++) {
                if (pal3[i] == pal2[j] && !pall2) {
                    JOptionPane.showMessageDialog(null, PALABRA3 + " COMBINA CON " + PALABRA2 + " EN LA " + pal3[i]);
                    System.out.println(PALABRA3 + " COMBINA CON " + PALABRA2 + " EN LA " + pal3[i]);

                    pal3[i] = ' ';
                    pal2[j] = ' ';
                    pall2 = true;
                    break;

                }

            }
            for (int j = 0; j < pal1.length; j++) {
                if (pal3[i] == pal1[j] && !pall1) {
                    JOptionPane.showMessageDialog(null, PALABRA3 + " COMBINA CON " + PALABRA1 + " EN LA " + pal3[i]);
                    System.out.println(PALABRA3 + " COMBINA CON " + PALABRA1 + " EN LA " + pal3[i]);

                    pal3[i] = ' ';
                    pal1[j] = ' ';
                    pall1 = true;
                    break;

                }
            }
            for (int j = 0; j < pal4.length; j++) {
                if (pal3[i] == pal4[j] && !pall4) {
                    JOptionPane.showMessageDialog(null, PALABRA3 + " COMBINA CON " + PALABRA4 + " EN LA " + pal3[i]);
                    System.out.println(PALABRA3 + " COMBINA CON " + PALABRA4 + " EN LA " + pal3[i]);

                    pal3[i] = ' ';
                    pal4[j] = ' ';
                    pall4 = true;
                    break;

                }
            }
            for (int j = 0; j < pal5.length; j++) {
                if (pal3[i] == pal5[j] && !pall5) {
                    JOptionPane.showMessageDialog(null, PALABRA3 + " COMBINA CON " + PALABRA5 + " EN LA " + pal3[i]);
                    System.out.println(PALABRA3 + " COMBINA CON " + PALABRA5 + " EN LA " + pal3[i]);

                    pal3[i] = ' ';
                    pal5[j] = ' ';
                    pall5 = true;
                    break;

                }
            }
        }
        for (int i = 0; i < pal4.length; i++) { // COMPARA LETRAS DE PRIMERA PALABRA CON LAS SIGUIENTES PALABRAS

            for (int j = 0; j < pal2.length; j++) {
                if (pal4[i] == pal2[j] && !pall2) {
                    JOptionPane.showMessageDialog(null, PALABRA4 + " COMBINA CON " + PALABRA2 + " EN LA " + pal4[i]);
                    System.out.println(PALABRA4 + " COMBINA CON " + PALABRA2 + " EN LA " + pal4[i]);

                    pal4[i] = ' ';
                    pal2[j] = ' ';
                    pall2 = true;
                    break;

                }

            }
            for (int j = 0; j < pal3.length; j++) {
                if (pal4[i] == pal3[j] && !pall3) {
                    JOptionPane.showMessageDialog(null, PALABRA4 + " COMBINA CON " + PALABRA3 + " EN LA " + pal4[i]);
                    System.out.println(PALABRA4 + " COMBINA CON " + PALABRA3 + " EN LA " + pal4[i]);

                    pal4[i] = ' ';
                    pal3[j] = ' ';
                    pall3 = true;
                    break;

                }
            }
            for (int j = 0; j < pal4.length; j++) {
                if (pal4[i] == pal1[j] && !pall1) {
                    JOptionPane.showMessageDialog(null, PALABRA4 + " COMBINA CON " + PALABRA1 + " EN LA " + pal4[i]);
                    System.out.println(PALABRA4 + " COMBINA CON " + PALABRA1 + " EN LA " + pal4[i]);

                    pal4[i] = ' ';
                    pal1[j] = ' ';
                    pall1 = true;
                    break;

                }
            }
            for (int j = 0; j < pal5.length; j++) {
                if (pal4[i] == pal5[j] && !pall5) {
                    JOptionPane.showMessageDialog(null, PALABRA4 + " COMBINA CON " + PALABRA5 + " EN LA " + pal4[i]);
                    System.out.println(PALABRA4 + " COMBINA CON " + PALABRA5 + " EN LA " + pal4[i]);

                    pal4[i] = ' ';
                    pal5[j] = ' ';
                    pall5 = true;
                    break;

                }
            }
        }
        for (int i = 0; i < pal5.length; i++) { // COMPARA LETRAS DE PRIMERA PALABRA CON LAS SIGUIENTES PALABRAS

            for (int j = 0; j < pal2.length; j++) {
                if (pal5[i] == pal2[j] && !pall2) {
                    JOptionPane.showMessageDialog(null, PALABRA5 + " COMBINA CON " + PALABRA2 + " EN LA " + pal5[i]);
                    System.out.println(PALABRA5 + " COMBINA CON " + PALABRA2 + " EN LA " + pal5[i]);

                    pal5[i] = ' ';
                    pal2[j] = ' ';
                    pall2 = true;
                    break;

                }

            }
            for (int j = 0; j < pal3.length; j++) {
                if (pal5[i] == pal3[j] && !pall3) {
                    JOptionPane.showMessageDialog(null, PALABRA5 + " COMBINA CON " + PALABRA3 + " EN LA " + pal5[i]);
                    System.out.println(PALABRA5 + " COMBINA CON " + PALABRA3 + " EN LA " + pal5[i]);

                    pal5[i] = ' ';
                    pal3[j] = ' ';
                    pall3 = true;
                    break;

                }
            }
            for (int j = 0; j < pal4.length; j++) {
                if (pal5[i] == pal4[j] && !pall4) {
                    JOptionPane.showMessageDialog(null, PALABRA5 + " COMBINA CON " + PALABRA4 + " EN LA " + pal5[i]);
                    System.out.println(PALABRA5 + " COMBINA CON " + PALABRA4 + " EN LA " + pal5[i]);

                    pal5[i] = ' ';
                    pal4[j] = ' ';
                    pall4 = true;
                    break;

                }
            }
            for (int j = 0; j < pal5.length; j++) {
                if (pal5[i] == pal1[j] && !pall1) {
                    JOptionPane.showMessageDialog(null, PALABRA5 + " COMBINA CON " + PALABRA1 + " EN LA " + pal5[i]);
                    System.out.println(PALABRA5 + " COMBINA CON " + PALABRA1 + " EN LA " + pal5[i]);

                    pal5[i] = ' ';
                    pal1[j] = ' ';
                    pall1 = true;
                    break;

                }
            }
        }

        
        } catch (Exception e) {
            
            System.out.println("hay un error");
        }
    }

}
