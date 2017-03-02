package vn.com.phongnguyen93.week3fbdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


  EditText mEdtMessage;
  Button mBtnSend;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mEdtMessage = (EditText)findViewById(R.id.edt_message);
    mBtnSend = (Button)findViewById(R.id.btn_send);

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    mBtnSend.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
//        myRef.setValue();


      }
    });
  }
}
