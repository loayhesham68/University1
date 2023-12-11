package university;

public class TeachingAssistant {
    private int Id;
    private String Name;
    private String Subject;
    private String Departement;
    
    public TeachingAssistant(int id, String name){
        this.Id = id;
        this.Name = name;
        if(Id > 40000 && Id <= 42500){//----------->CS TA from 40000 to 42500 ---->for (DataBase)
            this.Departement = "Computer Science";
            this.Subject = "[OOP]";
            System.out.println("         ______________________________  ");
                System.out.println("Welcome TeachingAssistant "+Name+" from "+Departement+" Departement");
            System.out.println("         ______________________________  ");
                System.out.println("the subjects you would teach this smester is "+Subject);
            }
        else if(Id > 42500 && Id <= 45000){//----------->CS TA from 40000 to 45000 ---->for (DataBase)
            this.Departement = "Computer Science";
            this.Subject = "[DataBase]";
            System.out.println("         ______________________________  ");
                System.out.println("Welcome TeachingAssistant "+Name+" from "+Departement+" Departement");
            System.out.println("         ______________________________  ");
                System.out.println("the subjects you would teach this smester is "+Subject);
            }
        else if(Id > 45000 && Id < 47500){//----------->ENG TA from 45000 to 47500 ---->for (Math)
            this.Departement = "Engineering";
            this.Subject = "[Math]";
                System.out.println("         ______________________________  ");
            System.out.println("Welcome TeachingAssistant "+Name+" from "+Departement+" Departement");
                System.out.println("         ______________________________  ");
            System.out.println("the subjects you would teach this smester is: "+Subject);
            }
        else if(Id > 47500 && Id < 50000){//----------->ENG TA from 47500 to 50000 ---->for (Structurs)
            this.Departement = "Engineering";
            this.Subject = "[Structurs]";
                System.out.println("         ______________________________  ");
            System.out.println("Welcome TeachingAssistant "+Name+" from "+Departement+" Departement");
                System.out.println("         ______________________________  ");
            System.out.println("the subjects you would teach this smester is: "+Subject);
        }
    }
}
