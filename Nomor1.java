public class Nomor1{
    public static void main(String[] args){
        double totalJamLembur;
        double honor Lembur = 0;
        Scanner input = new Scanner(System.in);

        //input total jam lembur
        System.out.println("TotalJamLembur: ");
        totalJamLembur = input.nextdouble();

        //Hitung honor lembur
        if (totalJamLembur <= 16) {
            honorLembur = totalJamLembur * 10000;
        } else if (totalJamLembur > 16) {
            honorLembur = totalJamLembur * 15000;
        }
        
        
        

        
    }
}
Pseudocode
Var totalJamLembur: double;
Var honorLembur: double;

Algoritma
INPUT (totalJamLembur)
IF(totalJamLembur <= 16) THEN
   honorLembur = totalJamLembur * 10000
ELSE(TotalJamLembur > 16) THEN
   honorLembur = totalJamLembur * 15000
ENDIF
