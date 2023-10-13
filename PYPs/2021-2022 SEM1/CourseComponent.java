public class CourseComponent{
    
    private String componentName;
    private double percentage;
    private double score;

    public CourseComponent(String componentName, double percentage, double score){
        this.componentName = componentName;
        this.percentage = percentage;
        this.score = score;
    }
 
    public double getPercentage(){
        return this.percentage;
    }

    public double getScore(){
        return this.score;
    }


}
