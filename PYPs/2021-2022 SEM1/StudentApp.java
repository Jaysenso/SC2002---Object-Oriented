public class StudentApp{
    public static void main(String[] args){
        
        CourseComponent assignment1 = new CourseComponent("Assignment",0.4f, 80);
        CourseComponent finalExam1 = new CourseComponent("finalExam", 0.6f, 90);
        Student Johnny = new Undergraduate("Johnny", assignment1, finalExam1);    
        System.out.println(assignment1.getScore());


        CourseComponent assignment2 = new CourseComponent("Assignment",0.25f, 80);
        CourseComponent researchReport2 = new CourseComponent("ResearchReport", 0.35f, 80);
        CourseComponent finalExam2 = new CourseComponent("finalExam", 0.40f, 90);  
        Student Shane = new Graduate("Shane", assignment2, researchReport2, finalExam2);  

        printOverall(Johnny);
        printOverall(Shane); 
    }

    //dynamic binding (upcasting graduate&undergraduate to Student (base class)) 
    public static void printOverall(Student studentName){
        System.out.printf("The student 's score is %.2f \n",studentName.calOverall());
    }
}
