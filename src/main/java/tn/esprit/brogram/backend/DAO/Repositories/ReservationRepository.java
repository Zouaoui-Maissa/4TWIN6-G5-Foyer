package tn.esprit.brogram.backend.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.brogram.backend.DAO.Entities.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    //List<Reservation> findReservationByEtudiantsidEtudiant(int id);
    List<Reservation> findReservationByEtudiants_email(String email);

   //List<Reservation> findReservationByEtudiants_emailAndEstValide(String email );
   // List<Reservation> findReservationByChamberBlocFoyerUniversitenomUniversite(String nomUniversite);


}
