package university;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner na = new Scanner(System.in);
        int id;
        double Gpa =0.0;
        String Name;
        String agan;
        String Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7;
        
        
        do{
            System.out.print("Enter your NAME : ");
            Name = na.nextLine();
            
            System.out.print("Enter your ID : ");
            id = in.nextInt();
            
    //----for doctors more then 10000 less then 20000 
            if(id < 20000 && id > 10000){
                Doctor doc = new Doctor(id,Name);
                
            }
    //----for CS student more then 20000 less then 30000 
            else if(id < 30000 && id > 20000){
                System.out.print("enter your GPA :");
                Gpa = in.nextDouble();
                StudentCs info = new StudentCs(id,Name,Gpa);
                
                System.out.println("_______________________");
                if(Gpa < 1.0)
                {//--------------> 3 subject
                    System.out.println(Name+" you have 3 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.println("-------------------------");
                    StudentCs stcs = new StudentCs(Subject1,Subject2,Subject3);

                    }else if (Gpa >= 1.0 && Gpa < 1.5){//--------------> 4 subject
                    System.out.println(Name+" you have 4 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.println("-------------------------");
                    StudentCs stcs = new StudentCs(Subject1, Subject2, Subject3, Subject4);

                    }else if (Gpa >= 1.5 && Gpa < 2.0)
                    {//--------------> 5 subject
                    System.out.println(Name+" you have 5 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.println("-------------------------");
                    StudentCs stcs = new StudentCs(Subject1, Subject2, Subject3, Subject4, Subject5);

                    }else if (Gpa >= 2.0 && Gpa < 3.0)
                    {//--------------> 6 subject
                    System.out.println(Name+" you have 6 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.print("entr your sixth subject: ");
                        Subject6 =in.next();
                    System.out.println("-------------------------");
                    StudentCs stcs = new StudentCs(Subject1, Subject2, Subject3, Subject4, Subject5, Subject6);

                    }else if (Gpa >= 3.0 && Gpa <= 4.0){//--------------> 7 subject
                        System.out.println(Name+" you have 7 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.print("entr your sixth subject: ");
                        Subject6 =in.next();
                    System.out.print("entr your Seventh subject: ");
                        Subject7 =in.next();
                    System.out.println("-------------------------");
                    StudentCs stcs = new StudentCs(Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7);
                    }
                                        }
    //----for ENG student more then 30000 less then 40000 
            else if(id < 40000 && id > 30000){
                System.out.print("enter your GPA :");
                Gpa = in.nextDouble();
                StudentEng info = new StudentEng(id,Name,Gpa);
                
                System.out.println("_______________________");
            //--------------> 3 subject
                    if(Gpa < 1.0)
                    {
                    System.out.println(Name+" you have 3 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.println("-------------------------");
                    StudentEng stcs = new StudentEng(Subject1,Subject2,Subject3);

                    }else if (Gpa >= 1.0 && Gpa < 1.5)
                    {//--------------> 4 subject
                    System.out.println(Name+" you have 4 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.println("-------------------------");
                    StudentEng stcs = new StudentEng(Subject1, Subject2, Subject3, Subject4);

                    }else if (Gpa >= 1.5 && Gpa < 2.0)
                    {//--------------> 5 subject
                    System.out.println(Name+" you have 5 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.println("-------------------------");
                    StudentEng stcs = new StudentEng(Subject1, Subject2, Subject3, Subject4, Subject5);

                    }else if (Gpa >= 2.0 && Gpa < 3.0){//--------------> 6 subject
                    System.out.println(Name+" you have 6 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.print("entr your sixth subject: ");
                        Subject6 =in.next();
                    System.out.println("-------------------------");
                    StudentEng stcs = new StudentEng(Subject1, Subject2, Subject3, Subject4, Subject5, Subject6);

                    }else if (Gpa >= 3.0 && Gpa <= 4.0){//--------------> 7 subject
                        System.out.println(Name+" you have 7 subjects to enter.");
                    System.out.println("          ------------------\n");
                    System.out.print("entr your first subject: ");
                        Subject1 =in.next();
                    System.out.print("entr your secound subject: ");
                        Subject2 =in.next();
                    System.out.print("entr your third subject: ");
                        Subject3 =in.next();
                    System.out.print("entr your fourth subject: ");
                        Subject4 =in.next();
                    System.out.print("entr your Fifth subject: ");
                        Subject5 =in.next();
                    System.out.print("entr your sixth subject: ");
                        Subject6 =in.next();
                    System.out.print("entr your Seventh subject: ");
                        Subject7 =in.next();
                    System.out.println("-------------------------");
                    StudentEng stcs = new StudentEng(Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7);
                    }
            }
    //----for TA more then 40000 less then 50000 
            else if(id < 50000 && id > 40000){
                TeachingAssistant TA = new TeachingAssistant(id, Name);
            }
            
            System.out.println("==========================================");
            System.out.print("do you want to login agan? (y:n): ");
                agan = in.next();
            System.out.println("==========================================");
        }while("y".equals(agan));
    }
}