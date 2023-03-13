


package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;


public class FlightBooking {



    String company="nanjinfight";

    TripSource tripSource;
    LocalDate returnDate;
    LocalDate departureDate;
    BookingClass bookingClass;
    TripType tripType;

    int child;
    int adults;
    int  totalPassengers=this.child+this.adults;
    double Departingprice;
    double DeturnTicketPrice;
    double getTotalTicketPrice;
    TripDestination tripDestination;
    TripDestination tripDestination1;
    SourceAirport sourceAirport;
    DestinationAirport destinationAirport;
    DestinationAirport destinationAirport1;
    String sreturn;
    String sdepart;


   String []fullName= new String [3] ;

    String [] gender=new String [3];
    int [] age =new int [3];
    String [] TicketNumber=new String [3];





    enum TripSource {
        NANJING, BEIJING, OULU, Helsinki
    }

    enum BookingClass {
        FIRST, Business, Economy
    }

    enum TripDestination {
        NANJING, BEIJING, OULU, Helsinki
    }

    enum TripType {
        ONE_WAY, RETURN
    }
    enum  SourceAirport{
        Nanjing_Lukou_International_Airport,
        Beijing_Capital_International_Airport,
        Shanghai_Pudong_International_Airport,
        Oulu_Airport,
        Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport
    }
    enum DestinationAirport{
        Nanjing_Lukou_International_Airport,
        Beijing_Capital_International_Airport,
        Shanghai_Pudong_International_Airport,
        Oulu_Airport,
        Helsinki_Airport,
        Paris_Charles_de_Gaulle_Airport
    }
    public void setDestinationAirport(String s, String s1) {

        if(!s.equals(s1)){
            switch (s) {
                case "1":this.destinationAirport=DestinationAirport.Nanjing_Lukou_International_Airport;break;
                case "2":this.destinationAirport=DestinationAirport.Beijing_Capital_International_Airport;break;
                case "3":this.destinationAirport=DestinationAirport.Shanghai_Pudong_International_Airport;break;
                case "4":this.destinationAirport=DestinationAirport.Oulu_Airport;break;
                case "5":this.destinationAirport=DestinationAirport.Helsinki_Airport;break;
                case "6":this.destinationAirport=DestinationAirport.Paris_Charles_de_Gaulle_Airport;break;

            }
            switch (s1) {
                case "1":this.destinationAirport1=DestinationAirport.Nanjing_Lukou_International_Airport;break;
                case "2":this.destinationAirport1=DestinationAirport.Beijing_Capital_International_Airport;break;
                case "3":this.destinationAirport1=DestinationAirport.Shanghai_Pudong_International_Airport;break;
                case "4":this.destinationAirport1=DestinationAirport.Oulu_Airport;break;
                case "5":this.destinationAirport1=DestinationAirport.Helsinki_Airport;break;
                case "6":this.destinationAirport1=DestinationAirport.Paris_Charles_de_Gaulle_Airport;break;

            }
        }
    }






