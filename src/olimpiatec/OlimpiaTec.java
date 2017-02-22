package olimpiatec;

/**
 *
 * @author franc
 */
public class OlimpiaTec {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Student leon = new Student("Leon", "D10S","ITIC");
        Student jaime = new Student("Jaime","A00821432","IFI");
        Student esteban = new Student("Esteban","A01410412","Mate 2");
        Student marco = new Student("Marco","A01423456","LIN");
        
        Sport handball = new Sport("Handball");
        Sport volley = new Sport("Volley");
        
        Team i = new Team("Ingenieros");
        Team l = new Team("Licenciados");
        Team p1 = new Team("Prepa - 1er Sem");
        Team p3 = new Team("Prepa - 3er Sem");
        Team p5 = new Team("Prepa - 5to Sem");
      
        
        i.addStudent(esteban);
        i.addStudent(jaime);
        
        handball.addTeam(i);
       
      
        System.out.println(volley);
        System.out.println(handball);
        System.out.println(i);
        System.out.println(l);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p5);
        
    }
    
}
