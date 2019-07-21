(ns net.minecraft.inventory.EntityEquipmentSlot$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory EntityEquipmentSlot$Type]))

(def HAND
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot$Type"
  EntityEquipmentSlot$Type/HAND)

(def ARMOR
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot$Type"
  EntityEquipmentSlot$Type/ARMOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityEquipmentSlot.Type c : EntityEquipmentSlot.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.inventory.EntityEquipmentSlot$Type[]`"
  ([]
    (EntityEquipmentSlot$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.inventory.EntityEquipmentSlot$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.inventory.EntityEquipmentSlot$Type [^java.lang.String name]
    (EntityEquipmentSlot$Type/valueOf name)))

