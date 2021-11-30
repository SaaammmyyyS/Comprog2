public class Leap {
    private boolean isLeap;
    private int Syear;
    public Leap(int year){
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        Syear = year;
        
    }
    public String eh(){
        String b = Integer.toString(Syear);
        if (isLeap == true){
            return b + " is a leap year";
        }
        else{
            return (b + " is not a leap year");
        }
    }
}
