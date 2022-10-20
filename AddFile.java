package HH.File;
import java.util.Scanner;

public class AddFile {
    static String fileName;
    static String word;
    static String word1;
    static  String word2;
    static String ff;
    static String word3;

    public AddFile(String fileName) {

    }

    public static void main(String[] args) throws Exception {

        sec();

    }



    public static void sec() throws Exception {

        for (int g = 0; g < 10; ) {
            System.out.println("-----------------------------------------------");
            System.out.println("Diqqət! Sıra ilə gedin, yoxsa xəta alacaqsınız!");
            System.out.println("-----------------------------------------------");
            System.out.println("\n 1 Fayl yaz" + "\n 2 Yazılmış fayla əlavə et" + "\n 3 Oxu" );
            System.err.println("\n 0 System Exit");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a == 1) {
                writeFileWord();
            } else if (a == 2) {
                addFileWord();
            } else if (a == 3) {
                readFileWord();
            } else if (a == 0) {
                System.exit(0);
            } else {
                System.out.println("Zəhmət olmasa düzgün daxil edin");
            }
        }
    }



    public static void writeFileWord() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zəhmət Olmasa faylın adını qeyd edin");
        fileName = sc.nextLine();
        ff = fileName;
        System.out.println("Fayla yazacaqını yazın:");
        word = sc.nextLine();
        AddFileUtil.writeIntofile1(ff, word);

    }

    public static void addFileWord() throws Exception {
         Scanner sc;
            sc = new Scanner(System.in);
            System.out.println("Sozunuzu yazin");
            word1 = sc.nextLine();
            AddFileUtil.writeIntofile1(ff, word+=word1);
        }

    public static void readFileWord() throws Exception {

        System.out.println(AddFileUtil.read(ff));
    }

    public Object length() {
        return null;
    }
}





