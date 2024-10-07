package com.example.bai34

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.bai34.R.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        // Liên kết các thành phần giao diện
        val textViewContainer: LinearLayout = findViewById(id.textViewContainer)
        val addButton: Button = findViewById(id.addButton)
        val removeButton: Button = findViewById(id.removeButton)

        // Xử lý sự kiện nhấn nút "Thêm TextView"
        addButton.setOnClickListener {
            val textView = TextView(this)
            textView.text = "TextView mới được thêm"
            textView.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            textViewContainer.addView(textView) // Thêm TextView vào LinearLayout
        }

        // Xử lý sự kiện nhấn nút "Xóa TextView"
        removeButton.setOnClickListener {
            val childCount = textViewContainer.childCount
            if (childCount > 0) {
                textViewContainer.removeViewAt(childCount - 1) // Xóa TextView cuối cùng
            }
        }
    }
}
