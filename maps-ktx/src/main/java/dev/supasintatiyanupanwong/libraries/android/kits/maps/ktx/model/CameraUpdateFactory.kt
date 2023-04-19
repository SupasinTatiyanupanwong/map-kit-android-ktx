package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.CameraUpdate

object CameraUpdateFactory : CameraUpdate.Factory by MapKit.getCameraUpdateFactory()
