package com.innopolis.android.androidstudents.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.innopolis.android.androidstudents.Holders.PersonHolder;
import com.innopolis.android.androidstudents.R;
import java.util.List;
import Models.Student;

/**
 * Created by _red_ on 28.06.17.
 */

//Наш адаптер, мост между фабрикой клонов и выводом их на экран.
//Его методы будет дёргать LinearLayoutManager, назныченный вьюшке
//RecyclerView в методе onCreate нашей активити
public class StudentAdapter extends RecyclerView.Adapter<PersonHolder> {

    private List<Student> mPersons;
    public StudentAdapter(List<Student> persons) {
        mPersons = persons;
    }

    //Создаёт пустую вьюшку,оборачивает её в PersonHolder.
    //Дальше забота по наполнению этой вьюшки ложиться именно на объект PersonHolder'а
    @Override
    public PersonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new PersonHolder(view);
    }

    //Дёргает метод холдера при выводе нового элемента списка на экран,
    //передавая ему актуальный объект модели для разбора и представления
    @Override
    public void onBindViewHolder(PersonHolder holder, int position) {
        Student person = mPersons.get(position);
        holder.bindCrime(person);

    }

    //Возвращает размер хранилища моделей
    @Override
    public int getItemCount() {
        return mPersons.size();
    }


}
