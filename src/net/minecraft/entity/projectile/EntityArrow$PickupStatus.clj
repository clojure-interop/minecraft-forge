(ns net.minecraft.entity.projectile.EntityArrow$PickupStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityArrow$PickupStatus]))

(def DISALLOWED
  "Enum Constant.

  type: net.minecraft.entity.projectile.EntityArrow$PickupStatus"
  EntityArrow$PickupStatus/DISALLOWED)

(def ALLOWED
  "Enum Constant.

  type: net.minecraft.entity.projectile.EntityArrow$PickupStatus"
  EntityArrow$PickupStatus/ALLOWED)

(def CREATIVE_ONLY
  "Enum Constant.

  type: net.minecraft.entity.projectile.EntityArrow$PickupStatus"
  EntityArrow$PickupStatus/CREATIVE_ONLY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityArrow.PickupStatus c : EntityArrow.PickupStatus.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.projectile.EntityArrow$PickupStatus[]`"
  ([]
    (EntityArrow$PickupStatus/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.projectile.EntityArrow$PickupStatus`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.projectile.EntityArrow$PickupStatus [^java.lang.String name]
    (EntityArrow$PickupStatus/valueOf name)))

(defn *get-by-ordinal
  "ordinal - `int`

  returns: `net.minecraft.entity.projectile.EntityArrow$PickupStatus`"
  (^net.minecraft.entity.projectile.EntityArrow$PickupStatus [^Integer ordinal]
    (EntityArrow$PickupStatus/getByOrdinal ordinal)))

