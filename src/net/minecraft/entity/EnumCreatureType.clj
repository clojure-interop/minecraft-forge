(ns net.minecraft.entity.EnumCreatureType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EnumCreatureType]))

(def MONSTER
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureType"
  EnumCreatureType/MONSTER)

(def CREATURE
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureType"
  EnumCreatureType/CREATURE)

(def AMBIENT
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureType"
  EnumCreatureType/AMBIENT)

(def WATER_CREATURE
  "Enum Constant.

  type: net.minecraft.entity.EnumCreatureType"
  EnumCreatureType/WATER_CREATURE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumCreatureType c : EnumCreatureType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.EnumCreatureType[]`"
  ([]
    (EnumCreatureType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.EnumCreatureType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.EnumCreatureType [^java.lang.String name]
    (EnumCreatureType/valueOf name)))

(defn get-creature-class
  "returns: `java.lang.Class<? extends net.minecraft.entity.passive.IAnimals>`"
  ([^EnumCreatureType this]
    (-> this (.getCreatureClass))))

(defn get-max-number-of-creature
  "returns: `int`"
  (^Integer [^EnumCreatureType this]
    (-> this (.getMaxNumberOfCreature))))

(defn get-peaceful-creature?
  "returns: `boolean`"
  (^Boolean [^EnumCreatureType this]
    (-> this (.getPeacefulCreature))))

(defn get-animal?
  "returns: `boolean`"
  (^Boolean [^EnumCreatureType this]
    (-> this (.getAnimal))))

