package world.mitchmiller.launchcontroller.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import world.mitchmiller.launchcontroller.database.entities.AltData;

/**
 * Created by Mitch Miller on 12/26/2017.
 */

@Dao
public interface AltDataDao {

    @Query("SELECT * from AltData")
    List<AltData> getAll();

    @Query("SELECT * FROM AltData WHERE id IN (:ids)")
    List<AltData> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM AltData WHERE altitude LIKE :altitude AND "
            + "timestamp LIKE :timestamp LIMIT 1")
    AltData findByFirstAndSecond(String altitude, String timestamp);

    @Insert
    void insertAll(AltData... altDataList);

    @Delete
    void delete(AltData altData);
}
