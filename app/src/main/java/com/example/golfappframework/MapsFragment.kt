package com.example.golfappframework

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsFragment : Fragment() {
    private lateinit var mMap: GoogleMap
    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        mMap = googleMap

        // Adds a marker for each hole
        val holeOne = LatLng(51.732751406414025, -1.2817031078894983)
        mMap.addMarker(MarkerOptions().position(holeOne).title("Hole 1"))
        val holeTwo = LatLng(51.73243990227297, -1.2850750203819599)
        mMap.addMarker(MarkerOptions().position(holeTwo).title("Hole 2"))
        val holeThree = LatLng(51.73543233839472, -1.284098274130517)
        mMap.addMarker(MarkerOptions().position(holeThree).title("Hole 3"))
        val holeFour = LatLng(51.73500960893936, -1.2869753852734205)
        mMap.addMarker(MarkerOptions().position(holeFour).title("Hole 4"))
        val holeFive = LatLng(51.73459737683486, -1.292118755338092)
        mMap.addMarker(MarkerOptions().position(holeFive).title("Hole 5"))
        val holeSix = LatLng(51.73548851944145, -1.2849718027679562)
        mMap.addMarker(MarkerOptions().position(holeSix).title("Hole 6"))
        val holeSeven = LatLng(51.73303321451253, -1.2866393040519688)
        mMap.addMarker(MarkerOptions().position(holeSeven).title("Hole 7"))
        val holeEight = LatLng(51.73235508359563, -1.2822442269698622)
        mMap.addMarker(MarkerOptions().position(holeEight).title("Hole 8"))
        val holeNine = LatLng(51.73449052371599, -1.2776809877051238)
        mMap.addMarker(MarkerOptions().position(holeNine).title("Hole 9"))
        val holeTen = LatLng(51.733031669615166, -1.2767402698638892)
        mMap.addMarker(MarkerOptions().position(holeTen).title("Hole 10"))
        val holeEleven = LatLng(51.73028770372269, -1.282945032178274)
        mMap.addMarker(MarkerOptions().position(holeEleven).title("Hole 11"))
        val holeTwelve = LatLng(51.730717341458494, -1.2791074899923407)
        mMap.addMarker(MarkerOptions().position(holeTwelve).title("Hole 12"))
        val holeThirteen = LatLng(51.7295323877865, -1.282645763854588)
        mMap.addMarker(MarkerOptions().position(holeThirteen).title("Hole 13"))
        val holeFourteen = LatLng(51.73138402299105, -1.2855883568273667)
        mMap.addMarker(MarkerOptions().position(holeFourteen).title("Hole 14"))
        val holeFifteen = LatLng(51.734222398432074, -1.2928012063849432)
        mMap.addMarker(MarkerOptions().position(holeFifteen).title("Hole 15"))
        val holeSixteen = LatLng(51.73333205139515, -1.2876045001957481)
        mMap.addMarker(MarkerOptions().position(holeSixteen).title("Hole 16"))
        val holeSeventeen = LatLng(51.73096632113604, -1.2828402205026903)
        mMap.addMarker(MarkerOptions().position(holeSeventeen).title("Hole 17"))
        val holeEighteen = LatLng(51.73416367370411, -1.2770610900741728)
        mMap.addMarker(MarkerOptions().position(holeEighteen).title("Hole 18"))
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}