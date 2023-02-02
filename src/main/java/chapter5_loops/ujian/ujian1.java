package chapter5_loops.ujian;
import java.util.Scanner;
public class ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====Menu Aplikasi=====");
        System.out.println("1. Konversi bilangan Biner ke Oktal");
        System.out.println("2. Konversi bilangan Biner ke Desimal");
        System.out.println("3. Konversi bilangan Biner ke Hexsa");
        System.out.println("4. Konversi bilangan Oktal ke Biner");
        System.out.println("5. Konversi bilangan Oktal ke Desimal");
        System.out.println("6. Konversi bilangan Oktal ke Hexsa");
        System.out.println("7. Konversi bilangan Desimal ke Biner");
        System.out.println("8. Konversi bilangan Desimal ke Oktal");
        System.out.println("9. Konversi bilangan Desimal ke Hexsa");
        System.out.println("10. Konversi bilangan Hexsa ke Biner");
        System.out.println("11. Konversi bilangan Hexsa ke Desimal");
        System.out.println("12. Konversi bilangan Hexsa ke Oktal");
        System.out.println("Masukan nomer menu : ");
        int menu = input.nextInt();

        switch (menu) {

            // konversi Biner ke Oktal
            case 1 -> {
                System.out.println("Biner ke Oktal");
                System.out.println("Masukan nomer biner : ");
                int biner = input.nextInt();
                int desimal = 0, i = 0, oktal = 0;
                long bin;
                bin = biner;

                while (biner != 0) {
                    desimal = (int) (desimal + (biner % 10) * Math.pow(2, i));
                    ++i;
                    biner = biner / 10;
                }
                i = 1;
                while (desimal != 0) {
                    oktal = oktal + (desimal % 8) * i;
                    desimal = desimal / 8;
                    i = i * 10;
                }
                System.out.println("Nilai dari " + bin + " dalam biner adalah " + oktal + " di oktal");
            }

            // konversi Biner ke Desimal
            case 2 -> {
                System.out.println("Biner to Desimal");
                System.out.println("Masukan nomer biner : ");
                int biner = input.nextInt();
                int digit, desimal = 0, i = 1;
                long bin;
                bin = biner;
                while(biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * i);
                    i = i * 2;
                    biner = biner / 10;
                }
                System.out.println("Nilai dari " + bin + " dalam biner adalah " + desimal + " di desimal");
            }


            // konversi Biner ke Hexsa
            case 3 -> {
                System.out.println("Biner ke Hexsa");
                System.out.println("Masukan nomer biner : ");
                int biner = input.nextInt();
                int binInput = biner;
                int digit, desimal = 0, i = 1;
                while(biner != 0) {
                    digit = biner % 10;
                    desimal = desimal + (digit * i);
                    i = i * 2;
                    biner = biner / 10;
                }
                String hex = "";
                char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                while (desimal > 0) {
                    long rem = desimal % 16;
                    hex = hexChars[(int) rem] + hex;
                    desimal = desimal / 16;
                }
                System.out.println("Nilai dari " + binInput + " dalam biner adalah " + hex + " di hexsa");
            }


            // konversi Oktal ke Biner
            case 4 -> {
                System.out.println("Oktal ke Biner");
                System.out.println("Masukan nomer oktal : ");
                int Oktal = input.nextInt();
                int i,j, desimal = 0;
                int Biner = 0;
                long okt;
                okt = Oktal;
                i = 0;

                while (Oktal != 0) {
                    desimal = (int) (desimal + (Oktal % 10) * Math.pow(8, i));
                    ++i;
                    Oktal = Oktal / 10;
                }
                j = 1;

                while (desimal != 0) {
                    Biner = Biner + (desimal % 2) * j;
                    desimal = desimal / 2;
                    j = j * 10;
                }
                System.out.println("Nilai dari " + okt + " dalam Oktal adalah " + Biner + " di biner");
            }

            // konversi Oktal ke Desimal
            case 5 -> {
                System.out.println("Oktal ke Desimal");
                long oktnum, oktal, desnum = 0;
                int i = 0;
                System.out.println("Masukan nomer oktal : ");
                oktnum = input.nextLong();
                oktal = oktnum;
                while (oktnum != 0)
                {
                    desnum = (long)(desnum + (oktnum % 10) * Math.pow(8, i++));
                    oktnum = oktnum /10;
                }
                System.out.println("Nilai dari " + oktal + " dalam Oktal adalah " + desnum + " di Desimal");
            }

            // konversi Oktal ke Hexsa
            case 6 -> {
                System.out.println("Oktal ke Hexsa");
                System.out.println("Masukan nomer oktal : ");
                String hexnum;
                Scanner scan = new Scanner(System.in);
                int oktnum = input.nextInt();

                int decnum = Integer.parseInt(String.valueOf(oktnum), 8);
                hexnum = Integer.toHexString(decnum);

                System.out.println("Nilai dari " + oktnum + " di Oktal adalah " + hexnum + " di hexsa ");
            }

            //konversi Desimal ke Biner
            case 7 -> {
                System.out.println("Desimal ke Biner");
                Scanner sc = new Scanner(System.in);
                System.out.println("Masukan nomer desimal : ");
                int n = sc.nextInt();
                int biner[]=new int[100];
                long desimal;
                int i = 0;
                desimal = n;

                while (n > 0)
                {
                    biner[i++] = n%2;
                    n = n/2;
                }
                System.out.print("Nilai dari " + desimal + " di desimal adalah ");
                for(int j = i-1;j >= 0;j--)
                {
                    System.out.print(biner[j]);
                }
                System.out.print(" di biner ");
            }

            //konversi Desimal ke Oktal
            case 8 -> {
                System.out.println("Desimal ke Oktal");
                int desimal, rem, i=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Masukan nomer Desimal : ");
                desimal=sc.nextInt();
                System.out.print("Nilai dari " + desimal + " di desimal adalah ");
                int a[] = new int[50];
                while(desimal!= 0)
                {
                    a[i++] = desimal%8;
                    desimal= desimal/8;
                }
                for (int c = i;c>=0;c--)
                {
                    System.out.print(a[c]);
                }
                System.out.print(" di oktal ");
            }

            //konversi Desimal ke Hexsa
            case 9 -> {
                System.out.println("Desimal ke Hexsa");
                System.out.println("Masukan nomer desimal : ");
                int num = input.nextInt();
                long desimal;
                int rem;
                String str2="";
                desimal = num;

                char hexsa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

                while (num>0)
                {
                    rem=num%16;
                    str2=hexsa[rem]+str2;
                    num=num/16;
                }
                System.out.println("Nilai dari " + desimal + " di desimal adalah " + str2 + " di hexsa");
            }

            //konversi Hexsa ke Biner
            case 10 -> {
                System.out.println("Hexsa ke Biner");
                int i=0, len;
                String hexsa;
                Scanner s = new Scanner(System.in);
                System.out.println("Masukan nomer hexsa : ");
                hexsa = s.nextLine();
                len = hexsa.length();

                char[] hexDigit = hexsa.toCharArray();

                System.out.print("Nilai dari " + hexsa + " di hexsa adalah ");
                while (i<len)
                {
                    switch (hexDigit[i])
                    {
                        case '0':System.out.print("0000"); break;
                        case '1':System.out.print("0001"); break;
                        case '2':System.out.print("0010"); break;
                        case '3':System.out.print("0011"); break;
                        case '4':System.out.print("0100"); break;
                        case '5':System.out.print("0101"); break;
                        case '6':System.out.print("0110"); break;
                        case '7':System.out.print("0111"); break;
                        case '8':System.out.print("1000"); break;
                        case '9':System.out.print("1001"); break;
                        case 'A':
                        case 'a':
                            System.out.print("1010"); break;
                        case 'B':
                        case 'b':
                            System.out.print("1011"); break;
                        case 'C':
                        case 'c':
                            System.out.print("1100"); break;
                        case 'D':
                        case 'd':
                            System.out.print("1101"); break;
                        case 'E':
                        case 'e':
                            System.out.print("1110"); break;
                        case 'F':
                        case 'f':
                            System.out.print("1111"); break;
                        default:System.out.println("maaf nomer hexsa yang anda masukan salah!");
                            return;
                    }
                    i++;
                }
                System.out.print(" di biner");
            }

            //konversim Hexsa ke Desimal
            case 11 -> {
                System.out.println("Hexsa ke Desimal");
                int desimal =0, i=0, len,rem;
                String hexsa;
                Scanner s = new Scanner(System.in);

                System.out.println("Masukan nomer hexsa : ");
                hexsa = s.nextLine();
                len =  hexsa.length();

                len--;
                while (len>=0) {
                    rem = hexsa.charAt(len);
                    if (rem > 48 && rem <= 57)
                        rem = rem - 48;
                    else if (rem >= 65 && rem <= 70)
                        rem = rem - 55;
                    else if (rem >= 97 && rem <= 102)
                        rem = rem - 87;
                    else {
                        System.out.println("\nmaafnomer hexsa yang anda masukan salah!");
                    }
                    desimal = (int) (desimal + (rem * Math.pow(16, i)));
                    i++;
                    len--;
                }
                System.out.println("Nilai dari " + hexsa + " di hexsa adalah " + desimal + " di desimal");
            }

            //konversi Hexsa ke Okta
            case 12 -> {
                System.out.println("Hexsa ke Oktal");
                {
                    int desimal=0, rem, i=0, len;
                    String hexsa;
                    int[] oktal = new int[20];

                    Scanner s = new Scanner(System.in);
                    System.out.println("Masukan nomer hexsa : ");
                    hexsa = s.nextLine();
                    len = hexsa.length();
                    len--;

                    while(len>=0)
                    {
                        rem = hexsa.charAt(len);
                        if(rem>=48 && rem<=57)
                            rem = rem-48;
                        else if(rem>=65 && rem<=70)
                            rem = rem-55;
                        else if(rem>=97 && rem<=102)
                            rem = rem-87;
                        else
                        {
                            System.out.println("\nmaafnomer hexsa yang anda masukan salah!");
                            return;
                        }
                        desimal = (int) (desimal + (rem*Math.pow(16, i)));
                        i++;
                        len--;
                    }

                    i=0;
                    while(desimal!=0)
                    {
                        oktal[i] = desimal%8;
                        i++;
                        desimal = desimal/8;
                    }
                    System.out.print("Nilai dari " + hexsa + " di hexsa adalah ");
                    for(i=(i-1); i>=0; i--)
                        System.out.print(oktal[i]);
                    System.out.print(" di Oktal");
                }
            }
            default -> {
                System.out.println("Maaf nomer yang anda masukan salah");
            }
        }
    }
}
