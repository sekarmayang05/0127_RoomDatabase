package com.example.praktikum7.view.uicontroller

import com.example.roomsiswa.R

object DestinasiEditSiswa : DestinasiNavigasi {

    override val route = "item_edit"

    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idsiswa"

    val routeWithArgs = "$route/{$itemIdArg}"

}