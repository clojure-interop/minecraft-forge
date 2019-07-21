(ns net.minecraft.client.renderer.EnumFaceDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer EnumFaceDirection]))

(def DOWN
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/DOWN)

(def UP
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/UP)

(def NORTH
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/NORTH)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/SOUTH)

(def WEST
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/WEST)

(def EAST
  "Enum Constant.

  type: net.minecraft.client.renderer.EnumFaceDirection"
  EnumFaceDirection/EAST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumFaceDirection c : EnumFaceDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.EnumFaceDirection[]`"
  ([]
    (EnumFaceDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.EnumFaceDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.EnumFaceDirection [^java.lang.String name]
    (EnumFaceDirection/valueOf name)))

(defn *get-facing
  "facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.client.renderer.EnumFaceDirection`"
  (^net.minecraft.client.renderer.EnumFaceDirection [^net.minecraft.util.EnumFacing facing]
    (EnumFaceDirection/getFacing facing)))

(defn get-vertex-information
  "index - `int`

  returns: `net.minecraft.client.renderer.EnumFaceDirection$VertexInformation`"
  (^net.minecraft.client.renderer.EnumFaceDirection$VertexInformation [^EnumFaceDirection this ^Integer index]
    (-> this (.getVertexInformation index))))

