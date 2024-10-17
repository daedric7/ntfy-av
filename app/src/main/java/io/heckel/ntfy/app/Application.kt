package pt.aguiarvieira.ntfy.app

import android.app.Application
import pt.aguiarvieira.ntfy.db.Repository
import pt.aguiarvieira.ntfy.util.Log

class Application : Application() {
    val repository by lazy {
        val repository = Repository.getInstance(applicationContext)
        if (repository.getRecordLogs()) {
            Log.setRecord(true)
        }
        repository
    }
}
