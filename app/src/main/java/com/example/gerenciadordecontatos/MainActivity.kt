package com.example.gerenciadordecontatos

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvContactName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvContactName = findViewById(R.id.tvContactName)
        val btnContactOptions: ImageButton = findViewById(R.id.btnContactOptions)

        registerForContextMenu(tvContactName)

        btnContactOptions.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Infla o menu_main.xml na Toolbar
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add_contact -> {
                Toast.makeText(this, "Abrindo formulário para adicionar contato...", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_about -> {
                Toast.makeText(this, "App de exemplo - Atividade Prática de Menus", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)

        popup.menuInflater.inflate(R.menu.menu_popup_contact, popup.menu)

        popup.setOnMenuItemClickListener { menuItem ->
            val contactName = tvContactName.text // Pega o nome do contato dinamicamente
            when (menuItem.itemId) {
                R.id.action_call -> {
                    Toast.makeText(this, "Ligando para $contactName...", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_sms -> {
                    Toast.makeText(this, "Enviando SMS para $contactName...", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_email -> {
                    Toast.makeText(this, "Enviando Email para $contactName...", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        popup.show()
    }


    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.menu_context_contact, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val contactName = tvContactName.text

        return when (item.itemId) {
            R.id.action_edit -> {
                Toast.makeText(this, "Editando $contactName...", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_delete -> {
                Toast.makeText(this, "Deletando $contactName...", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_share -> {
                Toast.makeText(this, "Compartilhando $contactName...", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}