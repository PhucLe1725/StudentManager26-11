package vn.edu.hust.studentman

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class AddStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val studentNameEditText: EditText = findViewById(R.id.edit_student_name)
        val studentIdEditText: EditText = findViewById(R.id.edit_student_id)
        val saveButton: Button = findViewById(R.id.btn_save_student)

        saveButton.setOnClickListener {
            val name = studentNameEditText.text.toString()
            val studentId = studentIdEditText.text.toString()
            if (name.isNotEmpty() && studentId.isNotEmpty()) {
                val newStudent = StudentModel(name, studentId)
                // You need to add logic to save this new student in the main list
                finish()
            }
        }
    }
}
