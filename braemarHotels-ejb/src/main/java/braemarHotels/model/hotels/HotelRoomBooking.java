package braemarHotels.model.hotels;

import braemarHotels.model.customers.Customer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table("HotelRoomBookings")
public class HotelRoomBooking implements Serializable {

    @Id
    @GeneratedValue
    public long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HotelRoomId")
    public HotelRoom hotelRoom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerID")
    public Customer customer;

    public String checkInDate;
    public String checkOutDate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }


}
