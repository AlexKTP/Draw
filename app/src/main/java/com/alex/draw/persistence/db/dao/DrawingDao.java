package com.alex.draw.persistence.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.alex.draw.persistence.db.entity.Drawing;

import java.util.List;


@Dao
public interface DrawingDao {

    @Query("SELECT * FROM drawing ORDER BY drawing_id DESC")
    public LiveData<List<Drawing>> getAllDrawings();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(Drawing drawing);

    @Query("SELECT * FROM drawing WHERE DRAWING.drawing_id=:drawingID")
    public LiveData<Drawing> getDrawingById(Long drawingID);

    @Update(entity = Drawing.class)
    public void updateDrawing(Drawing drawing);

    @Delete(entity = Drawing.class)
    public void deleteDrawing(Drawing drawing);

    @Query("DELETE FROM drawing")
    void deleteAllDrawings();

}
