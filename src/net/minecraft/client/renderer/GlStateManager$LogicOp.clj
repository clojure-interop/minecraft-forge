(ns net.minecraft.client.renderer.GlStateManager$LogicOp
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$LogicOp]))

(def AND
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/AND)

(def AND_INVERTED
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/AND_INVERTED)

(def AND_REVERSE
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/AND_REVERSE)

(def CLEAR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/CLEAR)

(def COPY
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/COPY)

(def COPY_INVERTED
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/COPY_INVERTED)

(def EQUIV
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/EQUIV)

(def INVERT
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/INVERT)

(def NAND
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/NAND)

(def NOOP
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/NOOP)

(def NOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/NOR)

(def OR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/OR)

(def OR_INVERTED
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/OR_INVERTED)

(def OR_REVERSE
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/OR_REVERSE)

(def SET
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/SET)

(def XOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$LogicOp"
  GlStateManager$LogicOp/XOR)

(defn opcode
  "Instance Constant.

  type: int"
  (^Integer [^GlStateManager$LogicOp this]
    (-> this .-opcode)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.LogicOp c : GlStateManager.LogicOp.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$LogicOp[]`"
  ([]
    (GlStateManager$LogicOp/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$LogicOp`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$LogicOp [^java.lang.String name]
    (GlStateManager$LogicOp/valueOf name)))

