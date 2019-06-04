package mec_kon.ledstripapp.second_fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mec_kon.ledstripapp.R
import mec_kon.ledstripapp.network.Network
import mec_kon.ledstripapp.storage.Storage


class SecondFragment : Fragment() {
    var isOn = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.second_fragment, container, false)

        val network = Network()
        val storage = Storage(activity)
        val settings = storage.settings


        // Inflate the layout for this fragment
        return view
    }

}