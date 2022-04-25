package com.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel :ViewModel() {

    //observable
    private val _personLiveData :MutableLiveData<Person> = MutableLiveData(
            Person("Person 1 ", 15, R.drawable.ic_emoji)//initial value
    )
    //observes the observable
    val personLiveData : LiveData<Person> = _personLiveData
    //we want to use its constructor
}