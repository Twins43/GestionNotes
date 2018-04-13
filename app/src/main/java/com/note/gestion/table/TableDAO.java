package com.note.gestion.table;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Arnaud Moncel on 14/04/2018.
 */

@Dao
public interface TableDAO {
    @Query( "Select * from `Table`" )
    List<Table> getAll();

    @Insert( onConflict = OnConflictStrategy.REPLACE )
    void insertAll( List<Table> tables );

    @Insert
    void insert( Table table );
}
