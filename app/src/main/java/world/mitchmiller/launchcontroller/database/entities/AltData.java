package world.mitchmiller.launchcontroller.database.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Mitch Miller on 12/26/2017.
 */

@Entity
public class AltData {
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "altitude")
    private String altitude;

    @ColumnInfo(name = "timestamp")
    private String dateAndTime;

    public int getId() {
        return id;
    }
}