    public static String getRandomString(){
        int k=4;
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<k;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public void setTripDestination(String s, String s1) {

        if (!s.equals(s1)){
            switch (s) {
                case "1":this.tripDestination=TripDestination.NANJING;break;
                case "2":this.tripDestination=TripDestination.BEIJING;break;
                case "3":this.tripDestination=TripDestination.OULU;break;
                case "4":this.tripDestination=TripDestination.Helsinki;break;

            }
            switch (s1) {
                case "1":this.tripDestination1=TripDestination.NANJING;break;
                case "2":this.tripDestination1=TripDestination.BEIJING;break;
                case "3":this.tripDestination1=TripDestination.OULU;break;
                case "4":this.tripDestination1=TripDestination.Helsinki;break;

            }




        }

    }
    public void setDepartingTicketPrice(int child, int adults) {
        this.child=child;
        this .adults=adults;
        double Departingprice=(child*(300 + (0.15*300) + (0.1*300) + 250)) + (adults*(300 + (0.15*300) + (0.1*300) + 250));
        this.Departingprice=Departingprice;
    }



    public double getDepartingTicketPrice(){
        return this.Departingprice;
    }
    public void setReturnTicketPrice() {
        double DeturnTicketPrice=this.Departingprice;
        this.DeturnTicketPrice=DeturnTicketPrice;
    }
    public double DeturnTicketPrice(){
        return this.DeturnTicketPrice;
    }



    public void  setTotalTicketPrice(){

        double getTotalTicketPrice=this.Departingprice+this.DeturnTicketPrice;
        this.getTotalTicketPrice=getTotalTicketPrice;
    }



    public double getTotalTicketPrice(){

        return this.getTotalTicketPrice;
    }




    public void setBookingClass(String s) {
        switch (s) {
            case "1":this.bookingClass=BookingClass.FIRST;break;
            case "2":this.bookingClass=BookingClass.Business;break;
            case "3":this.bookingClass=BookingClass.Economy;break;

        }
    }


    public BookingClass  getBookingClass(){
        return this.bookingClass;
    }
    public void setTripSource(String s) {


        switch (s) {
            case "1":this.tripSource=TripSource.NANJING;break;
            case "2":this.tripSource=TripSource.BEIJING;break;
            case "3":this.tripSource=TripSource.OULU;break;


        }


    }

    public TripSource getTripSource(){
        return this.tripSource;
    }



    public void setTripType(String s) {


        switch (s) {
            case "1":
                this.tripType = TripType.ONE_WAY;break;
            case "2":
                this.tripType = TripType.RETURN;break;


        }
    }

    public TripType getTripType(){
        return  this.tripType;
    }



    public void setDepartureDate (LocalDate departureDate){
        this.departureDate = departureDate;

    }

    public void setReturnDate (LocalDate returnDate){
        this.returnDate = returnDate;
    }




    public void setSourceAirport(String s) {
        switch (s) {
            case "1":
                this.sourceAirport= SourceAirport.Nanjing_Lukou_International_Airport;
                break;
            case "2":
                this.sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
                break;
            case "3":
                this.sourceAirport = SourceAirport.Shanghai_Pudong_International_Airport;
                break;
            case "4":
                this.sourceAirport = SourceAirport.Oulu_Airport;
                break;
            case "5":
                this.sourceAirport = SourceAirport.Helsinki_Airport;
                break;
            case"6":
                this.sourceAirport = SourceAirport.Paris_Charles_de_Gaulle_Airport;
                break;

        }
    }




public void setTicketNumber(int i){

        String s= getRandomString();
        this.TicketNumber[i]="22"+s+"DOM";

}


    public String getTicketNumber (int i) {


        return this.TicketNumber[i];

    }


    public java.time.LocalDate getReturnDate () {
        String sreturn = "2023-03-06";
        this .sreturn=sreturn;
        LocalDate returnDate = LocalDate.parse(sreturn);
        return returnDate;
    }




    public java.time.LocalDate getdepartDate () {
        String sdepart= "2023-03-06";
        this .sdepart=sdepart;
        LocalDate departDate = LocalDate.parse(sdepart);
        return departDate;
    }


    public void setPassengerFullName (int i, String fullName) {
        this.fullName[i]=fullName;

    }
    public String getPassengerFullName(int i){
        return this.fullName[i] ;
    }


    public void setPassengerGender(int i, String gender) {

        this.gender[i]=gender;
    }

   public String getPassengerGender(int k){
        return this.gender[k];
   }




    public void setPassengerAge(int i, int i1) {

        this.age[i]=i1;
    }
    public int getPassengerAge(int j){
        return this.age[j];
    }



    public String getTripDestination () {
        String tripDestination = "oulu";
        return tripDestination;
    }




    public int getChildrenPassengers () {
        int childPassengers = 2;
        return childPassengers;
    }

    public int getAdultPassengers () {
        int adultPassengers = 3;
        return adultPassengers;
    }

    public int getTotalPassengers ( int i, int t){
        int totalPassengers = i + t;
        return totalPassengers;
    }
    public FlightBooking(int size) {

        String ss="Thank you for booking your flights with "+this.company+ "\n" +
                "You reserved a total of "+size+" tickets."+"\n" ;
                System.out.print(ss);

        for(int i=0; i<size; ++i){
            String testString =  "Here are the trip details for Passenger No."+i+"\n" +
                    "Passenger's Ticket Number: : " + this.TicketNumber[i] + "\n" +
                    "Passenger's Full Name"+this.fullName[i]+"\n"+
                    "Passenger's Age: "+this.age[i]+"\n"+
                    "Passenger's Gender: p"+this.gender[i]+"\n"+
                    "From " + this.tripDestination + " to " + this.tripDestination1 + "\n" +
                    "The flight departs on: " + this.sdepart + "\n" +
                    "And the return flight is on: " + this.sreturn + "\n" +

                    "Total ticket price in Euros: " +  this.getTotalTicketPrice;
            System.out.print(testString);}
    }
}