import java.util.Scanner;
public class Bola {
public class setengahBola{
	int jari; 
	
	public setengahBola(int r){
		jari = r;
	}
	
	public double volume(){
		return 0.67*3.14*(jari*jari*jari);
	}
	
	public double luasPermukaan(){
		return 3.14*2*(jari*jari);
	}
}

public class kubus {
    public int sisi;

    public kubus (int s){
        sisi = s; 
    }

    public double volume(){
        return sisi*sisi*sisi;
    }
    
    public double luasPermukaan() {
        return 6*(sisi*sisi);
    }
}

public class tabung {
    public int jari, tinggi;
    
    public tabung(int r, int t){
        jari = r; 
        tinggi = t;
    }
    public double volume(){
        return 3.14*(jari*jari)*tinggi;
    }
    public double luasPermukaan(){
        return 2*3.14*jari*(jari+tinggi);
    }
}

public static class BolaMain {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak bangun ruang setengah bola : ");
        int setBol = sc.nextInt();
        int r;
        setengahBola[] brSetBola = new setengahBola[setBol];
        System.out.println("----------------------------");
        for(int i = 0 ; i < brSetBola.length; i++){
            System.out.print("Masukkan jari jari "+(i+1)+ ": ");
            r = sc.nextInt();
            brSetBola[i]= new setengahBola(r);

        }
        for (int i = 0 ; i <brSetBola.length; i++){
            System.out.println();
            System.out.println("Setengah Bola ke-" + (i+1));
            System.out.println("jari jari ke-" +(i+1)+": " + brSetBola[i].jari);
            System.out.println("Volume ke-"+(i+1)+" :" + brSetBola[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + brSetBola[i].luasPermukaan());

        }

        System.out.print("Masukkan banyak bangun ruang kubus : ");
        int kubus = sc.nextInt();
        int r2;
        kubus[] kkubus = new kubus[kubus];
        System.out.println("----------------------------");
        for(int i = 0 ; i < kkubus.length; i++){
            System.out.print("Masukkan sisi "+(i+1)+ ": ");
            r2 = sc.nextInt();
            kkubus[i]= new kubus(r2);  
        }
        for (int i = 0 ; i <kkubus.length; i++){
            System.out.println();
            System.out.println("kubus ke:" + (i+1));
            System.out.println("sisi : " + kkubus[i].sisi);
            System.out.println("Volume ke-"+ (i+1) +" :" + kkubus[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + kkubus[i].luasPermukaan());
        }
        
        System.out.print("Masukkan banyak bangun ruang tabung : ");
        int tbg = sc.nextInt();
        int r3,t;
        tabung[] tabungAr = new tabung[tbg];
        System.out.println("----------------------------");
        for(int i = 0 ; i < tabungAr.length; i++){
            System.out.print("Masukkan jari jari "+(i+1)+ ": ");
            r3 = sc.nextInt();
            System.out.print("Masukkan tinggi "+(i+1)+ ": ");
            t = sc.nextInt();
            tabungAr[i]= new tabung(r3, t);  
        }
        for (int i = 0 ; i <tabungAr.length; i++){
            System.out.println();
            System.out.println("Tabung  ke-" + (i+1));
            System.out.println("jari jari : " + tabungAr[i].jari);
            System.out.println("tinggi    : " + tabungAr[i].tinggi);
            System.out.println("Volume ke-"+(i+1)+" :" + tabungAr[i].volume());
            System.out.println("Luas permukaan ke-" + (i+1) + " : " + tabungAr[i].luasPermukaan());

        }
    }
    
}

}
