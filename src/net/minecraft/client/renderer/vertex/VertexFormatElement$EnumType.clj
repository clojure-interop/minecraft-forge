(ns net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex VertexFormatElement$EnumType]))

(def FLOAT
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/FLOAT)

(def UBYTE
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/UBYTE)

(def BYTE
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/BYTE)

(def USHORT
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/USHORT)

(def SHORT
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/SHORT)

(def UINT
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/UINT)

(def INT
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType"
  VertexFormatElement$EnumType/INT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (VertexFormatElement.EnumType c : VertexFormatElement.EnumType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[]`"
  ([]
    (VertexFormatElement$EnumType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType [^java.lang.String name]
    (VertexFormatElement$EnumType/valueOf name)))

(defn get-size
  "returns: `int`"
  (^Integer [^VertexFormatElement$EnumType this]
    (-> this (.getSize))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^VertexFormatElement$EnumType this]
    (-> this (.getDisplayName))))

(defn get-gl-constant
  "returns: `int`"
  (^Integer [^VertexFormatElement$EnumType this]
    (-> this (.getGlConstant))))

