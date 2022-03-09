
import java.util.Scanner;

public class jualTanah {
    public int panjang, lebar;

    public int luasTanah(){
        return panjang*lebar;
    }

    public int tanahTerluas(int luas[]){
        int terluas=0, a=0;
        for(int l=0; l<luas.length; l++){
            if(luas[l]>terluas){
                terluas = luas[l];
                a=l;
            }
        }
        return a;
    }

}

class tanahMain{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("    MENGHITUNG LUAS TANAH    ");
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah tanah: ");
        int jml = sc.nextInt();
        System.out.println();
        

        jualTanah[] tanhArray = new jualTanah[jml];

        for(int i=0; i<jml; i++){
            tanhArray[i] = new jualTanah();
            System.out.println("Tanah "+(i+1));
            System.out.print("Masukkan panjang: ");
            tanhArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            tanhArray[i].lebar = sc.nextInt();
        }

        for(int j=0; j<jml; j++){
            System.out.println("Luas Tanah "+(j+1)+": "+tanhArray[j].luasTanah());
        }
        System.out.println();
        int luas[] = new int[jml];
        for(int k=0; k<jml; k++){
            luas[k] = tanhArray[k].luasTanah();
        }
        int a = tanhArray[0].tanahTerluas(luas);
        System.out.println("=============================");
        System.out.println("Tanah terluas: Tanah "+(a+1));
    }
}
