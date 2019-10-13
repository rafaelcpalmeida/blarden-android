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
// 2. Open InputStream to connection
        conn.connect()
        val `in` = conn.getInputStream()
// 3. Download and decode the string response using builder
        val stringBuilder = StringBuilder()
        val reader = BufferedReader(InputStreamReader(`in`))
        var line: String


        return true
    }
}