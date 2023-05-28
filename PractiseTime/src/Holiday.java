public class Holiday {
	private String name;
    private int day;
    private String month;
    public Holiday(String name,int day,String month) {
    this.name=name;
    this.day=day;
    this.month=month;}
    public boolean inSameMonth(Holiday a,Holiday b){
        if (a.month==b.month){
        return true;}
        return false;
}
    public double avgDate(Holiday[] total){
        int sum=0;
        int avg;
        for (int i=0;i<total.length;i++){
            sum=sum+total[i].day;
        }
        avg=sum/total.length;
        return avg;
}
    public static void main (String[] args){
    Holiday  IndepDay=new Holiday("Independence Day",4,"July");
    }

}
