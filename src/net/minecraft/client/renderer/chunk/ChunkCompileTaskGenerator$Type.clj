(ns net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ChunkCompileTaskGenerator$Type]))

(def REBUILD_CHUNK
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type"
  ChunkCompileTaskGenerator$Type/REBUILD_CHUNK)

(def RESORT_TRANSPARENCY
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type"
  ChunkCompileTaskGenerator$Type/RESORT_TRANSPARENCY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ChunkCompileTaskGenerator.Type c : ChunkCompileTaskGenerator.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type[]`"
  ([]
    (ChunkCompileTaskGenerator$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type [^java.lang.String name]
    (ChunkCompileTaskGenerator$Type/valueOf name)))

