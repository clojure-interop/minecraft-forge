(ns net.minecraft.pathfinding.PathNodeType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.pathfinding PathNodeType]))

(def BLOCKED
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/BLOCKED)

(def OPEN
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/OPEN)

(def WALKABLE
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/WALKABLE)

(def TRAPDOOR
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/TRAPDOOR)

(def FENCE
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/FENCE)

(def LAVA
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/LAVA)

(def WATER
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/WATER)

(def RAIL
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/RAIL)

(def DANGER_FIRE
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DANGER_FIRE)

(def DAMAGE_FIRE
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DAMAGE_FIRE)

(def DANGER_CACTUS
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DANGER_CACTUS)

(def DAMAGE_CACTUS
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DAMAGE_CACTUS)

(def DANGER_OTHER
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DANGER_OTHER)

(def DAMAGE_OTHER
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DAMAGE_OTHER)

(def DOOR_OPEN
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DOOR_OPEN)

(def DOOR_WOOD_CLOSED
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DOOR_WOOD_CLOSED)

(def DOOR_IRON_CLOSED
  "Enum Constant.

  type: net.minecraft.pathfinding.PathNodeType"
  PathNodeType/DOOR_IRON_CLOSED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (PathNodeType c : PathNodeType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.pathfinding.PathNodeType[]`"
  ([]
    (PathNodeType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.pathfinding.PathNodeType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.pathfinding.PathNodeType [^java.lang.String name]
    (PathNodeType/valueOf name)))

(defn get-priority
  "returns: `float`"
  (^Float [^PathNodeType this]
    (-> this (.getPriority))))

