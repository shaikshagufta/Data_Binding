package com.example.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object Bindings {

    @JvmStatic//to make it static for the compiler
    @BindingAdapter("personImage")
    fun setPersonImage(view: ImageView, person: Person){//can also be - fun setPersonImage(view: View, person: Person)
        view.setImageResource(person.image)
    }
    //we can even do it this way
    /*fun setPersonImage(view: ImageView, image: Int){//can also be - fun setPersonImage(view: View, person: Person)
        view.setImageResource(image)
    }*/
}