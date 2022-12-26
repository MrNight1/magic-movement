import java.util.Random;

public class Magic {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        String cmd = "ola moveto 0x0";
        int x = 0;
        int y = 0;
        int seg = 12000;
        Random random = new Random();
        try {
            Runtime.getRuntime().exec(cmd);
            while (true) {
                System.out.println("Hola Mundo " + x + " x " + y + " -> " + seg);
                cmd = "ola moveto " + x + "x" + y; //Comando de apagado en windows
	            Runtime.getRuntime().exec(cmd);
                Thread.sleep(seg);
                seg = random.nextInt(240000);
                x = random.nextInt(1350);
                y = random.nextInt(650);
                if(x > 1340){
                    x = x - 1340;
                }
                if(y > 650){
                    y = y - 650;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
