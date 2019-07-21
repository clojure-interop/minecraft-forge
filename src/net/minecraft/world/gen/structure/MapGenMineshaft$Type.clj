(ns net.minecraft.world.gen.structure.MapGenMineshaft$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure MapGenMineshaft$Type]))

(def NORMAL
  "Enum Constant.

  type: net.minecraft.world.gen.structure.MapGenMineshaft$Type"
  MapGenMineshaft$Type/NORMAL)

(def MESA
  "Enum Constant.

  type: net.minecraft.world.gen.structure.MapGenMineshaft$Type"
  MapGenMineshaft$Type/MESA)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MapGenMineshaft.Type c : MapGenMineshaft.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.gen.structure.MapGenMineshaft$Type[]`"
  ([]
    (MapGenMineshaft$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.gen.structure.MapGenMineshaft$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.gen.structure.MapGenMineshaft$Type [^java.lang.String name]
    (MapGenMineshaft$Type/valueOf name)))

(defn *by-id
  "id - `int`

  returns: `net.minecraft.world.gen.structure.MapGenMineshaft$Type`"
  (^net.minecraft.world.gen.structure.MapGenMineshaft$Type [^Integer id]
    (MapGenMineshaft$Type/byId id)))

