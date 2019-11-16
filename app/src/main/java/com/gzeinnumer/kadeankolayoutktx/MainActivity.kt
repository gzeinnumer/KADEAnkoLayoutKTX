package com.gzeinnumer.kadeankolayoutktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
    }

    class MainActivityUI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
            verticalLayout{

                imageView(R.drawable.ic_timer).
                    lparams(width= matchParent) {
                        padding = dip(20)
                        margin = dip(15)
                    }

                val name = editText {
                    hint = "What's your name?"
                }

                button("Say Hello"){
                    onClick {
                        Toast.makeText(context, name.text, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}
