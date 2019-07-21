(ns net.minecraft.entity.EntityLiving$SpawnPlacementType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityLiving$SpawnPlacementType]))

(def ON_GROUND
  "Enum Constant.

  type: net.minecraft.entity.EntityLiving$SpawnPlacementType"
  EntityLiving$SpawnPlacementType/ON_GROUND)

(def IN_AIR
  "Enum Constant.

  type: net.minecraft.entity.EntityLiving$SpawnPlacementType"
  EntityLiving$SpawnPlacementType/IN_AIR)

(def IN_WATER
  "Enum Constant.

  type: net.minecraft.entity.EntityLiving$SpawnPlacementType"
  EntityLiving$SpawnPlacementType/IN_WATER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityLiving.SpawnPlacementType c : EntityLiving.SpawnPlacementType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.EntityLiving$SpawnPlacementType[]`"
  ([]
    (EntityLiving$SpawnPlacementType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.EntityLiving$SpawnPlacementType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.EntityLiving$SpawnPlacementType [^java.lang.String name]
    (EntityLiving$SpawnPlacementType/valueOf name)))

