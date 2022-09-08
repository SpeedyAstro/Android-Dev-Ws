package com.example.recyclerdemo1.data

import com.example.recyclerdemo1.R
import com.example.recyclerdemo1.model.Acids

class Datasource {
    fun loadAcids(): List<Acids> {
        return listOf<Acids>(
            Acids(R.string.science,R.string.Alantine, R.drawable.pngwine),
            Acids(R.string.science1,R.string.Amino, R.drawable.pngwine1),
            Acids(R.string.science2,R.string.Carbonate, R.drawable.pngwine),
            Acids(R.string.science3,R.string.Arg, R.drawable.pngwine2),
            Acids(R.string.science4, R.string.Cys,R.drawable.pngwing3),
            Acids(R.string.science5,R.string.Hydro, R.drawable.pngwine1),
            Acids(R.string.science6,R.string.nitric, R.drawable.pngwing3),
            Acids(R.string.science7,R.string.water, R.drawable.pngwine1),
            Acids(R.string.science8,R.string.Amino, R.drawable.pngwine2),
            Acids(R.string.science6,R.string.Arg, R.drawable.pngwine)
        )
    }
}