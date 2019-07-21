(ns net.minecraft.inventory.EntityEquipmentSlot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.inventory EntityEquipmentSlot]))

(def MAINHAND
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/MAINHAND)

(def OFFHAND
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/OFFHAND)

(def FEET
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/FEET)

(def LEGS
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/LEGS)

(def CHEST
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/CHEST)

(def HEAD
  "Enum Constant.

  type: net.minecraft.inventory.EntityEquipmentSlot"
  EntityEquipmentSlot/HEAD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityEquipmentSlot c : EntityEquipmentSlot.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.inventory.EntityEquipmentSlot[]`"
  ([]
    (EntityEquipmentSlot/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.inventory.EntityEquipmentSlot`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.inventory.EntityEquipmentSlot [^java.lang.String name]
    (EntityEquipmentSlot/valueOf name)))

(defn *from-string
  "target-name - `java.lang.String`

  returns: `net.minecraft.inventory.EntityEquipmentSlot`"
  (^net.minecraft.inventory.EntityEquipmentSlot [^java.lang.String target-name]
    (EntityEquipmentSlot/fromString target-name)))

(defn get-slot-type
  "returns: `net.minecraft.inventory.EntityEquipmentSlot$Type`"
  (^net.minecraft.inventory.EntityEquipmentSlot$Type [^EntityEquipmentSlot this]
    (-> this (.getSlotType))))

(defn get-index
  "returns: `int`"
  (^Integer [^EntityEquipmentSlot this]
    (-> this (.getIndex))))

(defn get-slot-index
  "returns: `int`"
  (^Integer [^EntityEquipmentSlot this]
    (-> this (.getSlotIndex))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityEquipmentSlot this]
    (-> this (.getName))))

