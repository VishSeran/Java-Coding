import java.util.TreeSet;
public class TreeSetExample {
    
//no duplicates
//ordered set
//not allow to store null values in the treeset.
//search is slower than hashset
//implements red-black tree.

    public static void main(String []args){
        
        TreeSet<Integer> studentsGrades = new TreeSet<>();

        studentsGrades.add(50);
        studentsGrades.add(75);
        studentsGrades.add(85);
        studentsGrades.add(75);

        System.out.println("Students Grades: " + studentsGrades);

        System.out.println("Student grade 75 : " + studentsGrades.contains(75));
        
        //you have to put the value of item to remove it.
        System.out.println("Remove 1st item: "+ studentsGrades.remove(75) );
        System.out.println("Students Grades: " + studentsGrades);
    }
    
}
