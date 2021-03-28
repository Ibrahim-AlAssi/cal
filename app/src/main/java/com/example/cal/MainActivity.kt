package com.example.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.cal.solution
import kotlinx.android.synthetic.main.activity_main.*

var number1: Int = 1
var number2: Int =1
var solution: Int =0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonMultiply.setOnClickListener() {

            if (number1EditText.text.toString().equals("")) {
                Toast.makeText(this, "First number Cant be empty", Toast.LENGTH_SHORT)
                    .show()
            } else {
                number1 = number1EditText.text.toString().toInt()
                number2 = number2EditText.text.toString().toInt()
                solution = multi()
                solutionEditText.setText(solution.toString())

            }
        }

        buttonMinus.setOnClickListener() {

                if (number1EditText.text.toString().equals("")) {
                    Toast.makeText(
                        this,
                        "First number Cant be empty",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    number1 = number1EditText.text.toString().toInt()
                    number2 = number2EditText.text.toString().toInt()
                    solution = min()
                    solutionEditText.setText(solution.toString())

                }

            }
        buttonAdd.setOnClickListener() {

                   if (number1EditText.text.toString().equals("")) {
                       Toast.makeText(
                           this,
                           "First number Cant be empty",
                           Toast.LENGTH_SHORT
                       ).show()
                   } else {
                       number1 = number1EditText.text.toString().toInt()
                       number2 = number2EditText.text.toString().toInt()
                       solution = add()
                       solutionEditText.setText(solution.toString())

                   }

               }
        buttonDiv.setOnClickListener() {

                       if (number1EditText.text.toString().equals("") || number2EditText.text.toString().equals("") ) {
                           Toast.makeText(
                               this,
                               "Number Fields Cant be empty",
                               Toast.LENGTH_SHORT
                           ).show()
                       } else if (number1EditText.text.toString().toInt()==0 || number2EditText.text.toString().toInt()==0){

                           Toast.makeText(
                               this,
                               "Invalid!",
                               Toast.LENGTH_SHORT
                           ).show()

                       }
                       else {
                           number1 = number1EditText.text.toString().toInt()
                           number2 = number2EditText.text.toString().toInt()
                           solution = div()
                           solutionEditText.setText(solution.toString())
                       }
                   }


    }

    private fun multi(): Int {
        solution=number1* number2
        return solution

    }
    private fun add(): Int {
        solution=number1+ number2
        return solution

    }

    private fun min(): Int {
        solution=number1- number2
        return solution

    }

    private fun div(): Int {
        solution=number1/ number2
        return solution

    }


}