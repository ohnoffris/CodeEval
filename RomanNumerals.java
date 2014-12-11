import java.io.*;
public class RomanNumerals {
    public static void main (String[] args) throws IOException {
        File file = new File("test.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line, romNumber;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            romNumber="";
            int number = Integer.valueOf(line);
            while (number>=1000){
                romNumber+="M";
                number-=1000;
            }
            while (number>=900){
                romNumber+="CM";
                number-=900;
            }
            while (number>=500){
                romNumber+="D";
                number-=500;
            }
            while(number>=400){
                romNumber+="CD";
                number-=400;
            }
            while (number>=100){
                romNumber+="C";
                number-=100;
            }
            while(number>=90){
                romNumber+="XC";
                number-=90;
            }
            while (number>=50){
                romNumber+="L";
                number-=50;
            }
            while (number>=40){
                romNumber+="XL";
                number-=40;
            }
            while (number>=10){
                romNumber+="X";
                number-=10;
            }
            while (number>=9){
                romNumber+="IX";
                number-=9;
            }
            while (number>=5){
                romNumber+="V";
                number-=5;
            }
            while (number>=4){
                romNumber+="IV";
                number-=4;
            }
            while (number>=1){
                romNumber+="I";
                number-=1;
            }
            System.out.println(romNumber);
        }
    }
}
