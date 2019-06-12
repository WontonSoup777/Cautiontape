package com.miniappcanada.winstonzhao.cautiontape

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.event_dialog.*
import kotlinx.android.synthetic.main.event_dialog.view.*
import kotlinx.android.synthetic.main.fragment_schedule.*


class ScheduleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_schedule, container, false)

    companion object {
        fun newInstance(): ScheduleFragment = ScheduleFragment()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        floatingEventButton.setOnClickListener {
            val dialog = AlertDialog.Builder(context)
            val dialogView = layoutInflater.inflate(R.layout.event_dialog, null)
            val event_name = dialogView.findViewById<EditText>(R.id.eventName)
            val date_box = dialogView.findViewById<EditText>(R.id.dateBox)
            val time_box = dialogView.findViewById<EditText>(R.id.timeBox)
            val table_name = dialogView.findViewById<EditText>(R.id.tableName)
            val location_name = dialogView.findViewById<EditText>(R.id.locationName)

            dialog.setView(dialogView)
            dialog.setTitle("New Event")
            dialog.setNegativeButton("Cancel"){dialog, which -> dialog.cancel()}
            dialog.setCancelable(false)
            dialog.setPositiveButton("Done"){dialogInterface: DialogInterface, i: Int->  }

            val customDialog = dialog.create() //Must be here!
            customDialog.show()
            customDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                if (event_name.text.isNotEmpty())
                    Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show()
                if (event_name.text.isNotEmpty())
                    customDialog.dismiss()
                if (event_name.text.isEmpty())
                    customDialog.dismiss()

            }
        }





    }
}
