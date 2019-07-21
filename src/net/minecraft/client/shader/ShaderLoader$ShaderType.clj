(ns net.minecraft.client.shader.ShaderLoader$ShaderType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.shader ShaderLoader$ShaderType]))

(def VERTEX
  "Enum Constant.

  type: net.minecraft.client.shader.ShaderLoader$ShaderType"
  ShaderLoader$ShaderType/VERTEX)

(def FRAGMENT
  "Enum Constant.

  type: net.minecraft.client.shader.ShaderLoader$ShaderType"
  ShaderLoader$ShaderType/FRAGMENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ShaderLoader.ShaderType c : ShaderLoader.ShaderType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.shader.ShaderLoader$ShaderType[]`"
  ([]
    (ShaderLoader$ShaderType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.shader.ShaderLoader$ShaderType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.shader.ShaderLoader$ShaderType [^java.lang.String name]
    (ShaderLoader$ShaderType/valueOf name)))

(defn get-shader-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ShaderLoader$ShaderType this]
    (-> this (.getShaderName))))

