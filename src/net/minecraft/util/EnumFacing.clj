(ns net.minecraft.util.EnumFacing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumFacing]))

(def DOWN
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/DOWN)

(def UP
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/UP)

(def NORTH
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/NORTH)

(def SOUTH
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/SOUTH)

(def WEST
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/WEST)

(def EAST
  "Enum Constant.

  type: net.minecraft.util.EnumFacing"
  EnumFacing/EAST)

(def *-values
  "Static Constant.

  type: net.minecraft.util.EnumFacing[]"
  EnumFacing/VALUES)

(def *-horizontals
  "Static Constant.

  type: net.minecraft.util.EnumFacing[]"
  EnumFacing/HORIZONTALS)

(defn *get-direction-from-entity-living
  "p-190914-0 - `net.minecraft.util.math.BlockPos`
  p-190914-1 - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^net.minecraft.util.math.BlockPos p-190914-0 ^net.minecraft.entity.EntityLivingBase p-190914-1]
    (EnumFacing/getDirectionFromEntityLiving p-190914-0 p-190914-1)))

(defn *random
  "rand - `java.util.Random`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^java.util.Random rand]
    (EnumFacing/random rand)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumFacing c : EnumFacing.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.EnumFacing[]`"
  ([]
    (EnumFacing/values )))

(defn *by-name
  "name - `java.lang.String`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^java.lang.String name]
    (EnumFacing/byName name)))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.EnumFacing`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.EnumFacing [^java.lang.String name]
    (EnumFacing/valueOf name)))

(defn *get-facing-from-vector
  "x - `float`
  y - `float`
  z - `float`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Float x ^Float y ^Float z]
    (EnumFacing/getFacingFromVector x y z)))

(defn *get-facing-from-axis
  "axis-direction-in - `net.minecraft.util.EnumFacing$AxisDirection`
  axis-in - `net.minecraft.util.EnumFacing$Axis`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^net.minecraft.util.EnumFacing$AxisDirection axis-direction-in ^net.minecraft.util.EnumFacing$Axis axis-in]
    (EnumFacing/getFacingFromAxis axis-direction-in axis-in)))

(defn *get-horizontal
  "horizontal-index-in - `int`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Integer horizontal-index-in]
    (EnumFacing/getHorizontal horizontal-index-in)))

(defn *get-front
  "index - `int`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Integer index]
    (EnumFacing/getFront index)))

(defn *from-angle
  "angle - `double`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^Double angle]
    (EnumFacing/fromAngle angle)))

(defn get-name-2
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing this]
    (-> this (.getName2))))

(defn get-front-offset-x
  "returns: `int`"
  (^Integer [^EnumFacing this]
    (-> this (.getFrontOffsetX))))

(defn get-axis
  "returns: `net.minecraft.util.EnumFacing$Axis`"
  (^net.minecraft.util.EnumFacing$Axis [^EnumFacing this]
    (-> this (.getAxis))))

(defn get-index
  "returns: `int`"
  (^Integer [^EnumFacing this]
    (-> this (.getIndex))))

(defn get-direction-vec
  "returns: `net.minecraft.util.math.Vec3i`"
  (^net.minecraft.util.math.Vec3i [^EnumFacing this]
    (-> this (.getDirectionVec))))

(defn rotate-yccw
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EnumFacing this]
    (-> this (.rotateYCCW))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing this]
    (-> this (.toString))))

(defn rotate-around
  "axis - `net.minecraft.util.EnumFacing$Axis`

  returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EnumFacing this ^net.minecraft.util.EnumFacing$Axis axis]
    (-> this (.rotateAround axis))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumFacing this]
    (-> this (.getName))))

(defn get-front-offset-z
  "returns: `int`"
  (^Integer [^EnumFacing this]
    (-> this (.getFrontOffsetZ))))

(defn get-front-offset-y
  "returns: `int`"
  (^Integer [^EnumFacing this]
    (-> this (.getFrontOffsetY))))

(defn get-axis-direction
  "returns: `net.minecraft.util.EnumFacing$AxisDirection`"
  (^net.minecraft.util.EnumFacing$AxisDirection [^EnumFacing this]
    (-> this (.getAxisDirection))))

(defn rotate-y
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EnumFacing this]
    (-> this (.rotateY))))

(defn get-horizontal-index
  "returns: `int`"
  (^Integer [^EnumFacing this]
    (-> this (.getHorizontalIndex))))

(defn get-opposite
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EnumFacing this]
    (-> this (.getOpposite))))

(defn get-horizontal-angle
  "returns: `float`"
  (^Float [^EnumFacing this]
    (-> this (.getHorizontalAngle))))

