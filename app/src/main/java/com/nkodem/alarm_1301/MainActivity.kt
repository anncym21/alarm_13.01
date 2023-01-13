package com.nkodem.alarm_1301

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public class CreateAlarmFragment extends Fragment {
        @BindView(R.id.fragment_createalarm_timePicker) TimePicker timePicker
        @BindView(R.id.fragment_createalarm_title) EditText title
        @BindView(R.id.fragment_createalarm_scheduleAlarm) Button scheduleAlarm

    }

}