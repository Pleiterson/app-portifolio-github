package br.com.appportifoliogithub.domain

import br.com.appportifoliogithub.core.UseCase
import br.com.appportifoliogithub.data.model.Repo
import br.com.appportifoliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}