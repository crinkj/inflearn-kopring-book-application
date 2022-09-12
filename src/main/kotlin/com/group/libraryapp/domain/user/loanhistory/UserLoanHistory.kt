package com.group.libraryapp.domain.user.loanhistory

import com.group.libraryapp.domain.user.JavaUser
import com.group.libraryapp.domain.user.User
import javax.persistence.*

@Entity
class UserLoanHistory(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @ManyToOne
    val user: User? = null,
    val bookName: String? = null,
    var isReturn: Boolean = false
) {
    fun doReturn() {
        this.isReturn = true
    }
}