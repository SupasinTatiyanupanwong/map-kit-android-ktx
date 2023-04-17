package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.BitmapDescriptor

object BitmapDescriptorFactory : BitmapDescriptor.Factory by MapKit.getBitmapDescriptorFactory()
