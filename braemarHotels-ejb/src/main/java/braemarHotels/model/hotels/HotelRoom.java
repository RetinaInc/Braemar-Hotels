package braemarHotels.model.hotels;

import com.apple.jobjc.ID;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table("HotelRooms")

public class HotelRoom {

    @ID
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HotelID")
    @NotNull
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RoomTypeID")
    @NotNull
    private RoomType roomType;

    @NotNull
    private int roomNumber;


}
