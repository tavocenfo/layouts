package com.gquesada.layouts

class BackgroundTask(private var listener: Listener?) {



    fun execute() {
        // Long task
        listener?.onResult(result = "test")
    }

    fun cancel() {
        listener = null
    }
}

interface Listener {
    fun onResult(result:String)
}