(ns net.minecraft.entity.ai.EntityMoveHelper$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai EntityMoveHelper$Action]))

(def WAIT
  "Enum Constant.

  type: net.minecraft.entity.ai.EntityMoveHelper$Action"
  EntityMoveHelper$Action/WAIT)

(def MOVE_TO
  "Enum Constant.

  type: net.minecraft.entity.ai.EntityMoveHelper$Action"
  EntityMoveHelper$Action/MOVE_TO)

(def STRAFE
  "Enum Constant.

  type: net.minecraft.entity.ai.EntityMoveHelper$Action"
  EntityMoveHelper$Action/STRAFE)

(def JUMPING
  "Enum Constant.

  type: net.minecraft.entity.ai.EntityMoveHelper$Action"
  EntityMoveHelper$Action/JUMPING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityMoveHelper.Action c : EntityMoveHelper.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.ai.EntityMoveHelper$Action[]`"
  ([]
    (EntityMoveHelper$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.ai.EntityMoveHelper$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.ai.EntityMoveHelper$Action [^java.lang.String name]
    (EntityMoveHelper$Action/valueOf name)))

