(ns net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex VertexFormatElement$EnumUsage]))

(def POSITION
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/POSITION)

(def NORMAL
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/NORMAL)

(def COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/COLOR)

(def UV
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/UV)

(def MATRIX
  "Enum Constant.

  Deprecated.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/MATRIX)

(def BLEND_WEIGHT
  "Enum Constant.

  Deprecated.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/BLEND_WEIGHT)

(def PADDING
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/PADDING)

(def GENERIC
  "Enum Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage"
  VertexFormatElement$EnumUsage/GENERIC)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (VertexFormatElement.EnumUsage c : VertexFormatElement.EnumUsage.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[]`"
  ([]
    (VertexFormatElement$EnumUsage/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage [^java.lang.String name]
    (VertexFormatElement$EnumUsage/valueOf name)))

(defn pre-draw
  "format - `net.minecraft.client.renderer.vertex.VertexFormat`
  element - `int`
  stride - `int`
  buffer - `java.nio.ByteBuffer`"
  ([^VertexFormatElement$EnumUsage this ^net.minecraft.client.renderer.vertex.VertexFormat format ^Integer element ^Integer stride ^java.nio.ByteBuffer buffer]
    (-> this (.preDraw format element stride buffer))))

(defn post-draw
  "format - `net.minecraft.client.renderer.vertex.VertexFormat`
  element - `int`
  stride - `int`
  buffer - `java.nio.ByteBuffer`"
  ([^VertexFormatElement$EnumUsage this ^net.minecraft.client.renderer.vertex.VertexFormat format ^Integer element ^Integer stride ^java.nio.ByteBuffer buffer]
    (-> this (.postDraw format element stride buffer))))

(defn get-display-name
  "returns: `java.lang.String`"
  (^java.lang.String [^VertexFormatElement$EnumUsage this]
    (-> this (.getDisplayName))))

