package university;


public class Doctor {
    private int Id;
    private String Name;
    private String Subject;
    private String Departement;
    
    public Doctor(int id, String name){
        this.Id = id;
        this.Name = name;
        if(Id > 10000 && Id <= 15000){//----------->CS Doctors from 10000 to 15000
            this.Departement = "Computer Science";
            this.Subject = "[OOP ,DataBase]";
            System.out.println("         ______________________________  ");
                System.out.println("Welcome Doctor "+Name+" from "+Departement+" Departement");
            System.out.println("         ______________________________  ");
                System.out.println("the subjects you would teach this smester is "+Subject);
        }else if(Id > 15000 && Id < 20000){//----------->ENG Doctors from 15000 to 20000
            this.Departement = "Engineering";
            this.Subject = "[Math ,Structurs]";
                System.out.println("         ______________________________  ");
            System.out.println("Welcome Doctor "+Name+" from "+Departement+" Departement");
                System.out.println("         ______________________________  ");
            System.out.println("the subjects you would teach this smester is: "+Subject);
        }
    }
} 
