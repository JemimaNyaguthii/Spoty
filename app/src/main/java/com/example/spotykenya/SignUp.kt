package com.example.spotykenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotykenya.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding =ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.button.setOnClickListener {
            validateSignUp()
        }
    }
    fun validateSignUp() {
        val name = binding.etName.text.toString()
        val password =binding.etPassword .text.toString()
        val confirm=binding.etConfirm.text.toString()
        var error = false
        if (name.isBlank()) {
            binding.tilName.error = "Name required"
            error=true
        }
        if (name.isBlank()) {
            binding.tilPassword.error = "Password required"
            error=true
        }
        if (confirm!=password){
            binding.tilConfirm.error="Password confirmation does not match with the password"
            error=true
        }
        if (!error){
            val intent= Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}


