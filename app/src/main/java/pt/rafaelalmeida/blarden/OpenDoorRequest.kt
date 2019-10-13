package pt.rafaelalmeida.blarden

import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection


class OpenDoorRequest {
    private val baseUrl = "https://blarden.herokuapp.com"

    fun requestDoorOpen(): Boolean {
        val url = URL("$baseUrl/open-door")

        val conn = url.openConnection() as HttpURLConnection

        conn.connect()
        val `in` = conn.getInputStream()

        val stringBuilder = StringBuilder()
        val reader = BufferedReader(InputStreamReader(`in`))
        var line: String


        return true
    }
}