package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

   private LocalDate birthDate;
   private PetType type;
   private Owner owner;
   //private Set<Visit> visits = new LinkedHashSet<>();

   public LocalDate getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
   }

   public PetType getType() {
      return type;
   }

   public void setType(PetType type) {
      this.type = type;
   }

   public Owner getOwner() {
      return owner;
   }

   public void setOwner(Owner owner) {
      this.owner = owner;
   }
}
