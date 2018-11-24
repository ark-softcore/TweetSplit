package com.arif.zaloraassignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.arif.zaloraassignment.interactor.TwitterInteractor
import com.arif.zaloraassignment.navigator.Navigator
import com.arif.zaloraassignment.presenter.PresenterImpl

class MainActivity : AppCompatActivity() {
    var presenter: PresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PresenterImpl(TwitterInteractor(), Navigator())
        presenter?.tweet("")
    }
}
