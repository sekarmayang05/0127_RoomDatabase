package com.example.praktikum7.view.uicontroller

import com.example.roomsiswa.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = "Detail Siswa"
    const val itemIdArgs = "idsiswa"
    val routeWithArgs = "${DestinasiEditSiswa.route}/{$itemIdArgs}"

}