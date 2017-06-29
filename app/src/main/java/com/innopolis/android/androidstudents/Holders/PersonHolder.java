package com.innopolis.android.androidstudents.Holders;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.innopolis.android.androidstudents.Activities.StudentDetailsActivity;
import com.innopolis.android.androidstudents.R;

import java.io.InputStream;

import Models.Student;

/**
 * Created by _red_ on 28.06.17.
 */

public class PersonHolder extends RecyclerView.ViewHolder implements View.OnClickListener,
        View.OnCreateContextMenuListener
{

    public static String EXTRA_STUDENT_PASSPORT_SERIAL = "STUDENT_PASSPORT_SERIAL";
    public static String EXTRA_STUDENT_PASSPORT_NUMBER = "STUDENT_PASSPORT_NUMBER";
//    public static String EXTRA_STUDENT_PASSPORT_NAME = "STUDENT_NAME";
    private TextView mPersonNameTextView;
    private TextView mPersonLastNameTextView;
    private TextView mPersonMiddleTextView;
    private ImageView imageView;
    private Student mPerson;


    public PersonHolder(View itemView) {
        super(itemView);
        mPersonNameTextView = (TextView) itemView.findViewById(R.id.tvFirstName);
        mPersonLastNameTextView = (TextView) itemView.findViewById(R.id.tvLastName);
        mPersonMiddleTextView = (TextView) itemView.findViewById(R.id.tvMiddleName);
        imageView = (ImageView) itemView.findViewById(R.id.ivStudent);
    }
    //Метод, связывающий ранее добытые в конструкторе ссылки с данными модели
    public void bindCrime(Student person) {
        mPerson = person;
        mPersonNameTextView.setText(mPerson.getName());
        mPersonLastNameTextView.setText(mPerson.getLastName());
        mPersonMiddleTextView.setText(mPerson.getMiddleName());

        imageView.setImageResource(mPerson.getPhotoIndex());
        imageView.setOnClickListener(this);
        imageView.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onClick(View view) {
        Context context = view.getContext();
        Intent intent = new Intent(context, StudentDetailsActivity.class);
        intent.putExtra(EXTRA_STUDENT_PASSPORT_SERIAL, mPerson.getPassport().getSerial());
        intent.putExtra(EXTRA_STUDENT_PASSPORT_NUMBER, mPerson.getPassport().getNumber());
        context.startActivity(intent);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view,
                                    ContextMenu.ContextMenuInfo contextMenuInfo) {

        contextMenu.setHeaderTitle("Menu");
        contextMenu.setHeaderIcon(R.drawable.home);
        contextMenu.add("Call").setIcon(R.mipmap.ic_launcher).setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
        contextMenu.add("SMS").setIcon(R.drawable.home).setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
    }
}
