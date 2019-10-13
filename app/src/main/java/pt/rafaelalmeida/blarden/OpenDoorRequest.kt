package pt.rafaelalmeida.blarden

import java.net.URL
import java.net.HttpURLConnection


class OpenDoorRequest {
    private val baseUrl = "https://blarden.herokuapp.com"

    fun requestDoorOpen(): Boolean {
        val url = URL("$baseUrl/open-door")

        val conn = url.openConnection() as HttpURLConnection
        conn.connect()

        return true
    }
}