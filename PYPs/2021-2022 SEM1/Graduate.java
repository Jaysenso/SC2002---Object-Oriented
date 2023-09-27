public class Graduate extends Student {
    
    private CourseComponent assignment;
    private CourseComponent researchReport;
    private CourseComponent finalExam;

    public Graduate(String name, CourseComponent assignment,CourseComponent researchReport, CourseComponent finalExam){
        super(name);
        this.assignment = assignment;
        this.researchReport = researchReport;
        this.finalExam = finalExam;
    }

    public double calOverall(){
        double overall = assignment.getPercentage() * assignment.getScore();
        overall +=  researchReport.getPercentage() * researchReport.getScore();
        overall += finalExam.getPercentage() * finalExam.getScore();
        return overall;
    }
}
