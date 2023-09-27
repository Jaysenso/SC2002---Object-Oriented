public class Undergraduate extends Student{
    
    private CourseComponent assignment;
    private CourseComponent finalExam;

    public Undergraduate(String name, CourseComponent assignment, CourseComponent finalExam){
        super(name);
        this.assignment = assignment;
        this.finalExam = finalExam;
    }
    
    public double calOverall(){
        double overall = assignment.getPercentage() * assignment.getScore();
        overall += finalExam.getPercentage() * finalExam.getScore();
        return overall;
    } 
    
}
