package com.jeanjnap.bankapp.ui.statements

import android.widget.FrameLayout
import com.jeanjnap.bankapp.R
import com.jeanjnap.bankapp.RobolectricBaseTest
import com.jeanjnap.domain.entity.Statement
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StatementsAdapterTest : RobolectricBaseTest() {

    private lateinit var adapter: StatementsAdapter

    @RelaxedMockK
    private lateinit var statementlist: List<Statement>

    @Before
    fun setup() {
        adapter = StatementsAdapter()
    }

    @Test
    fun onCreateViewHolder_shouldInflateItemReceiptLayout() {
        adapter.submitList(statementlist)
        val holder = adapter.onCreateViewHolder(FrameLayout(context), 0)
        adapter.onBindViewHolder(holder, 0)

        assertEquals(R.id.cl_statement_item, holder.itemView.rootView.id)
    }

}