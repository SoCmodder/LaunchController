package world.mitchmiller.launchcontroller.database;

import android.app.Application;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import world.mitchmiller.launchcontroller.database.dao.AltDataDao;
import world.mitchmiller.launchcontroller.database.entities.AltData;

/**
 * Created by Mitch Miller on 12/26/2017.
 */

@Database(entities = {AltData.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public static AppDatabase getInstance(Application application) {
        if (instance == null) {
            instance = newInstance(application);
        }

        return instance;
    }

    private static AppDatabase newInstance(Application application) {
        return Room.databaseBuilder(application, AppDatabase.class, "launch-controller").build();
    }

    public abstract AltDataDao sampleDao();

    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
