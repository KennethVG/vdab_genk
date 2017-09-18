package exercise06;

public class Temperature {
   private static final float FREEZING_TEMPERATURE = 0F;
   private static final float BOILING_TEMPERATURE = 100F;
   
   private float value;

   public Temperature(float value) {
      this.value = value;
   }
   
   public float getValue() {
      return value;
   }
   
   public void setValue(float value) {
      this.value = value;
   }
      
   public boolean isFreezing() {
      return value <= FREEZING_TEMPERATURE;
   }
   
   public boolean isBoiling() {
      return value >= BOILING_TEMPERATURE;
   }
   
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + Float.floatToIntBits(value);
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Temperature other = (Temperature) obj;
      if (Float.floatToIntBits(value) != Float.floatToIntBits(
         other.value))
         return false;
      return true;
   }
   
   
}
