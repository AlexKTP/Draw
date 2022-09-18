package com.alex.draw.persistence.Repository;

import android.app.Application;
import android.graphics.Bitmap;

import androidx.lifecycle.LiveData;

import com.alex.draw.persistence.db.DrawDataBase;
import com.alex.draw.persistence.db.dao.DrawingDao;
import com.alex.draw.persistence.db.entity.Drawing;

import java.util.List;

public class DrawingRepository {

    private DrawingDao drawingDao;
    private LiveData<List<Drawing>> allDrawings;

    public DrawingRepository(Application application){
        DrawDataBase db = DrawDataBase.getDatabase(application);
        drawingDao = db.drawingDao();
        allDrawings = drawingDao.getAllDrawings();
    }

    private LiveData<List<Drawing>> getAllDrawings(){
        return allDrawings;
    }

    private void insert(String name, Bitmap bitmap){
        DrawDataBase.databaseWriteExecutor.execute(()-> {
            drawingDao.insert(name, bitmap);
        });
    }

    private void deleteAll(){
        DrawDataBase.databaseWriteExecutor.execute(()->{
            drawingDao.deleteAllDrawings();
        });
    }

    private void deleteDrawing(Drawing drawing){
        DrawDataBase.databaseWriteExecutor.execute(()->{
            drawingDao.deleteDrawing(drawing);
        });
    }


    private LiveData<Drawing> getDrawingById(Long id){
        return drawingDao.getDrawingById(id);
    }

    private void updateDrawing(Drawing drawing){
        DrawDataBase.databaseWriteExecutor.execute(()->{
            drawingDao.updateDrawing(drawing);
        });
    }

}
