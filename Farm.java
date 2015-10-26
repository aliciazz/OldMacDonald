class Farm 
{     
   private Animal[] bAnimals = new Animal[3];
   public Farm() {
     bAnimals[0] = new NamedCow("Cow", " Susan", "Moo");
     bAnimals[1] = new Chick("Chick", "Cheep");
     bAnimals[2] = new Pig("Pig", "Oink");
   }
   public void animalSounds() {
     for (int nI = 0; nI <bAnimals.length; nI++) {
       System.out.println(bAnimals[nI].getType() + " goes " + bAnimals[nI].getSound());
       System.out.println("The cow is called" + ((NamedCow)bAnimals[0]).getName());
     }
   }
}
