(ns net.minecraft.entity.item.EntityBoat$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityBoat$Status]))

(def IN_WATER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Status"
  EntityBoat$Status/IN_WATER)

(def UNDER_WATER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Status"
  EntityBoat$Status/UNDER_WATER)

(def UNDER_FLOWING_WATER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Status"
  EntityBoat$Status/UNDER_FLOWING_WATER)

(def ON_LAND
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Status"
  EntityBoat$Status/ON_LAND)

(def IN_AIR
  "Enum Constant.

  type: net.minecraft.entity.item.EntityBoat$Status"
  EntityBoat$Status/IN_AIR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityBoat.Status c : EntityBoat.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.item.EntityBoat$Status[]`"
  ([]
    (EntityBoat$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.item.EntityBoat$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.item.EntityBoat$Status [^java.lang.String name]
    (EntityBoat$Status/valueOf name)))

