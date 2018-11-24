package com.arif.zaloraassignment.presenter

import com.arif.zaloraassignment.interactor.TwitterInteractor
import com.arif.zaloraassignment.navigator.Navigator

class PresenterImpl {
    var twitterInteractor: TwitterInteractor?
    var navigator: Navigator?

    constructor(twitterInteractor: TwitterInteractor, navigator: Navigator) {
        this.twitterInteractor = twitterInteractor
        this.navigator = navigator
    }

    fun tweet(text: String) {
    }
}