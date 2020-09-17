package com.example.micronutrientes.model.dataClass

import androidx.room.Embedded
import com.example.micronutrientes.model.dataClass.totaldaily.*

data class TotalDaily(
    @Embedded val CA: CA,
    @Embedded val CHOCDF: CHOCDF,
    @Embedded val CHOLE: CHOLE,
    @Embedded val ENERC_KCAL: ENERCKCAL,
    @Embedded val FASAT: FASAT,
    @Embedded val FAT: FAT,
    @Embedded val FE: FE,
    @Embedded val FIBTG: FIBTG,
    @Embedded val FOLDFE: FOLDFE,
    @Embedded val K: K,
    @Embedded val MG: MG,
    @Embedded val NA: NA,
    @Embedded val NIA: NIA,
    @Embedded val P: P,
    @Embedded val PROCNT: PROCNT,
    @Embedded val RIBF: RIBF,
    @Embedded val THIA: THIA,
    @Embedded val TOCPHA: TOCPHA,
    @Embedded val VITA_RAE: VITARAE,
    @Embedded val VITB12: VITB12,
    @Embedded val VITB6A: VITB6A,
    @Embedded val VITC: VITC,
    @Embedded val VITD: VITD,
    @Embedded val VITK1: VITK1,
    @Embedded val ZN: ZN
 )