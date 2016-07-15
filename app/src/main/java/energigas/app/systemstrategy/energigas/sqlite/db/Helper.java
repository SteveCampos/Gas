package energigas.app.systemstrategy.energigas.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import energigas.app.systemstrategy.energigas.sqlite.db.caja.DBEstablecimientos;


/**
 * Created by Kelvin Thony on 06/07/2016.
 */
public class Helper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =  1;
    private static final String DATABASE_NAME = "Energigas.sqlite";

    public Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DBEstablecimientos.CREATE_TABLE_ESTABLECIMIENTOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DBEstablecimientos.DELETE_TABLE_ESTABLECIMIENTOS);
        onCreate(db);
    }
}
