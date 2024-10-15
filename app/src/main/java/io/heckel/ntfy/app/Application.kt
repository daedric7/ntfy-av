package net.daedric.ntfy.app

import android.app.Application
import net.daedric.ntfy.db.Repository
import net.daedric.ntfy.util.Log

class Application : Application() {
    val repository by lazy {
        val repository = Repository.getInstance(applicationContext)
        if (repository.getRecordLogs()) {
            Log.setRecord(true)
        }
        repository
    }
}
