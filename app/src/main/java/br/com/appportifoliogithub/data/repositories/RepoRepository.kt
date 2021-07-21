package br.com.appportifoliogithub.data.repositories

import br.com.appportifoliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}