package com.example.customimageselectiondialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customimageselectiondialog.databinding.ActivityMainBinding
import com.example.customimageselectiondialog.databinding.CustomDialogBinding

class MainActivity : AppCompatActivity() {
    private lateinit var myBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)

        myBinding.openDialog.setOnClickListener {
            customImageDialogSelection()
        }
    }
    private fun customImageDialogSelection(){
        val dialog = Dialog(this)
        val binding:CustomDialogBinding = CustomDialogBinding.inflate(layoutInflater)
        dialog.setContentView(binding.root)

        binding.tvCamera.setOnClickListener{
            Toast.makeText(this,"Camera Clicked", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        binding.tvGallery.setOnClickListener{
            Toast.makeText(this,"Gallery Clicked", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        dialog.show()
    }
}