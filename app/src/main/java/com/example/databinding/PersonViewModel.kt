package com.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PersonViewModel :ViewModel() {

    //observable
    private val _personLiveData :MutableLiveData<Person> = MutableLiveData(
            Person("Person 1 ", 15, R.drawable.ic_emoji)//initial value
    )
    //observes the observable
    val personLiveData : LiveData<Person> = _personLiveData
    //we want to use its constructor

    //
    init {
        //we want do suspension work on dispatchers IO
        viewModelScope.launch(Dispatchers.IO) {//since Dispatchers.IO is a background thread we use postValue to post it to the main thread
            //Thread.sleep(3000)//would delay the whole thread
            delay(3000)//will delay only the current coroutine
            _personLiveData.postValue(Person("Person 2 ", 15, R.drawable.ic_emoji))
            delay(2000)
            _personLiveData.postValue(Person("Person 3 ", 60, R.drawable.ic_emoji))
            delay(2000)
            _personLiveData.postValue(Person("Person 4 ", 100, R.drawable.ic_emoji))
        }
    }

}