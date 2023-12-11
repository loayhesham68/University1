package university;

public class StudentCs {
    private int Id;
    private double Gpa;
    private String Name;
    private String Subject1, Subject2, Subject3, Subject4, Subject5, Subject6, Subject7;
    private String CollogeYear;
    private String Departement;
    
    public StudentCs(int id,String name,double gpa){
        this.Id = id;
        this.Name = name;
        this.Gpa = gpa;
    }
    
    public StudentCs(String Subject1,String Subject2,String Subject3){
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.CollogeYear = "Second Year";
        this.Departement = "Computer Science";
        System.out.println("for the "+CollogeYear+" "+Departement+" of colloge");
        System.out.println("the subject you enter for this semster is\n   -------------------");
        System.out.println(Subject1+" ,"+Subject2+" ,"+Subject3);
    }
    
    public StudentCs(String Subject1,String Subject2,String Subject3,String Subject4){
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.Subject4 = Subject4;
        this.CollogeYear = "Second Year";
        this.Departement = "Computer Science";
        System.out.println("for the "+CollogeYear+" "+Departement+" of colloge");
        System.out.println("the subject you enter for this semster is\n   -------------------");
        System.out.println(Subject1+" ,"+Subject2+" ,"+Subject3+" ,"+Subject4);
    }
    
    public StudentCs(String Subject1,String Subject2,String Subject3,String Subject4,String Subject5){
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.Subject4 = Subject4;
        this.Subject5 = Subject5;
        this.CollogeYear = "Second Year";
        this.Departement = "Computer Science";
        System.out.println("for the "+CollogeYear+" "+Departement+" of colloge");
        System.out.println("the subject you enter for this semster is\n   -------------------");
        System.out.println(Subject1+" ,"+Subject2+" ,"+Subject3+" ,"+Subject4+" ,"+Subject5);
    }
    
    public StudentCs(String Subject1,String Subject2,String Subject3,String Subject4,String Subject5,String Subject6){
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.Subject4 = Subject4;
        this.Subject5 = Subject5;
        this.Subject6 = Subject6;
        this.CollogeYear = "Second Year";
        this.Departement = "Computer Science";
        System.out.println("for the "+CollogeYear+" "+Departement+" of colloge");
        System.out.println("the subject you enter for this semster is\n   -------------------");
        System.out.println(Subject1+" ,"+Subject2+" ,"+Subject3+" ,"+Subject4+" ,"+Subject5+" ,"+Subject6);
    }
    
    public StudentCs(String Subject1,String Subject2,String Subject3,String Subject4,String Subject5,String Subject6,String Subject7){
        this.Subject1 = Subject1;
        this.Subject2 = Subject2;
        this.Subject3 = Subject3;
        this.Subject4 = Subject4;
        this.Subject5 = Subject5;
        this.Subject6 = Subject6;
        this.Subject7 = Subject7;
        this.CollogeYear = "Second Year";
        this.Departement = "Computer Science";
        System.out.println("for the "+CollogeYear+" "+Departement+" of colloge");
        System.out.println("the subject you enter for this semster is\n   -------------------");
        System.out.println(Subject1+" ,"+Subject2+" ,"+Subject3+" ,"+Subject4+" ,"+Subject5+" ,"+Subject6+" ,"+Subject7);
    }
    
}