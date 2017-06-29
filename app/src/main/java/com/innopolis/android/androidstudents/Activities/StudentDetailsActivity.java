package com.innopolis.android.androidstudents.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.innopolis.android.androidstudents.Adapters.StudentAdapter;
import com.innopolis.android.androidstudents.Adapters.StudentDetailContactsAdapter;
import com.innopolis.android.androidstudents.Holders.PersonHolder;
import com.innopolis.android.androidstudents.R;
import com.innopolis.android.androidstudents.StudentsCloneFactory;
import Manager.ManagerStudents;
import Models.Passport;
import Models.Student;

public class StudentDetailsActivity extends AppCompatActivity {

    private ManagerStudents managerStudents = new ManagerStudents(StudentsCloneFactory.getCloneList());
    private Passport passport = new Passport("1","1");

    private RecyclerView contactsView;
    private RecyclerView journalsView;

    private TextView tvStudentSurName;
    private TextView tvStudentFirstName;
    private TextView tvStudentMiddleName;
    private ImageView ivStudentPhoto;

    private StudentDetailContactsAdapter sdcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_student_details);

//        tvStudentFirstName = (TextView) findViewById(R.id.tvFirstName);
//        tvStudentFirstName.setText(getIntent().getStringExtra(PersonHolder.EXTRA_STUDENT_PASSPORT_SERIAL));
        passport.setSerial(getIntent().getStringExtra(PersonHolder.EXTRA_STUDENT_PASSPORT_SERIAL));
        passport.setNumber(getIntent().getStringExtra(PersonHolder.EXTRA_STUDENT_PASSPORT_NUMBER));
        Student student = managerStudents.getStudent(passport);
        if ("".equals(passport.getSerial()) || "".equals(passport.getNumber())) {
            return;
        }

        tvStudentFirstName = (TextView) findViewById(R.id.tvFirstName);
        tvStudentSurName = (TextView) findViewById(R.id.tvSurName);
        tvStudentMiddleName = (TextView) findViewById(R.id.tvMiddleName);
        ivStudentPhoto = (ImageView) findViewById(R.id.ivStudentPhoto);

        tvStudentFirstName.setText(student.getName());
        tvStudentSurName.setText(student.getLastName());
        tvStudentMiddleName.setText(student.getMiddleName());
        ivStudentPhoto.setImageResource(student.getPhotoIndex());

        contactsView = (RecyclerView) findViewById(R.id.rvContacts);
        sdcAdapter = new StudentDetailContactsAdapter(student.getContacts());
        contactsView.setAdapter(sdcAdapter);
    }
}
