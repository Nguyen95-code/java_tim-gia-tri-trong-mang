import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        String[] Students={"viet","nguyen","dai","nam","linh"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name=scanner.nextLine();
        boolean isExits=false;
        for (int i=0;i<Students.length;i++){
            if (Students[i].equals(input_name)){
                System.out.println("Position of the students in the list "+input_name+" is "+ (i+1));
                isExits=true;
                break;
            }
        }
        if (!isExits){
            System.out.println("no found "+input_name+" in list");
        }
    }
}
