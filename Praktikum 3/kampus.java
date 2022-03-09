import java.util.Scanner;
    public class kampus {
        public String nama, nim;
        public char jenisKelamin;
        public double ipk;
    
        public kampus(String nm, String ni, char jk, double ip ){
            nama = nm;
            nim = ni;
            jenisKelamin = jk;
            ipk = ip;
        }
    }
    
    class mahasiswaMain{
        public static void main(String args[]) {
            Scanner mh = new Scanner(System.in);
    
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jml = mh.nextInt();
            kampus[] mhsArray = new kampus[jml];
            System.out.println();
            for(int i=0; i<jml; i++){
                System.out.println("Masukkan data mahasiswa ke- "+(i+1));
                System.out.print("Masukkan nama: ");
                String nm = mh.next();
                System.out.print("Masukkan nim: ");
                String ni = mh.next();
                System.out.print("Masukkan jenis kelamin: ");
                char jk = mh.next().charAt(0);
                System.out.print("Masukkan IPK: ");
                double ip = mh.nextDouble();
                System.out.println();
                
                mhsArray[i] = new kampus(nm, ni, jk, ip);
            }
            
            for(int j=0; j<jml; j++){
                System.out.println("Data Mahasiswa ke-"+(j+1));
                System.out.println("nama : "+mhsArray[j].nama);
                System.out.println("nim : "+mhsArray[j].nim);
                System.out.println("Jenis Kelamin : "+mhsArray[j].jenisKelamin);
                System.out.println("Nilai IPK : "+mhsArray[j].ipk);
            }
        }
    }
