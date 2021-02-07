package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast_subfall = Toast.makeText(applicationContext, "กรุณากรอกวิชาให้ครบถ้วน", Toast.LENGTH_LONG)
        val toast_grade = Toast.makeText(applicationContext, "กรุณากรอกเกรดให้ครบถ้วน", Toast.LENGTH_LONG)
        val toast_cradits = Toast.makeText(applicationContext, "กรุณากรอกหน่วยกิตให้ครบถ้วน", Toast.LENGTH_LONG)
       
        ok.setOnClickListener() {

            var c1=cre1.text.toString().toDouble()
            var c2=cre2.text.toString().toDouble()
            var c3=cre3.text.toString().toDouble()
            var c4=cre4.text.toString().toDouble()
            var c5=cre5.text.toString().toDouble()
            var g1=grade1.text.toString().toDouble()
            var g2=grade2.text.toString().toDouble()
            var g3=grade3.text.toString().toDouble()
            var g4=grade4.text.toString().toDouble()
            var g5=grade5.text.toString().toDouble()
            var sumcredit = 0.00
            var sumgrade = 0.00
            var sstotal = 0.00

            if (sub1 == null) {
                toast_subfall.show()
            }
            else if (sub2 == null) {
                toast_subfall.show()
            }
            else if (sub3 == null) {
                toast_subfall.show()
            }
            else if (sub4 == null)

                toast_subfall.show()
            else if (sub5 == null) {
                toast_subfall.show()
            }
            else if (cre1==null) {
                toast_cradits.show()
            }
            else if (cre2==null) {
                toast_cradits.show()
            }
            else if (cre3==null) {
                toast_cradits.show()
            }
            else if (cre4==null) {
                toast_cradits.show()
            }
            else if (cre5==null) {
                toast_cradits.show()
            }
            else { sumgrade=(g1*c1)+(g2*c2)+(g3*c3)+(g4*c4)+(g5*c5)
                sumcredit= c1+c2+c3+c4+c5
                sstotal= sumgrade/sumcredit
                total.setText("$sumcredit")
                gpa.setText("$sstotal")

            }



        }
        clear.setOnClickListener(){
            cre1.setText(null)
            cre2.setText(null)
            cre3.setText(null)
            cre4.setText(null)
            cre5.setText(null)
            grade1.setText(null)
            grade2.setText(null)
            grade3.setText(null)
            grade4.setText(null)
            grade5.setText(null)
            sub1.setText(null)
            sub2.setText(null)
            sub3.setText(null)
            sub4.setText(null)
            sub5.setText(null)
            total.setText(null)
            gpa.setText(null)


        }



        }
  }
