public class SalePerson implements Comparable<Object> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString(){
        return("<" + this.lastName + "> " + "<" + this.firstName + ">  : <" + this.totalSales + ">");
    }

    public boolean equals(Object o){

        if(o instanceof SalePerson){
            SalePerson salePerson = (SalePerson) o; //downcasting "o" to salePerson, since object class is grandfather of all objects
            return(this.firstName.equals(salePerson.firstName) && this.lastName.equals(salePerson.lastName));
        }
        return false;
    }


    public int compareTo(Object o){

        if(o instanceof SalePerson){
            SalePerson salePerson = (SalePerson) o; //downcasting "o" to salePerson, since object class is grandfather of all objects
            if(this.totalSales < salePerson.totalSales) return -1;
            else if(this.totalSales > salePerson.totalSales) return 1;
        }
        return 0;
    }

    //getters
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public int getTotalSales(){return this.totalSales;}

}
