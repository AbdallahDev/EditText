package com.example.abdallahsarayrah.edittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (editText.text.toString() != "") Toast.makeText(this, editText.text.toString(), Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "Write some text", Toast.LENGTH_SHORT).show()
        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                textView.text = editText.text.toString()
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textView.text = editText.text.toString()
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                textView.text = editText.text.toString()
            }
        })
    }
}

