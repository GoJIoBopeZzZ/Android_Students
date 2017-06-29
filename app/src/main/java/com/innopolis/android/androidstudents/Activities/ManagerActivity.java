package com.innopolis.android.androidstudents.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Toast;

import com.innopolis.android.androidstudents.Adapters.StudentAdapter;
import com.innopolis.android.androidstudents.R;
import com.innopolis.android.androidstudents.StudentsCloneFactory;
import java.util.List;
import Models.Student;

public class ManagerActivity extends AppCompatActivity {

    //ссылка на адаптер, класс который знает всё о модели и дёргает методы холдера
    private StudentAdapter mAdapter;
    //ссылка на вьюшку из представления
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_manager);

        //Находим ссылку на контейнер - виджет
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //LinearLayoutManager занимается размещением объектов на экране и прокруткой
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(llm);
        //Подготавливаем армию клонов
        List<Student> personList = StudentsCloneFactory.getCloneList();
        //Создаём экземпляр адаптера и передаём ему под командование наших клонов. Далее руководит ими он
        mAdapter = new StudentAdapter(personList);
        //Назначаем вьюхе адаптером наш экземпляр PersonAdapter
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
