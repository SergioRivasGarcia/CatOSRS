package com.catarsi.catosrs.domain.usecase

import com.catarsi.catosrs.domain.model.Category
import com.catarsi.catosrs.domain.model.CategoryBase
import com.catarsi.catosrs.domain.repository.CatalogueRepository
import com.catarsi.catosrs.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(private val repository: CatalogueRepository) : SingleUseCase<CategoryBase>() {

    private var categoryId: Long? = null

    fun setCategoryId(id: Long){
        categoryId = id
    }

    override fun buildUseCaseSingle(): Single<CategoryBase> {
        return repository.getCategory(categoryId)
    }

}