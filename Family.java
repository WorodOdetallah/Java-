import java.util.Scanner;

// Summer_2020_A_Q12
//A 1,2,3
public class Family {
    private String name;
    private int num;
    private double totalSum;

    public Family(String name, int num) {
        this.name = name;
        this.num = num;
        this.totalSum = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }

    // write input Function that picks up each family member's age. The operation will calculate the cost
    //Which includes for the family (tour + meals) and will update the appropriate feature.
    public void input(){
        Scanner in= new Scanner(System.in);
        int age;
        double total=100;
        for (int i = 0; i < this.num; i++) {
            age=in.nextInt();
            if (age<=3 && age<12)
                total+=20.5;
            else if (age<=12) {
                total+=30;
                
            }
            else total+=40.5;
        }
        this.totalSum=total;
    }
    //B
    public class main{
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            String name= in.next();
            int num;
            while(!name.equals("STOP")){
                num=in.nextInt();
                Family familyMem= new Family(name,num);
                familyMem.input();
                System.out.println("Family Name:" + name+"totalSum:"
                +familyMem.getTotalSum());
                name=in.next();


            }
        }

    }




}
