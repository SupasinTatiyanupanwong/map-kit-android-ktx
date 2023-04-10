package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.LatLng

fun LatLng(latitude: Double, longitude: Double): LatLng = MapKit.newLatLng(latitude, longitude)
