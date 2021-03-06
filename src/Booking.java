
public class Booking {
    
    private Room room;
    private Guest guest;
    private Food food;
    private int days;
    private String startDate;
    private String endDate;

    public Booking(Room room, Guest guest, int days, String startDate, String endDate) {
        this.room = room;
        this.guest = guest;
        this.days = days;
        this.startDate = startDate;
        this.endDate = endDate;
        this.food = food;
    }
    
    public String getFormattedBooking(){
        return room.getRoomNumber()+","+guest.getName()+","+days+","+startDate+","+endDate;
    }
    
    public String getReceipt(){
        String recipt = "--------------------------------\n"; 
        recipt += "\t\tRECEIPT\n";
        recipt += "--------------------------------\n"; 
        recipt += String.format("Room Number %20s%n", room.getRoomNumber());
        recipt += String.format("Number Of Days %20s%n", days);
        recipt += String.format("Start Date %20s%n", startDate);
        recipt += String.format("End Date %20s%n", endDate);
        recipt += String.format("Total Bill for room and food if ordered %20s%n", String.format("%.2f", (days*room.getPrice()*food.getFoodPrice())));
        recipt += "--------------------------------"; 
        return recipt;
    }
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    
    @Override
    public String toString() {
        return "Room Number " + room.getRoomNumber() + " has been booked by "+guest.getName()+
                " from " + startDate + " to " + endDate;
    }
    
}