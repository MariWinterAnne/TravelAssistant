package com.example.travelassistant.features.travelinfo.presentation.ui

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.travelassistant.R
import com.example.travelassistant.features.travelinfo.data.model.ErrorModel
import com.example.travelassistant.features.travelinfo.presentation.ui.commands.CommandsLiveData

fun Boolean.parseError(): ErrorModel =
    if (this) ErrorModel(R.string.network_error, R.drawable.network_error)
    else ErrorModel(R.string.unknown_error, R.drawable.unknown_error)

inline fun <T : Any> LifecycleOwner.observe(liveData: CommandsLiveData<T>, crossinline block: (T) -> Unit) {
    liveData.observe(this, Observer { commands ->
        val iterator = commands.iterator()
        while (iterator.hasNext()) {
            block.invoke(iterator.next())
            iterator.remove()
        }
    })
}