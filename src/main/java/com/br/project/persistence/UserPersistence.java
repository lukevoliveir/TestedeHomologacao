package com.br.project.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.br.project.dto.CreateUserReqDTO;
import com.br.project.model.UserEntity;

@Repository
public class UserPersistence {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void persistir(CreateUserReqDTO entity) {
        this.entityManager.persist(entity);
  }
	
	
	public UserEntity buscar(Long id) {
        return this.entityManager.find(UserEntity.class, id);
  }

  public void remover(UserEntity deleteUserEntity) {
        this.entityManager.remove(deleteUserEntity);
  }
   
  public void atualizar(UserEntity updateUserEntity){
        this.entityManager.merge(updateUserEntity);
  }
	
}
