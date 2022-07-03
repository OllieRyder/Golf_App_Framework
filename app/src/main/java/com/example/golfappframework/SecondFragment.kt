package com.example.golfappframework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.golfappframework.databinding.FragmentSecondBinding
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_MapsFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
class MysqlConnect {
    // init connection object
    private var connection: Connection? = null

    // init properties object
    private var properties: Properties? = null

    // create properties
    private fun getProperties(): Properties? {
        if (properties == null) {
            properties = Properties()
            properties!!.setProperty("user", USERNAME)
            properties!!.setProperty("password", PASSWORD)
            properties!!.setProperty("MaxPooledStatements", MAX_POOL)
        }
        return properties
    }

    // connect database
    fun connect(): Connection? {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER)
                connection = DriverManager.getConnection(DATABASE_URL, getProperties())
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: SQLException) {
                e.printStackTrace()
            }
        }
        return connection
    }

    // disconnect database
    fun disconnect() {
        if (connection != null) {
            try {
                connection!!.close()
                connection = null
            } catch (e: SQLException) {
                e.printStackTrace()
            }
        }
    }

    companion object {
        // init database constants
        private const val DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver"
        private const val DATABASE_URL = "jdbc:mysql://localhost:3306/scorecard"
        private const val USERNAME = "root"
        private const val PASSWORD = "password"
        private const val MAX_POOL = "250"
    }
}