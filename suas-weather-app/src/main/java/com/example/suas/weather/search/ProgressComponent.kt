package com.example.suas.weather.search;

import android.view.View
import android.widget.ProgressBar
import com.example.suas.weather.Subscription
import com.example.suas.weather.suas.StateModels
import zendesk.suas.Component
import zendesk.suas.Selector
import zendesk.suas.Store

class ProgressComponent(val progressBar: ProgressBar) : Component<StateModels.Progress, Boolean>, Subscription {

    override fun update(e: Boolean) {
        progressBar.visibility = if(e) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    override fun getSelector(): Selector<StateModels.Progress, Boolean> = Selector { (count) -> count > 0 }

    override fun disconnect(store: Store) {
        store.disconnect(this)
    }

    override fun connect(store: Store) {
        store.connect(this, StateModels.Progress::class.java)
    }

}