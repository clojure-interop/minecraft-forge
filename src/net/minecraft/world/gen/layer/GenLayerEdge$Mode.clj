(ns net.minecraft.world.gen.layer.GenLayerEdge$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.layer GenLayerEdge$Mode]))

(def COOL_WARM
  "Enum Constant.

  type: net.minecraft.world.gen.layer.GenLayerEdge$Mode"
  GenLayerEdge$Mode/COOL_WARM)

(def HEAT_ICE
  "Enum Constant.

  type: net.minecraft.world.gen.layer.GenLayerEdge$Mode"
  GenLayerEdge$Mode/HEAT_ICE)

(def SPECIAL
  "Enum Constant.

  type: net.minecraft.world.gen.layer.GenLayerEdge$Mode"
  GenLayerEdge$Mode/SPECIAL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GenLayerEdge.Mode c : GenLayerEdge.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.gen.layer.GenLayerEdge$Mode[]`"
  ([]
    (GenLayerEdge$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.gen.layer.GenLayerEdge$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.gen.layer.GenLayerEdge$Mode [^java.lang.String name]
    (GenLayerEdge$Mode/valueOf name)))

