package org.classreviewsite.classlist.infrastructure;

import org.classreviewsite.user.data.User;
import org.classreviewsite.classlist.data.UserClassList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserClassListDataRepository extends JpaRepository<UserClassList, Long> {

    Optional<List<UserClassList>> findByUserNumber(@Param("userNumber") User userNumber);

    @Query("select m from UserClassList m join fetch m.userNumber and join fetch m.classNumber where m.userNumber.userNumber = :userNumber")
    List<UserClassList> findByUserNumberWithClassAndUser(@Param("userNumber") int userNumber);


}
