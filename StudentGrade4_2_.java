public class StudentGrade4_2_{ 
    public static void main(String []args){
        int grade = 85;
        switch(grade / 10){
            case 9:
                System.out.println("sample");
                break;
            case 10:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 5:
            case 6:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            
            default:
                System.out.println("F");
                break;

        }

       
    }
}